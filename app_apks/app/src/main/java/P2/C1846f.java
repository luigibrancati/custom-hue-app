package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import i2.AbstractC4323c;

/* JADX INFO: renamed from: P2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1846f implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.B f12799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.C f12800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i2.O f12805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public D1.o f12811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f12813o;

    public C1846f(String str) {
        this(null, 0, str);
    }

    private boolean f(G1.C c10, byte[] bArr, int i10) {
        int iMin = Math.min(c10.a(), i10 - this.f12807i);
        c10.q(bArr, this.f12807i, iMin);
        int i11 = this.f12807i + iMin;
        this.f12807i = i11;
        return i11 == i10;
    }

    private void g() {
        this.f12799a.p(0);
        AbstractC4323c.C0483c c0483cG = AbstractC4323c.g(this.f12799a);
        D1.o oVar = this.f12811m;
        if (oVar == null || c0483cG.f36948c != oVar.f1780G || c0483cG.f36947b != oVar.f1781H || !"audio/ac4".equals(oVar.f1805o)) {
            D1.o oVarP = new o.b().j0(this.f12804f).W(this.f12803e).y0("audio/ac4").T(c0483cG.f36948c).z0(c0483cG.f36947b).n0(this.f12801c).w0(this.f12802d).P();
            this.f12811m = oVarP;
            this.f12805g.e(oVarP);
        }
        this.f12812n = c0483cG.f36949d;
        this.f12810l = (((long) c0483cG.f36950e) * 1000000) / ((long) this.f12811m.f1781H);
    }

    private boolean h(G1.C c10) {
        int iL;
        while (true) {
            if (c10.a() <= 0) {
                return false;
            }
            if (this.f12808j) {
                iL = c10.L();
                this.f12808j = iL == 172;
                if (iL == 64 || iL == 65) {
                    break;
                }
            } else {
                this.f12808j = c10.L() == 172;
            }
        }
        this.f12809k = iL == 65;
        return true;
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        AbstractC0853a.i(this.f12805g);
        while (c10.a() > 0) {
            int i10 = this.f12806h;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(c10.a(), this.f12812n - this.f12807i);
                        this.f12805g.b(c10, iMin);
                        int i11 = this.f12807i + iMin;
                        this.f12807i = i11;
                        if (i11 == this.f12812n) {
                            AbstractC0853a.g(this.f12813o != -9223372036854775807L);
                            this.f12805g.d(this.f12813o, 1, this.f12812n, 0, null);
                            this.f12813o += this.f12810l;
                            this.f12806h = 0;
                        }
                    }
                } else if (f(c10, this.f12800b.f(), 16)) {
                    g();
                    this.f12800b.a0(0);
                    this.f12805g.b(this.f12800b, 16);
                    this.f12806h = 2;
                }
            } else if (h(c10)) {
                this.f12806h = 1;
                this.f12800b.f()[0] = -84;
                this.f12800b.f()[1] = (byte) (this.f12809k ? 65 : 64);
                this.f12807i = 2;
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f12806h = 0;
        this.f12807i = 0;
        this.f12808j = false;
        this.f12809k = false;
        this.f12813o = -9223372036854775807L;
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12804f = dVar.b();
        this.f12805g = rVar.f(dVar.c(), 1);
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12813o = j10;
    }

    public C1846f(String str, int i10, String str2) {
        G1.B b10 = new G1.B(new byte[16]);
        this.f12799a = b10;
        this.f12800b = new G1.C(b10.f4234a);
        this.f12806h = 0;
        this.f12807i = 0;
        this.f12808j = false;
        this.f12809k = false;
        this.f12813o = -9223372036854775807L;
        this.f12801c = str;
        this.f12802d = i10;
        this.f12803e = str2;
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
    }
}
