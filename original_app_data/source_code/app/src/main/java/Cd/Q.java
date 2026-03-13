package Cd;

import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Q {
    public static final C0718a a(E e10) {
        AbstractC4862t.e(e10, "<this>");
        t0 t0VarQ0 = e10.Q0();
        if (t0VarQ0 instanceof C0718a) {
            return (C0718a) t0VarQ0;
        }
        return null;
    }

    public static final M b(E e10) {
        AbstractC4862t.e(e10, "<this>");
        C0718a c0718aA = a(e10);
        if (c0718aA != null) {
            return c0718aA.Z0();
        }
        return null;
    }

    public static final boolean c(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return e10.Q0() instanceof C0732o;
    }

    public static final D d(D d10) {
        E e10;
        Collection collectionO = d10.o();
        ArrayList arrayList = new ArrayList(C4207u.v(collectionO, 10));
        Iterator it = collectionO.iterator();
        boolean z10 = false;
        while (true) {
            e10 = null;
            if (!it.hasNext()) {
                break;
            }
            E eF = (E) it.next();
            if (q0.l(eF)) {
                eF = f(eF.Q0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(eF);
        }
        if (!z10) {
            return null;
        }
        E eC = d10.c();
        if (eC != null) {
            if (q0.l(eC)) {
                eC = f(eC.Q0(), false, 1, null);
            }
            e10 = eC;
        }
        return new D(arrayList).g(e10);
    }

    public static final t0 e(t0 t0Var, boolean z10) {
        AbstractC4862t.e(t0Var, "<this>");
        C0732o c0732oB = C0732o.f1388d.b(t0Var, z10);
        if (c0732oB != null) {
            return c0732oB;
        }
        M mG = g(t0Var);
        return mG != null ? mG : t0Var.R0(false);
    }

    public static /* synthetic */ t0 f(t0 t0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(t0Var, z10);
    }

    public static final M g(E e10) {
        D d10;
        e0 e0VarN0 = e10.N0();
        D d11 = e0VarN0 instanceof D ? (D) e0VarN0 : null;
        if (d11 == null || (d10 = d(d11)) == null) {
            return null;
        }
        return d10.b();
    }

    public static final M h(M m10, boolean z10) {
        AbstractC4862t.e(m10, "<this>");
        C0732o c0732oB = C0732o.f1388d.b(m10, z10);
        if (c0732oB != null) {
            return c0732oB;
        }
        M mG = g(m10);
        return mG == null ? m10.R0(false) : mG;
    }

    public static /* synthetic */ M i(M m10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(m10, z10);
    }

    public static final M j(M m10, M abbreviatedType) {
        AbstractC4862t.e(m10, "<this>");
        AbstractC4862t.e(abbreviatedType, "abbreviatedType");
        return G.a(m10) ? m10 : new C0718a(m10, abbreviatedType);
    }

    public static final Dd.i k(Dd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return new Dd.i(iVar.W0(), iVar.N0(), iVar.Y0(), iVar.M0(), iVar.O0(), true);
    }
}
