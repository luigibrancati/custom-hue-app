package N6;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: N6.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1358j0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f10329j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f10330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f10331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f10332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f10333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f10334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f10335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Set f10336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Set f10337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient Collection f10338i;

    public C1358j0(int i10) {
        s(12);
    }

    public static /* synthetic */ Object j(C1358j0 c1358j0, int i10) {
        return c1358j0.b()[i10];
    }

    public static /* synthetic */ Object l(C1358j0 c1358j0) {
        Object obj = c1358j0.f10330a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object m(C1358j0 c1358j0, int i10) {
        return c1358j0.c()[i10];
    }

    public static /* synthetic */ void q(C1358j0 c1358j0, int i10, Object obj) {
        c1358j0.c()[i10] = obj;
    }

    public final int A(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objD = AbstractC1371k0.d(i11);
        if (i13 != 0) {
            AbstractC1371k0.e(objD, i12 & i14, i13 + 1);
        }
        Object obj = this.f10330a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iC = AbstractC1371k0.c(obj, i15);
            while (iC != 0) {
                int i16 = iC - 1;
                int i17 = iArrA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iC2 = AbstractC1371k0.c(objD, i19);
                AbstractC1371k0.e(objD, i19, iC);
                iArrA[i16] = ((~i14) & i18) | (iC2 & i14);
                iC = i17 & i10;
            }
        }
        this.f10330a = objD;
        C(i14);
        return i14;
    }

    public final Object B(Object obj) {
        if (!u()) {
            int iY = y();
            Object obj2 = this.f10330a;
            Objects.requireNonNull(obj2);
            int iB = AbstractC1371k0.b(obj, null, iY, obj2, a(), b(), null);
            if (iB != -1) {
                Object obj3 = c()[iB];
                t(iB, iY);
                this.f10335f--;
                r();
                return obj3;
            }
        }
        return f10329j;
    }

    public final void C(int i10) {
        this.f10334e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f10334e & (-32));
    }

    public final int[] a() {
        int[] iArr = this.f10331b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f10332c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f10333d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (u()) {
            return;
        }
        r();
        Map mapO = o();
        if (mapO != null) {
            this.f10334e = V0.a(size(), 3, 1073741823);
            mapO.clear();
            this.f10330a = null;
            this.f10335f = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f10335f, (Object) null);
        Arrays.fill(c(), 0, this.f10335f, (Object) null);
        Object obj = this.f10330a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f10335f, 0);
        this.f10335f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapO = o();
        return mapO != null ? mapO.containsKey(obj) : z(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f10335f; i10++) {
            if (AbstractC1538x.a(obj, c()[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f10337h;
        if (set != null) {
            return set;
        }
        C1280d0 c1280d0 = new C1280d0(this);
        this.f10337h = c1280d0;
        return c1280d0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.get(obj);
        }
        int iZ = z(obj);
        if (iZ == -1) {
            return null;
        }
        return c()[iZ];
    }

    public final int h() {
        return isEmpty() ? -1 : 0;
    }

    public final int i(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f10335f) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f10336g;
        if (set != null) {
            return set;
        }
        C1319g0 c1319g0 = new C1319g0(this);
        this.f10336g = c1319g0;
        return c1319g0;
    }

    public final Map o() {
        Object obj = this.f10330a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (u()) {
            AbstractC1564z.f(u(), "Arrays already allocated");
            int i11 = this.f10334e;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f10330a = AbstractC1371k0.d(iMax2);
            C(iMax2 - 1);
            this.f10331b = new int[i11];
            this.f10332c = new Object[i11];
            this.f10333d = new Object[i11];
        }
        Map mapO = o();
        if (mapO != null) {
            return mapO.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f10335f;
        int i13 = i12 + 1;
        int iA = AbstractC1384l0.a(obj);
        int iY = y();
        int i14 = iA & iY;
        Object obj3 = this.f10330a;
        Objects.requireNonNull(obj3);
        int iC = AbstractC1371k0.c(obj3, i14);
        if (iC == 0) {
            if (i13 > iY) {
                iY = A(iY, AbstractC1371k0.a(iY), iA, i12);
            } else {
                Object obj4 = this.f10330a;
                Objects.requireNonNull(obj4);
                AbstractC1371k0.e(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iY;
            int i16 = iA & i15;
            int i17 = 0;
            while (true) {
                int i18 = iC - 1;
                int i19 = iArrA[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && AbstractC1538x.a(obj, objArrB[i18])) {
                    Object obj5 = objArrC[i18];
                    objArrC[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iY;
                i17++;
                if (i21 != 0) {
                    iC = i21;
                } else {
                    if (i17 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(y() + 1, 1.0f);
                        int iH = h();
                        while (iH >= 0) {
                            linkedHashMap.put(b()[iH], c()[iH]);
                            iH = i(iH);
                        }
                        this.f10330a = linkedHashMap;
                        this.f10331b = null;
                        this.f10332c = null;
                        this.f10333d = null;
                        r();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iY) {
                        iY = A(iY, AbstractC1371k0.a(iY), iA, i12);
                    } else {
                        iArrA[i18] = (i13 & iY) | i20;
                    }
                }
            }
        }
        int length = a().length;
        if (i13 > length) {
            int i22 = i10;
            int iMin = Math.min(1073741823, (Math.max(i22, length >>> 1) + length) | i22);
            if (iMin != length) {
                this.f10331b = Arrays.copyOf(a(), iMin);
                this.f10332c = Arrays.copyOf(b(), iMin);
                this.f10333d = Arrays.copyOf(c(), iMin);
            }
        }
        a()[i12] = (~iY) & iA;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f10335f = i13;
        r();
        return null;
    }

    public final void r() {
        this.f10334e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapO = o();
        if (mapO != null) {
            return mapO.remove(obj);
        }
        Object objB = B(obj);
        if (objB == f10329j) {
            return null;
        }
        return objB;
    }

    public final void s(int i10) {
        this.f10334e = V0.a(i10, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapO = o();
        return mapO != null ? mapO.size() : this.f10335f;
    }

    public final void t(int i10, int i11) {
        Object obj = this.f10330a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrB[i10] = null;
            objArrC[i10] = null;
            iArrA[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrB[i12];
        objArrB[i10] = obj2;
        objArrC[i10] = objArrC[i12];
        objArrB[i12] = null;
        objArrC[i12] = null;
        iArrA[i10] = iArrA[i12];
        iArrA[i12] = 0;
        int iA = AbstractC1384l0.a(obj2) & i11;
        int iC = AbstractC1371k0.c(obj, iA);
        if (iC == size) {
            AbstractC1371k0.e(obj, iA, i13);
            return;
        }
        while (true) {
            int i14 = iC - 1;
            int i15 = iArrA[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrA[i14] = ((~i11) & i15) | (i13 & i11);
                return;
            }
            iC = i16;
        }
    }

    public final boolean u() {
        return this.f10330a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f10338i;
        if (collection != null) {
            return collection;
        }
        C1345i0 c1345i0 = new C1345i0(this);
        this.f10338i = c1345i0;
        return c1345i0;
    }

    public final int y() {
        return (1 << (this.f10334e & 31)) - 1;
    }

    public final int z(Object obj) {
        if (u()) {
            return -1;
        }
        int iA = AbstractC1384l0.a(obj);
        int iY = y();
        Object obj2 = this.f10330a;
        Objects.requireNonNull(obj2);
        int iC = AbstractC1371k0.c(obj2, iA & iY);
        if (iC != 0) {
            int i10 = ~iY;
            int i11 = iA & i10;
            do {
                int i12 = iC - 1;
                int i13 = a()[i12];
                if ((i13 & i10) == i11 && AbstractC1538x.a(obj, b()[i12])) {
                    return i12;
                }
                iC = i13 & iY;
            } while (iC != 0);
        }
        return -1;
    }
}
