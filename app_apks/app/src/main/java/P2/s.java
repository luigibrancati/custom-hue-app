package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.AbstractC4321a;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1.C f13016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G1.B f13017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i2.O f13018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D1.o f13020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f13031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f13035w;

    public s(String str, int i10, String str2) {
        this.f13013a = str;
        this.f13014b = i10;
        this.f13015c = str2;
        G1.C c10 = new G1.C(RecognitionOptions.UPC_E);
        this.f13016d = c10;
        this.f13017e = new G1.B(c10.f());
        this.f13025m = -9223372036854775807L;
    }

    public static long f(G1.B b10) {
        return b10.h((b10.h(2) + 1) * 8);
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) throws D1.w {
        AbstractC0853a.i(this.f13018f);
        while (c10.a() > 0) {
            int i10 = this.f13021i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iL = c10.L();
                    if ((iL & 224) == 224) {
                        this.f13024l = iL;
                        this.f13021i = 2;
                    } else if (iL != 86) {
                        this.f13021i = 0;
                    }
                } else if (i10 == 2) {
                    int iL2 = ((this.f13024l & (-225)) << 8) | c10.L();
                    this.f13023k = iL2;
                    if (iL2 > this.f13016d.f().length) {
                        m(this.f13023k);
                    }
                    this.f13022j = 0;
                    this.f13021i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(c10.a(), this.f13023k - this.f13022j);
                    c10.q(this.f13017e.f4234a, this.f13022j, iMin);
                    int i11 = this.f13022j + iMin;
                    this.f13022j = i11;
                    if (i11 == this.f13023k) {
                        this.f13017e.p(0);
                        g(this.f13017e);
                        this.f13021i = 0;
                    }
                }
            } else if (c10.L() == 86) {
                this.f13021i = 1;
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f13021i = 0;
        this.f13025m = -9223372036854775807L;
        this.f13026n = false;
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f13018f = rVar.f(dVar.c(), 1);
        this.f13019g = dVar.b();
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f13025m = j10;
    }

    public final void g(G1.B b10) throws D1.w {
        if (!b10.g()) {
            this.f13026n = true;
            l(b10);
        } else if (!this.f13026n) {
            return;
        }
        if (this.f13027o != 0) {
            throw D1.w.a(null, null);
        }
        if (this.f13028p != 0) {
            throw D1.w.a(null, null);
        }
        k(b10, j(b10));
        if (this.f13030r) {
            b10.r((int) this.f13031s);
        }
    }

    public final int h(G1.B b10) throws D1.w {
        int iB = b10.b();
        AbstractC4321a.b bVarE = AbstractC4321a.e(b10, true);
        this.f13035w = bVarE.f36924c;
        this.f13032t = bVarE.f36922a;
        this.f13034v = bVarE.f36923b;
        return iB - b10.b();
    }

    public final void i(G1.B b10) {
        int iH = b10.h(3);
        this.f13029q = iH;
        if (iH == 0) {
            b10.r(8);
            return;
        }
        if (iH == 1) {
            b10.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            b10.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            b10.r(1);
        }
    }

    public final int j(G1.B b10) throws D1.w {
        int iH;
        if (this.f13029q != 0) {
            throw D1.w.a(null, null);
        }
        int i10 = 0;
        do {
            iH = b10.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    public final void k(G1.B b10, int i10) {
        int iE = b10.e();
        if ((iE & 7) == 0) {
            this.f13016d.a0(iE >> 3);
        } else {
            b10.i(this.f13016d.f(), 0, i10 * 8);
            this.f13016d.a0(0);
        }
        this.f13018f.b(this.f13016d, i10);
        AbstractC0853a.g(this.f13025m != -9223372036854775807L);
        this.f13018f.d(this.f13025m, 1, i10, 0, null);
        this.f13025m += this.f13033u;
    }

    public final void l(G1.B b10) throws D1.w {
        boolean zG;
        int iH = b10.h(1);
        int iH2 = iH == 1 ? b10.h(1) : 0;
        this.f13027o = iH2;
        if (iH2 != 0) {
            throw D1.w.a(null, null);
        }
        if (iH == 1) {
            f(b10);
        }
        if (!b10.g()) {
            throw D1.w.a(null, null);
        }
        this.f13028p = b10.h(6);
        int iH3 = b10.h(4);
        int iH4 = b10.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw D1.w.a(null, null);
        }
        if (iH == 0) {
            int iE = b10.e();
            int iH5 = h(b10);
            b10.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            b10.i(bArr, 0, iH5);
            D1.o oVarP = new o.b().j0(this.f13019g).W(this.f13015c).y0("audio/mp4a-latm").U(this.f13035w).T(this.f13034v).z0(this.f13032t).k0(Collections.singletonList(bArr)).n0(this.f13013a).w0(this.f13014b).P();
            if (!oVarP.equals(this.f13020h)) {
                this.f13020h = oVarP;
                this.f13033u = 1024000000 / ((long) oVarP.f1781H);
                this.f13018f.e(oVarP);
            }
        } else {
            b10.r(((int) f(b10)) - h(b10));
        }
        i(b10);
        boolean zG2 = b10.g();
        this.f13030r = zG2;
        this.f13031s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f13031s = f(b10);
            } else {
                do {
                    zG = b10.g();
                    this.f13031s = (this.f13031s << 8) + ((long) b10.h(8));
                } while (zG);
            }
        }
        if (b10.g()) {
            b10.r(8);
        }
    }

    public final void m(int i10) {
        this.f13016d.W(i10);
        this.f13017e.n(this.f13016d.f());
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
    }
}
