package X1;

import D1.w;
import G1.AbstractC0853a;
import G1.B;
import G1.C;
import G1.M;
import K7.AbstractC1083x;
import i2.O;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W1.g f18048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O f18050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18055h;

    public h(W1.g gVar) {
        this.f18048a = gVar;
        try {
            this.f18049b = e(gVar.f17735d);
            this.f18051d = -9223372036854775807L;
            this.f18052e = -1;
            this.f18053f = 0;
            this.f18054g = 0L;
            this.f18055h = -9223372036854775807L;
        } catch (w e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(AbstractC1083x abstractC1083x) throws w {
        String str = (String) abstractC1083x.get("config");
        int i10 = 0;
        i10 = 0;
        if (str != null && str.length() % 2 == 0) {
            B b10 = new B(M.R(str));
            int iH = b10.h(1);
            if (iH != 0) {
                throw w.b("unsupported audio mux version: " + iH, null);
            }
            AbstractC0853a.b(b10.h(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int iH2 = b10.h(6);
            AbstractC0853a.b(b10.h(4) == 0, "Only suppors one program.");
            AbstractC0853a.b(b10.h(3) == 0, "Only suppors one layer.");
            i10 = iH2;
        }
        return i10 + 1;
    }

    private void f() {
        ((O) AbstractC0853a.e(this.f18050c)).d(this.f18055h, 1, this.f18053f, 0, null);
        this.f18053f = 0;
        this.f18055h = -9223372036854775807L;
    }

    @Override // X1.k
    public void a(long j10, long j11) {
        this.f18051d = j10;
        this.f18053f = 0;
        this.f18054g = j11;
    }

    @Override // X1.k
    public void b(r rVar, int i10) {
        O oF = rVar.f(i10, 2);
        this.f18050c = oF;
        ((O) M.i(oF)).e(this.f18048a.f17734c);
    }

    @Override // X1.k
    public void c(C c10, long j10, int i10, boolean z10) {
        AbstractC0853a.i(this.f18050c);
        int iB = W1.d.b(this.f18052e);
        if (this.f18053f > 0 && iB < i10) {
            f();
        }
        for (int i11 = 0; i11 < this.f18049b; i11++) {
            int i12 = 0;
            while (c10.g() < c10.j()) {
                int iL = c10.L();
                i12 += iL;
                if (iL != 255) {
                    break;
                }
            }
            this.f18050c.b(c10, i12);
            this.f18053f += i12;
        }
        this.f18055h = m.a(this.f18054g, j10, this.f18051d, this.f18048a.f17733b);
        if (z10) {
            f();
        }
        this.f18052e = i10;
    }

    @Override // X1.k
    public void d(long j10, int i10) {
        AbstractC0853a.g(this.f18051d == -9223372036854775807L);
        this.f18051d = j10;
    }
}
