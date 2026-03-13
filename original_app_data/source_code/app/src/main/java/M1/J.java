package M1;

import E1.e;
import G1.AbstractC0853a;
import G1.M;
import java.nio.ByteBuffer;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class J extends E1.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f9059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f9060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9061k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9062l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9065o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f9067q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9068r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f9069s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9070t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9071u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f9072v;

    public J() {
        this(PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 0.2f, 2000000L, 10, (short) 1024);
    }

    public static void C(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = 127;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = -128;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    public static int F(byte b10, byte b11) {
        return (b10 << 8) | (b11 & ForkServer.ERROR);
    }

    public final void A(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        AbstractC0853a.a(this.f9071u >= i10);
        if (i11 == 2) {
            int i12 = this.f9070t;
            int i13 = this.f9071u;
            int i14 = i12 + i13;
            byte[] bArr = this.f9069s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f9072v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f9072v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f9072v, 0, i15);
                    System.arraycopy(this.f9069s, 0, this.f9072v, i15, length);
                }
            }
        } else {
            int i16 = this.f9070t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f9069s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f9072v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f9072v, 0, length2);
                System.arraycopy(this.f9069s, 0, this.f9072v, length2, i10 - length2);
            }
        }
        AbstractC0853a.b(i10 % this.f9064n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        AbstractC0853a.g(this.f9070t < this.f9069s.length);
        y(this.f9072v, i10, i11);
    }

    public final void B(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f9069s.length));
        int iS = s(byteBuffer);
        if (iS == byteBuffer.position()) {
            this.f9066p = 1;
        } else {
            byteBuffer.limit(Math.min(iS, byteBuffer.capacity()));
            x(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public void D(boolean z10) {
        this.f9065o = z10;
    }

    public final void E(ByteBuffer byteBuffer) {
        int length;
        int i10;
        AbstractC0853a.g(this.f9070t < this.f9069s.length);
        int iLimit = byteBuffer.limit();
        int iT = t(byteBuffer);
        int iPosition = iT - byteBuffer.position();
        int i11 = this.f9070t;
        int i12 = this.f9071u;
        int i13 = i11 + i12;
        byte[] bArr = this.f9069s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iT < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f9069s, i10, iMin);
        int i14 = this.f9071u + iMin;
        this.f9071u = i14;
        AbstractC0853a.g(i14 <= this.f9069s.length);
        boolean z11 = z10 && iPosition < length;
        z(z11);
        if (z11) {
            this.f9066p = 0;
            this.f9068r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    @Override // E1.g, E1.e
    public boolean c() {
        return super.c() && this.f9065o;
    }

    @Override // E1.e
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !a()) {
            int i10 = this.f9066p;
            if (i10 == 0) {
                B(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                E(byteBuffer);
            }
        }
    }

    @Override // E1.g
    public e.a h(e.a aVar) throws e.b {
        if (aVar.f3196c == 2) {
            return aVar.f3194a == -1 ? e.a.f3193e : aVar;
        }
        throw new e.b(aVar);
    }

    @Override // E1.g
    public void i() {
        if (c()) {
            this.f9064n = this.f3199b.f3195b * 2;
            int iN = n(r(this.f9062l) / 2) * 2;
            if (this.f9069s.length != iN) {
                this.f9069s = new byte[iN];
                this.f9072v = new byte[iN];
            }
        }
        this.f9066p = 0;
        this.f9067q = 0L;
        this.f9068r = 0;
        this.f9070t = 0;
        this.f9071u = 0;
    }

    @Override // E1.g
    public void j() {
        if (this.f9071u > 0) {
            z(true);
            this.f9068r = 0;
        }
    }

    @Override // E1.g
    public void k() {
        this.f9065o = false;
        byte[] bArr = M.f4267f;
        this.f9069s = bArr;
        this.f9072v = bArr;
    }

    public final int m(float f10) {
        return n((int) f10);
    }

    public final int n(int i10) {
        int i11 = this.f9064n;
        return (i10 / i11) * i11;
    }

    public final int o(int i10, int i11) {
        int i12 = this.f9061k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    public final int p(int i10, int i11) {
        return (((this.f9061k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    public final int q(int i10) {
        int iR = ((r(this.f9063m) - this.f9068r) * this.f9064n) - (this.f9069s.length / 2);
        AbstractC0853a.g(iR >= 0);
        return m(Math.min((i10 * this.f9059i) + 0.5f, iR));
    }

    public final int r(long j10) {
        return (int) ((j10 * ((long) this.f3199b.f3194a)) / 1000000);
    }

    public final int s(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (v(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f9064n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    public final int t(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (v(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f9064n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    public long u() {
        return this.f9067q;
    }

    public final boolean v(byte b10, byte b11) {
        return Math.abs(F(b10, b11)) > this.f9060j;
    }

    public final void w(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            C(bArr, i12, (F(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? p(i12, i10 - 1) : i11 == 2 ? o(i12, i10 - 1) : this.f9061k)) / 100);
        }
    }

    public final void x(ByteBuffer byteBuffer) {
        l(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    public final void y(byte[] bArr, int i10, int i11) {
        AbstractC0853a.b(i10 % this.f9064n == 0, "byteOutput size is not aligned to frame size " + i10);
        w(bArr, i10, i11);
        l(i10).put(bArr, 0, i10).flip();
    }

    public final void z(boolean z10) {
        int length;
        int iQ;
        int i10 = this.f9071u;
        byte[] bArr = this.f9069s;
        if (i10 == bArr.length || z10) {
            if (this.f9068r == 0) {
                if (z10) {
                    A(i10, 3);
                    length = i10;
                } else {
                    AbstractC0853a.g(i10 >= bArr.length / 2);
                    length = this.f9069s.length / 2;
                    A(length, 0);
                }
                iQ = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iQ2 = q(length2) + (this.f9069s.length / 2);
                A(iQ2, 2);
                iQ = iQ2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iQ = q(length);
                A(iQ, 1);
            }
            AbstractC0853a.h(length % this.f9064n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            AbstractC0853a.g(i10 >= iQ);
            this.f9071u -= length;
            int i11 = this.f9070t + length;
            this.f9070t = i11;
            this.f9070t = i11 % this.f9069s.length;
            int i12 = this.f9068r;
            int i13 = this.f9064n;
            this.f9068r = i12 + (iQ / i13);
            this.f9067q += (long) ((length - iQ) / i13);
        }
    }

    public J(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f9068r = 0;
        this.f9070t = 0;
        this.f9071u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        AbstractC0853a.a(z10);
        this.f9062l = j10;
        this.f9059i = f10;
        this.f9063m = j11;
        this.f9061k = i10;
        this.f9060j = s10;
        byte[] bArr = M.f4267f;
        this.f9069s = bArr;
        this.f9072v = bArr;
    }
}
