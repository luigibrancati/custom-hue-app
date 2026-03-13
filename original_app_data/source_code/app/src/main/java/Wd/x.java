package Wd;

import fc.C4022e;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x {
    public static final void a(vc.l lVar, Object obj, InterfaceC4992i interfaceC4992i) {
        T tB = b(lVar, obj, null);
        if (tB != null) {
            Rd.K.a(interfaceC4992i, tB);
        }
    }

    public static final T b(vc.l lVar, Object obj, T t10) {
        try {
            lVar.invoke(obj);
            return t10;
        } catch (Throwable th) {
            if (t10 != null && t10.getCause() != th) {
                C4022e.a(t10, th);
                return t10;
            }
            return new T("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ T c(vc.l lVar, Object obj, T t10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            t10 = null;
        }
        return b(lVar, obj, t10);
    }
}
