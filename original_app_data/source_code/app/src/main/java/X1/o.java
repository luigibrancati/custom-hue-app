package X1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import G1.t;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public O f18086b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18096l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18087c = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18090f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18091g = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18088d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18089e = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18092h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18093i = -1;

    public o(W1.g gVar) {
        this.f18085a = gVar;
    }

    private void e() {
        O o10 = (O) AbstractC0853a.e(this.f18086b);
        long j10 = this.f18091g;
        boolean z10 = this.f18096l;
        o10.d(j10, z10 ? 1 : 0, this.f18090f, 0, null);
        this.f18090f = -1;
        this.f18091g = -9223372036854775807L;
        this.f18094j = false;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18087c = j10;
        this.f18090f = -1;
        this.f18088d = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 2);
        this.f18086b = oF;
        oF.e(this.f18085a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        int i11;
        int i12;
        AbstractC0853a.i(this.f18086b);
        if (f(c10, i10)) {
            if (this.f18090f == -1 && this.f18094j) {
                this.f18096l = (c10.n() & 4) == 0;
            }
            if (!this.f18095k && (i11 = this.f18092h) != -1 && (i12 = this.f18093i) != -1) {
                D1.o oVar = this.f18085a.f17734c;
                if (i11 != oVar.f1812v || i12 != oVar.f1813w) {
                    this.f18086b.e(oVar.b().F0(this.f18092h).h0(this.f18093i).P());
                }
                this.f18095k = true;
            }
            int iA = c10.a();
            this.f18086b.b(c10, iA);
            int i13 = this.f18090f;
            if (i13 == -1) {
                this.f18090f = iA;
            } else {
                this.f18090f = i13 + iA;
            }
            this.f18091g = m.a(this.f18088d, j10, this.f18087c, 90000);
            if (z10) {
                e();
            }
            this.f18089e = i10;
        }
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        AbstractC0853a.g(this.f18087c == -9223372036854775807L);
        this.f18087c = j10;
    }

    public final boolean f(C c10, int i10) {
        int iL = c10.L();
        if ((iL & 8) == 8) {
            if (this.f18094j && this.f18090f > 0) {
                e();
            }
            this.f18094j = true;
        } else {
            if (!this.f18094j) {
                t.h("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int iB = W1.d.b(this.f18089e);
            if (i10 < iB) {
                t.h("RtpVp9Reader", M.G("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(iB), Integer.valueOf(i10)));
                return false;
            }
        }
        if ((iL & 128) != 0 && (c10.L() & 128) != 0 && c10.a() < 1) {
            return false;
        }
        int i11 = iL & 16;
        AbstractC0853a.b(i11 == 0, "VP9 flexible mode is not supported.");
        if ((iL & 32) != 0) {
            c10.b0(1);
            if (c10.a() < 1) {
                return false;
            }
            if (i11 == 0) {
                c10.b0(1);
            }
        }
        if ((iL & 2) != 0) {
            int iL2 = c10.L();
            int i12 = (iL2 >> 5) & 7;
            if ((iL2 & 16) != 0) {
                int i13 = i12 + 1;
                if (c10.a() < i13 * 4) {
                    return false;
                }
                for (int i14 = 0; i14 < i13; i14++) {
                    this.f18092h = c10.T();
                    this.f18093i = c10.T();
                }
            }
            if ((iL2 & 8) != 0) {
                int iL3 = c10.L();
                if (c10.a() < iL3) {
                    return false;
                }
                for (int i15 = 0; i15 < iL3; i15++) {
                    int iT = (c10.T() & 12) >> 2;
                    if (c10.a() < iT) {
                        return false;
                    }
                    c10.b0(iT);
                }
            }
        }
        return true;
    }
}
