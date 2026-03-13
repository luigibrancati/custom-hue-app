package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V5 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f29368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f29370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile U5 f29372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f29373f;

    public /* synthetic */ V5(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f29370c = map;
        this.f29373f = map;
    }

    public void a() {
        if (this.f29371d) {
            return;
        }
        this.f29370c = this.f29370c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29370c);
        this.f29373f = this.f29373f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f29373f);
        this.f29371d = true;
    }

    public final boolean b() {
        return this.f29371d;
    }

    public final int c() {
        return this.f29369b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f29369b != 0) {
            this.f29368a = null;
            this.f29369b = 0;
        }
        if (this.f29370c.isEmpty()) {
            return;
        }
        this.f29370c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f29370c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.f29369b) {
            return (S5) this.f29368a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable e() {
        return this.f29370c.isEmpty() ? Collections.EMPTY_SET : this.f29370c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f29372e == null) {
            this.f29372e = new U5(this, null);
        }
        return this.f29372e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V5)) {
            return super.equals(obj);
        }
        V5 v52 = (V5) obj;
        int size = size();
        if (size != v52.size()) {
            return false;
        }
        int i10 = this.f29369b;
        if (i10 != v52.f29369b) {
            return entrySet().equals(v52.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(v52.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f29370c.equals(v52.f29370c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iM = m(comparable);
        if (iM >= 0) {
            return ((S5) this.f29368a[iM]).setValue(obj);
        }
        h();
        if (this.f29368a == null) {
            this.f29368a = new Object[16];
        }
        int i10 = -(iM + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.f29369b == 16) {
            S5 s52 = (S5) this.f29368a[15];
            this.f29369b = 15;
            o().put(s52.a(), s52.getValue());
        }
        Object[] objArr = this.f29368a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f29368a[i10] = new S5(this, comparable, obj);
        this.f29369b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        return iM >= 0 ? ((S5) this.f29368a[iM]).getValue() : this.f29370c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f29369b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f29368a[i11].hashCode();
        }
        return this.f29370c.size() > 0 ? iHashCode + this.f29370c.hashCode() : iHashCode;
    }

    public final /* synthetic */ Object[] i() {
        return this.f29368a;
    }

    public final /* synthetic */ int j() {
        return this.f29369b;
    }

    public final /* synthetic */ Map k() {
        return this.f29370c;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object g(int i10) {
        h();
        Object value = ((S5) this.f29368a[i10]).getValue();
        Object[] objArr = this.f29368a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f29369b - i10) - 1);
        this.f29369b--;
        if (!this.f29370c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f29368a;
            int i11 = this.f29369b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new S5(this, (Comparable) entry.getKey(), entry.getValue());
            this.f29369b++;
            it.remove();
        }
        return value;
    }

    public final int m(Comparable comparable) {
        int i10 = this.f29369b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((S5) this.f29368a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((S5) this.f29368a[i13]).a());
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

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void h() {
        if (this.f29371d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap o() {
        h();
        if (this.f29370c.isEmpty() && !(this.f29370c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29370c = treeMap;
            this.f29373f = treeMap.descendingMap();
        }
        return (SortedMap) this.f29370c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        if (iM >= 0) {
            return g(iM);
        }
        if (this.f29370c.isEmpty()) {
            return null;
        }
        return this.f29370c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f29369b + this.f29370c.size();
    }
}
