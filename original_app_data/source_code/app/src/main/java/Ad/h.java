package Ad;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.U;
import Lc.Z;
import Lc.e0;
import fc.C4015H;
import fd.r;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import gc.Q;
import gc.V;
import gc.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import md.AbstractC5047a;
import md.p;
import od.C5286h;
import vc.InterfaceC6082a;
import vd.AbstractC6100i;
import vd.C6095d;
import yd.x;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends AbstractC6100i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f381f = {M.g(new E(M.b(h.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), M.g(new E(M.b(h.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yd.m f382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bd.j f385e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        Collection a(kd.f fVar, Tc.b bVar);

        Set b();

        Collection c(kd.f fVar, Tc.b bVar);

        Set d();

        void e(Collection collection, C6095d c6095d, vc.l lVar, Tc.b bVar);

        Set f();

        e0 g(kd.f fVar);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ Cc.l[] f386o = {M.g(new E(M.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), M.g(new E(M.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), M.g(new E(M.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), M.g(new E(M.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), M.g(new E(M.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), M.g(new E(M.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), M.g(new E(M.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), M.g(new E(M.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), M.g(new E(M.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), M.g(new E(M.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bd.i f390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bd.i f391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bd.i f392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Bd.i f393g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Bd.i f394h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Bd.i f395i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Bd.i f396j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Bd.i f397k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Bd.i f398l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bd.i f399m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ h f400n;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements InterfaceC6082a {
            public a() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return C4179C.C0(b.this.D(), b.this.t());
            }
        }

        /* JADX INFO: renamed from: Ad.h$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0011b extends v implements InterfaceC6082a {
            public C0011b() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return C4179C.C0(b.this.E(), b.this.u());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends v implements InterfaceC6082a {
            public c() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.z();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class d extends v implements InterfaceC6082a {
            public d() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.v();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends v implements InterfaceC6082a {
            public e() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return b.this.y();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class f extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(h hVar) {
                super(0);
                this.f407b = hVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                b bVar = b.this;
                List list = bVar.f387a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.f400n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(x.b(hVar.p().g(), ((fd.i) ((p) it.next())).Y()));
                }
                return V.k(linkedHashSet, this.f407b.t());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class g extends v implements InterfaceC6082a {
            public g() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                List listA = b.this.A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listA) {
                    kd.f name = ((Z) obj).getName();
                    AbstractC4862t.d(name, "it.name");
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: renamed from: Ad.h$b$h, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0012h extends v implements InterfaceC6082a {
            public C0012h() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                List listB = b.this.B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listB) {
                    kd.f name = ((U) obj).getName();
                    AbstractC4862t.d(name, "it.name");
                    Object arrayList = linkedHashMap.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(name, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class i extends v implements InterfaceC6082a {
            public i() {
                super(0);
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map invoke() {
                List listC = b.this.C();
                LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(listC, 10)), 16));
                for (Object obj : listC) {
                    kd.f name = ((e0) obj).getName();
                    AbstractC4862t.d(name, "it.name");
                    linkedHashMap.put(name, obj);
                }
                return linkedHashMap;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class j extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f412b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(h hVar) {
                super(0);
                this.f412b = hVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                b bVar = b.this;
                List list = bVar.f388b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                h hVar = bVar.f400n;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(x.b(hVar.p().g(), ((fd.n) ((p) it.next())).X()));
                }
                return V.k(linkedHashSet, this.f412b.u());
            }
        }

        public b(h hVar, List functionList, List propertyList, List typeAliasList) {
            AbstractC4862t.e(functionList, "functionList");
            AbstractC4862t.e(propertyList, "propertyList");
            AbstractC4862t.e(typeAliasList, "typeAliasList");
            this.f400n = hVar;
            this.f387a = functionList;
            this.f388b = propertyList;
            this.f389c = hVar.p().c().g().c() ? typeAliasList : C4206t.k();
            this.f390d = hVar.p().h().f(new d());
            this.f391e = hVar.p().h().f(new e());
            this.f392f = hVar.p().h().f(new c());
            this.f393g = hVar.p().h().f(new a());
            this.f394h = hVar.p().h().f(new C0011b());
            this.f395i = hVar.p().h().f(new i());
            this.f396j = hVar.p().h().f(new g());
            this.f397k = hVar.p().h().f(new C0012h());
            this.f398l = hVar.p().h().f(new f(hVar));
            this.f399m = hVar.p().h().f(new j(hVar));
        }

        public final List A() {
            return (List) Bd.m.a(this.f393g, this, f386o[3]);
        }

        public final List B() {
            return (List) Bd.m.a(this.f394h, this, f386o[4]);
        }

        public final List C() {
            return (List) Bd.m.a(this.f392f, this, f386o[2]);
        }

        public final List D() {
            return (List) Bd.m.a(this.f390d, this, f386o[0]);
        }

        public final List E() {
            return (List) Bd.m.a(this.f391e, this, f386o[1]);
        }

        public final Map F() {
            return (Map) Bd.m.a(this.f396j, this, f386o[6]);
        }

        public final Map G() {
            return (Map) Bd.m.a(this.f397k, this, f386o[7]);
        }

        public final Map H() {
            return (Map) Bd.m.a(this.f395i, this, f386o[5]);
        }

        @Override // Ad.h.a
        public Collection a(kd.f name, Tc.b location) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(location, "location");
            if (!b().contains(name)) {
                return C4206t.k();
            }
            Collection collection = (Collection) F().get(name);
            return collection == null ? C4206t.k() : collection;
        }

        @Override // Ad.h.a
        public Set b() {
            return (Set) Bd.m.a(this.f398l, this, f386o[8]);
        }

        @Override // Ad.h.a
        public Collection c(kd.f name, Tc.b location) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(location, "location");
            if (!d().contains(name)) {
                return C4206t.k();
            }
            Collection collection = (Collection) G().get(name);
            return collection == null ? C4206t.k() : collection;
        }

        @Override // Ad.h.a
        public Set d() {
            return (Set) Bd.m.a(this.f399m, this, f386o[9]);
        }

        @Override // Ad.h.a
        public void e(Collection result, C6095d kindFilter, vc.l nameFilter, Tc.b location) {
            AbstractC4862t.e(result, "result");
            AbstractC4862t.e(kindFilter, "kindFilter");
            AbstractC4862t.e(nameFilter, "nameFilter");
            AbstractC4862t.e(location, "location");
            if (kindFilter.a(C6095d.f45974c.i())) {
                for (Object obj : B()) {
                    kd.f name = ((U) obj).getName();
                    AbstractC4862t.d(name, "it.name");
                    if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(C6095d.f45974c.d())) {
                for (Object obj2 : A()) {
                    kd.f name2 = ((Z) obj2).getName();
                    AbstractC4862t.d(name2, "it.name");
                    if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // Ad.h.a
        public Set f() {
            List list = this.f389c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h hVar = this.f400n;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(x.b(hVar.p().g(), ((r) ((p) it.next())).R()));
            }
            return linkedHashSet;
        }

        @Override // Ad.h.a
        public e0 g(kd.f name) {
            AbstractC4862t.e(name, "name");
            return (e0) H().get(name);
        }

        public final List t() {
            Set setT = this.f400n.t();
            ArrayList arrayList = new ArrayList();
            Iterator it = setT.iterator();
            while (it.hasNext()) {
                y.C(arrayList, w((kd.f) it.next()));
            }
            return arrayList;
        }

        public final List u() {
            Set setU = this.f400n.u();
            ArrayList arrayList = new ArrayList();
            Iterator it = setU.iterator();
            while (it.hasNext()) {
                y.C(arrayList, x((kd.f) it.next()));
            }
            return arrayList;
        }

        public final List v() {
            List list = this.f387a;
            h hVar = this.f400n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Z zJ = hVar.p().f().j((fd.i) ((p) it.next()));
                if (!hVar.x(zJ)) {
                    zJ = null;
                }
                if (zJ != null) {
                    arrayList.add(zJ);
                }
            }
            return arrayList;
        }

        public final List w(kd.f fVar) {
            List listD = D();
            h hVar = this.f400n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listD) {
                if (AbstractC4862t.a(((InterfaceC1185m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.k(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List x(kd.f fVar) {
            List listE = E();
            h hVar = this.f400n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                if (AbstractC4862t.a(((InterfaceC1185m) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            hVar.l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List y() {
            List list = this.f388b;
            h hVar = this.f400n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U uL = hVar.p().f().l((fd.n) ((p) it.next()));
                if (uL != null) {
                    arrayList.add(uL);
                }
            }
            return arrayList;
        }

        public final List z() {
            List list = this.f389c;
            h hVar = this.f400n;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e0 e0VarM = hVar.p().f().m((r) ((p) it.next()));
                if (e0VarM != null) {
                    arrayList.add(e0VarM);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class c implements a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ Cc.l[] f413j = {M.g(new E(M.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), M.g(new E(M.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bd.g f417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bd.g f418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bd.h f419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Bd.i f420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Bd.i f421h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ h f422i;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ md.r f423a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ByteArrayInputStream f424b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f425c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(md.r rVar, ByteArrayInputStream byteArrayInputStream, h hVar) {
                super(0);
                this.f423a = rVar;
                this.f424b = byteArrayInputStream;
                this.f425c = hVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p invoke() {
                return (p) this.f423a.a(this.f424b, this.f425c.p().c().j());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f427b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar) {
                super(0);
                this.f427b = hVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                return V.k(c.this.f414a.keySet(), this.f427b.t());
            }
        }

        /* JADX INFO: renamed from: Ad.h$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0013c extends v implements vc.l {
            public C0013c() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection invoke(kd.f it) {
                AbstractC4862t.e(it, "it");
                return c.this.m(it);
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
                return c.this.n(it);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class e extends v implements vc.l {
            public e() {
                super(1);
            }

            @Override // vc.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e0 invoke(kd.f it) {
                AbstractC4862t.e(it, "it");
                return c.this.o(it);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class f extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f432b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(h hVar) {
                super(0);
                this.f432b = hVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set invoke() {
                return V.k(c.this.f415b.keySet(), this.f432b.u());
            }
        }

        public c(h hVar, List functionList, List propertyList, List typeAliasList) throws IOException {
            Map mapI;
            AbstractC4862t.e(functionList, "functionList");
            AbstractC4862t.e(propertyList, "propertyList");
            AbstractC4862t.e(typeAliasList, "typeAliasList");
            this.f422i = hVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                kd.f fVarB = x.b(hVar.p().g(), ((fd.i) ((p) obj)).Y());
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f414a = p(linkedHashMap);
            h hVar2 = this.f422i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                kd.f fVarB2 = x.b(hVar2.p().g(), ((fd.n) ((p) obj2)).X());
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f415b = p(linkedHashMap2);
            if (this.f422i.p().c().g().c()) {
                h hVar3 = this.f422i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    kd.f fVarB3 = x.b(hVar3.p().g(), ((r) ((p) obj3)).R());
                    Object arrayList3 = linkedHashMap3.get(fVarB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(fVarB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapI = p(linkedHashMap3);
            } else {
                mapI = Q.i();
            }
            this.f416c = mapI;
            this.f417d = this.f422i.p().h().g(new C0013c());
            this.f418e = this.f422i.p().h().g(new d());
            this.f419f = this.f422i.p().h().b(new e());
            this.f420g = this.f422i.p().h().f(new b(this.f422i));
            this.f421h = this.f422i.p().h().f(new f(this.f422i));
        }

        @Override // Ad.h.a
        public Collection a(kd.f name, Tc.b location) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(location, "location");
            return !b().contains(name) ? C4206t.k() : (Collection) this.f417d.invoke(name);
        }

        @Override // Ad.h.a
        public Set b() {
            return (Set) Bd.m.a(this.f420g, this, f413j[0]);
        }

        @Override // Ad.h.a
        public Collection c(kd.f name, Tc.b location) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(location, "location");
            return !d().contains(name) ? C4206t.k() : (Collection) this.f418e.invoke(name);
        }

        @Override // Ad.h.a
        public Set d() {
            return (Set) Bd.m.a(this.f421h, this, f413j[1]);
        }

        @Override // Ad.h.a
        public void e(Collection result, C6095d kindFilter, vc.l nameFilter, Tc.b location) {
            AbstractC4862t.e(result, "result");
            AbstractC4862t.e(kindFilter, "kindFilter");
            AbstractC4862t.e(nameFilter, "nameFilter");
            AbstractC4862t.e(location, "location");
            if (kindFilter.a(C6095d.f45974c.i())) {
                Set<kd.f> setD = d();
                ArrayList arrayList = new ArrayList();
                for (kd.f fVar : setD) {
                    if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                        arrayList.addAll(c(fVar, location));
                    }
                }
                C5286h INSTANCE = C5286h.f41542a;
                AbstractC4862t.d(INSTANCE, "INSTANCE");
                gc.x.A(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(C6095d.f45974c.d())) {
                Set<kd.f> setB = b();
                ArrayList arrayList2 = new ArrayList();
                for (kd.f fVar2 : setB) {
                    if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                        arrayList2.addAll(a(fVar2, location));
                    }
                }
                C5286h INSTANCE2 = C5286h.f41542a;
                AbstractC4862t.d(INSTANCE2, "INSTANCE");
                gc.x.A(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // Ad.h.a
        public Set f() {
            return this.f416c.keySet();
        }

        @Override // Ad.h.a
        public e0 g(kd.f name) {
            AbstractC4862t.e(name, "name");
            return (e0) this.f419f.invoke(name);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection m(kd.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f414a
                md.r r1 = fd.i.f34474w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.AbstractC4862t.d(r1, r2)
                Ad.h r2 = r5.f422i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                Ad.h r5 = r5.f422i
                java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
                r3.<init>(r0)
                Ad.h$c$a r0 = new Ad.h$c$a
                r0.<init>(r1, r3, r5)
                Nd.h r5 = Nd.q.o(r0)
                java.util.List r5 = Nd.t.O(r5)
                if (r5 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r5 = gc.C4206t.k()
            L2e:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r5.size()
                r0.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
            L3b:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L66
                java.lang.Object r1 = r5.next()
                fd.i r1 = (fd.i) r1
                yd.m r3 = r2.p()
                yd.w r3 = r3.f()
                java.lang.String r4 = "it"
                kotlin.jvm.internal.AbstractC4862t.d(r1, r4)
                Lc.Z r1 = r3.j(r1)
                boolean r3 = r2.x(r1)
                if (r3 == 0) goto L5f
                goto L60
            L5f:
                r1 = 0
            L60:
                if (r1 == 0) goto L3b
                r0.add(r1)
                goto L3b
            L66:
                r2.k(r6, r0)
                java.util.List r5 = Md.a.c(r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Ad.h.c.m(kd.f):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Collection n(kd.f r6) {
            /*
                r5 = this;
                java.util.Map r0 = r5.f415b
                md.r r1 = fd.n.f34542w
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.AbstractC4862t.d(r1, r2)
                Ad.h r2 = r5.f422i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2a
                Ad.h r5 = r5.f422i
                java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
                r3.<init>(r0)
                Ad.h$c$a r0 = new Ad.h$c$a
                r0.<init>(r1, r3, r5)
                Nd.h r5 = Nd.q.o(r0)
                java.util.List r5 = Nd.t.O(r5)
                if (r5 == 0) goto L2a
                goto L2e
            L2a:
                java.util.List r5 = gc.C4206t.k()
            L2e:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r5.size()
                r0.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
            L3b:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r5.next()
                fd.n r1 = (fd.n) r1
                yd.m r3 = r2.p()
                yd.w r3 = r3.f()
                java.lang.String r4 = "it"
                kotlin.jvm.internal.AbstractC4862t.d(r1, r4)
                Lc.U r1 = r3.l(r1)
                if (r1 == 0) goto L3b
                r0.add(r1)
                goto L3b
            L5e:
                r2.l(r6, r0)
                java.util.List r5 = Md.a.c(r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Ad.h.c.n(kd.f):java.util.Collection");
        }

        public final e0 o(kd.f fVar) {
            r rVarI0;
            byte[] bArr = (byte[]) this.f416c.get(fVar);
            if (bArr == null || (rVarI0 = r.i0(new ByteArrayInputStream(bArr), this.f422i.p().c().j())) == null) {
                return null;
            }
            return this.f422i.p().f().m(rVarI0);
        }

        public final Map p(Map map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(P.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C4207u.v(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((AbstractC5047a) it.next()).c(byteArrayOutputStream);
                    arrayList.add(C4015H.f34254a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6082a f433a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC6082a interfaceC6082a) {
            super(0);
            this.f433a = interfaceC6082a;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            return C4179C.Z0((Iterable) this.f433a.invoke());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends v implements InterfaceC6082a {
        public e() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke() {
            Set setS = h.this.s();
            if (setS == null) {
                return null;
            }
            return V.k(V.k(h.this.q(), h.this.f383c.f()), setS);
        }
    }

    public h(yd.m c10, List functionList, List propertyList, List typeAliasList, InterfaceC6082a classNames) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(functionList, "functionList");
        AbstractC4862t.e(propertyList, "propertyList");
        AbstractC4862t.e(typeAliasList, "typeAliasList");
        AbstractC4862t.e(classNames, "classNames");
        this.f382b = c10;
        this.f383c = n(functionList, propertyList, typeAliasList);
        this.f384d = c10.h().f(new d(classNames));
        this.f385e = c10.h().h(new e());
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection a(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return this.f383c.a(name, location);
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set b() {
        return this.f383c.b();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Collection c(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        return this.f383c.c(name, location);
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set d() {
        return this.f383c.d();
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6102k
    public InterfaceC1180h e(kd.f name, Tc.b location) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(location, "location");
        if (w(name)) {
            return o(name);
        }
        if (this.f383c.f().contains(name)) {
            return v(name);
        }
        return null;
    }

    @Override // vd.AbstractC6100i, vd.InterfaceC6099h
    public Set g() {
        return r();
    }

    public abstract void i(Collection collection, vc.l lVar);

    public final Collection j(C6095d kindFilter, vc.l nameFilter, Tc.b location) {
        AbstractC4862t.e(kindFilter, "kindFilter");
        AbstractC4862t.e(nameFilter, "nameFilter");
        AbstractC4862t.e(location, "location");
        ArrayList arrayList = new ArrayList(0);
        C6095d.a aVar = C6095d.f45974c;
        if (kindFilter.a(aVar.g())) {
            i(arrayList, nameFilter);
        }
        this.f383c.e(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (kd.f fVar : q()) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    Md.a.a(arrayList, o(fVar));
                }
            }
        }
        if (kindFilter.a(C6095d.f45974c.h())) {
            for (kd.f fVar2 : this.f383c.f()) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    Md.a.a(arrayList, this.f383c.g(fVar2));
                }
            }
        }
        return Md.a.c(arrayList);
    }

    public void k(kd.f name, List functions) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(functions, "functions");
    }

    public void l(kd.f name, List descriptors) {
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(descriptors, "descriptors");
    }

    public abstract kd.b m(kd.f fVar);

    public final a n(List list, List list2, List list3) {
        return this.f382b.c().g().a() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    public final InterfaceC1177e o(kd.f fVar) {
        return this.f382b.c().b(m(fVar));
    }

    public final yd.m p() {
        return this.f382b;
    }

    public final Set q() {
        return (Set) Bd.m.a(this.f384d, this, f381f[0]);
    }

    public final Set r() {
        return (Set) Bd.m.b(this.f385e, this, f381f[1]);
    }

    public abstract Set s();

    public abstract Set t();

    public abstract Set u();

    public final e0 v(kd.f fVar) {
        return this.f383c.g(fVar);
    }

    public boolean w(kd.f name) {
        AbstractC4862t.e(name, "name");
        return q().contains(name);
    }

    public boolean x(Z function) {
        AbstractC4862t.e(function, "function");
        return true;
    }
}
