package ve;

import Fe.InterfaceC0844f;
import Fe.v;
import fc.C4022e;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC4862t;
import pe.B;
import pe.C;
import pe.C5464A;
import pe.w;
import qe.l;
import xe.C6363a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46036a;

    public b(boolean z10) {
        this.f46036a = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, pe.C$a] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [pe.C$a] */
    @Override // pe.w
    public C a(w.a chain) throws IOException {
        boolean z10;
        ?? r92;
        ?? Q10;
        C.a aVar;
        AbstractC4862t.e(chain, "chain");
        g gVar = (g) chain;
        ue.e eVarG = gVar.g();
        AbstractC4862t.b(eVarG);
        C5464A c5464aI = gVar.i();
        B bA = c5464aI.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            eVarG.v(c5464aI);
            ?? B10 = f.b(c5464aI.i());
            try {
                if (B10 == 0 || bA == null) {
                    eVarG.o();
                    z10 = true;
                    B10 = 0;
                } else {
                    if (Od.C.E("100-continue", c5464aI.e("Expect"), true)) {
                        eVarG.f();
                        C.a aVarQ = eVarG.q(true);
                        try {
                            eVarG.s();
                            z10 = false;
                            aVar = aVarQ;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            r92 = aVarQ;
                            if (e instanceof C6363a) {
                                throw e;
                            }
                            Q10 = r92;
                            if (!eVarG.k()) {
                                throw e;
                            }
                        }
                    } else {
                        z10 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        eVarG.o();
                        B10 = aVar;
                        if (!eVarG.h().q()) {
                            eVarG.n();
                            B10 = aVar;
                        }
                    } else if (bA.c()) {
                        eVarG.f();
                        bA.e(v.b(eVarG.c(c5464aI, true)));
                        B10 = aVar;
                    } else {
                        InterfaceC0844f interfaceC0844fB = v.b(eVarG.c(c5464aI, false));
                        bA.e(interfaceC0844fB);
                        interfaceC0844fB.close();
                        B10 = aVar;
                    }
                }
                if (bA == null || !bA.c()) {
                    eVarG.e();
                }
                e = null;
                Q10 = B10;
            } catch (IOException e11) {
                e = e11;
                r92 = B10;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            r92 = 0;
        }
        if (Q10 == 0) {
            try {
                Q10 = eVarG.q(false);
                AbstractC4862t.b(Q10);
                if (z10) {
                    eVarG.s();
                    z10 = false;
                }
            } catch (IOException e13) {
                if (e == null) {
                    throw e13;
                }
                C4022e.a(e, e13);
                throw e;
            }
        }
        C c10 = Q10.q(c5464aI).h(eVarG.h().m()).r(jCurrentTimeMillis).p(System.currentTimeMillis()).c();
        int iG = c10.g();
        if (b(iG, eVarG)) {
            C.a aVarQ2 = eVarG.q(false);
            AbstractC4862t.b(aVarQ2);
            if (z10) {
                eVarG.s();
            }
            c10 = aVarQ2.q(c5464aI).h(eVarG.h().m()).r(jCurrentTimeMillis).p(System.currentTimeMillis()).c();
            iG = c10.g();
        }
        eVarG.r(c10);
        C cU = (this.f46036a && iG == 101) ? l.u(c10) : c10.D().b(eVarG.p(c10)).c();
        if (Od.C.E("close", cU.K().e("Connection"), true) || Od.C.E("close", C.m(cU, "Connection", null, 2, null), true)) {
            eVarG.n();
        }
        if ((iG != 204 && iG != 205) || cU.b().a() <= 0) {
            return cU;
        }
        throw new ProtocolException("HTTP " + iG + " had non-zero Content-Length: " + cU.b().a());
    }

    public final boolean b(int i10, ue.e eVar) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }
}
