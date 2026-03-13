package androidx.compose.ui.node;

import androidx.compose.ui.node.b;
import b0.C2771B;
import b0.C2772C;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import u0.AbstractC5892a;
import u0.AbstractC5905n;
import u0.InterfaceC5895d;
import u0.InterfaceC5903l;
import u0.o;
import u0.p;
import v0.AbstractC6026a;
import v0.InterfaceC6027b;
import v0.l;
import v0.t;
import v0.u;
import z0.AbstractC6493g;
import z0.AbstractC6495i;
import z0.InterfaceC6489c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends AbstractC5905n implements InterfaceC5903l, l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f22117o = new b(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final vc.l f22118p = a.f22128a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f22119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vc.l f22120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f22121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22124k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC5905n.a f22125l = o.a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f22126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2771B f22127n;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22128a = new a();

        public a() {
            super(1);
        }

        public final void a(t tVar) {
            if (tVar.c()) {
                tVar.a().G(tVar);
            }
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t) obj);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements InterfaceC6489c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f22130b = AbstractC6493g.f48683a.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f22131c = AbstractC6495i.f48686a.a();

        public c() {
        }

        public final boolean a() {
            return this.f22129a;
        }

        public final long b() {
            return this.f22130b;
        }

        public final long c() {
            return this.f22131c;
        }
    }

    public abstract int E(AbstractC5892a abstractC5892a);

    public final void F(t tVar, long j10, long j11) {
        C2771B c2771b = this.f22127n;
        u uVar = this.f22126m;
        if (uVar == null) {
            uVar = new u();
            this.f22126m = uVar;
        }
        M().H();
        uVar.c(S(), this, c2771b);
    }

    public final void G(t tVar) {
        if (this.f22124k) {
            return;
        }
        tVar.b();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(u0.InterfaceC5902k r24) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.d.H(u0.k):void");
    }

    public final d I(p pVar) {
        while (true) {
            u uVar = this.f22126m;
            if (uVar != null && uVar.b(pVar)) {
                return this;
            }
            d dVarN = this.N();
            if (dVarN == null) {
                return this;
            }
            this = dVarN;
        }
    }

    public final int J(AbstractC5892a abstractC5892a) {
        int iE;
        if (L() && (iE = E(abstractC5892a)) != Integer.MIN_VALUE) {
            return iE + AbstractC6493g.f(u());
        }
        return Integer.MIN_VALUE;
    }

    public abstract InterfaceC5895d K();

    public abstract boolean L();

    public abstract androidx.compose.ui.node.b M();

    public abstract d N();

    public final AbstractC5905n.a O() {
        return this.f22125l;
    }

    public final c P() {
        c cVar = this.f22119f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f22119f = cVar2;
        return cVar2;
    }

    public final void Q(NodeCoordinator nodeCoordinator) {
        AbstractC6026a abstractC6026aA;
        NodeCoordinator nodeCoordinatorC0 = nodeCoordinator.C0();
        if (!AbstractC4862t.a(nodeCoordinatorC0 != null ? nodeCoordinatorC0.M() : null, nodeCoordinator.M())) {
            nodeCoordinator.q0().a().m();
            return;
        }
        InterfaceC6027b interfaceC6027bC = nodeCoordinator.q0().c();
        if (interfaceC6027bC == null || (abstractC6026aA = interfaceC6027bC.a()) == null) {
            return;
        }
        abstractC6026aA.m();
    }

    public final void R(p pVar) {
        C2771B c2771b = I(pVar).f22127n;
        C2772C c2772c = c2771b != null ? (C2772C) c2771b.p(pVar) : null;
        if (c2772c != null) {
            W(c2772c);
        }
    }

    public boolean S() {
        return false;
    }

    public boolean T() {
        return this.f22122i;
    }

    public final boolean U() {
        return this.f22124k;
    }

    public final boolean V() {
        return this.f22123j;
    }

    public final void W(C2772C c2772c) {
        Object[] objArr = c2772c.f24846b;
        long[] jArr = c2772c.f24845a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        android.support.v4.media.session.a.a(objArr[(i10 << 3) + i12]);
                        throw null;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public void X(boolean z10) {
        this.f22122i = z10;
    }

    public final void Y(boolean z10) {
        this.f22124k = z10;
    }

    @Override // v0.l
    public void h(boolean z10) {
        d dVarN = N();
        androidx.compose.ui.node.b bVarM = dVarN != null ? dVarN.M() : null;
        if (AbstractC4862t.a(bVarM, M())) {
            X(z10);
            return;
        }
        if ((bVarM != null ? bVarM.t() : null) != b.e.LayingOut) {
            if ((bVarM != null ? bVarM.t() : null) != b.e.LookaheadLayingOut) {
                return;
            }
        }
        X(z10);
    }
}
