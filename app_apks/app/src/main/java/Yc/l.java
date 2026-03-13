package Yc;

import Cd.E;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.U;
import Lc.Z;
import Md.b;
import Nd.t;
import bd.InterfaceC2915g;
import bd.q;
import fc.C4015H;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import od.AbstractC5282d;
import vd.C6095d;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC2915g f20019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Wc.c f20020o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20021a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(it.P());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kd.f f20022a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kd.f fVar) {
            super(1);
            this.f20022a = fVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(InterfaceC6099h it) {
            AbstractC4862t.e(it, "it");
            return it.c(this.f20022a, Tc.d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f20023a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(InterfaceC6099h it) {
            AbstractC4862t.e(it, "it");
            return it.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f20024a = new d();

        public d() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1177e invoke(E e10) {
            InterfaceC1180h interfaceC1180hQ = e10.N0().q();
            if (interfaceC1180hQ instanceof InterfaceC1177e) {
                return (InterfaceC1177e) interfaceC1180hQ;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Xc.g c10, InterfaceC2915g jClass, Wc.c ownerDescriptor) {
        super(c10);
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(jClass, "jClass");
        AbstractC4862t.e(ownerDescriptor, "ownerDescriptor");
        this.f20019n = jClass;
        this.f20020o = ownerDescriptor;
    }

    public static final Iterable P(InterfaceC1177e interfaceC1177e) {
        Collection collectionO = interfaceC1177e.k().o();
        AbstractC4862t.d(collectionO, "it.typeConstructor.supertypes");
        return t.v(t.J(C4179C.X(collectionO), d.f20024a));
    }

    @Override // Yc.j
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public Yc.a p() {
        return new Yc.a(this.f20019n, a.f20021a);
    }

    public final Set O(InterfaceC1177e interfaceC1177e, Set set, vc.l lVar) {
        Md.b.b(C4205s.d(interfaceC1177e), k.f20018a, new e(interfaceC1177e, set, lVar));
        return set;
    }

    @Override // Yc.j
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public Wc.c C() {
        return this.f20020o;
    }

    public final U R(U u10) {
        if (u10.f().a()) {
            return u10;
        }
        Collection<U> collectionD = u10.d();
        AbstractC4862t.d(collectionD, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C4207u.v(collectionD, 10));
        for (U it : collectionD) {
            AbstractC4862t.d(it, "it");
            arrayList.add(R(it));
        }
        return (U) C4179C.F0(C4179C.a0(arrayList));
    }

    public final Set S(kd.f fVar, InterfaceC1177e interfaceC1177e) {
        l lVarB = Wc.h.b(interfaceC1177e);
        return lVarB == null ? gc.U.d() : C4179C.Z0(lVarB.a(fVar, Tc.d.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return null;
    }

    @Override // Yc.j
    public Set l(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        return gc.U.d();
    }

    @Override // Yc.j
    public Set n(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        Set setY0 = C4179C.Y0(((Yc.b) y().invoke()).a());
        l lVarB = Wc.h.b(C());
        Set setB = lVarB != null ? lVarB.b() : null;
        if (setB == null) {
            setB = gc.U.d();
        }
        setY0.addAll(setB);
        if (this.f20019n.v()) {
            setY0.addAll(C4206t.n(Ic.j.f5724f, Ic.j.f5722d));
        }
        setY0.addAll(w().a().w().f(w(), C()));
        return setY0;
    }

    @Override // Yc.j
    public void o(Collection result, kd.f name) {
        AbstractC4862t.e(result, "result");
        AbstractC4862t.e(name, "name");
        w().a().w().d(w(), C(), name, result);
    }

    @Override // Yc.j
    public void r(Collection result, kd.f name) {
        AbstractC4862t.e(result, "result");
        AbstractC4862t.e(name, "name");
        Collection collectionE = Vc.a.e(name, S(name, C()), result, C(), w().a().c(), w().a().k().a());
        AbstractC4862t.d(collectionE, "resolveOverridesForStati…rridingUtil\n            )");
        result.addAll(collectionE);
        if (this.f20019n.v()) {
            if (AbstractC4862t.a(name, Ic.j.f5724f)) {
                Z zG = AbstractC5282d.g(C());
                AbstractC4862t.d(zG, "createEnumValueOfMethod(ownerDescriptor)");
                result.add(zG);
            } else if (AbstractC4862t.a(name, Ic.j.f5722d)) {
                Z zH = AbstractC5282d.h(C());
                AbstractC4862t.d(zH, "createEnumValuesMethod(ownerDescriptor)");
                result.add(zH);
            }
        }
    }

    @Override // Yc.m, Yc.j
    public void s(kd.f name, Collection result) {
        kd.f fVar;
        Collection collection;
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(result, "result");
        Set setO = O(C(), new LinkedHashSet(), new b(name));
        if (result.isEmpty()) {
            fVar = name;
            collection = result;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setO) {
                U uR = R((U) obj);
                Object arrayList = linkedHashMap.get(uR);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(uR, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = Vc.a.e(fVar, (Collection) ((Map.Entry) it.next()).getValue(), collection, C(), w().a().c(), w().a().k().a());
                AbstractC4862t.d(collectionE, "resolveOverridesForStati…ingUtil\n                )");
                y.C(arrayList2, collectionE);
            }
            collection.addAll(arrayList2);
        } else {
            Collection collectionE2 = Vc.a.e(name, setO, result, C(), w().a().c(), w().a().k().a());
            fVar = name;
            collection = result;
            AbstractC4862t.d(collectionE2, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(collectionE2);
        }
        if (this.f20019n.v() && AbstractC4862t.a(fVar, Ic.j.f5723e)) {
            Md.a.a(collection, AbstractC5282d.f(C()));
        }
    }

    @Override // Yc.j
    public Set t(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        Set setY0 = C4179C.Y0(((Yc.b) y().invoke()).e());
        O(C(), setY0, c.f20023a);
        if (this.f20019n.v()) {
            setY0.add(Ic.j.f5723e);
        }
        return setY0;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends b.AbstractC0144b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1177e f20025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f20026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ vc.l f20027c;

        public e(InterfaceC1177e interfaceC1177e, Set set, vc.l lVar) {
            this.f20025a = interfaceC1177e;
            this.f20026b = set;
            this.f20027c = lVar;
        }

        @Override // Md.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return C4015H.f34254a;
        }

        @Override // Md.b.AbstractC0144b, Md.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(InterfaceC1177e current) {
            AbstractC4862t.e(current, "current");
            if (current == this.f20025a) {
                return true;
            }
            InterfaceC6099h interfaceC6099hL0 = current.l0();
            AbstractC4862t.d(interfaceC6099hL0, "current.staticScope");
            if (!(interfaceC6099hL0 instanceof m)) {
                return true;
            }
            this.f20026b.addAll((Collection) this.f20027c.invoke(interfaceC6099hL0));
            return false;
        }

        public void e() {
        }
    }
}
