package Yc;

import Cd.p0;
import Cd.q0;
import Lc.D;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.U;
import Lc.X;
import Lc.Z;
import Lc.f0;
import Oc.C;
import Oc.L;
import Uc.J;
import bd.InterfaceC2906B;
import bd.InterfaceC2914f;
import bd.InterfaceC2922n;
import bd.r;
import bd.x;
import bd.y;
import dd.w;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4179C;
import gc.C4186J;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import gc.Q;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import od.AbstractC5282d;
import od.AbstractC5283e;
import od.AbstractC5291m;
import vc.InterfaceC6082a;
import vd.AbstractC6094c;
import vd.AbstractC6100i;
import vd.C6095d;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends AbstractC6100i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f19982m = {M.g(new E(M.b(j.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), M.g(new E(M.b(j.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), M.g(new E(M.b(j.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Xc.g f19983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f19984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f19985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.i f19986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bd.g f19987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bd.h f19988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bd.g f19989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bd.i f19990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bd.i f19991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bd.i f19992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bd.g f19993l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cd.E f19994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cd.E f19995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f19996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f19997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f19999f;

        public a(Cd.E returnType, Cd.E e10, List valueParameters, List typeParameters, boolean z10, List errors) {
            AbstractC4862t.e(returnType, "returnType");
            AbstractC4862t.e(valueParameters, "valueParameters");
            AbstractC4862t.e(typeParameters, "typeParameters");
            AbstractC4862t.e(errors, "errors");
            this.f19994a = returnType;
            this.f19995b = e10;
            this.f19996c = valueParameters;
            this.f19997d = typeParameters;
            this.f19998e = z10;
            this.f19999f = errors;
        }

        public final List a() {
            return this.f19999f;
        }

        public final boolean b() {
            return this.f19998e;
        }

        public final Cd.E c() {
            return this.f19995b;
        }

        public final Cd.E d() {
            return this.f19994a;
        }

        public final List e() {
            return this.f19997d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC4862t.a(this.f19994a, aVar.f19994a) && AbstractC4862t.a(this.f19995b, aVar.f19995b) && AbstractC4862t.a(this.f19996c, aVar.f19996c) && AbstractC4862t.a(this.f19997d, aVar.f19997d) && this.f19998e == aVar.f19998e && AbstractC4862t.a(this.f19999f, aVar.f19999f);
        }

        public final List f() {
            return this.f19996c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        /* JADX WARN: Type inference failed for: r1v9 */
        public int hashCode() {
            int iHashCode = this.f19994a.hashCode() * 31;
            Cd.E e10 = this.f19995b;
            int iHashCode2 = (((((iHashCode + (e10 == null ? 0 : e10.hashCode())) * 31) + this.f19996c.hashCode()) * 31) + this.f19997d.hashCode()) * 31;
            boolean z10 = this.f19998e;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return ((iHashCode2 + r12) * 31) + this.f19999f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f19994a + ", receiverType=" + this.f19995b + ", valueParameters=" + this.f19996c + ", typeParameters=" + this.f19997d + ", hasStableParameterNames=" + this.f19998e + ", errors=" + this.f19999f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f20000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20001b;

        public b(List descriptors, boolean z10) {
            AbstractC4862t.e(descriptors, "descriptors");
            this.f20000a = descriptors;
            this.f20001b = z10;
        }

        public final List a() {
            return this.f20000a;
        }

        public final boolean b() {
            return this.f20001b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke() {
            return j.this.m(C6095d.f45986o, InterfaceC6099h.f46011a.a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements InterfaceC6082a {
        public d() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return j.this.l(C6095d.f45991t, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements vc.l {
        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U invoke(kd.f name) {
            AbstractC4862t.e(name, "name");
            if (j.this.B() != null) {
                return (U) j.this.B().f19988g.invoke(name);
            }
            InterfaceC2922n interfaceC2922nB = ((Yc.b) j.this.y().invoke()).b(name);
            if (interfaceC2922nB == null || interfaceC2922nB.I()) {
                return null;
            }
            return j.this.J(interfaceC2922nB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends v implements vc.l {
        public f() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(kd.f name) {
            AbstractC4862t.e(name, "name");
            if (j.this.B() != null) {
                return (Collection) j.this.B().f19987f.invoke(name);
            }
            ArrayList arrayList = new ArrayList();
            for (r rVar : ((Yc.b) j.this.y().invoke()).c(name)) {
                Wc.e eVarI = j.this.I(rVar);
                if (j.this.G(eVarI)) {
                    j.this.w().a().h().d(rVar, eVarI);
                    arrayList.add(eVarI);
                }
            }
            j.this.o(arrayList, name);
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends v implements InterfaceC6082a {
        public g() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Yc.b invoke() {
            return j.this.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h extends v implements InterfaceC6082a {
        public h() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return j.this.n(C6095d.f45993v, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i extends v implements vc.l {
        public i() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Collection invoke(kd.f name) {
            AbstractC4862t.e(name, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) j.this.f19987f.invoke(name));
            j.this.L(linkedHashSet);
            j.this.r(linkedHashSet, name);
            return C4179C.V0(j.this.w().a().r().g(j.this.w(), linkedHashSet));
        }
    }

    /* JADX INFO: renamed from: Yc.j$j, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0256j extends v implements vc.l {
        public C0256j() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(kd.f name) {
            AbstractC4862t.e(name, "name");
            ArrayList arrayList = new ArrayList();
            Md.a.a(arrayList, j.this.f19988g.invoke(name));
            j.this.s(name, arrayList);
            return AbstractC5283e.t(j.this.C()) ? C4179C.V0(arrayList) : C4179C.V0(j.this.w().a().r().g(j.this.w(), arrayList));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k extends v implements InterfaceC6082a {
        public k() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return j.this.t(C6095d.f45994w, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class l extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2922n f20012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C f20013c;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f20014a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2922n f20015b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C f20016c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, InterfaceC2922n interfaceC2922n, C c10) {
                super(0);
                this.f20014a = jVar;
                this.f20015b = interfaceC2922n;
                this.f20016c = c10;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final qd.g invoke() {
                return this.f20014a.w().a().g().a(this.f20015b, this.f20016c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC2922n interfaceC2922n, C c10) {
            super(0);
            this.f20012b = interfaceC2922n;
            this.f20013c = c10;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bd.j invoke() {
            return j.this.w().e().h(new a(j.this, this.f20012b, this.f20013c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class m extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f20017a = new m();

        public m() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1173a invoke(Z selectMostSpecificInEachOverridableGroup) {
            AbstractC4862t.e(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public /* synthetic */ j(Xc.g gVar, j jVar, int i10, AbstractC4854k abstractC4854k) {
        this(gVar, (i10 & 2) != 0 ? null : jVar);
    }

    public final Set A() {
        return (Set) Bd.m.a(this.f19990i, this, f19982m[0]);
    }

    public final j B() {
        return this.f19984c;
    }

    public abstract InterfaceC1185m C();

    public final Set D() {
        return (Set) Bd.m.a(this.f19991j, this, f19982m[1]);
    }

    public final Cd.E E(InterfaceC2922n interfaceC2922n) {
        Cd.E eO = this.f19983b.g().o(interfaceC2922n.getType(), Zc.b.b(p0.COMMON, false, false, null, 7, null));
        if ((!Ic.g.r0(eO) && !Ic.g.u0(eO)) || !F(interfaceC2922n) || !interfaceC2922n.N()) {
            return eO;
        }
        Cd.E eN = q0.n(eO);
        AbstractC4862t.d(eN, "makeNotNullable(propertyType)");
        return eN;
    }

    public final boolean F(InterfaceC2922n interfaceC2922n) {
        return interfaceC2922n.isFinal() && interfaceC2922n.P();
    }

    public boolean G(Wc.e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        return true;
    }

    public abstract a H(r rVar, List list, Cd.E e10, List list2);

    public final Wc.e I(r method) {
        AbstractC4862t.e(method, "method");
        Wc.e eVarP1 = Wc.e.p1(C(), Xc.e.a(this.f19983b, method), method.getName(), this.f19983b.a().t().a(method), ((Yc.b) this.f19986e.invoke()).f(method.getName()) != null && method.i().isEmpty());
        AbstractC4862t.d(eVarP1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        Xc.g gVarF = Xc.a.f(this.f19983b, eVarP1, method, 0, 4, null);
        List typeParameters = method.getTypeParameters();
        List arrayList = new ArrayList(C4207u.v(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            f0 f0VarA = gVarF.f().a((y) it.next());
            AbstractC4862t.b(f0VarA);
            arrayList.add(f0VarA);
        }
        b bVarK = K(gVarF, eVarP1, method.i());
        a aVarH = H(method, arrayList, q(method, gVarF), bVarK.a());
        Cd.E eC = aVarH.c();
        eVarP1.o1(eC != null ? AbstractC5282d.i(eVarP1, eC, Mc.g.f9435K.b()) : null, z(), C4206t.k(), aVarH.e(), aVarH.f(), aVarH.d(), D.Companion.a(false, method.isAbstract(), true ^ method.isFinal()), J.d(method.getVisibility()), aVarH.c() != null ? P.f(AbstractC4040w.a(Wc.e.f17888G, C4179C.h0(bVarK.a()))) : Q.i());
        eVarP1.s1(aVarH.b(), bVarK.b());
        if (!aVarH.a().isEmpty()) {
            gVarF.a().s().a(eVarP1, aVarH.a());
        }
        return eVarP1;
    }

    public final U J(InterfaceC2922n interfaceC2922n) {
        C cU = u(interfaceC2922n);
        cU.V0(null, null, null, null);
        cU.b1(E(interfaceC2922n), C4206t.k(), z(), null, C4206t.k());
        if (AbstractC5283e.K(cU, cU.getType())) {
            cU.L0(new l(interfaceC2922n, cU));
        }
        this.f19983b.a().h().b(interfaceC2922n, cU);
        return cU;
    }

    public final b K(Xc.g c10, InterfaceC1196y interfaceC1196y, List jValueParameters) {
        C4034q c4034qA;
        kd.f name;
        AbstractC4862t.e(c10, "c");
        InterfaceC1196y function = interfaceC1196y;
        AbstractC4862t.e(function, "function");
        AbstractC4862t.e(jValueParameters, "jValueParameters");
        Iterable<C4186J> iterableB1 = C4179C.b1(jValueParameters);
        ArrayList arrayList = new ArrayList(C4207u.v(iterableB1, 10));
        boolean z10 = false;
        for (C4186J c4186j : iterableB1) {
            int iA = c4186j.a();
            InterfaceC2906B interfaceC2906B = (InterfaceC2906B) c4186j.b();
            Mc.g gVarA = Xc.e.a(c10, interfaceC2906B);
            Zc.a aVarB = Zc.b.b(p0.COMMON, false, false, null, 7, null);
            if (interfaceC2906B.k()) {
                x type = interfaceC2906B.getType();
                InterfaceC2914f interfaceC2914f = type instanceof InterfaceC2914f ? (InterfaceC2914f) type : null;
                if (interfaceC2914f == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC2906B);
                }
                Cd.E eK = c10.g().k(interfaceC2914f, aVarB, true);
                c4034qA = AbstractC4040w.a(eK, c10.d().n().k(eK));
            } else {
                c4034qA = AbstractC4040w.a(c10.g().o(interfaceC2906B.getType(), aVarB), null);
            }
            Cd.E e10 = (Cd.E) c4034qA.a();
            Cd.E e11 = (Cd.E) c4034qA.b();
            if (AbstractC4862t.a(function.getName().b(), "equals") && jValueParameters.size() == 1 && AbstractC4862t.a(c10.d().n().I(), e10)) {
                name = kd.f.s(Request.JsonKeys.OTHER);
            } else {
                name = interfaceC2906B.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(iA);
                    name = kd.f.s(sb2.toString());
                    AbstractC4862t.d(name, "identifier(\"p$index\")");
                }
            }
            boolean z11 = z10;
            AbstractC4862t.d(name, "if (function.name.asStri…(\"p$index\")\n            }");
            arrayList.add(new L(function, null, iA, gVarA, name, e10, false, false, false, e11, c10.a().t().a(interfaceC2906B)));
            function = interfaceC1196y;
            z10 = z11;
        }
        return new b(C4179C.V0(arrayList), z10);
    }

    public final void L(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = w.c((Z) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection collectionA = AbstractC5291m.a(list, m.f20017a);
                set.removeAll(list);
                set.addAll(collectionA);
            }
        }
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return !b().contains(name) ? C4206t.k() : (Collection) this.f19989h.invoke(name);
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set b() {
        return A();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return !d().contains(name) ? C4206t.k() : (Collection) this.f19993l.invoke(name);
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set d() {
        return D();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public Collection f(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        return (Collection) this.f19985d.invoke();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set g() {
        return x();
    }

    public abstract Set l(C6095d c6095d, vc.l lVar);

    public final List m(C6095d kindFilter, vc.l nameFilter) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        Tc.d dVar = Tc.d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.a(C6095d.f45974c.c())) {
            for (kd.f fVar : l(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    Md.a.a(linkedHashSet, e(fVar, dVar));
                }
            }
        }
        if (kindFilter.a(C6095d.f45974c.d()) && !kindFilter.l().contains(AbstractC6094c.a.f45971a)) {
            for (kd.f fVar2 : n(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, dVar));
                }
            }
        }
        if (kindFilter.a(C6095d.f45974c.i()) && !kindFilter.l().contains(AbstractC6094c.a.f45971a)) {
            for (kd.f fVar3 : t(kindFilter, nameFilter)) {
                if (((Boolean) nameFilter.invoke(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, dVar));
                }
            }
        }
        return C4179C.V0(linkedHashSet);
    }

    public abstract Set n(C6095d c6095d, vc.l lVar);

    public void o(Collection result, kd.f name) {
        AbstractC4862t.e(result, "result");
        AbstractC4862t.e(name, "name");
    }

    public abstract Yc.b p();

    public final Cd.E q(r method, Xc.g c10) {
        AbstractC4862t.e(method, "method");
        AbstractC4862t.e(c10, "c");
        return c10.g().o(method.getReturnType(), Zc.b.b(p0.COMMON, method.O().m(), false, null, 6, null));
    }

    public abstract void r(Collection collection, kd.f fVar);

    public abstract void s(kd.f fVar, Collection collection);

    public abstract Set t(C6095d c6095d, vc.l lVar);

    public String toString() {
        return "Lazy scope for " + C();
    }

    public final C u(InterfaceC2922n interfaceC2922n) {
        Wc.f fVarF1 = Wc.f.f1(C(), Xc.e.a(this.f19983b, interfaceC2922n), D.FINAL, J.d(interfaceC2922n.getVisibility()), !interfaceC2922n.isFinal(), interfaceC2922n.getName(), this.f19983b.a().t().a(interfaceC2922n), F(interfaceC2922n));
        AbstractC4862t.d(fVarF1, "create(\n            owne…d.isFinalStatic\n        )");
        return fVarF1;
    }

    public final Bd.i v() {
        return this.f19985d;
    }

    public final Xc.g w() {
        return this.f19983b;
    }

    public final Set x() {
        return (Set) Bd.m.a(this.f19992k, this, f19982m[2]);
    }

    public final Bd.i y() {
        return this.f19986e;
    }

    public abstract X z();

    public j(Xc.g c10, j jVar) {
        AbstractC4862t.e(c10, "c");
        this.f19983b = c10;
        this.f19984c = jVar;
        this.f19985d = c10.e().c(new c(), C4206t.k());
        this.f19986e = c10.e().f(new g());
        this.f19987f = c10.e().g(new f());
        this.f19988g = c10.e().b(new e());
        this.f19989h = c10.e().g(new i());
        this.f19990i = c10.e().f(new h());
        this.f19991j = c10.e().f(new k());
        this.f19992k = c10.e().f(new d());
        this.f19993l = c10.e().g(new C0256j());
    }
}
