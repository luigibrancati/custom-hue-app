package Rd;

import kotlin.jvm.internal.AbstractC4862t;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: renamed from: Rd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC2132i {
    public static final U a(M m10, InterfaceC4992i interfaceC4992i, O o10, vc.p pVar) {
        InterfaceC4992i interfaceC4992iJ = G.j(m10, interfaceC4992i);
        V h02 = o10.j() ? new H0(interfaceC4992iJ, pVar) : new V(interfaceC4992iJ, true);
        h02.S0(o10, h02, pVar);
        return h02;
    }

    public static /* synthetic */ U b(M m10, InterfaceC4992i interfaceC4992i, O o10, vc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4992i = C4993j.f40088a;
        }
        if ((i10 & 2) != 0) {
            o10 = O.DEFAULT;
        }
        return AbstractC2128g.a(m10, interfaceC4992i, o10, pVar);
    }

    public static final InterfaceC2166z0 c(M m10, InterfaceC4992i interfaceC4992i, O o10, vc.p pVar) {
        InterfaceC4992i interfaceC4992iJ = G.j(m10, interfaceC4992i);
        S0 i02 = o10.j() ? new I0(interfaceC4992iJ, pVar) : new S0(interfaceC4992iJ, true);
        i02.S0(o10, i02, pVar);
        return i02;
    }

    public static /* synthetic */ InterfaceC2166z0 d(M m10, InterfaceC4992i interfaceC4992i, O o10, vc.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC4992i = C4993j.f40088a;
        }
        if ((i10 & 2) != 0) {
            o10 = O.DEFAULT;
        }
        return AbstractC2128g.c(m10, interfaceC4992i, o10, pVar);
    }

    public static final Object e(InterfaceC4992i interfaceC4992i, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        Object objU0;
        InterfaceC4992i context = interfaceC4988e.getContext();
        InterfaceC4992i interfaceC4992iK = G.k(context, interfaceC4992i);
        C0.k(interfaceC4992iK);
        if (interfaceC4992iK == context) {
            Wd.A a10 = new Wd.A(interfaceC4992iK, interfaceC4988e);
            objU0 = Xd.b.d(a10, a10, pVar);
        } else {
            InterfaceC4989f.b bVar = InterfaceC4989f.f40086j0;
            if (AbstractC4862t.a(interfaceC4992iK.get(bVar), context.get(bVar))) {
                c1 c1Var = new c1(interfaceC4992iK, interfaceC4988e);
                InterfaceC4992i context2 = c1Var.getContext();
                Object objI = Wd.L.i(context2, null);
                try {
                    Object objD = Xd.b.d(c1Var, c1Var, pVar);
                    Wd.L.f(context2, objI);
                    objU0 = objD;
                } catch (Throwable th) {
                    Wd.L.f(context2, objI);
                    throw th;
                }
            } else {
                Z z10 = new Z(interfaceC4992iK, interfaceC4988e);
                Xd.a.c(pVar, z10, z10);
                objU0 = z10.U0();
            }
        }
        if (objU0 == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objU0;
    }
}
