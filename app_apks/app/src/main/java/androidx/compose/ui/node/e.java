package androidx.compose.ui.node;

import b0.AbstractC2774E;
import b0.C2770A;
import fc.C4025h;
import kotlin.jvm.internal.AbstractC4862t;
import t0.AbstractC5826a;
import u0.C5898g;
import u0.InterfaceC5895d;
import u0.InterfaceC5900i;
import u0.InterfaceC5902k;
import v0.InterfaceC6027b;
import vc.l;
import z0.AbstractC6493g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends d implements InterfaceC5900i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final NodeCoordinator f22133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f22134r = AbstractC6493g.f48683a.b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C5898g f22135s = new C5898g(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C2770A f22136t = AbstractC2774E.a();

    public e(NodeCoordinator nodeCoordinator) {
        this.f22133q = nodeCoordinator;
    }

    @Override // u0.AbstractC5905n
    public final void A(long j10, float f10, l lVar) {
        h0(j10);
        if (V()) {
            return;
        }
        g0();
    }

    @Override // androidx.compose.ui.node.d
    public InterfaceC5895d K() {
        return this.f22135s;
    }

    @Override // androidx.compose.ui.node.d
    public boolean L() {
        return false;
    }

    @Override // androidx.compose.ui.node.d
    public b M() {
        return this.f22133q.M();
    }

    @Override // androidx.compose.ui.node.d
    public d N() {
        NodeCoordinator nodeCoordinatorD0 = this.f22133q.D0();
        if (nodeCoordinatorD0 != null) {
            return nodeCoordinatorD0.v0();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.d
    public boolean S() {
        return true;
    }

    public InterfaceC6027b Z() {
        InterfaceC6027b interfaceC6027bJ = this.f22133q.M().q().j();
        AbstractC4862t.b(interfaceC6027bJ);
        return interfaceC6027bJ;
    }

    public final C2770A a0() {
        return this.f22136t;
    }

    public final long b0() {
        return x();
    }

    public final NodeCoordinator c0() {
        return this.f22133q;
    }

    public final C5898g d0() {
        return this.f22135s;
    }

    public InterfaceC5902k e0() {
        AbstractC5826a.c("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new C4025h();
    }

    public long f0() {
        return this.f22134r;
    }

    public abstract void g0();

    public final void h0(long j10) {
        if (!AbstractC6493g.d(f0(), j10)) {
            j0(j10);
            M().q().m();
            Q(this.f22133q);
        }
        if (U()) {
            return;
        }
        e0();
        H(null);
    }

    public final long i0(e eVar, boolean z10) {
        long jB = AbstractC6493g.f48683a.b();
        while (!AbstractC4862t.a(this, eVar)) {
            if (!this.T() || !z10) {
                jB = AbstractC6493g.h(jB, this.f0());
            }
            NodeCoordinator nodeCoordinatorD0 = this.f22133q.D0();
            AbstractC4862t.b(nodeCoordinatorD0);
            this = nodeCoordinatorD0.v0();
            AbstractC4862t.b(this);
        }
        return jB;
    }

    public void j0(long j10) {
        this.f22134r = j10;
    }
}
