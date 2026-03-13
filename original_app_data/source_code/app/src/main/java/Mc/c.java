package Mc;

import Cd.E;
import Lc.InterfaceC1177e;
import Lc.a0;
import java.util.Map;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static kd.c a(c cVar) {
            InterfaceC1177e interfaceC1177eI = AbstractC5823c.i(cVar);
            if (interfaceC1177eI != null) {
                if (Ed.k.m(interfaceC1177eI)) {
                    interfaceC1177eI = null;
                }
                if (interfaceC1177eI != null) {
                    return AbstractC5823c.h(interfaceC1177eI);
                }
            }
            return null;
        }
    }

    Map a();

    kd.c e();

    E getType();

    a0 j();
}
