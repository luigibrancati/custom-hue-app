package androidx.compose.ui.node;

import androidx.compose.ui.node.b;
import e0.C3921a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import o0.AbstractC5185b;
import o0.AbstractC5188e;
import o0.InterfaceC5187d;
import o0.m;
import o0.n;
import r0.AbstractC5523a;
import u0.AbstractC5892a;
import u0.AbstractC5905n;
import v0.j;
import v0.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends NodeCoordinator {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final C0276a f22057S = new C0276a(null);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final m f22058T;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final v f22059Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public e f22060R;

    /* JADX INFO: renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0276a {
        public /* synthetic */ C0276a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0276a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b extends e {
        public b() {
            super(a.this);
        }

        @Override // androidx.compose.ui.node.d
        public int E(AbstractC5892a abstractC5892a) {
            Integer num = (Integer) Z().b().get(abstractC5892a);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            a0().o(abstractC5892a, iIntValue);
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.e
        public void g0() {
            M().w();
            AbstractC4862t.b(null);
            throw null;
        }
    }

    static {
        m mVarA = AbstractC5185b.a();
        mVarA.a(AbstractC5188e.f41072a.b());
        mVarA.setStrokeWidth(1.0f);
        mVarA.b(n.f41093a.a());
        f22058T = mVarA;
    }

    public a(androidx.compose.ui.node.b bVar) {
        super(bVar);
        this.f22059Q = new v();
        B0().i(this);
        this.f22060R = bVar.x() != null ? new b() : null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, u0.AbstractC5905n
    public void A(long j10, float f10, l lVar) {
        super.A(j10, f10, lVar);
        f1();
    }

    @Override // androidx.compose.ui.node.d
    public int E(AbstractC5892a abstractC5892a) {
        e eVarV0 = v0();
        if (eVarV0 != null) {
            return eVarV0.E(abstractC5892a);
        }
        Integer num = (Integer) q0().b().get(abstractC5892a);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void R0(InterfaceC5187d interfaceC5187d, AbstractC5523a abstractC5523a) {
        j.b(M());
        C3921a c3921aO = M().O();
        Object[] objArr = c3921aO.f33521a;
        int iO = c3921aO.o();
        for (int i10 = 0; i10 < iO; i10++) {
            androidx.compose.ui.node.b bVar = (androidx.compose.ui.node.b) objArr[i10];
            if (bVar.T()) {
                bVar.e(interfaceC5187d, abstractC5523a);
            }
        }
        throw null;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public v B0() {
        return this.f22059Q;
    }

    public final void f1() {
        if (V()) {
            return;
        }
        M().z().c0();
    }

    @Override // u0.InterfaceC5900i
    public AbstractC5905n p(long j10) {
        if (s0()) {
            e eVarV0 = v0();
            AbstractC4862t.b(eVarV0);
            j10 = eVarV0.b0();
        }
        C(j10);
        C3921a c3921aP = M().P();
        Object[] objArr = c3921aP.f33521a;
        int iO = c3921aP.o();
        for (int i10 = 0; i10 < iO; i10++) {
            ((androidx.compose.ui.node.b) objArr[i10]).z().i0(b.g.NotUsed);
        }
        M().B().a(this, M().g(), j10);
        W0(null);
        P0();
        return this;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public e v0() {
        return this.f22060R;
    }
}
