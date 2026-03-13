package Cd;

import Lc.InterfaceC1185m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface Z {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static /* synthetic */ a0 a(Z z10, Mc.g gVar, e0 e0Var, InterfaceC1185m interfaceC1185m, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                e0Var = null;
            }
            if ((i10 & 4) != 0) {
                interfaceC1185m = null;
            }
            return z10.a(gVar, e0Var, interfaceC1185m);
        }
    }

    a0 a(Mc.g gVar, e0 e0Var, InterfaceC1185m interfaceC1185m);
}
