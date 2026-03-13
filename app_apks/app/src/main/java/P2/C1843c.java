package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import i2.AbstractC4322b;
import java.util.Objects;

/* JADX INFO: renamed from: P2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1843c implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.B f12781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.C f12782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i2.O f12787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12789i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12790j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public D1.o f12792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12794n;

    public C1843c(String str) {
        this(null, 0, str);
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        AbstractC0853a.i(this.f12787g);
        while (c10.a() > 0) {
            int i10 = this.f12788h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(c10.a(), this.f12793m - this.f12789i);
                        this.f12787g.b(c10, iMin);
                        int i11 = this.f12789i + iMin;
                        this.f12789i = i11;
                        if (i11 == this.f12793m) {
                            AbstractC0853a.g(this.f12794n != -9223372036854775807L);
                            this.f12787g.d(this.f12794n, 1, this.f12793m, 0, null);
                            this.f12794n += this.f12791k;
                            this.f12788h = 0;
                        }
                    }
                } else if (f(c10, this.f12782b.f(), 128)) {
                    g();
                    this.f12782b.a0(0);
                    this.f12787g.b(this.f12782b, 128);
                    this.f12788h = 2;
                }
            } else if (h(c10)) {
                this.f12788h = 1;
                this.f12782b.f()[0] = 11;
                this.f12782b.f()[1] = 119;
                this.f12789i = 2;
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f12788h = 0;
        this.f12789i = 0;
        this.f12790j = false;
        this.f12794n = -9223372036854775807L;
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12786f = dVar.b();
        this.f12787g = rVar.f(dVar.c(), 1);
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12794n = j10;
    }

    public final boolean f(G1.C c10, byte[] bArr, int i10) {
        int iMin = Math.min(c10.a(), i10 - this.f12789i);
        c10.q(bArr, this.f12789i, iMin);
        int i11 = this.f12789i + iMin;
        this.f12789i = i11;
        return i11 == i10;
    }

    public final void g() {
        this.f12781a.p(0);
        AbstractC4322b.C0482b c0482bF = AbstractC4322b.f(this.f12781a);
        D1.o oVar = this.f12792l;
        if (oVar == null || c0482bF.f36934d != oVar.f1780G || c0482bF.f36933c != oVar.f1781H || !Objects.equals(c0482bF.f36931a, oVar.f1805o)) {
            o.b bVarT0 = new o.b().j0(this.f12786f).W(this.f12785e).y0(c0482bF.f36931a).T(c0482bF.f36934d).z0(c0482bF.f36933c).n0(this.f12783c).w0(this.f12784d).t0(c0482bF.f36937g);
            if ("audio/ac3".equals(c0482bF.f36931a)) {
                bVarT0.S(c0482bF.f36937g);
            }
            D1.o oVarP = bVarT0.P();
            this.f12792l = oVarP;
            this.f12787g.e(oVarP);
        }
        this.f12793m = c0482bF.f36935e;
        this.f12791k = (((long) c0482bF.f36936f) * 1000000) / ((long) this.f12792l.f1781H);
    }

    public final boolean h(G1.C c10) {
        while (true) {
            if (c10.a() <= 0) {
                return false;
            }
            if (this.f12790j) {
                int iL = c10.L();
                if (iL == 119) {
                    this.f12790j = false;
                    return true;
                }
                this.f12790j = iL == 11;
            } else {
                this.f12790j = c10.L() == 11;
            }
        }
    }

    public C1843c(String str, int i10, String str2) {
        G1.B b10 = new G1.B(new byte[128]);
        this.f12781a = b10;
        this.f12782b = new G1.C(b10.f4234a);
        this.f12788h = 0;
        this.f12794n = -9223372036854775807L;
        this.f12783c = str;
        this.f12784d = i10;
        this.f12785e = str2;
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
    }
}
