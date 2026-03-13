package Yc;

import Cd.p0;
import Cd.u0;
import Lc.AbstractC1195x;
import Lc.G;
import Lc.InterfaceC1177e;
import Lc.j0;
import Uc.B;
import ad.InterfaceC2685a;
import bd.InterfaceC2909a;
import bd.InterfaceC2910b;
import bd.InterfaceC2911c;
import bd.InterfaceC2913e;
import bd.InterfaceC2915g;
import bd.InterfaceC2916h;
import bd.InterfaceC2921m;
import bd.o;
import bd.x;
import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4207u;
import gc.Q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import nd.AbstractC5164c;
import qd.C5515a;
import qd.p;
import qd.r;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Mc.c, Wc.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Cc.l[] f19899i = {M.g(new E(M.b(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), M.g(new E(M.b(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), M.g(new E(M.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xc.g f19900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2909a f19901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bd.j f19902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bd.i f19903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2685a f19904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bd.i f19905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19907h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {
        public a() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            Collection<InterfaceC2910b> collectionB = e.this.f19901b.b();
            e eVar = e.this;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC2910b interfaceC2910b : collectionB) {
                kd.f name = interfaceC2910b.getName();
                if (name == null) {
                    name = B.f16841c;
                }
                qd.g gVarM = eVar.m(interfaceC2910b);
                C4034q c4034qA = gVarM != null ? AbstractC4040w.a(name, gVarM) : null;
                if (c4034qA != null) {
                    arrayList.add(c4034qA);
                }
            }
            return Q.s(arrayList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements InterfaceC6082a {
        public b() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kd.c invoke() {
            kd.b bVarC = e.this.f19901b.c();
            if (bVarC != null) {
                return bVarC.b();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Cd.M invoke() {
            kd.c cVarE = e.this.e();
            if (cVarE == null) {
                return Ed.k.d(Ed.j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, e.this.f19901b.toString());
            }
            InterfaceC1177e interfaceC1177eF = Kc.d.f(Kc.d.f7812a, cVarE, e.this.f19900a.d().n(), null, 4, null);
            if (interfaceC1177eF == null) {
                InterfaceC2915g interfaceC2915gT = e.this.f19901b.t();
                interfaceC1177eF = interfaceC2915gT != null ? e.this.f19900a.a().n().a(interfaceC2915gT) : null;
                if (interfaceC1177eF == null) {
                    interfaceC1177eF = e.this.h(cVarE);
                }
            }
            return interfaceC1177eF.p();
        }
    }

    public e(Xc.g c10, InterfaceC2909a javaAnnotation, boolean z10) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(javaAnnotation, "javaAnnotation");
        this.f19900a = c10;
        this.f19901b = javaAnnotation;
        this.f19902c = c10.e().h(new b());
        this.f19903d = c10.e().f(new c());
        this.f19904e = c10.a().t().a(javaAnnotation);
        this.f19905f = c10.e().f(new a());
        this.f19906g = javaAnnotation.d();
        this.f19907h = javaAnnotation.G() || z10;
    }

    @Override // Mc.c
    public Map a() {
        return (Map) Bd.m.a(this.f19905f, this, f19899i[2]);
    }

    @Override // Wc.g
    public boolean d() {
        return this.f19906g;
    }

    @Override // Mc.c
    public kd.c e() {
        return (kd.c) Bd.m.b(this.f19902c, this, f19899i[0]);
    }

    public final InterfaceC1177e h(kd.c cVar) {
        G gD = this.f19900a.d();
        kd.b bVarM = kd.b.m(cVar);
        AbstractC4862t.d(bVarM, "topLevel(fqName)");
        return AbstractC1195x.c(gD, bVarM, this.f19900a.a().b().d().q());
    }

    @Override // Mc.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC2685a j() {
        return this.f19904e;
    }

    @Override // Mc.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Cd.M getType() {
        return (Cd.M) Bd.m.a(this.f19903d, this, f19899i[1]);
    }

    public final boolean l() {
        return this.f19907h;
    }

    public final qd.g m(InterfaceC2910b interfaceC2910b) {
        if (interfaceC2910b instanceof o) {
            return qd.h.f43439a.c(((o) interfaceC2910b).getValue());
        }
        if (interfaceC2910b instanceof InterfaceC2921m) {
            InterfaceC2921m interfaceC2921m = (InterfaceC2921m) interfaceC2910b;
            return p(interfaceC2921m.c(), interfaceC2921m.d());
        }
        if (!(interfaceC2910b instanceof InterfaceC2913e)) {
            if (interfaceC2910b instanceof InterfaceC2911c) {
                return n(((InterfaceC2911c) interfaceC2910b).a());
            }
            if (interfaceC2910b instanceof InterfaceC2916h) {
                return q(((InterfaceC2916h) interfaceC2910b).b());
            }
            return null;
        }
        InterfaceC2913e interfaceC2913e = (InterfaceC2913e) interfaceC2910b;
        kd.f name = interfaceC2913e.getName();
        if (name == null) {
            name = B.f16841c;
        }
        AbstractC4862t.d(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
        return o(name, interfaceC2913e.getElements());
    }

    public final qd.g n(InterfaceC2909a interfaceC2909a) {
        return new C5515a(new e(this.f19900a, interfaceC2909a, false, 4, null));
    }

    public final qd.g o(kd.f fVar, List list) {
        Cd.E eL;
        Cd.M type = getType();
        AbstractC4862t.d(type, "type");
        if (Cd.G.a(type)) {
            return null;
        }
        InterfaceC1177e interfaceC1177eI = AbstractC5823c.i(this);
        AbstractC4862t.b(interfaceC1177eI);
        j0 j0VarB = Vc.a.b(fVar, interfaceC1177eI);
        if (j0VarB == null || (eL = j0VarB.getType()) == null) {
            eL = this.f19900a.a().m().n().l(u0.INVARIANT, Ed.k.d(Ed.j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        AbstractC4862t.d(eL, "DescriptorResolverUtils.…GUMENT)\n                )");
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qd.g gVarM = m((InterfaceC2910b) it.next());
            if (gVarM == null) {
                gVarM = new r();
            }
            arrayList.add(gVarM);
        }
        return qd.h.f43439a.a(arrayList, eL);
    }

    public final qd.g p(kd.b bVar, kd.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new qd.j(bVar, fVar);
    }

    public final qd.g q(x xVar) {
        return p.f43455b.a(this.f19900a.g().o(xVar, Zc.b.b(p0.COMMON, false, false, null, 7, null)));
    }

    public String toString() {
        return AbstractC5164c.s(AbstractC5164c.f40783g, this, null, 2, null);
    }

    public /* synthetic */ e(Xc.g gVar, InterfaceC2909a interfaceC2909a, boolean z10, int i10, AbstractC4854k abstractC4854k) {
        this(gVar, interfaceC2909a, (i10 & 4) != 0 ? false : z10);
    }
}
