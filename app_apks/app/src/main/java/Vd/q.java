package Vd;

import Ud.InterfaceC2313e;
import lc.C4993j;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface q extends InterfaceC2313e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static /* synthetic */ InterfaceC2313e a(q qVar, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                interfaceC4992i = C4993j.f40088a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = Td.a.SUSPEND;
            }
            return qVar.a(interfaceC4992i, i10, aVar);
        }
    }

    InterfaceC2313e a(InterfaceC4992i interfaceC4992i, int i10, Td.a aVar);
}
