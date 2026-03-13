package org.slf4j.helpers;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements af.c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41611a;

    public final void A(bf.b bVar, af.g gVar, String str, Throwable th) {
        z(bVar, gVar, str, null, th);
    }

    public final void B(bf.b bVar, af.g gVar, String str, Object obj) {
        z(bVar, gVar, str, new Object[]{obj}, null);
    }

    @Override // af.c
    public void a(String str) {
        if (f()) {
            A(bf.b.DEBUG, null, str, null);
        }
    }

    @Override // af.c
    public void b(String str) {
        if (h()) {
            A(bf.b.INFO, null, str, null);
        }
    }

    @Override // af.c
    public void c(String str) {
        if (d()) {
            A(bf.b.WARN, null, str, null);
        }
    }

    @Override // af.c
    public void debug(String str, Object... objArr) {
        if (f()) {
            y(bf.b.DEBUG, null, str, objArr);
        }
    }

    @Override // af.c
    public void e(String str, Object obj, Object obj2) {
        if (f()) {
            x(bf.b.DEBUG, null, str, obj, obj2);
        }
    }

    @Override // af.c
    public void error(String str, Object... objArr) {
        if (r()) {
            y(bf.b.ERROR, null, str, objArr);
        }
    }

    @Override // af.c
    public void g(String str, Object obj, Object obj2) {
        if (k()) {
            x(bf.b.TRACE, null, str, obj, obj2);
        }
    }

    @Override // af.c
    public String getName() {
        return this.f41611a;
    }

    @Override // af.c
    public void i(String str, Object obj, Object obj2) {
        if (d()) {
            x(bf.b.WARN, null, str, obj, obj2);
        }
    }

    @Override // af.c
    public void l(String str, Throwable th) {
        if (d()) {
            A(bf.b.WARN, null, str, th);
        }
    }

    @Override // af.c
    public void m(String str, Object obj, Object obj2) {
        if (h()) {
            x(bf.b.INFO, null, str, obj, obj2);
        }
    }

    @Override // af.c
    public void n(String str, Object obj) {
        if (h()) {
            B(bf.b.INFO, null, str, obj);
        }
    }

    @Override // af.c
    public void o(String str, Object obj) {
        if (d()) {
            B(bf.b.WARN, null, str, obj);
        }
    }

    @Override // af.c
    public void p(String str, Object obj) {
        if (k()) {
            B(bf.b.TRACE, null, str, obj);
        }
    }

    @Override // af.c
    public void q(String str, Throwable th) {
        if (r()) {
            A(bf.b.ERROR, null, str, th);
        }
    }

    @Override // af.c
    public void s(String str, Object obj, Object obj2) {
        if (r()) {
            x(bf.b.ERROR, null, str, obj, obj2);
        }
    }

    @Override // af.c
    public void t(String str, Object obj) {
        if (f()) {
            B(bf.b.DEBUG, null, str, obj);
        }
    }

    @Override // af.c
    public void u(String str, Object obj) {
        if (r()) {
            B(bf.b.ERROR, null, str, obj);
        }
    }

    @Override // af.c
    public void v(String str, Throwable th) {
        if (f()) {
            A(bf.b.DEBUG, null, str, th);
        }
    }

    @Override // af.c
    public void w(String str) {
        if (k()) {
            A(bf.b.TRACE, null, str, null);
        }
    }

    @Override // af.c
    public void warn(String str, Object... objArr) {
        if (d()) {
            y(bf.b.WARN, null, str, objArr);
        }
    }

    public final void x(bf.b bVar, af.g gVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            z(bVar, gVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            z(bVar, gVar, str, new Object[]{obj, obj2}, null);
        }
    }

    public final void y(bf.b bVar, af.g gVar, String str, Object[] objArr) {
        Throwable thA = e.a(objArr);
        if (thA != null) {
            z(bVar, gVar, str, e.b(objArr), thA);
        } else {
            z(bVar, gVar, str, objArr, null);
        }
    }

    public abstract void z(bf.b bVar, af.g gVar, String str, Object[] objArr, Throwable th);
}
