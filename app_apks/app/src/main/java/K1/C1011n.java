package K1;

import G1.AbstractC0853a;
import G1.InterfaceC0860h;

/* JADX INFO: renamed from: K1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1011n implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f7270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f7271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e1 f7272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G0 f7273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7274e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7275f;

    /* JADX INFO: renamed from: K1.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void onPlaybackParametersChanged(D1.y yVar);
    }

    public C1011n(a aVar, InterfaceC0860h interfaceC0860h) {
        this.f7271b = aVar;
        this.f7270a = new l1(interfaceC0860h);
    }

    @Override // K1.G0
    public long H() {
        return this.f7274e ? this.f7270a.H() : ((G0) AbstractC0853a.e(this.f7273d)).H();
    }

    public void a(e1 e1Var) {
        if (e1Var == this.f7272c) {
            this.f7273d = null;
            this.f7272c = null;
            this.f7274e = true;
        }
    }

    public void b(e1 e1Var) throws C1030x {
        G0 g02;
        G0 g0N = e1Var.N();
        if (g0N == null || g0N == (g02 = this.f7273d)) {
            return;
        }
        if (g02 != null) {
            throw C1030x.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f7273d = g0N;
        this.f7272c = e1Var;
        g0N.d(this.f7270a.e());
    }

    public void c(long j10) {
        this.f7270a.a(j10);
    }

    @Override // K1.G0
    public void d(D1.y yVar) {
        G0 g02 = this.f7273d;
        if (g02 != null) {
            g02.d(yVar);
            yVar = this.f7273d.e();
        }
        this.f7270a.d(yVar);
    }

    @Override // K1.G0
    public D1.y e() {
        G0 g02 = this.f7273d;
        return g02 != null ? g02.e() : this.f7270a.e();
    }

    public final boolean f(boolean z10) {
        e1 e1Var = this.f7272c;
        if (e1Var == null || e1Var.b()) {
            return true;
        }
        if (z10 && this.f7272c.getState() != 2) {
            return true;
        }
        if (this.f7272c.isReady()) {
            return false;
        }
        return z10 || this.f7272c.j();
    }

    public void g() {
        this.f7275f = true;
        this.f7270a.b();
    }

    public void h() {
        this.f7275f = false;
        this.f7270a.c();
    }

    public long i(boolean z10) {
        j(z10);
        return H();
    }

    public final void j(boolean z10) {
        if (f(z10)) {
            this.f7274e = true;
            if (this.f7275f) {
                this.f7270a.b();
                return;
            }
            return;
        }
        G0 g02 = (G0) AbstractC0853a.e(this.f7273d);
        long jH = g02.H();
        if (this.f7274e) {
            if (jH < this.f7270a.H()) {
                this.f7270a.c();
                return;
            } else {
                this.f7274e = false;
                if (this.f7275f) {
                    this.f7270a.b();
                }
            }
        }
        this.f7270a.a(jH);
        D1.y yVarE = g02.e();
        if (yVarE.equals(this.f7270a.e())) {
            return;
        }
        this.f7270a.d(yVarE);
        this.f7271b.onPlaybackParametersChanged(yVarE);
    }

    @Override // K1.G0
    public boolean v() {
        return this.f7274e ? this.f7270a.v() : ((G0) AbstractC0853a.e(this.f7273d)).v();
    }
}
