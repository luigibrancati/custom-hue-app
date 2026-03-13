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
public final class x extends z {
    public x(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // qd.g
    public E a(G module) {
        AbstractC4862t.e(module, "module");
        InterfaceC1177e interfaceC1177eA = AbstractC1195x.a(module, j.a.f5748B0);
        M mP = interfaceC1177eA != null ? interfaceC1177eA.p() : null;
        return mP == null ? Ed.k.d(Ed.j.NOT_FOUND_UNSIGNED_TYPE, "ULong") : mP;
    }

    @Override // qd.g
    public String toString() {
        return ((Number) b()).longValue() + ".toULong()";
    }
}
