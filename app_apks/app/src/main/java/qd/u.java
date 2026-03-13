package qd;

import Cd.M;
import Lc.G;
import com.fasterxml.jackson.core.JsonFactory;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String value) {
        super(value);
        AbstractC4862t.e(value, "value");
    }

    @Override // qd.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        AbstractC4862t.e(module, "module");
        M mW = module.n().W();
        AbstractC4862t.d(mW, "module.builtIns.stringType");
        return mW;
    }

    @Override // qd.g
    public String toString() {
        return JsonFactory.DEFAULT_QUOTE_CHAR + ((String) b()) + JsonFactory.DEFAULT_QUOTE_CHAR;
    }
}
