package com.google.android.material.timepicker;

import Y0.C2547a;
import Y0.E;
import Z0.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c7.AbstractC3079a;
import c7.e;
import c7.g;
import c7.i;
import c7.j;
import com.google.android.material.timepicker.ClockHandView;
import j.AbstractC4666a;
import java.util.Arrays;
import p7.AbstractC5402c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ClockHandView f30961B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f30962C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RectF f30963D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final SparseArray f30964E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C2547a f30965F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int[] f30966G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final float[] f30967H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f30968I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f30969J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f30970P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f30971Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String[] f30972R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public float f30973S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final ColorStateList f30974T;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.v(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f30961B.g()) - ClockFaceView.this.f30968I);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends C2547a {
        public b() {
        }

        @Override // Y0.C2547a
        public void g(View view, h hVar) {
            super.g(view, hVar);
            int iIntValue = ((Integer) view.getTag(e.f25928n)).intValue();
            if (iIntValue > 0) {
                hVar.F0((View) ClockFaceView.this.f30964E.get(iIntValue - 1));
            }
            hVar.l0(h.g.a(0, 1, iIntValue, 1, false, view.isSelected()));
            hVar.j0(true);
            hVar.b(h.a.f20118i);
        }

        @Override // Y0.C2547a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float x10 = view.getX() + (view.getWidth() / 2.0f);
            float y10 = view.getY() + (view.getHeight() / 2.0f);
            ClockFaceView.this.f30961B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x10, y10, 0));
            ClockFaceView.this.f30961B.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x10, y10, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25841t);
    }

    public static float E(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    public final void C() {
        RectF rectFD = this.f30961B.d();
        for (int i10 = 0; i10 < this.f30964E.size(); i10++) {
            TextView textView = (TextView) this.f30964E.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.f30962C);
                offsetDescendantRectToMyCoords(textView, this.f30962C);
                textView.setSelected(rectFD.contains(this.f30962C.centerX(), this.f30962C.centerY()));
                textView.getPaint().setShader(D(rectFD, this.f30962C, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient D(RectF rectF, Rect rect, TextView textView) {
        this.f30963D.set(rect);
        this.f30963D.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.f30963D)) {
            return new RadialGradient(rectF.centerX() - this.f30963D.left, rectF.centerY() - this.f30963D.top, rectF.width() * 0.5f, this.f30966G, this.f30967H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void F(String[] strArr, int i10) {
        this.f30972R = strArr;
        G(i10);
    }

    public final void G(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f30964E.size();
        for (int i11 = 0; i11 < Math.max(this.f30972R.length, size); i11++) {
            TextView textView = (TextView) this.f30964E.get(i11);
            if (i11 >= this.f30972R.length) {
                removeView(textView);
                this.f30964E.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(g.f25945d, (ViewGroup) this, false);
                    this.f30964E.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f30972R[i11]);
                textView.setTag(e.f25928n, Integer.valueOf(i11));
                E.f0(textView, this.f30965F);
                textView.setTextColor(this.f30974T);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f30972R[i11]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f10, boolean z10) {
        if (Math.abs(this.f30973S - f10) > 0.001f) {
            this.f30973S = f10;
            C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h.I0(accessibilityNodeInfo).k0(h.f.a(1, this.f30972R.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iE = (int) (this.f30971Q / E(this.f30969J / displayMetrics.heightPixels, this.f30970P / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iE, 1073741824);
        setMeasuredDimension(iE, iE);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.b
    public void v(int i10) {
        if (i10 != u()) {
            super.v(i10);
            this.f30961B.j(u());
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f30962C = new Rect();
        this.f30963D = new RectF();
        this.f30964E = new SparseArray();
        this.f30967H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f26118S0, i10, i.f25989n);
        Resources resources = getResources();
        ColorStateList colorStateListA = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, j.f26132U0);
        this.f30974T = colorStateListA;
        LayoutInflater.from(context).inflate(g.f25946e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(e.f25923i);
        this.f30961B = clockHandView;
        this.f30968I = resources.getDimensionPixelSize(c7.c.f25875g);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f30966G = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC4666a.a(context, c7.b.f25849b).getDefaultColor();
        ColorStateList colorStateListA2 = AbstractC5402c.a(context, typedArrayObtainStyledAttributes, j.f26125T0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f30965F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        F(strArr, 0);
        this.f30969J = resources.getDimensionPixelSize(c7.c.f25888t);
        this.f30970P = resources.getDimensionPixelSize(c7.c.f25889u);
        this.f30971Q = resources.getDimensionPixelSize(c7.c.f25877i);
    }
}
