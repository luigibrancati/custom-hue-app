package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3452q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3452q2 f29906f = new C3452q2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f29908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f29909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29910d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29911e;

    public C3452q2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f29907a = i10;
        this.f29908b = iArr;
        this.f29909c = objArr;
        this.f29911e = z10;
    }

    public static C3452q2 c() {
        return f29906f;
    }

    public static C3452q2 e(C3452q2 c3452q2, C3452q2 c3452q22) {
        int i10 = c3452q2.f29907a + c3452q22.f29907a;
        int[] iArrCopyOf = Arrays.copyOf(c3452q2.f29908b, i10);
        System.arraycopy(c3452q22.f29908b, 0, iArrCopyOf, c3452q2.f29907a, c3452q22.f29907a);
        Object[] objArrCopyOf = Arrays.copyOf(c3452q2.f29909c, i10);
        System.arraycopy(c3452q22.f29909c, 0, objArrCopyOf, c3452q2.f29907a, c3452q22.f29907a);
        return new C3452q2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public static C3452q2 f() {
        return new C3452q2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i10 = this.f29910d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f29907a; i12++) {
            int i13 = this.f29908b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f29909c[i12]).getClass();
                    iA2 = O0.a(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    G0 g02 = (G0) this.f29909c[i12];
                    int iA3 = O0.a(i16);
                    int iF = g02.f();
                    iA2 = iA3 + O0.a(iF) + iF;
                } else if (i15 == 3) {
                    int iA4 = O0.a(i14 << 3);
                    iA = iA4 + iA4;
                    iB = ((C3452q2) this.f29909c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C3451q1("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f29909c[i12]).getClass();
                    iA2 = O0.a(i14 << 3) + 4;
                }
                i11 += iA2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f29909c[i12]).longValue();
                iA = O0.a(i17);
                iB = O0.b(jLongValue);
            }
            iA2 = iA + iB;
            i11 += iA2;
        }
        this.f29910d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f29910d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f29907a; i11++) {
            int i12 = this.f29908b[i11] >>> 3;
            G0 g02 = (G0) this.f29909c[i11];
            int iA2 = O0.a(8);
            int iA3 = O0.a(16) + O0.a(i12);
            int iA4 = O0.a(24);
            int iF = g02.f();
            iA += iA2 + iA2 + iA3 + iA4 + O0.a(iF) + iF;
        }
        this.f29910d = iA;
        return iA;
    }

    public final C3452q2 d(C3452q2 c3452q2) {
        if (c3452q2.equals(f29906f)) {
            return this;
        }
        g();
        int i10 = this.f29907a + c3452q2.f29907a;
        m(i10);
        System.arraycopy(c3452q2.f29908b, 0, this.f29908b, this.f29907a, c3452q2.f29907a);
        System.arraycopy(c3452q2.f29909c, 0, this.f29909c, this.f29907a, c3452q2.f29907a);
        this.f29907a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3452q2)) {
            return false;
        }
        C3452q2 c3452q2 = (C3452q2) obj;
        int i10 = this.f29907a;
        if (i10 == c3452q2.f29907a) {
            int[] iArr = this.f29908b;
            int[] iArr2 = c3452q2.f29908b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f29909c;
                    Object[] objArr2 = c3452q2.f29909c;
                    int i12 = this.f29907a;
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
        if (!this.f29911e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f29911e) {
            this.f29911e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f29907a;
        int i11 = i10 + 527;
        int[] iArr = this.f29908b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f29909c;
        int i15 = this.f29907a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f29907a; i11++) {
            L1.b(sb2, i10, String.valueOf(this.f29908b[i11] >>> 3), this.f29909c[i11]);
        }
    }

    public final void j(int i10, Object obj) {
        g();
        m(this.f29907a + 1);
        int[] iArr = this.f29908b;
        int i11 = this.f29907a;
        iArr[i11] = i10;
        this.f29909c[i11] = obj;
        this.f29907a = i11 + 1;
    }

    public final void k(F2 f22) {
        for (int i10 = 0; i10 < this.f29907a; i10++) {
            f22.D(this.f29908b[i10] >>> 3, this.f29909c[i10]);
        }
    }

    public final void l(F2 f22) {
        if (this.f29907a != 0) {
            for (int i10 = 0; i10 < this.f29907a; i10++) {
                int i11 = this.f29908b[i10];
                Object obj = this.f29909c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    f22.m(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    f22.F(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    f22.J(i13, (G0) obj);
                } else if (i12 == 3) {
                    f22.w(i13);
                    ((C3452q2) obj).l(f22);
                    f22.v(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C3451q1("Protocol message tag had invalid wire type."));
                    }
                    f22.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void m(int i10) {
        int[] iArr = this.f29908b;
        if (i10 > iArr.length) {
            int i11 = this.f29907a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f29908b = Arrays.copyOf(iArr, i10);
            this.f29909c = Arrays.copyOf(this.f29909c, i10);
        }
    }
}
