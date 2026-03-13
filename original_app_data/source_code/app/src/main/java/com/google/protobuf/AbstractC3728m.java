package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.O0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3728m extends AbstractC3720i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f32310c = Logger.getLogger(AbstractC3728m.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f32311d = N0.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3730n f32312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32313b;

    /* JADX INFO: renamed from: com.google.protobuf.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b extends AbstractC3728m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f32314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f32315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f32316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f32317h;

        public b(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.f32314e = bArr;
            this.f32315f = bArr.length;
        }

        public final void a1(byte b10) {
            byte[] bArr = this.f32314e;
            int i10 = this.f32316g;
            this.f32316g = i10 + 1;
            bArr[i10] = b10;
            this.f32317h++;
        }

        public final void b1(int i10) {
            byte[] bArr = this.f32314e;
            int i11 = this.f32316g;
            int i12 = i11 + 1;
            this.f32316g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f32316g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f32316g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f32316g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f32317h += 4;
        }

        public final void c1(long j10) {
            byte[] bArr = this.f32314e;
            int i10 = this.f32316g;
            int i11 = i10 + 1;
            this.f32316g = i11;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i10 + 2;
            this.f32316g = i12;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i10 + 3;
            this.f32316g = i13;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i10 + 4;
            this.f32316g = i14;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i10 + 5;
            this.f32316g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f32316g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f32316g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f32316g = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f32317h += 8;
        }

        public final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1(i10);
            }
        }

        public final void e1(int i10, int i11) {
            f1(Q0.c(i10, i11));
        }

        public final void f1(int i10) {
            if (!AbstractC3728m.f32311d) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f32314e;
                    int i11 = this.f32316g;
                    this.f32316g = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    this.f32317h++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f32314e;
                int i12 = this.f32316g;
                this.f32316g = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.f32317h++;
                return;
            }
            long j10 = this.f32316g;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f32314e;
                int i13 = this.f32316g;
                this.f32316g = i13 + 1;
                N0.O(bArr3, i13, (byte) ((i10 & 127) | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f32314e;
            int i14 = this.f32316g;
            this.f32316g = i14 + 1;
            N0.O(bArr4, i14, (byte) i10);
            this.f32317h += (int) (((long) this.f32316g) - j10);
        }

        public final void g1(long j10) {
            if (!AbstractC3728m.f32311d) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f32314e;
                    int i10 = this.f32316g;
                    this.f32316g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    this.f32317h++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f32314e;
                int i11 = this.f32316g;
                this.f32316g = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.f32317h++;
                return;
            }
            long j11 = this.f32316g;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f32314e;
                int i12 = this.f32316g;
                this.f32316g = i12 + 1;
                N0.O(bArr3, i12, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f32314e;
            int i13 = this.f32316g;
            this.f32316g = i13 + 1;
            N0.O(bArr4, i13, (byte) j10);
            this.f32317h += (int) (((long) this.f32316g) - j11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.m$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class d extends IOException {
        public d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.m$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final OutputStream f32322i;

        public e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f32322i = outputStream;
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void D0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void E0(int i10) throws IOException {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void H0(int i10, InterfaceC3717g0 interfaceC3717g0, A0 a02) throws IOException {
            V0(i10, 2);
            m1(interfaceC3717g0, a02);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void I0(InterfaceC3717g0 interfaceC3717g0) throws IOException {
            X0(interfaceC3717g0.getSerializedSize());
            interfaceC3717g0.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void J0(int i10, InterfaceC3717g0 interfaceC3717g0) throws IOException {
            V0(1, 3);
            W0(2, i10);
            l1(3, interfaceC3717g0);
            V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void K0(int i10, AbstractC3722j abstractC3722j) throws IOException {
            V0(1, 3);
            W0(2, i10);
            n0(3, abstractC3722j);
            V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void T0(int i10, String str) throws IOException {
            V0(i10, 2);
            U0(str);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void U0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iW = AbstractC3728m.W(length);
                int i10 = iW + length;
                int i11 = this.f32315f;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int i12 = O0.i(str, bArr, 0, length);
                    X0(i12);
                    b(bArr, 0, i12);
                    return;
                }
                if (i10 > i11 - this.f32316g) {
                    h1();
                }
                int iW2 = AbstractC3728m.W(str.length());
                int i13 = this.f32316g;
                try {
                    if (iW2 == iW) {
                        int i14 = i13 + iW2;
                        this.f32316g = i14;
                        int i15 = O0.i(str, this.f32314e, i14, this.f32315f - i14);
                        this.f32316g = i13;
                        iJ = (i15 - i13) - iW2;
                        f1(iJ);
                        this.f32316g = i15;
                    } else {
                        iJ = O0.j(str);
                        f1(iJ);
                        this.f32316g = O0.i(str, this.f32314e, this.f32316g, iJ);
                    }
                    this.f32317h += iJ;
                } catch (O0.d e10) {
                    this.f32317h -= this.f32316g - i13;
                    this.f32316g = i13;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new d(e11);
                }
            } catch (O0.d e12) {
                c0(str, e12);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void V0(int i10, int i11) throws IOException {
            X0(Q0.c(i10, i11));
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void W0(int i10, int i11) throws IOException {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void X0(int i10) throws IOException {
            i1(5);
            f1(i10);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void Y0(int i10, long j10) throws IOException {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void Z0(long j10) throws IOException {
            i1(10);
            g1(j10);
        }

        @Override // com.google.protobuf.AbstractC3720i
        public void a(ByteBuffer byteBuffer) throws IOException {
            j1(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC3728m, com.google.protobuf.AbstractC3720i
        public void b(byte[] bArr, int i10, int i11) throws IOException {
            k1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void b0() throws IOException {
            if (this.f32316g > 0) {
                h1();
            }
        }

        public final void h1() throws IOException {
            this.f32322i.write(this.f32314e, 0, this.f32316g);
            this.f32316g = 0;
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void i0(byte b10) throws IOException {
            if (this.f32316g == this.f32315f) {
                h1();
            }
            a1(b10);
        }

        public final void i1(int i10) throws IOException {
            if (this.f32315f - this.f32316g < i10) {
                h1();
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void j0(int i10, boolean z10) throws IOException {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : (byte) 0);
        }

        public void j1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i10 = this.f32315f;
            int i11 = this.f32316g;
            if (i10 - i11 >= iRemaining) {
                byteBuffer.get(this.f32314e, i11, iRemaining);
                this.f32316g += iRemaining;
                this.f32317h += iRemaining;
                return;
            }
            int i12 = i10 - i11;
            byteBuffer.get(this.f32314e, i11, i12);
            int i13 = iRemaining - i12;
            this.f32316g = this.f32315f;
            this.f32317h += i12;
            h1();
            while (true) {
                int i14 = this.f32315f;
                if (i13 <= i14) {
                    byteBuffer.get(this.f32314e, 0, i13);
                    this.f32316g = i13;
                    this.f32317h += i13;
                    return;
                } else {
                    byteBuffer.get(this.f32314e, 0, i14);
                    this.f32322i.write(this.f32314e, 0, this.f32315f);
                    int i15 = this.f32315f;
                    i13 -= i15;
                    this.f32317h += i15;
                }
            }
        }

        public void k1(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f32315f;
            int i13 = this.f32316g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f32314e, i13, i11);
                this.f32316g += i11;
                this.f32317h += i11;
                return;
            }
            int i14 = i12 - i13;
            System.arraycopy(bArr, i10, this.f32314e, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f32316g = this.f32315f;
            this.f32317h += i14;
            h1();
            if (i16 <= this.f32315f) {
                System.arraycopy(bArr, i15, this.f32314e, 0, i16);
                this.f32316g = i16;
            } else {
                this.f32322i.write(bArr, i15, i16);
            }
            this.f32317h += i16;
        }

        public void l1(int i10, InterfaceC3717g0 interfaceC3717g0) throws IOException {
            V0(i10, 2);
            I0(interfaceC3717g0);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void m0(byte[] bArr, int i10, int i11) throws IOException {
            X0(i11);
            k1(bArr, i10, i11);
        }

        public void m1(InterfaceC3717g0 interfaceC3717g0, A0 a02) throws IOException {
            X0(((AbstractC3704a) interfaceC3717g0).getSerializedSize(a02));
            a02.g(interfaceC3717g0, this.f32312a);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void n0(int i10, AbstractC3722j abstractC3722j) throws IOException {
            V0(i10, 2);
            o0(abstractC3722j);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void o0(AbstractC3722j abstractC3722j) throws IOException {
            X0(abstractC3722j.size());
            abstractC3722j.P(this);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void t0(int i10, int i11) throws IOException {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void u0(int i10) throws IOException {
            i1(4);
            b1(i10);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void v0(int i10, long j10) throws IOException {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void w0(long j10) throws IOException {
            i1(8);
            c1(j10);
        }
    }

    public static int A(int i10, T t10) {
        return U(i10) + B(t10);
    }

    public static int B(T t10) {
        return C(t10.b());
    }

    public static int C(int i10) {
        return W(i10) + i10;
    }

    public static int D(int i10, InterfaceC3717g0 interfaceC3717g0) {
        return (U(1) * 2) + V(2, i10) + E(3, interfaceC3717g0);
    }

    public static int E(int i10, InterfaceC3717g0 interfaceC3717g0) {
        return U(i10) + G(interfaceC3717g0);
    }

    public static int F(int i10, InterfaceC3717g0 interfaceC3717g0, A0 a02) {
        return U(i10) + H(interfaceC3717g0, a02);
    }

    public static int G(InterfaceC3717g0 interfaceC3717g0) {
        return C(interfaceC3717g0.getSerializedSize());
    }

    public static int H(InterfaceC3717g0 interfaceC3717g0, A0 a02) {
        return C(((AbstractC3704a) interfaceC3717g0).getSerializedSize(a02));
    }

    public static int I(int i10) {
        return i10 > 4096 ? RecognitionOptions.AZTEC : i10;
    }

    public static int J(int i10, AbstractC3722j abstractC3722j) {
        return (U(1) * 2) + V(2, i10) + h(3, abstractC3722j);
    }

    public static int K(int i10, int i11) {
        return U(i10) + L(i11);
    }

    public static int L(int i10) {
        return 4;
    }

    public static int M(int i10, long j10) {
        return U(i10) + N(j10);
    }

    public static int N(long j10) {
        return 8;
    }

    public static int O(int i10, int i11) {
        return U(i10) + P(i11);
    }

    public static int P(int i10) {
        return W(Z(i10));
    }

    public static int Q(int i10, long j10) {
        return U(i10) + R(j10);
    }

    public static int R(long j10) {
        return Y(a0(j10));
    }

    public static int S(int i10, String str) {
        return U(i10) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = O0.j(str);
        } catch (O0.d unused) {
            length = str.getBytes(N.f32140b).length;
        }
        return C(length);
    }

    public static int U(int i10) {
        return W(Q0.c(i10, 0));
    }

    public static int V(int i10, int i11) {
        return U(i10) + W(i11);
    }

    public static int W(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(int i10, long j10) {
        return U(i10) + Y(j10);
    }

    public static int Y(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static int Z(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long a0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int e(int i10, boolean z10) {
        return U(i10) + f(z10);
    }

    public static AbstractC3728m e0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int f(boolean z10) {
        return 1;
    }

    public static AbstractC3728m f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(byte[] bArr) {
        return C(bArr.length);
    }

    public static AbstractC3728m g0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int h(int i10, AbstractC3722j abstractC3722j) {
        return U(i10) + i(abstractC3722j);
    }

    public static int i(AbstractC3722j abstractC3722j) {
        return C(abstractC3722j.size());
    }

    public static int j(int i10, double d10) {
        return U(i10) + k(d10);
    }

    public static int k(double d10) {
        return 8;
    }

    public static int l(int i10, int i11) {
        return U(i10) + m(i11);
    }

    public static int m(int i10) {
        return x(i10);
    }

    public static int n(int i10, int i11) {
        return U(i10) + o(i11);
    }

    public static int o(int i10) {
        return 4;
    }

    public static int p(int i10, long j10) {
        return U(i10) + q(j10);
    }

    public static int q(long j10) {
        return 8;
    }

    public static int r(int i10, float f10) {
        return U(i10) + s(f10);
    }

    public static int s(float f10) {
        return 4;
    }

    public static int t(int i10, InterfaceC3717g0 interfaceC3717g0, A0 a02) {
        return (U(i10) * 2) + v(interfaceC3717g0, a02);
    }

    public static int u(InterfaceC3717g0 interfaceC3717g0) {
        return interfaceC3717g0.getSerializedSize();
    }

    public static int v(InterfaceC3717g0 interfaceC3717g0, A0 a02) {
        return ((AbstractC3704a) interfaceC3717g0).getSerializedSize(a02);
    }

    public static int w(int i10, int i11) {
        return U(i10) + x(i11);
    }

    public static int x(int i10) {
        if (i10 >= 0) {
            return W(i10);
        }
        return 10;
    }

    public static int y(int i10, long j10) {
        return U(i10) + z(j10);
    }

    public static int z(long j10) {
        return Y(j10);
    }

    public final void A0(int i10, InterfaceC3717g0 interfaceC3717g0, A0 a02) {
        V0(i10, 3);
        C0(interfaceC3717g0, a02);
        V0(i10, 4);
    }

    public final void B0(InterfaceC3717g0 interfaceC3717g0) {
        interfaceC3717g0.writeTo(this);
    }

    public final void C0(InterfaceC3717g0 interfaceC3717g0, A0 a02) {
        a02.g(interfaceC3717g0, this.f32312a);
    }

    public abstract void D0(int i10, int i11);

    public abstract void E0(int i10);

    public final void F0(int i10, long j10) {
        Y0(i10, j10);
    }

    public final void G0(long j10) {
        Z0(j10);
    }

    public abstract void H0(int i10, InterfaceC3717g0 interfaceC3717g0, A0 a02);

    public abstract void I0(InterfaceC3717g0 interfaceC3717g0);

    public abstract void J0(int i10, InterfaceC3717g0 interfaceC3717g0);

    public abstract void K0(int i10, AbstractC3722j abstractC3722j);

    public final void L0(int i10, int i11) {
        t0(i10, i11);
    }

    public final void M0(int i10) {
        u0(i10);
    }

    public final void N0(int i10, long j10) {
        v0(i10, j10);
    }

    public final void O0(long j10) {
        w0(j10);
    }

    public final void P0(int i10, int i11) {
        W0(i10, Z(i11));
    }

    public final void Q0(int i10) {
        X0(Z(i10));
    }

    public final void R0(int i10, long j10) {
        Y0(i10, a0(j10));
    }

    public final void S0(long j10) {
        Z0(a0(j10));
    }

    public abstract void T0(int i10, String str);

    public abstract void U0(String str);

    public abstract void V0(int i10, int i11);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10);

    public abstract void Y0(int i10, long j10);

    public abstract void Z0(long j10);

    @Override // com.google.protobuf.AbstractC3720i
    public abstract void b(byte[] bArr, int i10, int i11);

    public abstract void b0();

    public final void c0(String str, O0.d dVar) throws d {
        f32310c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(N.f32140b);
        try {
            X0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        }
    }

    public final void d() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public boolean d0() {
        return this.f32313b;
    }

    public abstract int h0();

    public abstract void i0(byte b10);

    public abstract void j0(int i10, boolean z10);

    public final void k0(boolean z10) {
        i0(z10 ? (byte) 1 : (byte) 0);
    }

    public final void l0(byte[] bArr) {
        m0(bArr, 0, bArr.length);
    }

    public abstract void m0(byte[] bArr, int i10, int i11);

    public abstract void n0(int i10, AbstractC3722j abstractC3722j);

    public abstract void o0(AbstractC3722j abstractC3722j);

    public final void p0(int i10, double d10) {
        v0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void q0(double d10) {
        w0(Double.doubleToRawLongBits(d10));
    }

    public final void r0(int i10, int i11) {
        D0(i10, i11);
    }

    public final void s0(int i10) {
        E0(i10);
    }

    public abstract void t0(int i10, int i11);

    public abstract void u0(int i10);

    public abstract void v0(int i10, long j10);

    public abstract void w0(long j10);

    public final void x0(int i10, float f10) {
        t0(i10, Float.floatToRawIntBits(f10));
    }

    public final void y0(float f10) {
        u0(Float.floatToRawIntBits(f10));
    }

    public final void z0(int i10, InterfaceC3717g0 interfaceC3717g0) {
        V0(i10, 3);
        B0(interfaceC3717g0);
        V0(i10, 4);
    }

    public AbstractC3728m() {
    }

    /* JADX INFO: renamed from: com.google.protobuf.m$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends AbstractC3728m {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f32318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f32319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f32320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f32321h;

        public c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f32318e = bArr;
            this.f32319f = i10;
            this.f32321h = i10;
            this.f32320g = i12;
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void D0(int i10, int i11) throws d {
            V0(i10, 0);
            E0(i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void E0(int i10) throws d {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0(i10);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void H0(int i10, InterfaceC3717g0 interfaceC3717g0, A0 a02) throws d {
            V0(i10, 2);
            X0(((AbstractC3704a) interfaceC3717g0).getSerializedSize(a02));
            a02.g(interfaceC3717g0, this.f32312a);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void I0(InterfaceC3717g0 interfaceC3717g0) throws d {
            X0(interfaceC3717g0.getSerializedSize());
            interfaceC3717g0.writeTo(this);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void J0(int i10, InterfaceC3717g0 interfaceC3717g0) throws d {
            V0(1, 3);
            W0(2, i10);
            c1(3, interfaceC3717g0);
            V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void K0(int i10, AbstractC3722j abstractC3722j) throws d {
            V0(1, 3);
            W0(2, i10);
            n0(3, abstractC3722j);
            V0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void T0(int i10, String str) throws d {
            V0(i10, 2);
            U0(str);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void U0(String str) throws d {
            int i10 = this.f32321h;
            try {
                int iW = AbstractC3728m.W(str.length() * 3);
                int iW2 = AbstractC3728m.W(str.length());
                if (iW2 != iW) {
                    X0(O0.j(str));
                    this.f32321h = O0.i(str, this.f32318e, this.f32321h, h0());
                    return;
                }
                int i11 = i10 + iW2;
                this.f32321h = i11;
                int i12 = O0.i(str, this.f32318e, i11, h0());
                this.f32321h = i10;
                X0((i12 - i10) - iW2);
                this.f32321h = i12;
            } catch (O0.d e10) {
                this.f32321h = i10;
                c0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void V0(int i10, int i11) throws d {
            X0(Q0.c(i10, i11));
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void W0(int i10, int i11) throws d {
            V0(i10, 0);
            X0(i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void X0(int i10) throws d {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f32318e;
                    int i11 = this.f32321h;
                    this.f32321h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32321h), Integer.valueOf(this.f32320g), 1), e10);
                }
            }
            byte[] bArr2 = this.f32318e;
            int i12 = this.f32321h;
            this.f32321h = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void Y0(int i10, long j10) throws d {
            V0(i10, 0);
            Z0(j10);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void Z0(long j10) throws d {
            if (AbstractC3728m.f32311d && h0() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f32318e;
                    int i10 = this.f32321h;
                    this.f32321h = i10 + 1;
                    N0.O(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f32318e;
                int i11 = this.f32321h;
                this.f32321h = i11 + 1;
                N0.O(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f32318e;
                    int i12 = this.f32321h;
                    this.f32321h = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32321h), Integer.valueOf(this.f32320g), 1), e10);
                }
            }
            byte[] bArr4 = this.f32318e;
            int i13 = this.f32321h;
            this.f32321h = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.protobuf.AbstractC3720i
        public final void a(ByteBuffer byteBuffer) throws d {
            a1(byteBuffer);
        }

        public final void a1(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f32318e, this.f32321h, iRemaining);
                this.f32321h += iRemaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32321h), Integer.valueOf(this.f32320g), Integer.valueOf(iRemaining)), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m, com.google.protobuf.AbstractC3720i
        public final void b(byte[] bArr, int i10, int i11) throws d {
            b1(bArr, i10, i11);
        }

        public final void b1(byte[] bArr, int i10, int i11) throws d {
            try {
                System.arraycopy(bArr, i10, this.f32318e, this.f32321h, i11);
                this.f32321h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32321h), Integer.valueOf(this.f32320g), Integer.valueOf(i11)), e10);
            }
        }

        public final void c1(int i10, InterfaceC3717g0 interfaceC3717g0) throws d {
            V0(i10, 2);
            I0(interfaceC3717g0);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final int h0() {
            return this.f32320g - this.f32321h;
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void i0(byte b10) throws d {
            try {
                byte[] bArr = this.f32318e;
                int i10 = this.f32321h;
                this.f32321h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32321h), Integer.valueOf(this.f32320g), 1), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void j0(int i10, boolean z10) throws d {
            V0(i10, 0);
            i0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void m0(byte[] bArr, int i10, int i11) throws d {
            X0(i11);
            b1(bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void n0(int i10, AbstractC3722j abstractC3722j) throws d {
            V0(i10, 2);
            o0(abstractC3722j);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void o0(AbstractC3722j abstractC3722j) throws d {
            X0(abstractC3722j.size());
            abstractC3722j.P(this);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void t0(int i10, int i11) throws d {
            V0(i10, 5);
            u0(i11);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void u0(int i10) throws d {
            try {
                byte[] bArr = this.f32318e;
                int i11 = this.f32321h;
                int i12 = i11 + 1;
                this.f32321h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i11 + 2;
                this.f32321h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i11 + 3;
                this.f32321h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f32321h = i11 + 4;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32321h), Integer.valueOf(this.f32320g), 1), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void v0(int i10, long j10) throws d {
            V0(i10, 1);
            w0(j10);
        }

        @Override // com.google.protobuf.AbstractC3728m
        public final void w0(long j10) throws d {
            try {
                byte[] bArr = this.f32318e;
                int i10 = this.f32321h;
                int i11 = i10 + 1;
                this.f32321h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i10 + 2;
                this.f32321h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i10 + 3;
                this.f32321h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i10 + 4;
                this.f32321h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i10 + 5;
                this.f32321h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i10 + 6;
                this.f32321h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i10 + 7;
                this.f32321h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f32321h = i10 + 8;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f32321h), Integer.valueOf(this.f32320g), 1), e10);
            }
        }

        @Override // com.google.protobuf.AbstractC3728m
        public void b0() {
        }
    }
}
