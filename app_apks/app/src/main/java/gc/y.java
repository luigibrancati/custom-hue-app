package gc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class y extends x {
    public static boolean B(Collection collection, Nd.h elements) {
        AbstractC4862t.e(collection, "<this>");
        AbstractC4862t.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean C(Collection collection, Iterable elements) {
        AbstractC4862t.e(collection, "<this>");
        AbstractC4862t.e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean D(Collection collection, Object[] elements) {
        AbstractC4862t.e(collection, "<this>");
        AbstractC4862t.e(elements, "elements");
        return collection.addAll(C4202o.h(elements));
    }

    public static final Collection E(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : C4179C.V0(iterable);
    }

    public static final boolean F(Iterable iterable, vc.l lVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static final boolean G(List list, vc.l lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            AbstractC4862t.c(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return F(kotlin.jvm.internal.T.b(list), lVar, z10);
        }
        int iM = C4206t.m(list);
        if (iM >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) lVar.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iM) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iM2 = C4206t.m(list);
        if (i10 > iM2) {
            return true;
        }
        while (true) {
            list.remove(iM2);
            if (iM2 == i10) {
                return true;
            }
            iM2--;
        }
    }

    public static boolean H(Iterable iterable, vc.l predicate) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return F(iterable, predicate, true);
    }

    public static boolean I(List list, vc.l predicate) {
        AbstractC4862t.e(list, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return G(list, predicate, true);
    }

    public static Object J(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object K(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(C4206t.m(list));
    }

    public static Object L(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C4206t.m(list));
    }

    public static boolean M(Iterable iterable, vc.l predicate) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return F(iterable, predicate, false);
    }

    public static final boolean N(Collection collection, Iterable elements) {
        AbstractC4862t.e(collection, "<this>");
        AbstractC4862t.e(elements, "elements");
        return collection.retainAll(E(elements));
    }
}
