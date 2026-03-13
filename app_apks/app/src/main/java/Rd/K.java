package Rd;

import Wd.AbstractC2327g;
import fc.C4022e;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class K {
    public static final void a(InterfaceC4992i interfaceC4992i, Throwable th) {
        if (th instanceof Y) {
            th = ((Y) th).getCause();
        }
        try {
            J j10 = (J) interfaceC4992i.get(J.f15138L);
            if (j10 != null) {
                j10.handleException(interfaceC4992i, th);
            } else {
                AbstractC2327g.a(interfaceC4992i, th);
            }
        } catch (Throwable th2) {
            AbstractC2327g.a(interfaceC4992i, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C4022e.a(runtimeException, th);
        return runtimeException;
    }
}
