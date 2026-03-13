package Cd;

import Ic.j;
import java.util.ArrayList;
import java.util.List;
import pd.AbstractC5463d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f1385b = g(l0.f1382b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f1386a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements vc.l {
        private static /* synthetic */ void a(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // vc.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(kd.c cVar) {
            if (cVar == null) {
                a(0);
            }
            return Boolean.valueOf(!cVar.equals(j.a.f5771Q));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1387a;

        static {
            int[] iArr = new int[d.values().length];
            f1387a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1387a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1387a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public n0(l0 l0Var) {
        if (l0Var == null) {
            a(7);
        }
        this.f1386a = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.n0.a(int):void");
    }

    public static void b(int i10, i0 i0Var, l0 l0Var) {
        if (i10 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + o(i0Var) + "; substitution: " + o(l0Var));
    }

    public static u0 c(u0 u0Var, i0 i0Var) {
        if (u0Var == null) {
            a(35);
        }
        if (i0Var == null) {
            a(36);
        }
        if (!i0Var.a()) {
            return d(u0Var, i0Var.b());
        }
        u0 u0Var2 = u0.OUT_VARIANCE;
        if (u0Var2 == null) {
            a(37);
        }
        return u0Var2;
    }

    public static u0 d(u0 u0Var, u0 u0Var2) {
        if (u0Var == null) {
            a(38);
        }
        if (u0Var2 == null) {
            a(39);
        }
        u0 u0Var3 = u0.INVARIANT;
        if (u0Var == u0Var3) {
            if (u0Var2 == null) {
                a(40);
            }
            return u0Var2;
        }
        if (u0Var2 == u0Var3) {
            if (u0Var == null) {
                a(41);
            }
            return u0Var;
        }
        if (u0Var == u0Var2) {
            if (u0Var2 == null) {
                a(42);
            }
            return u0Var2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + u0Var + "' and projection kind '" + u0Var2 + "' cannot be combined");
    }

    public static d e(u0 u0Var, u0 u0Var2) {
        u0 u0Var3 = u0.IN_VARIANCE;
        return (u0Var == u0Var3 && u0Var2 == u0.OUT_VARIANCE) ? d.OUT_IN_IN_POSITION : (u0Var == u0.OUT_VARIANCE && u0Var2 == u0Var3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static n0 f(E e10) {
        if (e10 == null) {
            a(6);
        }
        return g(f0.i(e10.N0(), e10.L0()));
    }

    public static n0 g(l0 l0Var) {
        if (l0Var == null) {
            a(0);
        }
        return new n0(l0Var);
    }

    public static n0 h(l0 l0Var, l0 l0Var2) {
        if (l0Var == null) {
            a(3);
        }
        if (l0Var2 == null) {
            a(4);
        }
        return g(C0736t.i(l0Var, l0Var2));
    }

    public static Mc.g i(Mc.g gVar) {
        if (gVar == null) {
            a(33);
        }
        return !gVar.K(j.a.f5771Q) ? gVar : new Mc.l(gVar, new a());
    }

    public static i0 l(E e10, i0 i0Var, Lc.f0 f0Var, i0 i0Var2) {
        if (e10 == null) {
            a(26);
        }
        if (i0Var == null) {
            a(27);
        }
        if (i0Var2 == null) {
            a(28);
        }
        if (!e10.getAnnotations().K(j.a.f5771Q)) {
            if (i0Var == null) {
                a(29);
            }
            return i0Var;
        }
        e0 e0VarN0 = i0Var.getType().N0();
        if (!(e0VarN0 instanceof Dd.j)) {
            return i0Var;
        }
        i0 i0VarE = ((Dd.j) e0VarN0).E();
        u0 u0VarB = i0VarE.b();
        d dVarE = e(i0Var2.b(), u0VarB);
        d dVar = d.OUT_IN_IN_POSITION;
        return dVarE == dVar ? new k0(i0VarE.getType()) : (f0Var != null && e(f0Var.m(), u0VarB) == dVar) ? new k0(i0VarE.getType()) : i0Var;
    }

    public static String o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (Md.c.a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public l0 j() {
        l0 l0Var = this.f1386a;
        if (l0Var == null) {
            a(8);
        }
        return l0Var;
    }

    public boolean k() {
        return this.f1386a.f();
    }

    public n0 m() {
        l0 l0Var = this.f1386a;
        return ((l0Var instanceof C) && l0Var.b()) ? new n0(new C(((C) this.f1386a).j(), ((C) this.f1386a).i(), false)) : this;
    }

    public E n(E e10, u0 u0Var) {
        if (e10 == null) {
            a(9);
        }
        if (u0Var == null) {
            a(10);
        }
        if (k()) {
            if (e10 == null) {
                a(11);
            }
            return e10;
        }
        try {
            E type = u(new k0(u0Var, e10), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e11) {
            Ed.h hVarD = Ed.k.d(Ed.j.UNABLE_TO_SUBSTITUTE_TYPE, e11.getMessage());
            if (hVarD == null) {
                a(13);
            }
            return hVarD;
        }
    }

    public E p(E e10, u0 u0Var) {
        if (e10 == null) {
            a(14);
        }
        if (u0Var == null) {
            a(15);
        }
        i0 i0VarQ = q(new k0(u0Var, j().g(e10, u0Var)));
        if (i0VarQ == null) {
            return null;
        }
        return i0VarQ.getType();
    }

    public i0 q(i0 i0Var) {
        if (i0Var == null) {
            a(16);
        }
        i0 i0VarT = t(i0Var);
        return (this.f1386a.a() || this.f1386a.b()) ? Id.b.c(i0VarT, this.f1386a.b()) : i0VarT;
    }

    public final i0 r(i0 i0Var, int i10) {
        E type = i0Var.getType();
        u0 u0VarB = i0Var.b();
        if (type.N0().q() instanceof Lc.f0) {
            return i0Var;
        }
        M mB = Q.b(type);
        E eP = mB != null ? m().p(mB, u0.INVARIANT) : null;
        E eB = m0.b(type, s(type.N0().getParameters(), type.L0(), i10), this.f1386a.d(type.getAnnotations()));
        if ((eB instanceof M) && (eP instanceof M)) {
            eB = Q.j((M) eB, (M) eP);
        }
        return new k0(u0VarB, eB);
    }

    public final List s(List list, List list2, int i10) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z10 = false;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Lc.f0 f0Var = (Lc.f0) list.get(i11);
            i0 i0Var = (i0) list2.get(i11);
            i0 i0VarU = u(i0Var, f0Var, i10 + 1);
            int i12 = b.f1387a[e(f0Var.m(), i0VarU.b()).ordinal()];
            if (i12 == 1 || i12 == 2) {
                i0VarU = q0.s(f0Var);
            } else if (i12 == 3) {
                u0 u0VarM = f0Var.m();
                u0 u0Var = u0.INVARIANT;
                if (u0VarM != u0Var && !i0VarU.a()) {
                    i0VarU = new k0(u0Var, i0VarU.getType());
                }
            }
            if (i0VarU != i0Var) {
                z10 = true;
            }
            arrayList.add(i0VarU);
        }
        return !z10 ? list2 : arrayList;
    }

    public i0 t(i0 i0Var) {
        if (i0Var == null) {
            a(17);
        }
        if (k()) {
            return i0Var;
        }
        try {
            return u(i0Var, null, 0);
        } catch (c unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final i0 u(i0 i0Var, Lc.f0 f0Var, int i10) throws c {
        if (i0Var == null) {
            a(18);
        }
        b(i10, i0Var, this.f1386a);
        if (!i0Var.a()) {
            E type = i0Var.getType();
            if (type instanceof r0) {
                r0 r0Var = (r0) type;
                t0 t0VarG0 = r0Var.G0();
                E eG0 = r0Var.g0();
                i0 i0VarU = u(new k0(i0Var.b(), t0VarG0), f0Var, i10 + 1);
                return i0VarU.a() ? i0VarU : new k0(i0VarU.b(), s0.d(i0VarU.getType().Q0(), p(eG0, i0Var.b())));
            }
            if (!AbstractC0737u.a(type) && !(type.Q0() instanceof L)) {
                i0 i0VarE = this.f1386a.e(type);
                i0 i0VarL = i0VarE != null ? l(type, i0VarE, f0Var, i0Var) : null;
                u0 u0VarB = i0Var.b();
                if (i0VarL == null && B.b(type) && !c0.b(type)) {
                    AbstractC0741y abstractC0741yA = B.a(type);
                    int i11 = i10 + 1;
                    i0 i0VarU2 = u(new k0(u0VarB, abstractC0741yA.V0()), f0Var, i11);
                    i0 i0VarU3 = u(new k0(u0VarB, abstractC0741yA.W0()), f0Var, i11);
                    u0 u0VarB2 = i0VarU2.b();
                    if (i0VarU2.getType() != abstractC0741yA.V0() || i0VarU3.getType() != abstractC0741yA.W0()) {
                        return new k0(u0VarB2, F.d(m0.a(i0VarU2.getType()), m0.a(i0VarU3.getType())));
                    }
                } else if (!Ic.g.m0(type) && !G.a(type)) {
                    if (i0VarL == null) {
                        i0 i0VarR = r(i0Var, i10);
                        if (i0VarR == null) {
                            a(25);
                        }
                        return i0VarR;
                    }
                    d dVarE = e(u0VarB, i0VarL.b());
                    if (!AbstractC5463d.d(type)) {
                        int i12 = b.f1387a[dVarE.ordinal()];
                        if (i12 == 1) {
                            throw new c("Out-projection in in-position");
                        }
                        if (i12 == 2) {
                            return new k0(u0.OUT_VARIANCE, type.N0().n().I());
                        }
                    }
                    InterfaceC0730m interfaceC0730mA = c0.a(type);
                    if (i0VarL.a()) {
                        return i0VarL;
                    }
                    E eD0 = interfaceC0730mA != null ? interfaceC0730mA.D0(i0VarL.getType()) : q0.q(i0VarL.getType(), type.O0());
                    if (!type.getAnnotations().isEmpty()) {
                        eD0 = Hd.a.v(eD0, new Mc.k(eD0.getAnnotations(), i(this.f1386a.d(type.getAnnotations()))));
                    }
                    if (dVarE == d.NO_CONFLICT) {
                        u0VarB = d(u0VarB, i0VarL.b());
                    }
                    return new k0(u0VarB, eD0);
                }
            }
        }
        return i0Var;
    }
}
