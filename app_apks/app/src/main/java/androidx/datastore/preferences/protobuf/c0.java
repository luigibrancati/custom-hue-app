package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f22771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f22772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile f f22774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f22775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile c f22776f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends c0 {
        public a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.c0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    android.support.v4.media.session.a.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.a.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((Comparable) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends f {
        public c() {
            super(c0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.c0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(c0.this, null);
        }

        public /* synthetic */ c(c0 c0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparable f22781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f22782b;

        public d(c0 c0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f22781a, entry.getKey()) && b(this.f22782b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f22782b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f22781a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f22782b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f22781a;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            c0.this.g();
            Object obj2 = this.f22782b;
            this.f22782b = obj;
            return obj2;
        }

        public String toString() {
            return this.f22781a + "=" + this.f22782b;
        }

        public d(Comparable comparable, Object obj) {
            this.f22781a = comparable;
            this.f22782b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            c0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            c0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = c0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(c0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            c0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return c0.this.size();
        }

        public /* synthetic */ f(c0 c0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ c0(a aVar) {
        this();
    }

    public static c0 q() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f22771a.isEmpty()) {
            this.f22771a.clear();
        }
        if (this.f22772b.isEmpty()) {
            return;
        }
        this.f22772b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f22772b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f22774d == null) {
            this.f22774d = new f(this, null);
        }
        return this.f22774d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        int size = size();
        if (size != c0Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != c0Var.k()) {
            return entrySet().equals(c0Var.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!j(i10).equals(c0Var.j(i10))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f22772b.equals(c0Var.f22772b);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f22771a
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f22771a
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.c0$d r2 = (androidx.datastore.preferences.protobuf.c0.d) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r4 = -r0
            return r4
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f22771a
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.c0$d r3 = (androidx.datastore.preferences.protobuf.c0.d) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.c0.f(java.lang.Comparable):int");
    }

    public final void g() {
        if (this.f22773c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((d) this.f22771a.get(iF)).getValue() : this.f22772b.get(comparable);
    }

    public Set h() {
        if (this.f22776f == null) {
            this.f22776f = new c(this, null);
        }
        return this.f22776f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += ((d) this.f22771a.get(i10)).hashCode();
        }
        return l() > 0 ? iHashCode + this.f22772b.hashCode() : iHashCode;
    }

    public final void i() {
        g();
        if (!this.f22771a.isEmpty() || (this.f22771a instanceof ArrayList)) {
            return;
        }
        this.f22771a = new ArrayList(16);
    }

    public Map.Entry j(int i10) {
        return (Map.Entry) this.f22771a.get(i10);
    }

    public int k() {
        return this.f22771a.size();
    }

    public int l() {
        return this.f22772b.size();
    }

    public Iterable m() {
        return this.f22772b.isEmpty() ? Collections.EMPTY_SET : this.f22772b.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f22772b.isEmpty() && !(this.f22772b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22772b = treeMap;
            this.f22775e = treeMap.descendingMap();
        }
        return (SortedMap) this.f22772b;
    }

    public boolean o() {
        return this.f22773c;
    }

    public void p() {
        if (this.f22773c) {
            return;
        }
        this.f22772b = this.f22772b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22772b);
        this.f22775e = this.f22775e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22775e);
        this.f22773c = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((d) this.f22771a.get(iF)).setValue(obj);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f22771a.size() == 16) {
            d dVar = (d) this.f22771a.remove(15);
            n().put(dVar.getKey(), dVar.getValue());
        }
        this.f22771a.add(i10, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return s(iF);
        }
        if (this.f22772b.isEmpty()) {
            return null;
        }
        return this.f22772b.remove(comparable);
    }

    public final Object s(int i10) {
        g();
        Object value = ((d) this.f22771a.remove(i10)).getValue();
        if (!this.f22772b.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f22771a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f22771a.size() + this.f22772b.size();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f22778b;

        public b() {
            this.f22777a = c0.this.f22771a.size();
        }

        public final Iterator a() {
            if (this.f22778b == null) {
                this.f22778b = c0.this.f22775e.entrySet().iterator();
            }
            return this.f22778b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = c0.this.f22771a;
            int i10 = this.f22777a - 1;
            this.f22777a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f22777a;
            return (i10 > 0 && i10 <= c0.this.f22771a.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(c0 c0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f22786c;

        public e() {
            this.f22784a = -1;
        }

        public final Iterator a() {
            if (this.f22786c == null) {
                this.f22786c = c0.this.f22772b.entrySet().iterator();
            }
            return this.f22786c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f22785b = true;
            int i10 = this.f22784a + 1;
            this.f22784a = i10;
            return i10 < c0.this.f22771a.size() ? (Map.Entry) c0.this.f22771a.get(this.f22784a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22784a + 1 < c0.this.f22771a.size() || (!c0.this.f22772b.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f22785b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f22785b = false;
            c0.this.g();
            if (this.f22784a >= c0.this.f22771a.size()) {
                a().remove();
                return;
            }
            c0 c0Var = c0.this;
            int i10 = this.f22784a;
            this.f22784a = i10 - 1;
            c0Var.s(i10);
        }

        public /* synthetic */ e(c0 c0Var, a aVar) {
            this();
        }
    }

    public c0() {
        this.f22771a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f22772b = map;
        this.f22775e = map;
    }
}
