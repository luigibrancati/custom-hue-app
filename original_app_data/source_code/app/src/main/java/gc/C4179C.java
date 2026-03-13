package gc;

import fc.AbstractC4040w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: gc.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4179C extends C4177A {

    /* JADX INFO: renamed from: gc.C$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Nd.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f35577a;

        public a(Iterable iterable) {
            this.f35577a = iterable;
        }

        @Override // Nd.h
        public Iterator iterator() {
            return this.f35577a.iterator();
        }
    }

    public static List A0(Iterable iterable, Iterable elements) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(elements, "elements");
        if (iterable instanceof Collection) {
            return C0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        y.C(arrayList, iterable);
        y.C(arrayList, elements);
        return arrayList;
    }

    public static List B0(Iterable iterable, Object obj) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return D0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        y.C(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List C0(Collection collection, Iterable elements) {
        AbstractC4862t.e(collection, "<this>");
        AbstractC4862t.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            y.C(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List D0(Collection collection, Object obj) {
        AbstractC4862t.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object E0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof List) {
            return F0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object F0(List list) {
        AbstractC4862t.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object G0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object H0(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List I0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listW0 = W0(iterable);
            x.z(listW0);
            return listW0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return V0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C4202o.E((Comparable[]) array);
        return C4202o.h(array);
    }

    public static List J0(Iterable iterable, Comparator comparator) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listW0 = W0(iterable);
            x.A(listW0, comparator);
            return listW0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return V0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C4202o.F(array, comparator);
        return C4202o.h(array);
    }

    public static int K0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static long L0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public static List M0(Iterable iterable, int i10) {
        AbstractC4862t.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C4206t.k();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return V0(iterable);
            }
            if (i10 == 1) {
                return C4205s.d(g0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return C4206t.r(arrayList);
    }

    public static List N0(List list, int i10) {
        AbstractC4862t.e(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C4206t.k();
        }
        int size = list.size();
        if (i10 >= size) {
            return V0(list);
        }
        if (i10 == 1) {
            return C4205s.d(s0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] O0(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    public static byte[] P0(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static Collection Q0(Iterable iterable, Collection destination) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static double[] R0(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = ((Number) it.next()).doubleValue();
            i10++;
        }
        return dArr;
    }

    public static float[] S0(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static HashSet T0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return (HashSet) Q0(iterable, new HashSet(P.e(C4207u.v(iterable, 12))));
    }

    public static int[] U0(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List V0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C4206t.r(W0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C4206t.k();
        }
        if (size != 1) {
            return X0(collection);
        }
        return C4205s.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static boolean W(Iterable iterable, vc.l predicate) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final List W0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return iterable instanceof Collection ? X0((Collection) iterable) : (List) Q0(iterable, new ArrayList());
    }

    public static Nd.h X(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return new a(iterable);
    }

    public static List X0(Collection collection) {
        AbstractC4862t.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static boolean Y(Iterable iterable, Object obj) {
        AbstractC4862t.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : l0(iterable, obj) >= 0;
    }

    public static Set Y0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) Q0(iterable, new LinkedHashSet());
    }

    public static int Z(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                C4206t.t();
            }
        }
        return i10;
    }

    public static Set Z0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return U.g((Set) Q0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return U.d();
        }
        if (size != 1) {
            return (Set) Q0(iterable, new LinkedHashSet(P.e(collection.size())));
        }
        return T.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List a0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return V0(Y0(iterable));
    }

    public static Set a1(Iterable iterable, Iterable other) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(other, "other");
        Set setY0 = Y0(iterable);
        y.C(setY0, other);
        return setY0;
    }

    public static List b0(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC4862t.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return V0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return C4206t.k();
            }
            if (size == 1) {
                return C4205s.d(r0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return C4206t.r(arrayList);
    }

    public static Iterable b1(final Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return new C4187K(new InterfaceC6082a() { // from class: gc.B
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return C4179C.c1(iterable);
            }
        });
    }

    public static List c0(List list, int i10) {
        AbstractC4862t.e(list, "<this>");
        if (i10 >= 0) {
            return M0(list, Bc.k.e(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final Iterator c1(Iterable iterable) {
        return iterable.iterator();
    }

    public static List d0(Iterable iterable, vc.l predicate) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List d1(Iterable iterable, Iterable other) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C4207u.v(iterable, 10), C4207u.v(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(AbstractC4040w.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static List e0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        return (List) f0(iterable, new ArrayList());
    }

    public static final Collection f0(Iterable iterable, Collection destination) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object g0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof List) {
            return h0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object h0(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object i0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object j0(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object k0(List list, int i10) {
        AbstractC4862t.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final int l0(Iterable iterable, Object obj) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                C4206t.u();
            }
            if (AbstractC4862t.a(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Set m0(Iterable iterable, Iterable other) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(other, "other");
        Set setY0 = Y0(iterable);
        y.N(setY0, other);
        return setY0;
    }

    public static final Appendable n0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) throws IOException {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(buffer, "buffer");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            Od.r.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String p0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, vc.l lVar) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(separator, "separator");
        AbstractC4862t.e(prefix, "prefix");
        AbstractC4862t.e(postfix, "postfix");
        AbstractC4862t.e(truncated, "truncated");
        return ((StringBuilder) n0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String q0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, vc.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        vc.l lVar2 = lVar;
        return p0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static Object r0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof List) {
            return s0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object s0(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C4206t.m(list));
    }

    public static Object t0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object u0(List list) {
        AbstractC4862t.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List v0(Iterable iterable, vc.l transform) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(transform, "transform");
        ArrayList arrayList = new ArrayList(C4207u.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static Double w0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static Comparable x0(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List y0(Iterable iterable, Iterable elements) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(elements, "elements");
        Collection collectionE = y.E(elements);
        if (collectionE.isEmpty()) {
            return V0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionE.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List z0(Iterable iterable, Object obj) {
        AbstractC4862t.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C4207u.v(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && AbstractC4862t.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
