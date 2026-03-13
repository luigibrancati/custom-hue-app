package Cd;

import gc.C4179C;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import nd.AbstractC5164c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class M extends t0 implements Gd.k, Gd.l {
    public M() {
        super(null);
    }

    public abstract M U0(boolean z10);

    public abstract M V0(a0 a0Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            Od.z.q(sb2, "[", AbstractC5164c.s(AbstractC5164c.f40786j, (Mc.c) it.next(), null, 2, null), "] ");
        }
        sb2.append(N0());
        if (!L0().isEmpty()) {
            C4179C.n0(L0(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "<", (124 & 8) == 0 ? ">" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        if (O0()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
