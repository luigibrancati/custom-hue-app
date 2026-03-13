package Rd;

import Wd.C2325e;
import java.util.concurrent.CancellationException;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class N {
    public static final M a(InterfaceC4992i interfaceC4992i) {
        if (interfaceC4992i.get(InterfaceC2166z0.f15218M) == null) {
            interfaceC4992i = interfaceC4992i.plus(D0.b(null, 1, null));
        }
        return new C2325e(interfaceC4992i);
    }

    public static final void b(M m10, CancellationException cancellationException) {
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) m10.getCoroutineContext().get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 != null) {
            interfaceC2166z0.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + m10).toString());
    }

    public static /* synthetic */ void c(M m10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        b(m10, cancellationException);
    }

    public static final Object d(vc.p pVar, InterfaceC4988e interfaceC4988e) {
        Wd.A a10 = new Wd.A(interfaceC4988e.getContext(), interfaceC4988e);
        Object objD = Xd.b.d(a10, a10, pVar);
        if (objD == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objD;
    }

    public static final void e(M m10) {
        C0.k(m10.getCoroutineContext());
    }

    public static final boolean f(M m10) {
        InterfaceC2166z0 interfaceC2166z0 = (InterfaceC2166z0) m10.getCoroutineContext().get(InterfaceC2166z0.f15218M);
        if (interfaceC2166z0 != null) {
            return interfaceC2166z0.c();
        }
        return true;
    }
}
