package com.google.android.material.snackbar;

import Y0.E;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c7.AbstractC3079a;
import c7.c;
import c7.j;
import com.google.android.material.behavior.SwipeDismissBehavior;
import i7.AbstractC4365a;
import n7.n;
import p7.AbstractC5402c;
import u7.AbstractC5981a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final a f30782j = new a(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f30782j.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f30782j.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public a(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.K(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.L(0);
        }

        public boolean a(View view) {
            return view instanceof b;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends FrameLayout {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final View.OnTouchListener f30783j = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f30784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f30785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f30786c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f30787d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f30788e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f30789f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public PorterDuff.Mode f30790g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Rect f30791h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f30792i;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(AbstractC5981a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.f26226g4);
            if (typedArrayObtainStyledAttributes.hasValue(j.f26282n4)) {
                E.m0(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26282n4, 0));
            }
            this.f30784a = typedArrayObtainStyledAttributes.getInt(j.f26250j4, 0);
            this.f30785b = typedArrayObtainStyledAttributes.getFloat(j.f26258k4, 1.0f);
            setBackgroundTintList(AbstractC5402c.a(context2, typedArrayObtainStyledAttributes, j.f26266l4));
            setBackgroundTintMode(n.f(typedArrayObtainStyledAttributes.getInt(j.f26274m4, -1), PorterDuff.Mode.SRC_IN));
            this.f30786c = typedArrayObtainStyledAttributes.getFloat(j.f26242i4, 1.0f);
            this.f30787d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26234h4, -1);
            this.f30788e = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f26290o4, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f30783j);
            setFocusable(true);
            if (getBackground() == null) {
                E.j0(this, a());
            }
        }

        public final Drawable a() {
            float dimension = getResources().getDimension(c.f25864K);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(AbstractC4365a.i(this, AbstractC3079a.f25832k, AbstractC3079a.f25829h, getBackgroundOverlayColorAlpha()));
            if (this.f30789f == null) {
                return P0.a.l(gradientDrawable);
            }
            Drawable drawableL = P0.a.l(gradientDrawable);
            P0.a.i(drawableL, this.f30789f);
            return drawableL;
        }

        public final void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f30791h = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f30786c;
        }

        public int getAnimationMode() {
            return this.f30784a;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f30785b;
        }

        public int getMaxInlineActionWidth() {
            return this.f30788e;
        }

        public int getMaxWidth() {
            return this.f30787d;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            E.c0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f30787d > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f30787d;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f30784a = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f30789f != null) {
                drawable = P0.a.l(drawable.mutate());
                P0.a.i(drawable, this.f30789f);
                P0.a.j(drawable, this.f30790g);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f30789f = colorStateList;
            if (getBackground() != null) {
                Drawable drawableL = P0.a.l(getBackground().mutate());
                P0.a.i(drawableL, colorStateList);
                P0.a.j(drawableL, this.f30790g);
                if (drawableL != getBackground()) {
                    super.setBackgroundDrawable(drawableL);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f30790g = mode;
            if (getBackground() != null) {
                Drawable drawableL = P0.a.l(getBackground().mutate());
                P0.a.j(drawableL, mode);
                if (drawableL != getBackground()) {
                    super.setBackgroundDrawable(drawableL);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f30792i || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f30783j);
            super.setOnClickListener(onClickListener);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }
    }
}
