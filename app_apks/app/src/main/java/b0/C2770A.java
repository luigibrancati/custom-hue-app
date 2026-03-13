package b0;

import fc.C4009B;
import gc.C4202o;
import gc.C4204q;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: b0.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2770A extends AbstractC2773D {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24829f;

    public C2770A() {
        this(0, 1, null);
    }

    public final void f() {
        if (this.f24835d <= 8 || Long.compareUnsigned(C4009B.b(C4009B.b(this.f24836e) * 32), C4009B.b(C4009B.b(this.f24835d) * 25)) > 0) {
            n(AbstractC2776G.c(this.f24835d));
        } else {
            h();
        }
    }

    public final void g() {
        this.f24836e = 0;
        long[] jArr = this.f24832a;
        if (jArr != AbstractC2776G.f24843a) {
            C4202o.z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f24832a;
            int i10 = this.f24835d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C4202o.x(this.f24833b, null, 0, this.f24835d);
        k();
    }

    public final void h() {
        long j10;
        long[] jArr = this.f24832a;
        int i10 = this.f24835d;
        Object[] objArr = this.f24833b;
        int[] iArr = this.f24834c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iZ = C4204q.Z(jArr);
        int i14 = iZ - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iZ] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int i20 = i(i19);
                int i21 = i19 & i10;
                int i22 = i12;
                if (((i20 - i21) & i10) / 8 == ((i15 - i21) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[C4204q.Z(jArr)] = (jArr[i22] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i22;
                } else {
                    int i23 = i20 >> 3;
                    long j14 = jArr[i23];
                    int i24 = (i20 & 7) << 3;
                    if (((j14 >> i24) & 255) == 128) {
                        j10 = j12;
                        jArr[i23] = (((long) (i18 & 127)) << i24) | (j14 & (~(255 << i24)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[i20] = objArr[i15];
                        objArr[i15] = null;
                        iArr[i20] = iArr[i15];
                        iArr[i15] = i22;
                    } else {
                        j10 = j12;
                        jArr[i23] = (((long) (i18 & 127)) << i24) | (j14 & (~(255 << i24)));
                        Object obj2 = objArr[i20];
                        objArr[i20] = objArr[i15];
                        objArr[i15] = obj2;
                        int i25 = iArr[i20];
                        iArr[i20] = iArr[i15];
                        iArr[i15] = i25;
                        i15--;
                    }
                    jArr[C4204q.Z(jArr)] = (jArr[i22] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i22;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        k();
    }

    public final int i(int i10) {
        int i11 = this.f24835d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24832a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int j(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24835d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24832a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC4862t.a(this.f24833b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int i19 = i(i11);
                if (this.f24829f == 0 && ((this.f24832a[i19 >> 3] >> ((i19 & 7) << 3)) & 255) != 254) {
                    f();
                    i19 = i(i11);
                }
                this.f24836e++;
                int i20 = this.f24829f;
                long[] jArr2 = this.f24832a;
                int i21 = i19 >> 3;
                long j14 = jArr2[i21];
                int i22 = (i19 & 7) << 3;
                this.f24829f = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                int i23 = this.f24835d;
                long j15 = ((~(255 << i22)) & j14) | (j11 << i22);
                jArr2[i21] = j15;
                jArr2[(((i19 - 7) & i23) + (i23 & 7)) >> 3] = j15;
                return ~i19;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final void k() {
        this.f24829f = AbstractC2776G.a(b()) - this.f24836e;
    }

    public final void l(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC2776G.f24843a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4202o.z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f24832a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        k();
    }

    public final void m(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC2776G.d(i10)) : 0;
        this.f24835d = iMax;
        l(iMax);
        this.f24833b = new Object[iMax];
        this.f24834c = new int[iMax];
    }

    public final void n(int i10) {
        int i11;
        long[] jArr = this.f24832a;
        Object[] objArr = this.f24833b;
        int[] iArr = this.f24834c;
        int i12 = this.f24835d;
        m(i10);
        long[] jArr2 = this.f24832a;
        Object[] objArr2 = this.f24833b;
        int[] iArr2 = this.f24834c;
        int i13 = this.f24835d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int i16 = i(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                long j11 = (j10 << i18) | (jArr2[i17] & (~(255 << i18)));
                jArr2[i17] = j11;
                jArr2[(((i16 - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[i16] = obj;
                iArr2[i16] = iArr[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void o(Object obj, int i10) {
        int iJ = j(obj);
        if (iJ < 0) {
            iJ = ~iJ;
        }
        this.f24833b[iJ] = obj;
        this.f24834c[iJ] = i10;
    }

    public /* synthetic */ C2770A(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public C2770A(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            c0.d.a("Capacity must be a positive value.");
        }
        m(AbstractC2776G.e(i10));
    }
}
