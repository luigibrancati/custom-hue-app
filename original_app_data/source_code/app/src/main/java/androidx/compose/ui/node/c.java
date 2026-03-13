package androidx.compose.ui.node;

import androidx.compose.ui.node.b;
import v0.InterfaceC6027b;
import z0.C6487a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22105a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22115k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b.e f22106b = b.e.Idle;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f22116l = new g(this);

    public c(b bVar) {
        this.f22105a = bVar;
    }

    public final void A(int i10) {
        this.f22109e = i10;
    }

    public final InterfaceC6027b a() {
        return this.f22116l;
    }

    public final int b() {
        return this.f22112h;
    }

    public final boolean c() {
        return this.f22111g;
    }

    public final boolean d() {
        return this.f22110f;
    }

    public final int e() {
        return this.f22116l.v();
    }

    public final C6487a f() {
        return this.f22116l.N();
    }

    public final b g() {
        return this.f22105a;
    }

    public final boolean h() {
        return this.f22116l.Q();
    }

    public final b.e i() {
        return this.f22106b;
    }

    public final InterfaceC6027b j() {
        return null;
    }

    public final boolean k() {
        return this.f22108d;
    }

    public final boolean l() {
        return this.f22107c;
    }

    public final f m() {
        return null;
    }

    public final g n() {
        return this.f22116l;
    }

    public final boolean o() {
        return this.f22116l.T();
    }

    public final int p() {
        return this.f22109e;
    }

    public final NodeCoordinator q() {
        return this.f22105a.F().e();
    }

    public final int r() {
        return this.f22116l.y();
    }

    public final void s() {
        this.f22116l.g0(true);
    }

    public final void t() {
        b.e eVarT = this.f22105a.t();
        if (eVarT == b.e.LayingOut || eVarT == b.e.LookaheadLayingOut) {
            if (this.f22116l.O()) {
                x(true);
            } else {
                w(true);
            }
        }
        if (eVarT == b.e.LookaheadLayingOut) {
            z(true);
        }
    }

    public final void u(int i10) {
        int i11 = this.f22112h;
        this.f22112h = i10;
        if ((i11 == 0) != (i10 == 0)) {
            b bVarI = this.f22105a.I();
            c cVarQ = bVarI != null ? bVarI.q() : null;
            if (cVarQ != null) {
                if (i10 == 0) {
                    cVarQ.u(cVarQ.f22112h - 1);
                } else {
                    cVarQ.u(cVarQ.f22112h + 1);
                }
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.f22115k;
        this.f22115k = i10;
        if ((i11 == 0) != (i10 == 0)) {
            b bVarI = this.f22105a.I();
            c cVarQ = bVarI != null ? bVarI.q() : null;
            if (cVarQ != null) {
                if (i10 == 0) {
                    cVarQ.v(cVarQ.f22115k - 1);
                } else {
                    cVarQ.v(cVarQ.f22115k + 1);
                }
            }
        }
    }

    public final void w(boolean z10) {
        if (this.f22111g != z10) {
            this.f22111g = z10;
            if (z10 && !this.f22110f) {
                u(this.f22112h + 1);
            } else {
                if (z10 || this.f22110f) {
                    return;
                }
                u(this.f22112h - 1);
            }
        }
    }

    public final void x(boolean z10) {
        if (this.f22110f != z10) {
            this.f22110f = z10;
            if (z10 && !this.f22111g) {
                u(this.f22112h + 1);
            } else {
                if (z10 || this.f22111g) {
                    return;
                }
                u(this.f22112h - 1);
            }
        }
    }

    public final void y(b.e eVar) {
        this.f22106b = eVar;
    }

    public final void z(boolean z10) {
        if (this.f22114j != z10) {
            this.f22114j = z10;
            if (z10 && !this.f22113i) {
                v(this.f22115k + 1);
            } else {
                if (z10 || this.f22113i) {
                    return;
                }
                v(this.f22115k - 1);
            }
        }
    }
}
