package Rd;

import lc.InterfaceC4988e;

/* JADX INFO: renamed from: Rd.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2138l extends InterfaceC4988e {

    /* JADX INFO: renamed from: Rd.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC2138l interfaceC2138l, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC2138l.l(th);
        }
    }

    void A(Object obj);

    void b(vc.l lVar);

    void e(I i10, Object obj);

    boolean l(Throwable th);

    Object v(Object obj, Object obj2, vc.q qVar);

    void y(Object obj, vc.q qVar);
}
