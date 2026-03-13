package Rd;

import Wd.C2329i;
import lc.InterfaceC4988e;

/* JADX INFO: renamed from: Rd.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2146p {
    public static final void a(InterfaceC2138l interfaceC2138l, InterfaceC2127f0 interfaceC2127f0) {
        c(interfaceC2138l, new C2129g0(interfaceC2127f0));
    }

    public static final C2142n b(InterfaceC4988e interfaceC4988e) {
        if (!(interfaceC4988e instanceof C2329i)) {
            return new C2142n(interfaceC4988e, 1);
        }
        C2142n c2142nK = ((C2329i) interfaceC4988e).k();
        if (c2142nK != null) {
            if (!c2142nK.O()) {
                c2142nK = null;
            }
            if (c2142nK != null) {
                return c2142nK;
            }
        }
        return new C2142n(interfaceC4988e, 2);
    }

    public static final void c(InterfaceC2138l interfaceC2138l, InterfaceC2136k interfaceC2136k) {
        if (!(interfaceC2138l instanceof C2142n)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C2142n) interfaceC2138l).H(interfaceC2136k);
    }
}
