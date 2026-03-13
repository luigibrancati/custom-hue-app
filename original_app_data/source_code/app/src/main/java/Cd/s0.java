package Cd;

import fc.C4032o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final E a(E e10) {
        AbstractC4862t.e(e10, "<this>");
        if (e10 instanceof r0) {
            return ((r0) e10).g0();
        }
        return null;
    }

    public static final t0 b(t0 t0Var, E origin) {
        AbstractC4862t.e(t0Var, "<this>");
        AbstractC4862t.e(origin, "origin");
        return d(t0Var, a(origin));
    }

    public static final t0 c(t0 t0Var, E origin, vc.l transform) {
        AbstractC4862t.e(t0Var, "<this>");
        AbstractC4862t.e(origin, "origin");
        AbstractC4862t.e(transform, "transform");
        E eA = a(origin);
        return d(t0Var, eA != null ? (E) transform.invoke(eA) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t0 d(t0 t0Var, E e10) {
        AbstractC4862t.e(t0Var, "<this>");
        if (t0Var instanceof r0) {
            return d(((r0) t0Var).G0(), e10);
        }
        if (e10 == null || AbstractC4862t.a(e10, t0Var)) {
            return t0Var;
        }
        if (t0Var instanceof M) {
            return new P((M) t0Var, e10);
        }
        if (t0Var instanceof AbstractC0741y) {
            return new A((AbstractC0741y) t0Var, e10);
        }
        throw new C4032o();
    }
}
