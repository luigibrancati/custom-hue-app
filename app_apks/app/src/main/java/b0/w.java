package b0;

import fc.C4009B;
import gc.C4202o;
import gc.C4204q;
import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC2786j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24960f;

    public w() {
        this(0, 1, null);
    }

    public final void f() {
        if (this.f24912d <= 8 || Long.compareUnsigned(C4009B.b(C4009B.b(this.f24913e) * 32), C4009B.b(C4009B.b(this.f24912d) * 25)) > 0) {
            m(AbstractC2776G.c(this.f24912d));
        } else {
            g();
        }
    }

    public final void g() {
        long j10;
        long[] jArr = this.f24909a;
        int i10 = this.f24912d;
        int[] iArr = this.f24910b;
        Object[] objArr = this.f24911c;
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
                int iHashCode = Integer.hashCode(iArr[i15]) * (-862048943);
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
                        iArr[i20] = iArr[i15];
                        iArr[i15] = i22;
                        objArr[i20] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i23] = (((long) (i18 & 127)) << i24) | (j14 & (~(255 << i24)));
                        int i25 = iArr[i20];
                        iArr[i20] = iArr[i15];
                        iArr[i15] = i25;
                        Object obj = objArr[i20];
                        objArr[i20] = objArr[i15];
                        objArr[i15] = obj;
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
        j();
    }

    public final int h(int i10) {
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f24912d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f24909a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = i13;
            int i20 = i16;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i15) & i14;
                int i21 = i19;
                if (this.f24910b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i19 = i21;
            }
            int i22 = i19;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int i23 = i(i12);
                if (this.f24960f == 0 && ((this.f24909a[i23 >> 3] >> ((i23 & 7) << 3)) & 255) != 254) {
                    f();
                    i23 = i(i12);
                }
                this.f24913e++;
                int i24 = this.f24960f;
                long[] jArr2 = this.f24909a;
                int i25 = i23 >> 3;
                long j14 = jArr2[i25];
                int i26 = (i23 & 7) << 3;
                this.f24960f = i24 - (((j14 >> i26) & 255) == 128 ? i22 : 0);
                int i27 = this.f24912d;
                long j15 = ((~(255 << i26)) & j14) | (j11 << i26);
                jArr2[i25] = j15;
                jArr2[(((i23 - 7) & i27) + (i27 & 7)) >> 3] = j15;
                return i23;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    public final int i(int i10) {
        int i11 = this.f24912d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24909a;
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

    public final void j() {
        this.f24960f = AbstractC2776G.a(c()) - this.f24913e;
    }

    public final void k(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC2776G.f24843a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4202o.z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f24909a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        j();
    }

    public final void l(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC2776G.d(i10)) : 0;
        this.f24912d = iMax;
        k(iMax);
        this.f24910b = new int[iMax];
        this.f24911c = new Object[iMax];
    }

    public final void m(int i10) {
        long[] jArr;
        w wVar = this;
        long[] jArr2 = wVar.f24909a;
        int[] iArr = wVar.f24910b;
        Object[] objArr = wVar.f24911c;
        int i11 = wVar.f24912d;
        l(i10);
        long[] jArr3 = wVar.f24909a;
        int[] iArr2 = wVar.f24910b;
        Object[] objArr2 = wVar.f24911c;
        int i12 = wVar.f24912d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                int i14 = iArr[i13];
                int iHashCode = Integer.hashCode(i14) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int i16 = wVar.i(i15 >>> 7);
                long j10 = i15 & 127;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i17] & (~(255 << i18))) | (j10 << i18);
                jArr3[i17] = j11;
                jArr3[(((i16 - 7) & i12) + (i12 & 7)) >> 3] = j11;
                iArr2[i16] = i14;
                objArr2[i16] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            wVar = this;
            jArr2 = jArr;
        }
    }

    public final void n(int i10, Object obj) {
        int iH = h(i10);
        this.f24910b[iH] = i10;
        this.f24911c[iH] = obj;
    }

    public /* synthetic */ w(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public w(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            c0.d.a("Capacity must be a positive value.");
        }
        l(AbstractC2776G.e(i10));
    }
}
