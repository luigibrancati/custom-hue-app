package L;

import E.AbstractC0807p0;
import E.InterfaceC0815u;
import E.InterfaceC0823y;
import P.f;
import android.graphics.Rect;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface I extends InterfaceC0815u {
    Set a();

    Set b();

    String d();

    Rect e();

    List g(int i10);

    Object h();

    default boolean j(H.b bVar, E.F0 f02) {
        for (G.b bVar2 : bVar.a()) {
            if (!bVar2.d(this, f02)) {
                AbstractC0807p0.a("CameraInfoInternal", bVar2 + " is not supported.");
                return false;
            }
        }
        try {
            m1.c(this, f02, false, bVar);
            return true;
        } catch (f.a | IllegalArgumentException e10) {
            AbstractC0807p0.b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e10);
            return false;
        }
    }

    X0 k();

    List l(int i10);

    Set m();

    default void r(InterfaceC0823y interfaceC0823y) {
        m1.b(interfaceC0823y);
    }

    default I getImplementation() {
        return this;
    }
}
