package se;

import Fe.C0843e;
import Fe.InterfaceC0844f;
import Fe.InterfaceC0845g;
import Fe.J;
import Fe.K;
import Fe.v;
import Od.C;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import org.apache.tika.metadata.HttpHeaders;
import pe.C;
import pe.C5464A;
import pe.C5467c;
import pe.InterfaceC5469e;
import pe.s;
import pe.u;
import pe.w;
import pe.z;
import qe.l;
import qe.m;
import qe.p;
import se.d;
import ue.k;
import ve.h;

/* JADX INFO: renamed from: se.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5824a implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0600a f44470b = new C0600a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5467c f44471a;

    /* JADX INFO: renamed from: se.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0600a {
        public /* synthetic */ C0600a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final u b(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strE = uVar.e(i10);
                String strH = uVar.h(i10);
                if ((!C.E("Warning", strE, true) || !C.P(strH, "1", false, 2, null)) && (c(strE) || !d(strE) || uVar2.c(strE) == null)) {
                    aVar.c(strE, strH);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strE2 = uVar2.e(i11);
                if (!c(strE2) && d(strE2)) {
                    aVar.c(strE2, uVar2.h(i11));
                }
            }
            return aVar.d();
        }

        public final boolean c(String str) {
            return C.E(HttpHeaders.CONTENT_LENGTH, str, true) || C.E(HttpHeaders.CONTENT_ENCODING, str, true) || C.E(HttpHeaders.CONTENT_TYPE, str, true);
        }

        public final boolean d(String str) {
            return (C.E("Connection", str, true) || C.E("Keep-Alive", str, true) || C.E("Proxy-Authenticate", str, true) || C.E("Proxy-Authorization", str, true) || C.E("TE", str, true) || C.E("Trailers", str, true) || C.E("Transfer-Encoding", str, true) || C.E("Upgrade", str, true)) ? false : true;
        }

        public C0600a() {
        }
    }

    /* JADX INFO: renamed from: se.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0845g f44473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f44474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0844f f44475d;

        public b(InterfaceC0845g interfaceC0845g, c cVar, InterfaceC0844f interfaceC0844f) {
            this.f44473b = interfaceC0845g;
            this.f44474c = cVar;
            this.f44475d = interfaceC0844f;
        }

        @Override // Fe.J
        public long V0(C0843e sink, long j10) throws IOException {
            AbstractC4862t.e(sink, "sink");
            try {
                long jV0 = this.f44473b.V0(sink, j10);
                if (jV0 != -1) {
                    sink.m(this.f44475d.e(), sink.size() - jV0, jV0);
                    this.f44475d.M();
                    return jV0;
                }
                if (!this.f44472a) {
                    this.f44472a = true;
                    this.f44475d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.f44472a) {
                    throw e10;
                }
                this.f44472a = true;
                this.f44474c.abort();
                throw e10;
            }
        }

        @Override // Fe.J, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f44472a && !p.g(this, 100, TimeUnit.MILLISECONDS)) {
                this.f44472a = true;
                this.f44474c.abort();
            }
            this.f44473b.close();
        }

        @Override // Fe.J
        public K n() {
            return this.f44473b.n();
        }
    }

    public C5824a(C5467c c5467c) {
        this.f44471a = c5467c;
    }

    @Override // pe.w
    public pe.C a(w.a chain) {
        s sVarR;
        AbstractC4862t.e(chain, "chain");
        InterfaceC5469e interfaceC5469eCall = chain.call();
        C5467c c5467c = this.f44471a;
        pe.C cB = c5467c != null ? c5467c.b(se.b.b(chain.d())) : null;
        d dVarB = new d.b(System.currentTimeMillis(), chain.d(), cB).b();
        C5464A c5464aB = dVarB.b();
        pe.C cA = dVarB.a();
        C5467c c5467c2 = this.f44471a;
        if (c5467c2 != null) {
            c5467c2.k(dVarB);
        }
        k kVar = interfaceC5469eCall instanceof k ? (k) interfaceC5469eCall : null;
        if (kVar == null || (sVarR = kVar.r()) == null) {
            sVarR = s.f42861b;
        }
        if (cB != null && cA == null) {
            m.f(cB.b());
        }
        if (c5464aB == null && cA == null) {
            pe.C c10 = new C.a().q(chain.d()).o(z.HTTP_1_1).e(504).l("Unsatisfiable Request (only-if-cached)").r(-1L).p(System.currentTimeMillis()).c();
            sVarR.A(interfaceC5469eCall, c10);
            return c10;
        }
        if (c5464aB == null) {
            AbstractC4862t.b(cA);
            pe.C c11 = cA.D().d(l.u(cA)).c();
            sVarR.b(interfaceC5469eCall, c11);
            return c11;
        }
        if (cA != null) {
            sVarR.a(interfaceC5469eCall, cA);
        } else if (this.f44471a != null) {
            sVarR.c(interfaceC5469eCall);
        }
        try {
            pe.C cA2 = chain.a(c5464aB);
            if (cA2 == null && cB != null) {
            }
            if (cA != null) {
                if (cA2 != null && cA2.g() == 304) {
                    pe.C c12 = cA.D().j(f44470b.b(cA.o(), cA2.o())).r(cA2.S()).p(cA2.H()).d(l.u(cA)).m(l.u(cA2)).c();
                    cA2.b().close();
                    C5467c c5467c3 = this.f44471a;
                    AbstractC4862t.b(c5467c3);
                    c5467c3.j();
                    this.f44471a.m(cA, c12);
                    sVarR.b(interfaceC5469eCall, c12);
                    return c12;
                }
                m.f(cA.b());
            }
            AbstractC4862t.b(cA2);
            pe.C c13 = cA2.D().d(cA != null ? l.u(cA) : null).m(l.u(cA2)).c();
            if (this.f44471a != null) {
                C5464A c5464aB2 = se.b.b(c5464aB);
                if (ve.e.b(c13) && d.f44476c.a(c13, c5464aB2)) {
                    pe.C cB2 = b(this.f44471a.f(c13.D().q(c5464aB2).c()), c13);
                    if (cA != null) {
                        sVarR.c(interfaceC5469eCall);
                    }
                    return cB2;
                }
                if (ve.f.a(c5464aB.i())) {
                    try {
                        this.f44471a.g(c5464aB);
                    } catch (IOException unused) {
                    }
                }
            }
            return c13;
        } finally {
            if (cB != null) {
                m.f(cB.b());
            }
        }
    }

    public final pe.C b(c cVar, pe.C c10) {
        if (cVar == null) {
            return c10;
        }
        b bVar = new b(c10.b().c(), cVar, v.b(cVar.a()));
        return c10.D().b(new h(pe.C.m(c10, HttpHeaders.CONTENT_TYPE, null, 2, null), c10.b().a(), v.c(bVar))).c();
    }
}
