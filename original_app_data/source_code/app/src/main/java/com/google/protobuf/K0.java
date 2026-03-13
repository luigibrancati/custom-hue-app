package com.google.protobuf;

import com.google.protobuf.O;
import com.google.protobuf.R0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final K0 f32120f = new K0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f32122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f32123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32125e;

    public K0() {
        this(0, new int[8], new Object[8], true);
    }

    public static K0 c() {
        return f32120f;
    }

    public static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    public static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    public static K0 n(K0 k02, K0 k03) {
        int i10 = k02.f32121a + k03.f32121a;
        int[] iArrCopyOf = Arrays.copyOf(k02.f32122b, i10);
        System.arraycopy(k03.f32122b, 0, iArrCopyOf, k02.f32121a, k03.f32121a);
        Object[] objArrCopyOf = Arrays.copyOf(k02.f32123c, i10);
        System.arraycopy(k03.f32123c, 0, objArrCopyOf, k02.f32121a, k03.f32121a);
        return new K0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static K0 o() {
        return new K0();
    }

    public static boolean p(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static void u(int i10, Object obj, R0 r02) {
        int iA = Q0.a(i10);
        int iB = Q0.b(i10);
        if (iB == 0) {
            r02.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            r02.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            r02.L(iA, (AbstractC3722j) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(O.e());
            }
            r02.c(iA, ((Integer) obj).intValue());
        } else if (r02.t() == R0.a.ASCENDING) {
            r02.x(iA);
            ((K0) obj).v(r02);
            r02.C(iA);
        } else {
            r02.C(iA);
            ((K0) obj).v(r02);
            r02.x(iA);
        }
    }

    public void a() {
        if (!this.f32125e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f32122b;
        if (i10 > iArr.length) {
            int i11 = this.f32121a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f32122b = Arrays.copyOf(iArr, i10);
            this.f32123c = Arrays.copyOf(this.f32123c, i10);
        }
    }

    public int d() {
        int iX;
        int i10 = this.f32124d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f32121a; i12++) {
            int i13 = this.f32122b[i12];
            int iA = Q0.a(i13);
            int iB = Q0.b(i13);
            if (iB == 0) {
                iX = AbstractC3728m.X(iA, ((Long) this.f32123c[i12]).longValue());
            } else if (iB == 1) {
                iX = AbstractC3728m.p(iA, ((Long) this.f32123c[i12]).longValue());
            } else if (iB == 2) {
                iX = AbstractC3728m.h(iA, (AbstractC3722j) this.f32123c[i12]);
            } else if (iB == 3) {
                iX = (AbstractC3728m.U(iA) * 2) + ((K0) this.f32123c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(O.e());
                }
                iX = AbstractC3728m.n(iA, ((Integer) this.f32123c[i12]).intValue());
            }
            i11 += iX;
        }
        this.f32124d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f32124d;
        if (i10 != -1) {
            return i10;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < this.f32121a; i11++) {
            iJ += AbstractC3728m.J(Q0.a(this.f32122b[i11]), (AbstractC3722j) this.f32123c[i11]);
        }
        this.f32124d = iJ;
        return iJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        int i10 = this.f32121a;
        return i10 == k02.f32121a && s(this.f32122b, k02.f32122b, i10) && p(this.f32123c, k02.f32123c, this.f32121a);
    }

    public void h() {
        if (this.f32125e) {
            this.f32125e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f32121a;
        return ((((527 + i10) * 31) + f(this.f32122b, i10)) * 31) + g(this.f32123c, this.f32121a);
    }

    public boolean i(int i10, AbstractC3724k abstractC3724k) throws O.a {
        a();
        int iA = Q0.a(i10);
        int iB = Q0.b(i10);
        if (iB == 0) {
            r(i10, Long.valueOf(abstractC3724k.z()));
            return true;
        }
        if (iB == 1) {
            r(i10, Long.valueOf(abstractC3724k.v()));
            return true;
        }
        if (iB == 2) {
            r(i10, abstractC3724k.r());
            return true;
        }
        if (iB == 3) {
            K0 k02 = new K0();
            k02.j(abstractC3724k);
            abstractC3724k.a(Q0.c(iA, 4));
            r(i10, k02);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw O.e();
        }
        r(i10, Integer.valueOf(abstractC3724k.u()));
        return true;
    }

    public final K0 j(AbstractC3724k abstractC3724k) {
        int iJ;
        do {
            iJ = abstractC3724k.J();
            if (iJ == 0) {
                break;
            }
        } while (i(iJ, abstractC3724k));
        return this;
    }

    public K0 k(K0 k02) {
        if (k02.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f32121a + k02.f32121a;
        b(i10);
        System.arraycopy(k02.f32122b, 0, this.f32122b, this.f32121a, k02.f32121a);
        System.arraycopy(k02.f32123c, 0, this.f32123c, this.f32121a, k02.f32121a);
        this.f32121a = i10;
        return this;
    }

    public K0 l(int i10, AbstractC3722j abstractC3722j) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(Q0.c(i10, 2), abstractC3722j);
        return this;
    }

    public K0 m(int i10, int i11) {
        a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        r(Q0.c(i10, 0), Long.valueOf(i11));
        return this;
    }

    public final void q(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f32121a; i11++) {
            AbstractC3721i0.d(sb2, i10, String.valueOf(Q0.a(this.f32122b[i11])), this.f32123c[i11]);
        }
    }

    public void r(int i10, Object obj) {
        a();
        b(this.f32121a + 1);
        int[] iArr = this.f32122b;
        int i11 = this.f32121a;
        iArr[i11] = i10;
        this.f32123c[i11] = obj;
        this.f32121a = i11 + 1;
    }

    public void t(R0 r02) {
        if (r02.t() == R0.a.DESCENDING) {
            for (int i10 = this.f32121a - 1; i10 >= 0; i10--) {
                r02.b(Q0.a(this.f32122b[i10]), this.f32123c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f32121a; i11++) {
            r02.b(Q0.a(this.f32122b[i11]), this.f32123c[i11]);
        }
    }

    public void v(R0 r02) {
        if (this.f32121a == 0) {
            return;
        }
        if (r02.t() == R0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f32121a; i10++) {
                u(this.f32122b[i10], this.f32123c[i10], r02);
            }
            return;
        }
        for (int i11 = this.f32121a - 1; i11 >= 0; i11--) {
            u(this.f32122b[i11], this.f32123c[i11], r02);
        }
    }

    public K0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f32124d = -1;
        this.f32121a = i10;
        this.f32122b = iArr;
        this.f32123c = objArr;
        this.f32125e = z10;
    }
}
