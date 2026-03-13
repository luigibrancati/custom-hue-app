package cd;

import Cd.E;
import Cd.q0;
import Cd.s0;
import Lc.InterfaceC1177e;
import Lc.j0;
import Uc.C2302d;
import Uc.EnumC2300b;
import Uc.y;
import gc.C4206t;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;

/* JADX INFO: renamed from: cd.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3112n extends AbstractC3097a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc.a f26570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Xc.g f26572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC2300b f26573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26574e;

    public /* synthetic */ C3112n(Mc.a aVar, boolean z10, Xc.g gVar, EnumC2300b enumC2300b, boolean z11, int i10, AbstractC4854k abstractC4854k) {
        this(aVar, z10, gVar, enumC2300b, (i10 & 16) != 0 ? false : z11);
    }

    @Override // cd.AbstractC3097a
    public boolean A(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return ((E) iVar).Q0() instanceof C3103g;
    }

    @Override // cd.AbstractC3097a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C2302d h() {
        return this.f26572c.a().a();
    }

    @Override // cd.AbstractC3097a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public E p(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return s0.a((E) iVar);
    }

    @Override // cd.AbstractC3097a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public boolean r(Mc.c cVar) {
        AbstractC4862t.e(cVar, "<this>");
        if ((cVar instanceof Wc.g) && ((Wc.g) cVar).d()) {
            return true;
        }
        if (!(cVar instanceof Yc.e) || o()) {
            return false;
        }
        return ((Yc.e) cVar).l() || l() == EnumC2300b.TYPE_PARAMETER_BOUNDS;
    }

    @Override // cd.AbstractC3097a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Gd.r v() {
        return Dd.o.f2691a;
    }

    @Override // cd.AbstractC3097a
    public Iterable i(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return ((E) iVar).getAnnotations();
    }

    @Override // cd.AbstractC3097a
    public Iterable k() {
        Mc.g annotations;
        Mc.a aVar = this.f26570a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? C4206t.k() : annotations;
    }

    @Override // cd.AbstractC3097a
    public EnumC2300b l() {
        return this.f26573d;
    }

    @Override // cd.AbstractC3097a
    public y m() {
        return this.f26572c.b();
    }

    @Override // cd.AbstractC3097a
    public boolean n() {
        Mc.a aVar = this.f26570a;
        return (aVar instanceof j0) && ((j0) aVar).s0() != null;
    }

    @Override // cd.AbstractC3097a
    public boolean o() {
        return this.f26572c.a().q().c();
    }

    @Override // cd.AbstractC3097a
    public kd.d s(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        InterfaceC1177e interfaceC1177eF = q0.f((E) iVar);
        if (interfaceC1177eF != null) {
            return AbstractC5283e.m(interfaceC1177eF);
        }
        return null;
    }

    @Override // cd.AbstractC3097a
    public boolean u() {
        return this.f26574e;
    }

    @Override // cd.AbstractC3097a
    public boolean w(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return Ic.g.d0((E) iVar);
    }

    @Override // cd.AbstractC3097a
    public boolean x() {
        return this.f26571b;
    }

    @Override // cd.AbstractC3097a
    public boolean y(Gd.i iVar, Gd.i other) {
        AbstractC4862t.e(iVar, "<this>");
        AbstractC4862t.e(other, "other");
        return this.f26572c.a().k().c((E) iVar, (E) other);
    }

    @Override // cd.AbstractC3097a
    public boolean z(Gd.o oVar) {
        AbstractC4862t.e(oVar, "<this>");
        return oVar instanceof Yc.n;
    }

    public C3112n(Mc.a aVar, boolean z10, Xc.g containerContext, EnumC2300b containerApplicabilityType, boolean z11) {
        AbstractC4862t.e(containerContext, "containerContext");
        AbstractC4862t.e(containerApplicabilityType, "containerApplicabilityType");
        this.f26570a = aVar;
        this.f26571b = z10;
        this.f26572c = containerContext;
        this.f26573d = containerApplicabilityType;
        this.f26574e = z11;
    }
}
