package gc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4206t extends C4205s {
    public static ArrayList f(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(g(elements, true));
    }

    public static final Collection g(Object[] objArr, boolean z10) {
        AbstractC4862t.e(objArr, "<this>");
        return new C4198k(objArr, z10);
    }

    public static /* synthetic */ Collection h(Object[] objArr, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return g(objArr, z10);
    }

    public static final int i(List list, Comparable comparable, int i10, int i11) {
        AbstractC4862t.e(list, "<this>");
        s(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iA = C4757a.a((Comparable) list.get(i13), comparable);
            if (iA < 0) {
                i10 = i13 + 1;
            } else {
                if (iA <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int j(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return i(list, comparable, i10, i11);
    }

    public static List k() {
        return C4181E.f35579a;
    }

    public static Bc.f l(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        return new Bc.f(0, collection.size() - 1);
    }

    public static int m(List list) {
        AbstractC4862t.e(list, "<this>");
        return list.size() - 1;
    }

    public static List n(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return elements.length > 0 ? C4202o.h(elements) : k();
    }

    public static List o(Object obj) {
        return obj != null ? C4205s.d(obj) : k();
    }

    public static List p(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return C4204q.S(elements);
    }

    public static List q(Object... elements) {
        AbstractC4862t.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(g(elements, true));
    }

    public static final List r(List list) {
        AbstractC4862t.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C4205s.d(list.get(0)) : k();
    }

    public static final void s(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void t() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void u() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
