package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import i2.AbstractC4335o;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: P2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1851k implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.C f12853a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i2.O f12859g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public D1.o f12864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12866n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12860h = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f12869q = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f12854b = new AtomicInteger();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12867o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12868p = -1;

    public C1851k(String str, int i10, int i11, String str2) {
        this.f12853a = new G1.C(new byte[i11]);
        this.f12855c = str;
        this.f12856d = i10;
        this.f12857e = str2;
    }

    private boolean f(G1.C c10, byte[] bArr, int i10) {
        int iMin = Math.min(c10.a(), i10 - this.f12861i);
        c10.q(bArr, this.f12861i, iMin);
        int i11 = this.f12861i + iMin;
        this.f12861i = i11;
        return i11 == i10;
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) throws D1.w {
        AbstractC0853a.i(this.f12859g);
        while (c10.a() > 0) {
            switch (this.f12860h) {
                case 0:
                    if (j(c10)) {
                        int i10 = this.f12866n;
                        if (i10 == 3 || i10 == 4) {
                            this.f12860h = 4;
                        } else if (i10 != 1) {
                            this.f12860h = 2;
                        } else {
                            this.f12860h = 1;
                        }
                    }
                    break;
                case 1:
                    if (f(c10, this.f12853a.f(), 18)) {
                        g();
                        this.f12853a.a0(0);
                        this.f12859g.b(this.f12853a, 18);
                        this.f12860h = 6;
                    }
                    break;
                case 2:
                    if (f(c10, this.f12853a.f(), 7)) {
                        this.f12867o = AbstractC4335o.j(this.f12853a.f());
                        this.f12860h = 3;
                    }
                    break;
                case 3:
                    if (f(c10, this.f12853a.f(), this.f12867o)) {
                        h();
                        this.f12853a.a0(0);
                        this.f12859g.b(this.f12853a, this.f12867o);
                        this.f12860h = 6;
                    }
                    break;
                case 4:
                    if (f(c10, this.f12853a.f(), 6)) {
                        int iL = AbstractC4335o.l(this.f12853a.f());
                        this.f12868p = iL;
                        int i11 = this.f12861i;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f12861i = i11 - i12;
                            c10.a0(c10.g() - i12);
                        }
                        this.f12860h = 5;
                    }
                    break;
                case 5:
                    if (f(c10, this.f12853a.f(), this.f12868p)) {
                        i();
                        this.f12853a.a0(0);
                        this.f12859g.b(this.f12853a, this.f12868p);
                        this.f12860h = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c10.a(), this.f12865m - this.f12861i);
                    this.f12859g.b(c10, iMin);
                    int i13 = this.f12861i + iMin;
                    this.f12861i = i13;
                    if (i13 == this.f12865m) {
                        AbstractC0853a.g(this.f12869q != -9223372036854775807L);
                        this.f12859g.d(this.f12869q, this.f12866n == 4 ? 0 : 1, this.f12865m, 0, null);
                        this.f12869q += this.f12863k;
                        this.f12860h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f12860h = 0;
        this.f12861i = 0;
        this.f12862j = 0;
        this.f12869q = -9223372036854775807L;
        this.f12854b.set(0);
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12858f = dVar.b();
        this.f12859g = rVar.f(dVar.c(), 1);
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12869q = j10;
    }

    public final void g() {
        byte[] bArrF = this.f12853a.f();
        if (this.f12864l == null) {
            D1.o oVarH = AbstractC4335o.h(bArrF, this.f12858f, this.f12855c, this.f12856d, this.f12857e, null);
            this.f12864l = oVarH;
            this.f12859g.e(oVarH);
        }
        this.f12865m = AbstractC4335o.b(bArrF);
        this.f12863k = N7.g.e(G1.M.Z0(AbstractC4335o.g(bArrF), this.f12864l.f1781H));
    }

    public final void h() throws D1.w {
        AbstractC4335o.b bVarI = AbstractC4335o.i(this.f12853a.f());
        k(bVarI);
        this.f12865m = bVarI.f37043d;
        long j10 = bVarI.f37044e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f12863k = j10;
    }

    public final void i() throws D1.w {
        AbstractC4335o.b bVarK = AbstractC4335o.k(this.f12853a.f(), this.f12854b);
        if (this.f12866n == 3) {
            k(bVarK);
        }
        this.f12865m = bVarK.f37043d;
        long j10 = bVarK.f37044e;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        this.f12863k = j10;
    }

    public final boolean j(G1.C c10) {
        while (c10.a() > 0) {
            int i10 = this.f12862j << 8;
            this.f12862j = i10;
            int iL = i10 | c10.L();
            this.f12862j = iL;
            int iC = AbstractC4335o.c(iL);
            this.f12866n = iC;
            if (iC != 0) {
                byte[] bArrF = this.f12853a.f();
                int i11 = this.f12862j;
                bArrF[0] = (byte) ((i11 >> 24) & 255);
                bArrF[1] = (byte) ((i11 >> 16) & 255);
                bArrF[2] = (byte) ((i11 >> 8) & 255);
                bArrF[3] = (byte) (i11 & 255);
                this.f12861i = 4;
                this.f12862j = 0;
                return true;
            }
        }
        return false;
    }

    public final void k(AbstractC4335o.b bVar) {
        int i10;
        int i11 = bVar.f37041b;
        if (i11 == -2147483647 || (i10 = bVar.f37042c) == -1) {
            return;
        }
        D1.o oVar = this.f12864l;
        if (oVar != null && i10 == oVar.f1780G && i11 == oVar.f1781H && Objects.equals(bVar.f37040a, oVar.f1805o)) {
            return;
        }
        D1.o oVar2 = this.f12864l;
        D1.o oVarP = (oVar2 == null ? new o.b() : oVar2.b()).j0(this.f12858f).W(this.f12857e).y0(bVar.f37040a).T(bVar.f37042c).z0(bVar.f37041b).n0(this.f12855c).w0(this.f12856d).P();
        this.f12864l = oVarP;
        this.f12859g.e(oVarP);
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
    }
}
