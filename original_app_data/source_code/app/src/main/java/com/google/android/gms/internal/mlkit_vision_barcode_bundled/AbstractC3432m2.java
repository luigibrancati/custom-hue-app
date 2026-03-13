package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3432m2 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f29871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f29873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile C3422k2 f29875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f29876f;

    public /* synthetic */ AbstractC3432m2(AbstractC3427l2 abstractC3427l2) {
        Map map = Collections.EMPTY_MAP;
        this.f29873c = map;
        this.f29876f = map;
    }

    public void a() {
        if (this.f29874d) {
            return;
        }
        this.f29873c = this.f29873c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29873c);
        this.f29876f = this.f29876f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29876f);
        this.f29874d = true;
    }

    public final int c() {
        return this.f29872b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (this.f29872b != 0) {
            this.f29871a = null;
            this.f29872b = 0;
        }
        if (this.f29873c.isEmpty()) {
            return;
        }
        this.f29873c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f29873c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f29873c.isEmpty() ? Collections.EMPTY_SET : this.f29873c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f29875e == null) {
            this.f29875e = new C3422k2(this, null);
        }
        return this.f29875e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3432m2)) {
            return super.equals(obj);
        }
        AbstractC3432m2 abstractC3432m2 = (AbstractC3432m2) obj;
        int size = size();
        if (size != abstractC3432m2.size()) {
            return false;
        }
        int i10 = this.f29872b;
        if (i10 != abstractC3432m2.f29872b) {
            return entrySet().equals(abstractC3432m2.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!g(i11).equals(abstractC3432m2.g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f29873c.equals(abstractC3432m2.f29873c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        o();
        int iL = l(comparable);
        if (iL >= 0) {
            return ((C3402g2) this.f29871a[iL]).setValue(obj);
        }
        o();
        if (this.f29871a == null) {
            this.f29871a = new Object[16];
        }
        int i10 = -(iL + 1);
        if (i10 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f29872b == 16) {
            C3402g2 c3402g2 = (C3402g2) this.f29871a[15];
            this.f29872b = 15;
            n().put(c3402g2.a(), c3402g2.getValue());
        }
        Object[] objArr = this.f29871a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f29871a[i10] = new C3402g2(this, comparable, obj);
        this.f29872b++;
        return null;
    }

    public final Map.Entry g(int i10) {
        if (i10 < this.f29872b) {
            return (C3402g2) this.f29871a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? ((C3402g2) this.f29871a[iL]).getValue() : this.f29873c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f29872b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f29871a[i11].hashCode();
        }
        return this.f29873c.size() > 0 ? iHashCode + this.f29873c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f29874d;
    }

    public final int l(Comparable comparable) {
        int i10 = this.f29872b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C3402g2) this.f29871a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C3402g2) this.f29871a[i13]).a());
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
        Object value = ((C3402g2) this.f29871a[i10]).getValue();
        Object[] objArr = this.f29871a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f29872b - i10) - 1);
        this.f29872b--;
        if (!this.f29873c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            Object[] objArr2 = this.f29871a;
            int i11 = this.f29872b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C3402g2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f29872b++;
            it.remove();
        }
        return value;
    }

    public final SortedMap n() {
        o();
        if (this.f29873c.isEmpty() && !(this.f29873c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29873c = treeMap;
            this.f29876f = treeMap.descendingMap();
        }
        return (SortedMap) this.f29873c;
    }

    public final void o() {
        if (this.f29874d) {
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
        if (this.f29873c.isEmpty()) {
            return null;
        }
        return this.f29873c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f29872b + this.f29873c.size();
    }
}
