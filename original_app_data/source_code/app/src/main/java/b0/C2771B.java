package b0;

import c0.AbstractC2926a;
import fc.C4009B;
import gc.C4202o;
import gc.C4204q;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: b0.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C2771B extends AbstractC2775F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24830f;

    public C2771B() {
        this(0, 1, null);
    }

    public final void h() {
        if (this.f24841d <= 8 || Long.compareUnsigned(C4009B.b(C4009B.b(this.f24842e) * 32), C4009B.b(C4009B.b(this.f24841d) * 25)) > 0) {
            r(AbstractC2776G.c(this.f24841d));
        } else {
            j();
        }
    }

    public final void i() {
        this.f24842e = 0;
        long[] jArr = this.f24838a;
        if (jArr != AbstractC2776G.f24843a) {
            C4202o.z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f24838a;
            int i10 = this.f24841d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C4202o.x(this.f24840c, null, 0, this.f24841d);
        C4202o.x(this.f24839b, null, 0, this.f24841d);
        m();
    }

    public final void j() {
        long[] jArr = this.f24838a;
        int i10 = this.f24841d;
        Object[] objArr = this.f24839b;
        Object[] objArr2 = this.f24840c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iZ = C4204q.Z(jArr);
        int i14 = iZ - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iZ] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iK = k(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iK - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[C4204q.Z(jArr)] = jArr[i21];
                } else {
                    int i22 = iK >> 3;
                    long j12 = jArr[i22];
                    int i23 = (iK & 7) << 3;
                    if (((j12 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iK] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iK] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        Object obj2 = objArr[iK];
                        objArr[iK] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iK];
                        objArr2[iK] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[C4204q.Z(jArr)] = jArr[i21];
                }
                i15++;
                i12 = i21;
            } else {
                i15++;
            }
        }
        m();
    }

    public final int k(int i10) {
        int i11 = this.f24841d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f24838a;
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

    public final int l(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f24841d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f24838a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC4862t.a(this.f24839b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iK = k(i11);
                if (this.f24830f == 0 && ((this.f24838a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i11);
                }
                this.f24842e++;
                int i19 = this.f24830f;
                long[] jArr2 = this.f24838a;
                int i20 = iK >> 3;
                long j14 = jArr2[i20];
                int i21 = (iK & 7) << 3;
                this.f24830f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f24841d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iK - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iK;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final void m() {
        this.f24830f = AbstractC2776G.a(e()) - this.f24842e;
    }

    public final void n(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC2776G.f24843a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4202o.z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.f24838a = jArr;
        m();
    }

    public final void o(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC2776G.d(i10)) : 0;
        this.f24841d = iMax;
        n(iMax);
        this.f24839b = iMax == 0 ? AbstractC2926a.f25521c : new Object[iMax];
        this.f24840c = iMax == 0 ? AbstractC2926a.f25521c : new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f24841d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f24838a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L42:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L61
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f24839b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.AbstractC4862t.a(r11, r14)
            if (r11 == 0) goto L5b
            goto L6b
        L5b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L42
        L61:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L74
            r10 = -1
        L6b:
            if (r10 < 0) goto L72
            java.lang.Object r13 = r13.q(r10)
            return r13
        L72:
            r13 = 0
            return r13
        L74:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C2771B.p(java.lang.Object):java.lang.Object");
    }

    public final Object q(int i10) {
        this.f24842e--;
        long[] jArr = this.f24838a;
        int i11 = this.f24841d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f24839b[i10] = null;
        Object[] objArr = this.f24840c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public final void r(int i10) {
        int i11;
        long[] jArr = this.f24838a;
        Object[] objArr = this.f24839b;
        Object[] objArr2 = this.f24840c;
        int i12 = this.f24841d;
        o(i10);
        long[] jArr2 = this.f24838a;
        Object[] objArr3 = this.f24839b;
        Object[] objArr4 = this.f24840c;
        int i13 = this.f24841d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iK = k(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iK - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iK] = obj;
                objArr4[iK] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void s(Object obj, Object obj2) {
        int iL = l(obj);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f24839b[iL] = obj;
        this.f24840c[iL] = obj2;
    }

    public /* synthetic */ C2771B(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public C2771B(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            c0.d.a("Capacity must be a positive value.");
        }
        o(AbstractC2776G.e(i10));
    }
}
