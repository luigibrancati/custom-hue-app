package pe;

import Ae.h;
import De.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import pe.InterfaceC5469e;
import pe.s;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class y implements InterfaceC5469e.a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final b f42896H = new b(null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final List f42897I = qe.p.j(z.HTTP_2, z.HTTP_1_1);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final List f42898J = qe.p.j(m.f42820i, m.f42822k);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f42899A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f42900B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f42901C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f42902D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ue.q f42903E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final te.d f42904F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final l f42905G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f42906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f42908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s.c f42909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC5466b f42912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f42914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f42915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5467c f42916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f42917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Proxy f42918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProxySelector f42919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC5466b f42920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SocketFactory f42921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f42922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X509TrustManager f42923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f42924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f42925t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HostnameVerifier f42926u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f42927v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final De.c f42928w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f42929x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f42930y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f42931z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f42932A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f42933B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f42934C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f42935D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public long f42936E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public ue.q f42937F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public te.d f42938G;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l f42940b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC5466b f42946h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f42947i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f42948j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public o f42949k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public C5467c f42950l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public r f42951m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Proxy f42952n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public ProxySelector f42953o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public InterfaceC5466b f42954p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public SocketFactory f42955q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public SSLSocketFactory f42956r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public X509TrustManager f42957s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public List f42958t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public List f42959u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public HostnameVerifier f42960v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public g f42961w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public De.c f42962x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f42963y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f42964z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public q f42939a = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f42941c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f42942d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s.c f42943e = qe.p.c(s.f42861b);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f42944f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f42945g = true;

        public a() {
            InterfaceC5466b interfaceC5466b = InterfaceC5466b.f42612b;
            this.f42946h = interfaceC5466b;
            this.f42947i = true;
            this.f42948j = true;
            this.f42949k = o.f42847b;
            this.f42951m = r.f42858b;
            this.f42954p = interfaceC5466b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            AbstractC4862t.d(socketFactory, "getDefault(...)");
            this.f42955q = socketFactory;
            b bVar = y.f42896H;
            this.f42958t = bVar.a();
            this.f42959u = bVar.b();
            this.f42960v = De.d.f2701a;
            this.f42961w = g.f42672d;
            this.f42964z = 10000;
            this.f42932A = 10000;
            this.f42933B = 10000;
            this.f42935D = 60000;
            this.f42936E = 1024L;
        }

        public final Proxy A() {
            return this.f42952n;
        }

        public final InterfaceC5466b B() {
            return this.f42954p;
        }

        public final ProxySelector C() {
            return this.f42953o;
        }

        public final int D() {
            return this.f42932A;
        }

        public final boolean E() {
            return this.f42944f;
        }

        public final ue.q F() {
            return this.f42937F;
        }

        public final SocketFactory G() {
            return this.f42955q;
        }

        public final SSLSocketFactory H() {
            return this.f42956r;
        }

        public final te.d I() {
            return this.f42938G;
        }

        public final int J() {
            return this.f42935D;
        }

        public final int K() {
            return this.f42933B;
        }

        public final X509TrustManager L() {
            return this.f42957s;
        }

        public final void M(l lVar) {
            this.f42940b = lVar;
        }

        public final a a(w interceptor) {
            AbstractC4862t.e(interceptor, "interceptor");
            this.f42942d.add(interceptor);
            return this;
        }

        public final y b() {
            return new y(this);
        }

        public final a c(C5467c c5467c) {
            this.f42950l = c5467c;
            return this;
        }

        public final a d(boolean z10) {
            this.f42947i = z10;
            return this;
        }

        public final a e(boolean z10) {
            this.f42948j = z10;
            return this;
        }

        public final InterfaceC5466b f() {
            return this.f42946h;
        }

        public final C5467c g() {
            return this.f42950l;
        }

        public final int h() {
            return this.f42963y;
        }

        public final De.c i() {
            return this.f42962x;
        }

        public final g j() {
            return this.f42961w;
        }

        public final int k() {
            return this.f42964z;
        }

        public final l l() {
            return this.f42940b;
        }

        public final List m() {
            return this.f42958t;
        }

        public final o n() {
            return this.f42949k;
        }

        public final q o() {
            return this.f42939a;
        }

        public final r p() {
            return this.f42951m;
        }

        public final s.c q() {
            return this.f42943e;
        }

        public final boolean r() {
            return this.f42945g;
        }

        public final boolean s() {
            return this.f42947i;
        }

        public final boolean t() {
            return this.f42948j;
        }

        public final HostnameVerifier u() {
            return this.f42960v;
        }

        public final List v() {
            return this.f42941c;
        }

        public final long w() {
            return this.f42936E;
        }

        public final List x() {
            return this.f42942d;
        }

        public final int y() {
            return this.f42934C;
        }

        public final List z() {
            return this.f42959u;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final List a() {
            return y.f42898J;
        }

        public final List b() {
            return y.f42897I;
        }

        public b() {
        }
    }

    public y(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorC;
        List list;
        AbstractC4862t.e(builder, "builder");
        this.f42906a = builder.o();
        this.f42907b = qe.p.s(builder.v());
        this.f42908c = qe.p.s(builder.x());
        this.f42909d = builder.q();
        boolean zE = builder.E();
        this.f42910e = zE;
        boolean zR = builder.r();
        this.f42911f = zR;
        this.f42912g = builder.f();
        this.f42913h = builder.s();
        this.f42914i = builder.t();
        this.f42915j = builder.n();
        this.f42916k = builder.g();
        this.f42917l = builder.p();
        this.f42918m = builder.A();
        if (builder.A() != null) {
            proxySelectorC = Ce.a.f1409a;
        } else {
            proxySelectorC = builder.C();
            proxySelectorC = proxySelectorC == null ? ProxySelector.getDefault() : proxySelectorC;
            if (proxySelectorC == null) {
                proxySelectorC = Ce.a.f1409a;
            }
        }
        this.f42919n = proxySelectorC;
        this.f42920o = builder.B();
        this.f42921p = builder.G();
        List listM = builder.m();
        this.f42924s = listM;
        this.f42925t = builder.z();
        this.f42926u = builder.u();
        this.f42929x = builder.h();
        int iK = builder.k();
        this.f42930y = iK;
        int iD = builder.D();
        this.f42931z = iD;
        int iK2 = builder.K();
        this.f42899A = iK2;
        int iY = builder.y();
        this.f42900B = iY;
        this.f42901C = builder.J();
        this.f42902D = builder.w();
        ue.q qVarF = builder.F();
        qVarF = qVarF == null ? new ue.q() : qVarF;
        this.f42903E = qVarF;
        te.d dVarI = builder.I();
        this.f42904F = dVarI == null ? te.d.f44940m : dVarI;
        l lVarL = builder.l();
        if (lVarL == null) {
            list = listM;
            l lVar = new l(0, 0L, null, null, null, iD, iK2, iK, iD, iY, zE, zR, qVarF, 31, null);
            builder.M(lVar);
            lVarL = lVar;
        } else {
            list = listM;
        }
        this.f42905G = lVarL;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (builder.H() != null) {
                        this.f42922q = builder.H();
                        De.c cVarI = builder.i();
                        AbstractC4862t.b(cVarI);
                        this.f42928w = cVarI;
                        X509TrustManager x509TrustManagerL = builder.L();
                        AbstractC4862t.b(x509TrustManagerL);
                        this.f42923r = x509TrustManagerL;
                        g gVarJ = builder.j();
                        AbstractC4862t.b(cVarI);
                        this.f42927v = gVarJ.e(cVarI);
                    } else {
                        h.a aVar = Ae.h.f493a;
                        X509TrustManager x509TrustManagerP = aVar.g().p();
                        this.f42923r = x509TrustManagerP;
                        Ae.h hVarG = aVar.g();
                        AbstractC4862t.b(x509TrustManagerP);
                        this.f42922q = hVarG.o(x509TrustManagerP);
                        c.a aVar2 = De.c.f2700a;
                        AbstractC4862t.b(x509TrustManagerP);
                        De.c cVarA = aVar2.a(x509TrustManagerP);
                        this.f42928w = cVarA;
                        g gVarJ2 = builder.j();
                        AbstractC4862t.b(cVarA);
                        this.f42927v = gVarJ2.e(cVarA);
                    }
                }
            }
            this.f42922q = null;
            this.f42928w = null;
            this.f42923r = null;
            this.f42927v = g.f42672d;
        } else {
            this.f42922q = null;
            this.f42928w = null;
            this.f42923r = null;
            this.f42927v = g.f42672d;
        }
        z();
    }

    public final int A() {
        return this.f42899A;
    }

    @Override // pe.InterfaceC5469e.a
    public InterfaceC5469e a(C5464A request) {
        AbstractC4862t.e(request, "request");
        return new ue.k(this, request, false);
    }

    public final C5465a d(v url) {
        SSLSocketFactory sSLSocketFactoryY;
        HostnameVerifier hostnameVerifier;
        g gVar;
        AbstractC4862t.e(url, "url");
        if (url.i()) {
            sSLSocketFactoryY = y();
            hostnameVerifier = this.f42926u;
            gVar = this.f42927v;
        } else {
            sSLSocketFactoryY = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C5465a(url.h(), url.m(), this.f42917l, this.f42921p, sSLSocketFactoryY, hostnameVerifier, gVar, this.f42920o, this.f42918m, this.f42925t, this.f42924s, this.f42919n);
    }

    public final InterfaceC5466b e() {
        return this.f42912g;
    }

    public final C5467c f() {
        return this.f42916k;
    }

    public final int g() {
        return this.f42929x;
    }

    public final int h() {
        return this.f42930y;
    }

    public final l i() {
        return this.f42905G;
    }

    public final o j() {
        return this.f42915j;
    }

    public final q k() {
        return this.f42906a;
    }

    public final s.c l() {
        return this.f42909d;
    }

    public final boolean m() {
        return this.f42911f;
    }

    public final boolean n() {
        return this.f42913h;
    }

    public final boolean o() {
        return this.f42914i;
    }

    public final ue.q p() {
        return this.f42903E;
    }

    public final te.d q() {
        return this.f42904F;
    }

    public final List r() {
        return this.f42907b;
    }

    public final List s() {
        return this.f42908c;
    }

    public final int t() {
        return this.f42900B;
    }

    public final List u() {
        return this.f42925t;
    }

    public final InterfaceC5466b v() {
        return this.f42920o;
    }

    public final int w() {
        return this.f42931z;
    }

    public final boolean x() {
        return this.f42910e;
    }

    public final SSLSocketFactory y() {
        SSLSocketFactory sSLSocketFactory = this.f42922q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void z() {
        List list = this.f42907b;
        AbstractC4862t.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f42907b).toString());
        }
        List list2 = this.f42908c;
        AbstractC4862t.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f42908c).toString());
        }
        List list3 = this.f42924s;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (this.f42922q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f42928w == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f42923r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f42922q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f42928w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f42923r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!AbstractC4862t.a(this.f42927v, g.f42672d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public y() {
        this(new a());
    }
}
