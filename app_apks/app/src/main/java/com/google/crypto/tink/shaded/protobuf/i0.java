package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f31487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f31489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile f f31491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f31492f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends i0 {
        public a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void q() {
            if (!p()) {
                if (l() > 0) {
                    android.support.v4.media.session.a.a(k(0).getKey());
                    throw null;
                }
                Iterator it = n().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.a.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.q();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends f {
        public c() {
            super(i0.this, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(i0.this, null);
        }

        public /* synthetic */ c(i0 i0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparable f31497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f31498b;

        public d(i0 i0Var, Map.Entry entry) {
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
            return b(this.f31497a, entry.getKey()) && b(this.f31498b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f31498b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f31497a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f31498b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f31497a;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            i0.this.h();
            Object obj2 = this.f31498b;
            this.f31498b = obj;
            return obj2;
        }

        public String toString() {
            return this.f31497a + "=" + this.f31498b;
        }

        public d(Comparable comparable, Object obj) {
            this.f31497a = comparable;
            this.f31498b = obj;
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
            i0.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(i0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            i0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i0.this.size();
        }

        public /* synthetic */ f(i0 i0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ i0(a aVar) {
        this();
    }

    public static i0 r() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (this.f31488b != 0) {
            this.f31487a = null;
            this.f31488b = 0;
        }
        if (this.f31489c.isEmpty()) {
            return;
        }
        this.f31489c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f31489c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f31491e == null) {
            this.f31491e = new f(this, null);
        }
        return this.f31491e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        int size = size();
        if (size != i0Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != i0Var.l()) {
            return entrySet().equals(i0Var.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(i0Var.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.f31489c.equals(i0Var.f31489c);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(java.lang.Comparable r5) {
        /*
            r4 = this;
            int r0 = r4.f31488b
            int r1 = r0 + (-1)
            if (r1 < 0) goto L1d
            java.lang.Object[] r2 = r4.f31487a
            r2 = r2[r1]
            com.google.crypto.tink.shaded.protobuf.i0$d r2 = (com.google.crypto.tink.shaded.protobuf.i0.d) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1a
            int r0 = r0 + 1
        L18:
            int r4 = -r0
            return r4
        L1a:
            if (r2 != 0) goto L1d
            return r1
        L1d:
            r0 = 0
        L1e:
            if (r0 > r1) goto L3f
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.lang.Object[] r3 = r4.f31487a
            r3 = r3[r2]
            com.google.crypto.tink.shaded.protobuf.i0$d r3 = (com.google.crypto.tink.shaded.protobuf.i0.d) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L38
            int r2 = r2 + (-1)
            r1 = r2
            goto L1e
        L38:
            if (r3 <= 0) goto L3e
            int r2 = r2 + 1
            r0 = r2
            goto L1e
        L3e:
            return r2
        L3f:
            int r0 = r0 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.i0.g(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        return iG >= 0 ? ((d) this.f31487a[iG]).getValue() : this.f31489c.get(comparable);
    }

    public final void h() {
        if (this.f31490d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += this.f31487a[i10].hashCode();
        }
        return m() > 0 ? iHashCode + this.f31489c.hashCode() : iHashCode;
    }

    public Set i() {
        return new c(this, null);
    }

    public final void j() {
        h();
        if (this.f31487a == null) {
            this.f31487a = new Object[16];
        }
    }

    public Map.Entry k(int i10) {
        if (i10 < this.f31488b) {
            return (d) this.f31487a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public int l() {
        return this.f31488b;
    }

    public int m() {
        return this.f31489c.size();
    }

    public Iterable n() {
        return this.f31489c.isEmpty() ? Collections.EMPTY_SET : this.f31489c.entrySet();
    }

    public final SortedMap o() {
        h();
        if (this.f31489c.isEmpty() && !(this.f31489c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f31489c = treeMap;
            this.f31492f = treeMap.descendingMap();
        }
        return (SortedMap) this.f31489c;
    }

    public boolean p() {
        return this.f31490d;
    }

    public void q() {
        if (this.f31490d) {
            return;
        }
        this.f31489c = this.f31489c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f31489c);
        this.f31492f = this.f31492f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f31492f);
        this.f31490d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iG = g(comparable);
        if (iG >= 0) {
            return t(iG);
        }
        if (this.f31489c.isEmpty()) {
            return null;
        }
        return this.f31489c.remove(comparable);
    }

    public Object s(Comparable comparable, Object obj) {
        h();
        int iG = g(comparable);
        if (iG >= 0) {
            return ((d) this.f31487a[iG]).setValue(obj);
        }
        j();
        int i10 = -(iG + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        int i11 = this.f31488b;
        if (i11 == 16) {
            d dVar = (d) this.f31487a[15];
            this.f31488b = i11 - 1;
            o().put(dVar.getKey(), dVar.getValue());
        }
        Object[] objArr = this.f31487a;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (objArr.length - i10) - 1);
        this.f31487a[i10] = new d(comparable, obj);
        this.f31488b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f31488b + this.f31489c.size();
    }

    public final Object t(int i10) {
        h();
        Object value = ((d) this.f31487a[i10]).getValue();
        Object[] objArr = this.f31487a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f31488b - i10) - 1);
        this.f31488b--;
        if (!this.f31489c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            this.f31487a[this.f31488b] = new d(this, (Map.Entry) it.next());
            this.f31488b++;
            it.remove();
        }
        return value;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator f31494b;

        public b() {
            this.f31493a = i0.this.f31488b;
        }

        public final Iterator a() {
            if (this.f31494b == null) {
                this.f31494b = i0.this.f31492f.entrySet().iterator();
            }
            return this.f31494b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            Object[] objArr = i0.this.f31487a;
            int i10 = this.f31493a - 1;
            this.f31493a = i10;
            return (d) objArr[i10];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f31493a;
            return (i10 > 0 && i10 <= i0.this.f31488b) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(i0 i0Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f31500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator f31502c;

        public e() {
            this.f31500a = -1;
        }

        public final Iterator a() {
            if (this.f31502c == null) {
                this.f31502c = i0.this.f31489c.entrySet().iterator();
            }
            return this.f31502c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f31501b = true;
            int i10 = this.f31500a + 1;
            this.f31500a = i10;
            return i10 < i0.this.f31488b ? (d) i0.this.f31487a[this.f31500a] : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31500a + 1 < i0.this.f31488b || (!i0.this.f31489c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f31501b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f31501b = false;
            i0.this.h();
            if (this.f31500a >= i0.this.f31488b) {
                a().remove();
                return;
            }
            i0 i0Var = i0.this;
            int i10 = this.f31500a;
            this.f31500a = i10 - 1;
            i0Var.t(i10);
        }

        public /* synthetic */ e(i0 i0Var, a aVar) {
            this();
        }
    }

    public i0() {
        Map map = Collections.EMPTY_MAP;
        this.f31489c = map;
        this.f31492f = map;
    }
}
