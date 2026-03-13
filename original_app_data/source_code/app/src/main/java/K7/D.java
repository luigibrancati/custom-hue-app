package K7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractList implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J7.f f7577b;

        /* JADX INFO: renamed from: K7.D$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0115a extends X {
            public C0115a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // K7.W
            public Object a(Object obj) {
                return a.this.f7577b.apply(obj);
            }
        }

        public a(List list, J7.f fVar) {
            this.f7576a = (List) J7.n.j(list);
            this.f7577b = (J7.f) J7.n.j(fVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f7577b.apply(this.f7576a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f7576a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new C0115a(this.f7576a.listIterator(i10));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i10) {
            return this.f7577b.apply(this.f7576a.remove(i10));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i10, int i11) {
            this.f7576a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7576a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractSequentialList implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J7.f f7580b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends X {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // K7.W
            public Object a(Object obj) {
                return b.this.f7580b.apply(obj);
            }
        }

        public b(List list, J7.f fVar) {
            this.f7579a = (List) J7.n.j(list);
            this.f7580b = (J7.f) J7.n.j(fVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f7579a.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this.f7579a.listIterator(i10));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i10, int i11) {
            this.f7579a.subList(i10, i11).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7579a.size();
        }
    }

    public static List a(Iterable iterable) {
        return (List) iterable;
    }

    public static int b(int i10) {
        AbstractC1069i.b(i10, "arraySize");
        return N7.g.n(((long) i10) + 5 + ((long) (i10 / 10)));
    }

    public static boolean c(List list, Object obj) {
        if (obj == J7.n.j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return B.e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!J7.j.a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (J7.j.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int e(List list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (J7.j.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static ArrayList h() {
        return new ArrayList();
    }

    public static ArrayList i(Iterator it) {
        ArrayList arrayListH = h();
        B.a(arrayListH, it);
        return arrayListH;
    }

    public static ArrayList j(Object... objArr) {
        J7.n.j(objArr);
        ArrayList arrayList = new ArrayList(b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List k(List list, J7.f fVar) {
        return list instanceof RandomAccess ? new a(list, fVar) : new b(list, fVar);
    }
}
