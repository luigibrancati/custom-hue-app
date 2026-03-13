package androidx.compose.ui.node;

import b0.C2770A;
import e0.C3921a;
import fc.C4015H;
import fc.C4025h;
import io.flutter.embedding.android.KeyboardMap;
import j0.e;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import l0.AbstractC4868d;
import l0.C4867c;
import l0.InterfaceC4869e;
import n0.AbstractC5065c;
import n0.AbstractC5066d;
import n0.C5064b;
import n0.C5068f;
import o0.InterfaceC5187d;
import o0.o;
import o0.p;
import o0.q;
import r0.AbstractC5523a;
import t0.AbstractC5826a;
import u0.C5898g;
import u0.InterfaceC5895d;
import u0.InterfaceC5900i;
import u0.InterfaceC5902k;
import v0.AbstractC6029d;
import v0.AbstractC6030e;
import v0.C6031f;
import v0.InterfaceC6027b;
import v0.j;
import v0.r;
import v0.s;
import vc.InterfaceC6082a;
import vc.l;
import z0.AbstractC6493g;
import z0.AbstractC6494h;
import z0.AbstractC6495i;
import z0.AbstractC6496j;
import z0.EnumC6497k;
import z0.InterfaceC6489c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class NodeCoordinator extends androidx.compose.ui.node.d implements InterfaceC5900i, InterfaceC5895d {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final e f22023I = new e(null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final l f22024J = d.f22050a;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final l f22025K = c.f22049a;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final p f22026L = new p();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final C6031f f22027M = new C6031f();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final float[] f22028N = o0.l.b(null, 1, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final f f22029O = new a();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final f f22030P = new b();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f22032B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C5064b f22033C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC5187d f22035E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public vc.p f22036F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f22038H;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.compose.ui.node.b f22039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f22040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NodeCoordinator f22042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public NodeCoordinator f22043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f22044v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2770A f22048z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC6489c f22045w = M().k();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EnumC6497k f22046x = M().r();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f22047y = 0.8f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f22031A = AbstractC6493g.f48683a.b();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public q f22034D = o.a();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final InterfaceC6082a f22037G = new i();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements f {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements f {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f22049a = new c();

        public c() {
            super(1);
        }

        public final void a(NodeCoordinator nodeCoordinator) {
            nodeCoordinator.u0();
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NodeCoordinator) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22050a = new d();

        public d() {
            super(1);
        }

        public final void a(NodeCoordinator nodeCoordinator) {
            androidx.compose.ui.node.b bVarM = nodeCoordinator.M();
            try {
                if (nodeCoordinator.K0()) {
                    NodeCoordinator.d1(nodeCoordinator, false, 1, null);
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                bVarM.i0(th);
                throw new C4025h();
            }
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((NodeCoordinator) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {
        public /* synthetic */ e(AbstractC4854k abstractC4854k) {
            this();
        }

        public e() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends v implements vc.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f22052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC6082a interfaceC6082a) {
            super(2);
            this.f22052b = interfaceC6082a;
        }

        public final void a(InterfaceC5187d interfaceC5187d, AbstractC5523a abstractC5523a) {
            if (!NodeCoordinator.this.M().T()) {
                NodeCoordinator.this.f22038H = true;
                return;
            }
            NodeCoordinator.this.f22035E = interfaceC5187d;
            NodeCoordinator.this.getClass();
            NodeCoordinator.d0(NodeCoordinator.this);
            l unused = NodeCoordinator.f22025K;
            s.a(null);
            throw null;
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            android.support.v4.media.session.a.a(obj2);
            a((InterfaceC5187d) obj, null);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends v implements InterfaceC6082a {
        public h() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            NodeCoordinator nodeCoordinator = NodeCoordinator.this;
            InterfaceC5187d interfaceC5187d = nodeCoordinator.f22035E;
            AbstractC4862t.b(interfaceC5187d);
            NodeCoordinator.b0(NodeCoordinator.this);
            nodeCoordinator.m0(interfaceC5187d, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends v implements InterfaceC6082a {
        public i() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            NodeCoordinator nodeCoordinatorD0 = NodeCoordinator.this.D0();
            if (nodeCoordinatorD0 != null) {
                nodeCoordinatorD0.I0();
            }
        }
    }

    public NodeCoordinator(androidx.compose.ui.node.b bVar) {
        this.f22039q = bVar;
    }

    public static /* synthetic */ void V0(NodeCoordinator nodeCoordinator, C5064b c5064b, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        nodeCoordinator.U0(c5064b, z10, z11);
    }

    public static /* synthetic */ long Z0(NodeCoordinator nodeCoordinator, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return nodeCoordinator.Y0(j10, z10);
    }

    public static final /* synthetic */ AbstractC5523a b0(NodeCoordinator nodeCoordinator) {
        nodeCoordinator.getClass();
        return null;
    }

    public static /* synthetic */ void b1(NodeCoordinator nodeCoordinator, l lVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        nodeCoordinator.a1(lVar, z10);
    }

    public static final /* synthetic */ s d0(NodeCoordinator nodeCoordinator) {
        nodeCoordinator.A0();
        return null;
    }

    public static /* synthetic */ void d1(NodeCoordinator nodeCoordinator, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        nodeCoordinator.c1(z10);
    }

    @Override // u0.AbstractC5905n
    public void A(long j10, float f10, l lVar) {
        if (!this.f22040r) {
            S0(j10, f10, lVar, null);
            return;
        }
        androidx.compose.ui.node.e eVarV0 = v0();
        AbstractC4862t.b(eVarV0);
        S0(eVarV0.f0(), f10, lVar, null);
    }

    public final s A0() {
        j.b(M());
        throw null;
    }

    public abstract InterfaceC4869e.c B0();

    public final NodeCoordinator C0() {
        return this.f22042t;
    }

    public final NodeCoordinator D0() {
        return this.f22043u;
    }

    public final float E0() {
        return this.f22032B;
    }

    public final boolean F0(int i10) {
        InterfaceC4869e.c cVarH0 = H0(v0.q.b(i10));
        return cVarH0 != null && AbstractC6029d.b(cVarH0, i10);
    }

    public final InterfaceC4869e.c G0(int i10) {
        boolean zB = v0.q.b(i10);
        InterfaceC4869e.c cVarB0 = B0();
        if (!zB && (cVarB0 = cVarB0.f()) == null) {
            return null;
        }
        for (InterfaceC4869e.c cVarH0 = H0(zB); cVarH0 != null && (cVarH0.b() & i10) != 0; cVarH0 = cVarH0.c()) {
            if ((cVarH0.e() & i10) != 0) {
                return cVarH0;
            }
            if (cVarH0 == cVarB0) {
                return null;
            }
        }
        return null;
    }

    public final InterfaceC4869e.c H0(boolean z10) {
        InterfaceC4869e.c cVarB0;
        if (M().G() == this) {
            return M().F().b();
        }
        if (!z10) {
            NodeCoordinator nodeCoordinator = this.f22043u;
            if (nodeCoordinator != null) {
                return nodeCoordinator.B0();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.f22043u;
        if (nodeCoordinator2 == null || (cVarB0 = nodeCoordinator2.B0()) == null) {
            return null;
        }
        return cVarB0.c();
    }

    public void I0() {
        NodeCoordinator nodeCoordinator = this.f22043u;
        if (nodeCoordinator != null) {
            nodeCoordinator.I0();
        }
    }

    public final boolean J0() {
        NodeCoordinator nodeCoordinator = this.f22043u;
        if (nodeCoordinator != null) {
            return nodeCoordinator.J0();
        }
        return false;
    }

    public boolean K0() {
        return false;
    }

    @Override // androidx.compose.ui.node.d
    public boolean L() {
        return false;
    }

    public long L0(InterfaceC5895d interfaceC5895d, long j10) {
        return k(interfaceC5895d, j10, true);
    }

    @Override // androidx.compose.ui.node.d
    public androidx.compose.ui.node.b M() {
        return this.f22039q;
    }

    public long M0(long j10) {
        if (!d()) {
            AbstractC5826a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        N0();
        long jZ0 = j10;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f22043u) {
            if (C4867c.f39815n) {
                androidx.compose.ui.node.b bVarM = nodeCoordinator.M();
                if (nodeCoordinator == bVarM.G() && !bVarM.m()) {
                    j.b(bVarM);
                    throw null;
                }
            }
            jZ0 = Z0(nodeCoordinator, jZ0, false, 2, null);
        }
        return jZ0;
    }

    @Override // androidx.compose.ui.node.d
    public androidx.compose.ui.node.d N() {
        return this.f22043u;
    }

    public final void N0() {
        M().q().t();
    }

    public void O0(int i10, int i11) {
        NodeCoordinator nodeCoordinator;
        if (M().T() && (nodeCoordinator = this.f22043u) != null) {
            nodeCoordinator.I0();
        }
        B(AbstractC6495i.b((((long) i11) & KeyboardMap.kValueMask) | (((long) i10) << 32)));
        if (this.f22044v != null) {
            c1(false);
        }
        int iA = v0.p.a(4);
        boolean zB = v0.q.b(iA);
        InterfaceC4869e.c cVarB0 = B0();
        if (zB || (cVarB0 = cVarB0.f()) != null) {
            for (InterfaceC4869e.c cVarH0 = H0(zB); cVarH0 != null && (cVarH0.b() & iA) != 0; cVarH0 = cVarH0.c()) {
                if ((cVarH0.e() & iA) != 0) {
                    InterfaceC4869e.c cVarC = cVarH0;
                    C3921a c3921a = null;
                    while (cVarC != null) {
                        if ((cVarC.e() & iA) != 0 && (cVarC instanceof AbstractC6030e)) {
                            int i12 = 0;
                            for (InterfaceC4869e.c cVarJ = ((AbstractC6030e) cVarC).j(); cVarJ != null; cVarJ = cVarJ.c()) {
                                if ((cVarJ.e() & iA) != 0) {
                                    i12++;
                                    if (i12 == 1) {
                                        cVarC = cVarJ;
                                    } else {
                                        if (c3921a == null) {
                                            c3921a = new C3921a(new InterfaceC4869e.c[16], 0);
                                        }
                                        if (cVarC != null) {
                                            c3921a.d(cVarC);
                                            cVarC = null;
                                        }
                                        c3921a.d(cVarJ);
                                    }
                                }
                            }
                            if (i12 == 1) {
                            }
                        }
                        cVarC = AbstractC6029d.c(c3921a);
                    }
                }
                if (cVarH0 == cVarB0) {
                    break;
                }
            }
        }
        M().H();
    }

    public final void P0() {
        InterfaceC4869e.c cVarF;
        if (F0(v0.p.a(128))) {
            e.a aVar = j0.e.f38868e;
            j0.e eVarA = aVar.a();
            l lVarC = eVarA != null ? eVarA.c() : null;
            j0.e eVarB = aVar.b(eVarA);
            try {
                int iA = v0.p.a(128);
                boolean zB = v0.q.b(iA);
                if (!zB) {
                    cVarF = B0().f();
                    if (cVarF == null) {
                    }
                    C4015H c4015h = C4015H.f34254a;
                    aVar.c(eVarA, eVarB, lVarC);
                }
                cVarF = B0();
                for (InterfaceC4869e.c cVarH0 = H0(zB); cVarH0 != null && (cVarH0.b() & iA) != 0; cVarH0 = cVarH0.c()) {
                    if ((cVarH0.e() & iA) != 0) {
                        InterfaceC4869e.c cVarC = cVarH0;
                        C3921a c3921a = null;
                        while (cVarC != null) {
                            if ((cVarC.e() & iA) != 0 && (cVarC instanceof AbstractC6030e)) {
                                int i10 = 0;
                                for (InterfaceC4869e.c cVarJ = ((AbstractC6030e) cVarC).j(); cVarJ != null; cVarJ = cVarJ.c()) {
                                    if ((cVarJ.e() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarC = cVarJ;
                                        } else {
                                            if (c3921a == null) {
                                                c3921a = new C3921a(new InterfaceC4869e.c[16], 0);
                                            }
                                            if (cVarC != null) {
                                                c3921a.d(cVarC);
                                                cVarC = null;
                                            }
                                            c3921a.d(cVarJ);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarC = AbstractC6029d.c(c3921a);
                        }
                    }
                    if (cVarH0 == cVarF) {
                        break;
                    }
                }
                C4015H c4015h2 = C4015H.f34254a;
                aVar.c(eVarA, eVarB, lVarC);
            } catch (Throwable th) {
                aVar.c(eVarA, eVarB, lVarC);
                throw th;
            }
        }
    }

    public final void Q0() {
        int iA = v0.p.a(4194304);
        boolean zB = v0.q.b(iA);
        InterfaceC4869e.c cVarB0 = B0();
        if (!zB && (cVarB0 = cVarB0.f()) == null) {
            return;
        }
        for (InterfaceC4869e.c cVarH0 = H0(zB); cVarH0 != null && (cVarH0.b() & iA) != 0; cVarH0 = cVarH0.c()) {
            if ((cVarH0.e() & iA) != 0) {
                InterfaceC4869e.c cVarC = cVarH0;
                C3921a c3921a = null;
                while (cVarC != null) {
                    if ((cVarC.e() & iA) != 0 && (cVarC instanceof AbstractC6030e)) {
                        int i10 = 0;
                        for (InterfaceC4869e.c cVarJ = ((AbstractC6030e) cVarC).j(); cVarJ != null; cVarJ = cVarJ.c()) {
                            if ((cVarJ.e() & iA) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    cVarC = cVarJ;
                                } else {
                                    if (c3921a == null) {
                                        c3921a = new C3921a(new InterfaceC4869e.c[16], 0);
                                    }
                                    if (cVarC != null) {
                                        c3921a.d(cVarC);
                                        cVarC = null;
                                    }
                                    c3921a.d(cVarJ);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    cVarC = AbstractC6029d.c(c3921a);
                }
            }
            if (cVarH0 == cVarB0) {
                return;
            }
        }
    }

    public abstract void R0(InterfaceC5187d interfaceC5187d, AbstractC5523a abstractC5523a);

    public final void S0(long j10, float f10, l lVar, AbstractC5523a abstractC5523a) {
        b1(this, lVar, false, 2, null);
        if (!AbstractC6493g.d(y0(), j10)) {
            j.b(M());
            AbstractC4868d.f39818a.a();
            throw null;
        }
        this.f22032B = f10;
        if (this == M().G()) {
            j.b(M());
            throw null;
        }
        if (U()) {
            return;
        }
        w0();
        H(null);
    }

    public final void T0(long j10, float f10, l lVar, AbstractC5523a abstractC5523a) {
        S0(AbstractC6493g.h(j10, u()), f10, lVar, abstractC5523a);
    }

    public final void U0(C5064b c5064b, boolean z10, boolean z11) {
        float fE = AbstractC6493g.e(y0());
        c5064b.g(c5064b.b() + fE);
        c5064b.h(c5064b.c() + fE);
        float f10 = AbstractC6493g.f(y0());
        c5064b.i(c5064b.d() + f10);
        c5064b.f(c5064b.a() + f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W0(u0.InterfaceC5902k r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L72
            int r0 = r3.getWidth()
            int r1 = r3.getHeight()
            r2.O0(r0, r1)
            b0.A r0 = r2.f22048z
            if (r0 == 0) goto L1a
            kotlin.jvm.internal.AbstractC4862t.b(r0)
            boolean r0 = r0.e()
            if (r0 != 0) goto L24
        L1a:
            java.util.Map r0 = r3.a()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L72
        L24:
            b0.A r0 = r2.f22048z
            java.util.Map r1 = r3.a()
            boolean r0 = v0.o.a(r0, r1)
            if (r0 != 0) goto L72
            v0.b r0 = r2.q0()
            v0.a r0 = r0.a()
            r0.m()
            b0.A r0 = r2.f22048z
            if (r0 != 0) goto L45
            b0.A r0 = b0.AbstractC2774E.a()
            r2.f22048z = r0
        L45:
            r0.g()
            java.util.Map r2 = r3.a()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L54:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L72
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.o(r1, r3)
            goto L54
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.W0(u0.k):void");
    }

    public final NodeCoordinator X0(InterfaceC5895d interfaceC5895d) {
        NodeCoordinator nodeCoordinatorA;
        C5898g c5898g = interfaceC5895d instanceof C5898g ? (C5898g) interfaceC5895d : null;
        if (c5898g != null && (nodeCoordinatorA = c5898g.a()) != null) {
            return nodeCoordinatorA;
        }
        AbstractC4862t.c(interfaceC5895d, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) interfaceC5895d;
    }

    public long Y0(long j10, boolean z10) {
        return (z10 || !T()) ? AbstractC6494h.b(j10, y0()) : j10;
    }

    public final void a1(l lVar, boolean z10) {
        androidx.compose.ui.node.b bVarM = M();
        if (!z10 && this.f22044v == lVar && AbstractC4862t.a(this.f22045w, bVarM.k())) {
            EnumC6497k enumC6497k = this.f22046x;
            bVarM.r();
        }
        this.f22045w = bVarM.k();
        this.f22046x = bVarM.r();
        if (!bVarM.R() || lVar == null) {
            this.f22044v = null;
            this.f22038H = false;
        } else {
            this.f22044v = lVar;
            j.b(bVarM);
            Owner.d(null, r0(), this.f22037G, null, 4, null);
            w();
            throw null;
        }
    }

    public final void c1(boolean z10) {
        if (this.f22044v == null) {
            return;
        }
        AbstractC5826a.b("null layer with a non-null layerBlock");
    }

    @Override // u0.InterfaceC5895d
    public boolean d() {
        return B0().g();
    }

    @Override // u0.InterfaceC5895d
    public final long f() {
        return w();
    }

    @Override // u0.InterfaceC5895d
    public C5068f j(InterfaceC5895d interfaceC5895d, boolean z10) {
        if (!d()) {
            AbstractC5826a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC5895d.d()) {
            AbstractC5826a.b("LayoutCoordinates " + interfaceC5895d + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorX0 = X0(interfaceC5895d);
        nodeCoordinatorX0.N0();
        NodeCoordinator nodeCoordinatorN0 = n0(nodeCoordinatorX0);
        C5064b c5064bZ0 = z0();
        c5064bZ0.g(0.0f);
        c5064bZ0.i(0.0f);
        c5064bZ0.h((int) (interfaceC5895d.f() >> 32));
        c5064bZ0.f((int) (interfaceC5895d.f() & KeyboardMap.kValueMask));
        NodeCoordinator nodeCoordinator = nodeCoordinatorX0;
        while (nodeCoordinator != nodeCoordinatorN0) {
            boolean z11 = z10;
            V0(nodeCoordinator, c5064bZ0, z11, false, 4, null);
            if (c5064bZ0.e()) {
                return C5068f.f40484e.a();
            }
            nodeCoordinator = nodeCoordinator.f22043u;
            AbstractC4862t.b(nodeCoordinator);
            z10 = z11;
        }
        j0(nodeCoordinatorN0, c5064bZ0, z10);
        return AbstractC5065c.a(c5064bZ0);
    }

    public final void j0(NodeCoordinator nodeCoordinator, C5064b c5064b, boolean z10) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.f22043u;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.j0(nodeCoordinator, c5064b, z10);
        }
        p0(c5064b, z10);
    }

    @Override // u0.InterfaceC5895d
    public long k(InterfaceC5895d interfaceC5895d, long j10, boolean z10) {
        if (interfaceC5895d instanceof C5898g) {
            C5898g c5898g = (C5898g) interfaceC5895d;
            c5898g.a().N0();
            return AbstractC5066d.b(c5898g.k(this, AbstractC5066d.b(j10 ^ (-9223372034707292160L)), z10) ^ (-9223372034707292160L));
        }
        NodeCoordinator nodeCoordinatorX0 = X0(interfaceC5895d);
        nodeCoordinatorX0.N0();
        NodeCoordinator nodeCoordinatorN0 = n0(nodeCoordinatorX0);
        while (nodeCoordinatorX0 != nodeCoordinatorN0) {
            j10 = nodeCoordinatorX0.Y0(j10, z10);
            nodeCoordinatorX0 = nodeCoordinatorX0.f22043u;
            AbstractC4862t.b(nodeCoordinatorX0);
        }
        return k0(nodeCoordinatorN0, j10, z10);
    }

    public final long k0(NodeCoordinator nodeCoordinator, long j10, boolean z10) {
        if (nodeCoordinator == this) {
            return j10;
        }
        NodeCoordinator nodeCoordinator2 = this.f22043u;
        return (nodeCoordinator2 == null || AbstractC4862t.a(nodeCoordinator, nodeCoordinator2)) ? o0(j10, z10) : o0(nodeCoordinator2.k0(nodeCoordinator, j10, z10), z10);
    }

    @Override // u0.InterfaceC5895d
    public long l(long j10) {
        M0(j10);
        j.b(M());
        throw null;
    }

    public final void l0(InterfaceC5187d interfaceC5187d, AbstractC5523a abstractC5523a) {
        float fE = AbstractC6493g.e(y0());
        float f10 = AbstractC6493g.f(y0());
        interfaceC5187d.a(fE, f10);
        m0(interfaceC5187d, abstractC5523a);
        interfaceC5187d.a(-fE, -f10);
    }

    public final void m0(InterfaceC5187d interfaceC5187d, AbstractC5523a abstractC5523a) {
        InterfaceC4869e.c cVarG0 = G0(v0.p.a(4));
        if (cVarG0 == null) {
            R0(interfaceC5187d, abstractC5523a);
        } else {
            M().y().a(interfaceC5187d, AbstractC6496j.a(f()), this, cVarG0, abstractC5523a);
        }
    }

    public final NodeCoordinator n0(NodeCoordinator nodeCoordinator) {
        androidx.compose.ui.node.b bVarM = nodeCoordinator.M();
        androidx.compose.ui.node.b bVarM2 = M();
        if (bVarM == bVarM2) {
            InterfaceC4869e.c cVarB0 = nodeCoordinator.B0();
            InterfaceC4869e.c cVarB02 = B0();
            int iA = v0.p.a(2);
            if (!cVarB02.a().g()) {
                AbstractC5826a.b("visitLocalAncestors called on an unattached node");
            }
            for (InterfaceC4869e.c cVarF = cVarB02.a().f(); cVarF != null; cVarF = cVarF.f()) {
                if ((cVarF.e() & iA) != 0 && cVarF == cVarB0) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (bVarM.l() > bVarM2.l()) {
            bVarM = bVarM.I();
            AbstractC4862t.b(bVarM);
        }
        while (bVarM2.l() > bVarM.l()) {
            bVarM2 = bVarM2.I();
            AbstractC4862t.b(bVarM2);
        }
        while (bVarM != bVarM2) {
            bVarM = bVarM.I();
            bVarM2 = bVarM2.I();
            if (bVarM == null || bVarM2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (bVarM2 != M()) {
            if (bVarM != nodeCoordinator.M()) {
                return bVarM.o();
            }
            return nodeCoordinator;
        }
        return this;
    }

    @Override // u0.InterfaceC5895d
    public long o(long j10) {
        if (!d()) {
            AbstractC5826a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        M0(j10);
        j.b(M());
        throw null;
    }

    public long o0(long j10, boolean z10) {
        return (z10 || !T()) ? AbstractC6494h.a(j10, y0()) : j10;
    }

    public final void p0(C5064b c5064b, boolean z10) {
        float fE = AbstractC6493g.e(y0());
        c5064b.g(c5064b.b() - fE);
        c5064b.h(c5064b.c() - fE);
        float f10 = AbstractC6493g.f(y0());
        c5064b.i(c5064b.d() - f10);
        c5064b.f(c5064b.a() - f10);
    }

    @Override // u0.InterfaceC5895d
    public final InterfaceC5895d q() {
        if (!d()) {
            StringBuilder sb2 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (androidx.compose.ui.node.b bVarM = M(); bVarM != null; bVarM = bVarM.I()) {
                sb2.append('\n');
                AbstractC4862t.d(sb2, "append(...)");
                sb2.append("|");
                sb2.append(bVarM);
                sb2.append(" isAttached=");
                sb2.append(bVarM.R());
                sb2.append(" modifier=");
                sb2.append(bVarM.D());
                sb2.append(" tail=");
                sb2.append(B0());
            }
            AbstractC5826a.b(sb2.toString());
        }
        N0();
        return M().G().f22043u;
    }

    public InterfaceC6027b q0() {
        return M().q().a();
    }

    public final vc.p r0() {
        vc.p pVar = this.f22036F;
        if (pVar != null) {
            return pVar;
        }
        g gVar = new g(new h());
        this.f22036F = gVar;
        return gVar;
    }

    public final boolean s0() {
        return this.f22041s;
    }

    public final boolean t0() {
        return this.f22038H;
    }

    public final r u0() {
        return null;
    }

    public abstract androidx.compose.ui.node.e v0();

    public InterfaceC5902k w0() {
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final InterfaceC5895d x0() {
        if (!d()) {
            AbstractC5826a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        N0();
        return this.f22043u;
    }

    public long y0() {
        return this.f22031A;
    }

    public final C5064b z0() {
        C5064b c5064b = this.f22033C;
        if (c5064b != null) {
            return c5064b;
        }
        C5064b c5064b2 = new C5064b(0.0f, 0.0f, 0.0f, 0.0f);
        this.f22033C = c5064b2;
        return c5064b2;
    }

    @Override // androidx.compose.ui.node.d
    public InterfaceC5895d K() {
        return this;
    }
}
