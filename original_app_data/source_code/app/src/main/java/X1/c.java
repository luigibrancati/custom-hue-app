package X1;

import G1.AbstractC0853a;
import G1.B;
import G1.C;
import G1.M;
import i2.AbstractC4322b;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18002a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f18004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18005d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18008g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f18003b = new B();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18006e = -9223372036854775807L;

    public c(W1.g gVar) {
        this.f18002a = gVar;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18006e = j10;
        this.f18008g = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 1);
        this.f18004c = oF;
        oF.e(this.f18002a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        int iL = c10.L() & 3;
        int iL2 = c10.L() & 255;
        long jA = m.a(this.f18008g, j10, this.f18006e, this.f18002a.f17733b);
        if (iL == 0) {
            e();
            if (iL2 == 1) {
                i(c10, jA);
                return;
            } else {
                h(c10, iL2, jA);
                return;
            }
        }
        if (iL == 1 || iL == 2) {
            e();
        } else if (iL != 3) {
            throw new IllegalArgumentException(String.valueOf(iL));
        }
        g(c10, z10, iL, jA);
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        AbstractC0853a.g(this.f18006e == -9223372036854775807L);
        this.f18006e = j10;
    }

    public final void e() {
        if (this.f18005d > 0) {
            f();
        }
    }

    public final void f() {
        ((O) M.i(this.f18004c)).d(this.f18007f, 1, this.f18005d, 0, null);
        this.f18005d = 0;
    }

    public final void g(C c10, boolean z10, int i10, long j10) {
        int iA = c10.a();
        ((O) AbstractC0853a.e(this.f18004c)).b(c10, iA);
        this.f18005d += iA;
        this.f18007f = j10;
        if (z10 && i10 == 3) {
            f();
        }
    }

    public final void h(C c10, int i10, long j10) {
        this.f18003b.n(c10.f());
        this.f18003b.s(2);
        long j11 = j10;
        for (int i11 = 0; i11 < i10; i11++) {
            AbstractC4322b.C0482b c0482bF = AbstractC4322b.f(this.f18003b);
            ((O) AbstractC0853a.e(this.f18004c)).b(c10, c0482bF.f36935e);
            ((O) M.i(this.f18004c)).d(j11, 1, c0482bF.f36935e, 0, null);
            j11 += ((long) (c0482bF.f36936f / c0482bF.f36933c)) * 1000000;
            this.f18003b.s(c0482bF.f36935e);
        }
    }

    public final void i(C c10, long j10) {
        int iA = c10.a();
        ((O) AbstractC0853a.e(this.f18004c)).b(c10, iA);
        ((O) M.i(this.f18004c)).d(j10, 1, iA, 0, null);
    }
}
