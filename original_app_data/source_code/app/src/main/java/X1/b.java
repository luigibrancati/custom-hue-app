package X1;

import G1.AbstractC0853a;
import G1.B;
import G1.C;
import G1.M;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f17993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f17994b = new B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O f18000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18001i;

    public b(W1.g gVar) {
        this.f17993a = gVar;
        this.f17995c = gVar.f17733b;
        String str = (String) AbstractC0853a.e((String) gVar.f17735d.get("mode"));
        if (J7.c.a(str, "AAC-hbr")) {
            this.f17996d = 13;
            this.f17997e = 3;
        } else {
            if (!J7.c.a(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f17996d = 6;
            this.f17997e = 2;
        }
        this.f17998f = this.f17997e + this.f17996d;
    }

    public static void e(O o10, long j10, int i10) {
        o10.d(j10, 1, i10, 0, null);
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f17999g = j10;
        this.f18001i = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 1);
        this.f18000h = oF;
        oF.e(this.f17993a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        AbstractC0853a.e(this.f18000h);
        short sH = c10.H();
        int i11 = sH / this.f17998f;
        long jA = m.a(this.f18001i, j10, this.f17999g, this.f17995c);
        this.f17994b.m(c10);
        if (i11 == 1) {
            int iH = this.f17994b.h(this.f17996d);
            this.f17994b.r(this.f17997e);
            this.f18000h.b(c10, c10.a());
            if (z10) {
                e(this.f18000h, jA, iH);
                return;
            }
            return;
        }
        c10.b0((sH + 7) / 8);
        for (int i12 = 0; i12 < i11; i12++) {
            int iH2 = this.f17994b.h(this.f17996d);
            this.f17994b.r(this.f17997e);
            this.f18000h.b(c10, iH2);
            e(this.f18000h, jA, iH2);
            jA += M.a1(i11, 1000000L, this.f17995c);
        }
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        this.f17999g = j10;
    }
}
