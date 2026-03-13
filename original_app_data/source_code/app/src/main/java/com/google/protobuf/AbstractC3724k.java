package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.InterfaceC3717g0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3724k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile int f32268f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3726l f32272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32273e;

    /* JADX INFO: renamed from: com.google.protobuf.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC3724k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f32274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f32275h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f32276i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f32277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f32278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f32279l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f32280m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f32281n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f32282o;

        @Override // com.google.protobuf.AbstractC3724k
        public void A(InterfaceC3717g0.a aVar, D d10) throws O {
            int iB = B();
            b();
            int iP = p(iB);
            this.f32269a++;
            aVar.mergeFrom(this, d10);
            a(0);
            this.f32269a--;
            if (e() != 0) {
                throw O.m();
            }
            o(iP);
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int B() {
            int i10;
            int i11 = this.f32278k;
            int i12 = this.f32276i;
            if (i12 != i11) {
                byte[] bArr = this.f32274g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f32278k = i13;
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
                    this.f32278k = i14;
                    return i10;
                }
            }
            return (int) T();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int D() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long E() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int F() {
            return AbstractC3724k.c(B());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long G() {
            return AbstractC3724k.d(S());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public String H() throws O {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f32276i;
                int i11 = this.f32278k;
                if (iB <= i10 - i11) {
                    String str = new String(this.f32274g, i11, iB, N.f32140b);
                    this.f32278k += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw O.g();
            }
            throw O.m();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public String I() throws O {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f32276i;
                int i11 = this.f32278k;
                if (iB <= i10 - i11) {
                    String strH = O0.h(this.f32274g, i11, iB);
                    this.f32278k += iB;
                    return strH;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw O.g();
            }
            throw O.m();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int J() throws O {
            if (g()) {
                this.f32280m = 0;
                return 0;
            }
            int iB = B();
            this.f32280m = iB;
            if (Q0.a(iB) != 0) {
                return this.f32280m;
            }
            throw O.c();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long L() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean M(int i10) throws O {
            int iB = Q0.b(i10);
            if (iB == 0) {
                W();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(B());
                return true;
            }
            if (iB == 3) {
                N();
                a(Q0.c(Q0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw O.e();
            }
            V(4);
            return true;
        }

        public byte O() throws O {
            int i10 = this.f32278k;
            if (i10 == this.f32276i) {
                throw O.m();
            }
            byte[] bArr = this.f32274g;
            this.f32278k = i10 + 1;
            return bArr[i10];
        }

        public byte[] P(int i10) throws O {
            if (i10 > 0) {
                int i11 = this.f32276i;
                int i12 = this.f32278k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f32278k = i13;
                    return Arrays.copyOfRange(this.f32274g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw O.m();
            }
            if (i10 == 0) {
                return N.f32142d;
            }
            throw O.g();
        }

        public int Q() throws O {
            int i10 = this.f32278k;
            if (this.f32276i - i10 < 4) {
                throw O.m();
            }
            byte[] bArr = this.f32274g;
            this.f32278k = i10 + 4;
            return (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24);
        }

        public long R() throws O {
            int i10 = this.f32278k;
            if (this.f32276i - i10 < 8) {
                throw O.m();
            }
            byte[] bArr = this.f32274g;
            this.f32278k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long S() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f32278k;
            int i11 = this.f32276i;
            if (i11 != i10) {
                byte[] bArr = this.f32274g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f32278k = i12;
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
                    this.f32278k = i13;
                    return j10;
                }
            }
            return T();
        }

        public long T() throws O {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bO = O();
                j10 |= ((long) (bO & 127)) << i10;
                if ((bO & 128) == 0) {
                    return j10;
                }
            }
            throw O.f();
        }

        public final void U() {
            int i10 = this.f32276i + this.f32277j;
            this.f32276i = i10;
            int i11 = i10 - this.f32279l;
            int i12 = this.f32282o;
            if (i11 <= i12) {
                this.f32277j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f32277j = i13;
            this.f32276i = i10 - i13;
        }

        public void V(int i10) throws O {
            if (i10 >= 0) {
                int i11 = this.f32276i;
                int i12 = this.f32278k;
                if (i10 <= i11 - i12) {
                    this.f32278k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw O.m();
            }
            throw O.g();
        }

        public final void W() throws O {
            if (this.f32276i - this.f32278k >= 10) {
                X();
            } else {
                Y();
            }
        }

        public final void X() throws O {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f32274g;
                int i11 = this.f32278k;
                this.f32278k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw O.f();
        }

        public final void Y() throws O {
            for (int i10 = 0; i10 < 10; i10++) {
                if (O() >= 0) {
                    return;
                }
            }
            throw O.f();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void a(int i10) throws O {
            if (this.f32280m != i10) {
                throw O.b();
            }
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int e() {
            int i10 = this.f32282o;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int f() {
            return this.f32278k - this.f32279l;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean g() {
            return this.f32278k == this.f32276i;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void o(int i10) {
            this.f32282o = i10;
            U();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int p(int i10) throws O {
            if (i10 < 0) {
                throw O.g();
            }
            int iF = i10 + f();
            if (iF < 0) {
                throw O.h();
            }
            int i11 = this.f32282o;
            if (iF > i11) {
                throw O.m();
            }
            this.f32282o = iF;
            U();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean q() {
            return S() != 0;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public AbstractC3722j r() {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f32276i;
                int i11 = this.f32278k;
                if (iB <= i10 - i11) {
                    AbstractC3722j abstractC3722jO = (this.f32275h && this.f32281n) ? AbstractC3722j.O(this.f32274g, i11, iB) : AbstractC3722j.l(this.f32274g, i11, iB);
                    this.f32278k += iB;
                    return abstractC3722jO;
                }
            }
            return iB == 0 ? AbstractC3722j.f32236b : AbstractC3722j.N(P(iB));
        }

        @Override // com.google.protobuf.AbstractC3724k
        public double s() {
            return Double.longBitsToDouble(R());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int u() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long v() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public float w() {
            return Float.intBitsToFloat(Q());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void x(int i10, InterfaceC3717g0.a aVar, D d10) throws O {
            b();
            this.f32269a++;
            aVar.mergeFrom(this, d10);
            a(Q0.c(i10, 4));
            this.f32269a--;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long z() {
            return S();
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f32282o = Integer.MAX_VALUE;
            this.f32274g = bArr;
            this.f32276i = i11 + i10;
            this.f32278k = i10;
            this.f32279l = i10;
            this.f32275h = z10;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC3724k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InputStream f32283g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f32284h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f32285i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f32286j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f32287k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f32288l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f32289m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f32290n;

        public static int O(InputStream inputStream) throws O {
            try {
                return inputStream.available();
            } catch (O e10) {
                e10.j();
                throw e10;
            }
        }

        public static int P(InputStream inputStream, byte[] bArr, int i10, int i11) throws O {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (O e10) {
                e10.j();
                throw e10;
            }
        }

        private void Z() {
            int i10 = this.f32285i + this.f32286j;
            this.f32285i = i10;
            int i11 = this.f32289m + i10;
            int i12 = this.f32290n;
            if (i11 <= i12) {
                this.f32286j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f32286j = i13;
            this.f32285i = i10 - i13;
        }

        public static long b0(InputStream inputStream, long j10) throws O {
            try {
                return inputStream.skip(j10);
            } catch (O e10) {
                e10.j();
                throw e10;
            }
        }

        private void e0() throws O {
            if (this.f32285i - this.f32287k >= 10) {
                f0();
            } else {
                g0();
            }
        }

        private void f0() throws O {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f32284h;
                int i11 = this.f32287k;
                this.f32287k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw O.f();
        }

        private void g0() throws O {
            for (int i10 = 0; i10 < 10; i10++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw O.f();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void A(InterfaceC3717g0.a aVar, D d10) throws O {
            int iB = B();
            b();
            int iP = p(iB);
            this.f32269a++;
            aVar.mergeFrom(this, d10);
            a(0);
            this.f32269a--;
            if (e() != 0) {
                throw O.m();
            }
            o(iP);
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int B() {
            int i10;
            int i11 = this.f32287k;
            int i12 = this.f32285i;
            if (i12 != i11) {
                byte[] bArr = this.f32284h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f32287k = i13;
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
                    this.f32287k = i14;
                    return i10;
                }
            }
            return (int) Y();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int D() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long E() {
            return W();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int F() {
            return AbstractC3724k.c(B());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long G() {
            return AbstractC3724k.d(X());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public String H() throws O {
            int iB = B();
            if (iB > 0) {
                int i10 = this.f32285i;
                int i11 = this.f32287k;
                if (iB <= i10 - i11) {
                    String str = new String(this.f32284h, i11, iB, N.f32140b);
                    this.f32287k += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw O.g();
            }
            if (iB > this.f32285i) {
                return new String(S(iB, false), N.f32140b);
            }
            a0(iB);
            String str2 = new String(this.f32284h, this.f32287k, iB, N.f32140b);
            this.f32287k += iB;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public String I() throws IOException {
            byte[] bArrS;
            int iB = B();
            int i10 = this.f32287k;
            int i11 = this.f32285i;
            if (iB <= i11 - i10 && iB > 0) {
                bArrS = this.f32284h;
                this.f32287k = i10 + iB;
            } else {
                if (iB == 0) {
                    return "";
                }
                if (iB < 0) {
                    throw O.g();
                }
                i10 = 0;
                if (iB <= i11) {
                    a0(iB);
                    bArrS = this.f32284h;
                    this.f32287k = iB;
                } else {
                    bArrS = S(iB, false);
                }
            }
            return O0.h(bArrS, i10, iB);
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int J() throws O {
            if (g()) {
                this.f32288l = 0;
                return 0;
            }
            int iB = B();
            this.f32288l = iB;
            if (Q0.a(iB) != 0) {
                return this.f32288l;
            }
            throw O.c();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long L() {
            return X();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean M(int i10) throws O {
            int iB = Q0.b(i10);
            if (iB == 0) {
                e0();
                return true;
            }
            if (iB == 1) {
                c0(8);
                return true;
            }
            if (iB == 2) {
                c0(B());
                return true;
            }
            if (iB == 3) {
                N();
                a(Q0.c(Q0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw O.e();
            }
            c0(4);
            return true;
        }

        public final AbstractC3722j Q(int i10) throws IOException {
            byte[] bArrT = T(i10);
            if (bArrT != null) {
                return AbstractC3722j.k(bArrT);
            }
            int i11 = this.f32287k;
            int i12 = this.f32285i;
            int length = i12 - i11;
            this.f32289m += i12;
            this.f32287k = 0;
            this.f32285i = 0;
            List<byte[]> listU = U(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f32284h, i11, bArr, 0, length);
            for (byte[] bArr2 : listU) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC3722j.N(bArr);
        }

        public byte R() throws O {
            if (this.f32287k == this.f32285i) {
                a0(1);
            }
            byte[] bArr = this.f32284h;
            int i10 = this.f32287k;
            this.f32287k = i10 + 1;
            return bArr[i10];
        }

        public final byte[] S(int i10, boolean z10) throws IOException {
            byte[] bArrT = T(i10);
            if (bArrT != null) {
                return z10 ? (byte[]) bArrT.clone() : bArrT;
            }
            int i11 = this.f32287k;
            int i12 = this.f32285i;
            int length = i12 - i11;
            this.f32289m += i12;
            this.f32287k = 0;
            this.f32285i = 0;
            List<byte[]> listU = U(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f32284h, i11, bArr, 0, length);
            for (byte[] bArr2 : listU) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] T(int i10) throws O {
            if (i10 == 0) {
                return N.f32142d;
            }
            if (i10 < 0) {
                throw O.g();
            }
            int i11 = this.f32289m;
            int i12 = this.f32287k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f32271c > 0) {
                throw O.l();
            }
            int i14 = this.f32290n;
            if (i13 > i14) {
                c0((i14 - i11) - i12);
                throw O.m();
            }
            int i15 = this.f32285i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > O(this.f32283g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f32284h, this.f32287k, bArr, 0, i15);
            this.f32289m += this.f32285i;
            this.f32287k = 0;
            this.f32285i = 0;
            while (i15 < i10) {
                int iP = P(this.f32283g, bArr, i15, i10 - i15);
                if (iP == -1) {
                    throw O.m();
                }
                this.f32289m += iP;
                i15 += iP;
            }
            return bArr;
        }

        public final List U(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, RecognitionOptions.AZTEC);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f32283g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw O.m();
                    }
                    this.f32289m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int V() throws O {
            int i10 = this.f32287k;
            if (this.f32285i - i10 < 4) {
                a0(4);
                i10 = this.f32287k;
            }
            byte[] bArr = this.f32284h;
            this.f32287k = i10 + 4;
            return (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24);
        }

        public long W() throws O {
            int i10 = this.f32287k;
            if (this.f32285i - i10 < 8) {
                a0(8);
                i10 = this.f32287k;
            }
            byte[] bArr = this.f32284h;
            this.f32287k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public long X() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f32287k;
            int i11 = this.f32285i;
            if (i11 != i10) {
                byte[] bArr = this.f32284h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f32287k = i12;
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
                    this.f32287k = i13;
                    return j10;
                }
            }
            return Y();
        }

        public long Y() throws O {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bR = R();
                j10 |= ((long) (bR & 127)) << i10;
                if ((bR & 128) == 0) {
                    return j10;
                }
            }
            throw O.f();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void a(int i10) throws O {
            if (this.f32288l != i10) {
                throw O.b();
            }
        }

        public final void a0(int i10) throws O {
            if (h0(i10)) {
                return;
            }
            if (i10 <= (this.f32271c - this.f32289m) - this.f32287k) {
                throw O.m();
            }
            throw O.l();
        }

        public void c0(int i10) throws O {
            int i11 = this.f32285i;
            int i12 = this.f32287k;
            if (i10 > i11 - i12 || i10 < 0) {
                d0(i10);
            } else {
                this.f32287k = i12 + i10;
            }
        }

        public final void d0(int i10) throws O {
            if (i10 < 0) {
                throw O.g();
            }
            int i11 = this.f32289m;
            int i12 = this.f32287k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f32290n;
            if (i13 > i14) {
                c0((i14 - i11) - i12);
                throw O.m();
            }
            this.f32289m = i11 + i12;
            int i15 = this.f32285i - i12;
            this.f32285i = 0;
            this.f32287k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jB0 = b0(this.f32283g, j10);
                    if (jB0 < 0 || jB0 > j10) {
                        throw new IllegalStateException(this.f32283g.getClass() + "#skip returned invalid result: " + jB0 + "\nThe InputStream implementation is buggy.");
                    }
                    if (jB0 == 0) {
                        break;
                    } else {
                        i15 += (int) jB0;
                    }
                } finally {
                    this.f32289m += i15;
                    Z();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f32285i;
            int i17 = i16 - this.f32287k;
            this.f32287k = i16;
            a0(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f32285i;
                if (i18 <= i19) {
                    this.f32287k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f32287k = i19;
                    a0(1);
                }
            }
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int e() {
            int i10 = this.f32290n;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - (this.f32289m + this.f32287k);
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int f() {
            return this.f32289m + this.f32287k;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean g() {
            return this.f32287k == this.f32285i && !h0(1);
        }

        public final boolean h0(int i10) throws O {
            int i11 = this.f32287k;
            int i12 = i11 + i10;
            int i13 = this.f32285i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f32271c;
            int i15 = this.f32289m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f32290n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f32284h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f32289m += i11;
                this.f32285i -= i11;
                this.f32287k = 0;
            }
            InputStream inputStream = this.f32283g;
            byte[] bArr2 = this.f32284h;
            int i16 = this.f32285i;
            int iP = P(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f32271c - this.f32289m) - i16));
            if (iP == 0 || iP < -1 || iP > this.f32284h.length) {
                throw new IllegalStateException(this.f32283g.getClass() + "#read(byte[]) returned invalid result: " + iP + "\nThe InputStream implementation is buggy.");
            }
            if (iP <= 0) {
                return false;
            }
            this.f32285i += iP;
            Z();
            if (this.f32285i >= i10) {
                return true;
            }
            return h0(i10);
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void o(int i10) {
            this.f32290n = i10;
            Z();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int p(int i10) throws O {
            if (i10 < 0) {
                throw O.g();
            }
            int i11 = i10 + this.f32289m + this.f32287k;
            int i12 = this.f32290n;
            if (i11 > i12) {
                throw O.m();
            }
            this.f32290n = i11;
            Z();
            return i12;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean q() {
            return X() != 0;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public AbstractC3722j r() throws O {
            int iB = B();
            int i10 = this.f32285i;
            int i11 = this.f32287k;
            if (iB <= i10 - i11 && iB > 0) {
                AbstractC3722j abstractC3722jL = AbstractC3722j.l(this.f32284h, i11, iB);
                this.f32287k += iB;
                return abstractC3722jL;
            }
            if (iB == 0) {
                return AbstractC3722j.f32236b;
            }
            if (iB >= 0) {
                return Q(iB);
            }
            throw O.g();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public double s() {
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int u() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long v() {
            return W();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public float w() {
            return Float.intBitsToFloat(V());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void x(int i10, InterfaceC3717g0.a aVar, D d10) throws O {
            b();
            this.f32269a++;
            aVar.mergeFrom(this, d10);
            a(Q0.c(i10, 4));
            this.f32269a--;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long z() {
            return X();
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f32290n = Integer.MAX_VALUE;
            N.b(inputStream, "input");
            this.f32283g = inputStream;
            this.f32284h = new byte[i10];
            this.f32285i = 0;
            this.f32287k = 0;
            this.f32289m = 0;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.k$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC3724k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ByteBuffer f32291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f32292h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f32293i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f32294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f32295k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f32296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f32297m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f32298n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f32299o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f32300p;

        public static boolean P() {
            return N0.J();
        }

        private void V() {
            long j10 = this.f32294j + ((long) this.f32297m);
            this.f32294j = j10;
            int i10 = (int) (j10 - this.f32296l);
            int i11 = this.f32300p;
            if (i10 <= i11) {
                this.f32297m = 0;
                return;
            }
            int i12 = i10 - i11;
            this.f32297m = i12;
            this.f32294j = j10 - ((long) i12);
        }

        private void Y() throws O {
            if (W() >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws O {
            for (int i10 = 0; i10 < 10; i10++) {
                long j10 = this.f32295k;
                this.f32295k = 1 + j10;
                if (N0.w(j10) >= 0) {
                    return;
                }
            }
            throw O.f();
        }

        private void a0() throws O {
            for (int i10 = 0; i10 < 10; i10++) {
                if (Q() >= 0) {
                    return;
                }
            }
            throw O.f();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void A(InterfaceC3717g0.a aVar, D d10) throws O {
            int iB = B();
            b();
            int iP = p(iB);
            this.f32269a++;
            aVar.mergeFrom(this, d10);
            a(0);
            this.f32269a--;
            if (e() != 0) {
                throw O.m();
            }
            o(iP);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.N0.w(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.AbstractC3724k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int B() {
            /*
                r9 = this;
                long r0 = r9.f32295k
                long r2 = r9.f32294j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.N0.w(r0)
                if (r4 < 0) goto L16
                r9.f32295k = r2
                return r4
            L16:
                long r5 = r9.f32294j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.N0.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.N0.w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.N0.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.N0.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.N0.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.N0.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.N0.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.N0.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.N0.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.U()
                int r9 = (int) r0
                return r9
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f32295k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC3724k.d.B():int");
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int D() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long E() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int F() {
            return AbstractC3724k.c(B());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long G() {
            return AbstractC3724k.d(T());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public String H() throws O {
            int iB = B();
            if (iB <= 0 || iB > W()) {
                if (iB == 0) {
                    return "";
                }
                if (iB < 0) {
                    throw O.g();
                }
                throw O.m();
            }
            byte[] bArr = new byte[iB];
            long j10 = iB;
            N0.p(this.f32295k, bArr, 0L, j10);
            String str = new String(bArr, N.f32140b);
            this.f32295k += j10;
            return str;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public String I() throws O {
            int iB = B();
            if (iB > 0 && iB <= W()) {
                String strG = O0.g(this.f32291g, O(this.f32295k), iB);
                this.f32295k += (long) iB;
                return strG;
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw O.g();
            }
            throw O.m();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int J() throws O {
            if (g()) {
                this.f32298n = 0;
                return 0;
            }
            int iB = B();
            this.f32298n = iB;
            if (Q0.a(iB) != 0) {
                return this.f32298n;
            }
            throw O.c();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int K() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long L() {
            return T();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean M(int i10) throws O {
            int iB = Q0.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                X(8);
                return true;
            }
            if (iB == 2) {
                X(B());
                return true;
            }
            if (iB == 3) {
                N();
                a(Q0.c(Q0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw O.e();
            }
            X(4);
            return true;
        }

        public final int O(long j10) {
            return (int) (j10 - this.f32293i);
        }

        public byte Q() throws O {
            long j10 = this.f32295k;
            if (j10 == this.f32294j) {
                throw O.m();
            }
            this.f32295k = 1 + j10;
            return N0.w(j10);
        }

        public int R() throws O {
            long j10 = this.f32295k;
            if (this.f32294j - j10 < 4) {
                throw O.m();
            }
            this.f32295k = 4 + j10;
            return (N0.w(j10) & ForkServer.ERROR) | ((N0.w(1 + j10) & ForkServer.ERROR) << 8) | ((N0.w(2 + j10) & ForkServer.ERROR) << 16) | ((N0.w(j10 + 3) & ForkServer.ERROR) << 24);
        }

        public long S() throws O {
            long j10 = this.f32295k;
            if (this.f32294j - j10 < 8) {
                throw O.m();
            }
            this.f32295k = 8 + j10;
            return ((((long) N0.w(j10 + 7)) & 255) << 56) | (((long) N0.w(j10)) & 255) | ((((long) N0.w(1 + j10)) & 255) << 8) | ((((long) N0.w(2 + j10)) & 255) << 16) | ((((long) N0.w(3 + j10)) & 255) << 24) | ((((long) N0.w(4 + j10)) & 255) << 32) | ((((long) N0.w(5 + j10)) & 255) << 40) | ((((long) N0.w(6 + j10)) & 255) << 48);
        }

        public long T() {
            long j10;
            long j11;
            long j12;
            int i10;
            long j13 = this.f32295k;
            if (this.f32294j != j13) {
                long j14 = 1 + j13;
                byte bW = N0.w(j13);
                if (bW >= 0) {
                    this.f32295k = j14;
                    return bW;
                }
                if (this.f32294j - j14 >= 9) {
                    long j15 = 2 + j13;
                    int iW = (N0.w(j14) << 7) ^ bW;
                    if (iW >= 0) {
                        long j16 = 3 + j13;
                        int iW2 = iW ^ (N0.w(j15) << 14);
                        if (iW2 >= 0) {
                            j10 = iW2 ^ 16256;
                            j15 = j16;
                        } else {
                            j15 = 4 + j13;
                            int iW3 = iW2 ^ (N0.w(j16) << 21);
                            if (iW3 < 0) {
                                i10 = (-2080896) ^ iW3;
                            } else {
                                long j17 = 5 + j13;
                                long jW = ((long) iW3) ^ (((long) N0.w(j15)) << 28);
                                if (jW >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j18 = 6 + j13;
                                    long jW2 = jW ^ (((long) N0.w(j17)) << 35);
                                    if (jW2 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j17 = 7 + j13;
                                        jW = jW2 ^ (((long) N0.w(j18)) << 42);
                                        if (jW >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j18 = 8 + j13;
                                            jW2 = jW ^ (((long) N0.w(j17)) << 49);
                                            if (jW2 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                long j19 = j13 + 9;
                                                long jW3 = (jW2 ^ (((long) N0.w(j18)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j20 = j13 + 10;
                                                    if (N0.w(j19) >= 0) {
                                                        j15 = j20;
                                                        j10 = jW3;
                                                    }
                                                } else {
                                                    j10 = jW3;
                                                    j15 = j19;
                                                }
                                            }
                                        }
                                    }
                                    j10 = j11 ^ jW2;
                                    j15 = j18;
                                }
                                j10 = j12 ^ jW;
                                j15 = j17;
                            }
                        }
                        this.f32295k = j15;
                        return j10;
                    }
                    i10 = iW ^ (-128);
                    j10 = i10;
                    this.f32295k = j15;
                    return j10;
                }
            }
            return U();
        }

        public long U() throws O {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bQ = Q();
                j10 |= ((long) (bQ & 127)) << i10;
                if ((bQ & 128) == 0) {
                    return j10;
                }
            }
            throw O.f();
        }

        public final int W() {
            return (int) (this.f32294j - this.f32295k);
        }

        public void X(int i10) throws O {
            if (i10 >= 0 && i10 <= W()) {
                this.f32295k += (long) i10;
            } else {
                if (i10 >= 0) {
                    throw O.m();
                }
                throw O.g();
            }
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void a(int i10) throws O {
            if (this.f32298n != i10) {
                throw O.b();
            }
        }

        public final ByteBuffer b0(long j10, long j11) {
            int iPosition = this.f32291g.position();
            int iLimit = this.f32291g.limit();
            ByteBuffer byteBuffer = this.f32291g;
            try {
                try {
                    byteBuffer.position(O(j10));
                    byteBuffer.limit(O(j11));
                    return this.f32291g.slice();
                } catch (IllegalArgumentException e10) {
                    O oM = O.m();
                    oM.initCause(e10);
                    throw oM;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int e() {
            int i10 = this.f32300p;
            if (i10 == Integer.MAX_VALUE) {
                return -1;
            }
            return i10 - f();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int f() {
            return (int) (this.f32295k - this.f32296l);
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean g() {
            return this.f32295k == this.f32294j;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void o(int i10) {
            this.f32300p = i10;
            V();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int p(int i10) throws O {
            if (i10 < 0) {
                throw O.g();
            }
            int iF = i10 + f();
            int i11 = this.f32300p;
            if (iF > i11) {
                throw O.m();
            }
            this.f32300p = iF;
            V();
            return i11;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public boolean q() {
            return T() != 0;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public AbstractC3722j r() throws O {
            int iB = B();
            if (iB <= 0 || iB > W()) {
                if (iB == 0) {
                    return AbstractC3722j.f32236b;
                }
                if (iB < 0) {
                    throw O.g();
                }
                throw O.m();
            }
            if (this.f32292h && this.f32299o) {
                long j10 = this.f32295k;
                long j11 = iB;
                ByteBuffer byteBufferB0 = b0(j10, j10 + j11);
                this.f32295k += j11;
                return AbstractC3722j.M(byteBufferB0);
            }
            byte[] bArr = new byte[iB];
            long j12 = iB;
            N0.p(this.f32295k, bArr, 0L, j12);
            this.f32295k += j12;
            return AbstractC3722j.N(bArr);
        }

        @Override // com.google.protobuf.AbstractC3724k
        public double s() {
            return Double.longBitsToDouble(S());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int t() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int u() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long v() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public float w() {
            return Float.intBitsToFloat(R());
        }

        @Override // com.google.protobuf.AbstractC3724k
        public void x(int i10, InterfaceC3717g0.a aVar, D d10) throws O {
            b();
            this.f32269a++;
            aVar.mergeFrom(this, d10);
            a(Q0.c(i10, 4));
            this.f32269a--;
        }

        @Override // com.google.protobuf.AbstractC3724k
        public int y() {
            return B();
        }

        @Override // com.google.protobuf.AbstractC3724k
        public long z() {
            return T();
        }

        public d(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f32300p = Integer.MAX_VALUE;
            this.f32291g = byteBuffer;
            long jK = N0.k(byteBuffer);
            this.f32293i = jK;
            this.f32294j = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f32295k = jPosition;
            this.f32296l = jPosition;
            this.f32292h = z10;
        }
    }

    public static int C(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw O.m();
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
                throw O.m();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw O.f();
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC3724k h(InputStream inputStream) {
        return i(inputStream, RecognitionOptions.AZTEC);
    }

    public static AbstractC3724k i(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? l(N.f32142d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC3724k j(ByteBuffer byteBuffer) {
        return k(byteBuffer, false);
    }

    public static AbstractC3724k k(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return n(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && d.P()) {
            return new d(byteBuffer, z10);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return n(bArr, 0, iRemaining, true);
    }

    public static AbstractC3724k l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static AbstractC3724k m(byte[] bArr, int i10, int i11) {
        return n(bArr, i10, i11, false);
    }

    public static AbstractC3724k n(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.p(i11);
            return bVar;
        } catch (O e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract void A(InterfaceC3717g0.a aVar, D d10);

    public abstract int B();

    public abstract int D();

    public abstract long E();

    public abstract int F();

    public abstract long G();

    public abstract String H();

    public abstract String I();

    public abstract int J();

    public abstract int K();

    public abstract long L();

    public abstract boolean M(int i10);

    public void N() throws O {
        int iJ;
        do {
            iJ = J();
            if (iJ == 0) {
                return;
            }
            b();
            this.f32269a++;
            this.f32269a--;
        } while (M(iJ));
    }

    public abstract void a(int i10);

    public void b() throws O {
        if (this.f32269a >= this.f32270b) {
            throw O.i();
        }
    }

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public abstract void o(int i10);

    public abstract int p(int i10);

    public abstract boolean q();

    public abstract AbstractC3722j r();

    public abstract double s();

    public abstract int t();

    public abstract int u();

    public abstract long v();

    public abstract float w();

    public abstract void x(int i10, InterfaceC3717g0.a aVar, D d10);

    public abstract int y();

    public abstract long z();

    public AbstractC3724k() {
        this.f32270b = f32268f;
        this.f32271c = Integer.MAX_VALUE;
        this.f32273e = false;
    }
}
