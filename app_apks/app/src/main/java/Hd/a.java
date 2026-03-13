package Hd;

import Cd.AbstractC0741y;
import Cd.C0732o;
import Cd.E;
import Cd.F;
import Cd.M;
import Cd.T;
import Cd.b0;
import Cd.i0;
import Cd.k0;
import Cd.m0;
import Cd.q0;
import Cd.s0;
import Cd.t0;
import Cd.u0;
import Dd.e;
import Ed.h;
import Ic.g;
import Lc.EnumC1178f;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import Lc.InterfaceC1181i;
import Lc.e0;
import Lc.f0;
import fc.C4032o;
import gc.C4179C;
import gc.C4186J;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: Hd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0089a extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0089a f5353a = new C0089a();

        public C0089a() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 it) {
            AbstractC4862t.e(it, "it");
            InterfaceC1180h interfaceC1180hQ = it.N0().q();
            return Boolean.valueOf(interfaceC1180hQ != null ? a.q(interfaceC1180hQ) : false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f5354a = new b();

        public b() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 t0Var) {
            return Boolean.valueOf(q0.m(t0Var));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5355a = new c();

        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t0 it) {
            AbstractC4862t.e(it, "it");
            InterfaceC1180h interfaceC1180hQ = it.N0().q();
            boolean z10 = false;
            if (interfaceC1180hQ != null && ((interfaceC1180hQ instanceof e0) || (interfaceC1180hQ instanceof f0))) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final i0 a(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return new k0(e10);
    }

    public static final boolean b(E e10, l predicate) {
        AbstractC4862t.e(e10, "<this>");
        AbstractC4862t.e(predicate, "predicate");
        return q0.c(e10, predicate);
    }

    public static final boolean c(E e10, Cd.e0 e0Var, Set set) {
        boolean zC;
        if (AbstractC4862t.a(e10.N0(), e0Var)) {
            return true;
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        InterfaceC1181i interfaceC1181i = interfaceC1180hQ instanceof InterfaceC1181i ? (InterfaceC1181i) interfaceC1180hQ : null;
        List listQ = interfaceC1181i != null ? interfaceC1181i.q() : null;
        Iterable<C4186J> iterableB1 = C4179C.b1(e10.L0());
        if ((iterableB1 instanceof Collection) && ((Collection) iterableB1).isEmpty()) {
            return false;
        }
        for (C4186J c4186j : iterableB1) {
            int iA = c4186j.a();
            i0 i0Var = (i0) c4186j.b();
            f0 f0Var = listQ != null ? (f0) C4179C.k0(listQ, iA) : null;
            if ((f0Var == null || set == null || !set.contains(f0Var)) && !i0Var.a()) {
                E type = i0Var.getType();
                AbstractC4862t.d(type, "argument.type");
                zC = c(type, e0Var, set);
            } else {
                zC = false;
            }
            if (zC) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return b(e10, C0089a.f5353a);
    }

    public static final boolean e(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return q0.c(e10, b.f5354a);
    }

    public static final i0 f(E type, u0 projectionKind, f0 f0Var) {
        AbstractC4862t.e(type, "type");
        AbstractC4862t.e(projectionKind, "projectionKind");
        if ((f0Var != null ? f0Var.m() : null) == projectionKind) {
            projectionKind = u0.INVARIANT;
        }
        return new k0(projectionKind, type);
    }

    public static final Set g(E e10, Set set) {
        AbstractC4862t.e(e10, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h(e10, e10, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final void h(E e10, E e11, Set set, Set set2) {
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ instanceof f0) {
            if (!AbstractC4862t.a(e10.N0(), e11.N0())) {
                set.add(interfaceC1180hQ);
                return;
            }
            for (E upperBound : ((f0) interfaceC1180hQ).getUpperBounds()) {
                AbstractC4862t.d(upperBound, "upperBound");
                h(upperBound, e11, set, set2);
            }
            return;
        }
        InterfaceC1180h interfaceC1180hQ2 = e10.N0().q();
        InterfaceC1181i interfaceC1181i = interfaceC1180hQ2 instanceof InterfaceC1181i ? (InterfaceC1181i) interfaceC1180hQ2 : null;
        List listQ = interfaceC1181i != null ? interfaceC1181i.q() : null;
        int i10 = 0;
        for (i0 i0Var : e10.L0()) {
            int i11 = i10 + 1;
            f0 f0Var = listQ != null ? (f0) C4179C.k0(listQ, i10) : null;
            if ((f0Var == null || set2 == null || !set2.contains(f0Var)) && !i0Var.a() && !C4179C.Y(set, i0Var.getType().N0().q()) && !AbstractC4862t.a(i0Var.getType().N0(), e11.N0())) {
                E type = i0Var.getType();
                AbstractC4862t.d(type, "argument.type");
                h(type, e11, set, set2);
            }
            i10 = i11;
        }
    }

    public static final g i(E e10) {
        AbstractC4862t.e(e10, "<this>");
        g gVarN = e10.N0().n();
        AbstractC4862t.d(gVarN, "constructor.builtIns");
        return gVarN;
    }

    public static final E j(f0 f0Var) {
        Object obj;
        AbstractC4862t.e(f0Var, "<this>");
        List upperBounds = f0Var.getUpperBounds();
        AbstractC4862t.d(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List upperBounds2 = f0Var.getUpperBounds();
        AbstractC4862t.d(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC1180h interfaceC1180hQ = ((E) next).N0().q();
            InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
            if (interfaceC1177e != null && interfaceC1177e.f() != EnumC1178f.INTERFACE && interfaceC1177e.f() != EnumC1178f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        E e10 = (E) obj;
        if (e10 != null) {
            return e10;
        }
        List upperBounds3 = f0Var.getUpperBounds();
        AbstractC4862t.d(upperBounds3, "upperBounds");
        Object objH0 = C4179C.h0(upperBounds3);
        AbstractC4862t.d(objH0, "upperBounds.first()");
        return (E) objH0;
    }

    public static final boolean k(f0 typeParameter) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        return m(typeParameter, null, null, 6, null);
    }

    public static final boolean l(f0 typeParameter, Cd.e0 e0Var, Set set) {
        AbstractC4862t.e(typeParameter, "typeParameter");
        List<E> upperBounds = typeParameter.getUpperBounds();
        AbstractC4862t.d(upperBounds, "typeParameter.upperBounds");
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        for (E upperBound : upperBounds) {
            AbstractC4862t.d(upperBound, "upperBound");
            if (c(upperBound, typeParameter.p().N0(), set) && (e0Var == null || AbstractC4862t.a(upperBound.N0(), e0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean m(f0 f0Var, Cd.e0 e0Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            e0Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return l(f0Var, e0Var, set);
    }

    public static final boolean n(E e10) {
        AbstractC4862t.e(e10, "<this>");
        if (!(e10 instanceof C0732o)) {
            return false;
        }
        ((C0732o) e10).Z0();
        return false;
    }

    public static final boolean o(E e10) {
        AbstractC4862t.e(e10, "<this>");
        if (!(e10 instanceof C0732o)) {
            return false;
        }
        ((C0732o) e10).Z0();
        return false;
    }

    public static final boolean p(E e10, E superType) {
        AbstractC4862t.e(e10, "<this>");
        AbstractC4862t.e(superType, "superType");
        return e.f2664a.b(e10, superType);
    }

    public static final boolean q(InterfaceC1180h interfaceC1180h) {
        AbstractC4862t.e(interfaceC1180h, "<this>");
        return (interfaceC1180h instanceof f0) && (((f0) interfaceC1180h).b() instanceof e0);
    }

    public static final boolean r(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return q0.m(e10);
    }

    public static final boolean s(E type) {
        AbstractC4862t.e(type, "type");
        return (type instanceof h) && ((h) type).X0().j();
    }

    public static final E t(E e10) {
        AbstractC4862t.e(e10, "<this>");
        E eN = q0.n(e10);
        AbstractC4862t.d(eN, "makeNotNullable(this)");
        return eN;
    }

    public static final E u(E e10) {
        AbstractC4862t.e(e10, "<this>");
        E eO = q0.o(e10);
        AbstractC4862t.d(eO, "makeNullable(this)");
        return eO;
    }

    public static final E v(E e10, Mc.g newAnnotations) {
        AbstractC4862t.e(e10, "<this>");
        AbstractC4862t.e(newAnnotations, "newAnnotations");
        return (e10.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? e10 : e10.Q0().T0(b0.a(e10.M0(), newAnnotations));
    }

    public static final E w(E e10) {
        t0 t0VarF;
        AbstractC4862t.e(e10, "<this>");
        t0 t0VarQ0 = e10.Q0();
        if (t0VarQ0 instanceof AbstractC0741y) {
            AbstractC0741y abstractC0741y = (AbstractC0741y) t0VarQ0;
            M mV0 = abstractC0741y.V0();
            if (!mV0.N0().getParameters().isEmpty() && mV0.N0().q() != null) {
                List parameters = mV0.N0().getParameters();
                AbstractC4862t.d(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C4207u.v(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new T((f0) it.next()));
                }
                mV0 = m0.f(mV0, arrayList, null, 2, null);
            }
            M mW0 = abstractC0741y.W0();
            if (!mW0.N0().getParameters().isEmpty() && mW0.N0().q() != null) {
                List parameters2 = mW0.N0().getParameters();
                AbstractC4862t.d(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C4207u.v(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new T((f0) it2.next()));
                }
                mW0 = m0.f(mW0, arrayList2, null, 2, null);
            }
            t0VarF = F.d(mV0, mW0);
        } else {
            if (!(t0VarQ0 instanceof M)) {
                throw new C4032o();
            }
            M m10 = (M) t0VarQ0;
            boolean zIsEmpty = m10.N0().getParameters().isEmpty();
            t0VarF = m10;
            if (!zIsEmpty) {
                InterfaceC1180h interfaceC1180hQ = m10.N0().q();
                t0VarF = m10;
                if (interfaceC1180hQ != null) {
                    List parameters3 = m10.N0().getParameters();
                    AbstractC4862t.d(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(C4207u.v(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new T((f0) it3.next()));
                    }
                    t0VarF = m0.f(m10, arrayList3, null, 2, null);
                }
            }
        }
        return s0.b(t0VarF, t0VarQ0);
    }

    public static final boolean x(E e10) {
        AbstractC4862t.e(e10, "<this>");
        return b(e10, c.f5355a);
    }
}
