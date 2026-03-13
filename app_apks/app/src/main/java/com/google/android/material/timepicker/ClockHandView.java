package com.google.android.material.timepicker;

import Y0.E;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import c7.AbstractC3079a;
import c7.i;
import c7.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f30977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f30983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f30984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f30985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f30986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f30987k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f30988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f30989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f30991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30992p;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC3079a.f25841t);
    }

    public void b(c cVar) {
        this.f30983g.add(cVar);
    }

    public final void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.f30992p * ((float) Math.cos(this.f30991o))) + width;
        float f10 = height;
        float fSin = (this.f30992p * ((float) Math.sin(this.f30991o))) + f10;
        this.f30986j.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f30984h, this.f30986j);
        double dSin = Math.sin(this.f30991o);
        double dCos = Math.cos(this.f30991o);
        this.f30986j.setStrokeWidth(this.f30988l);
        canvas.drawLine(width, f10, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f30986j);
        canvas.drawCircle(width, f10, this.f30985i, this.f30986j);
    }

    public RectF d() {
        return this.f30987k;
    }

    public final int e(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    public float f() {
        return this.f30989m;
    }

    public int g() {
        return this.f30984h;
    }

    public final Pair h(float f10) {
        float f11 = f();
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (f11 < 180.0f && f10 > 180.0f) {
                f11 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f11), Float.valueOf(f10));
    }

    public final boolean i(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float fE = e(f10, f11);
        boolean z13 = false;
        boolean z14 = f() != fE;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f30978b) {
            z13 = true;
        }
        l(fE, z13);
        return true;
    }

    public void j(int i10) {
        this.f30992p = i10;
        invalidate();
    }

    public void k(float f10) {
        l(f10, false);
    }

    public void l(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f30977a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m(f10, false);
            return;
        }
        Pair pairH = h(f10);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairH.first).floatValue(), ((Float) pairH.second).floatValue());
        this.f30977a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f30977a.addUpdateListener(new a());
        this.f30977a.addListener(new b());
        this.f30977a.start();
    }

    public final void m(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f30989m = f11;
        this.f30991o = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f30992p * ((float) Math.cos(this.f30991o)));
        float fSin = height + (this.f30992p * ((float) Math.sin(this.f30991o)));
        RectF rectF = this.f30987k;
        int i10 = this.f30984h;
        rectF.set(width - i10, fSin - i10, width + i10, fSin + i10);
        Iterator it = this.f30983g.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(f11, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k(f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f30979c = x10;
            this.f30980d = y10;
            this.f30981e = true;
            this.f30990n = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f30979c);
            int i11 = (int) (y10 - this.f30980d);
            this.f30981e = (i10 * i10) + (i11 * i11) > this.f30982f;
            z11 = this.f30990n;
            z12 = actionMasked == 1;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f30990n = i(x10, y10, z11, z10, z12) | this.f30990n;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f30983g = new ArrayList();
        Paint paint = new Paint();
        this.f30986j = paint;
        this.f30987k = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f26139V0, i10, i.f25989n);
        this.f30992p = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26153X0, 0);
        this.f30984h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26160Y0, 0);
        this.f30988l = getResources().getDimensionPixelSize(c7.c.f25876h);
        this.f30985i = r6.getDimensionPixelSize(c7.c.f25874f);
        int color = typedArrayObtainStyledAttributes.getColor(j.f26146W0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f30982f = ViewConfiguration.get(context).getScaledTouchSlop();
        E.n0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
