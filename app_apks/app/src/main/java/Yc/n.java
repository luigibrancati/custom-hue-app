package Yc;

import Cd.E;
import Cd.F;
import Cd.M;
import Cd.p0;
import Cd.u0;
import Lc.InterfaceC1185m;
import Lc.a0;
import Oc.AbstractC1808b;
import bd.InterfaceC2918j;
import bd.y;
import gc.C4205s;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends AbstractC1808b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Xc.g f20028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f20029l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Xc.g c10, y javaTypeParameter, int i10, InterfaceC1185m containingDeclaration) {
        super(c10.e(), containingDeclaration, new Xc.d(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), u0.INVARIANT, false, i10, a0.f8746a, c10.a().v());
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(javaTypeParameter, "javaTypeParameter");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        this.f20028k = c10;
        this.f20029l = javaTypeParameter;
    }

    @Override // Oc.AbstractC1811e
    public List G0(List bounds) {
        AbstractC4862t.e(bounds, "bounds");
        return this.f20028k.a().r().i(this, bounds, this.f20028k);
    }

    @Override // Oc.AbstractC1811e
    public void K0(E type) {
        AbstractC4862t.e(type, "type");
    }

    @Override // Oc.AbstractC1811e
    public List L0() {
        return M0();
    }

    public final List M0() {
        Collection upperBounds = this.f20029l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            M mI = this.f20028k.d().n().i();
            AbstractC4862t.d(mI, "c.module.builtIns.anyType");
            M mI2 = this.f20028k.d().n().I();
            AbstractC4862t.d(mI2, "c.module.builtIns.nullableAnyType");
            return C4205s.d(F.d(mI, mI2));
        }
        ArrayList arrayList = new ArrayList(C4207u.v(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            n nVar = this;
            arrayList.add(this.f20028k.g().o((InterfaceC2918j) it.next(), Zc.b.b(p0.COMMON, false, false, nVar, 3, null)));
            this = nVar;
        }
        return arrayList;
    }
}
