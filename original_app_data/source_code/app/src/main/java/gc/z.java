package gc;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class z extends y {
    public static List R(List list) {
        AbstractC4862t.e(list, "<this>");
        return new S(list);
    }

    public static final int S(List list, int i10) {
        if (i10 >= 0 && i10 <= C4206t.m(list)) {
            return C4206t.m(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new Bc.f(0, C4206t.m(list)) + "].");
    }

    public static final int T(List list, int i10) {
        return C4206t.m(list) - i10;
    }

    public static final int U(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new Bc.f(0, list.size()) + "].");
    }
}
