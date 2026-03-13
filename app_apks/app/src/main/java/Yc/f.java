package Yc;

import Cd.AbstractC0719b;
import Cd.E;
import Cd.F;
import Cd.a0;
import Cd.e0;
import Cd.k0;
import Cd.p0;
import Cd.u0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.D;
import Lc.EnumC1178f;
import Lc.InterfaceC1176d;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.J;
import Lc.Y;
import Lc.d0;
import Lc.f0;
import Lc.g0;
import Lc.h0;
import Lc.n0;
import Oc.AbstractC1813g;
import Uc.B;
import Uc.s;
import bd.InterfaceC2915g;
import bd.InterfaceC2918j;
import bd.x;
import bd.y;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import gc.C4207u;
import gc.M;
import gc.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jc.C4757a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import qd.u;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;
import vd.C6097f;
import vd.InterfaceC6099h;
import yd.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC1813g implements Wc.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f19911y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Set f19912z = U.h("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Xc.g f19913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2915g f19914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC1177e f19915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Xc.g f19916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC4028k f19917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EnumC1178f f19918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final D f19919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n0 f19920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f19921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f19922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f19923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Y f19924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C6097f f19925u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f19926v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Mc.g f19927w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bd.i f19928x;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b extends AbstractC0719b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bd.i f19929d;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends v implements InterfaceC6082a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f19931a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar) {
                super(0);
                this.f19931a = fVar;
            }

            @Override // vc.InterfaceC6082a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return g0.d(this.f19931a);
            }
        }

        public b() {
            super(f.this.f19916l.e());
            this.f19929d = f.this.f19916l.e().f(new a(f.this));
        }

        @Override // Cd.AbstractC0723f
        public Collection f() {
            Collection collectionO = f.this.P0().o();
            ArrayList arrayList = new ArrayList(collectionO.size());
            ArrayList<x> arrayList2 = new ArrayList(0);
            E eV = v();
            Iterator it = collectionO.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC2918j interfaceC2918j = (InterfaceC2918j) it.next();
                E eH = f.this.f19916l.a().r().h(f.this.f19916l.g().o(interfaceC2918j, Zc.b.b(p0.SUPERTYPE, false, false, null, 7, null)), f.this.f19916l);
                if (eH.N0().q() instanceof J.b) {
                    arrayList2.add(interfaceC2918j);
                }
                if (!AbstractC4862t.a(eH.N0(), eV != null ? eV.N0() : null) && !Ic.g.b0(eH)) {
                    arrayList.add(eH);
                }
            }
            InterfaceC1177e interfaceC1177e = f.this.f19915k;
            Md.a.a(arrayList, interfaceC1177e != null ? Kc.l.a(interfaceC1177e, f.this).c().p(interfaceC1177e.p(), u0.INVARIANT) : null);
            Md.a.a(arrayList, eV);
            if (!arrayList2.isEmpty()) {
                r rVarC = f.this.f19916l.a().c();
                InterfaceC1177e interfaceC1177eQ = q();
                ArrayList arrayList3 = new ArrayList(C4207u.v(arrayList2, 10));
                for (x xVar : arrayList2) {
                    AbstractC4862t.c(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((InterfaceC2918j) xVar).E());
                }
                rVarC.a(interfaceC1177eQ, arrayList3);
            }
            return !arrayList.isEmpty() ? C4179C.V0(arrayList) : C4205s.d(f.this.f19916l.d().n().i());
        }

        @Override // Cd.e0
        public List getParameters() {
            return (List) this.f19929d.invoke();
        }

        @Override // Cd.AbstractC0723f
        public d0 j() {
            return f.this.f19916l.a().v();
        }

        @Override // Cd.e0
        public boolean r() {
            return true;
        }

        public String toString() {
            String strB = f.this.getName().b();
            AbstractC4862t.d(strB, "name.asString()");
            return strB;
        }

        @Override // Cd.AbstractC0729l, Cd.e0
        /* JADX INFO: renamed from: u */
        public InterfaceC1177e q() {
            return f.this;
        }

        public final E v() {
            kd.c cVarB;
            ArrayList arrayList;
            kd.c cVarW = w();
            if (cVarW == null || cVarW.d() || !cVarW.i(Ic.j.f5738t)) {
                cVarW = null;
            }
            if (cVarW == null) {
                cVarB = Uc.m.f16929a.b(AbstractC5823c.l(f.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarW;
            }
            InterfaceC1177e interfaceC1177eV = AbstractC5823c.v(f.this.f19916l.d(), cVarB, Tc.d.FROM_JAVA_LOADER);
            if (interfaceC1177eV == null) {
                return null;
            }
            int size = interfaceC1177eV.k().getParameters().size();
            List parameters = f.this.k().getParameters();
            AbstractC4862t.d(parameters, "getTypeConstructor().parameters");
            int size2 = parameters.size();
            if (size2 == size) {
                arrayList = new ArrayList(C4207u.v(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new k0(u0.INVARIANT, ((f0) it.next()).p()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarW != null) {
                    return null;
                }
                k0 k0Var = new k0(u0.INVARIANT, ((f0) C4179C.F0(parameters)).p());
                Bc.f fVar = new Bc.f(1, size);
                ArrayList arrayList2 = new ArrayList(C4207u.v(fVar, 10));
                Iterator it2 = fVar.iterator();
                while (it2.hasNext()) {
                    ((M) it2).nextInt();
                    arrayList2.add(k0Var);
                }
                arrayList = arrayList2;
            }
            return F.g(a0.f1311b.h(), interfaceC1177eV, arrayList);
        }

        public final kd.c w() {
            String str;
            Mc.g annotations = f.this.getAnnotations();
            kd.c PURELY_IMPLEMENTS_ANNOTATION = B.f16855q;
            AbstractC4862t.d(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            Mc.c cVarJ = annotations.j(PURELY_IMPLEMENTS_ANNOTATION);
            if (cVarJ == null) {
                return null;
            }
            Object objG0 = C4179C.G0(cVarJ.a().values());
            u uVar = objG0 instanceof u ? (u) objG0 : null;
            if (uVar == null || (str = (String) uVar.b()) == null || !kd.e.e(str)) {
                return null;
            }
            return new kd.c(str);
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
            List<y> typeParameters = f.this.P0().getTypeParameters();
            f fVar = f.this;
            ArrayList arrayList = new ArrayList(C4207u.v(typeParameters, 10));
            for (y yVar : typeParameters) {
                f0 f0VarA = fVar.f19916l.f().a(yVar);
                if (f0VarA == null) {
                    throw new AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.P0() + ", so it must be resolved");
                }
                arrayList.add(f0VarA);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C4757a.a(AbstractC5823c.l((InterfaceC1177e) obj).b(), AbstractC5823c.l((InterfaceC1177e) obj2).b());
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
            kd.b bVarK = AbstractC5823c.k(f.this);
            if (bVarK != null) {
                return f.this.R0().a().f().a(bVarK);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yc.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0253f extends v implements vc.l {
        public C0253f() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(Dd.g it) {
            AbstractC4862t.e(it, "it");
            Xc.g gVar = f.this.f19916l;
            f fVar = f.this;
            return new g(gVar, fVar, fVar.P0(), f.this.f19915k != null, f.this.f19923s);
        }
    }

    public /* synthetic */ f(Xc.g gVar, InterfaceC1185m interfaceC1185m, InterfaceC2915g interfaceC2915g, InterfaceC1177e interfaceC1177e, int i10, AbstractC4854k abstractC4854k) {
        this(gVar, interfaceC1185m, interfaceC2915g, (i10 & 8) != 0 ? null : interfaceC1177e);
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1176d C() {
        return null;
    }

    @Override // Lc.InterfaceC1177e
    public boolean I0() {
        return false;
    }

    public final f N0(Vc.g javaResolverCache, InterfaceC1177e interfaceC1177e) {
        AbstractC4862t.e(javaResolverCache, "javaResolverCache");
        Xc.g gVar = this.f19916l;
        Xc.g gVarI = Xc.a.i(gVar, gVar.a().x(javaResolverCache));
        InterfaceC1185m containingDeclaration = b();
        AbstractC4862t.d(containingDeclaration, "containingDeclaration");
        return new f(gVarI, containingDeclaration, this.f19914j, interfaceC1177e);
    }

    @Override // Lc.InterfaceC1177e
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public List l() {
        return (List) this.f19923s.x0().invoke();
    }

    public final InterfaceC2915g P0() {
        return this.f19914j;
    }

    public final List Q0() {
        return (List) this.f19917m.getValue();
    }

    @Override // Oc.AbstractC1807a, Lc.InterfaceC1177e
    public InterfaceC6099h R() {
        return this.f19925u;
    }

    public final Xc.g R0() {
        return this.f19913i;
    }

    @Override // Lc.InterfaceC1177e
    public h0 S() {
        return null;
    }

    @Override // Oc.AbstractC1807a, Lc.InterfaceC1177e
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public g U() {
        InterfaceC6099h interfaceC6099hU = super.U();
        AbstractC4862t.c(interfaceC6099hU, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (g) interfaceC6099hU;
    }

    @Override // Oc.t
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public g D0(Dd.g kotlinTypeRefiner) {
        AbstractC4862t.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return (g) this.f19924t.c(kotlinTypeRefiner);
    }

    @Override // Lc.C
    public boolean V() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean Z() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean d0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public EnumC1178f f() {
        return this.f19918n;
    }

    @Override // Mc.a
    public Mc.g getAnnotations() {
        return this.f19927w;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1189q, Lc.C
    public AbstractC1192u getVisibility() {
        if (!AbstractC4862t.a(this.f19920p, AbstractC1191t.f8771a) || this.f19914j.f() != null) {
            return Uc.J.d(this.f19920p);
        }
        AbstractC1192u abstractC1192u = s.f16939a;
        AbstractC4862t.d(abstractC1192u, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return abstractC1192u;
    }

    @Override // Lc.InterfaceC1177e
    public boolean i0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public boolean isInline() {
        return false;
    }

    @Override // Lc.InterfaceC1180h
    public e0 k() {
        return this.f19922r;
    }

    @Override // Lc.C
    public boolean k0() {
        return false;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC6099h l0() {
        return this.f19926v;
    }

    @Override // Lc.InterfaceC1177e
    public InterfaceC1177e m0() {
        return null;
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1181i
    public List q() {
        return (List) this.f19928x.invoke();
    }

    @Override // Lc.InterfaceC1177e, Lc.C
    public D r() {
        return this.f19919o;
    }

    public String toString() {
        return "Lazy Java class " + AbstractC5823c.m(this);
    }

    @Override // Lc.InterfaceC1177e
    public Collection x() {
        if (this.f19919o != D.SEALED) {
            return C4206t.k();
        }
        Zc.a aVarB = Zc.b.b(p0.COMMON, false, false, null, 7, null);
        Collection collectionC = this.f19914j.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            InterfaceC1180h interfaceC1180hQ = this.f19916l.g().o((InterfaceC2918j) it.next(), aVarB).N0().q();
            InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
            if (interfaceC1177e != null) {
                arrayList.add(interfaceC1177e);
            }
        }
        return C4179C.J0(arrayList, new d());
    }

    @Override // Lc.InterfaceC1181i
    public boolean z() {
        return this.f19921q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Xc.g outerContext, InterfaceC1185m containingDeclaration, InterfaceC2915g jClass, InterfaceC1177e interfaceC1177e) {
        D dA;
        super(outerContext.e(), containingDeclaration, jClass.getName(), outerContext.a().t().a(jClass), false);
        AbstractC4862t.e(outerContext, "outerContext");
        AbstractC4862t.e(containingDeclaration, "containingDeclaration");
        AbstractC4862t.e(jClass, "jClass");
        this.f19913i = outerContext;
        this.f19914j = jClass;
        this.f19915k = interfaceC1177e;
        Xc.g gVarD = Xc.a.d(outerContext, this, jClass, 0, 4, null);
        this.f19916l = gVarD;
        gVarD.a().h().c(jClass, this);
        jClass.K();
        this.f19917m = C4029l.b(new e());
        this.f19918n = jClass.m() ? EnumC1178f.ANNOTATION_CLASS : jClass.J() ? EnumC1178f.INTERFACE : jClass.v() ? EnumC1178f.ENUM_CLASS : EnumC1178f.CLASS;
        if (jClass.m() || jClass.v()) {
            dA = D.FINAL;
        } else {
            dA = D.Companion.a(jClass.y(), jClass.y() || jClass.isAbstract() || jClass.J(), !jClass.isFinal());
        }
        this.f19919o = dA;
        this.f19920p = jClass.getVisibility();
        this.f19921q = (jClass.f() == null || jClass.P()) ? false : true;
        this.f19922r = new b();
        g gVar = new g(gVarD, this, jClass, interfaceC1177e != null, null, 16, null);
        this.f19923s = gVar;
        this.f19924t = Y.f8737e.a(this, gVarD.e(), gVarD.a().k().d(), new C0253f());
        this.f19925u = new C6097f(gVar);
        this.f19926v = new l(gVarD, jClass, this);
        this.f19927w = Xc.e.a(gVarD, jClass);
        this.f19928x = gVarD.e().f(new c());
    }
}
