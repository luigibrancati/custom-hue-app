package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F3 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f30022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f30024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile D3 f30026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f30027f;

    public /* synthetic */ F3(E3 e32) {
        Map map = Collections.EMPTY_MAP;
        this.f30024c = map;
        this.f30027f = map;
    }

    public void a() {
        if (this.f30025d) {
            return;
        }
        this.f30024c = this.f30024c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f30024c);
        this.f30027f = this.f30027f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f30027f);
        this.f30025d = true;
    }

    public final int c() {
        return this.f30023b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (this.f30023b != 0) {
            this.f30022a = null;
            this.f30023b = 0;
        }
        if (this.f30024c.isEmpty()) {
            return;
        }
        this.f30024c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f30024c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f30024c.isEmpty() ? Collections.EMPTY_SET : this.f30024c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f30026e == null) {
            this.f30026e = new D3(this, null);
        }
        return this.f30026e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F3)) {
            return super.equals(obj);
        }
        F3 f32 = (F3) obj;
        int size = size();
        if (size != f32.size()) {
            return false;
        }
        int i10 = this.f30023b;
        if (i10 != f32.f30023b) {
            return entrySet().equals(f32.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!g(i11).equals(f32.g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f30024c.equals(f32.f30024c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((B3) this.f30022a[iL]).setValue(obj);
        }
        o();
        if (this.f30022a == null) {
            this.f30022a = new Object[16];
        }
        int i10 = -(iL + 1);
        if (i10 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f30023b == 16) {
            B3 b32 = (B3) this.f30022a[15];
            this.f30023b = 15;
            n().put(b32.a(), b32.getValue());
        }
        Object[] objArr = this.f30022a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f30022a[i10] = new B3(this, comparable, obj);
        this.f30023b++;
        return null;
    }

    public final Map.Entry g(int i10) {
        if (i10 < this.f30023b) {
            return (B3) this.f30022a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((B3) this.f30022a[iL]).getValue() : this.f30024c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f30023b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f30022a[i11].hashCode();
        }
        return this.f30024c.size() > 0 ? iHashCode + this.f30024c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f30025d;
    }

    public final int l(Comparable comparable) {
        int i10 = this.f30023b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((B3) this.f30022a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((B3) this.f30022a[i13]).a());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    public final Object m(int i10) {
        o();
        Object value = ((B3) this.f30022a[i10]).getValue();
        Object[] objArr = this.f30022a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f30023b - i10) - 1);
        this.f30023b--;
        if (!this.f30024c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            Object[] objArr2 = this.f30022a;
            int i11 = this.f30023b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new B3(this, (Comparable) entry.getKey(), entry.getValue());
            this.f30023b++;
            it.remove();
        }
        return value;
    }

    public final SortedMap n() {
        o();
        if (this.f30024c.isEmpty() && !(this.f30024c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f30024c = treeMap;
            this.f30027f = treeMap.descendingMap();
        }
        return (SortedMap) this.f30024c;
    }

    public final void o() {
        if (this.f30025d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f30024c.isEmpty()) {
            return null;
        }
        return this.f30024c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f30023b + this.f30024c.size();
    }
}
