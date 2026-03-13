package Rd;

import fc.C4015H;
import fc.C4032o;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class X {
    public static final Object a(long j10, InterfaceC4988e interfaceC4988e) {
        if (j10 <= 0) {
            return C4015H.f34254a;
        }
        C2142n c2142n = new C2142n(C5045b.c(interfaceC4988e), 1);
        c2142n.E();
        if (j10 < Long.MAX_VALUE) {
            b(c2142n.getContext()).G(j10, c2142n);
        }
        Object objW = c2142n.w();
        if (objW == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objW == C5046c.f() ? objW : C4015H.f34254a;
    }

    public static final W b(InterfaceC4992i interfaceC4992i) {
        InterfaceC4992i.b bVar = interfaceC4992i.get(InterfaceC4989f.f40086j0);
        W w10 = bVar instanceof W ? (W) bVar : null;
        return w10 == null ? T.a() : w10;
    }

    public static final long c(long j10) {
        boolean zP = Pd.a.P(j10);
        if (zP) {
            return Pd.a.B(Pd.a.Q(j10, Pd.c.t(999999L, Pd.d.NANOSECONDS)));
        }
        if (zP) {
            throw new C4032o();
        }
        return 0L;
    }
}
