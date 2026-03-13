package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class J3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J3 f30051f = new J3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f30053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f30054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30055d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30056e;

    public J3(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f30052a = i10;
        this.f30053b = iArr;
        this.f30054c = objArr;
        this.f30056e = z10;
    }

    public static J3 c() {
        return f30051f;
    }

    public static J3 e(J3 j32, J3 j33) {
        int i10 = j32.f30052a + j33.f30052a;
        int[] iArrCopyOf = Arrays.copyOf(j32.f30053b, i10);
        System.arraycopy(j33.f30053b, 0, iArrCopyOf, j32.f30052a, j33.f30052a);
        Object[] objArrCopyOf = Arrays.copyOf(j32.f30054c, i10);
        System.arraycopy(j33.f30054c, 0, objArrCopyOf, j32.f30052a, j33.f30052a);
        return new J3(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static J3 f() {
        return new J3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iB;
        int iA;
        int iB2;
        int i10 = this.f30055d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f30052a; i12++) {
            int i13 = this.f30053b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f30054c[i12]).getClass();
                    iB2 = AbstractC3638x2.B(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    AbstractC3597q2 abstractC3597q2 = (AbstractC3597q2) this.f30054c[i12];
                    int iB3 = AbstractC3638x2.B(i16);
                    int iE = abstractC3597q2.e();
                    iB2 = iB3 + AbstractC3638x2.B(iE) + iE;
                } else if (i15 == 3) {
                    int iB4 = AbstractC3638x2.B(i14 << 3);
                    iB = iB4 + iB4;
                    iA = ((J3) this.f30054c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new U2("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f30054c[i12]).getClass();
                    iB2 = AbstractC3638x2.B(i14 << 3) + 4;
                }
                i11 += iB2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f30054c[i12]).longValue();
                iB = AbstractC3638x2.B(i17);
                iA = AbstractC3638x2.a(jLongValue);
            }
            iB2 = iB + iA;
            i11 += iB2;
        }
        this.f30055d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f30055d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f30052a; i11++) {
            int i12 = this.f30053b[i11] >>> 3;
            AbstractC3597q2 abstractC3597q2 = (AbstractC3597q2) this.f30054c[i11];
            int iB2 = AbstractC3638x2.B(8);
            int iB3 = AbstractC3638x2.B(16) + AbstractC3638x2.B(i12);
            int iB4 = AbstractC3638x2.B(24);
            int iE = abstractC3597q2.e();
            iB += iB2 + iB2 + iB3 + iB4 + AbstractC3638x2.B(iE) + iE;
        }
        this.f30055d = iB;
        return iB;
    }

    public final J3 d(J3 j32) {
        if (j32.equals(f30051f)) {
            return this;
        }
        g();
        int i10 = this.f30052a + j32.f30052a;
        m(i10);
        System.arraycopy(j32.f30053b, 0, this.f30053b, this.f30052a, j32.f30052a);
        System.arraycopy(j32.f30054c, 0, this.f30054c, this.f30052a, j32.f30052a);
        this.f30052a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J3)) {
            return false;
        }
        J3 j32 = (J3) obj;
        int i10 = this.f30052a;
        if (i10 == j32.f30052a) {
            int[] iArr = this.f30053b;
            int[] iArr2 = j32.f30053b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f30054c;
                    Object[] objArr2 = j32.f30054c;
                    int i12 = this.f30052a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final void g() {
        if (!this.f30056e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f30056e) {
            this.f30056e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f30052a;
        int i11 = i10 + 527;
        int[] iArr = this.f30053b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f30054c;
        int i15 = this.f30052a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f30052a; i11++) {
            AbstractC3580n3.b(sb2, i10, String.valueOf(this.f30053b[i11] >>> 3), this.f30054c[i11]);
        }
    }

    public final void j(int i10, Object obj) {
        g();
        m(this.f30052a + 1);
        int[] iArr = this.f30053b;
        int i11 = this.f30052a;
        iArr[i11] = i10;
        this.f30054c[i11] = obj;
        this.f30052a = i11 + 1;
    }

    public final void k(V3 v32) {
        for (int i10 = 0; i10 < this.f30052a; i10++) {
            v32.D(this.f30053b[i10] >>> 3, this.f30054c[i10]);
        }
    }

    public final void l(V3 v32) {
        if (this.f30052a != 0) {
            for (int i10 = 0; i10 < this.f30052a; i10++) {
                int i11 = this.f30053b[i10];
                Object obj = this.f30054c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    v32.m(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    v32.F(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    v32.K(i13, (AbstractC3597q2) obj);
                } else if (i12 == 3) {
                    v32.w(i13);
                    ((J3) obj).l(v32);
                    v32.v(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new U2("Protocol message tag had invalid wire type."));
                    }
                    v32.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void m(int i10) {
        int[] iArr = this.f30053b;
        if (i10 > iArr.length) {
            int i11 = this.f30052a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f30053b = Arrays.copyOf(iArr, i10);
            this.f30054c = Arrays.copyOf(this.f30054c, i10);
        }
    }
}
