package gc;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class V extends U {
    public static Set i(Set set, Iterable elements) {
        AbstractC4862t.e(set, "<this>");
        AbstractC4862t.e(elements, "elements");
        Collection<?> collectionE = y.E(elements);
        if (collectionE.isEmpty()) {
            return C4179C.Z0(set);
        }
        if (!(collectionE instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionE);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionE).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set j(Set set, Object obj) {
        AbstractC4862t.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(P.e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC4862t.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set k(Set set, Iterable elements) {
        int size;
        AbstractC4862t.e(set, "<this>");
        AbstractC4862t.e(elements, "elements");
        Integer numW = C4207u.w(elements);
        if (numW != null) {
            size = set.size() + numW.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(P.e(size));
        linkedHashSet.addAll(set);
        y.C(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set l(Set set, Object obj) {
        AbstractC4862t.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(P.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
