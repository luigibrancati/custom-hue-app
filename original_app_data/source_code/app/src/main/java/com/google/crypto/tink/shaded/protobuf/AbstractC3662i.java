package com.google.crypto.tink.shaded.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3662i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile int f31463g = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3663j f31468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31469f;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC3662i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f31470h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f31471i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f31472j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f31473k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f31474l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f31475m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f31476n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f31477o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f31478p;

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long A() {
            return AbstractC3662i.e(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public String B() throws A {
            int iM = M();
            if (iM > 0) {
                int i10 = this.f31472j;
                int i11 = this.f31474l;
                if (iM <= i10 - i11) {
                    String str = new String(this.f31470h, i11, iM, AbstractC3678z.f31578b);
                    this.f31474l += iM;
                    return str;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                throw A.g();
            }
            throw A.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public String C() throws A {
            int iM = M();
            if (iM > 0) {
                int i10 = this.f31472j;
                int i11 = this.f31474l;
                if (iM <= i10 - i11) {
                    String strE = q0.e(this.f31470h, i11, iM);
                    this.f31474l += iM;
                    return strE;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM <= 0) {
                throw A.g();
            }
            throw A.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int D() throws A {
            if (g()) {
                this.f31476n = 0;
                return 0;
            }
            int iM = M();
            this.f31476n = iM;
            if (r0.a(iM) != 0) {
                return this.f31476n;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int E() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long F() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public boolean G(int i10) throws A {
            int iB = r0.b(i10);
            if (iB == 0) {
                R();
                return true;
            }
            if (iB == 1) {
                Q(8);
                return true;
            }
            if (iB == 2) {
                Q(M());
                return true;
            }
            if (iB == 3) {
                H();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                c();
                return false;
            }
            if (iB != 5) {
                throw A.e();
            }
            Q(4);
            return true;
        }

        public byte I() throws A {
            int i10 = this.f31474l;
            if (i10 == this.f31472j) {
                throw A.m();
            }
            byte[] bArr = this.f31470h;
            this.f31474l = i10 + 1;
            return bArr[i10];
        }

        public byte[] J(int i10) throws A {
            if (i10 > 0) {
                int i11 = this.f31472j;
                int i12 = this.f31474l;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f31474l = i13;
                    return Arrays.copyOfRange(this.f31470h, i12, i13);
                }
            }
            if (i10 > 0) {
                throw A.m();
            }
            if (i10 == 0) {
                return AbstractC3678z.f31580d;
            }
            throw A.g();
        }

        public int K() throws A {
            int i10 = this.f31474l;
            if (this.f31472j - i10 < 4) {
                throw A.m();
            }
            byte[] bArr = this.f31470h;
            this.f31474l = i10 + 4;
            return (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24);
        }

        public long L() throws A {
            int i10 = this.f31474l;
            if (this.f31472j - i10 < 8) {
                throw A.m();
            }
            byte[] bArr = this.f31470h;
            this.f31474l = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int M() {
            int i10;
            int i11 = this.f31474l;
            int i12 = this.f31472j;
            if (i12 != i11) {
                byte[] bArr = this.f31470h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f31474l = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
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
                    this.f31474l = i14;
                    return i10;
                }
            }
            return (int) O();
        }

        public long N() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f31474l;
            int i11 = this.f31472j;
            if (i11 != i10) {
                byte[] bArr = this.f31470h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f31474l = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f31474l = i13;
                    return j10;
                }
            }
            return O();
        }

        public long O() throws A {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bI = I();
                j10 |= ((long) (bI & 127)) << i10;
                if ((bI & 128) == 0) {
                    return j10;
                }
            }
            throw A.f();
        }

        public final void P() {
            int i10 = this.f31472j + this.f31473k;
            this.f31472j = i10;
            int i11 = i10 - this.f31475m;
            int i12 = this.f31478p;
            if (i11 <= i12) {
                this.f31473k = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f31473k = i13;
            this.f31472j = i10 - i13;
        }

        public void Q(int i10) throws A {
            if (i10 >= 0) {
                int i11 = this.f31472j;
                int i12 = this.f31474l;
                if (i10 <= i11 - i12) {
                    this.f31474l = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw A.m();
            }
            throw A.g();
        }

        public final void R() throws A {
            if (this.f31472j - this.f31474l >= 10) {
                S();
            } else {
                T();
            }
        }

        public final void S() throws A {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f31470h;
                int i11 = this.f31474l;
                this.f31474l = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        public final void T() throws A {
            for (int i10 = 0; i10 < 10; i10++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public void a(int i10) throws A {
            if (this.f31476n != i10) {
                throw A.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int f() {
            return this.f31474l - this.f31475m;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public boolean g() {
            return this.f31474l == this.f31472j;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public void m(int i10) {
            this.f31478p = i10;
            P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int n(int i10) throws A {
            if (i10 < 0) {
                throw A.g();
            }
            int iF = i10 + f();
            if (iF < 0) {
                throw A.l();
            }
            int i11 = this.f31478p;
            if (iF > i11) {
                throw A.m();
            }
            this.f31478p = iF;
            P();
            return i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public boolean o() {
            return N() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public AbstractC3661h p() {
            int iM = M();
            if (iM > 0) {
                int i10 = this.f31472j;
                int i11 = this.f31474l;
                if (iM <= i10 - i11) {
                    AbstractC3661h abstractC3661hE = (this.f31471i && this.f31477o) ? AbstractC3661h.E(this.f31470h, i11, iM) : AbstractC3661h.k(this.f31470h, i11, iM);
                    this.f31474l += iM;
                    return abstractC3661hE;
                }
            }
            return iM == 0 ? AbstractC3661h.f31448b : AbstractC3661h.B(J(iM));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public double q() {
            return Double.longBitsToDouble(L());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int r() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int s() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long t() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public float u() {
            return Float.intBitsToFloat(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int x() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long y() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int z() {
            return AbstractC3662i.d(M());
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f31478p = Integer.MAX_VALUE;
            this.f31470h = bArr;
            this.f31472j = i11 + i10;
            this.f31474l = i10;
            this.f31475m = i10;
            this.f31471i = z10;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC3662i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final InputStream f31479h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f31480i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f31481j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f31482k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f31483l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f31484m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f31485n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f31486o;

        public static int I(InputStream inputStream) throws A {
            try {
                return inputStream.available();
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        public static int J(InputStream inputStream, byte[] bArr, int i10, int i11) throws A {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        private void U() {
            int i10 = this.f31481j + this.f31482k;
            this.f31481j = i10;
            int i11 = this.f31485n + i10;
            int i12 = this.f31486o;
            if (i11 <= i12) {
                this.f31482k = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f31482k = i13;
            this.f31481j = i10 - i13;
        }

        public static long W(InputStream inputStream, long j10) throws A {
            try {
                return inputStream.skip(j10);
            } catch (A e10) {
                e10.j();
                throw e10;
            }
        }

        private void Z() throws A {
            if (this.f31481j - this.f31483l >= 10) {
                a0();
            } else {
                b0();
            }
        }

        private void a0() throws A {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f31480i;
                int i11 = this.f31483l;
                this.f31483l = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        private void b0() throws A {
            for (int i10 = 0; i10 < 10; i10++) {
                if (L() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long A() {
            return AbstractC3662i.e(S());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public String B() throws A {
            int iR = R();
            if (iR > 0) {
                int i10 = this.f31481j;
                int i11 = this.f31483l;
                if (iR <= i10 - i11) {
                    String str = new String(this.f31480i, i11, iR, AbstractC3678z.f31578b);
                    this.f31483l += iR;
                    return str;
                }
            }
            if (iR == 0) {
                return "";
            }
            if (iR < 0) {
                throw A.g();
            }
            if (iR > this.f31481j) {
                return new String(M(iR, false), AbstractC3678z.f31578b);
            }
            V(iR);
            String str2 = new String(this.f31480i, this.f31483l, iR, AbstractC3678z.f31578b);
            this.f31483l += iR;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public String C() throws IOException {
            byte[] bArrM;
            int iR = R();
            int i10 = this.f31483l;
            int i11 = this.f31481j;
            if (iR <= i11 - i10 && iR > 0) {
                bArrM = this.f31480i;
                this.f31483l = i10 + iR;
            } else {
                if (iR == 0) {
                    return "";
                }
                if (iR < 0) {
                    throw A.g();
                }
                i10 = 0;
                if (iR <= i11) {
                    V(iR);
                    bArrM = this.f31480i;
                    this.f31483l = iR;
                } else {
                    bArrM = M(iR, false);
                }
            }
            return q0.e(bArrM, i10, iR);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int D() throws A {
            if (g()) {
                this.f31484m = 0;
                return 0;
            }
            int iR = R();
            this.f31484m = iR;
            if (r0.a(iR) != 0) {
                return this.f31484m;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int E() {
            return R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long F() {
            return S();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public boolean G(int i10) throws A {
            int iB = r0.b(i10);
            if (iB == 0) {
                Z();
                return true;
            }
            if (iB == 1) {
                X(8);
                return true;
            }
            if (iB == 2) {
                X(R());
                return true;
            }
            if (iB == 3) {
                H();
                a(r0.c(r0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                c();
                return false;
            }
            if (iB != 5) {
                throw A.e();
            }
            X(4);
            return true;
        }

        public final AbstractC3661h K(int i10) throws IOException {
            byte[] bArrN = N(i10);
            if (bArrN != null) {
                return AbstractC3661h.h(bArrN);
            }
            int i11 = this.f31483l;
            int i12 = this.f31481j;
            int length = i12 - i11;
            this.f31485n += i12;
            this.f31483l = 0;
            this.f31481j = 0;
            List<byte[]> listO = O(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f31480i, i11, bArr, 0, length);
            for (byte[] bArr2 : listO) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC3661h.B(bArr);
        }

        public byte L() throws A {
            if (this.f31483l == this.f31481j) {
                V(1);
            }
            byte[] bArr = this.f31480i;
            int i10 = this.f31483l;
            this.f31483l = i10 + 1;
            return bArr[i10];
        }

        public final byte[] M(int i10, boolean z10) throws IOException {
            byte[] bArrN = N(i10);
            if (bArrN != null) {
                return z10 ? (byte[]) bArrN.clone() : bArrN;
            }
            int i11 = this.f31483l;
            int i12 = this.f31481j;
            int length = i12 - i11;
            this.f31485n += i12;
            this.f31483l = 0;
            this.f31481j = 0;
            List<byte[]> listO = O(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f31480i, i11, bArr, 0, length);
            for (byte[] bArr2 : listO) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] N(int i10) throws A {
            if (i10 == 0) {
                return AbstractC3678z.f31580d;
            }
            if (i10 < 0) {
                throw A.g();
            }
            int i11 = this.f31485n;
            int i12 = this.f31483l;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f31467d > 0) {
                throw A.l();
            }
            int i14 = this.f31486o;
            if (i13 > i14) {
                X((i14 - i11) - i12);
                throw A.m();
            }
            int i15 = this.f31481j - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > I(this.f31479h)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f31480i, this.f31483l, bArr, 0, i15);
            this.f31485n += this.f31481j;
            this.f31483l = 0;
            this.f31481j = 0;
            while (i15 < i10) {
                int iJ = J(this.f31479h, bArr, i15, i10 - i15);
                if (iJ == -1) {
                    throw A.m();
                }
                this.f31485n += iJ;
                i15 += iJ;
            }
            return bArr;
        }

        public final List O(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, RecognitionOptions.AZTEC);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f31479h.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw A.m();
                    }
                    this.f31485n += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int P() throws A {
            int i10 = this.f31483l;
            if (this.f31481j - i10 < 4) {
                V(4);
                i10 = this.f31483l;
            }
            byte[] bArr = this.f31480i;
            this.f31483l = i10 + 4;
            return (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24);
        }

        public long Q() throws A {
            int i10 = this.f31483l;
            if (this.f31481j - i10 < 8) {
                V(8);
                i10 = this.f31483l;
            }
            byte[] bArr = this.f31480i;
            this.f31483l = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int R() {
            int i10;
            int i11 = this.f31483l;
            int i12 = this.f31481j;
            if (i12 != i11) {
                byte[] bArr = this.f31480i;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f31483l = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
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
                    this.f31483l = i14;
                    return i10;
                }
            }
            return (int) T();
        }

        public long S() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f31483l;
            int i11 = this.f31481j;
            if (i11 != i10) {
                byte[] bArr = this.f31480i;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f31483l = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f31483l = i13;
                    return j10;
                }
            }
            return T();
        }

        public long T() throws A {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bL = L();
                j10 |= ((long) (bL & 127)) << i10;
                if ((bL & 128) == 0) {
                    return j10;
                }
            }
            throw A.f();
        }

        public final void V(int i10) throws A {
            if (c0(i10)) {
                return;
            }
            if (i10 <= (this.f31467d - this.f31485n) - this.f31483l) {
                throw A.m();
            }
            throw A.l();
        }

        public void X(int i10) throws A {
            int i11 = this.f31481j;
            int i12 = this.f31483l;
            if (i10 > i11 - i12 || i10 < 0) {
                Y(i10);
            } else {
                this.f31483l = i12 + i10;
            }
        }

        public final void Y(int i10) throws A {
            if (i10 < 0) {
                throw A.g();
            }
            int i11 = this.f31485n;
            int i12 = this.f31483l;
            int i13 = i11 + i12 + i10;
            int i14 = this.f31486o;
            if (i13 > i14) {
                X((i14 - i11) - i12);
                throw A.m();
            }
            this.f31485n = i11 + i12;
            int i15 = this.f31481j - i12;
            this.f31481j = 0;
            this.f31483l = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jW = W(this.f31479h, j10);
                    if (jW < 0 || jW > j10) {
                        throw new IllegalStateException(this.f31479h.getClass() + "#skip returned invalid result: " + jW + "\nThe InputStream implementation is buggy.");
                    }
                    if (jW == 0) {
                        break;
                    } else {
                        i15 += (int) jW;
                    }
                } finally {
                    this.f31485n += i15;
                    U();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f31481j;
            int i17 = i16 - this.f31483l;
            this.f31483l = i16;
            V(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f31481j;
                if (i18 <= i19) {
                    this.f31483l = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f31483l = i19;
                    V(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public void a(int i10) throws A {
            if (this.f31484m != i10) {
                throw A.b();
            }
        }

        public final boolean c0(int i10) throws A {
            int i11 = this.f31483l;
            int i12 = i11 + i10;
            int i13 = this.f31481j;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f31467d;
            int i15 = this.f31485n;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f31486o) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f31480i;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f31485n += i11;
                this.f31481j -= i11;
                this.f31483l = 0;
            }
            InputStream inputStream = this.f31479h;
            byte[] bArr2 = this.f31480i;
            int i16 = this.f31481j;
            int iJ = J(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f31467d - this.f31485n) - i16));
            if (iJ != 0 && iJ >= -1 && iJ <= this.f31480i.length) {
                if (iJ <= 0) {
                    return false;
                }
                this.f31481j += iJ;
                U();
                return this.f31481j >= i10 || c0(i10);
            }
            throw new IllegalStateException(this.f31479h.getClass() + "#read(byte[]) returned invalid result: " + iJ + "\nThe InputStream implementation is buggy.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int f() {
            return this.f31485n + this.f31483l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public boolean g() {
            return this.f31483l == this.f31481j && !c0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public void m(int i10) {
            this.f31486o = i10;
            U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int n(int i10) throws A {
            if (i10 < 0) {
                throw A.g();
            }
            int i11 = i10 + this.f31485n + this.f31483l;
            if (i11 < 0) {
                throw A.l();
            }
            int i12 = this.f31486o;
            if (i11 > i12) {
                throw A.m();
            }
            this.f31486o = i11;
            U();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public boolean o() {
            return S() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public AbstractC3661h p() throws A {
            int iR = R();
            int i10 = this.f31481j;
            int i11 = this.f31483l;
            if (iR <= i10 - i11 && iR > 0) {
                AbstractC3661h abstractC3661hK = AbstractC3661h.k(this.f31480i, i11, iR);
                this.f31483l += iR;
                return abstractC3661hK;
            }
            if (iR == 0) {
                return AbstractC3661h.f31448b;
            }
            if (iR >= 0) {
                return K(iR);
            }
            throw A.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public double q() {
            return Double.longBitsToDouble(Q());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int r() {
            return R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int s() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long t() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public float u() {
            return Float.intBitsToFloat(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int v() {
            return R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long w() {
            return S();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int x() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public long y() {
            return Q();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3662i
        public int z() {
            return AbstractC3662i.d(R());
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f31486o = Integer.MAX_VALUE;
            AbstractC3678z.b(inputStream, "input");
            this.f31479h = inputStream;
            this.f31480i = new byte[i10];
            this.f31481j = 0;
            this.f31483l = 0;
            this.f31485n = 0;
        }
    }

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long e(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC3662i h(InputStream inputStream) {
        return i(inputStream, RecognitionOptions.AZTEC);
    }

    public static AbstractC3662i i(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? j(AbstractC3678z.f31580d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC3662i j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static AbstractC3662i k(byte[] bArr, int i10, int i11) {
        return l(bArr, i10, i11, false);
    }

    public static AbstractC3662i l(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.n(i11);
            return bVar;
        } catch (A e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract long A();

    public abstract String B();

    public abstract String C();

    public abstract int D();

    public abstract int E();

    public abstract long F();

    public abstract boolean G(int i10);

    public void H() throws A {
        int iD;
        do {
            iD = D();
            if (iD == 0) {
                return;
            }
            b();
            this.f31465b++;
            this.f31465b--;
        } while (G(iD));
    }

    public abstract void a(int i10);

    public void b() throws A {
        if (this.f31464a + this.f31465b >= this.f31466c) {
            throw A.i();
        }
    }

    public void c() {
        if (this.f31465b == 0) {
            a(0);
        }
    }

    public abstract int f();

    public abstract boolean g();

    public abstract void m(int i10);

    public abstract int n(int i10);

    public abstract boolean o();

    public abstract AbstractC3661h p();

    public abstract double q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract float u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract int z();

    public AbstractC3662i() {
        this.f31466c = f31463g;
        this.f31467d = Integer.MAX_VALUE;
        this.f31469f = false;
    }
}
