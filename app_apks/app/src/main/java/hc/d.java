package hc;

import Bc.k;
import gc.AbstractC4191d;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;
import wc.InterfaceC6187d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements Map, Serializable, InterfaceC6187d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f36489n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f36490o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f36491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f36492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f36493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f36494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hc.f f36500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f36501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hc.e f36502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f36503m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int c(int i10) {
            return Integer.highestOneBit(k.e(i10, 1) * 3);
        }

        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f36490o;
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends C0474d implements Iterator, InterfaceC6184a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d map) {
            super(map);
            AbstractC4862t.e(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public c next() {
            a();
            if (b() >= d().f36496f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            c cVar = new c(d(), c());
            e();
            return cVar;
        }

        public final void i(StringBuilder sb2) {
            AbstractC4862t.e(sb2, "sb");
            if (b() >= d().f36496f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            Object obj = d().f36491a[c()];
            if (obj == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = d().f36492b;
            AbstractC4862t.b(objArr);
            Object obj2 = objArr[c()];
            if (obj2 == d()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            e();
        }

        public final int k() {
            if (b() >= d().f36496f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            Object obj = d().f36491a[c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = d().f36492b;
            AbstractC4862t.b(objArr);
            Object obj2 = objArr[c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            e();
            return iHashCode2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements Map.Entry, InterfaceC6187d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f36504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36506c;

        public c(d map, int i10) {
            AbstractC4862t.e(map, "map");
            this.f36504a = map;
            this.f36505b = i10;
            this.f36506c = map.f36498h;
        }

        private final void a() {
            if (this.f36504a.f36498h != this.f36506c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC4862t.a(entry.getKey(), getKey()) && AbstractC4862t.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            a();
            return this.f36504a.f36491a[this.f36505b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a();
            Object[] objArr = this.f36504a.f36492b;
            AbstractC4862t.b(objArr);
            return objArr[this.f36505b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            this.f36504a.m();
            Object[] objArrK = this.f36504a.k();
            int i10 = this.f36505b;
            Object obj2 = objArrK[i10];
            objArrK[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: hc.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0474d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f36507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36510d;

        public C0474d(d map) {
            AbstractC4862t.e(map, "map");
            this.f36507a = map;
            this.f36509c = -1;
            this.f36510d = map.f36498h;
            e();
        }

        public final void a() {
            if (this.f36507a.f36498h != this.f36510d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int b() {
            return this.f36508b;
        }

        public final int c() {
            return this.f36509c;
        }

        public final d d() {
            return this.f36507a;
        }

        public final void e() {
            while (this.f36508b < this.f36507a.f36496f) {
                int[] iArr = this.f36507a.f36493c;
                int i10 = this.f36508b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f36508b = i10 + 1;
                }
            }
        }

        public final void f(int i10) {
            this.f36508b = i10;
        }

        public final void g(int i10) {
            this.f36509c = i10;
        }

        public final boolean hasNext() {
            return this.f36508b < this.f36507a.f36496f;
        }

        public final void remove() {
            a();
            if (this.f36509c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f36507a.m();
            this.f36507a.M(this.f36509c);
            this.f36509c = -1;
            this.f36510d = this.f36507a.f36498h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends C0474d implements Iterator, InterfaceC6184a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d map) {
            super(map);
            AbstractC4862t.e(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f36496f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            Object obj = d().f36491a[c()];
            e();
            return obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends C0474d implements Iterator, InterfaceC6184a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d map) {
            super(map);
            AbstractC4862t.e(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (b() >= d().f36496f) {
                throw new NoSuchElementException();
            }
            int iB = b();
            f(iB + 1);
            g(iB);
            Object[] objArr = d().f36492b;
            AbstractC4862t.b(objArr);
            Object obj = objArr[c()];
            e();
            return obj;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f36503m = true;
        f36490o = dVar;
    }

    public d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f36491a = objArr;
        this.f36492b = objArr2;
        this.f36493c = iArr;
        this.f36494d = iArr2;
        this.f36495e = i10;
        this.f36496f = i11;
        this.f36497g = f36489n.d(y());
    }

    private final void I() {
        this.f36498h++;
    }

    private final void r(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > w()) {
            int iE = AbstractC4191d.f35593a.e(w(), i10);
            this.f36491a = hc.c.e(this.f36491a, iE);
            Object[] objArr = this.f36492b;
            this.f36492b = objArr != null ? hc.c.e(objArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f36493c, iE);
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f36493c = iArrCopyOf;
            int iC = f36489n.c(iE);
            if (iC > y()) {
                J(iC);
            }
        }
    }

    private final void s(int i10) {
        if (Q(i10)) {
            n(true);
        } else {
            r(this.f36496f + i10);
        }
    }

    public int A() {
        return this.f36499i;
    }

    public Collection B() {
        g gVar = this.f36501k;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f36501k = gVar2;
        return gVar2;
    }

    public final int C(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f36497g;
    }

    public final e D() {
        return new e(this);
    }

    public final boolean E(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        s(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (F((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public final boolean F(Map.Entry entry) {
        int i10 = i(entry.getKey());
        Object[] objArrK = k();
        if (i10 >= 0) {
            objArrK[i10] = entry.getValue();
            return true;
        }
        int i11 = (-i10) - 1;
        if (AbstractC4862t.a(entry.getValue(), objArrK[i11])) {
            return false;
        }
        objArrK[i11] = entry.getValue();
        return true;
    }

    public final boolean G(int i10) {
        int iC = C(this.f36491a[i10]);
        int i11 = this.f36495e;
        while (true) {
            int[] iArr = this.f36494d;
            if (iArr[iC] == 0) {
                iArr[iC] = i10 + 1;
                this.f36493c[i10] = iC;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    public final void J(int i10) {
        I();
        int i11 = 0;
        if (this.f36496f > size()) {
            n(false);
        }
        this.f36494d = new int[i10];
        this.f36497g = f36489n.d(i10);
        while (i11 < this.f36496f) {
            int i12 = i11 + 1;
            if (!G(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    public final boolean L(Map.Entry entry) {
        AbstractC4862t.e(entry, "entry");
        m();
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f36492b;
        AbstractC4862t.b(objArr);
        if (!AbstractC4862t.a(objArr[iU], entry.getValue())) {
            return false;
        }
        M(iU);
        return true;
    }

    public final void M(int i10) {
        hc.c.f(this.f36491a, i10);
        Object[] objArr = this.f36492b;
        if (objArr != null) {
            hc.c.f(objArr, i10);
        }
        N(this.f36493c[i10]);
        this.f36493c[i10] = -1;
        this.f36499i = size() - 1;
        I();
    }

    public final void N(int i10) {
        int iH = k.h(this.f36495e * 2, y() / 2);
        int i11 = 0;
        int i12 = i10;
        do {
            i10 = i10 == 0 ? y() - 1 : i10 - 1;
            i11++;
            if (i11 > this.f36495e) {
                this.f36494d[i12] = 0;
                return;
            }
            int[] iArr = this.f36494d;
            int i13 = iArr[i10];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((C(this.f36491a[i14]) - i10) & (y() - 1)) >= i11) {
                    this.f36494d[i12] = i13;
                    this.f36493c[i14] = i12;
                }
                iH--;
            }
            i12 = i10;
            i11 = 0;
            iH--;
        } while (iH >= 0);
        this.f36494d[i12] = -1;
    }

    public final boolean O(Object obj) {
        m();
        int iU = u(obj);
        if (iU < 0) {
            return false;
        }
        M(iU);
        return true;
    }

    public final boolean P(Object obj) {
        m();
        int iV = v(obj);
        if (iV < 0) {
            return false;
        }
        M(iV);
        return true;
    }

    public final boolean Q(int i10) {
        int iW = w();
        int i11 = this.f36496f;
        int i12 = iW - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= w() / 4;
    }

    public final f R() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m();
        int i10 = this.f36496f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f36493c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f36494d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        hc.c.g(this.f36491a, 0, this.f36496f);
        Object[] objArr = this.f36492b;
        if (objArr != null) {
            hc.c.g(objArr, 0, this.f36496f);
        }
        this.f36499i = 0;
        this.f36496f = 0;
        I();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return u(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && q((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.f36492b;
        AbstractC4862t.b(objArr);
        return objArr[iU];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarT = t();
        int iK = 0;
        while (bVarT.hasNext()) {
            iK += bVarT.k();
        }
        return iK;
    }

    public final int i(Object obj) {
        m();
        while (true) {
            int iC = C(obj);
            int iH = k.h(this.f36495e * 2, y() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f36494d[iC];
                if (i11 <= 0) {
                    if (this.f36496f < w()) {
                        int i12 = this.f36496f;
                        int i13 = i12 + 1;
                        this.f36496f = i13;
                        this.f36491a[i12] = obj;
                        this.f36493c[i12] = iC;
                        this.f36494d[iC] = i13;
                        this.f36499i = size() + 1;
                        I();
                        if (i10 > this.f36495e) {
                            this.f36495e = i10;
                        }
                        return i12;
                    }
                    s(1);
                } else {
                    if (AbstractC4862t.a(this.f36491a[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iH) {
                        J(y() * 2);
                        break;
                    }
                    iC = iC == 0 ? y() - 1 : iC - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] k() {
        Object[] objArr = this.f36492b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrD = hc.c.d(w());
        this.f36492b = objArrD;
        return objArrD;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return z();
    }

    public final Map l() {
        m();
        this.f36503m = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f36490o;
        AbstractC4862t.c(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void m() {
        if (this.f36503m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void n(boolean z10) {
        int i10;
        Object[] objArr = this.f36492b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f36496f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f36493c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f36491a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f36494d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        hc.c.g(this.f36491a, i12, i10);
        if (objArr != null) {
            hc.c.g(objArr, i12, this.f36496f);
        }
        this.f36496f = i12;
    }

    public final boolean o(Collection m10) {
        AbstractC4862t.e(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean p(Map.Entry entry) {
        AbstractC4862t.e(entry, "entry");
        int iU = u(entry.getKey());
        if (iU < 0) {
            return false;
        }
        Object[] objArr = this.f36492b;
        AbstractC4862t.b(objArr);
        return AbstractC4862t.a(objArr[iU], entry.getValue());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m();
        int i10 = i(obj);
        Object[] objArrK = k();
        if (i10 >= 0) {
            objArrK[i10] = obj2;
            return null;
        }
        int i11 = (-i10) - 1;
        Object obj3 = objArrK[i11];
        objArrK[i11] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC4862t.e(from, "from");
        m();
        E(from.entrySet());
    }

    public final boolean q(Map map) {
        return size() == map.size() && o(map.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m();
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        Object[] objArr = this.f36492b;
        AbstractC4862t.b(objArr);
        Object obj2 = objArr[iU];
        M(iU);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A();
    }

    public final b t() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarT = t();
        int i10 = 0;
        while (bVarT.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarT.i(sb2);
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public final int u(Object obj) {
        int iC = C(obj);
        int i10 = this.f36495e;
        while (true) {
            int i11 = this.f36494d[iC];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (AbstractC4862t.a(this.f36491a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iC = iC == 0 ? y() - 1 : iC - 1;
        }
    }

    public final int v(Object obj) {
        int i10 = this.f36496f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f36493c[i10] >= 0) {
                Object[] objArr = this.f36492b;
                AbstractC4862t.b(objArr);
                if (AbstractC4862t.a(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return B();
    }

    public final int w() {
        return this.f36491a.length;
    }

    public Set x() {
        hc.e eVar = this.f36502l;
        if (eVar != null) {
            return eVar;
        }
        hc.e eVar2 = new hc.e(this);
        this.f36502l = eVar2;
        return eVar2;
    }

    public final int y() {
        return this.f36494d.length;
    }

    public Set z() {
        hc.f fVar = this.f36500j;
        if (fVar != null) {
            return fVar;
        }
        hc.f fVar2 = new hc.f(this);
        this.f36500j = fVar2;
        return fVar2;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(hc.c.d(i10), null, new int[i10], new int[f36489n.c(i10)], 2, 0);
    }
}
