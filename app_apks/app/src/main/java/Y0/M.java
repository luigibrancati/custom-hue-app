package Y0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f19605a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f19606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f19607b;

        public a(N n10, View view) {
            this.f19606a = n10;
            this.f19607b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f19606a.a(this.f19607b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19606a.b(this.f19607b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f19606a.c(this.f19607b);
        }
    }

    public M(View view) {
        this.f19605a = new WeakReference(view);
    }

    public M b(float f10) {
        View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f19605a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public M e(long j10) {
        View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public M f(Interpolator interpolator) {
        View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public M g(N n10) {
        View view = (View) this.f19605a.get();
        if (view != null) {
            h(view, n10);
        }
        return this;
    }

    public final void h(View view, N n10) {
        if (n10 != null) {
            view.animate().setListener(new a(n10, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public M i(long j10) {
        View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public M j(final P p10) {
        final View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().setUpdateListener(p10 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: Y0.L
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    p10.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public M l(float f10) {
        View view = (View) this.f19605a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
