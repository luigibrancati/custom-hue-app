package Y0;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f19670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f19671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f19672c;

    public y(View view, Runnable runnable) {
        this.f19670a = view;
        this.f19671b = view.getViewTreeObserver();
        this.f19672c = runnable;
    }

    public static y a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        y yVar = new y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(yVar);
        view.addOnAttachStateChangeListener(yVar);
        return yVar;
    }

    public void b() {
        if (this.f19671b.isAlive()) {
            this.f19671b.removeOnPreDrawListener(this);
        } else {
            this.f19670a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f19670a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f19672c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f19671b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
