package od;

import Cd.E;
import Cd.d0;
import Cd.e0;
import Dd.b;
import Dd.e;
import Gd.t;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: renamed from: od.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5290l implements Dd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.a f41561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Dd.g f41562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Dd.f f41563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vc.p f41564e;

    /* JADX INFO: renamed from: od.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends d0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ C5290l f41565k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, boolean z11, C5290l c5290l, Dd.f fVar, Dd.g gVar) {
            super(z10, z11, true, c5290l, fVar, gVar);
            this.f41565k = c5290l;
        }

        @Override // Cd.d0
        public boolean f(Gd.i subType, Gd.i superType) {
            AbstractC4862t.e(subType, "subType");
            AbstractC4862t.e(superType, "superType");
            if (!(subType instanceof E)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof E) {
                return ((Boolean) this.f41565k.f41564e.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public C5290l(Map map, e.a equalityAxioms, Dd.g kotlinTypeRefiner, Dd.f kotlinTypePreparator, vc.p pVar) {
        AbstractC4862t.e(equalityAxioms, "equalityAxioms");
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC4862t.e(kotlinTypePreparator, "kotlinTypePreparator");
        this.f41560a = map;
        this.f41561b = equalityAxioms;
        this.f41562c = kotlinTypeRefiner;
        this.f41563d = kotlinTypePreparator;
        this.f41564e = pVar;
    }

    @Override // Gd.p
    public boolean A(Gd.i iVar) {
        return b.a.Z(this, iVar);
    }

    @Override // Gd.p
    public boolean A0(Gd.i iVar) {
        return b.a.O(this, iVar);
    }

    @Override // Cd.o0
    public Ic.h B(Gd.n nVar) {
        return b.a.t(this, nVar);
    }

    @Override // Gd.p
    public boolean B0(Gd.n nVar) {
        return b.a.I(this, nVar);
    }

    @Override // Gd.p
    public boolean C(Gd.k kVar) {
        return b.a.Y(this, kVar);
    }

    @Override // Gd.p
    public List C0(Gd.k kVar, Gd.n constructor) {
        AbstractC4862t.e(kVar, "<this>");
        AbstractC4862t.e(constructor, "constructor");
        return null;
    }

    @Override // Gd.p
    public boolean D(Gd.k kVar) {
        AbstractC4862t.e(kVar, "<this>");
        return e0(f(kVar));
    }

    @Override // Gd.s
    public boolean D0(Gd.k kVar, Gd.k kVar2) {
        return b.a.D(this, kVar, kVar2);
    }

    @Override // Gd.p
    public t E(Gd.m mVar) {
        return b.a.z(this, mVar);
    }

    @Override // Gd.p
    public boolean E0(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return y0(o(iVar)) != y0(z(iVar));
    }

    @Override // Gd.p
    public Gd.c F(Gd.d dVar) {
        return b.a.l0(this, dVar);
    }

    @Override // Gd.p
    public Gd.i G(Gd.i iVar, boolean z10) {
        return b.a.o0(this, iVar, z10);
    }

    public final boolean G0(e0 e0Var, e0 e0Var2) {
        if (this.f41561b.a(e0Var, e0Var2)) {
            return true;
        }
        Map map = this.f41560a;
        if (map == null) {
            return false;
        }
        e0 e0Var3 = (e0) map.get(e0Var);
        e0 e0Var4 = (e0) this.f41560a.get(e0Var2);
        return (e0Var3 != null && AbstractC4862t.a(e0Var3, e0Var2)) || (e0Var4 != null && AbstractC4862t.a(e0Var4, e0Var));
    }

    @Override // Gd.p
    public boolean H(Gd.n c12, Gd.n c22) {
        AbstractC4862t.e(c12, "c1");
        AbstractC4862t.e(c22, "c2");
        if (!(c12 instanceof e0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c22 instanceof e0) {
            return b.a.a(this, c12, c22) || G0((e0) c12, (e0) c22);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public d0 H0(boolean z10, boolean z11) {
        if (this.f41564e != null) {
            return new a(z10, z11, this, this.f41563d, this.f41562c);
        }
        return Dd.a.a(z10, z11, this, this.f41563d, this.f41562c);
    }

    @Override // Gd.p
    public boolean I(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        Gd.g gVarQ = Q(iVar);
        if (gVarQ == null) {
            return false;
        }
        l0(gVarQ);
        return false;
    }

    @Override // Gd.p
    public Gd.o J(Gd.n nVar, int i10) {
        return b.a.q(this, nVar, i10);
    }

    @Override // Gd.p
    public Gd.m K(Gd.l lVar, int i10) {
        AbstractC4862t.e(lVar, "<this>");
        if (lVar instanceof Gd.k) {
            return w((Gd.i) lVar, i10);
        }
        if (lVar instanceof Gd.a) {
            E e10 = ((Gd.a) lVar).get(i10);
            AbstractC4862t.d(e10, "get(index)");
            return (Gd.m) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + M.b(lVar.getClass())).toString());
    }

    @Override // Dd.b
    public Gd.i L(Gd.k kVar, Gd.k kVar2) {
        return b.a.m(this, kVar, kVar2);
    }

    @Override // Cd.o0
    public Gd.i M(Gd.i iVar) {
        return b.a.x(this, iVar);
    }

    @Override // Gd.p
    public boolean N(Gd.k kVar) {
        AbstractC4862t.e(kVar, "<this>");
        return n0(f(kVar));
    }

    @Override // Gd.p
    public boolean O(Gd.d dVar) {
        return b.a.T(this, dVar);
    }

    @Override // Gd.p
    public Gd.b P(Gd.d dVar) {
        return b.a.l(this, dVar);
    }

    @Override // Gd.p
    public Gd.g Q(Gd.i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // Gd.p
    public List R(Gd.o oVar) {
        return b.a.y(this, oVar);
    }

    @Override // Cd.o0
    public boolean S(Gd.n nVar) {
        return b.a.a0(this, nVar);
    }

    @Override // Gd.p
    public boolean T(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        Gd.k kVarE = e(iVar);
        return (kVarE != null ? v(kVarE) : null) != null;
    }

    @Override // Gd.p
    public Gd.i U(Gd.d dVar) {
        return b.a.c0(this, dVar);
    }

    @Override // Gd.p
    public Gd.o V(Gd.n nVar) {
        return b.a.w(this, nVar);
    }

    @Override // Gd.p
    public boolean W(Gd.n nVar) {
        return b.a.M(this, nVar);
    }

    @Override // Gd.p
    public Gd.k X(Gd.e eVar) {
        return b.a.f0(this, eVar);
    }

    @Override // Gd.p
    public boolean Y(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return (iVar instanceof Gd.k) && y0((Gd.k) iVar);
    }

    @Override // Gd.p
    public List Z(Gd.i iVar) {
        return b.a.o(this, iVar);
    }

    @Override // Dd.b, Gd.p
    public Gd.k a(Gd.k kVar, boolean z10) {
        return b.a.p0(this, kVar, z10);
    }

    @Override // Gd.p
    public Gd.n a0(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        Gd.k kVarE = e(iVar);
        if (kVarE == null) {
            kVarE = o(iVar);
        }
        return f(kVarE);
    }

    @Override // Dd.b, Gd.p
    public Gd.k b(Gd.g gVar) {
        return b.a.n0(this, gVar);
    }

    @Override // Gd.p
    public d0.c b0(Gd.k kVar) {
        return b.a.j0(this, kVar);
    }

    @Override // Dd.b, Gd.p
    public Gd.d c(Gd.k kVar) {
        return b.a.d(this, kVar);
    }

    @Override // Cd.o0
    public boolean c0(Gd.i iVar, kd.c cVar) {
        return b.a.B(this, iVar, cVar);
    }

    @Override // Dd.b, Gd.p
    public Gd.k d(Gd.g gVar) {
        return b.a.b0(this, gVar);
    }

    @Override // Gd.p
    public boolean d0(Gd.i iVar) {
        return b.a.J(this, iVar);
    }

    @Override // Dd.b, Gd.p
    public Gd.k e(Gd.i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // Gd.p
    public boolean e0(Gd.n nVar) {
        return b.a.G(this, nVar);
    }

    @Override // Dd.b, Gd.p
    public Gd.n f(Gd.k kVar) {
        return b.a.m0(this, kVar);
    }

    @Override // Gd.p
    public Gd.m f0(Gd.i iVar) {
        return b.a.j(this, iVar);
    }

    @Override // Dd.b, Gd.p
    public boolean g(Gd.k kVar) {
        return b.a.U(this, kVar);
    }

    @Override // Gd.p
    public boolean g0(Gd.d dVar) {
        return b.a.R(this, dVar);
    }

    @Override // Gd.p
    public boolean h(Gd.n nVar) {
        return b.a.H(this, nVar);
    }

    @Override // Gd.p
    public Gd.k h0(Gd.k kVar, Gd.b bVar) {
        return b.a.k(this, kVar, bVar);
    }

    @Override // Gd.p
    public boolean i(Gd.o oVar, Gd.n nVar) {
        return b.a.C(this, oVar, nVar);
    }

    @Override // Gd.p
    public boolean i0(Gd.k kVar) {
        return b.a.S(this, kVar);
    }

    @Override // Gd.p
    public Gd.m j(Gd.c cVar) {
        return b.a.i0(this, cVar);
    }

    @Override // Gd.p
    public Gd.i j0(List list) {
        return b.a.E(this, list);
    }

    @Override // Gd.p
    public boolean k(Gd.k kVar) {
        return b.a.X(this, kVar);
    }

    @Override // Gd.p
    public Gd.i k0(Gd.m mVar) {
        return b.a.v(this, mVar);
    }

    @Override // Cd.o0
    public Gd.i l(Gd.o oVar) {
        return b.a.u(this, oVar);
    }

    @Override // Gd.p
    public Gd.f l0(Gd.g gVar) {
        b.a.f(this, gVar);
        return null;
    }

    @Override // Gd.p
    public boolean m(Gd.n nVar) {
        return b.a.F(this, nVar);
    }

    @Override // Gd.p
    public t m0(Gd.o oVar) {
        return b.a.A(this, oVar);
    }

    @Override // Gd.p
    public Collection n(Gd.n nVar) {
        return b.a.k0(this, nVar);
    }

    @Override // Gd.p
    public boolean n0(Gd.n nVar) {
        return b.a.L(this, nVar);
    }

    @Override // Gd.p
    public Gd.k o(Gd.i iVar) {
        Gd.k kVarD;
        AbstractC4862t.e(iVar, "<this>");
        Gd.g gVarQ = Q(iVar);
        if (gVarQ != null && (kVarD = d(gVarQ)) != null) {
            return kVarD;
        }
        Gd.k kVarE = e(iVar);
        AbstractC4862t.b(kVarE);
        return kVarE;
    }

    @Override // Gd.p
    public Gd.j o0(Gd.g gVar) {
        return b.a.h(this, gVar);
    }

    @Override // Gd.p
    public Gd.i p(Gd.i iVar) {
        return b.a.d0(this, iVar);
    }

    @Override // Gd.p
    public boolean p0(Gd.i iVar) {
        return b.a.Q(this, iVar);
    }

    @Override // Gd.p
    public boolean q(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        Gd.k kVarE = e(iVar);
        return (kVarE != null ? c(kVarE) : null) != null;
    }

    @Override // Gd.p
    public Collection q0(Gd.k kVar) {
        return b.a.h0(this, kVar);
    }

    @Override // Gd.p
    public boolean r(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return x(a0(iVar)) && !p0(iVar);
    }

    @Override // Gd.p
    public Gd.l r0(Gd.k kVar) {
        return b.a.c(this, kVar);
    }

    @Override // Gd.p
    public Gd.m s(Gd.k kVar, int i10) {
        AbstractC4862t.e(kVar, "<this>");
        if (i10 < 0 || i10 >= u0(kVar)) {
            return null;
        }
        return w(kVar, i10);
    }

    @Override // Gd.p
    public int s0(Gd.n nVar) {
        return b.a.g0(this, nVar);
    }

    @Override // Cd.o0
    public kd.d t(Gd.n nVar) {
        return b.a.p(this, nVar);
    }

    @Override // Cd.o0
    public Ic.h t0(Gd.n nVar) {
        return b.a.s(this, nVar);
    }

    @Override // Gd.p
    public List u(Gd.n nVar) {
        return b.a.r(this, nVar);
    }

    @Override // Gd.p
    public int u0(Gd.i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // Gd.p
    public Gd.e v(Gd.k kVar) {
        return b.a.e(this, kVar);
    }

    @Override // Gd.p
    public boolean v0(Gd.m mVar) {
        return b.a.W(this, mVar);
    }

    @Override // Gd.p
    public Gd.m w(Gd.i iVar, int i10) {
        return b.a.n(this, iVar, i10);
    }

    @Override // Gd.p
    public Gd.k w0(Gd.k kVar) {
        Gd.k kVarX;
        AbstractC4862t.e(kVar, "<this>");
        Gd.e eVarV = v(kVar);
        return (eVarV == null || (kVarX = X(eVarV)) == null) ? kVar : kVarX;
    }

    @Override // Gd.p
    public boolean x(Gd.n nVar) {
        return b.a.P(this, nVar);
    }

    @Override // Cd.o0
    public boolean x0(Gd.n nVar) {
        return b.a.K(this, nVar);
    }

    @Override // Cd.o0
    public Gd.i y(Gd.i iVar) {
        Gd.k kVarA;
        AbstractC4862t.e(iVar, "<this>");
        Gd.k kVarE = e(iVar);
        return (kVarE == null || (kVarA = a(kVarE, true)) == null) ? iVar : kVarA;
    }

    @Override // Gd.p
    public boolean y0(Gd.k kVar) {
        return b.a.N(this, kVar);
    }

    @Override // Gd.p
    public Gd.k z(Gd.i iVar) {
        Gd.k kVarB;
        AbstractC4862t.e(iVar, "<this>");
        Gd.g gVarQ = Q(iVar);
        if (gVarQ != null && (kVarB = b(gVarQ)) != null) {
            return kVarB;
        }
        Gd.k kVarE = e(iVar);
        AbstractC4862t.b(kVarE);
        return kVarE;
    }

    @Override // Gd.p
    public int z0(Gd.l lVar) {
        AbstractC4862t.e(lVar, "<this>");
        if (lVar instanceof Gd.k) {
            return u0((Gd.i) lVar);
        }
        if (lVar instanceof Gd.a) {
            return ((Gd.a) lVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + M.b(lVar.getClass())).toString());
    }
}
