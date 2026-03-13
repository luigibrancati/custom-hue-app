package Id;

import Cd.B;
import Cd.E;
import Cd.F;
import Cd.M;
import Cd.e0;
import Cd.f0;
import Cd.i0;
import Cd.k0;
import Cd.m0;
import Cd.n0;
import Cd.q0;
import Cd.s0;
import Cd.t0;
import Cd.u0;
import Ic.g;
import fc.C4032o;
import fc.C4034q;
import gc.C4179C;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import pd.AbstractC5463d;
import pd.InterfaceC5461b;
import sd.AbstractC5823c;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5843a;

        static {
            int[] iArr = new int[u0.values().length];
            try {
                iArr[u0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5843a = iArr;
        }
    }

    /* JADX INFO: renamed from: Id.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0098b extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0098b f5844a = new C0098b();

        public C0098b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 it) {
            AbstractC4862t.d(it, "it");
            return Boolean.valueOf(AbstractC5463d.d(it));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends f0 {
        @Override // Cd.f0
        public i0 k(e0 key) {
            AbstractC4862t.e(key, "key");
            InterfaceC5461b interfaceC5461b = key instanceof InterfaceC5461b ? (InterfaceC5461b) key : null;
            if (interfaceC5461b == null) {
                return null;
            }
            return interfaceC5461b.E().a() ? new k0(u0.OUT_VARIANCE, interfaceC5461b.E().getType()) : interfaceC5461b.E();
        }
    }

    public static final Id.a a(E type) {
        Object objE;
        AbstractC4862t.e(type, "type");
        if (B.b(type)) {
            Id.a aVarA = a(B.c(type));
            Id.a aVarA2 = a(B.d(type));
            return new Id.a(s0.b(F.d(B.c((E) aVarA.c()), B.d((E) aVarA2.c())), type), s0.b(F.d(B.c((E) aVarA.d()), B.d((E) aVarA2.d())), type));
        }
        e0 e0VarN0 = type.N0();
        if (AbstractC5463d.d(type)) {
            AbstractC4862t.c(e0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            i0 i0VarE = ((InterfaceC5461b) e0VarN0).E();
            E type2 = i0VarE.getType();
            AbstractC4862t.d(type2, "typeProjection.type");
            E eB = b(type2, type);
            int i10 = a.f5843a[i0VarE.b().ordinal()];
            if (i10 == 2) {
                M mI = Hd.a.i(type).I();
                AbstractC4862t.d(mI, "type.builtIns.nullableAnyType");
                return new Id.a(eB, mI);
            }
            if (i10 == 3) {
                M mH = Hd.a.i(type).H();
                AbstractC4862t.d(mH, "type.builtIns.nothingType");
                return new Id.a(b(mH, type), eB);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + i0VarE);
        }
        if (type.L0().isEmpty() || type.L0().size() != e0VarN0.getParameters().size()) {
            return new Id.a(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = type.L0();
        List parameters = e0VarN0.getParameters();
        AbstractC4862t.d(parameters, "typeConstructor.parameters");
        for (C4034q c4034q : C4179C.d1(listL0, parameters)) {
            i0 i0Var = (i0) c4034q.a();
            Lc.f0 typeParameter = (Lc.f0) c4034q.b();
            AbstractC4862t.d(typeParameter, "typeParameter");
            Id.c cVarG = g(i0Var, typeParameter);
            if (i0Var.a()) {
                arrayList.add(cVarG);
                arrayList2.add(cVarG);
            } else {
                Id.a aVarD = d(cVarG);
                Id.c cVar = (Id.c) aVarD.a();
                Id.c cVar2 = (Id.c) aVarD.b();
                arrayList.add(cVar);
                arrayList2.add(cVar2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((Id.c) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objE = Hd.a.i(type).H();
            AbstractC4862t.d(objE, "type.builtIns.nothingType");
        } else {
            objE = e(type, arrayList);
        }
        return new Id.a(objE, e(type, arrayList2));
    }

    public static final E b(E e10, E e11) {
        E eQ = q0.q(e10, e11.O0());
        AbstractC4862t.d(eQ, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return eQ;
    }

    public static final i0 c(i0 i0Var, boolean z10) {
        if (i0Var == null) {
            return null;
        }
        if (!i0Var.a()) {
            E type = i0Var.getType();
            AbstractC4862t.d(type, "typeProjection.type");
            if (q0.c(type, C0098b.f5844a)) {
                u0 u0VarB = i0Var.b();
                AbstractC4862t.d(u0VarB, "typeProjection.projectionKind");
                return u0VarB == u0.OUT_VARIANCE ? new k0(u0VarB, (E) a(type).d()) : z10 ? new k0(u0VarB, (E) a(type).c()) : f(i0Var);
            }
        }
        return i0Var;
    }

    public static final Id.a d(Id.c cVar) {
        Id.a aVarA = a(cVar.a());
        E e10 = (E) aVarA.a();
        E e11 = (E) aVarA.b();
        Id.a aVarA2 = a(cVar.b());
        return new Id.a(new Id.c(cVar.c(), e11, (E) aVarA2.a()), new Id.c(cVar.c(), e10, (E) aVarA2.b()));
    }

    public static final E e(E e10, List list) {
        e10.L0().size();
        list.size();
        ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Id.c) it.next()));
        }
        return m0.e(e10, arrayList, null, null, 6, null);
    }

    public static final i0 f(i0 i0Var) {
        n0 n0VarG = n0.g(new c());
        AbstractC4862t.d(n0VarG, "create(object : TypeCons…ojection\n        }\n    })");
        return n0VarG.t(i0Var);
    }

    public static final Id.c g(i0 i0Var, Lc.f0 f0Var) {
        int i10 = a.f5843a[n0.c(f0Var.m(), i0Var).ordinal()];
        if (i10 == 1) {
            E type = i0Var.getType();
            AbstractC4862t.d(type, "type");
            E type2 = i0Var.getType();
            AbstractC4862t.d(type2, "type");
            return new Id.c(f0Var, type, type2);
        }
        if (i10 == 2) {
            E type3 = i0Var.getType();
            AbstractC4862t.d(type3, "type");
            M mI = AbstractC5823c.j(f0Var).I();
            AbstractC4862t.d(mI, "typeParameter.builtIns.nullableAnyType");
            return new Id.c(f0Var, type3, mI);
        }
        if (i10 != 3) {
            throw new C4032o();
        }
        M mH = AbstractC5823c.j(f0Var).H();
        AbstractC4862t.d(mH, "typeParameter.builtIns.nothingType");
        E type4 = i0Var.getType();
        AbstractC4862t.d(type4, "type");
        return new Id.c(f0Var, mH, type4);
    }

    public static final i0 h(Id.c cVar) {
        cVar.d();
        if (!AbstractC4862t.a(cVar.a(), cVar.b())) {
            u0 u0VarM = cVar.c().m();
            u0 u0Var = u0.IN_VARIANCE;
            if (u0VarM != u0Var) {
                return (!g.m0(cVar.a()) || cVar.c().m() == u0Var) ? g.o0(cVar.b()) ? new k0(i(cVar, u0Var), cVar.a()) : new k0(i(cVar, u0.OUT_VARIANCE), cVar.b()) : new k0(i(cVar, u0.OUT_VARIANCE), cVar.b());
            }
        }
        return new k0(cVar.a());
    }

    public static final u0 i(Id.c cVar, u0 u0Var) {
        return u0Var == cVar.c().m() ? u0.INVARIANT : u0Var;
    }
}
