package md;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import md.p;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: md.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5051e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40304d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InputStream f40306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40307g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40311k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40308h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40310j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40312l = 64;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40313m = 67108864;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f40301a = new byte[RecognitionOptions.AZTEC];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40303c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40305e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40309i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40302b = false;

    public C5051e(InputStream inputStream) {
        this.f40306f = inputStream;
    }

    public static int A(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw k.k();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw k.k();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw k.f();
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static C5051e g(InputStream inputStream) {
        return new C5051e(inputStream);
    }

    public long B() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f40305e;
        int i11 = this.f40303c;
        if (i11 != i10) {
            byte[] bArr = this.f40301a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f40305e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b10;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ ((long) (bArr[i13] << 14));
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ ((long) (bArr[i14] << 21));
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (((long) bArr[i13]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (((long) bArr[i13]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f40305e = i13;
                                                return j10;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j10 = j15;
                                                this.f40305e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f40305e = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j13 ^ j11;
                this.f40305e = i13;
                return j10;
            }
        }
        return C();
    }

    public long C() throws k {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bV = v();
            j10 |= ((long) (bV & 127)) << i10;
            if ((bV & 128) == 0) {
                return j10;
            }
        }
        throw k.f();
    }

    public int D() {
        return x();
    }

    public long E() {
        return y();
    }

    public int F() {
        return b(z());
    }

    public long G() {
        return c(B());
    }

    public String H() {
        int iZ = z();
        int i10 = this.f40303c;
        int i11 = this.f40305e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? "" : new String(w(iZ), "UTF-8");
        }
        String str = new String(this.f40301a, i11, iZ, "UTF-8");
        this.f40305e += iZ;
        return str;
    }

    public String I() throws k {
        byte[] bArrW;
        int iZ = z();
        int i10 = this.f40305e;
        if (iZ <= this.f40303c - i10 && iZ > 0) {
            bArrW = this.f40301a;
            this.f40305e = i10 + iZ;
        } else {
            if (iZ == 0) {
                return "";
            }
            bArrW = w(iZ);
            i10 = 0;
        }
        if (x.f(bArrW, i10, i10 + iZ)) {
            return new String(bArrW, i10, iZ, "UTF-8");
        }
        throw k.d();
    }

    public int J() throws k {
        if (f()) {
            this.f40307g = 0;
            return 0;
        }
        int iZ = z();
        this.f40307g = iZ;
        if (y.a(iZ) != 0) {
            return this.f40307g;
        }
        throw k.c();
    }

    public int K() {
        return z();
    }

    public long L() {
        return B();
    }

    public final void M() {
        int i10 = this.f40303c + this.f40304d;
        this.f40303c = i10;
        int i11 = this.f40309i + i10;
        int i12 = this.f40310j;
        if (i11 <= i12) {
            this.f40304d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f40304d = i13;
        this.f40303c = i10 - i13;
    }

    public final void N(int i10) throws k {
        if (!S(i10)) {
            throw k.k();
        }
    }

    public boolean O(int i10, C5052f c5052f) throws k {
        int iB = y.b(i10);
        if (iB == 0) {
            long jS = s();
            c5052f.n0(i10);
            c5052f.y0(jS);
            return true;
        }
        if (iB == 1) {
            long jY = y();
            c5052f.n0(i10);
            c5052f.U(jY);
            return true;
        }
        if (iB == 2) {
            AbstractC5050d abstractC5050dK = k();
            c5052f.n0(i10);
            c5052f.O(abstractC5050dK);
            return true;
        }
        if (iB == 3) {
            c5052f.n0(i10);
            P(c5052f);
            int iC = y.c(y.a(i10), 4);
            a(iC);
            c5052f.n0(iC);
            return true;
        }
        if (iB == 4) {
            return false;
        }
        if (iB != 5) {
            throw k.e();
        }
        int iX = x();
        c5052f.n0(i10);
        c5052f.T(iX);
        return true;
    }

    public void P(C5052f c5052f) throws k {
        int iJ;
        do {
            iJ = J();
            if (iJ == 0) {
                return;
            }
        } while (O(iJ, c5052f));
    }

    public void Q(int i10) throws k {
        int i11 = this.f40303c;
        int i12 = this.f40305e;
        if (i10 > i11 - i12 || i10 < 0) {
            R(i10);
        } else {
            this.f40305e = i12 + i10;
        }
    }

    public final void R(int i10) throws k {
        if (i10 < 0) {
            throw k.g();
        }
        int i11 = this.f40309i;
        int i12 = this.f40305e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f40310j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw k.k();
        }
        int i15 = this.f40303c;
        int i16 = i15 - i12;
        this.f40305e = i15;
        N(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f40303c;
            if (i17 <= i18) {
                this.f40305e = i17;
                return;
            } else {
                i16 += i18;
                this.f40305e = i18;
                N(1);
            }
        }
    }

    public final boolean S(int i10) throws IOException {
        int i11 = this.f40305e;
        int i12 = i11 + i10;
        int i13 = this.f40303c;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f40309i + i11 + i10 <= this.f40310j && this.f40306f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f40301a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f40309i += i11;
                this.f40303c -= i11;
                this.f40305e = 0;
            }
            InputStream inputStream = this.f40306f;
            byte[] bArr2 = this.f40301a;
            int i14 = this.f40303c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f40301a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f40303c += i15;
                if ((this.f40309i + i10) - this.f40313m > 0) {
                    throw k.j();
                }
                M();
                if (this.f40303c >= i10) {
                    return true;
                }
                return S(i10);
            }
        }
        return false;
    }

    public void a(int i10) throws k {
        if (this.f40307g != i10) {
            throw k.b();
        }
    }

    public final void d(int i10) throws k {
        if (this.f40303c - this.f40305e < i10) {
            N(i10);
        }
    }

    public int e() {
        int i10 = this.f40310j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f40309i + this.f40305e);
    }

    public boolean f() {
        return this.f40305e == this.f40303c && !S(1);
    }

    public void h(int i10) {
        this.f40310j = i10;
        M();
    }

    public int i(int i10) throws k {
        if (i10 < 0) {
            throw k.g();
        }
        int i11 = i10 + this.f40309i + this.f40305e;
        int i12 = this.f40310j;
        if (i11 > i12) {
            throw k.k();
        }
        this.f40310j = i11;
        M();
        return i12;
    }

    public boolean j() {
        return B() != 0;
    }

    public AbstractC5050d k() {
        int iZ = z();
        int i10 = this.f40303c;
        int i11 = this.f40305e;
        if (iZ > i10 - i11 || iZ <= 0) {
            return iZ == 0 ? AbstractC5050d.f40294a : new o(w(iZ));
        }
        AbstractC5050d c5049c = (this.f40302b && this.f40308h) ? new C5049c(this.f40301a, this.f40305e, iZ) : AbstractC5050d.h(this.f40301a, i11, iZ);
        this.f40305e += iZ;
        return c5049c;
    }

    public double l() {
        return Double.longBitsToDouble(y());
    }

    public int m() {
        return z();
    }

    public int n() {
        return x();
    }

    public long o() {
        return y();
    }

    public float p() {
        return Float.intBitsToFloat(x());
    }

    public void q(int i10, p.a aVar, C5053g c5053g) throws k {
        int i11 = this.f40311k;
        if (i11 >= this.f40312l) {
            throw k.h();
        }
        this.f40311k = i11 + 1;
        aVar.v0(this, c5053g);
        a(y.c(i10, 4));
        this.f40311k--;
    }

    public int r() {
        return z();
    }

    public long s() {
        return B();
    }

    public p t(r rVar, C5053g c5053g) throws k {
        int iZ = z();
        if (this.f40311k >= this.f40312l) {
            throw k.h();
        }
        int i10 = i(iZ);
        this.f40311k++;
        p pVar = (p) rVar.c(this, c5053g);
        a(0);
        this.f40311k--;
        h(i10);
        return pVar;
    }

    public void u(p.a aVar, C5053g c5053g) throws k {
        int iZ = z();
        if (this.f40311k >= this.f40312l) {
            throw k.h();
        }
        int i10 = i(iZ);
        this.f40311k++;
        aVar.v0(this, c5053g);
        a(0);
        this.f40311k--;
        h(i10);
    }

    public byte v() throws k {
        if (this.f40305e == this.f40303c) {
            N(1);
        }
        byte[] bArr = this.f40301a;
        int i10 = this.f40305e;
        this.f40305e = i10 + 1;
        return bArr[i10];
    }

    public final byte[] w(int i10) throws k {
        if (i10 <= 0) {
            if (i10 == 0) {
                return j.f40349a;
            }
            throw k.g();
        }
        int i11 = this.f40309i;
        int i12 = this.f40305e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f40310j;
        if (i13 > i14) {
            Q((i14 - i11) - i12);
            throw k.k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f40303c - i12;
            System.arraycopy(this.f40301a, i12, bArr, 0, i15);
            this.f40305e = this.f40303c;
            int i16 = i10 - i15;
            d(i16);
            System.arraycopy(this.f40301a, 0, bArr, i15, i16);
            this.f40305e = i16;
            return bArr;
        }
        int i17 = this.f40303c;
        this.f40309i = i11 + i17;
        this.f40305e = 0;
        this.f40303c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, RecognitionOptions.AZTEC);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f40306f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw k.k();
                }
                this.f40309i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f40301a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public int x() throws k {
        int i10 = this.f40305e;
        if (this.f40303c - i10 < 4) {
            N(4);
            i10 = this.f40305e;
        }
        byte[] bArr = this.f40301a;
        this.f40305e = i10 + 4;
        return (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24);
    }

    public long y() throws k {
        int i10 = this.f40305e;
        if (this.f40303c - i10 < 8) {
            N(8);
            i10 = this.f40305e;
        }
        byte[] bArr = this.f40301a;
        this.f40305e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public int z() {
        int i10;
        int i11 = this.f40305e;
        int i12 = this.f40303c;
        if (i12 != i11) {
            byte[] bArr = this.f40301a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f40305e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f40305e = i14;
                return i10;
            }
        }
        return (int) C();
    }
}
