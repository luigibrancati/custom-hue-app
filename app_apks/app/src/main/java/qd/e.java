package qd;

import Cd.M;
import Lc.G;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends o {
    public e(char c10) {
        super(Character.valueOf(c10));
    }

    public final String c(char c10) {
        return c10 == '\b' ? "\\b" : c10 == '\t' ? "\\t" : c10 == '\n' ? "\\n" : c10 == '\f' ? "\\f" : c10 == '\r' ? "\\r" : e(c10) ? String.valueOf(c10) : "?";
    }

    @Override // qd.g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public M a(G module) {
        AbstractC4862t.e(module, "module");
        M mU = module.n().u();
        AbstractC4862t.d(mU, "module.builtIns.charType");
        return mU;
    }

    public final boolean e(char c10) {
        byte type = (byte) Character.getType(c10);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // qd.g
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) b()).charValue()), c(((Character) b()).charValue())}, 2));
        AbstractC4862t.d(str, "format(this, *args)");
        return str;
    }
}
