package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2703i extends AbstractC2699e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f22841c = Logger.getLogger(AbstractC2703i.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f22842d = j0.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2704j f22843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22844b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b extends AbstractC2703i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f22845e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f22846f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22847g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22848h;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f22845e = bArr;
            this.f22846f = bArr.length;
        }

        public final void X0(byte b10) {
            byte[] bArr = this.f22845e;
            int i10 = this.f22847g;
            this.f22847g = i10 + 1;
            bArr[i10] = b10;
            this.f22848h++;
        }

        public final void Y0(int i10) {
            byte[] bArr = this.f22845e;
            int i11 = this.f22847g;
            int i12 = i11 + 1;
            this.f22847g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f22847g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f22847g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f22847g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f22848h += 4;
        }

        public final void Z0(long j10) {
            byte[] bArr = this.f22845e;
            int i10 = this.f22847g;
            int i11 = i10 + 1;
            this.f22847g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f22847g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f22847g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f22847g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f22847g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f22847g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f22847g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f22847g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f22848h += 8;
        }

        public final void a1(int i10) {
            if (i10 >= 0) {
                c1(i10);
            } else {
                d1(i10);
            }
        }

        public final void b1(int i10, int i11) {
            c1(l0.c(i10, i11));
        }

        public final void c1(int i10) {
            if (!AbstractC2703i.f22842d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f22845e;
                    int i11 = this.f22847g;
                    this.f22847g = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    this.f22848h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f22845e;
                int i12 = this.f22847g;
                this.f22847g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f22848h++;
                return;
            }
            long j10 = this.f22847g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f22845e;
                int i13 = this.f22847g;
                this.f22847g = i13 + 1;
                j0.H(bArr3, i13, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f22845e;
            int i14 = this.f22847g;
            this.f22847g = i14 + 1;
            j0.H(bArr4, i14, (byte) i10);
            this.f22848h += (int) (((long) this.f22847g) - j10);
        }

        public final void d1(long j10) {
            if (!AbstractC2703i.f22842d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f22845e;
                    int i10 = this.f22847g;
                    this.f22847g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    this.f22848h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f22845e;
                int i11 = this.f22847g;
                this.f22847g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f22848h++;
                return;
            }
            long j11 = this.f22847g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f22845e;
                int i12 = this.f22847g;
                this.f22847g = i12 + 1;
                j0.H(bArr3, i12, (byte) ((((int) j10) | 128) & 255));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f22845e;
            int i13 = this.f22847g;
            this.f22847g = i13 + 1;
            j0.H(bArr4, i13, (byte) j10);
            this.f22848h += (int) (((long) this.f22847g) - j11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final int e0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends IOException {
        public d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final OutputStream f22853i;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f22853i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void A0(int i10, int i11) throws IOException {
            f1(20);
            b1(i10, 0);
            a1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void B0(int i10) throws IOException {
            if (i10 >= 0) {
                U0(i10);
            } else {
                W0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void E0(int i10, K k10, Z z10) throws IOException {
            S0(i10, 2);
            i1(k10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void F0(K k10) throws IOException {
            U0(k10.getSerializedSize());
            k10.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void G0(int i10, K k10) throws IOException {
            S0(1, 3);
            T0(2, i10);
            h1(3, k10);
            S0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void H0(int i10, AbstractC2700f abstractC2700f) throws IOException {
            S0(1, 3);
            T0(2, i10);
            k0(3, abstractC2700f);
            S0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void Q0(int i10, String str) throws IOException {
            S0(i10, 2);
            R0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void R0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iT = AbstractC2703i.T(length);
                int i10 = iT + length;
                int i11 = this.f22846f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iB = k0.b(str, bArr, 0, length);
                    U0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i10 > i11 - this.f22847g) {
                    e1();
                }
                int iT2 = AbstractC2703i.T(str.length());
                int i12 = this.f22847g;
                try {
                    if (iT2 == iT) {
                        int i13 = i12 + iT2;
                        this.f22847g = i13;
                        int iB2 = k0.b(str, this.f22845e, i13, this.f22846f - i13);
                        this.f22847g = i12;
                        iC = (iB2 - i12) - iT2;
                        c1(iC);
                        this.f22847g = iB2;
                    } else {
                        iC = k0.c(str);
                        c1(iC);
                        this.f22847g = k0.b(str, this.f22845e, this.f22847g, iC);
                    }
                    this.f22848h += iC;
                } catch (k0.d e10) {
                    this.f22848h -= this.f22847g - i12;
                    this.f22847g = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (k0.d e12) {
                Z(str, e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void S0(int i10, int i11) throws IOException {
            U0(l0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void T0(int i10, int i11) throws IOException {
            f1(20);
            b1(i10, 0);
            c1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void U0(int i10) throws IOException {
            f1(5);
            c1(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void V0(int i10, long j10) throws IOException {
            f1(20);
            b1(i10, 0);
            d1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void W0(long j10) throws IOException {
            f1(10);
            d1(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void Y() throws IOException {
            if (this.f22847g > 0) {
                e1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i, androidx.datastore.preferences.protobuf.AbstractC2699e
        public void a(byte[] bArr, int i10, int i11) throws IOException {
            g1(bArr, i10, i11);
        }

        public final void e1() throws IOException {
            this.f22853i.write(this.f22845e, 0, this.f22847g);
            this.f22847g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void f0(byte b10) throws IOException {
            if (this.f22847g == this.f22846f) {
                e1();
            }
            X0(b10);
        }

        public final void f1(int i10) throws IOException {
            if (this.f22846f - this.f22847g < i10) {
                e1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void g0(int i10, boolean z10) throws IOException {
            f1(11);
            b1(i10, 0);
            X0(z10 ? (byte) 1 : (byte) 0);
        }

        public void g1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f22846f;
            int i13 = this.f22847g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f22845e, i13, i11);
                this.f22847g += i11;
                this.f22848h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f22845e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f22847g = this.f22846f;
            this.f22848h += i14;
            e1();
            if (i16 <= this.f22846f) {
                System.arraycopy(bArr, i15, this.f22845e, 0, i16);
                this.f22847g = i16;
            } else {
                this.f22853i.write(bArr, i15, i16);
            }
            this.f22848h += i16;
        }

        public void h1(int i10, K k10) throws IOException {
            S0(i10, 2);
            F0(k10);
        }

        public void i1(K k10, Z z10) throws IOException {
            U0(((AbstractC2695a) k10).d(z10));
            z10.h(k10, this.f22843a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void j0(byte[] bArr, int i10, int i11) throws IOException {
            U0(i11);
            g1(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void k0(int i10, AbstractC2700f abstractC2700f) throws IOException {
            S0(i10, 2);
            l0(abstractC2700f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void l0(AbstractC2700f abstractC2700f) throws IOException {
            U0(abstractC2700f.size());
            abstractC2700f.I(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void q0(int i10, int i11) throws IOException {
            f1(14);
            b1(i10, 5);
            Y0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void r0(int i10) throws IOException {
            f1(4);
            Y0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void s0(int i10, long j10) throws IOException {
            f1(18);
            b1(i10, 1);
            Z0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void t0(long j10) throws IOException {
            f1(8);
            Z0(j10);
        }
    }

    public static int A(C2718y c2718y) {
        return B(c2718y.b());
    }

    public static int B(int i10) {
        return T(i10) + i10;
    }

    public static int C(int i10, K k10, Z z10) {
        return R(i10) + E(k10, z10);
    }

    public static int D(K k10) {
        return B(k10.getSerializedSize());
    }

    public static int E(K k10, Z z10) {
        return B(((AbstractC2695a) k10).d(z10));
    }

    public static int F(int i10) {
        return i10 > 4096 ? RecognitionOptions.AZTEC : i10;
    }

    public static int G(int i10, AbstractC2700f abstractC2700f) {
        return (R(1) * 2) + S(2, i10) + g(3, abstractC2700f);
    }

    public static int H(int i10, int i11) {
        return R(i10) + I(i11);
    }

    public static int I(int i10) {
        return 4;
    }

    public static int J(int i10, long j10) {
        return R(i10) + K(j10);
    }

    public static int K(long j10) {
        return 8;
    }

    public static int L(int i10, int i11) {
        return R(i10) + M(i11);
    }

    public static int M(int i10) {
        return T(W(i10));
    }

    public static int N(int i10, long j10) {
        return R(i10) + O(j10);
    }

    public static int O(long j10) {
        return V(X(j10));
    }

    public static int P(int i10, String str) {
        return R(i10) + Q(str);
    }

    public static int Q(String str) {
        int length;
        try {
            length = k0.c(str);
        } catch (k0.d unused) {
            length = str.getBytes(AbstractC2714u.f22907b).length;
        }
        return B(length);
    }

    public static int R(int i10) {
        return T(l0.c(i10, 0));
    }

    public static int S(int i10, int i11) {
        return R(i10) + T(i11);
    }

    public static int T(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int U(int i10, long j10) {
        return R(i10) + V(j10);
    }

    public static int V(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int W(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long X(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static AbstractC2703i b0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static AbstractC2703i c0(byte[] bArr) {
        return d0(bArr, 0, bArr.length);
    }

    public static int d(int i10, boolean z10) {
        return R(i10) + e(z10);
    }

    public static AbstractC2703i d0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return B(bArr.length);
    }

    public static int g(int i10, AbstractC2700f abstractC2700f) {
        return R(i10) + h(abstractC2700f);
    }

    public static int h(AbstractC2700f abstractC2700f) {
        return B(abstractC2700f.size());
    }

    public static int i(int i10, double d10) {
        return R(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return R(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return R(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return R(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return R(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    public static int s(int i10, K k10, Z z10) {
        return (R(i10) * 2) + u(k10, z10);
    }

    public static int t(K k10) {
        return k10.getSerializedSize();
    }

    public static int u(K k10, Z z10) {
        return ((AbstractC2695a) k10).d(z10);
    }

    public static int v(int i10, int i11) {
        return R(i10) + w(i11);
    }

    public static int w(int i10) {
        return V(i10);
    }

    public static int x(int i10, long j10) {
        return R(i10) + y(j10);
    }

    public static int y(long j10) {
        return V(j10);
    }

    public static int z(int i10, C2718y c2718y) {
        return R(i10) + A(c2718y);
    }

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10);

    public final void C0(int i10, long j10) {
        V0(i10, j10);
    }

    public final void D0(long j10) {
        W0(j10);
    }

    public abstract void E0(int i10, K k10, Z z10);

    public abstract void F0(K k10);

    public abstract void G0(int i10, K k10);

    public abstract void H0(int i10, AbstractC2700f abstractC2700f);

    public final void I0(int i10, int i11) {
        q0(i10, i11);
    }

    public final void J0(int i10) {
        r0(i10);
    }

    public final void K0(int i10, long j10) {
        s0(i10, j10);
    }

    public final void L0(long j10) {
        t0(j10);
    }

    public final void M0(int i10, int i11) {
        T0(i10, W(i11));
    }

    public final void N0(int i10) {
        U0(W(i10));
    }

    public final void O0(int i10, long j10) {
        V0(i10, X(j10));
    }

    public final void P0(long j10) {
        W0(X(j10));
    }

    public abstract void Q0(int i10, String str);

    public abstract void R0(String str);

    public abstract void S0(int i10, int i11);

    public abstract void T0(int i10, int i11);

    public abstract void U0(int i10);

    public abstract void V0(int i10, long j10);

    public abstract void W0(long j10);

    public abstract void Y();

    public final void Z(String str, k0.d dVar) throws d {
        f22841c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC2714u.f22907b);
        try {
            U0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2699e
    public abstract void a(byte[] bArr, int i10, int i11);

    public boolean a0() {
        return this.f22844b;
    }

    public final void c() {
        if (e0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int e0();

    public abstract void f0(byte b10);

    public abstract void g0(int i10, boolean z10);

    public final void h0(boolean z10) {
        f0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void i0(byte[] bArr) {
        j0(bArr, 0, bArr.length);
    }

    public abstract void j0(byte[] bArr, int i10, int i11);

    public abstract void k0(int i10, AbstractC2700f abstractC2700f);

    public abstract void l0(AbstractC2700f abstractC2700f);

    public final void m0(int i10, double d10) {
        s0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void n0(double d10) {
        t0(Double.doubleToRawLongBits(d10));
    }

    public final void o0(int i10, int i11) {
        A0(i10, i11);
    }

    public final void p0(int i10) {
        B0(i10);
    }

    public abstract void q0(int i10, int i11);

    public abstract void r0(int i10);

    public abstract void s0(int i10, long j10);

    public abstract void t0(long j10);

    public final void u0(int i10, float f10) {
        q0(i10, Float.floatToRawIntBits(f10));
    }

    public final void v0(float f10) {
        r0(Float.floatToRawIntBits(f10));
    }

    public final void w0(int i10, K k10) {
        S0(i10, 3);
        y0(k10);
        S0(i10, 4);
    }

    public final void x0(int i10, K k10, Z z10) {
        S0(i10, 3);
        z0(k10, z10);
        S0(i10, 4);
    }

    public final void y0(K k10) {
        k10.a(this);
    }

    public final void z0(K k10, Z z10) {
        z10.h(k10, this.f22843a);
    }

    public AbstractC2703i() {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends AbstractC2703i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f22849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f22850f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f22851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22852h;

        public c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f22849e = bArr;
            this.f22850f = i10;
            this.f22852h = i10;
            this.f22851g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void A0(int i10, int i11) throws d {
            S0(i10, 0);
            B0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void B0(int i10) throws d {
            if (i10 >= 0) {
                U0(i10);
            } else {
                W0(i10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void E0(int i10, K k10, Z z10) throws d {
            S0(i10, 2);
            U0(((AbstractC2695a) k10).d(z10));
            z10.h(k10, this.f22843a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void F0(K k10) throws d {
            U0(k10.getSerializedSize());
            k10.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void G0(int i10, K k10) throws d {
            S0(1, 3);
            T0(2, i10);
            Y0(3, k10);
            S0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void H0(int i10, AbstractC2700f abstractC2700f) throws d {
            S0(1, 3);
            T0(2, i10);
            k0(3, abstractC2700f);
            S0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void Q0(int i10, String str) throws d {
            S0(i10, 2);
            R0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void R0(String str) throws d {
            int i10 = this.f22852h;
            try {
                int iT = AbstractC2703i.T(str.length() * 3);
                int iT2 = AbstractC2703i.T(str.length());
                if (iT2 != iT) {
                    U0(k0.c(str));
                    this.f22852h = k0.b(str, this.f22849e, this.f22852h, e0());
                    return;
                }
                int i11 = i10 + iT2;
                this.f22852h = i11;
                int iB = k0.b(str, this.f22849e, i11, e0());
                this.f22852h = i10;
                U0((iB - i10) - iT2);
                this.f22852h = iB;
            } catch (k0.d e10) {
                this.f22852h = i10;
                Z(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void S0(int i10, int i11) throws d {
            U0(l0.c(i10, i11));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void T0(int i10, int i11) throws d {
            S0(i10, 0);
            U0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void U0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f22849e;
                    int i11 = this.f22852h;
                    this.f22852h = i11 + 1;
                    bArr[i11] = (byte) ((i10 | 128) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22852h), Integer.valueOf(this.f22851g), 1), e10);
                }
            }
            byte[] bArr2 = this.f22849e;
            int i12 = this.f22852h;
            this.f22852h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void V0(int i10, long j10) throws d {
            S0(i10, 0);
            W0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void W0(long j10) throws d {
            if (AbstractC2703i.f22842d && e0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f22849e;
                    int i10 = this.f22852h;
                    this.f22852h = i10 + 1;
                    j0.H(bArr, i10, (byte) ((((int) j10) | 128) & 255));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f22849e;
                int i11 = this.f22852h;
                this.f22852h = i11 + 1;
                j0.H(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f22849e;
                    int i12 = this.f22852h;
                    this.f22852h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22852h), Integer.valueOf(this.f22851g), 1), e10);
                }
            }
            byte[] bArr4 = this.f22849e;
            int i13 = this.f22852h;
            this.f22852h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void X0(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f22849e, this.f22852h, i11);
                this.f22852h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22852h), Integer.valueOf(this.f22851g), Integer.valueOf(i11)), e10);
            }
        }

        public final void Y0(int i10, K k10) throws d {
            S0(i10, 2);
            F0(k10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i, androidx.datastore.preferences.protobuf.AbstractC2699e
        public final void a(byte[] bArr, int i10, int i11) throws d {
            X0(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final int e0() {
            return this.f22851g - this.f22852h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void f0(byte b10) throws d {
            try {
                byte[] bArr = this.f22849e;
                int i10 = this.f22852h;
                this.f22852h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22852h), Integer.valueOf(this.f22851g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void g0(int i10, boolean z10) throws d {
            S0(i10, 0);
            f0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void j0(byte[] bArr, int i10, int i11) throws d {
            U0(i11);
            X0(bArr, i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void k0(int i10, AbstractC2700f abstractC2700f) throws d {
            S0(i10, 2);
            l0(abstractC2700f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void l0(AbstractC2700f abstractC2700f) throws d {
            U0(abstractC2700f.size());
            abstractC2700f.I(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void q0(int i10, int i11) throws d {
            S0(i10, 5);
            r0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void r0(int i10) throws d {
            try {
                byte[] bArr = this.f22849e;
                int i11 = this.f22852h;
                int i12 = i11 + 1;
                this.f22852h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f22852h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f22852h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f22852h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22852h), Integer.valueOf(this.f22851g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void s0(int i10, long j10) throws d {
            S0(i10, 1);
            t0(j10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public final void t0(long j10) throws d {
            try {
                byte[] bArr = this.f22849e;
                int i10 = this.f22852h;
                int i11 = i10 + 1;
                this.f22852h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f22852h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f22852h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f22852h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f22852h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f22852h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f22852h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f22852h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22852h), Integer.valueOf(this.f22851g), 1), e10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2703i
        public void Y() {
        }
    }
}
