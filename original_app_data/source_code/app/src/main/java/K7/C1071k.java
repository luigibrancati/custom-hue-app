package K7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: K7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C1071k extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f7679j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f7680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f7681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f7682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f7683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f7684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f7685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Set f7686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Set f7687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient Collection f7688i;

    /* JADX INFO: renamed from: K7.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends e {
        public a() {
            super(C1071k.this, null);
        }

        @Override // K7.C1071k.e
        public Object b(int i10) {
            return C1071k.this.I(i10);
        }
    }

    /* JADX INFO: renamed from: K7.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends e {
        public b() {
            super(C1071k.this, null);
        }

        @Override // K7.C1071k.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry b(int i10) {
            return C1071k.this.new g(i10);
        }
    }

    /* JADX INFO: renamed from: K7.k$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends e {
        public c() {
            super(C1071k.this, null);
        }

        @Override // K7.C1071k.e
        public Object b(int i10) {
            return C1071k.this.Y(i10);
        }
    }

    /* JADX INFO: renamed from: K7.k$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1071k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map mapX = C1071k.this.x();
            if (mapX != null) {
                return mapX.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iE = C1071k.this.E(entry.getKey());
                if (iE != -1 && J7.j.a(C1071k.this.Y(iE), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C1071k.this.z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iC;
            int iF;
            Map mapX = C1071k.this.x();
            if (mapX != null) {
                return mapX.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C1071k.this.L() || (iF = AbstractC1072l.f(entry.getKey(), entry.getValue(), (iC = C1071k.this.C()), C1071k.this.P(), C1071k.this.N(), C1071k.this.O(), C1071k.this.Q())) == -1) {
                return false;
            }
            C1071k.this.K(iF, iC);
            C1071k.e(C1071k.this);
            C1071k.this.D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1071k.this.size();
        }
    }

    /* JADX INFO: renamed from: K7.k$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1071k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C1071k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C1071k.this.J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map mapX = C1071k.this.x();
            return mapX != null ? mapX.keySet().remove(obj) : C1071k.this.M(obj) != C1071k.f7679j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1071k.this.size();
        }
    }

    /* JADX INFO: renamed from: K7.k$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class g extends AbstractC1065e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7699b;

        public g(int i10) {
            this.f7698a = C1071k.this.I(i10);
            this.f7699b = i10;
        }

        public final void a() {
            int i10 = this.f7699b;
            if (i10 == -1 || i10 >= C1071k.this.size() || !J7.j.a(this.f7698a, C1071k.this.I(this.f7699b))) {
                this.f7699b = C1071k.this.E(this.f7698a);
            }
        }

        @Override // K7.AbstractC1065e, java.util.Map.Entry
        public Object getKey() {
            return this.f7698a;
        }

        @Override // K7.AbstractC1065e, java.util.Map.Entry
        public Object getValue() {
            Map mapX = C1071k.this.x();
            if (mapX != null) {
                return K.a(mapX.get(this.f7698a));
            }
            a();
            int i10 = this.f7699b;
            return i10 == -1 ? K.b() : C1071k.this.Y(i10);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map mapX = C1071k.this.x();
            if (mapX != null) {
                return K.a(mapX.put(this.f7698a, obj));
            }
            a();
            int i10 = this.f7699b;
            if (i10 == -1) {
                C1071k.this.put(this.f7698a, obj);
                return K.b();
            }
            Object objY = C1071k.this.Y(i10);
            C1071k.this.X(this.f7699b, obj);
            return objY;
        }
    }

    /* JADX INFO: renamed from: K7.k$h */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C1071k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C1071k.this.Z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C1071k.this.size();
        }
    }

    public C1071k() {
        F(3);
    }

    public static /* synthetic */ int e(C1071k c1071k) {
        int i10 = c1071k.f7685f;
        c1071k.f7685f = i10 - 1;
        return i10;
    }

    public static C1071k r() {
        return new C1071k();
    }

    public static C1071k w(int i10) {
        return new C1071k(i10);
    }

    public int A() {
        return isEmpty() ? -1 : 0;
    }

    public int B(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f7685f) {
            return i11;
        }
        return -1;
    }

    public final int C() {
        return (1 << (this.f7684e & 31)) - 1;
    }

    public void D() {
        this.f7684e += 32;
    }

    public final int E(Object obj) {
        if (L()) {
            return -1;
        }
        int iC = AbstractC1078s.c(obj);
        int iC2 = C();
        int iH = AbstractC1072l.h(P(), iC & iC2);
        if (iH == 0) {
            return -1;
        }
        int iB = AbstractC1072l.b(iC, iC2);
        do {
            int i10 = iH - 1;
            int iY = y(i10);
            if (AbstractC1072l.b(iY, iC2) == iB && J7.j.a(obj, I(i10))) {
                return i10;
            }
            iH = AbstractC1072l.c(iY, iC2);
        } while (iH != 0);
        return -1;
    }

    public void F(int i10) {
        J7.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f7684e = N7.g.g(i10, 1, 1073741823);
    }

    public void G(int i10, Object obj, Object obj2, int i11, int i12) {
        U(i10, AbstractC1072l.d(i11, 0, i12));
        W(i10, obj);
        X(i10, obj2);
    }

    public final Object I(int i10) {
        return O()[i10];
    }

    public Iterator J() {
        Map mapX = x();
        return mapX != null ? mapX.keySet().iterator() : new a();
    }

    public void K(int i10, int i11) {
        Object objP = P();
        int[] iArrN = N();
        Object[] objArrO = O();
        Object[] objArrQ = Q();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrO[i10] = null;
            objArrQ[i10] = null;
            iArrN[i10] = 0;
            return;
        }
        Object obj = objArrO[i12];
        objArrO[i10] = obj;
        objArrQ[i10] = objArrQ[i12];
        objArrO[i12] = null;
        objArrQ[i12] = null;
        iArrN[i10] = iArrN[i12];
        iArrN[i12] = 0;
        int iC = AbstractC1078s.c(obj) & i11;
        int iH = AbstractC1072l.h(objP, iC);
        if (iH == size) {
            AbstractC1072l.i(objP, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrN[i13];
            int iC2 = AbstractC1072l.c(i14, i11);
            if (iC2 == size) {
                iArrN[i13] = AbstractC1072l.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    public boolean L() {
        return this.f7680a == null;
    }

    public final Object M(Object obj) {
        if (L()) {
            return f7679j;
        }
        int iC = C();
        int iF = AbstractC1072l.f(obj, null, iC, P(), N(), O(), null);
        if (iF == -1) {
            return f7679j;
        }
        Object objY = Y(iF);
        K(iF, iC);
        this.f7685f--;
        D();
        return objY;
    }

    public final int[] N() {
        int[] iArr = this.f7681b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] O() {
        Object[] objArr = this.f7682c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object P() {
        Object obj = this.f7680a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] Q() {
        Object[] objArr = this.f7683d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void R(int i10) {
        this.f7681b = Arrays.copyOf(N(), i10);
        this.f7682c = Arrays.copyOf(O(), i10);
        this.f7683d = Arrays.copyOf(Q(), i10);
    }

    public final void S(int i10) {
        int iMin;
        int length = N().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        R(iMin);
    }

    public final int T(int i10, int i11, int i12, int i13) {
        Object objA = AbstractC1072l.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            AbstractC1072l.i(objA, i12 & i14, i13 + 1);
        }
        Object objP = P();
        int[] iArrN = N();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = AbstractC1072l.h(objP, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrN[i16];
                int iB = AbstractC1072l.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = AbstractC1072l.h(objA, i18);
                AbstractC1072l.i(objA, i18, iH);
                iArrN[i16] = AbstractC1072l.d(iB, iH2, i14);
                iH = AbstractC1072l.c(i17, i10);
            }
        }
        this.f7680a = objA;
        V(i14);
        return i14;
    }

    public final void U(int i10, int i11) {
        N()[i10] = i11;
    }

    public final void V(int i10) {
        this.f7684e = AbstractC1072l.d(this.f7684e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public final void W(int i10, Object obj) {
        O()[i10] = obj;
    }

    public final void X(int i10, Object obj) {
        Q()[i10] = obj;
    }

    public final Object Y(int i10) {
        return Q()[i10];
    }

    public Iterator Z() {
        Map mapX = x();
        return mapX != null ? mapX.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (L()) {
            return;
        }
        D();
        Map mapX = x();
        if (mapX != null) {
            this.f7684e = N7.g.g(size(), 3, 1073741823);
            mapX.clear();
            this.f7680a = null;
            this.f7685f = 0;
            return;
        }
        Arrays.fill(O(), 0, this.f7685f, (Object) null);
        Arrays.fill(Q(), 0, this.f7685f, (Object) null);
        AbstractC1072l.g(P());
        Arrays.fill(N(), 0, this.f7685f, 0);
        this.f7685f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map mapX = x();
        return mapX != null ? mapX.containsKey(obj) : E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map mapX = x();
        if (mapX != null) {
            return mapX.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f7685f; i10++) {
            if (J7.j.a(obj, Y(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f7687h;
        if (set != null) {
            return set;
        }
        Set setS = s();
        this.f7687h = setS;
        return setS;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map mapX = x();
        if (mapX != null) {
            return mapX.get(obj);
        }
        int iE = E(obj);
        if (iE == -1) {
            return null;
        }
        n(iE);
        return Y(iE);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f7686g;
        if (set != null) {
            return set;
        }
        Set setU = u();
        this.f7686g = setU;
        return setU;
    }

    public int o(int i10, int i11) {
        return i10 - 1;
    }

    public int p() {
        J7.n.p(L(), "Arrays already allocated");
        int i10 = this.f7684e;
        int iJ = AbstractC1072l.j(i10);
        this.f7680a = AbstractC1072l.a(iJ);
        V(iJ - 1);
        this.f7681b = new int[i10];
        this.f7682c = new Object[i10];
        this.f7683d = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (L()) {
            p();
        }
        Map mapX = x();
        if (mapX != null) {
            return mapX.put(obj, obj2);
        }
        int[] iArrN = N();
        Object[] objArrO = O();
        Object[] objArrQ = Q();
        int i10 = this.f7685f;
        int i11 = i10 + 1;
        int iC = AbstractC1078s.c(obj);
        int iC2 = C();
        int i12 = iC & iC2;
        int iH = AbstractC1072l.h(P(), i12);
        if (iH != 0) {
            int iB = AbstractC1072l.b(iC, iC2);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrN[i14];
                if (AbstractC1072l.b(i15, iC2) == iB && J7.j.a(obj, objArrO[i14])) {
                    Object obj3 = objArrQ[i14];
                    objArrQ[i14] = obj2;
                    n(i14);
                    return obj3;
                }
                int iC3 = AbstractC1072l.c(i15, iC2);
                i13++;
                if (iC3 != 0) {
                    iH = iC3;
                } else {
                    if (i13 >= 9) {
                        return q().put(obj, obj2);
                    }
                    if (i11 > iC2) {
                        iC2 = T(iC2, AbstractC1072l.e(iC2), iC, i10);
                    } else {
                        iArrN[i14] = AbstractC1072l.d(i15, i11, iC2);
                    }
                }
            }
        } else if (i11 > iC2) {
            iC2 = T(iC2, AbstractC1072l.e(iC2), iC, i10);
        } else {
            AbstractC1072l.i(P(), i12, i11);
        }
        int i16 = iC2;
        S(i11);
        G(i10, obj, obj2, iC, i16);
        this.f7685f = i11;
        D();
        return null;
    }

    public Map q() {
        Map mapT = t(C() + 1);
        int iA = A();
        while (iA >= 0) {
            mapT.put(I(iA), Y(iA));
            iA = B(iA);
        }
        this.f7680a = mapT;
        this.f7681b = null;
        this.f7682c = null;
        this.f7683d = null;
        D();
        return mapT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map mapX = x();
        if (mapX != null) {
            return mapX.remove(obj);
        }
        Object objM = M(obj);
        if (objM == f7679j) {
            return null;
        }
        return objM;
    }

    public Set s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map mapX = x();
        return mapX != null ? mapX.size() : this.f7685f;
    }

    public Map t(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    public Set u() {
        return new f();
    }

    public Collection v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f7688i;
        if (collection != null) {
            return collection;
        }
        Collection collectionV = v();
        this.f7688i = collectionV;
        return collectionV;
    }

    public Map x() {
        Object obj = this.f7680a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int y(int i10) {
        return N()[i10];
    }

    public Iterator z() {
        Map mapX = x();
        return mapX != null ? mapX.entrySet().iterator() : new b();
    }

    public C1071k(int i10) {
        F(i10);
    }

    /* JADX INFO: renamed from: K7.k$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public abstract class e implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7695c;

        public e() {
            this.f7693a = C1071k.this.f7684e;
            this.f7694b = C1071k.this.A();
            this.f7695c = -1;
        }

        public final void a() {
            if (C1071k.this.f7684e != this.f7693a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object b(int i10);

        public void c() {
            this.f7693a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7694b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f7694b;
            this.f7695c = i10;
            Object objB = b(i10);
            this.f7694b = C1071k.this.B(this.f7694b);
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            AbstractC1069i.c(this.f7695c >= 0);
            c();
            C1071k c1071k = C1071k.this;
            c1071k.remove(c1071k.I(this.f7695c));
            this.f7694b = C1071k.this.o(this.f7694b, this.f7695c);
            this.f7695c = -1;
        }

        public /* synthetic */ e(C1071k c1071k, a aVar) {
            this();
        }
    }

    public void n(int i10) {
    }
}
