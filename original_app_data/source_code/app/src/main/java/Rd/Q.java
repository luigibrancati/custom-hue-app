package Rd;

import Wd.C2329i;
import fc.AbstractC4036s;
import fc.C4035r;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Q {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(InterfaceC4988e interfaceC4988e) {
        Object objB;
        if (interfaceC4988e instanceof C2329i) {
            return ((C2329i) interfaceC4988e).toString();
        }
        try {
            C4035r.a aVar = C4035r.f34274b;
            objB = C4035r.b(interfaceC4988e + '@' + b(interfaceC4988e));
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            objB = C4035r.b(AbstractC4036s.a(th));
        }
        if (C4035r.e(objB) != null) {
            objB = interfaceC4988e.getClass().getName() + '@' + b(interfaceC4988e);
        }
        return (String) objB;
    }
}
