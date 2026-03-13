package ue;

import gc.C4199l;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C;
import pe.C5464A;
import pe.C5465a;
import pe.E;
import pe.v;
import pe.z;
import ue.r;
import ue.s;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final te.d f45671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f45672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f45678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f45679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C5465a f45680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f45681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f45682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public s.b f45683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f45684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E f45685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C4199l f45686p;

    public n(te.d taskRunner, m connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, C5465a address, q routeDatabase, d connectionUser) {
        AbstractC4862t.e(taskRunner, "taskRunner");
        AbstractC4862t.e(connectionPool, "connectionPool");
        AbstractC4862t.e(address, "address");
        AbstractC4862t.e(routeDatabase, "routeDatabase");
        AbstractC4862t.e(connectionUser, "connectionUser");
        this.f45671a = taskRunner;
        this.f45672b = connectionPool;
        this.f45673c = i10;
        this.f45674d = i11;
        this.f45675e = i12;
        this.f45676f = i13;
        this.f45677g = i14;
        this.f45678h = z10;
        this.f45679i = z11;
        this.f45680j = address;
        this.f45681k = routeDatabase;
        this.f45682l = connectionUser;
        this.f45686p = new C4199l();
    }

    public static /* synthetic */ c j(n nVar, E e10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return nVar.i(e10, list);
    }

    public static /* synthetic */ p m(n nVar, c cVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return nVar.l(cVar, list);
    }

    @Override // ue.r
    public boolean a(l lVar) {
        s sVar;
        E eN;
        if (!b().isEmpty() || this.f45685o != null) {
            return true;
        }
        if (lVar != null && (eN = n(lVar)) != null) {
            this.f45685o = eN;
            return true;
        }
        s.b bVar = this.f45683m;
        if ((bVar == null || !bVar.b()) && (sVar = this.f45684n) != null) {
            return sVar.a();
        }
        return true;
    }

    @Override // ue.r
    public C4199l b() {
        return this.f45686p;
    }

    @Override // ue.r
    public boolean c() {
        return this.f45682l.c();
    }

    @Override // ue.r
    public r.b d() throws IOException {
        p pVarK = k();
        if (pVarK != null) {
            return pVarK;
        }
        p pVarM = m(this, null, null, 3, null);
        if (pVarM != null) {
            return pVarM;
        }
        if (!b().isEmpty()) {
            return (r.b) b().removeFirst();
        }
        c cVarH = h();
        p pVarL = l(cVarH, cVarH.o());
        return pVarL != null ? pVarL : cVarH;
    }

    @Override // ue.r
    public boolean e(v url) {
        AbstractC4862t.e(url, "url");
        v vVarL = getAddress().l();
        return url.m() == vVarL.m() && AbstractC4862t.a(url.h(), vVarL.h());
    }

    public final C5464A g(E e10) {
        C5464A c5464aB = new C5464A.a().s(e10.a().l()).n("CONNECT", null).l("Host", qe.p.q(e10.a().l(), true)).l("Proxy-Connection", "Keep-Alive").l("User-Agent", "okhttp/5.0.0-alpha.14").b();
        C5464A c5464aA = e10.a().h().a(e10, new C.a().q(c5464aB).o(z.HTTP_1_1).e(407).l("Preemptive Authenticate").r(-1L).p(-1L).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return c5464aA == null ? c5464aB : c5464aA;
    }

    @Override // ue.r
    public C5465a getAddress() {
        return this.f45680j;
    }

    public final c h() throws IOException {
        E e10 = this.f45685o;
        if (e10 != null) {
            this.f45685o = null;
            return j(this, e10, null, 2, null);
        }
        s.b bVar = this.f45683m;
        if (bVar != null && bVar.b()) {
            return j(this, bVar.c(), null, 2, null);
        }
        s sVar = this.f45684n;
        if (sVar == null) {
            sVar = new s(getAddress(), this.f45681k, this.f45682l, this.f45679i);
            this.f45684n = sVar;
        }
        if (!sVar.a()) {
            throw new IOException("exhausted all routes");
        }
        s.b bVarC = sVar.c();
        this.f45683m = bVarC;
        if (c()) {
            throw new IOException("Canceled");
        }
        return i(bVarC.c(), bVarC.a());
    }

    public final c i(E route, List list) throws UnknownServiceException {
        AbstractC4862t.e(route, "route");
        if (route.a().k() == null) {
            if (!route.a().b().contains(pe.m.f42822k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strH = route.a().l().h();
            if (!Ae.h.f493a.g().j(strH)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strH + " not permitted by network security policy");
            }
        } else if (route.a().f().contains(z.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new c(this.f45671a, this.f45672b, this.f45673c, this.f45674d, this.f45675e, this.f45676f, this.f45677g, this.f45678h, this.f45682l, this, route, list, 0, route.c() ? g(route) : null, -1, false);
    }

    public final p k() {
        Socket socketV;
        boolean z10;
        l lVarW = this.f45682l.w();
        if (lVarW == null) {
            return null;
        }
        boolean zP = lVarW.p(this.f45682l.n());
        synchronized (lVarW) {
            try {
                if (!zP) {
                    z10 = !lVarW.k();
                    lVarW.w(true);
                    socketV = this.f45682l.v();
                } else if (lVarW.k() || !e(lVarW.t().a().l())) {
                    socketV = this.f45682l.v();
                    z10 = false;
                } else {
                    z10 = false;
                    socketV = null;
                }
            } finally {
            }
        }
        if (this.f45682l.w() != null) {
            if (socketV == null) {
                return new p(lVarW);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketV != null) {
            qe.p.f(socketV);
        }
        this.f45682l.h(lVarW);
        this.f45682l.o(lVarW);
        if (socketV != null) {
            this.f45682l.f(lVarW);
        } else if (z10) {
            this.f45682l.m(lVarW);
        }
        return null;
    }

    public final p l(c cVar, List list) {
        l lVarA = this.f45672b.a(this.f45682l.n(), getAddress(), this.f45682l, list, cVar != null && cVar.isReady());
        if (lVarA == null) {
            return null;
        }
        if (cVar != null) {
            this.f45685o = cVar.e();
            cVar.h();
        }
        this.f45682l.i(lVarA);
        this.f45682l.d(lVarA);
        return new p(lVarA);
    }

    public final E n(l lVar) {
        E eT;
        synchronized (lVar) {
            eT = null;
            if (lVar.l() == 0 && lVar.k() && qe.p.e(lVar.t().a().l(), getAddress().l())) {
                eT = lVar.t();
            }
        }
        return eT;
    }
}
