package qd;

import Cd.E;
import Cd.M;
import Ic.j;
import Lc.AbstractC1195x;
import Lc.G;
import Lc.InterfaceC1177e;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends z {
    public v(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // qd.g
    public E a(G module) {
        AbstractC4862t.e(module, "module");
        InterfaceC1177e interfaceC1177eA = AbstractC1195x.a(module, j.a.f5830y0);
        M mP = interfaceC1177eA != null ? interfaceC1177eA.p() : null;
        return mP == null ? Ed.k.d(Ed.j.NOT_FOUND_UNSIGNED_TYPE, "UByte") : mP;
    }

    @Override // qd.g
    public String toString() {
        return ((Number) b()).intValue() + ".toUByte()";
    }
}
