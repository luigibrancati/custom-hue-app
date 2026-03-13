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
public final class g implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final W1.g f18041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O f18042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18043e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18047i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f18039a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f18040b = new C(H1.g.f5132a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18044f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18045g = -1;

    public g(W1.g gVar) {
        this.f18041c = gVar;
    }

    private static int e(int i10) {
        return (i10 == 19 || i10 == 20) ? 1 : 0;
    }

    private void g(C c10, int i10) throws w {
        if (c10.f().length < 3) {
            throw w.c("Malformed FU header.", null);
        }
        int i11 = c10.f()[1] & 7;
        byte b10 = c10.f()[2];
        int i12 = b10 & 63;
        boolean z10 = (b10 & 128) > 0;
        boolean z11 = (b10 & 64) > 0;
        if (z10) {
            this.f18046h += i();
            c10.f()[1] = (byte) ((i12 << 1) & 127);
            c10.f()[2] = (byte) i11;
            this.f18039a.X(c10.f());
            this.f18039a.a0(1);
        } else {
            int i13 = (this.f18045g + 1) % 65535;
            if (i10 != i13) {
                t.h("RtpH265Reader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i13), Integer.valueOf(i10)));
                return;
            } else {
                this.f18039a.X(c10.f());
                this.f18039a.a0(3);
            }
        }
        int iA = this.f18039a.a();
        this.f18042d.b(this.f18039a, iA);
        this.f18046h += iA;
        if (z11) {
            this.f18043e = e(i12);
        }
    }

    private void h(C c10) {
        int iA = c10.a();
        this.f18046h += i();
        this.f18042d.b(c10, iA);
        this.f18046h += iA;
        this.f18043e = e((c10.f()[0] >> 1) & 63);
    }

    private int i() {
        this.f18040b.a0(0);
        int iA = this.f18040b.a();
        ((O) AbstractC0853a.e(this.f18042d)).b(this.f18040b, iA);
        return iA;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18044f = j10;
        this.f18046h = 0;
        this.f18047i = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 2);
        this.f18042d = oF;
        oF.e(this.f18041c.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) throws w {
        if (c10.f().length == 0) {
            throw w.c("Empty RTP data packet.", null);
        }
        int i11 = (c10.f()[0] >> 1) & 63;
        AbstractC0853a.i(this.f18042d);
        if (i11 >= 0 && i11 < 48) {
            h(c10);
        } else if (i11 == 48) {
            f(c10);
        } else {
            if (i11 != 49) {
                throw w.c(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i11)), null);
            }
            g(c10, i10);
        }
        if (z10) {
            if (this.f18044f == -9223372036854775807L) {
                this.f18044f = j10;
            }
            this.f18042d.d(m.a(this.f18047i, j10, this.f18044f, 90000), this.f18043e, this.f18046h, 0, null);
            this.f18046h = 0;
        }
        this.f18045g = i10;
    }

    public final void f(C c10) throws w {
        c10.a0(2);
        int i10 = 0;
        while (c10.a() > 2) {
            int iT = c10.T();
            int i11 = H1.g.i(c10.f(), c10.g() - 3);
            if (c10.a() < iT) {
                throw w.c("Malformed Aggregation Packet. NAL unit size exceeds packet size.", null);
            }
            this.f18046h += i();
            this.f18042d.b(c10, iT);
            this.f18046h += iT;
            this.f18043e |= e(i11);
            i10++;
        }
        if (c10.a() > 0) {
            throw w.c("Malformed Aggregation Packet. Packet size exceeds NAL unit size.", null);
        }
        if (i10 < 2) {
            throw w.c("Aggregation Packet must contain at least 2 NAL units.", null);
        }
    }

    @Override // X1.k
    public void d(long j10, int i10) {
    }
}
