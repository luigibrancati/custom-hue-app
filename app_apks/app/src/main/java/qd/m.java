package qd;

import Cd.M;
import Lc.G;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends o {
    public m(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // qd.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        AbstractC4862t.e(module, "module");
        M mD = module.n().D();
        AbstractC4862t.d(mD, "module.builtIns.intType");
        return mD;
    }
}
