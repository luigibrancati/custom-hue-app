package ue;

import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import Fe.K;
import fc.C4015H;
import gc.C4207u;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import pe.C;
import pe.C5464A;
import pe.C5465a;
import pe.E;
import pe.t;
import pe.z;
import ue.r;
import vc.InterfaceC6082a;
import ve.d;
import we.C6199b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements r.b, d.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f45557y = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te.d f45558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f45559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ue.d f45566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f45567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E f45568k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f45569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f45570m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C5464A f45571n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f45572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f45573p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f45574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Socket f45575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Socket f45576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pe.t f45577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z f45578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0845g f45579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC0844f f45580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f45581x;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45582a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45582a = iArr;
        }
    }

    /* JADX INFO: renamed from: ue.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0622c extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pe.t f45583a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0622c(pe.t tVar) {
            super(0);
            this.f45583a = tVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            List<Certificate> listD = this.f45583a.d();
            ArrayList arrayList = new ArrayList(C4207u.v(listD, 10));
            for (Certificate certificate : listD) {
                AbstractC4862t.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pe.g f45584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pe.t f45585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C5465a f45586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(pe.g gVar, pe.t tVar, C5465a c5465a) {
            super(0);
            this.f45584a = gVar;
            this.f45585b = tVar;
            this.f45586c = c5465a;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            De.c cVarD = this.f45584a.d();
            AbstractC4862t.b(cVarD);
            return cVarD.a(this.f45585b.d(), this.f45586c.l().h());
        }
    }

    public c(te.d taskRunner, m connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, ue.d user, n routePlanner, E route, List list, int i15, C5464A c5464a, int i16, boolean z11) {
        AbstractC4862t.e(taskRunner, "taskRunner");
        AbstractC4862t.e(connectionPool, "connectionPool");
        AbstractC4862t.e(user, "user");
        AbstractC4862t.e(routePlanner, "routePlanner");
        AbstractC4862t.e(route, "route");
        this.f45558a = taskRunner;
        this.f45559b = connectionPool;
        this.f45560c = i10;
        this.f45561d = i11;
        this.f45562e = i12;
        this.f45563f = i13;
        this.f45564g = i14;
        this.f45565h = z10;
        this.f45566i = user;
        this.f45567j = routePlanner;
        this.f45568k = route;
        this.f45569l = list;
        this.f45570m = i15;
        this.f45571n = c5464a;
        this.f45572o = i16;
        this.f45573p = z11;
    }

    public static /* synthetic */ c m(c cVar, int i10, C5464A c5464a, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = cVar.f45570m;
        }
        if ((i12 & 2) != 0) {
            c5464a = cVar.f45571n;
        }
        if ((i12 & 4) != 0) {
            i11 = cVar.f45572o;
        }
        if ((i12 & 8) != 0) {
            z10 = cVar.f45573p;
        }
        return cVar.l(i10, c5464a, i11, z10);
    }

    @Override // ue.r.b
    public l a() {
        this.f45566i.e(e());
        l lVar = this.f45581x;
        AbstractC4862t.b(lVar);
        this.f45566i.a(lVar, e());
        p pVarL = this.f45567j.l(this, this.f45569l);
        if (pVarL != null) {
            return pVarL.h();
        }
        synchronized (lVar) {
            this.f45559b.g(lVar);
            this.f45566i.k(lVar);
            C4015H c4015h = C4015H.f34254a;
        }
        this.f45566i.i(lVar);
        this.f45566i.d(lVar);
        return lVar;
    }

    @Override // ve.d.a
    public void b(k call, IOException iOException) {
        AbstractC4862t.e(call, "call");
    }

    @Override // ue.r.b, ve.d.a
    public void cancel() {
        this.f45574q = true;
        Socket socket = this.f45575r;
        if (socket != null) {
            qe.p.f(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    @Override // ue.r.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ue.r.a d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c.d():ue.r$a");
    }

    @Override // ve.d.a
    public E e() {
        return this.f45568k;
    }

    @Override // ue.r.b
    public r.b f() {
        return new c(this.f45558a, this.f45559b, this.f45560c, this.f45561d, this.f45562e, this.f45563f, this.f45564g, this.f45565h, this.f45566i, this.f45567j, e(), this.f45569l, this.f45570m, this.f45571n, this.f45572o, this.f45573p);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // ue.r.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ue.r.a g() throws java.lang.Throwable {
        /*
            r14 = this;
            java.net.Socket r0 = r14.f45575r
            if (r0 != 0) goto L68
            ue.d r0 = r14.f45566i
            r0.r(r14)
            r1 = 0
            ue.d r0 = r14.f45566i     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            pe.E r2 = r14.e()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r0.p(r2)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r14.i()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r1 = 1
            ue.r$a r2 = new ue.r$a     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L31
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            ue.d r14 = r3.f45566i
            r14.t(r3)
            return r2
        L27:
            r0 = move-exception
        L28:
            r14 = r0
            goto L59
        L2a:
            r0 = move-exception
        L2b:
            r14 = r0
            r11 = r14
            goto L34
        L2e:
            r0 = move-exception
            r3 = r14
            goto L28
        L31:
            r0 = move-exception
            r3 = r14
            goto L2b
        L34:
            ue.d r14 = r3.f45566i     // Catch: java.lang.Throwable -> L27
            pe.E r0 = r3.e()     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r14.b(r0, r2, r11)     // Catch: java.lang.Throwable -> L27
            ue.r$a r8 = new ue.r$a     // Catch: java.lang.Throwable -> L27
            r12 = 2
            r13 = 0
            r10 = 0
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L56
            ue.d r14 = r3.f45566i
            r14.t(r3)
            if (r1 != 0) goto L55
            java.net.Socket r14 = r3.f45575r
            if (r14 == 0) goto L55
            qe.p.f(r14)
        L55:
            return r8
        L56:
            r0 = move-exception
            r3 = r9
            goto L28
        L59:
            ue.d r0 = r3.f45566i
            r0.t(r3)
            if (r1 != 0) goto L67
            java.net.Socket r0 = r3.f45575r
            if (r0 == 0) goto L67
            qe.p.f(r0)
        L67:
            throw r14
        L68:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "TCP already connected"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.c.g():ue.r$a");
    }

    public final void h() {
        Socket socket = this.f45576s;
        if (socket != null) {
            qe.p.f(socket);
        }
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = e().b().type();
        int i10 = type == null ? -1 : b.f45582a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = e().a().j().createSocket();
            AbstractC4862t.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(e().b());
        }
        this.f45575r = socketCreateSocket;
        if (this.f45574q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f45563f);
        try {
            Ae.h.f493a.g().f(socketCreateSocket, e().d(), this.f45562e);
            try {
                this.f45579v = Fe.v.c(Fe.v.k(socketCreateSocket));
                this.f45580w = Fe.v.b(Fe.v.g(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (AbstractC4862t.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + e().d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    @Override // ue.r.b
    public boolean isReady() {
        return this.f45578u != null;
    }

    public final void j(SSLSocket sSLSocket, pe.m mVar) {
        C5465a c5465aA = e().a();
        try {
            if (mVar.h()) {
                Ae.h.f493a.g().e(sSLSocket, c5465aA.l().h(), c5465aA.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            t.a aVar = pe.t.f42862e;
            AbstractC4862t.b(session);
            pe.t tVarA = aVar.a(session);
            HostnameVerifier hostnameVerifierE = c5465aA.e();
            AbstractC4862t.b(hostnameVerifierE);
            if (hostnameVerifierE.verify(c5465aA.l().h(), session)) {
                pe.g gVarA = c5465aA.a();
                AbstractC4862t.b(gVarA);
                pe.t tVar = new pe.t(tVarA.e(), tVarA.a(), tVarA.c(), new d(gVarA, tVarA, c5465aA));
                this.f45577t = tVar;
                gVarA.b(c5465aA.l().h(), new C0622c(tVar));
                String strH = mVar.h() ? Ae.h.f493a.g().h(sSLSocket) : null;
                this.f45576s = sSLSocket;
                this.f45579v = Fe.v.c(Fe.v.k(sSLSocket));
                this.f45580w = Fe.v.b(Fe.v.g(sSLSocket));
                this.f45578u = strH != null ? z.Companion.a(strH) : z.HTTP_1_1;
                Ae.h.f493a.g().b(sSLSocket);
                return;
            }
            List listD = tVarA.d();
            if (listD.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c5465aA.l().h() + " not verified (no certificates)");
            }
            Object obj = listD.get(0);
            AbstractC4862t.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(Od.v.p("\n            |Hostname " + c5465aA.l().h() + " not verified:\n            |    certificate: " + pe.g.f42671c.a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + De.d.f2701a.a(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th) {
            Ae.h.f493a.g().b(sSLSocket);
            qe.p.f(sSLSocket);
            throw th;
        }
    }

    public final r.a k() throws IOException {
        C5464A c5464aN = n();
        if (c5464aN == null) {
            return new r.a(this, null, null, 6, null);
        }
        Socket socket = this.f45575r;
        if (socket != null) {
            qe.p.f(socket);
        }
        int i10 = this.f45570m + 1;
        if (i10 < 21) {
            this.f45566i.j(e(), null);
            return new r.a(this, m(this, i10, c5464aN, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f45566i.b(e(), null, protocolException);
        return new r.a(this, null, protocolException, 2, null);
    }

    public final c l(int i10, C5464A c5464a, int i11, boolean z10) {
        return new c(this.f45558a, this.f45559b, this.f45560c, this.f45561d, this.f45562e, this.f45563f, this.f45564g, this.f45565h, this.f45566i, this.f45567j, e(), this.f45569l, i10, c5464a, i11, z10);
    }

    public final C5464A n() throws IOException {
        C5464A c5464a = this.f45571n;
        AbstractC4862t.b(c5464a);
        String str = "CONNECT " + qe.p.q(e().a().l(), true) + " HTTP/1.1";
        while (true) {
            InterfaceC0845g interfaceC0845g = this.f45579v;
            AbstractC4862t.b(interfaceC0845g);
            InterfaceC0844f interfaceC0844f = this.f45580w;
            AbstractC4862t.b(interfaceC0844f);
            C6199b c6199b = new C6199b(null, this, interfaceC0845g, interfaceC0844f);
            K kN = interfaceC0845g.n();
            long j10 = this.f45560c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kN.g(j10, timeUnit);
            interfaceC0844f.n().g(this.f45561d, timeUnit);
            c6199b.B(c5464a.g(), str);
            c6199b.a();
            C.a aVarF = c6199b.f(false);
            AbstractC4862t.b(aVarF);
            C c10 = aVarF.q(c5464a).c();
            c6199b.A(c10);
            int iG = c10.g();
            if (iG == 200) {
                return null;
            }
            if (iG != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c10.g());
            }
            C5464A c5464aA = e().a().h().a(e(), c10);
            if (c5464aA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (Od.C.E("close", C.m(c10, "Connection", null, 2, null), true)) {
                return c5464aA;
            }
            c5464a = c5464aA;
        }
    }

    public final List o() {
        return this.f45569l;
    }

    public final c p(List connectionSpecs, SSLSocket sslSocket) {
        AbstractC4862t.e(connectionSpecs, "connectionSpecs");
        AbstractC4862t.e(sslSocket, "sslSocket");
        int i10 = this.f45572o + 1;
        int size = connectionSpecs.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (((pe.m) connectionSpecs.get(i11)).e(sslSocket)) {
                return m(this, 0, null, i11, this.f45572o != -1, 3, null);
            }
        }
        return null;
    }

    public final c q(List connectionSpecs, SSLSocket sslSocket) throws UnknownServiceException {
        AbstractC4862t.e(connectionSpecs, "connectionSpecs");
        AbstractC4862t.e(sslSocket, "sslSocket");
        if (this.f45572o != -1) {
            return this;
        }
        c cVarP = p(connectionSpecs, sslSocket);
        if (cVarP != null) {
            return cVarP;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f45573p);
        sb2.append(", modes=");
        sb2.append(connectionSpecs);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        AbstractC4862t.b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        AbstractC4862t.d(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // ve.d.a
    public void c() {
    }
}
