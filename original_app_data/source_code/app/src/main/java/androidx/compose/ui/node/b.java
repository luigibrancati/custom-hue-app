package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import e0.C3921a;
import fc.C4015H;
import fc.C4025h;
import java.util.Comparator;
import java.util.List;
import k0.AbstractC4777c;
import k0.InterfaceC4775a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import l0.C4867c;
import l0.InterfaceC4869e;
import o0.InterfaceC5187d;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import r0.AbstractC5523a;
import t0.AbstractC5826a;
import u0.InterfaceC5895d;
import u0.InterfaceC5901j;
import u0.InterfaceC5902k;
import u0.InterfaceC5903l;
import v0.j;
import v0.m;
import v0.n;
import v0.p;
import vc.InterfaceC6082a;
import w0.AbstractC6114a;
import w0.InterfaceC6115b;
import x0.AbstractC6285e;
import z0.AbstractC6493g;
import z0.AbstractC6495i;
import z0.C6487a;
import z0.EnumC6497k;
import z0.InterfaceC6489c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final d f22062H = new d(null);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f22063I = 8;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final f f22064J = new c();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final InterfaceC6082a f22065K = a.f22101a;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final InterfaceC6115b f22066L = new C0277b();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Comparator f22067M = new Comparator() { // from class: v0.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return androidx.compose.ui.node.b.b((androidx.compose.ui.node.b) obj, (androidx.compose.ui.node.b) obj2);
        }
    };

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f22068A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final n f22069B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final androidx.compose.ui.node.c f22070C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public NodeCoordinator f22071D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f22072E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC4869e f22073F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f22074G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f22083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f22085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3921a f22086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f22088n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22089o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SemanticsConfiguration f22090p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C3921a f22092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f22093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC5901j f22094t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC6489c f22095u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EnumC6497k f22096v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC6115b f22097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d0.c f22098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g f22099y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g f22100z;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22101a = new a();

        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return new b(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0277b implements InterfaceC6115b {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends f {
        public c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // u0.InterfaceC5901j
        public /* bridge */ /* synthetic */ InterfaceC5902k a(InterfaceC5903l interfaceC5903l, List list, long j10) {
            android.support.v4.media.session.a.a(b(interfaceC5903l, list, j10));
            return null;
        }

        public Void b(InterfaceC5903l interfaceC5903l, List list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        public /* synthetic */ d(AbstractC4854k abstractC4854k) {
            this();
        }

        public d() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ e[] $VALUES;
        public static final e Measuring = new e("Measuring", 0);
        public static final e LookaheadMeasuring = new e("LookaheadMeasuring", 1);
        public static final e LayingOut = new e("LayingOut", 2);
        public static final e LookaheadLayingOut = new e("LookaheadLayingOut", 3);
        public static final e Idle = new e("Idle", 4);

        static {
            e[] eVarArrA = a();
            $VALUES = eVarArrA;
            $ENTRIES = AbstractC5277b.a(eVarArrA);
        }

        public e(String str, int i10) {
        }

        public static final /* synthetic */ e[] a() {
            return new e[]{Measuring, LookaheadMeasuring, LayingOut, LookaheadLayingOut, Idle};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f implements InterfaceC5901j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22102a;

        public f(String str) {
            this.f22102a = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ g[] $VALUES;
        public static final g InMeasureBlock = new g("InMeasureBlock", 0);
        public static final g InLayoutBlock = new g("InLayoutBlock", 1);
        public static final g NotUsed = new g("NotUsed", 2);

        static {
            g[] gVarArrA = a();
            $VALUES = gVarArrA;
            $ENTRIES = AbstractC5277b.a(gVarArrA);
        }

        public g(String str, int i10) {
        }

        public static final /* synthetic */ g[] a() {
            return new g[]{InMeasureBlock, InLayoutBlock, NotUsed};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22103a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22103a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends v implements InterfaceC6082a {
        public i() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return C4015H.f34254a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            b.this.q().s();
        }
    }

    public b() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    private final float N() {
        return z().W();
    }

    public static /* synthetic */ boolean Y(b bVar, C6487a c6487a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c6487a = bVar.f22070C.f();
        }
        return bVar.X(c6487a);
    }

    public static final int b(b bVar, b bVar2) {
        return bVar.N() == bVar2.N() ? AbstractC4862t.f(bVar.J(), bVar2.J()) : Float.compare(bVar.N(), bVar2.N());
    }

    public static /* synthetic */ void b0(b bVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        bVar.a0(z10, z11, z12);
    }

    public static /* synthetic */ void d0(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.c0(z10);
    }

    public static /* synthetic */ void f0(b bVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        bVar.e0(z10, z11, z12);
    }

    public final boolean A() {
        return this.f22070C.o();
    }

    public InterfaceC5901j B() {
        return this.f22094t;
    }

    public final g C() {
        return z().U();
    }

    public InterfaceC4869e D() {
        return this.f22073F;
    }

    public List E() {
        return this.f22069B.d();
    }

    public final n F() {
        return this.f22069B;
    }

    public final NodeCoordinator G() {
        return this.f22069B.e();
    }

    public final Owner H() {
        return null;
    }

    public final b I() {
        b bVar = this.f22088n;
        while (bVar != null && bVar.f22075a) {
            bVar = bVar.f22088n;
        }
        return bVar;
    }

    public final int J() {
        return z().n();
    }

    public SemanticsConfiguration K() {
        if (!R() || S() || !this.f22069B.g(p.a(8))) {
            return null;
        }
        if (!C4867c.f39803b && this.f22090p == null) {
            this.f22090p = c();
        }
        return this.f22090p;
    }

    public final InterfaceC4775a L() {
        android.support.v4.media.session.a.a(i().a(AbstractC4777c.c()));
        return null;
    }

    public int M() {
        return this.f22070C.r();
    }

    public final C3921a O() {
        if (this.f22093s) {
            this.f22092r.k();
            C3921a c3921a = this.f22092r;
            c3921a.e(c3921a.o(), P());
            this.f22092r.z(f22067M);
            this.f22093s = false;
        }
        return this.f22092r;
    }

    public final C3921a P() {
        k0();
        if (this.f22084j == 0) {
            return this.f22085k.a();
        }
        C3921a c3921a = this.f22086l;
        AbstractC4862t.b(c3921a);
        return c3921a;
    }

    public final void Q() {
        NodeCoordinator nodeCoordinatorP = p();
        if (nodeCoordinatorP != null) {
            nodeCoordinatorP.I0();
            return;
        }
        b bVarI = I();
        if (bVarI != null) {
            bVarI.Q();
        }
    }

    public boolean R() {
        return false;
    }

    public boolean S() {
        return this.f22074G;
    }

    public boolean T() {
        return z().X();
    }

    public final boolean U() {
        return this.f22082h;
    }

    public final void V() {
        if (!this.f22075a) {
            this.f22093s = true;
            return;
        }
        b bVarI = I();
        if (bVarI != null) {
            bVarI.V();
        }
    }

    public final void W() {
        if (this.f22087m) {
            this.f22087m = false;
            C3921a c3921a = this.f22086l;
            if (c3921a == null) {
                c3921a = new C3921a(new b[16], 0);
                this.f22086l = c3921a;
            }
            c3921a.k();
            C3921a c3921aA = this.f22085k.a();
            Object[] objArr = c3921aA.f33521a;
            int iO = c3921aA.o();
            for (int i10 = 0; i10 < iO; i10++) {
                b bVar = (b) objArr[i10];
                if (bVar.f22075a) {
                    c3921a.e(c3921a.o(), bVar.P());
                } else {
                    c3921a.d(bVar);
                }
            }
            this.f22070C.s();
        }
    }

    public final boolean X(C6487a c6487a) {
        if (c6487a == null) {
            return false;
        }
        if (this.f22099y == g.NotUsed) {
            d();
        }
        return z().f0(c6487a.k());
    }

    public final void a0(boolean z10, boolean z11, boolean z12) {
        if (this.f22083i != null) {
            return;
        }
        AbstractC5826a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
    }

    public final SemanticsConfiguration c() {
        this.f22091q = true;
        new L().f39776a = new SemanticsConfiguration();
        j.b(this);
        throw null;
    }

    public final void d() {
        this.f22100z = this.f22099y;
        this.f22099y = g.NotUsed;
        C3921a c3921aP = P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            b bVar = (b) objArr[i10];
            if (bVar.f22099y != g.NotUsed) {
                bVar.d();
            }
        }
    }

    public final void e(InterfaceC5187d interfaceC5187d, AbstractC5523a abstractC5523a) {
        try {
            G().l0(interfaceC5187d, abstractC5523a);
            C4015H c4015h = C4015H.f34254a;
        } catch (Throwable th) {
            this.i0(th);
            throw new C4025h();
        }
    }

    public final boolean f() {
        return this.f22068A;
    }

    public final List g() {
        return z().M();
    }

    public final void g0(b bVar) {
        if (h.f22103a[bVar.t().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + bVar.t());
        }
        if (bVar.v()) {
            b0(bVar, true, false, false, 6, null);
            return;
        }
        if (bVar.u()) {
            bVar.Z(true);
        }
        if (bVar.A()) {
            f0(bVar, true, false, false, 6, null);
        } else if (bVar.s()) {
            bVar.c0(true);
        }
    }

    public final List h() {
        return P().j();
    }

    public final void h0() {
        C3921a c3921aP = P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            b bVar = (b) objArr[i10];
            g gVar = bVar.f22100z;
            bVar.f22099y = gVar;
            if (gVar != g.NotUsed) {
                bVar.h0();
            }
        }
    }

    public d0.c i() {
        return this.f22098x;
    }

    public final Void i0(Throwable th) {
        L();
        throw th;
    }

    public InterfaceC5895d j() {
        return o();
    }

    public final void j0(boolean z10) {
        this.f22068A = z10;
    }

    public InterfaceC6489c k() {
        return this.f22095u;
    }

    public final void k0() {
        if (this.f22084j > 0) {
            W();
        }
    }

    public final int l() {
        return this.f22089o;
    }

    public final boolean m() {
        return this.f22077c;
    }

    public int n() {
        return this.f22070C.e();
    }

    public final NodeCoordinator o() {
        return this.f22069B.c();
    }

    public final NodeCoordinator p() {
        if (this.f22072E) {
            NodeCoordinator nodeCoordinatorO = o();
            NodeCoordinator nodeCoordinatorD0 = G().D0();
            this.f22071D = null;
            while (!AbstractC4862t.a(nodeCoordinatorO, nodeCoordinatorD0)) {
                if (nodeCoordinatorO != null) {
                    nodeCoordinatorO.u0();
                }
                nodeCoordinatorO = nodeCoordinatorO != null ? nodeCoordinatorO.D0() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this.f22071D;
        if (nodeCoordinator == null) {
            return nodeCoordinator;
        }
        nodeCoordinator.u0();
        AbstractC5826a.c("layer was not set");
        throw new C4025h();
    }

    public final androidx.compose.ui.node.c q() {
        return this.f22070C;
    }

    public EnumC6497k r() {
        return this.f22096v;
    }

    public final boolean s() {
        return this.f22070C.h();
    }

    public final e t() {
        return this.f22070C.i();
    }

    public String toString() {
        return AbstractC6114a.a(this, null) + " children: " + h().size() + " measurePolicy: " + B() + " deactivated: " + S();
    }

    public final boolean u() {
        return this.f22070C.k();
    }

    public final boolean v() {
        return this.f22070C.l();
    }

    public final androidx.compose.ui.node.f w() {
        this.f22070C.m();
        return null;
    }

    public final b x() {
        return this.f22083i;
    }

    public final v0.i y() {
        j.b(this);
        throw null;
    }

    public final androidx.compose.ui.node.g z() {
        return this.f22070C.n();
    }

    public b(boolean z10, int i10) {
        this.f22075a = z10;
        this.f22076b = i10;
        AbstractC6493g.a aVar = AbstractC6493g.f48683a;
        this.f22078d = aVar.a();
        this.f22079e = AbstractC6495i.f48686a.a();
        this.f22080f = aVar.a();
        this.f22081g = true;
        this.f22085k = new m(new C3921a(new b[16], 0), new i());
        this.f22092r = new C3921a(new b[16], 0);
        this.f22093s = true;
        this.f22094t = f22064J;
        this.f22095u = j.f45722a;
        this.f22096v = EnumC6497k.Ltr;
        this.f22097w = f22066L;
        this.f22098x = d0.c.f32784h0.a();
        g gVar = g.NotUsed;
        this.f22099y = gVar;
        this.f22100z = gVar;
        this.f22069B = new n(this);
        this.f22070C = new androidx.compose.ui.node.c(this);
        this.f22072E = true;
        this.f22073F = InterfaceC4869e.f39822a;
    }

    public final void Z(boolean z10) {
    }

    public final void c0(boolean z10) {
    }

    public /* synthetic */ b(boolean z10, int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? AbstractC6285e.a() : i10);
    }

    public final void e0(boolean z10, boolean z11, boolean z12) {
    }
}
