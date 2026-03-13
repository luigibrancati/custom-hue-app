package com.google.protobuf;

import com.google.protobuf.I;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f32051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f32052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile g f32054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f32055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile c f32056g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends D0 {
        public a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.D0
        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry entryJ = j(i10);
                    if (((I.b) entryJ.getKey()).f()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((I.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
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
    public class c extends g {
        public c() {
            super(D0.this, null);
        }

        @Override // com.google.protobuf.D0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(D0.this, null);
        }

        public /* synthetic */ c(D0 d02, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator f32061a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable f32062b = new b();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f32061a;
            }
        }

        public static Iterable b() {
            return f32062b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparable f32063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f32064b;

        public e(D0 d02, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            return b(this.f32063a, entry.getKey()) && b(this.f32064b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f32064b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f32063a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f32064b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f32063a;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            D0.this.g();
            Object obj2 = this.f32064b;
            this.f32064b = obj;
            return obj2;
        }

        public String toString() {
            return this.f32063a + "=" + this.f32064b;
        }

        public e(Comparable comparable, Object obj) {
            this.f32063a = comparable;
            this.f32064b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g extends AbstractSet {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            D0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            D0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = D0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(D0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            D0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return D0.this.size();
        }

        public /* synthetic */ g(D0 d02, a aVar) {
            this();
        }
    }

    public /* synthetic */ D0(int i10, a aVar) {
        this(i10);
    }

    public static D0 q(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f32051b.isEmpty()) {
            this.f32051b.clear();
        }
        if (this.f32052c.isEmpty()) {
            return;
        }
        this.f32052c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f32052c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f32054e == null) {
            this.f32054e = new g(this, null);
        }
        return this.f32054e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return super.equals(obj);
        }
        D0 d02 = (D0) obj;
        int size = size();
        if (size != d02.size()) {
            return false;
        }
        int iK = k();
        if (iK != d02.k()) {
            return entrySet().equals(d02.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!j(i10).equals(d02.j(i10))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f32052c.equals(d02.f32052c);
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
            java.util.List r0 = r4.f32051b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f32051b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.D0$e r2 = (com.google.protobuf.D0.e) r2
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
            java.util.List r3 = r4.f32051b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.D0$e r3 = (com.google.protobuf.D0.e) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.D0.f(java.lang.Comparable):int");
    }

    public final void g() {
        if (this.f32053d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((e) this.f32051b.get(iF)).getValue() : this.f32052c.get(comparable);
    }

    public Set h() {
        if (this.f32056g == null) {
            this.f32056g = new c(this, null);
        }
        return this.f32056g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += ((e) this.f32051b.get(i10)).hashCode();
        }
        return l() > 0 ? iHashCode + this.f32052c.hashCode() : iHashCode;
    }

    public final void i() {
        g();
        if (!this.f32051b.isEmpty() || (this.f32051b instanceof ArrayList)) {
            return;
        }
        this.f32051b = new ArrayList(this.f32050a);
    }

    public Map.Entry j(int i10) {
        return (Map.Entry) this.f32051b.get(i10);
    }

    public int k() {
        return this.f32051b.size();
    }

    public int l() {
        return this.f32052c.size();
    }

    public Iterable m() {
        return this.f32052c.isEmpty() ? d.b() : this.f32052c.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f32052c.isEmpty() && !(this.f32052c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f32052c = treeMap;
            this.f32055f = treeMap.descendingMap();
        }
        return (SortedMap) this.f32052c;
    }

    public boolean o() {
        return this.f32053d;
    }

    public void p() {
        if (this.f32053d) {
            return;
        }
        this.f32052c = this.f32052c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f32052c);
        this.f32055f = this.f32055f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f32055f);
        this.f32053d = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((e) this.f32051b.get(iF)).setValue(obj);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= this.f32050a) {
            return n().put(comparable, obj);
        }
        int size = this.f32051b.size();
        int i11 = this.f32050a;
        if (size == i11) {
            e eVar = (e) this.f32051b.remove(i11 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f32051b.add(i10, new e(comparable, obj));
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
        if (this.f32052c.isEmpty()) {
            return null;
        }
        return this.f32052c.remove(comparable);
    }

    public final Object s(int i10) {
        g();
        Object value = ((e) this.f32051b.remove(i10)).getValue();
        if (!this.f32052c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f32051b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f32051b.size() + this.f32052c.size();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f32058b;

        public b() {
            this.f32057a = D0.this.f32051b.size();
        }

        public final Iterator a() {
            if (this.f32058b == null) {
                this.f32058b = D0.this.f32055f.entrySet().iterator();
            }
            return this.f32058b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List list = D0.this.f32051b;
            int i10 = this.f32057a - 1;
            this.f32057a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f32057a;
            return (i10 > 0 && i10 <= D0.this.f32051b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(D0 d02, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f32067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f32068c;

        public f() {
            this.f32066a = -1;
        }

        public final Iterator a() {
            if (this.f32068c == null) {
                this.f32068c = D0.this.f32052c.entrySet().iterator();
            }
            return this.f32068c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f32067b = true;
            int i10 = this.f32066a + 1;
            this.f32066a = i10;
            return i10 < D0.this.f32051b.size() ? (Map.Entry) D0.this.f32051b.get(this.f32066a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32066a + 1 < D0.this.f32051b.size() || (!D0.this.f32052c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f32067b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f32067b = false;
            D0.this.g();
            if (this.f32066a >= D0.this.f32051b.size()) {
                a().remove();
                return;
            }
            D0 d02 = D0.this;
            int i10 = this.f32066a;
            this.f32066a = i10 - 1;
            d02.s(i10);
        }

        public /* synthetic */ f(D0 d02, a aVar) {
            this();
        }
    }

    public D0(int i10) {
        this.f32050a = i10;
        this.f32051b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f32052c = map;
        this.f32055f = map;
    }
}
