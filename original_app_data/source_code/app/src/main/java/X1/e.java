package X1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f18019b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18021d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f18027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18029l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18020c = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18022e = -1;

    public e(W1.g gVar) {
        this.f18018a = gVar;
    }

    private void e() {
        O o10 = (O) AbstractC0853a.e(this.f18019b);
        long j10 = this.f18028k;
        boolean z10 = this.f18025h;
        o10.d(j10, z10 ? 1 : 0, this.f18021d, 0, null);
        this.f18021d = 0;
        this.f18028k = -9223372036854775807L;
        this.f18025h = false;
        this.f18029l = false;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18020c = j10;
        this.f18021d = 0;
        this.f18027j = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 2);
        this.f18019b = oF;
        oF.e(this.f18018a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        AbstractC0853a.i(this.f18019b);
        int iG = c10.g();
        int iT = c10.T();
        boolean z11 = (iT & RecognitionOptions.UPC_E) > 0;
        if ((iT & 512) != 0 || (iT & 504) != 0 || (iT & 7) != 0) {
            t.h("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z11) {
            if (this.f18029l && this.f18021d > 0) {
                e();
            }
            this.f18029l = true;
            if ((c10.n() & 252) < 128) {
                t.h("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                c10.f()[iG] = 0;
                c10.f()[iG + 1] = 0;
                c10.a0(iG);
            }
        } else {
            if (!this.f18029l) {
                t.h("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int iB = W1.d.b(this.f18022e);
            if (i10 < iB) {
                t.h("RtpH263Reader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return;
            }
        }
        if (this.f18021d == 0) {
            f(c10, this.f18026i);
            if (!this.f18026i && this.f18025h) {
                int i11 = this.f18023f;
                D1.o oVar = this.f18018a.f17734c;
                if (i11 != oVar.f1812v || this.f18024g != oVar.f1813w) {
                    this.f18019b.e(oVar.b().F0(this.f18023f).h0(this.f18024g).P());
                }
                this.f18026i = true;
            }
        }
        int iA = c10.a();
        this.f18019b.b(c10, iA);
        this.f18021d += iA;
        this.f18028k = m.a(this.f18027j, j10, this.f18020c, 90000);
        if (z10) {
            e();
        }
        this.f18022e = i10;
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        AbstractC0853a.g(this.f18020c == -9223372036854775807L);
        this.f18020c = j10;
    }

    public final void f(C c10, boolean z10) {
        int iG = c10.g();
        if (((c10.N() >> 10) & 63) != 32) {
            c10.a0(iG);
            this.f18025h = false;
            return;
        }
        int iN = c10.n();
        int i10 = (iN >> 1) & 1;
        if (!z10 && i10 == 0) {
            int i11 = (iN >> 2) & 7;
            if (i11 == 1) {
                this.f18023f = 128;
                this.f18024g = 96;
            } else {
                int i12 = i11 - 2;
                this.f18023f = 176 << i12;
                this.f18024g = 144 << i12;
            }
        }
        c10.a0(iG);
        this.f18025h = i10 == 0;
    }
}
