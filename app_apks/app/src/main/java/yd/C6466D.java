package yd;

import Cd.C0732o;
import Cd.F;
import Cd.G;
import Cd.S;
import Cd.T;
import Cd.Z;
import Cd.a0;
import Cd.e0;
import Cd.i0;
import Cd.k0;
import Cd.u0;
import Lc.AbstractC1195x;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import Lc.f0;
import fd.q;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.Q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4859p;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import sd.AbstractC5823c;
import vc.InterfaceC6082a;

/* JADX INFO: renamed from: yd.D, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C6466D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f48527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6466D f48528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vc.l f48531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vc.l f48532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f48533g;

    /* JADX INFO: renamed from: yd.D$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends kotlin.jvm.internal.v implements vc.l {
        public a() {
            super(1);
        }

        public final InterfaceC1180h a(int i10) {
            return C6466D.this.d(i10);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: yd.D$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends kotlin.jvm.internal.v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fd.q f48536b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fd.q qVar) {
            super(0);
            this.f48536b = qVar;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            return C6466D.this.f48527a.c().d().a(this.f48536b, C6466D.this.f48527a.g());
        }
    }

    /* JADX INFO: renamed from: yd.D$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements vc.l {
        public c() {
            super(1);
        }

        public final InterfaceC1180h a(int i10) {
            return C6466D.this.f(i10);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: yd.D$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class d extends AbstractC4859p implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f48538a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f, Cc.c
        public final String getName() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final Cc.g getOwner() {
            return M.b(kd.b.class);
        }

        @Override // kotlin.jvm.internal.AbstractC4849f
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // vc.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final kd.b invoke(kd.b p02) {
            AbstractC4862t.e(p02, "p0");
            return p02.g();
        }
    }

    /* JADX INFO: renamed from: yd.D$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends kotlin.jvm.internal.v implements vc.l {
        public e() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final fd.q invoke(fd.q it) {
            AbstractC4862t.e(it, "it");
            return hd.f.j(it, C6466D.this.f48527a.j());
        }
    }

    /* JADX INFO: renamed from: yd.D$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends kotlin.jvm.internal.v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f48540a = new f();

        public f() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(fd.q it) {
            AbstractC4862t.e(it, "it");
            return Integer.valueOf(it.P());
        }
    }

    public C6466D(m c10, C6466D c6466d, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(typeParameterProtos, "typeParameterProtos");
        AbstractC4862t.e(debugName, "debugName");
        AbstractC4862t.e(containerPresentableName, "containerPresentableName");
        this.f48527a = c10;
        this.f48528b = c6466d;
        this.f48529c = debugName;
        this.f48530d = containerPresentableName;
        this.f48531e = c10.h().b(new a());
        this.f48532f = c10.h().b(new c());
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = Q.i();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                fd.s sVar = (fd.s) it.next();
                linkedHashMap.put(Integer.valueOf(sVar.G()), new Ad.m(this.f48527a, sVar, i10));
                i10++;
            }
        }
        this.f48533g = linkedHashMap;
    }

    public static final List m(fd.q qVar, C6466D c6466d) {
        List argumentList = qVar.Q();
        AbstractC4862t.d(argumentList, "argumentList");
        fd.q qVarJ = hd.f.j(qVar, c6466d.f48527a.j());
        List listM = qVarJ != null ? m(qVarJ, c6466d) : null;
        if (listM == null) {
            listM = C4206t.k();
        }
        return C4179C.C0(argumentList, listM);
    }

    public static /* synthetic */ Cd.M n(C6466D c6466d, fd.q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c6466d.l(qVar, z10);
    }

    public static final InterfaceC1177e t(C6466D c6466d, fd.q qVar, int i10) {
        kd.b bVarA = x.a(c6466d.f48527a.g(), i10);
        List listP = Nd.t.P(Nd.t.I(Nd.q.n(qVar, c6466d.new e()), f.f48540a));
        int iW = Nd.t.w(Nd.q.n(bVarA, d.f48538a));
        while (listP.size() < iW) {
            listP.add(0);
        }
        return c6466d.f48527a.c().q().d(bVarA, listP);
    }

    public final InterfaceC1180h d(int i10) {
        kd.b bVarA = x.a(this.f48527a.g(), i10);
        return bVarA.k() ? this.f48527a.c().b(bVarA) : AbstractC1195x.b(this.f48527a.c().p(), bVarA);
    }

    public final Cd.M e(int i10) {
        if (x.a(this.f48527a.g(), i10).k()) {
            return this.f48527a.c().n().a();
        }
        return null;
    }

    public final InterfaceC1180h f(int i10) {
        kd.b bVarA = x.a(this.f48527a.g(), i10);
        if (bVarA.k()) {
            return null;
        }
        return AbstractC1195x.d(this.f48527a.c().p(), bVarA);
    }

    public final Cd.M g(Cd.E e10, Cd.E e11) {
        Ic.g gVarI = Hd.a.i(e10);
        Mc.g annotations = e10.getAnnotations();
        Cd.E eJ = Ic.f.j(e10);
        List listE = Ic.f.e(e10);
        List listC0 = C4179C.c0(Ic.f.l(e10), 1);
        ArrayList arrayList = new ArrayList(C4207u.v(listC0, 10));
        Iterator it = listC0.iterator();
        while (it.hasNext()) {
            arrayList.add(((i0) it.next()).getType());
        }
        return Ic.f.b(gVarI, annotations, eJ, listE, arrayList, null, e11, true).R0(e10.O0());
    }

    public final Cd.M h(a0 a0Var, e0 e0Var, List list, boolean z10) {
        List list2;
        Cd.M mI;
        int size;
        int size2 = e0Var.getParameters().size() - list.size();
        if (size2 != 0) {
            mI = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                e0 e0VarK = e0Var.n().X(size).k();
                AbstractC4862t.d(e0VarK, "functionTypeConstructor.…on(arity).typeConstructor");
                list2 = list;
                mI = F.j(a0Var, e0VarK, list2, z10, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            mI = i(a0Var, e0Var, list2, z10);
        }
        return mI == null ? Ed.k.f3414a.f(Ed.j.INCONSISTENT_SUSPEND_FUNCTION, list2, e0Var, new String[0]) : mI;
    }

    public final Cd.M i(a0 a0Var, e0 e0Var, List list, boolean z10) {
        Cd.M mJ = F.j(a0Var, e0Var, list, z10, null, 16, null);
        if (Ic.f.p(mJ)) {
            return p(mJ);
        }
        return null;
    }

    public final List j() {
        return C4179C.V0(this.f48533g.values());
    }

    public final f0 k(int i10) {
        f0 f0Var = (f0) this.f48533g.get(Integer.valueOf(i10));
        if (f0Var != null) {
            return f0Var;
        }
        C6466D c6466d = this.f48528b;
        if (c6466d != null) {
            return c6466d.k(i10);
        }
        return null;
    }

    public final Cd.M l(fd.q proto, boolean z10) {
        Cd.M mJ;
        Cd.M mJ2;
        AbstractC4862t.e(proto, "proto");
        Cd.M mE = proto.g0() ? e(proto.R()) : proto.o0() ? e(proto.b0()) : null;
        if (mE != null) {
            return mE;
        }
        e0 e0VarS = s(proto);
        if (Ed.k.m(e0VarS.q())) {
            return Ed.k.f3414a.c(Ed.j.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, e0VarS, e0VarS.toString());
        }
        Ad.a aVar = new Ad.a(this.f48527a.h(), new b(proto));
        a0 a0VarO = o(this.f48527a.c().v(), aVar, e0VarS, this.f48527a.e());
        List listM = m(proto, this);
        ArrayList arrayList = new ArrayList(C4207u.v(listM, 10));
        int i10 = 0;
        for (Object obj : listM) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            List parameters = e0VarS.getParameters();
            AbstractC4862t.d(parameters, "constructor.parameters");
            arrayList.add(r((f0) C4179C.k0(parameters, i10), (q.b) obj));
            i10 = i11;
        }
        List listV0 = C4179C.V0(arrayList);
        InterfaceC1180h interfaceC1180hQ = e0VarS.q();
        boolean z11 = true;
        if (z10 && (interfaceC1180hQ instanceof Lc.e0)) {
            Cd.M mB = F.b((Lc.e0) interfaceC1180hQ, listV0);
            a0 a0VarO2 = o(this.f48527a.c().v(), Mc.g.f9435K.a(C4179C.A0(aVar, mB.getAnnotations())), e0VarS, this.f48527a.e());
            if (!G.b(mB) && !proto.Y()) {
                z11 = false;
            }
            mJ = mB.R0(z11).T0(a0VarO2);
        } else {
            Boolean boolD = hd.b.f36538a.d(proto.U());
            AbstractC4862t.d(boolD, "SUSPEND_TYPE.get(proto.flags)");
            if (boolD.booleanValue()) {
                mJ = h(a0VarO, e0VarS, listV0, proto.Y());
            } else {
                mJ = F.j(a0VarO, e0VarS, listV0, proto.Y(), null, 16, null);
                Boolean boolD2 = hd.b.f36539b.d(proto.U());
                AbstractC4862t.d(boolD2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (boolD2.booleanValue()) {
                    C0732o c0732oB = C0732o.f1388d.b(mJ, true);
                    if (c0732oB == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + mJ + '\'').toString());
                    }
                    mJ = c0732oB;
                }
            }
        }
        fd.q qVarA = hd.f.a(proto, this.f48527a.j());
        if (qVarA != null && (mJ2 = Cd.Q.j(mJ, l(qVarA, false))) != null) {
            mJ = mJ2;
        }
        return proto.g0() ? this.f48527a.c().t().a(x.a(this.f48527a.g(), proto.R()), mJ) : mJ;
    }

    public final a0 o(List list, Mc.g gVar, e0 e0Var, InterfaceC1185m interfaceC1185m) {
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Z) it.next()).a(gVar, e0Var, interfaceC1185m));
        }
        return a0.f1311b.g(C4207u.x(arrayList));
    }

    public final Cd.M p(Cd.E e10) {
        Cd.E type;
        i0 i0Var = (i0) C4179C.u0(Ic.f.l(e10));
        if (i0Var == null || (type = i0Var.getType()) == null) {
            return null;
        }
        InterfaceC1180h interfaceC1180hQ = type.N0().q();
        kd.c cVarL = interfaceC1180hQ != null ? AbstractC5823c.l(interfaceC1180hQ) : null;
        if (type.L0().size() != 1 || (!AbstractC4862t.a(cVarL, Ic.j.f5734p) && !AbstractC4862t.a(cVarL, AbstractC6467E.f48541a))) {
            return (Cd.M) e10;
        }
        Cd.E type2 = ((i0) C4179C.F0(type.L0())).getType();
        AbstractC4862t.d(type2, "continuationArgumentType.arguments.single().type");
        InterfaceC1185m interfaceC1185mE = this.f48527a.e();
        if (!(interfaceC1185mE instanceof InterfaceC1173a)) {
            interfaceC1185mE = null;
        }
        InterfaceC1173a interfaceC1173a = (InterfaceC1173a) interfaceC1185mE;
        return AbstractC4862t.a(interfaceC1173a != null ? AbstractC5823c.h(interfaceC1173a) : null, AbstractC6465C.f48525a) ? g(e10, type2) : g(e10, type2);
    }

    public final Cd.E q(fd.q proto) {
        AbstractC4862t.e(proto, "proto");
        if (!proto.i0()) {
            return l(proto, true);
        }
        String string = this.f48527a.g().getString(proto.V());
        Cd.M mN = n(this, proto, false, 2, null);
        fd.q qVarF = hd.f.f(proto, this.f48527a.j());
        AbstractC4862t.b(qVarF);
        return this.f48527a.c().l().a(proto, string, mN, n(this, qVarF, false, 2, null));
    }

    public final i0 r(f0 f0Var, q.b bVar) {
        if (bVar.r() == q.b.c.STAR) {
            return f0Var == null ? new S(this.f48527a.c().p().n()) : new T(f0Var);
        }
        C6463A c6463a = C6463A.f48513a;
        q.b.c cVarR = bVar.r();
        AbstractC4862t.d(cVarR, "typeArgumentProto.projection");
        u0 u0VarC = c6463a.c(cVarR);
        fd.q qVarP = hd.f.p(bVar, this.f48527a.j());
        return qVarP == null ? new k0(Ed.k.d(Ed.j.NO_RECORDED_TYPE, bVar.toString())) : new k0(u0VarC, q(qVarP));
    }

    public final e0 s(fd.q qVar) {
        InterfaceC1180h interfaceC1180hT;
        Object next;
        if (qVar.g0()) {
            interfaceC1180hT = (InterfaceC1180h) this.f48531e.invoke(Integer.valueOf(qVar.R()));
            if (interfaceC1180hT == null) {
                interfaceC1180hT = t(this, qVar, qVar.R());
            }
        } else if (qVar.p0()) {
            interfaceC1180hT = k(qVar.c0());
            if (interfaceC1180hT == null) {
                return Ed.k.f3414a.e(Ed.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(qVar.c0()), this.f48530d);
            }
        } else if (qVar.q0()) {
            String string = this.f48527a.g().getString(qVar.d0());
            Iterator it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC4862t.a(((f0) next).getName().b(), string)) {
                    break;
                }
            }
            interfaceC1180hT = (f0) next;
            if (interfaceC1180hT == null) {
                return Ed.k.f3414a.e(Ed.j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f48527a.e().toString());
            }
        } else {
            if (!qVar.o0()) {
                return Ed.k.f3414a.e(Ed.j.UNKNOWN_TYPE, new String[0]);
            }
            interfaceC1180hT = (InterfaceC1180h) this.f48532f.invoke(Integer.valueOf(qVar.b0()));
            if (interfaceC1180hT == null) {
                interfaceC1180hT = t(this, qVar, qVar.b0());
            }
        }
        e0 e0VarK = interfaceC1180hT.k();
        AbstractC4862t.d(e0VarK, "classifier.typeConstructor");
        return e0VarK;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f48529c);
        if (this.f48528b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f48528b.f48529c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
