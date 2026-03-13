package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3664k extends AbstractC3660g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f31509c = Logger.getLogger(AbstractC3664k.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f31510d = p0.E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3665l f31511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31512b;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b extends AbstractC3664k {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f31513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f31514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f31515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f31516h;

        public b(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            this.f31513e = bArr;
            this.f31514f = i10;
            this.f31516h = i10;
            this.f31515g = i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void D0(int i10, String str) throws c {
            E0(i10, 2);
            N0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void E0(int i10, int i11) throws c {
            G0(r0.c(i10, i11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void F0(int i10, int i11) throws c {
            E0(i10, 0);
            G0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void G0(int i10) throws c {
            int i11;
            int i12 = this.f31516h;
            while ((i10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    throw new c(i12, this.f31515g, 1, (Throwable) e);
                }
                try {
                    this.f31513e[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    i12 = i11;
                    throw new c(i12, this.f31515g, 1, (Throwable) e);
                }
            }
            i11 = i12 + 1;
            this.f31513e[i12] = (byte) i10;
            this.f31516h = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void H0(int i10, long j10) throws c {
            E0(i10, 0);
            I0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void I0(long j10) throws c {
            int i10;
            int i11 = this.f31516h;
            if (!AbstractC3664k.f31510d || Y() < 10) {
                while ((j10 & (-128)) != 0) {
                    try {
                        int i12 = i11 + 1;
                        try {
                            this.f31513e[i11] = (byte) (((int) j10) | 128);
                            j10 >>>= 7;
                            i11 = i12;
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                            i11 = i12;
                            throw new c(i11, this.f31515g, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                    }
                }
                i10 = i11 + 1;
                try {
                    this.f31513e[i11] = (byte) j10;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i11 = i10;
                    throw new c(i11, this.f31515g, 1, (Throwable) e);
                }
            } else {
                while ((j10 & (-128)) != 0) {
                    p0.K(this.f31513e, i11, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                    i11++;
                }
                i10 = i11 + 1;
                p0.K(this.f31513e, i11, (byte) j10);
            }
            this.f31516h = i10;
        }

        public final void J0(byte[] bArr, int i10, int i11) throws c {
            try {
                System.arraycopy(bArr, i10, this.f31513e, this.f31516h, i11);
                this.f31516h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(this.f31516h, this.f31515g, i11, (Throwable) e10);
            }
        }

        public final void K0(AbstractC3661h abstractC3661h) throws c {
            G0(abstractC3661h.size());
            abstractC3661h.I(this);
        }

        public final void L0(int i10, Q q10) throws c {
            E0(i10, 2);
            M0(q10);
        }

        public final void M0(Q q10) throws c {
            G0(q10.getSerializedSize());
            q10.a(this);
        }

        public final void N0(String str) throws c {
            int i10 = this.f31516h;
            try {
                int iP = AbstractC3664k.P(str.length() * 3);
                int iP2 = AbstractC3664k.P(str.length());
                if (iP2 != iP) {
                    G0(q0.g(str));
                    this.f31516h = q0.f(str, this.f31513e, this.f31516h, Y());
                    return;
                }
                int i11 = i10 + iP2;
                this.f31516h = i11;
                int iF = q0.f(str, this.f31513e, i11, Y());
                this.f31516h = i10;
                G0((iF - i10) - iP2);
                this.f31516h = iF;
            } catch (q0.d e10) {
                this.f31516h = i10;
                U(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new c(e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final int Y() {
            return this.f31515g - this.f31516h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void Z(byte b10) throws c {
            int i10;
            int i11 = this.f31516h;
            try {
                i10 = i11 + 1;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
            try {
                this.f31513e[i11] = b10;
                this.f31516h = i10;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                i11 = i10;
                throw new c(i11, this.f31515g, 1, (Throwable) e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k, com.google.crypto.tink.shaded.protobuf.AbstractC3660g
        public final void a(byte[] bArr, int i10, int i11) throws c {
            J0(bArr, i10, i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void a0(int i10, boolean z10) throws c {
            E0(i10, 0);
            Z(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void c0(int i10, AbstractC3661h abstractC3661h) throws c {
            E0(i10, 2);
            K0(abstractC3661h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void h0(int i10, int i11) throws c {
            E0(i10, 5);
            i0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void i0(int i10) throws c {
            int i11 = this.f31516h;
            try {
                byte[] bArr = this.f31513e;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = (byte) (i10 >> 24);
                this.f31516h = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(i11, this.f31515g, 4, (Throwable) e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void j0(int i10, long j10) throws c {
            E0(i10, 1);
            k0(j10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void k0(long j10) throws c {
            int i10 = this.f31516h;
            try {
                byte[] bArr = this.f31513e;
                bArr[i10] = (byte) j10;
                bArr[i10 + 1] = (byte) (j10 >> 8);
                bArr[i10 + 2] = (byte) (j10 >> 16);
                bArr[i10 + 3] = (byte) (j10 >> 24);
                bArr[i10 + 4] = (byte) (j10 >> 32);
                bArr[i10 + 5] = (byte) (j10 >> 40);
                bArr[i10 + 6] = (byte) (j10 >> 48);
                bArr[i10 + 7] = (byte) (j10 >> 56);
                this.f31516h = i10 + 8;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(i10, this.f31515g, 8, (Throwable) e10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void p0(int i10, int i11) throws c {
            E0(i10, 0);
            q0(i11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void q0(int i10) throws c {
            if (i10 >= 0) {
                G0(i10);
            } else {
                I0(i10);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void t0(int i10, Q q10) throws c {
            E0(1, 3);
            F0(2, i10);
            L0(3, q10);
            E0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3664k
        public final void u0(int i10, AbstractC3661h abstractC3661h) throws c {
            E0(1, 3);
            F0(2, i10);
            c0(3, abstractC3661h);
            E0(1, 4);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public c(int i10, int i11, int i12, Throwable th) {
            this(i10, i11, i12, th);
        }

        public c(long j10, long j11, int i10, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)), th);
        }
    }

    public static int A(int i10) {
        return P(i10) + i10;
    }

    public static int B(Q q10) {
        return A(q10.getSerializedSize());
    }

    public static int C(int i10, AbstractC3661h abstractC3661h) {
        return (N(1) * 2) + O(2, i10) + g(3, abstractC3661h);
    }

    public static int D(int i10, int i11) {
        return N(i10) + E(i11);
    }

    public static int E(int i10) {
        return 4;
    }

    public static int F(int i10, long j10) {
        return N(i10) + G(j10);
    }

    public static int G(long j10) {
        return 8;
    }

    public static int H(int i10, int i11) {
        return N(i10) + I(i11);
    }

    public static int I(int i10) {
        return P(S(i10));
    }

    public static int J(int i10, long j10) {
        return N(i10) + K(j10);
    }

    public static int K(long j10) {
        return R(T(j10));
    }

    public static int L(int i10, String str) {
        return N(i10) + M(str);
    }

    public static int M(String str) {
        int length;
        try {
            length = q0.g(str);
        } catch (q0.d unused) {
            length = str.getBytes(AbstractC3678z.f31578b).length;
        }
        return A(length);
    }

    public static int N(int i10) {
        return P(r0.c(i10, 0));
    }

    public static int O(int i10, int i11) {
        return N(i10) + P(i11);
    }

    public static int P(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int Q(int i10, long j10) {
        return N(i10) + R(j10);
    }

    public static int R(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int S(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long T(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static AbstractC3664k W(byte[] bArr) {
        return X(bArr, 0, bArr.length);
    }

    public static AbstractC3664k X(byte[] bArr, int i10, int i11) {
        return new b(bArr, i10, i11);
    }

    public static int d(int i10, boolean z10) {
        return N(i10) + e(z10);
    }

    public static int e(boolean z10) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return A(bArr.length);
    }

    public static int g(int i10, AbstractC3661h abstractC3661h) {
        return N(i10) + h(abstractC3661h);
    }

    public static int h(AbstractC3661h abstractC3661h) {
        return A(abstractC3661h.size());
    }

    public static int i(int i10, double d10) {
        return N(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return N(i10) + l(i11);
    }

    public static int l(int i10) {
        return v(i10);
    }

    public static int m(int i10, int i11) {
        return N(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return N(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return N(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    public static int s(int i10, Q q10, f0 f0Var) {
        return (N(i10) * 2) + t(q10, f0Var);
    }

    public static int t(Q q10, f0 f0Var) {
        return ((AbstractC3654a) q10).c(f0Var);
    }

    public static int u(int i10, int i11) {
        return N(i10) + v(i11);
    }

    public static int v(int i10) {
        return R(i10);
    }

    public static int w(int i10, long j10) {
        return N(i10) + x(j10);
    }

    public static int x(long j10) {
        return R(j10);
    }

    public static int y(int i10, D d10) {
        return N(i10) + z(d10);
    }

    public static int z(D d10) {
        return A(d10.b());
    }

    public final void A0(int i10) {
        G0(S(i10));
    }

    public final void B0(int i10, long j10) {
        H0(i10, T(j10));
    }

    public final void C0(long j10) {
        I0(T(j10));
    }

    public abstract void D0(int i10, String str);

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10, int i11);

    public abstract void G0(int i10);

    public abstract void H0(int i10, long j10);

    public abstract void I0(long j10);

    public final void U(String str, q0.d dVar) throws c {
        f31509c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC3678z.f31578b);
        try {
            G0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        }
    }

    public boolean V() {
        return this.f31512b;
    }

    public abstract int Y();

    public abstract void Z(byte b10);

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3660g
    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a0(int i10, boolean z10);

    public final void b0(boolean z10) {
        Z(z10 ? (byte) 1 : (byte) 0);
    }

    public final void c() {
        if (Y() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void c0(int i10, AbstractC3661h abstractC3661h);

    public final void d0(int i10, double d10) {
        j0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void e0(double d10) {
        k0(Double.doubleToRawLongBits(d10));
    }

    public final void f0(int i10, int i11) {
        p0(i10, i11);
    }

    public final void g0(int i10) {
        q0(i10);
    }

    public abstract void h0(int i10, int i11);

    public abstract void i0(int i10);

    public abstract void j0(int i10, long j10);

    public abstract void k0(long j10);

    public final void l0(int i10, float f10) {
        h0(i10, Float.floatToRawIntBits(f10));
    }

    public final void m0(float f10) {
        i0(Float.floatToRawIntBits(f10));
    }

    public final void n0(int i10, Q q10, f0 f0Var) {
        E0(i10, 3);
        o0(q10, f0Var);
        E0(i10, 4);
    }

    public final void o0(Q q10, f0 f0Var) {
        f0Var.i(q10, this.f31511a);
    }

    public abstract void p0(int i10, int i11);

    public abstract void q0(int i10);

    public final void r0(int i10, long j10) {
        H0(i10, j10);
    }

    public final void s0(long j10) {
        I0(j10);
    }

    public abstract void t0(int i10, Q q10);

    public abstract void u0(int i10, AbstractC3661h abstractC3661h);

    public final void v0(int i10, int i11) {
        h0(i10, i11);
    }

    public final void w0(int i10) {
        i0(i10);
    }

    public final void x0(int i10, long j10) {
        j0(i10, j10);
    }

    public final void y0(long j10) {
        k0(j10);
    }

    public final void z0(int i10, int i11) {
        F0(i10, S(i11));
    }

    public AbstractC3664k() {
    }
}
