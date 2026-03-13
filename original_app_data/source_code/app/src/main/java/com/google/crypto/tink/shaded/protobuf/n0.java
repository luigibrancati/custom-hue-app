package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n0 f31522f = new n0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f31524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f31525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31527e;

    public n0() {
        this(0, new int[8], new Object[8], true);
    }

    public static n0 c() {
        return f31522f;
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

    public static n0 j(n0 n0Var, n0 n0Var2) {
        int i10 = n0Var.f31523a + n0Var2.f31523a;
        int[] iArrCopyOf = Arrays.copyOf(n0Var.f31524b, i10);
        System.arraycopy(n0Var2.f31524b, 0, iArrCopyOf, n0Var.f31523a, n0Var2.f31523a);
        Object[] objArrCopyOf = Arrays.copyOf(n0Var.f31525c, i10);
        System.arraycopy(n0Var2.f31525c, 0, objArrCopyOf, n0Var.f31523a, n0Var2.f31523a);
        return new n0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static n0 k() {
        return new n0();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i10, Object obj, s0 s0Var) {
        int iA = r0.a(i10);
        int iB = r0.b(i10);
        if (iB == 0) {
            s0Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            s0Var.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            s0Var.M(iA, (AbstractC3661h) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(A.e());
            }
            s0Var.c(iA, ((Integer) obj).intValue());
        } else if (s0Var.t() == s0.a.ASCENDING) {
            s0Var.x(iA);
            ((n0) obj).r(s0Var);
            s0Var.C(iA);
        } else {
            s0Var.C(iA);
            ((n0) obj).r(s0Var);
            s0Var.x(iA);
        }
    }

    public void a() {
        if (!this.f31527e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f31524b;
        if (i10 > iArr.length) {
            int i11 = this.f31523a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f31524b = Arrays.copyOf(iArr, i10);
            this.f31525c = Arrays.copyOf(this.f31525c, i10);
        }
    }

    public int d() {
        int iQ;
        int i10 = this.f31526d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f31523a; i12++) {
            int i13 = this.f31524b[i12];
            int iA = r0.a(i13);
            int iB = r0.b(i13);
            if (iB == 0) {
                iQ = AbstractC3664k.Q(iA, ((Long) this.f31525c[i12]).longValue());
            } else if (iB == 1) {
                iQ = AbstractC3664k.o(iA, ((Long) this.f31525c[i12]).longValue());
            } else if (iB == 2) {
                iQ = AbstractC3664k.g(iA, (AbstractC3661h) this.f31525c[i12]);
            } else if (iB == 3) {
                iQ = (AbstractC3664k.N(iA) * 2) + ((n0) this.f31525c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(A.e());
                }
                iQ = AbstractC3664k.m(iA, ((Integer) this.f31525c[i12]).intValue());
            }
            i11 += iQ;
        }
        this.f31526d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f31526d;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.f31523a; i11++) {
            iC += AbstractC3664k.C(r0.a(this.f31524b[i11]), (AbstractC3661h) this.f31525c[i11]);
        }
        this.f31526d = iC;
        return iC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i10 = this.f31523a;
        return i10 == n0Var.f31523a && o(this.f31524b, n0Var.f31524b, i10) && l(this.f31525c, n0Var.f31525c, this.f31523a);
    }

    public void h() {
        if (this.f31527e) {
            this.f31527e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f31523a;
        return ((((527 + i10) * 31) + f(this.f31524b, i10)) * 31) + g(this.f31525c, this.f31523a);
    }

    public n0 i(n0 n0Var) {
        if (n0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f31523a + n0Var.f31523a;
        b(i10);
        System.arraycopy(n0Var.f31524b, 0, this.f31524b, this.f31523a, n0Var.f31523a);
        System.arraycopy(n0Var.f31525c, 0, this.f31525c, this.f31523a, n0Var.f31523a);
        this.f31523a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f31523a; i11++) {
            T.d(sb2, i10, String.valueOf(r0.a(this.f31524b[i11])), this.f31525c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f31523a + 1);
        int[] iArr = this.f31524b;
        int i11 = this.f31523a;
        iArr[i11] = i10;
        this.f31525c[i11] = obj;
        this.f31523a = i11 + 1;
    }

    public void p(s0 s0Var) {
        if (s0Var.t() == s0.a.DESCENDING) {
            for (int i10 = this.f31523a - 1; i10 >= 0; i10--) {
                s0Var.b(r0.a(this.f31524b[i10]), this.f31525c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f31523a; i11++) {
            s0Var.b(r0.a(this.f31524b[i11]), this.f31525c[i11]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f31523a == 0) {
            return;
        }
        if (s0Var.t() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f31523a; i10++) {
                q(this.f31524b[i10], this.f31525c[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f31523a - 1; i11 >= 0; i11--) {
            q(this.f31524b[i11], this.f31525c[i11], s0Var);
        }
    }

    public n0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f31526d = -1;
        this.f31523a = i10;
        this.f31524b = iArr;
        this.f31525c = objArr;
        this.f31527e = z10;
    }
}
