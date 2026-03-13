package vd;

import Lc.InterfaceC1180h;
import java.util.Collection;

/* JADX INFO: renamed from: vd.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC6102k {

    /* JADX INFO: renamed from: vd.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public static /* synthetic */ Collection a(InterfaceC6102k interfaceC6102k, C6095d c6095d, vc.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                c6095d = C6095d.f45986o;
            }
            if ((i10 & 2) != 0) {
                lVar = InterfaceC6099h.f46011a.a();
            }
            return interfaceC6102k.f(c6095d, lVar);
        }
    }

    InterfaceC1180h e(kd.f fVar, Tc.b bVar);

    Collection f(C6095d c6095d, vc.l lVar);
}
