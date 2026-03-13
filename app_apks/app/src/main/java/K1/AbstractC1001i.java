package K1;

import G1.AbstractC0853a;
import G1.InterfaceC0860h;
import K1.f1;
import a2.InterfaceC2611D;
import java.util.Objects;

/* JADX INFO: renamed from: K1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1001i implements e1, f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7077b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g1 f7079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L1.B0 f7081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0860h f7082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a2.c0 f7084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D1.o[] f7085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7087l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7090o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC2611D.b f7092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f1.a f7093r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7076a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0 f7078c = new C0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f7088m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public D1.D f7091p = D1.D.f1441a;

    public AbstractC1001i(int i10) {
        this.f7077b = i10;
    }

    @Override // K1.e1
    public final boolean B() {
        return this.f7089n;
    }

    @Override // K1.f1
    public int K() {
        return 0;
    }

    @Override // K1.e1
    public final long L() {
        return this.f7088m;
    }

    @Override // K1.e1
    public final void M(long j10) {
        p0(j10, false);
    }

    @Override // K1.e1
    public G0 N() {
        return null;
    }

    @Override // K1.e1
    public final void O(D1.D d10) {
        if (Objects.equals(this.f7091p, d10)) {
            return;
        }
        this.f7091p = d10;
        n0(d10);
    }

    @Override // K1.e1
    public final void P(int i10, L1.B0 b02, InterfaceC0860h interfaceC0860h) {
        this.f7080e = i10;
        this.f7081f = b02;
        this.f7082g = interfaceC0860h;
        f0();
    }

    public final C1030x R(Throwable th, D1.o oVar, int i10) {
        return S(th, oVar, false, i10);
    }

    public final C1030x S(Throwable th, D1.o oVar, boolean z10, int i10) {
        int iQ;
        if (oVar == null || this.f7090o) {
            iQ = 4;
        } else {
            this.f7090o = true;
            try {
                iQ = f1.Q(a(oVar));
            } catch (C1030x unused) {
                iQ = 4;
            } finally {
                this.f7090o = false;
            }
        }
        return C1030x.b(th, getName(), W(), oVar, iQ, this.f7092q, z10, i10);
    }

    public final InterfaceC0860h T() {
        return (InterfaceC0860h) AbstractC0853a.e(this.f7082g);
    }

    public final g1 U() {
        return (g1) AbstractC0853a.e(this.f7079d);
    }

    public final C0 V() {
        this.f7078c.a();
        return this.f7078c;
    }

    public final int W() {
        return this.f7080e;
    }

    public final long X() {
        return this.f7087l;
    }

    public final L1.B0 Y() {
        return (L1.B0) AbstractC0853a.e(this.f7081f);
    }

    public final D1.o[] Z() {
        return (D1.o[]) AbstractC0853a.e(this.f7085j);
    }

    public final long a0() {
        return this.f7086k;
    }

    public final D1.D b0() {
        return this.f7091p;
    }

    @Override // K1.e1
    public final void c() {
        AbstractC0853a.g(this.f7083h == 1);
        this.f7078c.a();
        this.f7083h = 0;
        this.f7084i = null;
        this.f7085j = null;
        this.f7089n = false;
        d0();
        this.f7092q = null;
    }

    public final boolean c0() {
        return j() ? this.f7089n : ((a2.c0) AbstractC0853a.e(this.f7084i)).isReady();
    }

    public abstract void d0();

    @Override // K1.e1, K1.f1
    public final int f() {
        return this.f7077b;
    }

    public abstract void g0(long j10, boolean z10);

    @Override // K1.e1
    public final int getState() {
        return this.f7083h;
    }

    @Override // K1.e1
    public final a2.c0 h() {
        return this.f7084i;
    }

    @Override // K1.f1
    public final void i() {
        synchronized (this.f7076a) {
            this.f7093r = null;
        }
    }

    public final void i0() {
        f1.a aVar;
        synchronized (this.f7076a) {
            aVar = this.f7093r;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // K1.e1
    public final boolean j() {
        return this.f7088m == Long.MIN_VALUE;
    }

    @Override // K1.e1
    public final void n() {
        this.f7089n = true;
    }

    public final int o0(C0 c02, J1.f fVar, int i10) {
        int iF = ((a2.c0) AbstractC0853a.e(this.f7084i)).f(c02, fVar, i10);
        if (iF != -4) {
            if (iF == -5) {
                D1.o oVar = (D1.o) AbstractC0853a.e(c02.f6835b);
                if (oVar.f1810t != Long.MAX_VALUE) {
                    c02.f6835b = oVar.b().C0(oVar.f1810t + this.f7086k).P();
                }
            }
            return iF;
        }
        if (fVar.w()) {
            this.f7088m = Long.MIN_VALUE;
            return this.f7089n ? -4 : -3;
        }
        long j10 = fVar.f5880f + this.f7086k;
        fVar.f5880f = j10;
        this.f7088m = Math.max(this.f7088m, j10);
        return iF;
    }

    public final void p0(long j10, boolean z10) {
        this.f7089n = false;
        this.f7087l = j10;
        this.f7088m = j10;
        g0(j10, z10);
    }

    public int q0(long j10) {
        return ((a2.c0) AbstractC0853a.e(this.f7084i)).n(j10 - this.f7086k);
    }

    @Override // K1.e1
    public final void r(g1 g1Var, D1.o[] oVarArr, a2.c0 c0Var, long j10, boolean z10, boolean z11, long j11, long j12, InterfaceC2611D.b bVar) {
        AbstractC0853a.g(this.f7083h == 0);
        this.f7079d = g1Var;
        this.f7092q = bVar;
        this.f7083h = 1;
        e0(z10, z11);
        t(oVarArr, c0Var, j11, j12, bVar);
        p0(j11, z10);
    }

    @Override // K1.e1
    public final void release() {
        AbstractC0853a.g(this.f7083h == 0);
        h0();
    }

    @Override // K1.e1
    public final void reset() {
        AbstractC0853a.g(this.f7083h == 0);
        this.f7078c.a();
        j0();
    }

    @Override // K1.e1
    public final void start() {
        AbstractC0853a.g(this.f7083h == 1);
        this.f7083h = 2;
        k0();
    }

    @Override // K1.e1
    public final void stop() {
        AbstractC0853a.g(this.f7083h == 2);
        this.f7083h = 1;
        l0();
    }

    @Override // K1.e1
    public final void t(D1.o[] oVarArr, a2.c0 c0Var, long j10, long j11, InterfaceC2611D.b bVar) {
        AbstractC0853a.g(!this.f7089n);
        this.f7084i = c0Var;
        this.f7092q = bVar;
        if (this.f7088m == Long.MIN_VALUE) {
            this.f7088m = j10;
        }
        this.f7085j = oVarArr;
        this.f7086k = j11;
        m0(oVarArr, j10, j11, bVar);
    }

    @Override // K1.f1
    public final void x(f1.a aVar) {
        synchronized (this.f7076a) {
            this.f7093r = aVar;
        }
    }

    @Override // K1.e1
    public final void y() {
        ((a2.c0) AbstractC0853a.e(this.f7084i)).a();
    }

    @Override // K1.e1
    public final f1 G() {
        return this;
    }

    public void f0() {
    }

    public void h0() {
    }

    public void j0() {
    }

    public void k0() {
    }

    public void l0() {
    }

    public void n0(D1.D d10) {
    }

    public void e0(boolean z10, boolean z11) {
    }

    @Override // K1.c1.b
    public void w(int i10, Object obj) {
    }

    public void m0(D1.o[] oVarArr, long j10, long j11, InterfaceC2611D.b bVar) {
    }
}
