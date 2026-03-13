package pe;

import gc.C4206t;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import pe.u;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5464A f42563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f42564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f42567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f42568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D f42569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f42570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C f42571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C f42572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f42573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f42574l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ue.e f42575m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC6082a f42576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C5468d f42577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f42578p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f42579q;

    public C(C5464A request, z protocol, String message, int i10, t tVar, u headers, D body, C c10, C c11, C c12, long j10, long j11, ue.e eVar, InterfaceC6082a trailersFn) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(protocol, "protocol");
        AbstractC4862t.e(message, "message");
        AbstractC4862t.e(headers, "headers");
        AbstractC4862t.e(body, "body");
        AbstractC4862t.e(trailersFn, "trailersFn");
        this.f42563a = request;
        this.f42564b = protocol;
        this.f42565c = message;
        this.f42566d = i10;
        this.f42567e = tVar;
        this.f42568f = headers;
        this.f42569g = body;
        this.f42570h = c10;
        this.f42571i = c11;
        this.f42572j = c12;
        this.f42573k = j10;
        this.f42574l = j11;
        this.f42575m = eVar;
        this.f42576n = trailersFn;
        this.f42578p = qe.l.t(this);
        this.f42579q = qe.l.s(this);
    }

    public static /* synthetic */ String m(C c10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c10.k(str, str2);
    }

    public final C C() {
        return this.f42570h;
    }

    public final a D() {
        return qe.l.l(this);
    }

    public final C F() {
        return this.f42572j;
    }

    public final z G() {
        return this.f42564b;
    }

    public final long H() {
        return this.f42574l;
    }

    public final C5464A K() {
        return this.f42563a;
    }

    public final long S() {
        return this.f42573k;
    }

    public final void Y(C5468d c5468d) {
        this.f42577o = c5468d;
    }

    public final D b() {
        return this.f42569g;
    }

    public final C5468d c() {
        return qe.l.r(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        qe.l.e(this);
    }

    public final C d() {
        return this.f42571i;
    }

    public final List f() {
        String str;
        u uVar = this.f42568f;
        int i10 = this.f42566d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return C4206t.k();
            }
            str = "Proxy-Authenticate";
        }
        return ve.e.a(uVar, str);
    }

    public final int g() {
        return this.f42566d;
    }

    public final ue.e h() {
        return this.f42575m;
    }

    public final C5468d i() {
        return this.f42577o;
    }

    public final t j() {
        return this.f42567e;
    }

    public final String k(String name, String str) {
        AbstractC4862t.e(name, "name");
        return qe.l.g(this, name, str);
    }

    public final u o() {
        return this.f42568f;
    }

    public final boolean q() {
        return this.f42578p;
    }

    public String toString() {
        return qe.l.p(this);
    }

    public final String u() {
        return this.f42565c;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C5464A f42580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z f42581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f42582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f42583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t f42584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public u.a f42585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public D f42586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C f42587h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public C f42588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public C f42589j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f42590k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f42591l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ue.e f42592m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public InterfaceC6082a f42593n;

        /* JADX INFO: renamed from: pe.C$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0566a extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ue.e f42594a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0566a(ue.e eVar) {
                super(0);
                this.f42594a = eVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final u invoke() {
                return this.f42594a.u();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f42595a = new b();

            public b() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final u invoke() {
                return u.f42870b.a(new String[0]);
            }
        }

        public a() {
            this.f42582c = -1;
            this.f42586g = qe.m.o();
            this.f42593n = b.f42595a;
            this.f42585f = new u.a();
        }

        public final void A(C5464A c5464a) {
            this.f42580a = c5464a;
        }

        public final void B(InterfaceC6082a interfaceC6082a) {
            AbstractC4862t.e(interfaceC6082a, "<set-?>");
            this.f42593n = interfaceC6082a;
        }

        public a C(InterfaceC6082a trailersFn) {
            AbstractC4862t.e(trailersFn, "trailersFn");
            return qe.l.q(this, trailersFn);
        }

        public a a(String name, String value) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(value, "value");
            return qe.l.b(this, name, value);
        }

        public a b(D body) {
            AbstractC4862t.e(body, "body");
            return qe.l.c(this, body);
        }

        public C c() {
            int i10 = this.f42582c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f42582c).toString());
            }
            C5464A c5464a = this.f42580a;
            if (c5464a == null) {
                throw new IllegalStateException("request == null");
            }
            z zVar = this.f42581b;
            if (zVar == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f42583d;
            if (str != null) {
                return new C(c5464a, zVar, str, i10, this.f42584e, this.f42585f.d(), this.f42586g, this.f42587h, this.f42588i, this.f42589j, this.f42590k, this.f42591l, this.f42592m, this.f42593n);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(C c10) {
            return qe.l.d(this, c10);
        }

        public a e(int i10) {
            return qe.l.f(this, i10);
        }

        public final int f() {
            return this.f42582c;
        }

        public final u.a g() {
            return this.f42585f;
        }

        public a h(t tVar) {
            this.f42584e = tVar;
            return this;
        }

        public a i(String name, String value) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(value, "value");
            return qe.l.h(this, name, value);
        }

        public a j(u headers) {
            AbstractC4862t.e(headers, "headers");
            return qe.l.i(this, headers);
        }

        public final void k(ue.e exchange) {
            AbstractC4862t.e(exchange, "exchange");
            this.f42592m = exchange;
            this.f42593n = new C0566a(exchange);
        }

        public a l(String message) {
            AbstractC4862t.e(message, "message");
            return qe.l.j(this, message);
        }

        public a m(C c10) {
            return qe.l.k(this, c10);
        }

        public a n(C c10) {
            return qe.l.m(this, c10);
        }

        public a o(z protocol) {
            AbstractC4862t.e(protocol, "protocol");
            return qe.l.n(this, protocol);
        }

        public a p(long j10) {
            this.f42591l = j10;
            return this;
        }

        public a q(C5464A request) {
            AbstractC4862t.e(request, "request");
            return qe.l.o(this, request);
        }

        public a r(long j10) {
            this.f42590k = j10;
            return this;
        }

        public final void s(D d10) {
            AbstractC4862t.e(d10, "<set-?>");
            this.f42586g = d10;
        }

        public final void t(C c10) {
            this.f42588i = c10;
        }

        public final void u(int i10) {
            this.f42582c = i10;
        }

        public final void v(u.a aVar) {
            AbstractC4862t.e(aVar, "<set-?>");
            this.f42585f = aVar;
        }

        public final void w(String str) {
            this.f42583d = str;
        }

        public final void x(C c10) {
            this.f42587h = c10;
        }

        public final void y(C c10) {
            this.f42589j = c10;
        }

        public final void z(z zVar) {
            this.f42581b = zVar;
        }

        public a(C response) {
            AbstractC4862t.e(response, "response");
            this.f42582c = -1;
            this.f42586g = qe.m.o();
            this.f42593n = b.f42595a;
            this.f42580a = response.K();
            this.f42581b = response.G();
            this.f42582c = response.g();
            this.f42583d = response.u();
            this.f42584e = response.j();
            this.f42585f = response.o().f();
            this.f42586g = response.b();
            this.f42587h = response.C();
            this.f42588i = response.d();
            this.f42589j = response.F();
            this.f42590k = response.S();
            this.f42591l = response.H();
            this.f42592m = response.h();
            this.f42593n = response.f42576n;
        }
    }
}
