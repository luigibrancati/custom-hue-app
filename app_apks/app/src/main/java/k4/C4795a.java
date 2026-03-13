package k4;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2758n;
import kotlin.jvm.internal.AbstractC4862t;
import m4.InterfaceC5022c;

/* JADX INFO: renamed from: k4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4795a implements InterfaceC4796b, InterfaceC5022c, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f39254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39255b;

    public C4795a(ImageView view) {
        AbstractC4862t.e(view, "view");
        this.f39254a = view;
    }

    @Override // k4.InterfaceC4796b
    public void a() {
        c(null);
    }

    @Override // k4.InterfaceC4798d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImageView getView() {
        return this.f39254a;
    }

    public void c(Drawable drawable) {
        Object drawable2 = getView().getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        getView().setImageDrawable(drawable);
        e();
    }

    public void e() {
        Object drawable = getView().getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f39255b) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4795a) && AbstractC4862t.a(getView(), ((C4795a) obj).getView());
        }
        return true;
    }

    public int hashCode() {
        return getView().hashCode();
    }

    @Override // k4.InterfaceC4797c
    public void onError(Drawable drawable) {
        c(drawable);
    }

    @Override // k4.InterfaceC4797c
    public void onStart(Drawable drawable) {
        c(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC2758n owner) {
        AbstractC4862t.e(owner, "owner");
        this.f39255b = false;
        e();
    }

    @Override // k4.InterfaceC4797c
    public void onSuccess(Drawable result) {
        AbstractC4862t.e(result, "result");
        c(result);
    }

    public String toString() {
        return "ImageViewTarget(view=" + getView() + ')';
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC2758n owner) {
        AbstractC4862t.e(owner, "owner");
        this.f39255b = true;
        e();
    }
}
