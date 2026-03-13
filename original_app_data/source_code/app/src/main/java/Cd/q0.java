package Cd;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import gc.C4179C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import vd.InterfaceC6099h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f1392a = Ed.k.d(Ed.j.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M f1393b = Ed.k.d(Ed.j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f1394c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final M f1395d = new a("UNIT_EXPECTED_TYPE");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends AbstractC0734q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f1396b;

        public a(String str) {
            this.f1396b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: Cd.q0.a.Z0(int):void");
        }

        @Override // Cd.t0
        /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
        public M R0(boolean z10) {
            throw new IllegalStateException(this.f1396b);
        }

        @Override // Cd.t0
        /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
        public M T0(a0 a0Var) {
            if (a0Var == null) {
                Z0(0);
            }
            throw new IllegalStateException(this.f1396b);
        }

        @Override // Cd.AbstractC0734q
        public M W0() {
            throw new IllegalStateException(this.f1396b);
        }

        @Override // Cd.AbstractC0734q
        public AbstractC0734q Y0(M m10) {
            if (m10 == null) {
                Z0(2);
            }
            throw new IllegalStateException(this.f1396b);
        }

        @Override // Cd.AbstractC0734q
        /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a X0(Dd.g gVar) {
            if (gVar == null) {
                Z0(3);
            }
            return this;
        }

        @Override // Cd.M
        public String toString() {
            String str = this.f1396b;
            if (str == null) {
                Z0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.q0.a(int):void");
    }

    public static boolean b(E e10) {
        if (e10 == null) {
            a(28);
        }
        if (e10.O0()) {
            return true;
        }
        return B.b(e10) && b(B.a(e10).W0());
    }

    public static boolean c(E e10, vc.l lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(e10, lVar, null);
    }

    public static boolean d(E e10, vc.l lVar, Md.f fVar) {
        if (lVar == null) {
            a(44);
        }
        if (e10 == null) {
            return false;
        }
        t0 t0VarQ0 = e10.Q0();
        if (w(e10)) {
            return ((Boolean) lVar.invoke(t0VarQ0)).booleanValue();
        }
        if (fVar != null && fVar.contains(e10)) {
            return false;
        }
        if (((Boolean) lVar.invoke(t0VarQ0)).booleanValue()) {
            return true;
        }
        if (fVar == null) {
            fVar = Md.f.c();
        }
        fVar.add(e10);
        AbstractC0741y abstractC0741y = t0VarQ0 instanceof AbstractC0741y ? (AbstractC0741y) t0VarQ0 : null;
        if (abstractC0741y != null && (d(abstractC0741y.V0(), lVar, fVar) || d(abstractC0741y.W0(), lVar, fVar))) {
            return true;
        }
        if ((t0VarQ0 instanceof C0732o) && d(((C0732o) t0VarQ0).Z0(), lVar, fVar)) {
            return true;
        }
        e0 e0VarN0 = e10.N0();
        if (e0VarN0 instanceof D) {
            Iterator it = ((D) e0VarN0).o().iterator();
            while (it.hasNext()) {
                if (d((E) it.next(), lVar, fVar)) {
                    return true;
                }
            }
            return false;
        }
        for (i0 i0Var : e10.L0()) {
            if (!i0Var.a() && d(i0Var.getType(), lVar, fVar)) {
                return true;
            }
        }
        return false;
    }

    public static E e(E e10, E e11, n0 n0Var) {
        if (e10 == null) {
            a(20);
        }
        if (e11 == null) {
            a(21);
        }
        if (n0Var == null) {
            a(22);
        }
        E eP = n0Var.p(e11, u0.INVARIANT);
        if (eP != null) {
            return q(eP, e10.O0());
        }
        return null;
    }

    public static InterfaceC1177e f(E e10) {
        if (e10 == null) {
            a(30);
        }
        InterfaceC1180h interfaceC1180hQ = e10.N0().q();
        if (interfaceC1180hQ instanceof InterfaceC1177e) {
            return (InterfaceC1177e) interfaceC1180hQ;
        }
        return null;
    }

    public static List g(List list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new k0(((Lc.f0) it.next()).p()));
        }
        List listV0 = C4179C.V0(arrayList);
        if (listV0 == null) {
            a(17);
        }
        return listV0;
    }

    public static List h(E e10) {
        if (e10 == null) {
            a(18);
        }
        n0 n0VarF = n0.f(e10);
        Collection collectionO = e10.N0().o();
        ArrayList arrayList = new ArrayList(collectionO.size());
        Iterator it = collectionO.iterator();
        while (it.hasNext()) {
            E e11 = e(e10, (E) it.next(), n0VarF);
            if (e11 != null) {
                arrayList.add(e11);
            }
        }
        return arrayList;
    }

    public static Lc.f0 i(E e10) {
        if (e10 == null) {
            a(63);
        }
        if (e10.N0().q() instanceof Lc.f0) {
            return (Lc.f0) e10.N0().q();
        }
        return null;
    }

    public static boolean j(E e10) {
        if (e10 == null) {
            a(29);
        }
        if (e10.N0().q() instanceof InterfaceC1177e) {
            return false;
        }
        Iterator it = h(e10).iterator();
        while (it.hasNext()) {
            if (l((E) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(E e10) {
        return e10 != null && e10.N0() == f1392a.N0();
    }

    public static boolean l(E e10) {
        if (e10 == null) {
            a(27);
        }
        if (e10.O0()) {
            return true;
        }
        if (B.b(e10) && l(B.a(e10).W0())) {
            return true;
        }
        if (Q.c(e10)) {
            return false;
        }
        if (m(e10)) {
            return j(e10);
        }
        e0 e0VarN0 = e10.N0();
        if (e0VarN0 instanceof D) {
            Iterator it = e0VarN0.o().iterator();
            while (it.hasNext()) {
                if (l((E) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(E e10) {
        if (e10 == null) {
            a(60);
        }
        if (i(e10) != null) {
            return true;
        }
        e10.N0();
        return false;
    }

    public static E n(E e10) {
        if (e10 == null) {
            a(2);
        }
        return p(e10, false);
    }

    public static E o(E e10) {
        if (e10 == null) {
            a(1);
        }
        return p(e10, true);
    }

    public static E p(E e10, boolean z10) {
        if (e10 == null) {
            a(3);
        }
        t0 t0VarR0 = e10.Q0().R0(z10);
        if (t0VarR0 == null) {
            a(4);
        }
        return t0VarR0;
    }

    public static E q(E e10, boolean z10) {
        if (e10 == null) {
            a(8);
        }
        if (z10) {
            return o(e10);
        }
        if (e10 == null) {
            a(9);
        }
        return e10;
    }

    public static M r(M m10, boolean z10) {
        if (m10 == null) {
            a(5);
        }
        if (!z10) {
            if (m10 == null) {
                a(7);
            }
            return m10;
        }
        M mR0 = m10.R0(true);
        if (mR0 == null) {
            a(6);
        }
        return mR0;
    }

    public static i0 s(Lc.f0 f0Var) {
        if (f0Var == null) {
            a(45);
        }
        return new T(f0Var);
    }

    public static i0 t(Lc.f0 f0Var, AbstractC0739w abstractC0739w) {
        if (f0Var == null) {
            a(46);
        }
        return abstractC0739w.b() == p0.SUPERTYPE ? new k0(U.b(f0Var)) : new T(f0Var);
    }

    public static M u(e0 e0Var, InterfaceC6099h interfaceC6099h, vc.l lVar) {
        if (e0Var == null) {
            a(12);
        }
        if (interfaceC6099h == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        M mL = F.l(a0.f1311b.h(), e0Var, g(e0Var.getParameters()), false, interfaceC6099h, lVar);
        if (mL == null) {
            a(15);
        }
        return mL;
    }

    public static M v(InterfaceC1180h interfaceC1180h, InterfaceC6099h interfaceC6099h, vc.l lVar) {
        if (!Ed.k.m(interfaceC1180h)) {
            return u(interfaceC1180h.k(), interfaceC6099h, lVar);
        }
        Ed.h hVarD = Ed.k.d(Ed.j.UNABLE_TO_SUBSTITUTE_TYPE, interfaceC1180h.toString());
        if (hVarD == null) {
            a(11);
        }
        return hVarD;
    }

    public static boolean w(E e10) {
        if (e10 == null) {
            a(0);
        }
        return e10 == f1394c || e10 == f1395d;
    }
}
