package Rd;

import fc.AbstractC4036s;
import fc.C4035r;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C {
    public static final Object a(Object obj, InterfaceC4988e interfaceC4988e) {
        if (!(obj instanceof A)) {
            return C4035r.b(obj);
        }
        C4035r.a aVar = C4035r.f34274b;
        return C4035r.b(AbstractC4036s.a(((A) obj).f15106a));
    }

    public static final Object b(Object obj) {
        Throwable thE = C4035r.e(obj);
        return thE == null ? obj : new A(thE, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC2138l interfaceC2138l) {
        Throwable thE = C4035r.e(obj);
        return thE == null ? obj : new A(thE, false, 2, null);
    }
}
