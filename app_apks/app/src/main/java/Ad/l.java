package Ad;

import Cd.E;
import Cd.G;
import Cd.M;
import Cd.m0;
import Cd.n0;
import Cd.u0;
import Lc.AbstractC1192u;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.a0;
import Lc.e0;
import Lc.g0;
import Oc.AbstractC1810d;
import fd.r;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC1810d implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bd.n f448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hd.c f450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final hd.g f451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hd.h f452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Collection f454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public M f455o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public M f456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M f458r;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Bd.n storageManager, InterfaceC1185m containingDeclaration, Mc.g annotations, kd.f name, AbstractC1192u visibility, r proto, hd.c nameResolver, hd.g typeTable, hd.h versionRequirementTable, f fVar) {
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(annotations, "annotations");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(visibility, "visibility");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(nameResolver, "nameResolver");
        AbstractC4862t.e(typeTable, "typeTable");
        AbstractC4862t.e(versionRequirementTable, "versionRequirementTable");
        a0 NO_SOURCE = a0.f8746a;
        AbstractC4862t.d(NO_SOURCE, "NO_SOURCE");
        super(containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f448h = storageManager;
        this.f449i = proto;
        this.f450j = nameResolver;
        this.f451k = typeTable;
        this.f452l = versionRequirementTable;
        this.f453m = fVar;
    }

    @Override // Ad.g
    public hd.g D() {
        return this.f451k;
    }

    @Override // Lc.e0
    public M F() {
        M m10 = this.f456p;
        if (m10 != null) {
            return m10;
        }
        AbstractC4862t.p("expandedType");
        return null;
    }

    @Override // Ad.g
    public hd.c G() {
        return this.f450j;
    }

    @Override // Ad.g
    public f I() {
        return this.f453m;
    }

    @Override // Oc.AbstractC1810d
    public Bd.n K() {
        return this.f448h;
    }

    @Override // Oc.AbstractC1810d
    public List M0() {
        List list = this.f457q;
        if (list != null) {
            return list;
        }
        AbstractC4862t.p("typeConstructorParameters");
        return null;
    }

    public r O0() {
        return this.f449i;
    }

    public hd.h P0() {
        return this.f452l;
    }

    public final void Q0(List declaredTypeParameters, M underlyingType, M expandedType) {
        AbstractC4862t.e(declaredTypeParameters, "declaredTypeParameters");
        AbstractC4862t.e(underlyingType, "underlyingType");
        AbstractC4862t.e(expandedType, "expandedType");
        N0(declaredTypeParameters);
        this.f455o = underlyingType;
        this.f456p = expandedType;
        this.f457q = g0.d(this);
        this.f458r = G0();
        this.f454n = L0();
    }

    @Override // Lc.c0
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public e0 c(n0 substitutor) {
        AbstractC4862t.e(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        Bd.n nVarK = K();
        InterfaceC1185m containingDeclaration = b();
        AbstractC4862t.d(containingDeclaration, "containingDeclaration");
        Mc.g annotations = getAnnotations();
        AbstractC4862t.d(annotations, "annotations");
        kd.f name = getName();
        AbstractC4862t.d(name, "name");
        l lVar = new l(nVarK, containingDeclaration, annotations, name, getVisibility(), O0(), G(), D(), P0(), I());
        List listQ = q();
        M mR0 = r0();
        u0 u0Var = u0.INVARIANT;
        E eN = substitutor.n(mR0, u0Var);
        AbstractC4862t.d(eN, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        M mA = m0.a(eN);
        E eN2 = substitutor.n(F(), u0Var);
        AbstractC4862t.d(eN2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        lVar.Q0(listQ, mA, m0.a(eN2));
        return lVar;
    }

    @Override // Lc.InterfaceC1180h
    public M p() {
        M m10 = this.f458r;
        if (m10 != null) {
            return m10;
        }
        AbstractC4862t.p("defaultTypeImpl");
        return null;
    }

    @Override // Lc.e0
    public M r0() {
        M m10 = this.f455o;
        if (m10 != null) {
            return m10;
        }
        AbstractC4862t.p("underlyingType");
        return null;
    }

    @Override // Lc.e0
    public InterfaceC1177e s() {
        if (G.a(F())) {
            return null;
        }
        InterfaceC1180h interfaceC1180hQ = F().N0().q();
        if (interfaceC1180hQ instanceof InterfaceC1177e) {
            return (InterfaceC1177e) interfaceC1180hQ;
        }
        return null;
    }
}
