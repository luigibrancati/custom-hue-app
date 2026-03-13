package Lc;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface G extends InterfaceC1185m {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static Object a(G g10, InterfaceC1187o visitor, Object obj) {
            AbstractC4862t.e(visitor, "visitor");
            return visitor.k(g10, obj);
        }

        public static InterfaceC1185m b(G g10) {
            return null;
        }
    }

    Object Y(F f10);

    Ic.g n();

    Collection t(kd.c cVar, vc.l lVar);

    List w0();

    boolean y(G g10);

    P z0(kd.c cVar);
}
