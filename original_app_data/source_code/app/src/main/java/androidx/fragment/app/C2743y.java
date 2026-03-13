package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C2743y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f23382a;

    public C2743y(A a10) {
        this.f23382a = a10;
    }

    public static C2743y b(A a10) {
        return new C2743y((A) X0.h.h(a10, "callbacks == null"));
    }

    public void a(ComponentCallbacksC2736q componentCallbacksC2736q) {
        J jG = this.f23382a.g();
        A a10 = this.f23382a;
        jG.n(a10, a10, componentCallbacksC2736q);
    }

    public void c() {
        this.f23382a.g().z();
    }

    public boolean d(MenuItem menuItem) {
        return this.f23382a.g().C(menuItem);
    }

    public void e() {
        this.f23382a.g().D();
    }

    public void f() {
        this.f23382a.g().F();
    }

    public void g() {
        this.f23382a.g().O();
    }

    public void h() {
        this.f23382a.g().S();
    }

    public void i() {
        this.f23382a.g().T();
    }

    public void j() {
        this.f23382a.g().V();
    }

    public boolean k() {
        return this.f23382a.g().c0(true);
    }

    public J l() {
        return this.f23382a.g();
    }

    public void m() {
        this.f23382a.g().X0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f23382a.g().z0().onCreateView(view, str, context, attributeSet);
    }
}
