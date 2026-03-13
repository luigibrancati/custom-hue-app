package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class m implements af.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile af.c f41625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f41626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f41627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bf.a f41628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Queue f41629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f41630g;

    public m(String str, Queue queue, boolean z10) {
        this.f41624a = str;
        this.f41629f = queue;
        this.f41630g = z10;
    }

    public boolean A() {
        return this.f41625b instanceof f;
    }

    public boolean B() {
        return this.f41625b == null;
    }

    public void C(bf.c cVar) {
        if (z()) {
            try {
                this.f41627d.invoke(this.f41625b, cVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void D(af.c cVar) {
        this.f41625b = cVar;
    }

    @Override // af.c
    public void a(String str) {
        x().a(str);
    }

    @Override // af.c
    public void b(String str) {
        x().b(str);
    }

    @Override // af.c
    public void c(String str) {
        x().c(str);
    }

    @Override // af.c
    public boolean d() {
        return x().d();
    }

    @Override // af.c
    public void debug(String str, Object... objArr) {
        x().debug(str, objArr);
    }

    @Override // af.c
    public void e(String str, Object obj, Object obj2) {
        x().e(str, obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f41624a.equals(((m) obj).f41624a);
    }

    @Override // af.c
    public void error(String str, Object... objArr) {
        x().error(str, objArr);
    }

    @Override // af.c
    public boolean f() {
        return x().f();
    }

    @Override // af.c
    public void g(String str, Object obj, Object obj2) {
        x().g(str, obj, obj2);
    }

    @Override // af.c
    public String getName() {
        return this.f41624a;
    }

    @Override // af.c
    public boolean h() {
        return x().h();
    }

    public int hashCode() {
        return this.f41624a.hashCode();
    }

    @Override // af.c
    public void i(String str, Object obj, Object obj2) {
        x().i(str, obj, obj2);
    }

    @Override // af.c
    public boolean j(bf.b bVar) {
        return x().j(bVar);
    }

    @Override // af.c
    public boolean k() {
        return x().k();
    }

    @Override // af.c
    public void l(String str, Throwable th) {
        x().l(str, th);
    }

    @Override // af.c
    public void m(String str, Object obj, Object obj2) {
        x().m(str, obj, obj2);
    }

    @Override // af.c
    public void n(String str, Object obj) {
        x().n(str, obj);
    }

    @Override // af.c
    public void o(String str, Object obj) {
        x().o(str, obj);
    }

    @Override // af.c
    public void p(String str, Object obj) {
        x().p(str, obj);
    }

    @Override // af.c
    public void q(String str, Throwable th) {
        x().q(str, th);
    }

    @Override // af.c
    public boolean r() {
        return x().r();
    }

    @Override // af.c
    public void s(String str, Object obj, Object obj2) {
        x().s(str, obj, obj2);
    }

    @Override // af.c
    public void t(String str, Object obj) {
        x().t(str, obj);
    }

    @Override // af.c
    public void u(String str, Object obj) {
        x().u(str, obj);
    }

    @Override // af.c
    public void v(String str, Throwable th) {
        x().v(str, th);
    }

    @Override // af.c
    public void w(String str) {
        x().w(str);
    }

    @Override // af.c
    public void warn(String str, Object... objArr) {
        x().warn(str, objArr);
    }

    public af.c x() {
        return this.f41625b != null ? this.f41625b : this.f41630g ? f.f41616a : y();
    }

    public final af.c y() {
        if (this.f41628e == null) {
            this.f41628e = new bf.a(this, this.f41629f);
        }
        return this.f41628e;
    }

    public boolean z() {
        Boolean bool = this.f41626c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f41627d = this.f41625b.getClass().getMethod("log", bf.c.class);
            this.f41626c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f41626c = Boolean.FALSE;
        }
        return this.f41626c.booleanValue();
    }
}
