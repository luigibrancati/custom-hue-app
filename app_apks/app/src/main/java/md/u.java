package md;

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
import md.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f40375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f40376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile e f40378e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends u {
        public a(int i10) {
            super(i10, null);
        }

        @Override // md.u
        public void m() {
            if (!l()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry entryH = h(i10);
                    if (((h.b) entryH.getKey()).f()) {
                        entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry entry : j()) {
                    if (((h.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.m();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.o((h.b) obj, obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator f40379a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable f40380b = new C0532b();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class a implements Iterator {
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

        /* JADX INFO: renamed from: md.u$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static class C0532b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f40379a;
            }
        }

        public static Iterable b() {
            return f40380b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements Comparable, Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparable f40381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f40382b;

        public c(u uVar, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
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
            return b(this.f40381a, entry.getKey()) && b(this.f40382b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f40382b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f40381a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f40382b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f40381a;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            u.this.f();
            Object obj2 = this.f40382b;
            this.f40382b = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f40381a);
            String strValueOf2 = String.valueOf(this.f40382b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        public c(Comparable comparable, Object obj) {
            this.f40381a = comparable;
            this.f40382b = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e extends AbstractSet {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            u.this.o((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(u.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.size();
        }

        public /* synthetic */ e(u uVar, a aVar) {
            this();
        }
    }

    public /* synthetic */ u(int i10, a aVar) {
        this(i10);
    }

    public static u n(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f40375b.isEmpty()) {
            this.f40375b.clear();
        }
        if (this.f40376c.isEmpty()) {
            return;
        }
        this.f40376c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f40376c.containsKey(comparable);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f40375b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f40375b
            java.lang.Object r2 = r2.get(r1)
            md.u$c r2 = (md.u.c) r2
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
            java.util.List r3 = r4.f40375b
            java.lang.Object r3 = r3.get(r2)
            md.u$c r3 = (md.u.c) r3
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
        throw new UnsupportedOperationException("Method not decompiled: md.u.e(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f40378e == null) {
            this.f40378e = new e(this, null);
        }
        return this.f40378e;
    }

    public final void f() {
        if (this.f40377d) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g() {
        f();
        if (!this.f40375b.isEmpty() || (this.f40375b instanceof ArrayList)) {
            return;
        }
        this.f40375b = new ArrayList(this.f40374a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((c) this.f40375b.get(iE)).getValue() : this.f40376c.get(comparable);
    }

    public Map.Entry h(int i10) {
        return (Map.Entry) this.f40375b.get(i10);
    }

    public int i() {
        return this.f40375b.size();
    }

    public Iterable j() {
        return this.f40376c.isEmpty() ? b.b() : this.f40376c.entrySet();
    }

    public final SortedMap k() {
        f();
        if (this.f40376c.isEmpty() && !(this.f40376c instanceof TreeMap)) {
            this.f40376c = new TreeMap();
        }
        return (SortedMap) this.f40376c;
    }

    public boolean l() {
        return this.f40377d;
    }

    public void m() {
        if (this.f40377d) {
            return;
        }
        this.f40376c = this.f40376c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f40376c);
        this.f40377d = true;
    }

    public Object o(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((c) this.f40375b.get(iE)).setValue(obj);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f40374a) {
            return k().put(comparable, obj);
        }
        int size = this.f40375b.size();
        int i11 = this.f40374a;
        if (size == i11) {
            c cVar = (c) this.f40375b.remove(i11 - 1);
            k().put(cVar.getKey(), cVar.getValue());
        }
        this.f40375b.add(i10, new c(comparable, obj));
        return null;
    }

    public final Object p(int i10) {
        f();
        Object value = ((c) this.f40375b.remove(i10)).getValue();
        if (!this.f40376c.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            this.f40375b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return p(iE);
        }
        if (this.f40376c.isEmpty()) {
            return null;
        }
        return this.f40376c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f40375b.size() + this.f40376c.size();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f40385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f40386c;

        public d() {
            this.f40384a = -1;
        }

        public final Iterator a() {
            if (this.f40386c == null) {
                this.f40386c = u.this.f40376c.entrySet().iterator();
            }
            return this.f40386c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f40385b = true;
            int i10 = this.f40384a + 1;
            this.f40384a = i10;
            return i10 < u.this.f40375b.size() ? (Map.Entry) u.this.f40375b.get(this.f40384a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40384a + 1 < u.this.f40375b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f40385b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f40385b = false;
            u.this.f();
            if (this.f40384a >= u.this.f40375b.size()) {
                a().remove();
                return;
            }
            u uVar = u.this;
            int i10 = this.f40384a;
            this.f40384a = i10 - 1;
            uVar.p(i10);
        }

        public /* synthetic */ d(u uVar, a aVar) {
            this();
        }
    }

    public u(int i10) {
        this.f40374a = i10;
        this.f40375b = Collections.EMPTY_LIST;
        this.f40376c = Collections.EMPTY_MAP;
    }
}
