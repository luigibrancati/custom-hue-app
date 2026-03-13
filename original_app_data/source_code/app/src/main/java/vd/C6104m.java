package vd;

import Cd.l0;
import Cd.n0;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.c0;
import fc.C4029l;
import fc.InterfaceC4028k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import pd.AbstractC5463d;
import vc.InterfaceC6082a;
import vd.InterfaceC6102k;

/* JADX INFO: renamed from: vd.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6104m implements InterfaceC6099h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC6099h f46022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4028k f46023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f46024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f46025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4028k f46026f;

    /* JADX INFO: renamed from: vd.m$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            C6104m c6104m = C6104m.this;
            return c6104m.l(InterfaceC6102k.a.a(c6104m.f46022b, null, null, 3, null));
        }
    }

    /* JADX INFO: renamed from: vd.m$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n0 f46028a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n0 n0Var) {
            super(0);
            this.f46028a = n0Var;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return this.f46028a.j().c();
        }
    }

    public C6104m(InterfaceC6099h workerScope, n0 givenSubstitutor) {
        AbstractC4862t.e(workerScope, "workerScope");
        AbstractC4862t.e(givenSubstitutor, "givenSubstitutor");
        this.f46022b = workerScope;
        this.f46023c = C4029l.b(new b(givenSubstitutor));
        l0 l0VarJ = givenSubstitutor.j();
        AbstractC4862t.d(l0VarJ, "givenSubstitutor.substitution");
        this.f46024d = AbstractC5463d.f(l0VarJ, false, 1, null).c();
        this.f46026f = C4029l.b(new a());
    }

    @Override // vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return l(this.f46022b.a(name, location));
    }

    @Override // vd.InterfaceC6099h
    public Set b() {
        return this.f46022b.b();
    }

    @Override // vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return l(this.f46022b.c(name, location));
    }

    @Override // vd.InterfaceC6099h
    public Set d() {
        return this.f46022b.d();
    }

    @Override // vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        InterfaceC1180h interfaceC1180hE = this.f46022b.e(name, location);
        if (interfaceC1180hE != null) {
            return (InterfaceC1180h) k(interfaceC1180hE);
        }
        return null;
    }

    @Override // vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return j();
    }

    @Override // vd.InterfaceC6099h
    public Set g() {
        return this.f46022b.g();
    }

    public final Collection j() {
        return (Collection) this.f46026f.getValue();
    }

    public final InterfaceC1185m k(InterfaceC1185m interfaceC1185m) {
        if (this.f46024d.k()) {
            return interfaceC1185m;
        }
        if (this.f46025e == null) {
            this.f46025e = new HashMap();
        }
        Map map = this.f46025e;
        AbstractC4862t.b(map);
        Object objC = map.get(interfaceC1185m);
        if (objC == null) {
            if (!(interfaceC1185m instanceof c0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC1185m).toString());
            }
            objC = ((c0) interfaceC1185m).c(this.f46024d);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC1185m + " substitution fails");
            }
            map.put(interfaceC1185m, objC);
        }
        InterfaceC1185m interfaceC1185m2 = (InterfaceC1185m) objC;
        AbstractC4862t.c(interfaceC1185m2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return interfaceC1185m2;
    }

    public final Collection l(Collection collection) {
        if (this.f46024d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = Md.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(k((InterfaceC1185m) it.next()));
        }
        return linkedHashSetG;
    }
}
