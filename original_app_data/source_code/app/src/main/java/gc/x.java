package gc;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class x extends w {
    public static void A(List list, Comparator comparator) {
        AbstractC4862t.e(list, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void z(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
