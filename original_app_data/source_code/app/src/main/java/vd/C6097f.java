package vd;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1181i;
import Lc.e0;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: vd.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6097f extends AbstractC6100i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6099h f46008b;

    public C6097f(InterfaceC6099h workerScope) {
        AbstractC4862t.e(workerScope, "workerScope");
        this.f46008b = workerScope;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set b() {
        return this.f46008b.b();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set d() {
        return this.f46008b.d();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        InterfaceC1180h interfaceC1180hE = this.f46008b.e(name, location);
        if (interfaceC1180hE != null) {
            InterfaceC1177e interfaceC1177e = interfaceC1180hE instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hE : null;
            if (interfaceC1177e != null) {
                return interfaceC1177e;
            }
            if (interfaceC1180hE instanceof e0) {
                return (e0) interfaceC1180hE;
            }
        }
        return null;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set g() {
        return this.f46008b.g();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        C6095d c6095dN = kindFilter.n(C6095d.f45974c.c());
        if (c6095dN == null) {
            return C4206t.k();
        }
        Collection collectionF = this.f46008b.f(c6095dN, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionF) {
            if (obj instanceof InterfaceC1181i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f46008b;
    }
}
