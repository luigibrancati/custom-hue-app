package b0;

import c0.AbstractC2926a;
import gc.C4202o;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f24851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f24852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24853c;

    public J() {
        this(0, 1, null);
    }

    public final int a(Object obj) {
        int i10 = this.f24853c * 2;
        Object[] objArr = this.f24852b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (AbstractC4862t.a(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f24853c;
        int[] iArr = this.f24851a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f24851a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24852b, i10 * 2);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f24852b = objArrCopyOf;
        }
        if (this.f24853c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(Object obj, int i10) {
        int i11 = this.f24853c;
        if (i11 == 0) {
            return -1;
        }
        int iA = AbstractC2926a.a(this.f24851a, i11, i10);
        if (iA < 0 || AbstractC4862t.a(obj, this.f24852b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f24851a[i12] == i10) {
            if (AbstractC4862t.a(obj, this.f24852b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f24851a[i13] == i10; i13--) {
            if (AbstractC4862t.a(obj, this.f24852b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public void clear() {
        if (this.f24853c > 0) {
            this.f24851a = AbstractC2926a.f25519a;
            this.f24852b = AbstractC2926a.f25521c;
            this.f24853c = 0;
        }
        if (this.f24853c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public final int e() {
        int i10 = this.f24853c;
        if (i10 == 0) {
            return -1;
        }
        int iA = AbstractC2926a.a(this.f24851a, i10, 0);
        if (iA < 0 || this.f24852b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f24851a[i11] == 0) {
            if (this.f24852b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f24851a[i12] == 0; i12--) {
            if (this.f24852b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof J) {
                if (size() != ((J) obj).size()) {
                    return false;
                }
                J j10 = (J) obj;
                int i10 = this.f24853c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objJ = j(i11);
                    Object obj2 = j10.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !j10.containsKey(objF)) {
                            return false;
                        }
                    } else if (!AbstractC4862t.a(objJ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f24853c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!AbstractC4862t.a(objJ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24853c) {
            z10 = true;
        }
        if (!z10) {
            c0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f24852b[i10 << 1];
    }

    public void g(J map) {
        AbstractC4862t.e(map, "map");
        int i10 = map.f24853c;
        b(this.f24853c + i10);
        if (this.f24853c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.f(i11), map.j(i11));
            }
        } else if (i10 > 0) {
            C4202o.k(map.f24851a, this.f24851a, 0, 0, i10);
            C4202o.m(map.f24852b, this.f24852b, 0, 0, i10 << 1);
            this.f24853c = i10;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f24852b[(iD << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f24852b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        if (!(i10 >= 0 && i10 < this.f24853c)) {
            c0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f24852b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f24853c;
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f24851a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                C4202o.k(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f24852b;
                C4202o.m(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f24852b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f24851a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24852b, i16 << 1);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f24852b = objArrCopyOf;
            if (i12 != this.f24853c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                C4202o.k(iArr, this.f24851a, 0, 0, i10);
                C4202o.m(objArr, this.f24852b, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                C4202o.k(iArr, this.f24851a, i10, i17, i12);
                C4202o.m(objArr, this.f24852b, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 != this.f24853c) {
            throw new ConcurrentModificationException();
        }
        this.f24853c = i13;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f24851a;
        Object[] objArr = this.f24852b;
        int i10 = this.f24853c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24853c) {
            z10 = true;
        }
        if (!z10) {
            c0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f24852b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f24853c <= 0;
    }

    public Object j(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f24853c) {
            z10 = true;
        }
        if (!z10) {
            c0.d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f24852b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f24853c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(obj, iHashCode) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f24852b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f24851a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f24851a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24852b, i13 << 1);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f24852b = objArrCopyOf;
            if (i10 != this.f24853c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f24851a;
            int i14 = i12 + 1;
            C4202o.k(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f24852b;
            C4202o.m(objArr2, objArr2, i14 << 1, i12 << 1, this.f24853c << 1);
        }
        int i15 = this.f24853c;
        if (i10 == i15) {
            int[] iArr3 = this.f24851a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f24852b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f24853c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public int size() {
        return this.f24853c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24853c * 28);
        sb2.append('{');
        int i10 = this.f24853c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i11);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public J(int i10) {
        this.f24851a = i10 == 0 ? AbstractC2926a.f25519a : new int[i10];
        this.f24852b = i10 == 0 ? AbstractC2926a.f25521c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC4862t.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !AbstractC4862t.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public /* synthetic */ J(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public J(J j10) {
        this(0, 1, null);
        if (j10 != null) {
            g(j10);
        }
    }
}
