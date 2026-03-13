package Cd;

import fc.C4032o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class B {
    public static final AbstractC0741y a(E e10) {
        AbstractC4862t.e(e10, "<this>");
        t0 t0VarQ0 = e10.Q0();
        AbstractC4862t.c(t0VarQ0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (AbstractC0741y) t0VarQ0;
    }

    public static final boolean b(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return e10.Q0() instanceof AbstractC0741y;
    }

    public static final M c(E e10) {
        AbstractC4862t.e(e10, "<this>");
        t0 t0VarQ0 = e10.Q0();
        if (t0VarQ0 instanceof AbstractC0741y) {
            return ((AbstractC0741y) t0VarQ0).V0();
        }
        if (t0VarQ0 instanceof M) {
            return (M) t0VarQ0;
        }
        throw new C4032o();
    }

    public static final M d(E e10) {
        AbstractC4862t.e(e10, "<this>");
        t0 t0VarQ0 = e10.Q0();
        if (t0VarQ0 instanceof AbstractC0741y) {
            return ((AbstractC0741y) t0VarQ0).W0();
        }
        if (t0VarQ0 instanceof M) {
            return (M) t0VarQ0;
        }
        throw new C4032o();
    }
}
