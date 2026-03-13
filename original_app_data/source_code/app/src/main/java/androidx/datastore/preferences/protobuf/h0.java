package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f22835f = new h0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f22837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f22838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22840e;

    public h0() {
        this(0, new int[8], new Object[8], true);
    }

    public static h0 c() {
        return f22835f;
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

    public static h0 j(h0 h0Var, h0 h0Var2) {
        int i10 = h0Var.f22836a + h0Var2.f22836a;
        int[] iArrCopyOf = Arrays.copyOf(h0Var.f22837b, i10);
        System.arraycopy(h0Var2.f22837b, 0, iArrCopyOf, h0Var.f22836a, h0Var2.f22836a);
        Object[] objArrCopyOf = Arrays.copyOf(h0Var.f22838c, i10);
        System.arraycopy(h0Var2.f22838c, 0, objArrCopyOf, h0Var.f22836a, h0Var2.f22836a);
        return new h0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static h0 k() {
        return new h0();
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

    public static void q(int i10, Object obj, m0 m0Var) {
        int iA = l0.a(i10);
        int iB = l0.b(i10);
        if (iB == 0) {
            m0Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            m0Var.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            m0Var.K(iA, (AbstractC2700f) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C2715v.e());
            }
            m0Var.c(iA, ((Integer) obj).intValue());
        } else if (m0Var.t() == m0.a.ASCENDING) {
            m0Var.x(iA);
            ((h0) obj).r(m0Var);
            m0Var.C(iA);
        } else {
            m0Var.C(iA);
            ((h0) obj).r(m0Var);
            m0Var.x(iA);
        }
    }

    public void a() {
        if (!this.f22840e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i10) {
        int[] iArr = this.f22837b;
        if (i10 > iArr.length) {
            int i11 = this.f22836a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f22837b = Arrays.copyOf(iArr, i10);
            this.f22838c = Arrays.copyOf(this.f22838c, i10);
        }
    }

    public int d() {
        int iU;
        int i10 = this.f22839d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f22836a; i12++) {
            int i13 = this.f22837b[i12];
            int iA = l0.a(i13);
            int iB = l0.b(i13);
            if (iB == 0) {
                iU = AbstractC2703i.U(iA, ((Long) this.f22838c[i12]).longValue());
            } else if (iB == 1) {
                iU = AbstractC2703i.o(iA, ((Long) this.f22838c[i12]).longValue());
            } else if (iB == 2) {
                iU = AbstractC2703i.g(iA, (AbstractC2700f) this.f22838c[i12]);
            } else if (iB == 3) {
                iU = (AbstractC2703i.R(iA) * 2) + ((h0) this.f22838c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C2715v.e());
                }
                iU = AbstractC2703i.m(iA, ((Integer) this.f22838c[i12]).intValue());
            }
            i11 += iU;
        }
        this.f22839d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f22839d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f22836a; i11++) {
            iG += AbstractC2703i.G(l0.a(this.f22837b[i11]), (AbstractC2700f) this.f22838c[i11]);
        }
        this.f22839d = iG;
        return iG;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        int i10 = this.f22836a;
        return i10 == h0Var.f22836a && o(this.f22837b, h0Var.f22837b, i10) && l(this.f22838c, h0Var.f22838c, this.f22836a);
    }

    public void h() {
        if (this.f22840e) {
            this.f22840e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f22836a;
        return ((((527 + i10) * 31) + f(this.f22837b, i10)) * 31) + g(this.f22838c, this.f22836a);
    }

    public h0 i(h0 h0Var) {
        if (h0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f22836a + h0Var.f22836a;
        b(i10);
        System.arraycopy(h0Var.f22837b, 0, this.f22837b, this.f22836a, h0Var.f22836a);
        System.arraycopy(h0Var.f22838c, 0, this.f22838c, this.f22836a, h0Var.f22836a);
        this.f22836a = i10;
        return this;
    }

    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f22836a; i11++) {
            M.d(sb2, i10, String.valueOf(l0.a(this.f22837b[i11])), this.f22838c[i11]);
        }
    }

    public void n(int i10, Object obj) {
        a();
        b(this.f22836a + 1);
        int[] iArr = this.f22837b;
        int i11 = this.f22836a;
        iArr[i11] = i10;
        this.f22838c[i11] = obj;
        this.f22836a = i11 + 1;
    }

    public void p(m0 m0Var) {
        if (m0Var.t() == m0.a.DESCENDING) {
            for (int i10 = this.f22836a - 1; i10 >= 0; i10--) {
                m0Var.b(l0.a(this.f22837b[i10]), this.f22838c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f22836a; i11++) {
            m0Var.b(l0.a(this.f22837b[i11]), this.f22838c[i11]);
        }
    }

    public void r(m0 m0Var) {
        if (this.f22836a == 0) {
            return;
        }
        if (m0Var.t() == m0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f22836a; i10++) {
                q(this.f22837b[i10], this.f22838c[i10], m0Var);
            }
            return;
        }
        for (int i11 = this.f22836a - 1; i11 >= 0; i11--) {
            q(this.f22837b[i11], this.f22838c[i11], m0Var);
        }
    }

    public h0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f22839d = -1;
        this.f22836a = i10;
        this.f22837b = iArr;
        this.f22838c = objArr;
        this.f22840e = z10;
    }
}
