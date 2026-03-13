package Rd;

import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a1 {
    public static final Y0 a(long j10, W w10, InterfaceC2166z0 interfaceC2166z0) {
        return new Y0("Timed out waiting for " + j10 + " ms", interfaceC2166z0);
    }

    public static final Object b(Z0 z02, vc.p pVar) {
        C0.i(z02, X.b(z02.f17895d.getContext()).H(z02.f15158e, z02, z02.getContext()));
        return Xd.b.e(z02, z02, pVar);
    }

    public static final Object c(long j10, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        if (j10 <= 0) {
            throw new Y0("Timed out immediately");
        }
        Object objB = b(new Z0(j10, interfaceC4988e), pVar);
        if (objB == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objB;
    }

    public static final Object d(long j10, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        return c(X.c(j10), pVar, interfaceC4988e);
    }
}
