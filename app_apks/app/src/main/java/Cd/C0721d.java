package Cd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: Cd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0721d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0721d f1314a = new C0721d();

    public final boolean a(Gd.p pVar, Gd.k kVar, Gd.k kVar2) {
        if (pVar.u0(kVar) == pVar.u0(kVar2) && pVar.y0(kVar) == pVar.y0(kVar2)) {
            if ((pVar.v(kVar) == null) == (pVar.v(kVar2) == null) && pVar.H(pVar.f(kVar), pVar.f(kVar2))) {
                if (pVar.D0(kVar, kVar2)) {
                    return true;
                }
                int iU0 = pVar.u0(kVar);
                for (int i10 = 0; i10 < iU0; i10++) {
                    Gd.m mVarW = pVar.w(kVar, i10);
                    Gd.m mVarW2 = pVar.w(kVar2, i10);
                    if (pVar.v0(mVarW) != pVar.v0(mVarW2)) {
                        return false;
                    }
                    if (!pVar.v0(mVarW) && (pVar.E(mVarW) != pVar.E(mVarW2) || !c(pVar, pVar.k0(mVarW), pVar.k0(mVarW2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean b(Gd.p context, Gd.i a10, Gd.i b10) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(a10, "a");
        AbstractC4862t.e(b10, "b");
        return c(context, a10, b10);
    }

    public final boolean c(Gd.p pVar, Gd.i iVar, Gd.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        Gd.k kVarE = pVar.e(iVar);
        Gd.k kVarE2 = pVar.e(iVar2);
        if (kVarE != null && kVarE2 != null) {
            return a(pVar, kVarE, kVarE2);
        }
        Gd.g gVarQ = pVar.Q(iVar);
        Gd.g gVarQ2 = pVar.Q(iVar2);
        return gVarQ != null && gVarQ2 != null && a(pVar, pVar.d(gVarQ), pVar.d(gVarQ2)) && a(pVar, pVar.b(gVarQ), pVar.b(gVarQ2));
    }
}
