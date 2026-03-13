package K7;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class A {
    public static boolean a(Iterable iterable, J7.o oVar) {
        return B.b(iterable.iterator(), oVar);
    }

    public static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : D.i(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return B.m(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return B.k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return f(list);
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(D.a(iterable));
            }
        }
        return B.l(iterable.iterator(), obj);
    }

    public static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return B.n(iterable.iterator());
    }

    public static boolean h(Iterable iterable, J7.o oVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (J7.o) J7.n.j(oVar)) : B.r(iterable.iterator(), oVar);
    }

    public static boolean i(List list, J7.o oVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!oVar.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        j(list, oVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, oVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    public static void j(List list, J7.o oVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (oVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }
}
