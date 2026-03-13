package k1;

import java.util.Arrays;
import k1.AbstractC4785h;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: k1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4786i {
    public static final AbstractC4785h a() {
        return new C4781d(null, true, 1, null);
    }

    public static final C4781d b(AbstractC4785h.b... pairs) {
        AbstractC4862t.e(pairs, "pairs");
        C4781d c4781d = new C4781d(null, false, 1, null);
        c4781d.j((AbstractC4785h.b[]) Arrays.copyOf(pairs, pairs.length));
        return c4781d;
    }
}
