package Rd;

import fc.C4035r;

/* JADX INFO: renamed from: Rd.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2161x {
    public static final InterfaceC2157v a(InterfaceC2166z0 interfaceC2166z0) {
        return new C2159w(interfaceC2166z0);
    }

    public static /* synthetic */ InterfaceC2157v b(InterfaceC2166z0 interfaceC2166z0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2166z0 = null;
        }
        return a(interfaceC2166z0);
    }

    public static final boolean c(InterfaceC2157v interfaceC2157v, Object obj) {
        Throwable thE = C4035r.e(obj);
        return thE == null ? interfaceC2157v.C(obj) : interfaceC2157v.q(thE);
    }
}
