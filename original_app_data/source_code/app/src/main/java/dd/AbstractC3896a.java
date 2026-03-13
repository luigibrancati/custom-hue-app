package dd;

import Cd.E;
import Lc.a0;
import dd.AbstractC3897b;
import dd.C3916u;
import dd.InterfaceC3913r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4862t;
import qd.p;
import yd.EnumC6469b;
import yd.InterfaceC6470c;

/* JADX INFO: renamed from: dd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3896a extends AbstractC3897b implements InterfaceC6470c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bd.g f33375b;

    /* JADX INFO: renamed from: dd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0407a extends AbstractC3897b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f33376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f33377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f33378c;

        public C0407a(Map memberAnnotations, Map propertyConstants, Map annotationParametersDefaultValues) {
            AbstractC4862t.e(memberAnnotations, "memberAnnotations");
            AbstractC4862t.e(propertyConstants, "propertyConstants");
            AbstractC4862t.e(annotationParametersDefaultValues, "annotationParametersDefaultValues");
            this.f33376a = memberAnnotations;
            this.f33377b = propertyConstants;
            this.f33378c = annotationParametersDefaultValues;
        }

        @Override // dd.AbstractC3897b.a
        public Map a() {
            return this.f33376a;
        }

        public final Map b() {
            return this.f33378c;
        }

        public final Map c() {
            return this.f33377b;
        }
    }

    /* JADX INFO: renamed from: dd.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33379a = new b();

        public b() {
            super(2);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0407a loadConstantFromProperty, C3916u it) {
            AbstractC4862t.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
            AbstractC4862t.e(it, "it");
            return loadConstantFromProperty.b().get(it);
        }
    }

    /* JADX INFO: renamed from: dd.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements InterfaceC3913r.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap f33381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3913r f33382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ HashMap f33383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ HashMap f33384e;

        /* JADX INFO: renamed from: dd.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0408a extends b implements InterfaceC3913r.e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f33385d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0408a(c cVar, C3916u signature) {
                super(cVar, signature);
                AbstractC4862t.e(signature, "signature");
                this.f33385d = cVar;
            }

            @Override // dd.InterfaceC3913r.e
            public InterfaceC3913r.a b(int i10, kd.b classId, a0 source) {
                AbstractC4862t.e(classId, "classId");
                AbstractC4862t.e(source, "source");
                C3916u c3916uE = C3916u.f33461b.e(d(), i10);
                List arrayList = (List) this.f33385d.f33381b.get(c3916uE);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f33385d.f33381b.put(c3916uE, arrayList);
                }
                return AbstractC3896a.this.w(classId, source, arrayList);
            }
        }

        /* JADX INFO: renamed from: dd.a$c$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class b implements InterfaceC3913r.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C3916u f33386a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ArrayList f33387b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f33388c;

            public b(c cVar, C3916u signature) {
                AbstractC4862t.e(signature, "signature");
                this.f33388c = cVar;
                this.f33386a = signature;
                this.f33387b = new ArrayList();
            }

            @Override // dd.InterfaceC3913r.c
            public void a() {
                if (this.f33387b.isEmpty()) {
                    return;
                }
                this.f33388c.f33381b.put(this.f33386a, this.f33387b);
            }

            @Override // dd.InterfaceC3913r.c
            public InterfaceC3913r.a c(kd.b classId, a0 source) {
                AbstractC4862t.e(classId, "classId");
                AbstractC4862t.e(source, "source");
                return AbstractC3896a.this.w(classId, source, this.f33387b);
            }

            public final C3916u d() {
                return this.f33386a;
            }
        }

        public c(HashMap map, InterfaceC3913r interfaceC3913r, HashMap map2, HashMap map3) {
            this.f33381b = map;
            this.f33382c = interfaceC3913r;
            this.f33383d = map2;
            this.f33384e = map3;
        }

        @Override // dd.InterfaceC3913r.d
        public InterfaceC3913r.e a(kd.f name, String desc) {
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(desc, "desc");
            C3916u.a aVar = C3916u.f33461b;
            String strB = name.b();
            AbstractC4862t.d(strB, "name.asString()");
            return new C0408a(this, aVar.d(strB, desc));
        }

        @Override // dd.InterfaceC3913r.d
        public InterfaceC3913r.c b(kd.f name, String desc, Object obj) {
            Object objE;
            AbstractC4862t.e(name, "name");
            AbstractC4862t.e(desc, "desc");
            C3916u.a aVar = C3916u.f33461b;
            String strB = name.b();
            AbstractC4862t.d(strB, "name.asString()");
            C3916u c3916uA = aVar.a(strB, desc);
            if (obj != null && (objE = AbstractC3896a.this.E(desc, obj)) != null) {
                this.f33384e.put(c3916uA, objE);
            }
            return new b(this, c3916uA);
        }
    }

    /* JADX INFO: renamed from: dd.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements vc.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f33389a = new d();

        public d() {
            super(2);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0407a loadConstantFromProperty, C3916u it) {
            AbstractC4862t.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
            AbstractC4862t.e(it, "it");
            return loadConstantFromProperty.c().get(it);
        }
    }

    /* JADX INFO: renamed from: dd.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements vc.l {
        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0407a invoke(InterfaceC3913r kotlinClass) {
            AbstractC4862t.e(kotlinClass, "kotlinClass");
            return AbstractC3896a.this.D(kotlinClass);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3896a(Bd.n storageManager, InterfaceC3911p kotlinClassFinder) {
        super(kotlinClassFinder);
        AbstractC4862t.e(storageManager, "storageManager");
        AbstractC4862t.e(kotlinClassFinder, "kotlinClassFinder");
        this.f33375b = storageManager.g(new e());
    }

    @Override // dd.AbstractC3897b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public C0407a p(InterfaceC3913r binaryClass) {
        AbstractC4862t.e(binaryClass, "binaryClass");
        return (C0407a) this.f33375b.invoke(binaryClass);
    }

    public final boolean C(kd.b annotationClassId, Map arguments) {
        AbstractC4862t.e(annotationClassId, "annotationClassId");
        AbstractC4862t.e(arguments, "arguments");
        if (!AbstractC4862t.a(annotationClassId, Hc.a.f5349a.a())) {
            return false;
        }
        Object obj = arguments.get(kd.f.s("value"));
        qd.p pVar = obj instanceof qd.p ? (qd.p) obj : null;
        if (pVar == null) {
            return false;
        }
        Object objB = pVar.b();
        p.b.C0583b c0583b = objB instanceof p.b.C0583b ? (p.b.C0583b) objB : null;
        if (c0583b == null) {
            return false;
        }
        return u(c0583b.b());
    }

    public final C0407a D(InterfaceC3913r interfaceC3913r) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        interfaceC3913r.b(new c(map, interfaceC3913r, map3, map2), q(interfaceC3913r));
        return new C0407a(map, map2, map3);
    }

    public abstract Object E(String str, Object obj);

    public final Object F(yd.z zVar, fd.n nVar, EnumC6469b enumC6469b, E e10, vc.p pVar) {
        Object objInvoke;
        InterfaceC3913r interfaceC3913rO = o(zVar, t(zVar, true, true, hd.b.f36523A.d(nVar.V()), C4768i.f(nVar)));
        if (interfaceC3913rO == null) {
            return null;
        }
        C3916u c3916uR = r(nVar, zVar.b(), zVar.d(), enumC6469b, interfaceC3913rO.e().d().d(C3903h.f33422b.a()));
        if (c3916uR == null || (objInvoke = pVar.invoke(this.f33375b.invoke(interfaceC3913rO), c3916uR)) == null) {
            return null;
        }
        return Ic.n.d(e10) ? G(objInvoke) : objInvoke;
    }

    public abstract Object G(Object obj);

    @Override // yd.InterfaceC6470c
    public Object d(yd.z container, fd.n proto, E expectedType) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(expectedType, "expectedType");
        return F(container, proto, EnumC6469b.PROPERTY, expectedType, d.f33389a);
    }

    @Override // yd.InterfaceC6470c
    public Object j(yd.z container, fd.n proto, E expectedType) {
        AbstractC4862t.e(container, "container");
        AbstractC4862t.e(proto, "proto");
        AbstractC4862t.e(expectedType, "expectedType");
        return F(container, proto, EnumC6469b.PROPERTY_GETTER, expectedType, b.f33379a);
    }
}
