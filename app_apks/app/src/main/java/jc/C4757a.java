package jc;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: renamed from: jc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4757a {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int b(Object obj, Object obj2, l... selectors) {
        AbstractC4862t.e(selectors, "selectors");
        if (selectors.length > 0) {
            return c(obj, obj2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int c(Object obj, Object obj2, l[] lVarArr) {
        for (l lVar : lVarArr) {
            int iA = a((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    public static Comparator d() {
        C4758b c4758b = C4758b.f39151a;
        AbstractC4862t.c(c4758b, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c4758b;
    }
}
