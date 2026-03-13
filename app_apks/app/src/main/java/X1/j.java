package X1;

import D1.o;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import i2.H;
import i2.O;
import i2.r;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f18064b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18066d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18069g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18065c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18067e = -1;

    public j(W1.g gVar) {
        this.f18063a = gVar;
    }

    public static void e(C c10) {
        int iG = c10.g();
        AbstractC0853a.b(c10.j() > 18, "ID Header has insufficient data");
        AbstractC0853a.b(c10.I(8).equals("OpusHead"), "ID Header missing");
        AbstractC0853a.b(c10.L() == 1, "version number must always be 1");
        c10.a0(iG);
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18065c = j10;
        this.f18066d = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 1);
        this.f18064b = oF;
        oF.e(this.f18063a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        AbstractC0853a.i(this.f18064b);
        if (!this.f18068f) {
            e(c10);
            List listA = H.a(c10.f());
            o.b bVarB = this.f18063a.f17734c.b();
            bVarB.k0(listA);
            this.f18064b.e(bVarB.P());
            this.f18068f = true;
        } else if (this.f18069g) {
            int iB = W1.d.b(this.f18067e);
            if (i10 != iB) {
                t.h("RtpOpusReader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i10)));
            }
            int iA = c10.a();
            this.f18064b.b(c10, iA);
            this.f18064b.d(m.a(this.f18066d, j10, this.f18065c, 48000), 1, iA, 0, null);
        } else {
            AbstractC0853a.b(c10.j() >= 8, "Comment Header has insufficient data");
            AbstractC0853a.b(c10.I(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f18069g = true;
        }
        this.f18067e = i10;
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        this.f18065c = j10;
    }
}
