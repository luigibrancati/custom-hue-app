package qd;

import Cd.M;
import Lc.G;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends o {
    public q(long j10) {
        super(Long.valueOf(j10));
    }

    @Override // qd.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        AbstractC4862t.e(module, "module");
        M mF = module.n().F();
        AbstractC4862t.d(mF, "module.builtIns.longType");
        return mF;
    }

    @Override // qd.g
    public String toString() {
        return ((Number) b()).longValue() + ".toLong()";
    }
}
