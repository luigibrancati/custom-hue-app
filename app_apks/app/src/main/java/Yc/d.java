package Yc;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1181i;
import bd.u;
import dd.InterfaceC3913r;
import gc.C4204q;
import gc.U;
import gc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;
import vd.AbstractC6101j;
import vd.C6095d;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements InterfaceC6099h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f19893f = {M.g(new E(M.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xc.g f19894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f19895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f19896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.i f19897e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6099h[] invoke() {
            Collection collectionValues = d.this.f19895c.M0().values();
            d dVar = d.this;
            ArrayList arrayList = new ArrayList();
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                InterfaceC6099h interfaceC6099hB = dVar.f19894b.a().b().b(dVar.f19895c, (InterfaceC3913r) it.next());
                if (interfaceC6099hB != null) {
                    arrayList.add(interfaceC6099hB);
                }
            }
            return (InterfaceC6099h[]) Ld.a.b(arrayList).toArray(new InterfaceC6099h[0]);
        }
    }

    public d(Xc.g c10, u jPackage, h packageFragment) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(jPackage, "jPackage");
        AbstractC4862t.e(packageFragment, "packageFragment");
        this.f19894b = c10;
        this.f19895c = packageFragment;
        this.f19896d = new i(c10, jPackage, packageFragment);
        this.f19897e = c10.e().f(new a());
    }

    @Override // vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        l(name, location);
        i iVar = this.f19896d;
        InterfaceC6099h[] interfaceC6099hArrK = k();
        Collection collectionA = iVar.a(name, location);
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArrK) {
            collectionA = Ld.a.a(collectionA, interfaceC6099h.a(name, location));
        }
        return collectionA == null ? U.d() : collectionA;
    }

    @Override // vd.InterfaceC6099h
    public Set b() {
        InterfaceC6099h[] interfaceC6099hArrK = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArrK) {
            y.C(linkedHashSet, interfaceC6099h.b());
        }
        linkedHashSet.addAll(this.f19896d.b());
        return linkedHashSet;
    }

    @Override // vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        l(name, location);
        i iVar = this.f19896d;
        InterfaceC6099h[] interfaceC6099hArrK = k();
        Collection collectionC = iVar.c(name, location);
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArrK) {
            collectionC = Ld.a.a(collectionC, interfaceC6099h.c(name, location));
        }
        return collectionC == null ? U.d() : collectionC;
    }

    @Override // vd.InterfaceC6099h
    public Set d() {
        InterfaceC6099h[] interfaceC6099hArrK = k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArrK) {
            y.C(linkedHashSet, interfaceC6099h.d());
        }
        linkedHashSet.addAll(this.f19896d.d());
        return linkedHashSet;
    }

    @Override // vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        l(name, location);
        InterfaceC1177e interfaceC1177eP = this.f19896d.e(name, location);
        if (interfaceC1177eP != null) {
            return interfaceC1177eP;
        }
        InterfaceC1180h interfaceC1180h = null;
        for (InterfaceC6099h interfaceC6099h : k()) {
            InterfaceC1180h interfaceC1180hE = interfaceC6099h.e(name, location);
            if (interfaceC1180hE != null) {
                if (!(interfaceC1180hE instanceof InterfaceC1181i) || !((InterfaceC1181i) interfaceC1180hE).k0()) {
                    return interfaceC1180hE;
                }
                if (interfaceC1180h == null) {
                    interfaceC1180h = interfaceC1180hE;
                }
            }
        }
        return interfaceC1180h;
    }

    @Override // vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        i iVar = this.f19896d;
        InterfaceC6099h[] interfaceC6099hArrK = k();
        Collection collectionF = iVar.f(kindFilter, nameFilter);
        for (InterfaceC6099h interfaceC6099h : interfaceC6099hArrK) {
            collectionF = Ld.a.a(collectionF, interfaceC6099h.f(kindFilter, nameFilter));
        }
        return collectionF == null ? U.d() : collectionF;
    }

    @Override // vd.InterfaceC6099h
    public Set g() {
        Set setA = AbstractC6101j.a(C4204q.I(k()));
        if (setA == null) {
            return null;
        }
        setA.addAll(this.f19896d.g());
        return setA;
    }

    public final i j() {
        return this.f19896d;
    }

    public final InterfaceC6099h[] k() {
        return (InterfaceC6099h[]) Bd.m.a(this.f19897e, this, f19893f[0]);
    }

    public void l(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        Sc.a.b(this.f19894b.a().l(), location, this.f19895c, name);
    }

    public String toString() {
        return "scope for " + this.f19895c;
    }
}
