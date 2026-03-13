package P2;

import D1.o;
import G1.AbstractC0853a;
import K7.AbstractC1081v;
import P2.L;
import P2.v;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13050a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f13055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i2.O f13056g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13059j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13061l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13062m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13065p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13069t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13071v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13054e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.C f13051b = new G1.C(new byte[15], 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.B f13052c = new G1.B();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1.C f13053d = new G1.C();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v.b f13066q = new v.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13067r = -2147483647;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13068s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13070u = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13060k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13063n = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f13057h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f13058i = -9.223372036854776E18d;

    public u(String str) {
        this.f13050a = str;
    }

    private boolean k(G1.C c10) {
        int i10 = this.f13061l;
        if ((i10 & 2) == 0) {
            c10.a0(c10.j());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (c10.a() > 0) {
            int i11 = this.f13062m << 8;
            this.f13062m = i11;
            int iL = i11 | c10.L();
            this.f13062m = iL;
            if (v.e(iL)) {
                c10.a0(c10.g() - 3);
                this.f13062m = 0;
                return true;
            }
        }
        return false;
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) throws D1.w {
        AbstractC0853a.i(this.f13056g);
        while (c10.a() > 0) {
            int i10 = this.f13054e;
            if (i10 != 0) {
                if (i10 == 1) {
                    f(c10, this.f13051b, false);
                    if (this.f13051b.a() != 0) {
                        this.f13063n = false;
                    } else if (i()) {
                        this.f13051b.a0(0);
                        i2.O o10 = this.f13056g;
                        G1.C c11 = this.f13051b;
                        o10.b(c11, c11.j());
                        this.f13051b.W(2);
                        this.f13053d.W(this.f13066q.f13074c);
                        this.f13063n = true;
                        this.f13054e = 2;
                    } else if (this.f13051b.j() < 15) {
                        G1.C c12 = this.f13051b;
                        c12.Z(c12.j() + 1);
                        this.f13063n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (j(this.f13066q.f13072a)) {
                        f(c10, this.f13053d, true);
                    }
                    l(c10);
                    int i11 = this.f13064o;
                    v.b bVar = this.f13066q;
                    if (i11 == bVar.f13074c) {
                        int i12 = bVar.f13072a;
                        if (i12 == 1) {
                            h(new G1.B(this.f13053d.f()));
                        } else if (i12 == 17) {
                            this.f13069t = v.f(new G1.B(this.f13053d.f()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f13054e = 1;
                    }
                }
            } else if (k(c10)) {
                this.f13054e = 1;
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f13054e = 0;
        this.f13062m = 0;
        this.f13051b.W(2);
        this.f13064o = 0;
        this.f13065p = 0;
        this.f13067r = -2147483647;
        this.f13068s = -1;
        this.f13069t = 0;
        this.f13070u = -1L;
        this.f13071v = false;
        this.f13059j = false;
        this.f13063n = true;
        this.f13060k = true;
        this.f13057h = -9.223372036854776E18d;
        this.f13058i = -9.223372036854776E18d;
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f13055f = dVar.b();
        this.f13056g = rVar.f(dVar.c(), 1);
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f13061l = i10;
        if (!this.f13060k && (this.f13065p != 0 || !this.f13063n)) {
            this.f13059j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f13059j) {
                this.f13058i = j10;
            } else {
                this.f13057h = j10;
            }
        }
    }

    public final void f(G1.C c10, G1.C c11, boolean z10) {
        int iG = c10.g();
        int iMin = Math.min(c10.a(), c11.a());
        c10.q(c11.f(), c11.g(), iMin);
        c11.b0(iMin);
        if (z10) {
            c10.a0(iG);
        }
    }

    public final void g() {
        int i10;
        if (this.f13071v) {
            this.f13060k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f13068s - this.f13069t)) * 1000000.0d) / ((double) this.f13067r);
        long jRound = Math.round(this.f13057h);
        if (this.f13059j) {
            this.f13059j = false;
            this.f13057h = this.f13058i;
        } else {
            this.f13057h += d10;
        }
        this.f13056g.d(jRound, i10, this.f13065p, 0, null);
        this.f13071v = false;
        this.f13069t = 0;
        this.f13065p = 0;
    }

    public final void h(G1.B b10) throws D1.w {
        v.c cVarH = v.h(b10);
        this.f13067r = cVarH.f13076b;
        this.f13068s = cVarH.f13077c;
        long j10 = this.f13070u;
        long j11 = this.f13066q.f13073b;
        if (j10 != j11) {
            this.f13070u = j11;
            String str = "mhm1";
            if (cVarH.f13075a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f13075a));
            }
            byte[] bArr = cVarH.f13078d;
            this.f13056g.e(new o.b().j0(this.f13055f).W(this.f13050a).y0("audio/mhm1").z0(this.f13067r).U(str).k0((bArr == null || bArr.length <= 0) ? null : AbstractC1081v.B(G1.M.f4267f, bArr)).P());
        }
        this.f13071v = true;
    }

    public final boolean i() throws D1.w {
        int iJ = this.f13051b.j();
        this.f13052c.o(this.f13051b.f(), iJ);
        boolean zG = v.g(this.f13052c, this.f13066q);
        if (zG) {
            this.f13064o = 0;
            this.f13065p += this.f13066q.f13074c + iJ;
        }
        return zG;
    }

    public final boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    public final void l(G1.C c10) {
        int iMin = Math.min(c10.a(), this.f13066q.f13074c - this.f13064o);
        this.f13056g.b(c10, iMin);
        this.f13064o += iMin;
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
    }
}
