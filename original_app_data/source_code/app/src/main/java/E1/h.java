package E1;

import G1.AbstractC0853a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f3214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f3215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f3217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f3219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f3228w;

    public h(int i10, int i11, float f10, float f11, int i12) {
        this.f3206a = i10;
        this.f3207b = i11;
        this.f3208c = f10;
        this.f3209d = f11;
        this.f3210e = i10 / i12;
        this.f3211f = i10 / 400;
        int i13 = i10 / 65;
        this.f3212g = i13;
        int i14 = i13 * 2;
        this.f3213h = i14;
        this.f3214i = new short[i14];
        this.f3215j = new short[i14 * i11];
        this.f3217l = new short[i14 * i11];
        this.f3219n = new short[i14 * i11];
    }

    public static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f3218m == i10) {
            return;
        }
        int i13 = this.f3206a;
        long j10 = (long) (i13 / f10);
        long j11 = i13;
        while (j10 != 0 && j11 != 0 && j10 % 2 == 0 && j11 % 2 == 0) {
            j10 /= 2;
            j11 /= 2;
        }
        o(i10);
        int i14 = 0;
        while (true) {
            int i15 = this.f3220o;
            if (i14 >= i15 - 1) {
                this.u(i15 - 1);
                return;
            }
            while (true) {
                i11 = this.f3221p;
                long j12 = ((long) (i11 + 1)) * j10;
                i12 = this.f3222q;
                if (j12 <= ((long) i12) * j11) {
                    break;
                }
                this.f3217l = this.f(this.f3217l, this.f3218m, 1);
                int i16 = 0;
                while (true) {
                    int i17 = this.f3207b;
                    if (i16 < i17) {
                        h hVar = this;
                        this.f3217l[(this.f3218m * i17) + i16] = hVar.n(this.f3219n, (i17 * i14) + i16, j11, j10);
                        i16++;
                        this = hVar;
                    }
                }
                h hVar2 = this;
                hVar2.f3222q++;
                hVar2.f3218m++;
                this = hVar2;
            }
            h hVar3 = this;
            int i18 = i11 + 1;
            hVar3.f3221p = i18;
            if (i18 == j11) {
                hVar3.f3221p = 0;
                AbstractC0853a.g(((long) i12) == j10);
                hVar3.f3222q = 0;
            }
            i14++;
            this = hVar3;
        }
    }

    public final void b(double d10) {
        h hVar;
        double d11;
        int i10 = this.f3216k;
        if (i10 < this.f3213h) {
            return;
        }
        int iM = 0;
        while (true) {
            if (this.f3223r > 0) {
                iM += this.c(iM);
                hVar = this;
                d11 = d10;
            } else {
                int iG = this.g(this.f3215j, iM);
                if (d10 > 1.0d) {
                    hVar = this;
                    d11 = d10;
                    iM += iG + hVar.w(this.f3215j, iM, d11, iG);
                } else {
                    hVar = this;
                    d11 = d10;
                    iM += hVar.m(hVar.f3215j, iM, d11, iG);
                }
            }
            if (hVar.f3213h + iM > i10) {
                hVar.v(iM);
                return;
            } else {
                this = hVar;
                d10 = d11;
            }
        }
    }

    public final int c(int i10) {
        int iMin = Math.min(this.f3213h, this.f3223r);
        d(this.f3215j, i10, iMin);
        this.f3223r -= iMin;
        return iMin;
    }

    public final void d(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f3217l, this.f3218m, i11);
        this.f3217l = sArrF;
        int i12 = this.f3207b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f3218m * i12, i12 * i11);
        this.f3218m += i11;
    }

    public final void e(short[] sArr, int i10, int i11) {
        int i12 = this.f3213h / i11;
        int i13 = this.f3207b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f3214i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f3207b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int g(short[] sArr, int i10) {
        int iH;
        int i11 = this.f3206a;
        int i12 = i11 > 4000 ? i11 / 4000 : 1;
        if (this.f3207b == 1 && i12 == 1) {
            iH = h(sArr, i10, this.f3211f, this.f3212g);
        } else {
            e(sArr, i10, i12);
            int iH2 = h(this.f3214i, 0, this.f3211f / i12, this.f3212g / i12);
            if (i12 != 1) {
                int i13 = iH2 * i12;
                int i14 = i12 * 4;
                int i15 = i13 - i14;
                int i16 = i13 + i14;
                int i17 = this.f3211f;
                if (i15 < i17) {
                    i15 = i17;
                }
                int i18 = this.f3212g;
                if (i16 > i18) {
                    i16 = i18;
                }
                if (this.f3207b == 1) {
                    iH = h(sArr, i10, i15, i16);
                } else {
                    e(sArr, i10, 1);
                    iH = h(this.f3214i, 0, i15, i16);
                }
            } else {
                iH = iH2;
            }
        }
        int i19 = q(this.f3226u, this.f3227v) ? this.f3224s : iH;
        this.f3225t = this.f3226u;
        this.f3224s = iH;
        return i19;
    }

    public final int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f3207b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f3226u = i15 / i16;
        this.f3227v = i17 / i14;
        return i16;
    }

    public void i() {
        this.f3216k = 0;
        this.f3218m = 0;
        this.f3220o = 0;
        this.f3221p = 0;
        this.f3222q = 0;
        this.f3223r = 0;
        this.f3224s = 0;
        this.f3225t = 0;
        this.f3226u = 0;
        this.f3227v = 0;
        this.f3228w = 0.0d;
    }

    public void j(ShortBuffer shortBuffer) {
        AbstractC0853a.g(this.f3218m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f3207b, this.f3218m);
        shortBuffer.put(this.f3217l, 0, this.f3207b * iMin);
        int i10 = this.f3218m - iMin;
        this.f3218m = i10;
        short[] sArr = this.f3217l;
        int i11 = this.f3207b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        AbstractC0853a.g(this.f3218m >= 0);
        return this.f3218m * this.f3207b * 2;
    }

    public int l() {
        return this.f3216k * this.f3207b * 2;
    }

    public final int m(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 < 0.5d) {
            double d11 = ((((double) i11) * d10) / (1.0d - d10)) + this.f3228w;
            int iRound = (int) Math.round(d11);
            this.f3228w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * ((2.0d * d10) - 1.0d)) / (1.0d - d10)) + this.f3228w;
            int iRound2 = (int) Math.round(d12);
            this.f3223r = iRound2;
            this.f3228w = d12 - ((double) iRound2);
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] sArrF = f(this.f3217l, this.f3218m, i13);
        this.f3217l = sArrF;
        int i14 = this.f3207b;
        System.arraycopy(sArr, i10 * i14, sArrF, this.f3218m * i14, i14 * i11);
        p(i12, this.f3207b, this.f3217l, this.f3218m + i11, sArr, i10 + i11, sArr, i10);
        this.f3218m += i13;
        return i12;
    }

    public final short n(short[] sArr, int i10, long j10, long j11) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f3207b];
        long j12 = ((long) this.f3222q) * j10;
        int i11 = this.f3221p;
        long j13 = ((long) (i11 + 1)) * j11;
        long j14 = j13 - j12;
        long j15 = j13 - (((long) i11) * j11);
        return (short) (((((long) s10) * j14) + ((j15 - j14) * ((long) s11))) / j15);
    }

    public final void o(int i10) {
        int i11 = this.f3218m - i10;
        short[] sArrF = f(this.f3219n, this.f3220o, i11);
        this.f3219n = sArrF;
        short[] sArr = this.f3217l;
        int i12 = this.f3207b;
        System.arraycopy(sArr, i10 * i12, sArrF, this.f3220o * i12, i12 * i11);
        this.f3218m = i10;
        this.f3220o += i11;
    }

    public final boolean q(int i10, int i11) {
        return i10 != 0 && this.f3224s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f3225t * 3;
    }

    public final void r() {
        int i10 = this.f3218m;
        float f10 = this.f3208c;
        float f11 = this.f3209d;
        double d10 = f10 / f11;
        float f12 = this.f3210e * f11;
        if (d10 > 1.0000100135803223d || d10 < 0.9999899864196777d) {
            b(d10);
        } else {
            d(this.f3215j, 0, this.f3216k);
            this.f3216k = 0;
        }
        if (f12 != 1.0f) {
            a(f12, i10);
        }
    }

    public void s() {
        int i10;
        int i11 = this.f3216k;
        float f10 = this.f3208c;
        float f11 = this.f3209d;
        double d10 = f10 / f11;
        double d11 = this.f3210e * f11;
        int i12 = this.f3223r;
        int i13 = this.f3218m + ((int) ((((((((double) (i11 - i12)) / d10) + ((double) i12)) + this.f3228w) + ((double) this.f3220o)) / d11) + 0.5d));
        this.f3228w = 0.0d;
        this.f3215j = f(this.f3215j, i11, (this.f3213h * 2) + i11);
        int i14 = 0;
        while (true) {
            i10 = this.f3213h;
            int i15 = this.f3207b;
            if (i14 >= i10 * 2 * i15) {
                break;
            }
            this.f3215j[(i15 * i11) + i14] = 0;
            i14++;
        }
        this.f3216k += i10 * 2;
        r();
        if (this.f3218m > i13) {
            this.f3218m = Math.max(i13, 0);
        }
        this.f3216k = 0;
        this.f3223r = 0;
        this.f3220o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f3207b;
        int i11 = iRemaining / i10;
        short[] sArrF = f(this.f3215j, this.f3216k, i11);
        this.f3215j = sArrF;
        shortBuffer.get(sArrF, this.f3216k * this.f3207b, ((i10 * i11) * 2) / 2);
        this.f3216k += i11;
        r();
    }

    public final void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f3219n;
        int i11 = this.f3207b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f3220o - i10) * i11);
        this.f3220o -= i10;
    }

    public final void v(int i10) {
        int i11 = this.f3216k - i10;
        short[] sArr = this.f3215j;
        int i12 = this.f3207b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f3216k = i11;
    }

    public final int w(short[] sArr, int i10, double d10, int i11) {
        int i12;
        if (d10 >= 2.0d) {
            double d11 = (((double) i11) / (d10 - 1.0d)) + this.f3228w;
            int iRound = (int) Math.round(d11);
            this.f3228w = d11 - ((double) iRound);
            i12 = iRound;
        } else {
            double d12 = ((((double) i11) * (2.0d - d10)) / (d10 - 1.0d)) + this.f3228w;
            int iRound2 = (int) Math.round(d12);
            this.f3223r = iRound2;
            this.f3228w = d12 - ((double) iRound2);
            i12 = i11;
        }
        short[] sArrF = f(this.f3217l, this.f3218m, i12);
        this.f3217l = sArrF;
        p(i12, this.f3207b, sArrF, this.f3218m, sArr, i10, sArr, i10 + i11);
        this.f3218m += i12;
        return i12;
    }
}
