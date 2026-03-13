package X1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f18057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18059d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18060e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18062g;

    public i(W1.g gVar) {
        this.f18056a = gVar;
    }

    public static int e(C c10) {
        int iA = N7.b.a(c10.f(), new byte[]{0, 0, 1, -74});
        if (iA != -1) {
            c10.a0(iA + 4);
            if ((c10.n() >> 6) == 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18059d = j10;
        this.f18061f = j11;
        this.f18062g = 0;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 2);
        this.f18057b = oF;
        ((O) M.i(oF)).e(this.f18056a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        int iB;
        AbstractC0853a.i(this.f18057b);
        int i11 = this.f18060e;
        if (i11 != -1 && i10 != (iB = W1.d.b(i11))) {
            t.h("RtpMpeg4Reader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
        }
        int iA = c10.a();
        this.f18057b.b(c10, iA);
        if (this.f18062g == 0) {
            this.f18058c = e(c10);
        }
        this.f18062g += iA;
        if (z10) {
            if (this.f18059d == -9223372036854775807L) {
                this.f18059d = j10;
            }
            this.f18057b.d(m.a(this.f18061f, j10, this.f18059d, 90000), this.f18058c, this.f18062g, 0, null);
            this.f18062g = 0;
        }
        this.f18060e = i10;
    }

    @Override // X1.k
    public void d(long j10, int i10) {
    }
}
