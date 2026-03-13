package b0;

import c0.AbstractC2926a;
import gc.C4202o;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class K implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f24854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f24855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f24856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f24857d;

    public K() {
        this(0, 1, null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f24857d;
        if (i11 != 0 && i10 <= this.f24855b[i11 - 1]) {
            n(i10, obj);
            return;
        }
        if (this.f24854a && i11 >= this.f24855b.length) {
            L.e(this);
        }
        int i12 = this.f24857d;
        if (i12 >= this.f24855b.length) {
            int iE = AbstractC2926a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f24855b, iE);
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f24855b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24856c, iE);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f24856c = objArrCopyOf;
        }
        this.f24855b[i12] = i10;
        this.f24856c[i12] = obj;
        this.f24857d = i12 + 1;
    }

    public void e() {
        int i10 = this.f24857d;
        Object[] objArr = this.f24856c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24857d = 0;
        this.f24854a = false;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public K clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC4862t.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        K k10 = (K) objClone;
        k10.f24855b = (int[]) this.f24855b.clone();
        k10.f24856c = (Object[]) this.f24856c.clone();
        return k10;
    }

    public Object i(int i10) {
        return L.c(this, i10);
    }

    public int j(Object obj) {
        if (this.f24854a) {
            L.e(this);
        }
        int i10 = this.f24857d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24856c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int m(int i10) {
        if (this.f24854a) {
            L.e(this);
        }
        return this.f24855b[i10];
    }

    public void n(int i10, Object obj) {
        int iA = AbstractC2926a.a(this.f24855b, this.f24857d, i10);
        if (iA >= 0) {
            this.f24856c[iA] = obj;
            return;
        }
        int i11 = ~iA;
        if (i11 < this.f24857d && this.f24856c[i11] == L.f24858a) {
            this.f24855b[i11] = i10;
            this.f24856c[i11] = obj;
            return;
        }
        if (this.f24854a && this.f24857d >= this.f24855b.length) {
            L.e(this);
            i11 = ~AbstractC2926a.a(this.f24855b, this.f24857d, i10);
        }
        int i12 = this.f24857d;
        if (i12 >= this.f24855b.length) {
            int iE = AbstractC2926a.e(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f24855b, iE);
            AbstractC4862t.d(iArrCopyOf, "copyOf(...)");
            this.f24855b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f24856c, iE);
            AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
            this.f24856c = objArrCopyOf;
        }
        int i13 = this.f24857d;
        if (i13 - i11 != 0) {
            int[] iArr = this.f24855b;
            int i14 = i11 + 1;
            C4202o.k(iArr, iArr, i14, i11, i13);
            Object[] objArr = this.f24856c;
            C4202o.m(objArr, objArr, i14, i11, this.f24857d);
        }
        this.f24855b[i11] = i10;
        this.f24856c[i11] = obj;
        this.f24857d++;
    }

    public void o(int i10) {
        L.d(this, i10);
    }

    public void p(int i10) {
        if (this.f24856c[i10] != L.f24858a) {
            this.f24856c[i10] = L.f24858a;
            this.f24854a = true;
        }
    }

    public int q() {
        if (this.f24854a) {
            L.e(this);
        }
        return this.f24857d;
    }

    public Object r(int i10) {
        if (this.f24854a) {
            L.e(this);
        }
        Object[] objArr = this.f24856c;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        C2783g c2783g = C2783g.f24894a;
        throw new ArrayIndexOutOfBoundsException();
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24857d * 28);
        sb2.append('{');
        int i10 = this.f24857d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m(i11));
            sb2.append('=');
            Object objR = r(i11);
            if (objR != this) {
                sb2.append(objR);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }

    public K(int i10) {
        if (i10 == 0) {
            this.f24855b = AbstractC2926a.f25519a;
            this.f24856c = AbstractC2926a.f25521c;
        } else {
            int iE = AbstractC2926a.e(i10);
            this.f24855b = new int[iE];
            this.f24856c = new Object[iE];
        }
    }

    public /* synthetic */ K(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
