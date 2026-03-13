package K7;

import K7.AbstractC1070j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f7619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f7620b;

        /* JADX INFO: renamed from: K7.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class C0118a extends AbstractC1062b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Iterator f7621c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator f7622d;

            public C0118a() {
                this.f7621c = a.this.f7619a.iterator();
                this.f7622d = a.this.f7620b.iterator();
            }

            @Override // K7.AbstractC1062b
            public Object a() {
                if (this.f7621c.hasNext()) {
                    return this.f7621c.next();
                }
                while (this.f7622d.hasNext()) {
                    Object next = this.f7622d.next();
                    if (!a.this.f7619a.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f7619a = set;
            this.f7620b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Y iterator() {
            return new C0118a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7619a.contains(obj) || this.f7620b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f7619a.isEmpty() && this.f7620b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f7619a.size();
            Iterator it = this.f7620b.iterator();
            while (it.hasNext()) {
                if (!this.f7619a.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set f7624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f7625b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends AbstractC1062b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Iterator f7626c;

            public a() {
                this.f7626c = b.this.f7624a.iterator();
            }

            @Override // K7.AbstractC1062b
            public Object a() {
                while (this.f7626c.hasNext()) {
                    Object next = this.f7626c.next();
                    if (b.this.f7625b.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set set, Set set2) {
            super(null);
            this.f7624a = set;
            this.f7625b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: c */
        public Y iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7624a.contains(obj) && this.f7625b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.f7624a.containsAll(collection) && this.f7625b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f7625b, this.f7624a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it = this.f7624a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f7625b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends AbstractC1070j.a implements Set {
        public c(Set set, J7.o oVar) {
            super(set, oVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return U.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return U.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends c implements SortedSet {
        public d(SortedSet sortedSet, J7.o oVar) {
            super(sortedSet, oVar);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.f7677a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return B.j(this.f7677a.iterator(), this.f7678b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new d(((SortedSet) this.f7677a).headSet(obj), this.f7678b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f7677a;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.f7678b.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new d(((SortedSet) this.f7677a).subSet(obj, obj2), this.f7678b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new d(((SortedSet) this.f7677a).tailSet(obj), this.f7678b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class e extends AbstractSet {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return U.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) J7.n.j(collection));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f extends AbstractSet {
        public /* synthetic */ f(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: c */
        public abstract Y iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public f() {
        }
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b(Set set, J7.o oVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, oVar);
        }
        if (!(set instanceof c)) {
            return new c((Set) J7.n.j(set), (J7.o) J7.n.j(oVar));
        }
        c cVar = (c) set;
        return new c((Set) cVar.f7677a, J7.p.b(cVar.f7678b, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, J7.o oVar) {
        if (!(sortedSet instanceof c)) {
            return new d((SortedSet) J7.n.j(sortedSet), (J7.o) J7.n.j(oVar));
        }
        c cVar = (c) sortedSet;
        return new d((SortedSet) cVar.f7677a, J7.p.b(cVar.f7678b, oVar));
    }

    public static int d(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static f e(Set set, Set set2) {
        J7.n.k(set, "set1");
        J7.n.k(set2, "set2");
        return new b(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i10) {
        return new HashSet(F.a(i10));
    }

    public static Set h() {
        return Collections.newSetFromMap(F.g());
    }

    public static boolean i(Set set, Collection collection) {
        J7.n.j(collection);
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : B.q(set.iterator(), collection);
    }

    public static boolean j(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static f k(Set set, Set set2) {
        J7.n.k(set, "set1");
        J7.n.k(set2, "set2");
        return new a(set, set2);
    }
}
