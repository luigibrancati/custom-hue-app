package T;

import E.InterfaceC0787f0;
import L.AbstractC1135z;
import L.EnumC1121s;
import L.EnumC1125u;
import L.EnumC1129w;
import L.InterfaceC1133y;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    public e(int i10, c cVar) {
        super(i10, cVar);
    }

    public void d(androidx.camera.core.d dVar) {
        if (e(dVar.L0())) {
            super.b(dVar);
        } else {
            this.f15876d.a(dVar);
        }
    }

    public final boolean e(InterfaceC0787f0 interfaceC0787f0) {
        InterfaceC1133y interfaceC1133yA = AbstractC1135z.a(interfaceC0787f0);
        if (interfaceC1133yA == null) {
            return false;
        }
        return (interfaceC1133yA.g() == EnumC1125u.LOCKED_FOCUSED || interfaceC1133yA.g() == EnumC1125u.PASSIVE_FOCUSED) && interfaceC1133yA.j() == EnumC1121s.CONVERGED && interfaceC1133yA.h() == EnumC1129w.CONVERGED;
    }
}
