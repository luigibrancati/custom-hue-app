package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Z5 f29399f = new Z5(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f29401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f29402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29403d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29404e;

    public Z5(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f29400a = i10;
        this.f29401b = iArr;
        this.f29402c = objArr;
        this.f29404e = z10;
    }

    public static Z5 a() {
        return f29399f;
    }

    public static Z5 b() {
        return new Z5(0, new int[8], new Object[8], true);
    }

    public static Z5 c(Z5 z52, Z5 z53) {
        int i10 = z52.f29400a + z53.f29400a;
        int[] iArrCopyOf = Arrays.copyOf(z52.f29401b, i10);
        System.arraycopy(z53.f29401b, 0, iArrCopyOf, z52.f29400a, z53.f29400a);
        Object[] objArrCopyOf = Arrays.copyOf(z52.f29402c, i10);
        System.arraycopy(z53.f29402c, 0, objArrCopyOf, z52.f29400a, z53.f29400a);
        return new Z5(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final void d() {
        if (this.f29404e) {
            this.f29404e = false;
        }
    }

    public final void e() {
        if (!this.f29404e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Z5)) {
            return false;
        }
        Z5 z52 = (Z5) obj;
        int i10 = this.f29400a;
        if (i10 == z52.f29400a) {
            int[] iArr = this.f29401b;
            int[] iArr2 = z52.f29401b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f29402c;
                    Object[] objArr2 = z52.f29402c;
                    int i12 = this.f29400a;
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

    public final void f(InterfaceC3248l6 interfaceC3248l6) {
        for (int i10 = 0; i10 < this.f29400a; i10++) {
            interfaceC3248l6.I(this.f29401b[i10] >>> 3, this.f29402c[i10]);
        }
    }

    public final void g(InterfaceC3248l6 interfaceC3248l6) {
        if (this.f29400a != 0) {
            for (int i10 = 0; i10 < this.f29400a; i10++) {
                int i11 = this.f29401b[i10];
                Object obj = this.f29402c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC3248l6.m(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC3248l6.x(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC3248l6.w(i13, (E4) obj);
                } else if (i12 == 3) {
                    interfaceC3248l6.o(i13);
                    ((Z5) obj).g(interfaceC3248l6);
                    interfaceC3248l6.s(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C3220i5("Protocol message tag had invalid wire type."));
                    }
                    interfaceC3248l6.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i10 = this.f29403d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f29400a; i11++) {
            int i12 = this.f29401b[i11] >>> 3;
            E4 e42 = (E4) this.f29402c[i11];
            int iG2 = J4.G(8);
            int iG3 = J4.G(16) + J4.G(i12);
            int iG4 = J4.G(24);
            int iE = e42.e();
            iG += iG2 + iG2 + iG3 + iG4 + J4.G(iE) + iE;
        }
        this.f29403d = iG;
        return iG;
    }

    public final int hashCode() {
        int i10 = this.f29400a;
        int i11 = i10 + 527;
        int[] iArr = this.f29401b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f29402c;
        int i15 = this.f29400a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int iG;
        int iA;
        int iG2;
        int i10 = this.f29403d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f29400a; i12++) {
            int i13 = this.f29401b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f29402c[i12]).getClass();
                    iG2 = J4.G(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    E4 e42 = (E4) this.f29402c[i12];
                    int iG3 = J4.G(i16);
                    int iE = e42.e();
                    iG2 = iG3 + J4.G(iE) + iE;
                } else if (i15 == 3) {
                    int iG4 = J4.G(i14 << 3);
                    iG = iG4 + iG4;
                    iA = ((Z5) this.f29402c[i12]).i();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C3220i5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f29402c[i12]).getClass();
                    iG2 = J4.G(i14 << 3) + 4;
                }
                i11 += iG2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f29402c[i12]).longValue();
                iG = J4.G(i17);
                iA = J4.a(jLongValue);
            }
            iG2 = iG + iA;
            i11 += iG2;
        }
        this.f29403d = i11;
        return i11;
    }

    public final void j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f29400a; i11++) {
            E5.b(sb2, i10, String.valueOf(this.f29401b[i11] >>> 3), this.f29402c[i11]);
        }
    }

    public final void k(int i10, Object obj) {
        e();
        m(this.f29400a + 1);
        int[] iArr = this.f29401b;
        int i11 = this.f29400a;
        iArr[i11] = i10;
        this.f29402c[i11] = obj;
        this.f29400a = i11 + 1;
    }

    public final Z5 l(Z5 z52) {
        if (z52.equals(f29399f)) {
            return this;
        }
        e();
        int i10 = this.f29400a + z52.f29400a;
        m(i10);
        System.arraycopy(z52.f29401b, 0, this.f29401b, this.f29400a, z52.f29400a);
        System.arraycopy(z52.f29402c, 0, this.f29402c, this.f29400a, z52.f29400a);
        this.f29400a = i10;
        return this;
    }

    public final void m(int i10) {
        int[] iArr = this.f29401b;
        if (i10 > iArr.length) {
            int i11 = this.f29400a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f29401b = Arrays.copyOf(iArr, i10);
            this.f29402c = Arrays.copyOf(this.f29402c, i10);
        }
    }
}
