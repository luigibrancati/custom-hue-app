package t3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import t3.k;

/* JADX INFO: renamed from: t3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5834c extends H {

    /* JADX INFO: renamed from: t3.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AnimatorListenerAdapter implements k.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f44620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f44621b = false;

        public a(View view) {
            this.f44620a = view;
        }

        @Override // t3.k.h
        public void d(k kVar) {
            this.f44620a.setTag(AbstractC5839h.f44644d, null);
        }

        @Override // t3.k.h
        public void e(k kVar) {
            this.f44620a.setTag(AbstractC5839h.f44644d, Float.valueOf(this.f44620a.getVisibility() == 0 ? B.b(this.f44620a) : 0.0f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            B.e(this.f44620a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f44620a.hasOverlappingRendering() && this.f44620a.getLayerType() == 0) {
                this.f44621b = true;
                this.f44620a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f44621b) {
                this.f44620a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            B.e(this.f44620a, 1.0f);
            B.a(this.f44620a);
        }

        @Override // t3.k.h
        public void a(k kVar) {
        }

        @Override // t3.k.h
        public void i(k kVar) {
        }

        @Override // t3.k.h
        public void l(k kVar) {
        }

        @Override // t3.k.h
        public void j(k kVar, boolean z10) {
        }
    }

    public C5834c(int i10) {
        C0(i10);
    }

    public static float E0(x xVar, float f10) {
        Float f11;
        return (xVar == null || (f11 = (Float) xVar.f44734a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // t3.H
    public Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        B.c(view);
        Animator animatorD0 = D0(view, E0(xVar, 1.0f), 0.0f);
        if (animatorD0 == null) {
            B.e(view, E0(xVar2, 1.0f));
        }
        return animatorD0;
    }

    public final Animator D0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        B.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) B.f44566b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        G().g(aVar);
        return objectAnimatorOfFloat;
    }

    @Override // t3.k
    public boolean R() {
        return true;
    }

    @Override // t3.H, t3.k
    public void r(x xVar) {
        super.r(xVar);
        Float fValueOf = (Float) xVar.f44735b.getTag(AbstractC5839h.f44644d);
        if (fValueOf == null) {
            fValueOf = xVar.f44735b.getVisibility() == 0 ? Float.valueOf(B.b(xVar.f44735b)) : Float.valueOf(0.0f);
        }
        xVar.f44734a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // t3.H
    public Animator y0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        B.c(view);
        return D0(view, E0(xVar, 0.0f), 1.0f);
    }

    public C5834c() {
    }
}
