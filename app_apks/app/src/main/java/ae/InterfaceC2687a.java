package ae;

import lc.InterfaceC4988e;

/* JADX INFO: renamed from: ae.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2687a {

    /* JADX INFO: renamed from: ae.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0267a {
        public static /* synthetic */ Object a(InterfaceC2687a interfaceC2687a, Object obj, InterfaceC4988e interfaceC4988e, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC2687a.a(obj, interfaceC4988e);
        }

        public static /* synthetic */ boolean b(InterfaceC2687a interfaceC2687a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return interfaceC2687a.f(obj);
        }

        public static /* synthetic */ void c(InterfaceC2687a interfaceC2687a, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            interfaceC2687a.h(obj);
        }
    }

    Object a(Object obj, InterfaceC4988e interfaceC4988e);

    boolean f(Object obj);

    boolean g();

    void h(Object obj);
}
