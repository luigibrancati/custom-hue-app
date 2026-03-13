package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2701g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile int f22806f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2702h f22810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22811e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC2701g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f22812g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f22813h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22814i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22815j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22816k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f22817l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22818m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f22819n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f22820o;

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public String A() throws C2715v {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f22814i;
                int i11 = this.f22816k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f22812g, i11, iL, AbstractC2714u.f22907b);
                    this.f22816k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw C2715v.g();
            }
            throw C2715v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public String B() throws C2715v {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f22814i;
                int i11 = this.f22816k;
                if (iL <= i10 - i11) {
                    String strA = k0.a(this.f22812g, i11, iL);
                    this.f22816k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw C2715v.g();
            }
            throw C2715v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int C() throws C2715v {
            if (f()) {
                this.f22818m = 0;
                return 0;
            }
            int iL = L();
            this.f22818m = iL;
            if (l0.a(iL) != 0) {
                return this.f22818m;
            }
            throw C2715v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public boolean F(int i10) throws C2715v {
            int iB = l0.b(i10);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(l0.c(l0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C2715v.e();
            }
            P(4);
            return true;
        }

        public byte H() throws C2715v {
            int i10 = this.f22816k;
            if (i10 == this.f22814i) {
                throw C2715v.m();
            }
            byte[] bArr = this.f22812g;
            this.f22816k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws C2715v {
            if (i10 > 0) {
                int i11 = this.f22814i;
                int i12 = this.f22816k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f22816k = i13;
                    return Arrays.copyOfRange(this.f22812g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C2715v.m();
            }
            if (i10 == 0) {
                return AbstractC2714u.f22909d;
            }
            throw C2715v.g();
        }

        public int J() throws C2715v {
            int i10 = this.f22816k;
            if (this.f22814i - i10 < 4) {
                throw C2715v.m();
            }
            byte[] bArr = this.f22812g;
            this.f22816k = i10 + 4;
            return (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24);
        }

        public long K() throws C2715v {
            int i10 = this.f22816k;
            if (this.f22814i - i10 < 8) {
                throw C2715v.m();
            }
            byte[] bArr = this.f22812g;
            this.f22816k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f22816k;
            int i12 = this.f22814i;
            if (i12 != i11) {
                byte[] bArr = this.f22812g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f22816k = i13;
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
                    this.f22816k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f22816k;
            int i11 = this.f22814i;
            if (i11 != i10) {
                byte[] bArr = this.f22812g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f22816k = i12;
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
                    this.f22816k = i13;
                    return j10;
                }
            }
            return N();
        }

        public long N() throws C2715v {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw C2715v.f();
        }

        public final void O() {
            int i10 = this.f22814i + this.f22815j;
            this.f22814i = i10;
            int i11 = i10 - this.f22817l;
            int i12 = this.f22820o;
            if (i11 <= i12) {
                this.f22815j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f22815j = i13;
            this.f22814i = i10 - i13;
        }

        public void P(int i10) throws C2715v {
            if (i10 >= 0) {
                int i11 = this.f22814i;
                int i12 = this.f22816k;
                if (i10 <= i11 - i12) {
                    this.f22816k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C2715v.m();
            }
            throw C2715v.g();
        }

        public final void Q() throws C2715v {
            if (this.f22814i - this.f22816k >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() throws C2715v {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f22812g;
                int i11 = this.f22816k;
                this.f22816k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2715v.f();
        }

        public final void S() throws C2715v {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw C2715v.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public void a(int i10) throws C2715v {
            if (this.f22818m != i10) {
                throw C2715v.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int e() {
            return this.f22816k - this.f22817l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public boolean f() {
            return this.f22816k == this.f22814i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public void l(int i10) {
            this.f22820o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int m(int i10) throws C2715v {
            if (i10 < 0) {
                throw C2715v.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw C2715v.h();
            }
            int i11 = this.f22820o;
            if (iE > i11) {
                throw C2715v.m();
            }
            this.f22820o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public AbstractC2700f o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f22814i;
                int i11 = this.f22816k;
                if (iL <= i10 - i11) {
                    AbstractC2700f abstractC2700fE = (this.f22813h && this.f22819n) ? AbstractC2700f.E(this.f22812g, i11, iL) : AbstractC2700f.k(this.f22812g, i11, iL);
                    this.f22816k += iL;
                    return abstractC2700fE;
                }
            }
            return iL == 0 ? AbstractC2700f.f22793b : AbstractC2700f.B(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int y() {
            return AbstractC2701g.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long z() {
            return AbstractC2701g.d(M());
        }

        public b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f22820o = Integer.MAX_VALUE;
            this.f22812g = bArr;
            this.f22814i = i11 + i10;
            this.f22816k = i10;
            this.f22817l = i10;
            this.f22813h = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC2701g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InputStream f22821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final byte[] f22822h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22823i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22824j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22825k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f22826l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22827m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22828n;

        public static int H(InputStream inputStream) throws C2715v {
            try {
                return inputStream.available();
            } catch (C2715v e10) {
                e10.j();
                throw e10;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws C2715v {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C2715v e10) {
                e10.j();
                throw e10;
            }
        }

        private void T() {
            int i10 = this.f22823i + this.f22824j;
            this.f22823i = i10;
            int i11 = this.f22827m + i10;
            int i12 = this.f22828n;
            if (i11 <= i12) {
                this.f22824j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f22824j = i13;
            this.f22823i = i10 - i13;
        }

        public static long V(InputStream inputStream, long j10) throws C2715v {
            try {
                return inputStream.skip(j10);
            } catch (C2715v e10) {
                e10.j();
                throw e10;
            }
        }

        private void Y() throws C2715v {
            if (this.f22823i - this.f22825k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws C2715v {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f22822h;
                int i11 = this.f22825k;
                this.f22825k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2715v.f();
        }

        private void a0() throws C2715v {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw C2715v.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public String A() throws C2715v {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f22823i;
                int i11 = this.f22825k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f22822h, i11, iQ, AbstractC2714u.f22907b);
                    this.f22825k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw C2715v.g();
            }
            if (iQ > this.f22823i) {
                return new String(L(iQ, false), AbstractC2714u.f22907b);
            }
            U(iQ);
            String str2 = new String(this.f22822h, this.f22825k, iQ, AbstractC2714u.f22907b);
            this.f22825k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f22825k;
            int i11 = this.f22823i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f22822h;
                this.f22825k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw C2715v.g();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f22822h;
                    this.f22825k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return k0.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int C() throws C2715v {
            if (f()) {
                this.f22826l = 0;
                return 0;
            }
            int iQ = Q();
            this.f22826l = iQ;
            if (l0.a(iQ) != 0) {
                return this.f22826l;
            }
            throw C2715v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public boolean F(int i10) throws C2715v {
            int iB = l0.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(l0.c(l0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C2715v.e();
            }
            W(4);
            return true;
        }

        public final AbstractC2700f J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return AbstractC2700f.h(bArrM);
            }
            int i11 = this.f22825k;
            int i12 = this.f22823i;
            int length = i12 - i11;
            this.f22827m += i12;
            this.f22825k = 0;
            this.f22823i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f22822h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC2700f.B(bArr);
        }

        public byte K() throws C2715v {
            if (this.f22825k == this.f22823i) {
                U(1);
            }
            byte[] bArr = this.f22822h;
            int i10 = this.f22825k;
            this.f22825k = i10 + 1;
            return bArr[i10];
        }

        public final byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f22825k;
            int i12 = this.f22823i;
            int length = i12 - i11;
            this.f22827m += i12;
            this.f22825k = 0;
            this.f22823i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f22822h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i10) throws C2715v {
            if (i10 == 0) {
                return AbstractC2714u.f22909d;
            }
            if (i10 < 0) {
                throw C2715v.g();
            }
            int i11 = this.f22827m;
            int i12 = this.f22825k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f22809c > 0) {
                throw C2715v.l();
            }
            int i14 = this.f22828n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C2715v.m();
            }
            int i15 = this.f22823i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f22821g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f22822h, this.f22825k, bArr, 0, i15);
            this.f22827m += this.f22823i;
            this.f22825k = 0;
            this.f22823i = 0;
            while (i15 < i10) {
                int I10 = I(this.f22821g, bArr, i15, i10 - i15);
                if (I10 == -1) {
                    throw C2715v.m();
                }
                this.f22827m += I10;
                i15 += I10;
            }
            return bArr;
        }

        public final List N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, RecognitionOptions.AZTEC);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f22821g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw C2715v.m();
                    }
                    this.f22827m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() throws C2715v {
            int i10 = this.f22825k;
            if (this.f22823i - i10 < 4) {
                U(4);
                i10 = this.f22825k;
            }
            byte[] bArr = this.f22822h;
            this.f22825k = i10 + 4;
            return (bArr[i10] & ForkServer.ERROR) | ((bArr[i10 + 1] & ForkServer.ERROR) << 8) | ((bArr[i10 + 2] & ForkServer.ERROR) << 16) | ((bArr[i10 + 3] & ForkServer.ERROR) << 24);
        }

        public long P() throws C2715v {
            int i10 = this.f22825k;
            if (this.f22823i - i10 < 8) {
                U(8);
                i10 = this.f22825k;
            }
            byte[] bArr = this.f22822h;
            this.f22825k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f22825k;
            int i12 = this.f22823i;
            if (i12 != i11) {
                byte[] bArr = this.f22822h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f22825k = i13;
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
                    this.f22825k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f22825k;
            int i11 = this.f22823i;
            if (i11 != i10) {
                byte[] bArr = this.f22822h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f22825k = i12;
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
                    this.f22825k = i13;
                    return j10;
                }
            }
            return S();
        }

        public long S() throws C2715v {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw C2715v.f();
        }

        public final void U(int i10) throws C2715v {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f22809c - this.f22827m) - this.f22825k) {
                throw C2715v.m();
            }
            throw C2715v.l();
        }

        public void W(int i10) throws C2715v {
            int i11 = this.f22823i;
            int i12 = this.f22825k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f22825k = i12 + i10;
            }
        }

        public final void X(int i10) throws C2715v {
            if (i10 < 0) {
                throw C2715v.g();
            }
            int i11 = this.f22827m;
            int i12 = this.f22825k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f22828n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C2715v.m();
            }
            this.f22827m = i11 + i12;
            int i15 = this.f22823i - i12;
            this.f22823i = 0;
            this.f22825k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f22821g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f22821g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } finally {
                    this.f22827m += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f22823i;
            int i17 = i16 - this.f22825k;
            this.f22825k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f22823i;
                if (i18 <= i19) {
                    this.f22825k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f22825k = i19;
                    U(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public void a(int i10) throws C2715v {
            if (this.f22826l != i10) {
                throw C2715v.b();
            }
        }

        public final boolean b0(int i10) throws C2715v {
            int i11 = this.f22825k;
            int i12 = i11 + i10;
            int i13 = this.f22823i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f22809c;
            int i15 = this.f22827m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f22828n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f22822h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f22827m += i11;
                this.f22823i -= i11;
                this.f22825k = 0;
            }
            InputStream inputStream = this.f22821g;
            byte[] bArr2 = this.f22822h;
            int i16 = this.f22823i;
            int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f22809c - this.f22827m) - i16));
            if (I10 == 0 || I10 < -1 || I10 > this.f22822h.length) {
                throw new IllegalStateException(this.f22821g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
            }
            if (I10 <= 0) {
                return false;
            }
            this.f22823i += I10;
            T();
            if (this.f22823i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int e() {
            return this.f22827m + this.f22825k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public boolean f() {
            return this.f22825k == this.f22823i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public void l(int i10) {
            this.f22828n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int m(int i10) throws C2715v {
            if (i10 < 0) {
                throw C2715v.g();
            }
            int i11 = i10 + this.f22827m + this.f22825k;
            if (i11 < 0) {
                throw C2715v.h();
            }
            int i12 = this.f22828n;
            if (i11 > i12) {
                throw C2715v.m();
            }
            this.f22828n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public AbstractC2700f o() throws C2715v {
            int iQ = Q();
            int i10 = this.f22823i;
            int i11 = this.f22825k;
            if (iQ <= i10 - i11 && iQ > 0) {
                AbstractC2700f abstractC2700fK = AbstractC2700f.k(this.f22822h, i11, iQ);
                this.f22825k += iQ;
                return abstractC2700fK;
            }
            if (iQ == 0) {
                return AbstractC2700f.f22793b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw C2715v.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public int y() {
            return AbstractC2701g.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2701g
        public long z() {
            return AbstractC2701g.d(R());
        }

        public c(InputStream inputStream, int i10) {
            super();
            this.f22828n = Integer.MAX_VALUE;
            AbstractC2714u.b(inputStream, "input");
            this.f22821g = inputStream;
            this.f22822h = new byte[i10];
            this.f22823i = 0;
            this.f22825k = 0;
            this.f22827m = 0;
        }
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2701g g(InputStream inputStream) {
        return h(inputStream, RecognitionOptions.AZTEC);
    }

    public static AbstractC2701g h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(AbstractC2714u.f22909d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC2701g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC2701g j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    public static AbstractC2701g k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (C2715v e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws C2715v {
        int iC;
        do {
            iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f22807a++;
            this.f22807a--;
        } while (F(iC));
    }

    public abstract void a(int i10);

    public void b() throws C2715v {
        if (this.f22807a >= this.f22808b) {
            throw C2715v.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract AbstractC2700f o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public AbstractC2701g() {
        this.f22808b = f22806f;
        this.f22809c = Integer.MAX_VALUE;
        this.f22811e = false;
    }
}
