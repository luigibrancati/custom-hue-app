package X1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f18076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18077c = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18078d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18079e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18080f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18081g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18084j;

    public n(W1.g gVar) {
        this.f18075a = gVar;
    }

    private void e() {
        O o10 = (O) AbstractC0853a.e(this.f18076b);
        long j10 = this.f18080f;
        boolean z10 = this.f18083i;
        o10.d(j10, z10 ? 1 : 0, this.f18079e, 0, null);
        this.f18079e = -1;
        this.f18080f = -9223372036854775807L;
        this.f18082h = false;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18077c = j10;
        this.f18079e = -1;
        this.f18081g = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 2);
        this.f18076b = oF;
        oF.e(this.f18075a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        AbstractC0853a.i(this.f18076b);
        if (f(c10, i10)) {
            if (this.f18079e == -1 && this.f18082h) {
                this.f18083i = (c10.n() & 1) == 0;
            }
            if (!this.f18084j) {
                int iG = c10.g();
                c10.a0(iG + 6);
                int iD = c10.D() & 16383;
                int iD2 = c10.D() & 16383;
                c10.a0(iG);
                D1.o oVar = this.f18075a.f17734c;
                if (iD != oVar.f1812v || iD2 != oVar.f1813w) {
                    this.f18076b.e(oVar.b().F0(iD).h0(iD2).P());
                }
                this.f18084j = true;
            }
            int iA = c10.a();
            this.f18076b.b(c10, iA);
            int i11 = this.f18079e;
            if (i11 == -1) {
                this.f18079e = iA;
            } else {
                this.f18079e = i11 + iA;
            }
            this.f18080f = m.a(this.f18081g, j10, this.f18077c, 90000);
            if (z10) {
                e();
            }
            this.f18078d = i10;
        }
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        AbstractC0853a.g(this.f18077c == -9223372036854775807L);
        this.f18077c = j10;
    }

    public final boolean f(C c10, int i10) {
        int iL = c10.L();
        if ((iL & 16) == 16 && (iL & 7) == 0) {
            if (this.f18082h && this.f18079e > 0) {
                e();
            }
            this.f18082h = true;
        } else {
            if (!this.f18082h) {
                t.h("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int iB = W1.d.b(this.f18078d);
            if (i10 < iB) {
                t.h("RtpVP8Reader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return false;
            }
        }
        if ((iL & 128) != 0) {
            int iL2 = c10.L();
            if ((iL2 & 128) != 0 && (c10.L() & 128) != 0) {
                c10.b0(1);
            }
            if ((iL2 & 64) != 0) {
                c10.b0(1);
            }
            if ((iL2 & 32) != 0 || (iL2 & 16) != 0) {
                c10.b0(1);
            }
        }
        return true;
    }
}
