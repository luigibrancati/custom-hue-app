package K7;

import K7.AbstractC1066f;
import K7.F;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: K7.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1064d extends AbstractC1066f implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient Map f7634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f7635f;

    /* JADX INFO: renamed from: K7.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractC0119d {
        public b() {
            super();
        }

        @Override // K7.AbstractC1064d.AbstractC0119d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry a(Object obj, Object obj2) {
            return F.d(obj, obj2);
        }
    }

    /* JADX INFO: renamed from: K7.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends F.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient Map f7638c;

        /* JADX INFO: renamed from: K7.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends F.c {
            public a() {
            }

            @Override // K7.F.c
            public Map c() {
                return c.this;
            }

            @Override // K7.F.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return AbstractC1070j.c(c.this.f7638c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC1064d.this.w(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: K7.d$c$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f7641a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Collection f7642b;

            public b() {
                this.f7641a = c.this.f7638c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.f7641a.next();
                this.f7642b = (Collection) entry.getValue();
                return c.this.e(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7641a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                J7.n.p(this.f7642b != null, "no calls to next() since the last call to remove()");
                this.f7641a.remove();
                AbstractC1064d.p(AbstractC1064d.this, this.f7642b.size());
                this.f7642b.clear();
                this.f7642b = null;
            }
        }

        public c(Map map) {
            this.f7638c = map;
        }

        @Override // K7.F.f
        public Set a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection get(Object obj) {
            Collection collection = (Collection) F.i(this.f7638c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC1064d.this.y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f7638c == AbstractC1064d.this.f7634e) {
                AbstractC1064d.this.clear();
            } else {
                B.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return F.h(this.f7638c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.f7638c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection collectionR = AbstractC1064d.this.r();
            collectionR.addAll(collection);
            AbstractC1064d.p(AbstractC1064d.this, collection.size());
            collection.clear();
            return collectionR;
        }

        public Map.Entry e(Map.Entry entry) {
            Object key = entry.getKey();
            return F.d(key, AbstractC1064d.this.y(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f7638c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f7638c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set g() {
            return AbstractC1064d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f7638c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f7638c.toString();
        }
    }

    /* JADX INFO: renamed from: K7.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class AbstractC0119d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator f7644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f7645b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection f7646c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f7647d = B.h();

        public AbstractC0119d() {
            this.f7644a = AbstractC1064d.this.f7634e.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7644a.hasNext() || this.f7647d.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f7647d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f7644a.next();
                this.f7645b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f7646c = collection;
                this.f7647d = collection.iterator();
            }
            return a(K.a(this.f7645b), this.f7647d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f7647d.remove();
            Collection collection = this.f7646c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f7644a.remove();
            }
            AbstractC1064d.n(AbstractC1064d.this);
        }
    }

    /* JADX INFO: renamed from: K7.d$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends F.d {

        /* JADX INFO: renamed from: K7.d$e$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Map.Entry f7650a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f7651b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f7652c;

            public a(e eVar, Iterator it) {
                this.f7651b = it;
                this.f7652c = eVar;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7651b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.f7651b.next();
                this.f7650a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                J7.n.p(this.f7650a != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) this.f7650a.getValue();
                this.f7651b.remove();
                AbstractC1064d.p(AbstractC1064d.this, collection.size());
                collection.clear();
                this.f7650a = null;
            }
        }

        public e(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            B.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return c().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(this, c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) c().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractC1064d.p(AbstractC1064d.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: renamed from: K7.d$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class f extends i implements NavigableMap {
        public f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry entryCeilingEntry = h().ceilingEntry(obj);
            if (entryCeilingEntry == null) {
                return null;
            }
            return e(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return h().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return AbstractC1064d.this.new f(h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry entryFirstEntry = h().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return e(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry entryFloorEntry = h().floorEntry(obj);
            if (entryFloorEntry == null) {
                return null;
            }
            return e(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return h().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry entryHigherEntry = h().higherEntry(obj);
            if (entryHigherEntry == null) {
                return null;
            }
            return e(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return h().higherKey(obj);
        }

        @Override // K7.AbstractC1064d.i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet f() {
            return AbstractC1064d.this.new g(h());
        }

        @Override // K7.AbstractC1064d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public Map.Entry k(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionR = AbstractC1064d.this.r();
            collectionR.addAll((Collection) entry.getValue());
            it.remove();
            return F.d(entry.getKey(), AbstractC1064d.this.x(collectionR));
        }

        @Override // K7.AbstractC1064d.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap h() {
            return (NavigableMap) super.h();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry entryLastEntry = h().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return e(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry entryLowerEntry = h().lowerEntry(obj);
            if (entryLowerEntry == null) {
                return null;
            }
            return e(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return h().lowerKey(obj);
        }

        @Override // K7.AbstractC1064d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        @Override // K7.AbstractC1064d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return g();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return k(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return k(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z10) {
            return AbstractC1064d.this.new f(h().headMap(obj, z10));
        }

        @Override // K7.AbstractC1064d.i, K7.AbstractC1064d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC1064d.this.new f(h().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z10) {
            return AbstractC1064d.this.new f(h().tailMap(obj, z10));
        }
    }

    /* JADX INFO: renamed from: K7.d$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class g extends j implements NavigableSet {
        public g(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return d().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return AbstractC1064d.this.new g(d().descendingMap());
        }

        @Override // K7.AbstractC1064d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // K7.AbstractC1064d.j
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return d().floorKey(obj);
        }

        @Override // K7.AbstractC1064d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return d().higherKey(obj);
        }

        @Override // K7.AbstractC1064d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return d().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return B.p(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return B.p(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z10) {
            return AbstractC1064d.this.new g(d().headMap(obj, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
            return AbstractC1064d.this.new g(d().subMap(obj, z10, obj2, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z10) {
            return AbstractC1064d.this.new g(d().tailMap(obj, z10));
        }
    }

    /* JADX INFO: renamed from: K7.d$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h extends l implements RandomAccess {
        public h(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }
    }

    /* JADX INFO: renamed from: K7.d$i */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class i extends c implements SortedMap {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SortedSet f7656e;

        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return h().comparator();
        }

        public SortedSet f() {
            return AbstractC1064d.this.new j(h());
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return h().firstKey();
        }

        @Override // K7.AbstractC1064d.c, java.util.AbstractMap, java.util.Map
        public SortedSet g() {
            SortedSet sortedSet = this.f7656e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet sortedSetF = f();
            this.f7656e = sortedSetF;
            return sortedSetF;
        }

        public SortedMap h() {
            return (SortedMap) this.f7638c;
        }

        public SortedMap headMap(Object obj) {
            return AbstractC1064d.this.new i(h().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return h().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return AbstractC1064d.this.new i(h().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return AbstractC1064d.this.new i(h().tailMap(obj));
        }
    }

    /* JADX INFO: renamed from: K7.d$j */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class j extends e implements SortedSet {
        public j(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return d().comparator();
        }

        public SortedMap d() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return d().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return AbstractC1064d.this.new j(d().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return d().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return AbstractC1064d.this.new j(d().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return AbstractC1064d.this.new j(d().tailMap(obj));
        }
    }

    public AbstractC1064d(Map map) {
        J7.n.d(map.isEmpty());
        this.f7634e = map;
    }

    public static /* synthetic */ int m(AbstractC1064d abstractC1064d) {
        int i10 = abstractC1064d.f7635f;
        abstractC1064d.f7635f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int n(AbstractC1064d abstractC1064d) {
        int i10 = abstractC1064d.f7635f;
        abstractC1064d.f7635f = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int o(AbstractC1064d abstractC1064d, int i10) {
        int i11 = abstractC1064d.f7635f + i10;
        abstractC1064d.f7635f = i11;
        return i11;
    }

    public static /* synthetic */ int p(AbstractC1064d abstractC1064d, int i10) {
        int i11 = abstractC1064d.f7635f - i10;
        abstractC1064d.f7635f = i11;
        return i11;
    }

    public static Iterator v(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // K7.AbstractC1066f, K7.G
    public Collection a() {
        return super.a();
    }

    @Override // K7.G
    public void clear() {
        Iterator it = this.f7634e.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f7634e.clear();
        this.f7635f = 0;
    }

    @Override // K7.AbstractC1066f
    public Collection f() {
        return new AbstractC1066f.a();
    }

    @Override // K7.G
    public Collection get(Object obj) {
        Collection collectionS = (Collection) this.f7634e.get(obj);
        if (collectionS == null) {
            collectionS = s(obj);
        }
        return y(obj, collectionS);
    }

    @Override // K7.AbstractC1066f
    public Collection h() {
        return new AbstractC1066f.b();
    }

    @Override // K7.AbstractC1066f
    public Iterator i() {
        return new b();
    }

    @Override // K7.AbstractC1066f
    public Iterator j() {
        return new a();
    }

    @Override // K7.G
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f7634e.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f7635f++;
            return true;
        }
        Collection collectionS = s(obj);
        if (!collectionS.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f7635f++;
        this.f7634e.put(obj, collectionS);
        return true;
    }

    public abstract Collection r();

    public Collection s(Object obj) {
        return r();
    }

    @Override // K7.G
    public int size() {
        return this.f7635f;
    }

    public final Map t() {
        Map map = this.f7634e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f7634e) : map instanceof SortedMap ? new i((SortedMap) this.f7634e) : new c(this.f7634e);
    }

    public final Set u() {
        Map map = this.f7634e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f7634e) : map instanceof SortedMap ? new j((SortedMap) this.f7634e) : new e(this.f7634e);
    }

    @Override // K7.AbstractC1066f, K7.G
    public Collection values() {
        return super.values();
    }

    public final void w(Object obj) {
        Collection collection = (Collection) F.j(this.f7634e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f7635f -= size;
        }
    }

    public abstract Collection x(Collection collection);

    public abstract Collection y(Object obj, Collection collection);

    public final List z(Object obj, List list, k kVar) {
        return list instanceof RandomAccess ? new h(obj, list, kVar) : new l(obj, list, kVar);
    }

    /* JADX INFO: renamed from: K7.d$k */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class k extends AbstractCollection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Collection f7660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f7661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Collection f7662d;

        public k(Object obj, Collection collection, k kVar) {
            this.f7659a = obj;
            this.f7660b = collection;
            this.f7661c = kVar;
            this.f7662d = kVar == null ? null : kVar.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            h();
            boolean zIsEmpty = this.f7660b.isEmpty();
            boolean zAdd = this.f7660b.add(obj);
            if (zAdd) {
                AbstractC1064d.m(AbstractC1064d.this);
                if (zIsEmpty) {
                    c();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f7660b.addAll(collection);
            if (zAddAll) {
                AbstractC1064d.o(AbstractC1064d.this, this.f7660b.size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        public void c() {
            k kVar = this.f7661c;
            if (kVar != null) {
                kVar.c();
            } else {
                AbstractC1064d.this.f7634e.put(this.f7659a, this.f7660b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f7660b.clear();
            AbstractC1064d.p(AbstractC1064d.this, size);
            k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            h();
            return this.f7660b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            h();
            return this.f7660b.containsAll(collection);
        }

        public k d() {
            return this.f7661c;
        }

        public Collection e() {
            return this.f7660b;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            h();
            return this.f7660b.equals(obj);
        }

        public Object f() {
            return this.f7659a;
        }

        public void h() {
            Collection collection;
            k kVar = this.f7661c;
            if (kVar != null) {
                kVar.h();
                if (this.f7661c.e() != this.f7662d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f7660b.isEmpty() || (collection = (Collection) AbstractC1064d.this.f7634e.get(this.f7659a)) == null) {
                    return;
                }
                this.f7660b = collection;
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            h();
            return this.f7660b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            h();
            return new a();
        }

        public void k() {
            k kVar = this.f7661c;
            if (kVar != null) {
                kVar.k();
            } else if (this.f7660b.isEmpty()) {
                AbstractC1064d.this.f7634e.remove(this.f7659a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            h();
            boolean zRemove = this.f7660b.remove(obj);
            if (zRemove) {
                AbstractC1064d.n(AbstractC1064d.this);
                k();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f7660b.removeAll(collection);
            if (zRemoveAll) {
                AbstractC1064d.o(AbstractC1064d.this, this.f7660b.size() - size);
                k();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            J7.n.j(collection);
            int size = size();
            boolean zRetainAll = this.f7660b.retainAll(collection);
            if (zRetainAll) {
                AbstractC1064d.o(AbstractC1064d.this, this.f7660b.size() - size);
                k();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            h();
            return this.f7660b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            h();
            return this.f7660b.toString();
        }

        /* JADX INFO: renamed from: K7.d$k$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator f7664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Collection f7665b;

            public a() {
                Collection collection = k.this.f7660b;
                this.f7665b = collection;
                this.f7664a = AbstractC1064d.v(collection);
            }

            public Iterator a() {
                b();
                return this.f7664a;
            }

            public void b() {
                k.this.h();
                if (k.this.f7660b != this.f7665b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f7664a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.f7664a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f7664a.remove();
                AbstractC1064d.n(AbstractC1064d.this);
                k.this.k();
            }

            public a(Iterator it) {
                this.f7665b = k.this.f7660b;
                this.f7664a = it;
            }
        }
    }

    /* JADX INFO: renamed from: K7.d$l */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class l extends k implements List {

        /* JADX INFO: renamed from: K7.d$l$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a extends k.a implements ListIterator {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(obj);
                AbstractC1064d.m(AbstractC1064d.this);
                if (zIsEmpty) {
                    l.this.c();
                }
            }

            public final ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i10) {
                super(l.this.l().listIterator(i10));
            }
        }

        public l(Object obj, List list, k kVar) {
            super(obj, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            h();
            boolean zIsEmpty = e().isEmpty();
            l().add(i10, obj);
            AbstractC1064d.m(AbstractC1064d.this);
            if (zIsEmpty) {
                c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = l().addAll(i10, collection);
            if (zAddAll) {
                AbstractC1064d.o(AbstractC1064d.this, e().size() - size);
                if (size == 0) {
                    c();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public Object get(int i10) {
            h();
            return l().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            h();
            return l().indexOf(obj);
        }

        public List l() {
            return (List) e();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            h();
            return l().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            h();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i10) {
            h();
            Object objRemove = l().remove(i10);
            AbstractC1064d.n(AbstractC1064d.this);
            k();
            return objRemove;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            h();
            return l().set(i10, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [K7.d] */
        /* JADX WARN: Type inference failed for: r3v1, types: [K7.d$k] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.List
        public List subList(int i10, int i11) {
            h();
            ?? r02 = AbstractC1064d.this;
            Object objF = f();
            List listSubList = l().subList(i10, i11);
            k kVarD = d();
            ?? D10 = this;
            if (kVarD != null) {
                D10 = d();
            }
            return r02.z(objF, listSubList, D10);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            h();
            return new a(i10);
        }
    }

    /* JADX INFO: renamed from: K7.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends AbstractC0119d {
        public a() {
            super();
        }

        @Override // K7.AbstractC1064d.AbstractC0119d
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }
}
