package Yc;

import Cd.E;
import Cd.p0;
import Cd.q0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.D;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1196y;
import Lc.U;
import Lc.X;
import Lc.Z;
import Lc.f0;
import Lc.j0;
import Md.f;
import Oc.C1812f;
import Oc.C1820n;
import Oc.L;
import Uc.A;
import Uc.B;
import Uc.C2303e;
import Uc.C2304f;
import Uc.C2307i;
import Uc.F;
import Uc.H;
import Uc.I;
import Uc.J;
import Uc.p;
import Uc.s;
import Uc.t;
import Vc.j;
import Yc.j;
import bd.InterfaceC2914f;
import bd.InterfaceC2915g;
import bd.InterfaceC2919k;
import bd.InterfaceC2922n;
import bd.q;
import bd.r;
import bd.x;
import cd.C3110l;
import dd.w;
import fc.C4034q;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import gc.V;
import gc.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import od.AbstractC5282d;
import od.AbstractC5283e;
import od.C5289k;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import vd.C6095d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends Yc.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC1177e f19935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2915g f19936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f19937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Bd.i f19938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Bd.i f19939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bd.i f19940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bd.i f19941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bd.h f19942u;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19943a = new a();

        public a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(q it) {
            AbstractC4862t.e(it, "it");
            return Boolean.valueOf(!it.P());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class b extends AbstractC4859p implements vc.l {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(kd.f p02) {
            AbstractC4862t.e(p02, "p0");
            return ((g) this.receiver).J0(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c extends AbstractC4859p implements vc.l {
        public c(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(g.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(kd.f p02) {
            AbstractC4862t.e(p02, "p0");
            return ((g) this.receiver).K0(p02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements vc.l {
        public d() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(kd.f it) {
            AbstractC4862t.e(it, "it");
            return g.this.J0(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements vc.l {
        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(kd.f it) {
            AbstractC4862t.e(it, "it");
            return g.this.K0(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Xc.g f19947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Xc.g gVar) {
            super(0);
            this.f19947b = gVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            Collection collectionL = g.this.f19936o.l();
            ArrayList arrayList = new ArrayList(collectionL.size());
            Iterator it = collectionL.iterator();
            while (it.hasNext()) {
                arrayList.add(g.this.H0((InterfaceC2919k) it.next()));
            }
            if (g.this.f19936o.p()) {
                InterfaceC1176d interfaceC1176dF0 = g.this.f0();
                String strC = w.c(interfaceC1176dF0, false, false, 2, null);
                if (arrayList.isEmpty()) {
                    arrayList.add(interfaceC1176dF0);
                    this.f19947b.a().h().a(g.this.f19936o, interfaceC1176dF0);
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (AbstractC4862t.a(w.c((InterfaceC1176d) it2.next(), false, false, 2, null), strC)) {
                            break;
                        }
                    }
                    arrayList.add(interfaceC1176dF0);
                    this.f19947b.a().h().a(g.this.f19936o, interfaceC1176dF0);
                }
            }
            Xc.g gVar = this.f19947b;
            gVar.a().w().a(gVar, g.this.C(), arrayList);
            C3110l c3110lR = this.f19947b.a().r();
            Xc.g gVar2 = this.f19947b;
            g gVar3 = g.this;
            boolean zIsEmpty = arrayList.isEmpty();
            List listO = arrayList;
            if (zIsEmpty) {
                listO = C4206t.o(gVar3.e0());
            }
            return C4179C.V0(c3110lR.g(gVar2, listO));
        }
    }

    /* JADX INFO: renamed from: Yc.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0254g extends v implements InterfaceC6082a {
        public C0254g() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            Collection collectionX = g.this.f19936o.x();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionX) {
                if (((InterfaceC2922n) obj).I()) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((InterfaceC2922n) obj2).getName(), obj2);
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Xc.g f19949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f19950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Xc.g gVar, g gVar2) {
            super(0);
            this.f19949a = gVar;
            this.f19950b = gVar2;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            Xc.g gVar = this.f19949a;
            return C4179C.Z0(gVar.a().w().c(gVar, this.f19950b.C()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z f19951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f19952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Z z10, g gVar) {
            super(1);
            this.f19951a = z10;
            this.f19952b = gVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(kd.f accessorName) {
            AbstractC4862t.e(accessorName, "accessorName");
            return AbstractC4862t.a(this.f19951a.getName(), accessorName) ? C4205s.d(this.f19951a) : C4179C.C0(this.f19952b.J0(accessorName), this.f19952b.K0(accessorName));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j extends v implements InterfaceC6082a {
        public j() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return C4179C.Z0(g.this.f19936o.A());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k extends v implements vc.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Xc.g f19955b;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f19956a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar) {
                super(0);
                this.f19956a = gVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                return V.k(this.f19956a.b(), this.f19956a.d());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Xc.g gVar) {
            super(1);
            this.f19955b = gVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1177e invoke(kd.f name) {
            AbstractC4862t.e(name, "name");
            if (((Set) g.this.f19939r.invoke()).contains(name)) {
                p pVarD = this.f19955b.a().d();
                kd.b bVarK = AbstractC5823c.k(g.this.C());
                AbstractC4862t.b(bVarK);
                kd.b bVarD = bVarK.d(name);
                AbstractC4862t.d(bVarD, "ownerDescriptor.classId!…createNestedClassId(name)");
                InterfaceC2915g interfaceC2915gC = pVarD.c(new p.a(bVarD, null, g.this.f19936o, 2, null));
                if (interfaceC2915gC == null) {
                    return null;
                }
                Xc.g gVar = this.f19955b;
                Yc.f fVar = new Yc.f(gVar, g.this.C(), interfaceC2915gC, null, 8, null);
                gVar.a().e().a(fVar);
                return fVar;
            }
            if (!((Set) g.this.f19940s.invoke()).contains(name)) {
                InterfaceC2922n interfaceC2922n = (InterfaceC2922n) ((Map) g.this.f19941t.invoke()).get(name);
                if (interfaceC2922n == null) {
                    return null;
                }
                return C1820n.L0(this.f19955b.e(), g.this.C(), name, this.f19955b.e().f(new a(g.this)), Xc.e.a(this.f19955b, interfaceC2922n), this.f19955b.a().t().a(interfaceC2922n));
            }
            Xc.g gVar2 = this.f19955b;
            g gVar3 = g.this;
            List listC = C4205s.c();
            gVar2.a().w().e(gVar2, gVar3.C(), name, listC);
            List listA = C4205s.a(listC);
            int size = listA.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (InterfaceC1177e) C4179C.F0(listA);
            }
            throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
        }
    }

    public /* synthetic */ g(Xc.g gVar, InterfaceC1177e interfaceC1177e, InterfaceC2915g interfaceC2915g, boolean z10, g gVar2, int i10, AbstractC4854k abstractC4854k) {
        this(gVar, interfaceC1177e, interfaceC2915g, z10, (i10 & 16) != 0 ? null : gVar2);
    }

    public static /* synthetic */ Wc.f k0(g gVar, r rVar, E e10, D d10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e10 = null;
        }
        return gVar.j0(rVar, e10, d10);
    }

    public final Set A0(kd.f fVar) {
        Collection collectionC0 = c0();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection collectionC = ((E) it.next()).o().c(fVar, Tc.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C4207u.v(collectionC, 10));
            Iterator it2 = collectionC.iterator();
            while (it2.hasNext()) {
                arrayList2.add((U) it2.next());
            }
            y.C(arrayList, arrayList2);
        }
        return C4179C.Z0(arrayList);
    }

    public final boolean B0(Z z10, InterfaceC1196y interfaceC1196y) {
        String strC = w.c(z10, false, false, 2, null);
        InterfaceC1196y interfaceC1196yA = interfaceC1196y.a();
        AbstractC4862t.d(interfaceC1196yA, "builtinWithErasedParameters.original");
        return AbstractC4862t.a(strC, w.c(interfaceC1196yA, false, false, 2, null)) && !p0(z10, interfaceC1196y);
    }

    public final boolean C0(Z z10) {
        kd.f name = z10.getName();
        AbstractC4862t.d(name, "function.name");
        List listA = F.a(name);
        if (listA == null || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set<U> setA0 = A0((kd.f) it.next());
                if (setA0 == null || !setA0.isEmpty()) {
                    for (U u10 : setA0) {
                        if (o0(u10, new i(z10, this))) {
                            if (!u10.L()) {
                                String strB = z10.getName().b();
                                AbstractC4862t.d(strB, "function.name.asString()");
                                if (!A.d(strB)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (q0(z10) || L0(z10) || s0(z10)) ? false : true;
    }

    public final Z D0(Z z10, vc.l lVar, Collection collection) {
        Z zH0;
        InterfaceC1196y interfaceC1196yK = C2304f.k(z10);
        if (interfaceC1196yK != null && (zH0 = h0(interfaceC1196yK, lVar)) != null) {
            if (!C0(zH0)) {
                zH0 = null;
            }
            if (zH0 != null) {
                return g0(zH0, interfaceC1196yK, collection);
            }
        }
        return null;
    }

    public final Z E0(Z z10, vc.l lVar, kd.f fVar, Collection collection) {
        Z z11 = (Z) H.d(z10);
        if (z11 == null) {
            return null;
        }
        String strB = H.b(z11);
        AbstractC4862t.b(strB);
        kd.f fVarS = kd.f.s(strB);
        AbstractC4862t.d(fVarS, "identifier(nameInJava)");
        Iterator it = ((Collection) lVar.invoke(fVarS)).iterator();
        while (it.hasNext()) {
            Z zM0 = m0((Z) it.next(), fVar);
            if (r0(z11, zM0)) {
                return g0(zM0, z11, collection);
            }
        }
        return null;
    }

    public final Z F0(Z z10, vc.l lVar) {
        if (!z10.isSuspend()) {
            return null;
        }
        kd.f name = z10.getName();
        AbstractC4862t.d(name, "descriptor.name");
        Iterator it = ((Iterable) lVar.invoke(name)).iterator();
        while (it.hasNext()) {
            Z zN0 = n0((Z) it.next());
            if (zN0 == null || !p0(zN0, z10)) {
                zN0 = null;
            }
            if (zN0 != null) {
                return zN0;
            }
        }
        return null;
    }

    @Override // Yc.j
    public boolean G(Wc.e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        if (this.f19936o.m()) {
            return false;
        }
        return C0(eVar);
    }

    public void G0(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        Sc.a.a(w().a().l(), location, C(), name);
    }

    @Override // Yc.j
    public j.a H(r method, List methodTypeParameters, E returnType, List valueParameters) {
        AbstractC4862t.e(method, "method");
        AbstractC4862t.e(methodTypeParameters, "methodTypeParameters");
        AbstractC4862t.e(returnType, "returnType");
        AbstractC4862t.e(valueParameters, "valueParameters");
        j.b bVarB = w().a().s().b(method, C(), returnType, null, valueParameters, methodTypeParameters);
        AbstractC4862t.d(bVarB, "c.components.signaturePr…dTypeParameters\n        )");
        E eD = bVarB.d();
        AbstractC4862t.d(eD, "propagated.returnType");
        E eC = bVarB.c();
        List listF = bVarB.f();
        AbstractC4862t.d(listF, "propagated.valueParameters");
        List listE = bVarB.e();
        AbstractC4862t.d(listE, "propagated.typeParameters");
        boolean zG = bVarB.g();
        List listB = bVarB.b();
        AbstractC4862t.d(listB, "propagated.errors");
        return new j.a(eD, eC, listF, listE, zG, listB);
    }

    public final Wc.b H0(InterfaceC2919k interfaceC2919k) {
        InterfaceC1177e interfaceC1177eC = C();
        Wc.b bVarT1 = Wc.b.t1(interfaceC1177eC, Xc.e.a(w(), interfaceC2919k), false, w().a().t().a(interfaceC2919k));
        AbstractC4862t.d(bVarT1, "createJavaConstructor(\n …ce(constructor)\n        )");
        Xc.g gVarE = Xc.a.e(w(), bVarT1, interfaceC2919k, interfaceC1177eC.q().size());
        j.b bVarK = K(gVarE, bVarT1, interfaceC2919k.i());
        List listQ = interfaceC1177eC.q();
        AbstractC4862t.d(listQ, "classDescriptor.declaredTypeParameters");
        List typeParameters = interfaceC2919k.getTypeParameters();
        ArrayList arrayList = new ArrayList(C4207u.v(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            f0 f0VarA = gVarE.f().a((bd.y) it.next());
            AbstractC4862t.b(f0VarA);
            arrayList.add(f0VarA);
        }
        bVarT1.r1(bVarK.a(), J.d(interfaceC2919k.getVisibility()), C4179C.C0(listQ, arrayList));
        bVarT1.Y0(false);
        bVarT1.Z0(bVarK.b());
        bVarT1.g1(interfaceC1177eC.p());
        gVarE.a().h().a(interfaceC2919k, bVarT1);
        return bVarT1;
    }

    public final Wc.e I0(bd.w wVar) {
        Wc.e eVarP1 = Wc.e.p1(C(), Xc.e.a(w(), wVar), wVar.getName(), w().a().t().a(wVar), true);
        AbstractC4862t.d(eVarP1, "createJavaMethod(\n      …omponent), true\n        )");
        eVarP1.o1(null, z(), C4206t.k(), C4206t.k(), C4206t.k(), w().g().o(wVar.getType(), Zc.b.b(p0.COMMON, false, false, null, 6, null)), D.Companion.a(false, false, true), AbstractC1191t.f8775e, null);
        eVarP1.s1(false, false);
        w().a().h().d(wVar, eVarP1);
        return eVarP1;
    }

    public final Collection J0(kd.f fVar) {
        Collection collectionC = ((Yc.b) y().invoke()).c(fVar);
        ArrayList arrayList = new ArrayList(C4207u.v(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(I((r) it.next()));
        }
        return arrayList;
    }

    public final Collection K0(kd.f fVar) {
        Set setY0 = y0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setY0) {
            Z z10 = (Z) obj;
            if (!H.a(z10) && C2304f.k(z10) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean L0(Z z10) {
        C2304f c2304f = C2304f.f16916n;
        kd.f name = z10.getName();
        AbstractC4862t.d(name, "name");
        if (!c2304f.l(name)) {
            return false;
        }
        kd.f name2 = z10.getName();
        AbstractC4862t.d(name2, "name");
        Set setY0 = y0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = setY0.iterator();
        while (it.hasNext()) {
            InterfaceC1196y interfaceC1196yK = C2304f.k((Z) it.next());
            if (interfaceC1196yK != null) {
                arrayList.add(interfaceC1196yK);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (B0(z10, (InterfaceC1196y) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final void V(List list, InterfaceC1184l interfaceC1184l, int i10, r rVar, E e10, E e11) {
        Mc.g gVarB = Mc.g.f9435K.b();
        kd.f name = rVar.getName();
        E eN = q0.n(e10);
        AbstractC4862t.d(eN, "makeNotNullable(returnType)");
        list.add(new L(interfaceC1184l, null, i10, gVarB, name, eN, rVar.M(), false, false, e11 != null ? q0.n(e11) : null, w().a().t().a(rVar)));
    }

    public final void W(Collection collection, kd.f fVar, Collection collection2, boolean z10) {
        Collection<Z> collectionD = Vc.a.d(fVar, collection2, collection, C(), w().a().c(), w().a().k().a());
        AbstractC4862t.d(collectionD, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        List listC0 = C4179C.C0(collection, collectionD);
        ArrayList arrayList = new ArrayList(C4207u.v(collectionD, 10));
        for (Z resolvedOverride : collectionD) {
            Z z11 = (Z) H.e(resolvedOverride);
            if (z11 == null) {
                AbstractC4862t.d(resolvedOverride, "resolvedOverride");
            } else {
                AbstractC4862t.d(resolvedOverride, "resolvedOverride");
                resolvedOverride = g0(resolvedOverride, z11, listC0);
            }
            arrayList.add(resolvedOverride);
        }
        collection.addAll(arrayList);
    }

    public final void X(kd.f fVar, Collection collection, Collection collection2, Collection collection3, vc.l lVar) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            Z z10 = (Z) it.next();
            Md.a.a(collection3, E0(z10, lVar, fVar, collection));
            Md.a.a(collection3, D0(z10, lVar, collection));
            Md.a.a(collection3, F0(z10, lVar));
        }
    }

    public final void Y(Set set, Collection collection, Set set2, vc.l lVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            U u10 = (U) it.next();
            Wc.f fVarI0 = i0(u10, lVar);
            if (fVarI0 != null) {
                collection.add(fVarI0);
                if (set2 != null) {
                    set2.add(u10);
                    return;
                }
                return;
            }
        }
    }

    public final void Z(kd.f fVar, Collection collection) {
        r rVar = (r) C4179C.G0(((Yc.b) y().invoke()).c(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(k0(this, rVar, null, D.FINAL, 2, null));
    }

    @Override // Yc.j, vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        G0(name, location);
        return super.a(name, location);
    }

    @Override // Yc.j
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet n(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        Collection collectionO = C().k().o();
        AbstractC4862t.d(collectionO, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionO.iterator();
        while (it.hasNext()) {
            y.C(linkedHashSet, ((E) it.next()).o().b());
        }
        linkedHashSet.addAll(((Yc.b) y().invoke()).a());
        linkedHashSet.addAll(((Yc.b) y().invoke()).d());
        linkedHashSet.addAll(l(kindFilter, lVar));
        linkedHashSet.addAll(w().a().w().b(w(), C()));
        return linkedHashSet;
    }

    @Override // Yc.j
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Yc.a p() {
        return new Yc.a(this.f19936o, a.f19943a);
    }

    @Override // Yc.j, vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        G0(name, location);
        return super.c(name, location);
    }

    public final Collection c0() {
        if (!this.f19937p) {
            return w().a().k().d().g(C());
        }
        Collection collectionO = C().k().o();
        AbstractC4862t.d(collectionO, "ownerDescriptor.typeConstructor.supertypes");
        return collectionO;
    }

    public final List d0(C1812f c1812f) {
        g gVar;
        C1812f c1812f2;
        C4034q c4034q;
        Collection collectionB = this.f19936o.B();
        ArrayList arrayList = new ArrayList(collectionB.size());
        Zc.a aVarB = Zc.b.b(p0.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionB) {
            if (AbstractC4862t.a(((r) obj).getName(), B.f16841c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        C4034q c4034q2 = new C4034q(arrayList2, arrayList3);
        List list = (List) c4034q2.a();
        List<r> list2 = (List) c4034q2.b();
        list.size();
        r rVar = (r) C4179C.j0(list);
        if (rVar != null) {
            x returnType = rVar.getReturnType();
            if (returnType instanceof InterfaceC2914f) {
                InterfaceC2914f interfaceC2914f = (InterfaceC2914f) returnType;
                c4034q = new C4034q(w().g().k(interfaceC2914f, aVarB, true), w().g().o(interfaceC2914f.h(), aVarB));
            } else {
                c4034q = new C4034q(w().g().o(returnType, aVarB), null);
            }
            E e10 = (E) c4034q.a();
            E e11 = (E) c4034q.b();
            gVar = this;
            c1812f2 = c1812f;
            gVar.V(arrayList, c1812f2, 0, rVar, e10, e11);
        } else {
            gVar = this;
            c1812f2 = c1812f;
        }
        int i10 = 0;
        int i11 = rVar == null ? 0 : 1;
        for (r rVar2 : list2) {
            gVar.V(arrayList, c1812f2, i10 + i11, rVar2, gVar.w().g().o(rVar2.getReturnType(), aVarB), null);
            i10++;
        }
        return arrayList;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        Bd.h hVar;
        InterfaceC1177e interfaceC1177e;
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        G0(name, location);
        g gVar = (g) B();
        return (gVar == null || (hVar = gVar.f19942u) == null || (interfaceC1177e = (InterfaceC1177e) hVar.invoke(name)) == null) ? (InterfaceC1180h) this.f19942u.invoke(name) : interfaceC1177e;
    }

    public final InterfaceC1176d e0() {
        boolean zM = this.f19936o.m();
        if ((this.f19936o.J() || !this.f19936o.q()) && !zM) {
            return null;
        }
        InterfaceC1177e interfaceC1177eC = C();
        Wc.b bVarT1 = Wc.b.t1(interfaceC1177eC, Mc.g.f9435K.b(), true, w().a().t().a(this.f19936o));
        AbstractC4862t.d(bVarT1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List listD0 = zM ? d0(bVarT1) : Collections.EMPTY_LIST;
        bVarT1.Z0(false);
        bVarT1.q1(listD0, w0(interfaceC1177eC));
        bVarT1.Y0(true);
        bVarT1.g1(interfaceC1177eC.p());
        w().a().h().a(this.f19936o, bVarT1);
        return bVarT1;
    }

    public final InterfaceC1176d f0() {
        InterfaceC1177e interfaceC1177eC = C();
        Wc.b bVarT1 = Wc.b.t1(interfaceC1177eC, Mc.g.f9435K.b(), true, w().a().t().a(this.f19936o));
        AbstractC4862t.d(bVarT1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List listL0 = l0(bVarT1);
        bVarT1.Z0(false);
        bVarT1.q1(listL0, w0(interfaceC1177eC));
        bVarT1.Y0(false);
        bVarT1.g1(interfaceC1177eC.p());
        return bVarT1;
    }

    public final Z g0(Z z10, InterfaceC1173a interfaceC1173a, Collection collection) {
        if (collection != null && collection.isEmpty()) {
            return z10;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Z z11 = (Z) it.next();
            if (!AbstractC4862t.a(z10, z11) && z11.q0() == null && p0(z11, interfaceC1173a)) {
                InterfaceC1196y interfaceC1196yBuild = z10.u().j().build();
                AbstractC4862t.b(interfaceC1196yBuild);
                return (Z) interfaceC1196yBuild;
            }
        }
        return z10;
    }

    public final Z h0(InterfaceC1196y interfaceC1196y, vc.l lVar) {
        Object next;
        kd.f name = interfaceC1196y.getName();
        AbstractC4862t.d(name, "overridden.name");
        Iterator it = ((Iterable) lVar.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (B0((Z) next, interfaceC1196y)) {
                break;
            }
        }
        Z z10 = (Z) next;
        if (z10 == null) {
            return null;
        }
        InterfaceC1196y.a aVarU = z10.u();
        List listI = interfaceC1196y.i();
        AbstractC4862t.d(listI, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(C4207u.v(listI, 10));
        Iterator it2 = listI.iterator();
        while (it2.hasNext()) {
            arrayList.add(((j0) it2.next()).getType());
        }
        List listI2 = z10.i();
        AbstractC4862t.d(listI2, "override.valueParameters");
        aVarU.c(Wc.h.a(arrayList, listI2, interfaceC1196y));
        aVarU.t();
        aVarU.o();
        aVarU.g(Wc.e.f17889H, Boolean.TRUE);
        return (Z) aVarU.build();
    }

    public final Wc.f i0(U u10, vc.l lVar) {
        Z zV0;
        Oc.E eM = null;
        if (!o0(u10, lVar)) {
            return null;
        }
        Z zU0 = u0(u10, lVar);
        AbstractC4862t.b(zU0);
        if (u10.L()) {
            zV0 = v0(u10, lVar);
            AbstractC4862t.b(zV0);
        } else {
            zV0 = null;
        }
        if (zV0 != null) {
            zV0.r();
            zU0.r();
        }
        Wc.d dVar = new Wc.d(C(), zU0, zV0, u10);
        E returnType = zU0.getReturnType();
        AbstractC4862t.b(returnType);
        dVar.b1(returnType, C4206t.k(), z(), null, C4206t.k());
        Oc.D dK = AbstractC5282d.k(dVar, zU0.getAnnotations(), false, false, false, zU0.j());
        dK.M0(zU0);
        dK.P0(dVar.getType());
        AbstractC4862t.d(dK, "createGetter(\n          …escriptor.type)\n        }");
        if (zV0 != null) {
            List listI = zV0.i();
            AbstractC4862t.d(listI, "setterMethod.valueParameters");
            j0 j0Var = (j0) C4179C.j0(listI);
            if (j0Var == null) {
                throw new AssertionError("No parameter found for " + zV0);
            }
            eM = AbstractC5282d.m(dVar, zV0.getAnnotations(), j0Var.getAnnotations(), false, false, false, zV0.getVisibility(), zV0.j());
            eM.M0(zV0);
        }
        dVar.U0(dK, eM);
        return dVar;
    }

    public final Wc.f j0(r rVar, E e10, D d10) {
        Wc.f fVar;
        g gVar;
        E eQ;
        Wc.f fVarF1 = Wc.f.f1(C(), Xc.e.a(w(), rVar), d10, J.d(rVar.getVisibility()), false, rVar.getName(), w().a().t().a(rVar), false);
        AbstractC4862t.d(fVarF1, "create(\n            owne…inal = */ false\n        )");
        Oc.D d11 = AbstractC5282d.d(fVarF1, Mc.g.f9435K.b());
        AbstractC4862t.d(d11, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        fVarF1.U0(d11, null);
        if (e10 == null) {
            Xc.g gVarF = Xc.a.f(w(), fVarF1, rVar, 0, 4, null);
            fVar = fVarF1;
            gVar = this;
            eQ = gVar.q(rVar, gVarF);
        } else {
            fVar = fVarF1;
            gVar = this;
            eQ = e10;
        }
        fVar.b1(eQ, C4206t.k(), gVar.z(), null, C4206t.k());
        d11.P0(eQ);
        return fVar;
    }

    @Override // Yc.j
    public Set l(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        return V.k((Set) this.f19939r.invoke(), ((Map) this.f19941t.invoke()).keySet());
    }

    public final List l0(C1812f c1812f) {
        Collection collectionG = this.f19936o.g();
        ArrayList arrayList = new ArrayList(collectionG.size());
        Zc.a aVarB = Zc.b.b(p0.COMMON, false, false, null, 6, null);
        Iterator it = collectionG.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            bd.w wVar = (bd.w) it.next();
            E eO = w().g().o(wVar.getType(), aVarB);
            arrayList.add(new L(c1812f, null, i11, Mc.g.f9435K.b(), wVar.getName(), eO, false, false, false, wVar.k() ? w().a().m().n().k(eO) : null, w().a().t().a(wVar)));
        }
    }

    public final Z m0(Z z10, kd.f fVar) {
        InterfaceC1196y.a aVarU = z10.u();
        aVarU.p(fVar);
        aVarU.t();
        aVarU.o();
        InterfaceC1196y interfaceC1196yBuild = aVarU.build();
        AbstractC4862t.b(interfaceC1196yBuild);
        return (Z) interfaceC1196yBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Lc.Z n0(Lc.Z r5) {
        /*
            r4 = this;
            java.util.List r4 = r5.i()
            java.lang.String r0 = "valueParameters"
            kotlin.jvm.internal.AbstractC4862t.d(r4, r0)
            java.lang.Object r4 = gc.C4179C.u0(r4)
            Lc.j0 r4 = (Lc.j0) r4
            r1 = 0
            if (r4 == 0) goto L7e
            Cd.E r2 = r4.getType()
            Cd.e0 r2 = r2.N0()
            Lc.h r2 = r2.q()
            if (r2 == 0) goto L35
            kd.d r2 = sd.AbstractC5823c.m(r2)
            if (r2 == 0) goto L35
            boolean r3 = r2.f()
            if (r3 == 0) goto L2d
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 == 0) goto L35
            kd.c r2 = r2.l()
            goto L36
        L35:
            r2 = r1
        L36:
            kd.c r3 = Ic.j.f5734p
            boolean r2 = kotlin.jvm.internal.AbstractC4862t.a(r2, r3)
            if (r2 == 0) goto L3f
            goto L40
        L3f:
            r4 = r1
        L40:
            if (r4 != 0) goto L43
            goto L7e
        L43:
            Lc.y$a r1 = r5.u()
            java.util.List r5 = r5.i()
            kotlin.jvm.internal.AbstractC4862t.d(r5, r0)
            r0 = 1
            java.util.List r5 = gc.C4179C.c0(r5, r0)
            Lc.y$a r5 = r1.c(r5)
            Cd.E r4 = r4.getType()
            java.util.List r4 = r4.L0()
            r1 = 0
            java.lang.Object r4 = r4.get(r1)
            Cd.i0 r4 = (Cd.i0) r4
            Cd.E r4 = r4.getType()
            Lc.y$a r4 = r5.h(r4)
            Lc.y r4 = r4.build()
            Lc.Z r4 = (Lc.Z) r4
            r5 = r4
            Oc.G r5 = (Oc.G) r5
            if (r5 != 0) goto L7a
            return r4
        L7a:
            r5.h1(r0)
            return r4
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Yc.g.n0(Lc.Z):Lc.Z");
    }

    @Override // Yc.j
    public void o(Collection result, kd.f name) {
        AbstractC4862t.e(result, "result");
        AbstractC4862t.e(name, "name");
        if (this.f19936o.p() && ((Yc.b) y().invoke()).f(name) != null) {
            if (result.isEmpty()) {
                bd.w wVarF = ((Yc.b) y().invoke()).f(name);
                AbstractC4862t.b(wVarF);
                result.add(I0(wVarF));
            } else {
                Iterator it = result.iterator();
                while (it.hasNext()) {
                    if (((Z) it.next()).i().isEmpty()) {
                        break;
                    }
                }
                bd.w wVarF2 = ((Yc.b) y().invoke()).f(name);
                AbstractC4862t.b(wVarF2);
                result.add(I0(wVarF2));
            }
        }
        w().a().w().g(w(), C(), name, result);
    }

    public final boolean o0(U u10, vc.l lVar) {
        if (Yc.c.a(u10)) {
            return false;
        }
        Z zU0 = u0(u10, lVar);
        Z zV0 = v0(u10, lVar);
        if (zU0 == null) {
            return false;
        }
        if (u10.L()) {
            return zV0 != null && zV0.r() == zU0.r();
        }
        return true;
    }

    public final boolean p0(InterfaceC1173a interfaceC1173a, InterfaceC1173a interfaceC1173a2) {
        C5289k.i.a aVarC = C5289k.f41544f.F(interfaceC1173a2, interfaceC1173a, true).c();
        AbstractC4862t.d(aVarC, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return aVarC == C5289k.i.a.OVERRIDABLE && !t.f16943a.a(interfaceC1173a2, interfaceC1173a);
    }

    public final boolean q0(Z z10) {
        I.a aVar = I.f16886a;
        kd.f name = z10.getName();
        AbstractC4862t.d(name, "name");
        kd.f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        Set setY0 = y0(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setY0) {
            if (H.a((Z) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Z zM0 = m0(z10, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (r0((Z) it.next(), zM0)) {
                return true;
            }
        }
        return false;
    }

    @Override // Yc.j
    public void r(Collection result, kd.f name) {
        AbstractC4862t.e(result, "result");
        AbstractC4862t.e(name, "name");
        Set setY0 = y0(name);
        if (!I.f16886a.k(name) && !C2304f.f16916n.l(name)) {
            if (setY0 == null || !setY0.isEmpty()) {
                Iterator it = setY0.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC1196y) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : setY0) {
                if (C0((Z) obj)) {
                    arrayList.add(obj);
                }
            }
            W(result, name, arrayList, false);
            return;
        }
        Md.f fVarA = Md.f.f9471c.a();
        Collection collectionD = Vc.a.d(name, setY0, C4206t.k(), C(), yd.r.f48611a, w().a().k().a());
        AbstractC4862t.d(collectionD, "resolveOverridesForNonSt….overridingUtil\n        )");
        X(name, result, collectionD, result, new b(this));
        X(name, result, collectionD, fVarA, new c(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setY0) {
            if (C0((Z) obj2)) {
                arrayList2.add(obj2);
            }
        }
        W(result, name, C4179C.C0(arrayList2, fVarA), true);
    }

    public final boolean r0(Z z10, InterfaceC1196y interfaceC1196y) {
        if (C2303e.f16914n.k(z10)) {
            interfaceC1196y = interfaceC1196y.a();
        }
        AbstractC4862t.d(interfaceC1196y, "if (superDescriptor.isRe…iginal else subDescriptor");
        return p0(interfaceC1196y, z10);
    }

    @Override // Yc.j
    public void s(kd.f name, Collection result) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(result, "result");
        if (this.f19936o.m()) {
            Z(name, result);
        }
        Set setA0 = A0(name);
        if (setA0.isEmpty()) {
            return;
        }
        f.b bVar = Md.f.f9471c;
        Md.f fVarA = bVar.a();
        Md.f fVarA2 = bVar.a();
        Y(setA0, result, fVarA, new d());
        Y(V.i(setA0, fVarA), fVarA2, null, new e());
        Collection collectionD = Vc.a.d(name, V.k(setA0, fVarA2), result, C(), w().a().c(), w().a().k().a());
        AbstractC4862t.d(collectionD, "resolveOverridesForNonSt…rridingUtil\n            )");
        result.addAll(collectionD);
    }

    public final boolean s0(Z z10) {
        Z zN0 = n0(z10);
        if (zN0 == null) {
            return false;
        }
        kd.f name = z10.getName();
        AbstractC4862t.d(name, "name");
        Set<Z> setY0 = y0(name);
        if (setY0 != null && setY0.isEmpty()) {
            return false;
        }
        for (Z z11 : setY0) {
            if (z11.isSuspend() && p0(zN0, z11)) {
                return true;
            }
        }
        return false;
    }

    @Override // Yc.j
    public Set t(C6095d kindFilter, vc.l lVar) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        if (this.f19936o.m()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((Yc.b) y().invoke()).e());
        Collection collectionO = C().k().o();
        AbstractC4862t.d(collectionO, "ownerDescriptor.typeConstructor.supertypes");
        Iterator it = collectionO.iterator();
        while (it.hasNext()) {
            y.C(linkedHashSet, ((E) it.next()).o().d());
        }
        return linkedHashSet;
    }

    public final Z t0(U u10, String str, vc.l lVar) {
        Z z10;
        kd.f fVarS = kd.f.s(str);
        AbstractC4862t.d(fVarS, "identifier(getterName)");
        Iterator it = ((Iterable) lVar.invoke(fVarS)).iterator();
        do {
            z10 = null;
            if (!it.hasNext()) {
                break;
            }
            Z z11 = (Z) it.next();
            if (z11.i().size() == 0) {
                Dd.e eVar = Dd.e.f2664a;
                E returnType = z11.getReturnType();
                if (returnType == null ? false : eVar.b(returnType, u10.getType())) {
                    z10 = z11;
                }
            }
        } while (z10 == null);
        return z10;
    }

    @Override // Yc.j
    public String toString() {
        return "Lazy Java member scope for " + this.f19936o.e();
    }

    public final Z u0(U u10, vc.l lVar) {
        Lc.V vG = u10.g();
        Lc.V v10 = vG != null ? (Lc.V) H.d(vG) : null;
        String strA = v10 != null ? C2307i.f16924a.a(v10) : null;
        if (strA != null && !H.f(C(), v10)) {
            return t0(u10, strA, lVar);
        }
        String strB = u10.getName().b();
        AbstractC4862t.d(strB, "name.asString()");
        return t0(u10, A.b(strB), lVar);
    }

    public final Z v0(U u10, vc.l lVar) {
        Z z10;
        E returnType;
        String strB = u10.getName().b();
        AbstractC4862t.d(strB, "name.asString()");
        kd.f fVarS = kd.f.s(A.e(strB));
        AbstractC4862t.d(fVarS, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator it = ((Iterable) lVar.invoke(fVarS)).iterator();
        do {
            z10 = null;
            if (!it.hasNext()) {
                break;
            }
            Z z11 = (Z) it.next();
            if (z11.i().size() == 1 && (returnType = z11.getReturnType()) != null && Ic.g.B0(returnType)) {
                Dd.e eVar = Dd.e.f2664a;
                List listI = z11.i();
                AbstractC4862t.d(listI, "descriptor.valueParameters");
                if (eVar.c(((j0) C4179C.F0(listI)).getType(), u10.getType())) {
                    z10 = z11;
                }
            }
        } while (z10 == null);
        return z10;
    }

    public final AbstractC1192u w0(InterfaceC1177e interfaceC1177e) {
        AbstractC1192u visibility = interfaceC1177e.getVisibility();
        AbstractC4862t.d(visibility, "classDescriptor.visibility");
        if (!AbstractC4862t.a(visibility, s.f16940b)) {
            return visibility;
        }
        AbstractC1192u PROTECTED_AND_PACKAGE = s.f16941c;
        AbstractC4862t.d(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    public final Bd.i x0() {
        return this.f19938q;
    }

    public final Set y0(kd.f fVar) {
        Collection collectionC0 = c0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            y.C(linkedHashSet, ((E) it.next()).o().a(fVar, Tc.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // Yc.j
    public X z() {
        return AbstractC5283e.l(C());
    }

    @Override // Yc.j
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1177e C() {
        return this.f19935n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Xc.g c10, InterfaceC1177e ownerDescriptor, InterfaceC2915g jClass, boolean z10, g gVar) {
        super(c10, gVar);
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(ownerDescriptor, "ownerDescriptor");
        AbstractC4862t.e(jClass, "jClass");
        this.f19935n = ownerDescriptor;
        this.f19936o = jClass;
        this.f19937p = z10;
        this.f19938q = c10.e().f(new f(c10));
        this.f19939r = c10.e().f(new j());
        this.f19940s = c10.e().f(new h(c10, this));
        this.f19941t = c10.e().f(new C0254g());
        this.f19942u = c10.e().b(new k(c10));
    }
}
