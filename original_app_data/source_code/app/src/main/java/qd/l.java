package qd;

import Cd.M;
import Lc.G;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends g {
    public l(float f10) {
        super(Float.valueOf(f10));
    }

    @Override // qd.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        AbstractC4862t.e(module, "module");
        M mB = module.n().B();
        AbstractC4862t.d(mB, "module.builtIns.floatType");
        return mB;
    }

    @Override // qd.g
    public String toString() {
        return ((Number) b()).floatValue() + ".toFloat()";
    }
}
