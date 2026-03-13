package androidx.compose.ui.node;

import androidx.compose.ui.node.b;
import e0.C3921a;
import fc.C4015H;
import fc.C4025h;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import r0.AbstractC5523a;
import t0.AbstractC5826a;
import u0.AbstractC5905n;
import u0.InterfaceC5900i;
import v0.AbstractC6026a;
import v0.C6033h;
import v0.InterfaceC6027b;
import v0.j;
import v0.l;
import vc.InterfaceC6082a;
import z0.AbstractC6488b;
import z0.AbstractC6493g;
import z0.C6487a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC5905n implements InterfaceC5900i, InterfaceC6027b, l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f22137A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final InterfaceC6082a f22138B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final InterfaceC6082a f22139C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f22140D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f22141E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public vc.l f22142F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f22143G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f22144H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final InterfaceC6082a f22145I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f22146J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f22147K;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.node.c f22148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22149g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22153k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22155m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22156n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public vc.l f22157o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f22158p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f22162t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22163u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22164v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC6026a f22165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C3921a f22166x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22167y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22168z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22150h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22151i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b.g f22154l = b.g.NotUsed;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: androidx.compose.ui.node.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0278a extends v implements vc.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0278a f22170a = new C0278a();

            public C0278a() {
                super(1);
            }

            public final void a(InterfaceC6027b interfaceC6027b) {
                interfaceC6027b.a().s(false);
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC6027b) obj);
                return C4015H.f34254a;
            }
        }

        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            g.this.L();
            g.this.g(C0278a.f22170a);
            if (g.this.m().U()) {
                List listH = g.this.P().h();
                int size = listH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.compose.ui.node.b) listH.get(i10)).G().Y(true);
                }
            }
            g.this.m().w0();
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m4invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m4invoke() {
            g.this.V().p(g.this.f22137A);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m5invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m5invoke() {
            AbstractC5905n.a aVarO;
            NodeCoordinator nodeCoordinatorD0 = g.this.V().D0();
            if (nodeCoordinatorD0 == null || (aVarO = nodeCoordinatorD0.O()) == null) {
                j.b(g.this.P());
                throw null;
            }
            g gVar = g.this;
            vc.l lVar = gVar.f22142F;
            g.F(gVar);
            if (lVar == null) {
                aVarO.c(gVar.V(), gVar.f22143G, gVar.f22144H);
            } else {
                aVarO.d(gVar.V(), gVar.f22143G, gVar.f22144H, lVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22173a = new d();

        public d() {
            super(1);
        }

        public final void a(InterfaceC6027b interfaceC6027b) {
            interfaceC6027b.a().t(false);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6027b) obj);
            return C4015H.f34254a;
        }
    }

    public g(androidx.compose.ui.node.c cVar) {
        this.f22148f = cVar;
        AbstractC6493g.a aVar = AbstractC6493g.f48683a;
        this.f22156n = aVar.b();
        this.f22159q = true;
        this.f22165w = new C6033h(this);
        this.f22166x = new C3921a(new g[16], 0);
        this.f22167y = true;
        this.f22137A = AbstractC6488b.b(0, 0, 0, 0, 15, null);
        this.f22138B = new b();
        this.f22139C = new a();
        this.f22143G = aVar.b();
        this.f22145I = new c();
    }

    public static final /* synthetic */ AbstractC5523a F(g gVar) {
        gVar.getClass();
        return null;
    }

    private final void e0(long j10, float f10, vc.l lVar, AbstractC5523a abstractC5523a) {
        androidx.compose.ui.node.b bVarP = P();
        try {
            this.f22161s = true;
            if (!AbstractC6493g.d(j10, this.f22156n) || this.f22146J) {
                if (this.f22148f.c() || this.f22148f.d() || this.f22146J) {
                    this.f22163u = true;
                    this.f22146J = false;
                }
                a0();
            }
            S();
            S();
            S();
            d0(j10, f10, lVar, abstractC5523a);
            C4015H c4015h = C4015H.f34254a;
        } catch (Throwable th) {
            bVarP.i0(th);
            throw new C4025h();
        }
    }

    @Override // u0.AbstractC5905n
    public void A(long j10, float f10, vc.l lVar) {
        e0(j10, f10, lVar, null);
    }

    public final void L() {
        this.f22148f.A(0);
        C3921a c3921aP = P().P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            g gVarZ = ((androidx.compose.ui.node.b) objArr[i10]).z();
            gVarZ.f22150h = gVarZ.n();
            gVarZ.f22151i = Integer.MAX_VALUE;
            gVarZ.f22161s = false;
            if (gVarZ.f22154l == b.g.InLayoutBlock) {
                gVarZ.f22154l = b.g.NotUsed;
            }
        }
    }

    public final List M() {
        P().k0();
        if (!this.f22167y) {
            return this.f22166x.j();
        }
        androidx.compose.ui.node.b bVarP = P();
        C3921a c3921a = this.f22166x;
        C3921a c3921aP = bVarP.P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            androidx.compose.ui.node.b bVar = (androidx.compose.ui.node.b) objArr[i10];
            if (c3921a.o() <= i10) {
                c3921a.d(bVar.q().n());
            } else {
                c3921a.y(i10, bVar.q().n());
            }
        }
        c3921a.v(bVarP.h().size(), c3921a.o());
        this.f22167y = false;
        return this.f22166x.j();
    }

    public final C6487a N() {
        if (this.f22152j) {
            return C6487a.a(x());
        }
        return null;
    }

    public final boolean O() {
        return this.f22168z;
    }

    public final androidx.compose.ui.node.b P() {
        return this.f22148f.g();
    }

    public final boolean Q() {
        return this.f22163u;
    }

    public final b.e R() {
        return this.f22148f.i();
    }

    public final f S() {
        this.f22148f.m();
        return null;
    }

    public final boolean T() {
        return this.f22162t;
    }

    public final b.g U() {
        return this.f22154l;
    }

    public final NodeCoordinator V() {
        return this.f22148f.q();
    }

    public final float W() {
        return this.f22140D;
    }

    public final boolean X() {
        return this.f22160r;
    }

    public final void Y() {
        this.f22163u = true;
        this.f22164v = true;
    }

    public final void Z() {
        boolean z10 = this.f22160r;
        this.f22160r = true;
        androidx.compose.ui.node.b bVarP = P();
        if (!z10) {
            bVarP.o().Q0();
            j.b(bVarP);
            throw null;
        }
        NodeCoordinator nodeCoordinatorC0 = bVarP.o().C0();
        for (NodeCoordinator nodeCoordinatorG = bVarP.G(); !AbstractC4862t.a(nodeCoordinatorG, nodeCoordinatorC0) && nodeCoordinatorG != null; nodeCoordinatorG = nodeCoordinatorG.C0()) {
            if (nodeCoordinatorG.t0()) {
                nodeCoordinatorG.I0();
            }
        }
        C3921a c3921aP = bVarP.P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            androidx.compose.ui.node.b bVar = (androidx.compose.ui.node.b) objArr[i10];
            if (bVar.J() != Integer.MAX_VALUE) {
                bVar.z().Z();
                bVarP.g0(bVar);
            }
        }
    }

    @Override // v0.InterfaceC6027b
    public AbstractC6026a a() {
        return this.f22165w;
    }

    public final void a0() {
        if (this.f22148f.b() > 0) {
            C3921a c3921aP = P().P();
            Object[] objArr = c3921aP.f33521a;
            int iO = c3921aP.o();
            for (int i10 = 0; i10 < iO; i10++) {
                androidx.compose.ui.node.b bVar = (androidx.compose.ui.node.b) objArr[i10];
                androidx.compose.ui.node.c cVarQ = bVar.q();
                if ((cVarQ.d() || cVarQ.c()) && !cVarQ.h()) {
                    androidx.compose.ui.node.b.d0(bVar, false, 1, null);
                }
                cVarQ.n().a0();
            }
        }
    }

    @Override // v0.InterfaceC6027b
    public Map b() {
        if (!this.f22155m) {
            if (R() == b.e.Measuring) {
                a().r(true);
                if (a().g()) {
                    Y();
                }
            } else {
                a().q(true);
            }
        }
        NodeCoordinator nodeCoordinatorM = m();
        boolean zU = nodeCoordinatorM.U();
        nodeCoordinatorM.Y(true);
        i();
        nodeCoordinatorM.Y(zU);
        return a().h();
    }

    public final void b0() {
        C3921a c3921aP = P().P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            androidx.compose.ui.node.b bVar = (androidx.compose.ui.node.b) objArr[i10];
            if (bVar.A() && bVar.C() == b.g.InMeasureBlock && androidx.compose.ui.node.b.Y(bVar, null, 1, null)) {
                androidx.compose.ui.node.b.f0(P(), false, false, false, 7, null);
            }
        }
    }

    @Override // v0.InterfaceC6027b
    public InterfaceC6027b c() {
        androidx.compose.ui.node.c cVarQ;
        androidx.compose.ui.node.b bVarI = P().I();
        if (bVarI == null || (cVarQ = bVarI.q()) == null) {
            return null;
        }
        return cVarQ.a();
    }

    public final void c0() {
        this.f22141E = true;
        androidx.compose.ui.node.b bVarI = P().I();
        float fE0 = m().E0();
        androidx.compose.ui.node.b bVarP = P();
        NodeCoordinator nodeCoordinatorG = bVarP.G();
        if (nodeCoordinatorG != bVarP.o()) {
            AbstractC4862t.c(nodeCoordinatorG, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            android.support.v4.media.session.a.a(nodeCoordinatorG);
            throw null;
        }
        if (fE0 != this.f22140D) {
            this.f22140D = fE0;
            if (bVarI != null) {
                bVarI.V();
            }
            if (bVarI != null) {
                bVarI.Q();
            }
        }
        if (!m().U()) {
            boolean z10 = this.f22160r;
            if (!z10 || a().j()) {
                Z();
            }
            if (z10) {
                P().o().Q0();
            } else {
                if (bVarI != null) {
                    bVarI.Q();
                }
                if (this.f22149g && bVarI != null) {
                    androidx.compose.ui.node.b.d0(bVarI, false, 1, null);
                }
            }
        }
        if (bVarI == null) {
            this.f22151i = 0;
        } else if (!this.f22149g && bVarI.t() == b.e.LayingOut) {
            if (!(n() == Integer.MAX_VALUE)) {
                AbstractC5826a.b("Place was called on a node which was placed already");
            }
            this.f22151i = bVarI.q().p();
            androidx.compose.ui.node.c cVarQ = bVarI.q();
            cVarQ.A(cVarQ.p() + 1);
        }
        i();
    }

    public final void d0(long j10, float f10, vc.l lVar, AbstractC5523a abstractC5523a) {
        if (P().S()) {
            AbstractC5826a.a("place is called on a deactivated node");
        }
        h0(b.e.LayingOut);
        this.f22156n = j10;
        this.f22158p = f10;
        this.f22157o = lVar;
        this.f22141E = false;
        j.b(P());
        if (this.f22163u || !this.f22160r) {
            a().q(false);
            this.f22148f.w(false);
            this.f22142F = lVar;
            this.f22143G = j10;
            this.f22144H = f10;
            throw null;
        }
        V().T0(j10, f10, lVar, abstractC5523a);
        c0();
        h0(b.e.Idle);
        if (V().U() && (this.f22148f.c() || this.f22148f.d())) {
            requestLayout();
        }
        this.f22153k = true;
    }

    public final boolean f0(long j10) {
        androidx.compose.ui.node.b bVarP = P();
        try {
            if (P().S()) {
                AbstractC5826a.a("measure is called on a deactivated node");
            }
            j.b(P());
            androidx.compose.ui.node.b bVarI = P().I();
            boolean z10 = true;
            P().j0(P().f() || (bVarI != null && bVarI.f()));
            if (!P().A() && C6487a.d(x(), j10)) {
                Owner.b(null, P(), false, 2, null);
                P().h0();
                return false;
            }
            a().r(false);
            g(d.f22173a);
            this.f22152j = true;
            V().f();
            C(j10);
            if (R() != b.e.Idle) {
                z10 = false;
            }
            if (!z10) {
                AbstractC5826a.b("layout state is not idle before measure starts");
            }
            this.f22137A = j10;
            h0(b.e.Measuring);
            this.f22162t = false;
            j.b(P());
            throw null;
        } catch (Throwable th) {
            bVarP.i0(th);
            throw new C4025h();
        }
    }

    @Override // v0.InterfaceC6027b
    public void g(vc.l lVar) {
        C3921a c3921aP = P().P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            lVar.invoke(((androidx.compose.ui.node.b) objArr[i10]).q().a());
        }
    }

    public final void g0(boolean z10) {
        this.f22167y = z10;
    }

    @Override // v0.l
    public void h(boolean z10) {
        if (z10 != V().T()) {
            V().X(z10);
            this.f22146J = true;
        }
        j0(z10);
    }

    public final void h0(b.e eVar) {
        this.f22148f.y(eVar);
    }

    @Override // v0.InterfaceC6027b
    public void i() {
        this.f22168z = true;
        a().o();
        if (this.f22163u) {
            b0();
        }
        if (this.f22164v || !(this.f22155m || m().U() || !this.f22163u)) {
            this.f22163u = false;
            R();
            h0(b.e.LayingOut);
            this.f22148f.x(false);
            j.b(P());
            throw null;
        }
        if (a().l()) {
            a().p(true);
        }
        if (a().g() && a().k()) {
            a().n();
        }
        this.f22168z = false;
    }

    public final void i0(b.g gVar) {
        this.f22154l = gVar;
    }

    public void j0(boolean z10) {
        this.f22147K = z10;
    }

    @Override // v0.InterfaceC6027b
    public NodeCoordinator m() {
        return P().o();
    }

    @Override // v0.InterfaceC6027b
    public int n() {
        return this.f22151i;
    }

    @Override // v0.InterfaceC6027b
    public void r() {
        androidx.compose.ui.node.b.f0(P(), false, false, false, 7, null);
    }

    @Override // v0.InterfaceC6027b
    public void requestLayout() {
        androidx.compose.ui.node.b.d0(P(), false, 1, null);
    }
}
