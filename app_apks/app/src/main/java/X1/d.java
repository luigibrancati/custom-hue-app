package X1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f18009h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f18010i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O f18014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18015e = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18017g = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18016f = 0;

    public d(W1.g gVar) {
        this.f18011a = gVar;
        this.f18012b = "audio/amr-wb".equals(AbstractC0853a.e(gVar.f17734c.f1805o));
        this.f18013c = gVar.f17733b;
    }

    public static int e(int i10, boolean z10) {
        boolean z11 = (i10 >= 0 && i10 <= 8) || i10 == 15;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(z10 ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        AbstractC0853a.b(z11, sb2.toString());
        return z10 ? f18010i[i10] : f18009h[i10];
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18015e = j10;
        this.f18016f = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 1);
        this.f18014d = oF;
        oF.e(this.f18011a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        int iB;
        AbstractC0853a.i(this.f18014d);
        int i11 = this.f18017g;
        if (i11 != -1 && i10 != (iB = W1.d.b(i11))) {
            t.h("RtpAmrReader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(iB), Integer.valueOf(i10)));
        }
        c10.b0(1);
        int iE = e((c10.n() >> 3) & 15, this.f18012b);
        int iA = c10.a();
        AbstractC0853a.b(iA == iE, "compound payload not supported currently");
        this.f18014d.b(c10, iA);
        this.f18014d.d(m.a(this.f18016f, j10, this.f18015e, this.f18013c), 1, iA, 0, null);
        this.f18017g = i10;
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        this.f18015e = j10;
    }
}
