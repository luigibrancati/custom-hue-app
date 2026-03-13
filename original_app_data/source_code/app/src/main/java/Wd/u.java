package Wd;

import Rd.J0;
import fc.C4025h;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    public static final v a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        d();
        throw new C4025h();
    }

    public static /* synthetic */ v b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(J0 j02) {
        return j02.J0() instanceof v;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final J0 e(InterfaceC2338s interfaceC2338s, List list) {
        try {
            return interfaceC2338s.b(list);
        } catch (Throwable th) {
            return a(th, interfaceC2338s.a());
        }
    }
}
