package Zc;

import Cd.E;
import Cd.F;
import Cd.H;
import Cd.M;
import Cd.a0;
import Cd.b0;
import Cd.e0;
import Cd.h0;
import Cd.i0;
import Cd.k0;
import Cd.p0;
import Cd.q0;
import Cd.u0;
import Ed.j;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.f0;
import Uc.J;
import Xc.k;
import bd.AbstractC2905A;
import bd.InterfaceC2907C;
import bd.InterfaceC2914f;
import bd.InterfaceC2915g;
import bd.InterfaceC2917i;
import bd.InterfaceC2918j;
import bd.x;
import bd.y;
import gc.C4179C;
import gc.C4205s;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xc.g f20436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f20437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f20438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f20439d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends v implements InterfaceC6082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f20441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Zc.a f20442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e0 f20443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2918j f20444e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f0 f0Var, Zc.a aVar, e0 e0Var, InterfaceC2918j interfaceC2918j) {
            super(0);
            this.f20441b = f0Var;
            this.f20442c = aVar;
            this.f20443d = e0Var;
            this.f20444e = interfaceC2918j;
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke() {
            h0 h0Var = d.this.f20439d;
            f0 f0Var = this.f20441b;
            Zc.a aVar = this.f20442c;
            InterfaceC1180h interfaceC1180hQ = this.f20443d.q();
            return h0Var.c(f0Var, aVar.k(interfaceC1180hQ != null ? interfaceC1180hQ.p() : null).j(this.f20444e.s()));
        }
    }

    public d(Xc.g c10, k typeParameterResolver) {
        AbstractC4862t.e(c10, "c");
        AbstractC4862t.e(typeParameterResolver, "typeParameterResolver");
        this.f20436a = c10;
        this.f20437b = typeParameterResolver;
        f fVar = new f();
        this.f20438c = fVar;
        this.f20439d = new h0(fVar, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ E l(d dVar, InterfaceC2914f interfaceC2914f, Zc.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return dVar.k(interfaceC2914f, aVar, z10);
    }

    public static final Ed.h n(InterfaceC2918j interfaceC2918j) {
        return Ed.k.d(j.UNRESOLVED_JAVA_CLASS, interfaceC2918j.E());
    }

    public final boolean b(InterfaceC2918j interfaceC2918j, InterfaceC1177e interfaceC1177e) {
        u0 u0VarM;
        if (!AbstractC2905A.a((x) C4179C.u0(interfaceC2918j.z()))) {
            return false;
        }
        List parameters = Kc.d.f7812a.b(interfaceC1177e).k().getParameters();
        AbstractC4862t.d(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        f0 f0Var = (f0) C4179C.u0(parameters);
        return (f0Var == null || (u0VarM = f0Var.m()) == null || u0VarM == u0.OUT_VARIANCE) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c(bd.InterfaceC2918j r10, Zc.a r11, Cd.e0 r12) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Zc.d.c(bd.j, Zc.a, Cd.e0):java.util.List");
    }

    public final List d(InterfaceC2918j interfaceC2918j, List list, e0 e0Var, Zc.a aVar) {
        d dVar;
        InterfaceC2918j interfaceC2918j2;
        e0 e0Var2;
        Zc.a aVar2;
        i0 i0VarA;
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            if (Hd.a.l(f0Var, null, aVar.c())) {
                i0VarA = q0.t(f0Var, aVar);
                dVar = this;
                interfaceC2918j2 = interfaceC2918j;
                e0Var2 = e0Var;
                aVar2 = aVar;
            } else {
                dVar = this;
                interfaceC2918j2 = interfaceC2918j;
                e0Var2 = e0Var;
                aVar2 = aVar;
                i0VarA = dVar.f20438c.a(f0Var, aVar2.j(interfaceC2918j2.s()), dVar.f20439d, new H(this.f20436a.e(), dVar.new a(f0Var, aVar2, e0Var2, interfaceC2918j2)));
            }
            arrayList.add(i0VarA);
            this = dVar;
            aVar = aVar2;
            e0Var = e0Var2;
            interfaceC2918j = interfaceC2918j2;
        }
        return arrayList;
    }

    public final M e(InterfaceC2918j interfaceC2918j, Zc.a aVar, M m10) {
        InterfaceC2918j interfaceC2918j2;
        a0 a0VarB;
        if (m10 == null || (a0VarB = m10.M0()) == null) {
            interfaceC2918j2 = interfaceC2918j;
            a0VarB = b0.b(new Xc.d(this.f20436a, interfaceC2918j2, false, 4, null));
        } else {
            interfaceC2918j2 = interfaceC2918j;
        }
        a0 a0Var = a0VarB;
        e0 e0VarF = f(interfaceC2918j2, aVar);
        if (e0VarF == null) {
            return null;
        }
        boolean zI = i(aVar);
        return (AbstractC4862t.a(m10 != null ? m10.N0() : null, e0VarF) && !interfaceC2918j2.s() && zI) ? m10.R0(true) : F.j(a0Var, e0VarF, c(interfaceC2918j2, aVar, e0VarF), zI, null, 16, null);
    }

    public final e0 f(InterfaceC2918j interfaceC2918j, Zc.a aVar) {
        e0 e0VarK;
        InterfaceC2917i interfaceC2917iA = interfaceC2918j.a();
        if (interfaceC2917iA == null) {
            return g(interfaceC2918j);
        }
        if (!(interfaceC2917iA instanceof InterfaceC2915g)) {
            if (interfaceC2917iA instanceof y) {
                f0 f0VarA = this.f20437b.a((y) interfaceC2917iA);
                if (f0VarA != null) {
                    return f0VarA.k();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + interfaceC2917iA);
        }
        InterfaceC2915g interfaceC2915g = (InterfaceC2915g) interfaceC2917iA;
        kd.c cVarE = interfaceC2915g.e();
        if (cVarE != null) {
            InterfaceC1177e interfaceC1177eJ = j(interfaceC2918j, aVar, cVarE);
            if (interfaceC1177eJ == null) {
                interfaceC1177eJ = this.f20436a.a().n().a(interfaceC2915g);
            }
            return (interfaceC1177eJ == null || (e0VarK = interfaceC1177eJ.k()) == null) ? g(interfaceC2918j) : e0VarK;
        }
        throw new AssertionError("Class type should have a FQ name: " + interfaceC2917iA);
    }

    public final e0 g(InterfaceC2918j interfaceC2918j) {
        kd.b bVarM = kd.b.m(new kd.c(interfaceC2918j.H()));
        AbstractC4862t.d(bVarM, "topLevel(FqName(javaType.classifierQualifiedName))");
        e0 e0VarK = this.f20436a.a().b().d().q().d(bVarM, C4205s.d(0)).k();
        AbstractC4862t.d(e0VarK, "c.components.deserialize…istOf(0)).typeConstructor");
        return e0VarK;
    }

    public final boolean h(u0 u0Var, f0 f0Var) {
        return (f0Var.m() == u0.INVARIANT || u0Var == f0Var.m()) ? false : true;
    }

    public final boolean i(Zc.a aVar) {
        return (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == p0.SUPERTYPE) ? false : true;
    }

    public final InterfaceC1177e j(InterfaceC2918j interfaceC2918j, Zc.a aVar, kd.c cVar) {
        if (aVar.h() && AbstractC4862t.a(cVar, e.f20445a)) {
            return this.f20436a.a().p().c();
        }
        Kc.d dVar = Kc.d.f7812a;
        InterfaceC1177e interfaceC1177eF = Kc.d.f(dVar, cVar, this.f20436a.d().n(), null, 4, null);
        if (interfaceC1177eF == null) {
            return null;
        }
        return (dVar.d(interfaceC1177eF) && (aVar.g() == c.FLEXIBLE_LOWER_BOUND || aVar.b() == p0.SUPERTYPE || b(interfaceC2918j, interfaceC1177eF))) ? dVar.b(interfaceC1177eF) : interfaceC1177eF;
    }

    public final E k(InterfaceC2914f arrayType, Zc.a attr, boolean z10) {
        AbstractC4862t.e(arrayType, "arrayType");
        AbstractC4862t.e(attr, "attr");
        x xVarH = arrayType.h();
        bd.v vVar = xVarH instanceof bd.v ? (bd.v) xVarH : null;
        Ic.h type = vVar != null ? vVar.getType() : null;
        Xc.d dVar = new Xc.d(this.f20436a, arrayType, true);
        if (type != null) {
            M mO = this.f20436a.d().n().O(type);
            AbstractC4862t.d(mO, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            Hd.a.v(mO, Mc.g.f9435K.a(C4179C.A0(dVar, mO.getAnnotations())));
            return attr.h() ? mO : F.d(mO, mO.R0(true));
        }
        E eO = o(xVarH, b.b(p0.COMMON, attr.h(), false, null, 6, null));
        if (attr.h()) {
            M m10 = this.f20436a.d().n().m(z10 ? u0.OUT_VARIANCE : u0.INVARIANT, eO, dVar);
            AbstractC4862t.d(m10, "c.module.builtIns.getArr…mponentType, annotations)");
            return m10;
        }
        M m11 = this.f20436a.d().n().m(u0.INVARIANT, eO, dVar);
        AbstractC4862t.d(m11, "c.module.builtIns.getArr…mponentType, annotations)");
        return F.d(m11, this.f20436a.d().n().m(u0.OUT_VARIANCE, eO, dVar).R0(true));
    }

    public final E m(InterfaceC2918j interfaceC2918j, Zc.a aVar) {
        boolean z10 = (aVar.h() || aVar.b() == p0.SUPERTYPE) ? false : true;
        boolean zS = interfaceC2918j.s();
        if (!zS && !z10) {
            M mE = e(interfaceC2918j, aVar, null);
            return mE != null ? mE : n(interfaceC2918j);
        }
        M mE2 = e(interfaceC2918j, aVar.l(c.FLEXIBLE_LOWER_BOUND), null);
        if (mE2 == null) {
            return n(interfaceC2918j);
        }
        M mE3 = e(interfaceC2918j, aVar.l(c.FLEXIBLE_UPPER_BOUND), mE2);
        return mE3 == null ? n(interfaceC2918j) : zS ? new h(mE2, mE3) : F.d(mE2, mE3);
    }

    public final E o(x xVar, Zc.a attr) {
        E eO;
        AbstractC4862t.e(attr, "attr");
        if (xVar instanceof bd.v) {
            Ic.h type = ((bd.v) xVar).getType();
            M mR = type != null ? this.f20436a.d().n().R(type) : this.f20436a.d().n().Z();
            AbstractC4862t.d(mR, "{\n                val pr…ns.unitType\n            }");
            return mR;
        }
        if (xVar instanceof InterfaceC2918j) {
            return m((InterfaceC2918j) xVar, attr);
        }
        if (xVar instanceof InterfaceC2914f) {
            return l(this, (InterfaceC2914f) xVar, attr, false, 4, null);
        }
        if (xVar instanceof InterfaceC2907C) {
            x xVarW = ((InterfaceC2907C) xVar).w();
            if (xVarW != null && (eO = o(xVarW, attr)) != null) {
                return eO;
            }
            M mY = this.f20436a.d().n().y();
            AbstractC4862t.d(mY, "c.module.builtIns.defaultBound");
            return mY;
        }
        if (xVar == null) {
            M mY2 = this.f20436a.d().n().y();
            AbstractC4862t.d(mY2, "c.module.builtIns.defaultBound");
            return mY2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }

    public final i0 p(x xVar, Zc.a aVar, f0 f0Var) {
        i0 i0VarT;
        if (!(xVar instanceof InterfaceC2907C)) {
            return new k0(u0.INVARIANT, o(xVar, aVar));
        }
        InterfaceC2907C interfaceC2907C = (InterfaceC2907C) xVar;
        x xVarW = interfaceC2907C.w();
        u0 u0Var = interfaceC2907C.L() ? u0.OUT_VARIANCE : u0.IN_VARIANCE;
        if (xVarW == null || h(u0Var, f0Var)) {
            i0VarT = q0.t(f0Var, aVar);
        } else {
            Mc.c cVarA = J.a(this.f20436a, interfaceC2907C);
            E eO = o(xVarW, b.b(p0.COMMON, false, false, null, 7, null));
            if (cVarA != null) {
                eO = Hd.a.v(eO, Mc.g.f9435K.a(C4179C.B0(eO.getAnnotations(), cVarA)));
            }
            i0VarT = Hd.a.f(eO, u0Var, f0Var);
        }
        AbstractC4862t.d(i0VarT, "{\n                val bo…          }\n            }");
        return i0VarT;
    }
}
