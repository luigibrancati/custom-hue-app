package b0;

import c0.AbstractC2926a;
import fc.C4009B;
import gc.C4202o;
import gc.C4204q;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: b0.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2772C extends H {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24831e;

    public C2772C() {
        this(0, 1, null);
    }

    public final boolean f(Object obj) {
        int iC = c();
        this.f24846b[j(obj)] = obj;
        return c() != iC;
    }

    public final void g() {
        if (this.f24847c <= 8 || Long.compareUnsigned(C4009B.b(C4009B.b(this.f24848d) * 32), C4009B.b(C4009B.b(this.f24847c) * 25)) > 0) {
            q(AbstractC2776G.c(this.f24847c));
        } else {
            i();
        }
    }

    public final void h() {
        this.f24848d = 0;
        long[] jArr = this.f24845a;
        if (jArr != AbstractC2776G.f24843a) {
            C4202o.z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f24845a;
            int i10 = this.f24847c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C4202o.x(this.f24846b, null, 0, this.f24847c);
        l();
    }

    public final void i() {
        long j10;
        long[] jArr = this.f24845a;
        int i10 = this.f24847c;
        Object[] objArr = this.f24846b;
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
                int iK = k(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iK - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[C4204q.Z(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iK >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iK & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iK] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        Object obj2 = objArr[iK];
                        objArr[iK] = objArr[i15];
                        objArr[i15] = obj2;
                        i15--;
                    }
                    jArr[C4204q.Z(jArr)] = (jArr[i21] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        l();
    }

    public final int j(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24847c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24845a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC4862t.a(this.f24846b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i11);
                if (this.f24831e == 0 && ((this.f24845a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    g();
                    iK = k(i11);
                }
                this.f24848d++;
                int i19 = this.f24831e;
                long[] jArr2 = this.f24845a;
                int i20 = iK >> 3;
                long j14 = jArr2[i20];
                int i21 = (iK & 7) << 3;
                this.f24831e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24847c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iK - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iK;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final int k(int i10) {
        int i11 = this.f24847c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24845a;
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

    public final void l() {
        this.f24831e = AbstractC2776G.a(b()) - this.f24848d;
    }

    public final void m(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC2776G.f24843a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4202o.z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f24845a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        l();
    }

    public final void n(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC2776G.d(i10)) : 0;
        this.f24847c = iMax;
        m(iMax);
        this.f24846b = iMax == 0 ? AbstractC2926a.f25521c : new Object[iMax];
    }

    public final void o(H elements) {
        AbstractC4862t.e(elements, "elements");
        Object[] objArr = elements.f24846b;
        long[] jArr = elements.f24845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        p(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void p(Object obj) {
        this.f24846b[j(obj)] = obj;
    }

    public final void q(int i10) {
        long[] jArr = this.f24845a;
        Object[] objArr = this.f24846b;
        int i11 = this.f24847c;
        n(i10);
        long[] jArr2 = this.f24845a;
        Object[] objArr2 = this.f24846b;
        int i12 = this.f24847c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iK = k(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iK >> 3;
                int i16 = (iK & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iK] = obj;
            }
        }
    }

    public C2772C(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            c0.d.a("Capacity must be a positive value.");
        }
        n(AbstractC2776G.e(i10));
    }

    public /* synthetic */ C2772C(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
