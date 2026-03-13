package Cd;

import fc.C4032o;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 {
    public static final M a(E e10) {
        AbstractC4862t.e(e10, "<this>");
        t0 t0VarQ0 = e10.Q0();
        M m10 = t0VarQ0 instanceof M ? (M) t0VarQ0 : null;
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException(("This is should be simple type: " + e10).toString());
    }

    public static final E b(E e10, List newArguments, Mc.g newAnnotations) {
        AbstractC4862t.e(e10, "<this>");
        AbstractC4862t.e(newArguments, "newArguments");
        AbstractC4862t.e(newAnnotations, "newAnnotations");
        return e(e10, newArguments, newAnnotations, null, 4, null);
    }

    public static final E c(E e10, List newArguments, Mc.g newAnnotations, List newArgumentsForUpperBound) {
        AbstractC4862t.e(e10, "<this>");
        AbstractC4862t.e(newArguments, "newArguments");
        AbstractC4862t.e(newAnnotations, "newAnnotations");
        AbstractC4862t.e(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == e10.L0()) && newAnnotations == e10.getAnnotations()) {
            return e10;
        }
        a0 a0VarM0 = e10.M0();
        if ((newAnnotations instanceof Mc.l) && newAnnotations.isEmpty()) {
            newAnnotations = Mc.g.f9435K.b();
        }
        a0 a0VarA = b0.a(a0VarM0, newAnnotations);
        t0 t0VarQ0 = e10.Q0();
        if (t0VarQ0 instanceof AbstractC0741y) {
            AbstractC0741y abstractC0741y = (AbstractC0741y) t0VarQ0;
            return F.d(d(abstractC0741y.V0(), newArguments, a0VarA), d(abstractC0741y.W0(), newArgumentsForUpperBound, a0VarA));
        }
        if (t0VarQ0 instanceof M) {
            return d((M) t0VarQ0, newArguments, a0VarA);
        }
        throw new C4032o();
    }

    public static final M d(M m10, List newArguments, a0 newAttributes) {
        AbstractC4862t.e(m10, "<this>");
        AbstractC4862t.e(newArguments, "newArguments");
        AbstractC4862t.e(newAttributes, "newAttributes");
        return (newArguments.isEmpty() && newAttributes == m10.M0()) ? m10 : newArguments.isEmpty() ? m10.T0(newAttributes) : F.j(newAttributes, m10.N0(), newArguments, m10.O0(), null, 16, null);
    }

    public static /* synthetic */ E e(E e10, List list, Mc.g gVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = e10.L0();
        }
        if ((i10 & 2) != 0) {
            gVar = e10.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(e10, list, gVar, list2);
    }

    public static /* synthetic */ M f(M m10, List list, a0 a0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = m10.L0();
        }
        if ((i10 & 2) != 0) {
            a0Var = m10.M0();
        }
        return d(m10, list, a0Var);
    }
}
