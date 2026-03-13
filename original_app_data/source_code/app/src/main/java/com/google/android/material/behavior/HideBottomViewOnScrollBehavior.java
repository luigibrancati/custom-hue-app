package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d7.C3834a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPropertyAnimator f30396d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f30396d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f30393a = 0;
        this.f30394b = 2;
        this.f30395c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public final void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f30396d = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public boolean G() {
        return this.f30394b == 1;
    }

    public boolean H() {
        return this.f30394b == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z10) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f30396d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f30394b = 1;
        int i10 = this.f30393a + this.f30395c;
        if (z10) {
            F(view, i10, 175L, C3834a.f33148c);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f30396d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f30394b = 2;
        if (z10) {
            F(view, 0, 225L, C3834a.f33149d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f30393a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30393a = 0;
        this.f30394b = 2;
        this.f30395c = 0;
    }
}
