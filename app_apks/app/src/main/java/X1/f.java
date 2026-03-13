package X1;

import D1.w;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W1.g f18032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O f18033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18034e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18038i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f18031b = new C(H1.g.f5132a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f18030a = new C();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18035f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18036g = -1;

    public f(W1.g gVar) {
        this.f18032c = gVar;
    }

    public static int e(int i10) {
        return i10 == 5 ? 1 : 0;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18035f = j10;
        this.f18037h = 0;
        this.f18038i = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 2);
        this.f18033d = oF;
        ((O) M.i(oF)).e(this.f18032c.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) throws w {
        try {
            int i11 = c10.f()[0] & 31;
            AbstractC0853a.i(this.f18033d);
            if (i11 > 0 && i11 < 24) {
                g(c10);
            } else if (i11 == 24) {
                h(c10);
            } else {
                if (i11 != 28) {
                    throw w.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i11)), null);
                }
                f(c10, i10);
            }
            if (z10) {
                if (this.f18035f == -9223372036854775807L) {
                    this.f18035f = j10;
                }
                this.f18033d.d(m.a(this.f18038i, j10, this.f18035f, 90000), this.f18034e, this.f18037h, 0, null);
                this.f18037h = 0;
            }
            this.f18036g = i10;
        } catch (IndexOutOfBoundsException e10) {
            throw w.c(null, e10);
        }
    }

    public final void f(C c10, int i10) {
        byte b10 = c10.f()[0];
        byte b11 = c10.f()[1];
        int i11 = (b10 & 224) | (b11 & 31);
        boolean z10 = (b11 & 128) > 0;
        boolean z11 = (b11 & 64) > 0;
        if (z10) {
            this.f18037h += i();
            c10.f()[1] = (byte) i11;
            this.f18030a.X(c10.f());
            this.f18030a.a0(1);
        } else {
            int iB = W1.d.b(this.f18036g);
            if (i10 != iB) {
                t.h("RtpH264Reader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return;
            } else {
                this.f18030a.X(c10.f());
                this.f18030a.a0(2);
            }
        }
        int iA = this.f18030a.a();
        this.f18033d.b(this.f18030a, iA);
        this.f18037h += iA;
        if (z11) {
            this.f18034e = e(i11 & 31);
        }
    }

    public final void g(C c10) {
        int iA = c10.a();
        this.f18037h += i();
        this.f18033d.b(c10, iA);
        this.f18037h += iA;
        this.f18034e = e(c10.f()[0] & 31);
    }

    public final void h(C c10) {
        c10.L();
        while (c10.a() > 4) {
            int iT = c10.T();
            this.f18037h += i();
            this.f18033d.b(c10, iT);
            this.f18037h += iT;
        }
        this.f18034e = 0;
    }

    public final int i() {
        this.f18031b.a0(0);
        int iA = this.f18031b.a();
        ((O) AbstractC0853a.e(this.f18033d)).b(this.f18031b, iA);
        return iA;
    }

    @Override // X1.k
    public void d(long j10, int i10) {
    }
}
