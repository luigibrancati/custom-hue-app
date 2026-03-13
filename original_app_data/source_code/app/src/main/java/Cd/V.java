package Cd;

import Cd.X;
import Lc.InterfaceC1180h;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1299c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V f1300d = new V(X.a.f1308a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f1301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1302b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void b(int i10, Lc.e0 e0Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + e0Var.getName());
        }

        public a() {
        }
    }

    public V(X reportStrategy, boolean z10) {
        AbstractC4862t.e(reportStrategy, "reportStrategy");
        this.f1301a = reportStrategy;
        this.f1302b = z10;
    }

    public final void a(Mc.g gVar, Mc.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((Mc.c) it.next()).e());
        }
        Iterator it2 = gVar2.iterator();
        while (it2.hasNext()) {
            Mc.c cVar = (Mc.c) it2.next();
            if (hashSet.contains(cVar.e())) {
                this.f1301a.c(cVar);
            }
        }
    }

    public final void b(E e10, E e11) {
        n0 n0VarF = n0.f(e11);
        AbstractC4862t.d(n0VarF, "create(substitutedType)");
        int i10 = 0;
        for (Object obj : e11.L0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C4206t.u();
            }
            i0 i0Var = (i0) obj;
            if (!i0Var.a()) {
                E type = i0Var.getType();
                AbstractC4862t.d(type, "substitutedArgument.type");
                if (!Hd.a.d(type)) {
                    i0 i0Var2 = (i0) e10.L0().get(i10);
                    Lc.f0 typeParameter = (Lc.f0) e10.N0().getParameters().get(i10);
                    if (this.f1302b) {
                        X x10 = this.f1301a;
                        E type2 = i0Var2.getType();
                        AbstractC4862t.d(type2, "unsubstitutedArgument.type");
                        E type3 = i0Var.getType();
                        AbstractC4862t.d(type3, "substitutedArgument.type");
                        AbstractC4862t.d(typeParameter, "typeParameter");
                        x10.b(n0VarF, type2, type3, typeParameter);
                    }
                }
            }
            i10 = i11;
        }
    }

    public final M c(M m10, a0 a0Var) {
        return G.a(m10) ? m10 : m0.f(m10, null, g(m10, a0Var), 1, null);
    }

    public final M d(M m10, E e10) {
        M mR = q0.r(m10, e10.O0());
        AbstractC4862t.d(mR, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return mR;
    }

    public final M e(M m10, E e10) {
        return c(d(m10, e10), e10.M0());
    }

    public final M f(W w10, a0 a0Var, boolean z10) {
        e0 e0VarK = w10.b().k();
        AbstractC4862t.d(e0VarK, "descriptor.typeConstructor");
        return F.k(a0Var, e0VarK, w10.a(), z10, InterfaceC6099h.b.f46015b);
    }

    public final a0 g(E e10, a0 a0Var) {
        return G.a(e10) ? e10.M0() : a0Var.h(e10.M0());
    }

    public final M h(W typeAliasExpansion, a0 attributes) {
        AbstractC4862t.e(typeAliasExpansion, "typeAliasExpansion");
        AbstractC4862t.e(attributes, "attributes");
        return j(typeAliasExpansion, attributes, false, 0, true);
    }

    public final i0 i(i0 i0Var, W w10, int i10) {
        t0 t0VarQ0 = i0Var.getType().Q0();
        if (!AbstractC0737u.a(t0VarQ0)) {
            M mA = m0.a(t0VarQ0);
            if (!G.a(mA) && Hd.a.x(mA)) {
                e0 e0VarN0 = mA.N0();
                InterfaceC1180h interfaceC1180hQ = e0VarN0.q();
                e0VarN0.getParameters().size();
                mA.L0().size();
                if (!(interfaceC1180hQ instanceof Lc.f0)) {
                    if (!(interfaceC1180hQ instanceof Lc.e0)) {
                        M mL = l(mA, w10, i10);
                        b(mA, mL);
                        return new k0(i0Var.b(), mL);
                    }
                    Lc.e0 e0Var = (Lc.e0) interfaceC1180hQ;
                    if (w10.d(e0Var)) {
                        this.f1301a.d(e0Var);
                        u0 u0Var = u0.INVARIANT;
                        Ed.j jVar = Ed.j.RECURSIVE_TYPE_ALIAS;
                        String string = e0Var.getName().toString();
                        AbstractC4862t.d(string, "typeDescriptor.name.toString()");
                        return new k0(u0Var, Ed.k.d(jVar, string));
                    }
                    List listL0 = mA.L0();
                    ArrayList arrayList = new ArrayList(C4207u.v(listL0, 10));
                    int i11 = 0;
                    for (Object obj : listL0) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            C4206t.u();
                        }
                        arrayList.add(k((i0) obj, w10, (Lc.f0) e0VarN0.getParameters().get(i11), i10 + 1));
                        i11 = i12;
                    }
                    M mJ = j(W.f1303e.a(w10, e0Var, arrayList), mA.M0(), mA.O0(), i10 + 1, false);
                    M mL2 = l(mA, w10, i10);
                    if (!AbstractC0737u.a(mJ)) {
                        mJ = Q.j(mJ, mL2);
                    }
                    return new k0(i0Var.b(), mJ);
                }
            }
        }
        return i0Var;
    }

    public final M j(W w10, a0 a0Var, boolean z10, int i10, boolean z11) {
        i0 i0VarK = k(new k0(u0.INVARIANT, w10.b().r0()), w10, null, i10);
        E type = i0VarK.getType();
        AbstractC4862t.d(type, "expandedProjection.type");
        M mA = m0.a(type);
        if (G.a(mA)) {
            return mA;
        }
        i0VarK.b();
        a(mA.getAnnotations(), AbstractC0727j.a(a0Var));
        M mR = q0.r(c(mA, a0Var), z10);
        AbstractC4862t.d(mR, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        return z11 ? Q.j(mR, f(w10, a0Var, z10)) : mR;
    }

    public final i0 k(i0 i0Var, W w10, Lc.f0 f0Var, int i10) {
        u0 u0VarM;
        u0 u0Var;
        u0 u0Var2;
        f1299c.b(i10, w10.b());
        if (i0Var.a()) {
            AbstractC4862t.b(f0Var);
            i0 i0VarS = q0.s(f0Var);
            AbstractC4862t.d(i0VarS, "makeStarProjection(typeParameterDescriptor!!)");
            return i0VarS;
        }
        E type = i0Var.getType();
        AbstractC4862t.d(type, "underlyingProjection.type");
        i0 i0VarC = w10.c(type.N0());
        if (i0VarC == null) {
            return i(i0Var, w10, i10);
        }
        if (i0VarC.a()) {
            AbstractC4862t.b(f0Var);
            i0 i0VarS2 = q0.s(f0Var);
            AbstractC4862t.d(i0VarS2, "makeStarProjection(typeParameterDescriptor!!)");
            return i0VarS2;
        }
        t0 t0VarQ0 = i0VarC.getType().Q0();
        u0 u0VarB = i0VarC.b();
        AbstractC4862t.d(u0VarB, "argument.projectionKind");
        u0 u0VarB2 = i0Var.b();
        AbstractC4862t.d(u0VarB2, "underlyingProjection.projectionKind");
        if (u0VarB2 != u0VarB && u0VarB2 != (u0Var2 = u0.INVARIANT)) {
            if (u0VarB == u0Var2) {
                u0VarB = u0VarB2;
            } else {
                this.f1301a.a(w10.b(), f0Var, t0VarQ0);
            }
        }
        if (f0Var == null || (u0VarM = f0Var.m()) == null) {
            u0VarM = u0.INVARIANT;
        }
        AbstractC4862t.d(u0VarM, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (u0VarM != u0VarB && u0VarM != (u0Var = u0.INVARIANT)) {
            if (u0VarB == u0Var) {
                u0VarB = u0Var;
            } else {
                this.f1301a.a(w10.b(), f0Var, t0VarQ0);
            }
        }
        a(type.getAnnotations(), t0VarQ0.getAnnotations());
        return new k0(u0VarB, e(m0.a(t0VarQ0), type));
    }

    public final M l(M m10, W w10, int i10) {
        e0 e0VarN0 = m10.N0();
        List listL0 = m10.L0();
        ArrayList arrayList = new ArrayList(C4207u.v(listL0, 10));
        int i11 = 0;
        for (Object obj : listL0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C4206t.u();
            }
            i0 i0Var = (i0) obj;
            i0 i0VarK = k(i0Var, w10, (Lc.f0) e0VarN0.getParameters().get(i11), i10 + 1);
            if (!i0VarK.a()) {
                i0VarK = new k0(i0VarK.b(), q0.q(i0VarK.getType(), i0Var.getType().O0()));
            }
            arrayList.add(i0VarK);
            i11 = i12;
        }
        return m0.f(m10, arrayList, null, 2, null);
    }
}
