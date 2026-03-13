package pe;

import gc.Q;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import pe.u;

/* JADX INFO: renamed from: pe.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5464A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f42549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f42551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f42552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f42553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f42554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C5468d f42555g;

    public C5464A(a builder) {
        AbstractC4862t.e(builder, "builder");
        v vVarK = builder.k();
        if (vVarK == null) {
            throw new IllegalStateException("url == null");
        }
        this.f42549a = vVarK;
        this.f42550b = builder.i();
        this.f42551c = builder.h().d();
        this.f42552d = builder.f();
        this.f42553e = builder.g();
        this.f42554f = Q.u(builder.j());
    }

    public final B a() {
        return this.f42552d;
    }

    public final C5468d b() {
        C5468d c5468d = this.f42555g;
        if (c5468d != null) {
            return c5468d;
        }
        C5468d c5468dA = C5468d.f42647n.a(this.f42551c);
        this.f42555g = c5468dA;
        return c5468dA;
    }

    public final v c() {
        return this.f42553e;
    }

    public final Map d() {
        return this.f42554f;
    }

    public final String e(String name) {
        AbstractC4862t.e(name, "name");
        return qe.j.d(this, name);
    }

    public final List f(String name) {
        AbstractC4862t.e(name, "name");
        return qe.j.f(this, name);
    }

    public final u g() {
        return this.f42551c;
    }

    public final boolean h() {
        return this.f42549a.i();
    }

    public final String i() {
        return this.f42550b;
    }

    public final a j() {
        return new a(this);
    }

    public final v k() {
        return this.f42549a;
    }

    public String toString() {
        return qe.j.j(this);
    }

    /* JADX INFO: renamed from: pe.A$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public v f42556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f42557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u.a f42558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public B f42559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public v f42560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map f42561f;

        public a() {
            this.f42561f = Q.i();
            this.f42557b = "GET";
            this.f42558c = new u.a();
        }

        public a a(String name, String value) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(value, "value");
            return qe.j.a(this, name, value);
        }

        public C5464A b() {
            return new C5464A(this);
        }

        public a c(C5468d cacheControl) {
            AbstractC4862t.e(cacheControl, "cacheControl");
            return qe.j.b(this, cacheControl);
        }

        public final a d(v vVar) {
            this.f42560e = vVar;
            return this;
        }

        public a e() {
            return qe.j.c(this);
        }

        public final B f() {
            return this.f42559d;
        }

        public final v g() {
            return this.f42560e;
        }

        public final u.a h() {
            return this.f42558c;
        }

        public final String i() {
            return this.f42557b;
        }

        public final Map j() {
            return this.f42561f;
        }

        public final v k() {
            return this.f42556a;
        }

        public a l(String name, String value) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(value, "value");
            return qe.j.e(this, name, value);
        }

        public a m(u headers) {
            AbstractC4862t.e(headers, "headers");
            return qe.j.g(this, headers);
        }

        public a n(String method, B b10) {
            AbstractC4862t.e(method, "method");
            return qe.j.h(this, method, b10);
        }

        public a o(String name) {
            AbstractC4862t.e(name, "name");
            return qe.j.i(this, name);
        }

        public final void p(B b10) {
            this.f42559d = b10;
        }

        public final void q(u.a aVar) {
            AbstractC4862t.e(aVar, "<set-?>");
            this.f42558c = aVar;
        }

        public final void r(String str) {
            AbstractC4862t.e(str, "<set-?>");
            this.f42557b = str;
        }

        public a s(v url) {
            AbstractC4862t.e(url, "url");
            this.f42556a = url;
            return this;
        }

        public a(C5464A request) {
            AbstractC4862t.e(request, "request");
            this.f42561f = Q.i();
            this.f42556a = request.k();
            this.f42557b = request.i();
            this.f42559d = request.a();
            this.f42561f = request.d().isEmpty() ? Q.i() : Q.w(request.d());
            this.f42558c = request.g().f();
            this.f42560e = request.c();
        }
    }

    public /* synthetic */ C5464A(v vVar, u uVar, String str, B b10, int i10, AbstractC4854k abstractC4854k) {
        this(vVar, (i10 & 2) != 0 ? u.f42870b.a(new String[0]) : uVar, (i10 & 4) != 0 ? WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR : str, (i10 & 8) != 0 ? null : b10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5464A(v url, u headers, String method, B b10) {
        AbstractC4862t.e(url, "url");
        AbstractC4862t.e(headers, "headers");
        AbstractC4862t.e(method, "method");
        a aVarM = new a().s(url).m(headers);
        if (AbstractC4862t.a(method, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            if (b10 != null) {
                method = "POST";
            } else {
                method = "GET";
            }
        }
        this(aVarM.n(method, b10));
    }
}
