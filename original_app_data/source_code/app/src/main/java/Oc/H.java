package Oc;

import Lc.P;
import gc.C4206t;
import gc.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import vd.AbstractC6094c;
import vd.AbstractC6100i;
import vd.C6095d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class H extends AbstractC6100i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lc.G f12203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kd.c f12204c;

    public H(Lc.G moduleDescriptor, kd.c fqName) {
        AbstractC4862t.e(moduleDescriptor, "moduleDescriptor");
        AbstractC4862t.e(fqName, "fqName");
        this.f12203b = moduleDescriptor;
        this.f12204c = fqName;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        if (!kindFilter.a(C6095d.f45974c.f())) {
            return C4206t.k();
        }
        if (this.f12204c.d() && kindFilter.l().contains(AbstractC6094c.b.f45973a)) {
            return C4206t.k();
        }
        Collection collectionT = this.f12203b.t(this.f12204c, nameFilter);
        ArrayList arrayList = new ArrayList(collectionT.size());
        Iterator it = collectionT.iterator();
        while (it.hasNext()) {
            kd.f fVarG = ((kd.c) it.next()).g();
            AbstractC4862t.d(fVarG, "subFqName.shortName()");
            if (((Boolean) nameFilter.invoke(fVarG)).booleanValue()) {
                Md.a.a(arrayList, h(fVarG));
            }
        }
        return arrayList;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set g() {
        return U.d();
    }

    public final P h(kd.f name) {
        AbstractC4862t.e(name, "name");
        if (name.u()) {
            return null;
        }
        Lc.G g10 = this.f12203b;
        kd.c cVarC = this.f12204c.c(name);
        AbstractC4862t.d(cVarC, "fqName.child(name)");
        P pZ0 = g10.z0(cVarC);
        if (pZ0.isEmpty()) {
            return null;
        }
        return pZ0;
    }

    public String toString() {
        return "subpackages of " + this.f12204c + " from " + this.f12203b;
    }
}
