package gc;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class U extends T {
    public static Set d() {
        return C4183G.f35581a;
    }

    public static LinkedHashSet e(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return (LinkedHashSet) C4204q.H0(elements, new LinkedHashSet(P.e(elements.length)));
    }

    public static Set f(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return (Set) C4204q.H0(elements, new LinkedHashSet(P.e(elements.length)));
    }

    public static final Set g(Set set) {
        AbstractC4862t.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : T.c(set.iterator().next()) : d();
    }

    public static Set h(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return C4204q.b1(elements);
    }
}
