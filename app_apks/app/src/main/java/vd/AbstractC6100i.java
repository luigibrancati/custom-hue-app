package vd;

import Lc.InterfaceC1180h;
import Lc.Z;
import gc.C4206t;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vd.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6100i implements InterfaceC6099h {
    @Override // vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return C4206t.k();
    }

    @Override // vd.InterfaceC6099h
    public Set b() {
        Collection collectionF = f(C6095d.f45993v, Md.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof Z) {
                kd.f name = ((Z) obj).getName();
                AbstractC4862t.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return C4206t.k();
    }

    @Override // vd.InterfaceC6099h
    public Set d() {
        Collection collectionF = f(C6095d.f45994w, Md.d.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionF) {
            if (obj instanceof Z) {
                kd.f name = ((Z) obj).getName();
                AbstractC4862t.d(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return null;
    }

    @Override // vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return C4206t.k();
    }

    @Override // vd.InterfaceC6099h
    public Set g() {
        return null;
    }
}
