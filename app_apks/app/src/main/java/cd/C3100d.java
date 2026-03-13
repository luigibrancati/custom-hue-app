package cd;

import Cd.B;
import Cd.E;
import Cd.F;
import Cd.M;
import Cd.Q;
import Cd.a0;
import Cd.b0;
import Cd.e0;
import Cd.i0;
import Cd.q0;
import Cd.t0;
import Cd.u0;
import Lc.InterfaceC1180h;
import Lc.f0;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: cd.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C3100d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xc.c f26502a;

    /* JADX INFO: renamed from: cd.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f26503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26504b;

        public a(E e10, int i10) {
            this.f26503a = e10;
            this.f26504b = i10;
        }

        public final int a() {
            return this.f26504b;
        }

        public final E b() {
            return this.f26503a;
        }
    }

    /* JADX INFO: renamed from: cd.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final M f26505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f26506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26507c;

        public b(M m10, int i10, boolean z10) {
            this.f26505a = m10;
            this.f26506b = i10;
            this.f26507c = z10;
        }

        public final boolean a() {
            return this.f26507c;
        }

        public final int b() {
            return this.f26506b;
        }

        public final M c() {
            return this.f26505a;
        }
    }

    public C3100d(Xc.c javaResolverSettings) {
        AbstractC4862t.e(javaResolverSettings, "javaResolverSettings");
        this.f26502a = javaResolverSettings;
    }

    public static /* synthetic */ b c(C3100d c3100d, M m10, vc.l lVar, int i10, EnumC3113o enumC3113o, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        return c3100d.b(m10, lVar, i10, enumC3113o, z10, z11);
    }

    public final E a(E e10, vc.l qualifiers, boolean z10) {
        AbstractC4862t.e(e10, "<this>");
        AbstractC4862t.e(qualifiers, "qualifiers");
        return d(e10.Q0(), qualifiers, 0, z10).b();
    }

    public final b b(M m10, vc.l lVar, int i10, EnumC3113o enumC3113o, boolean z10, boolean z11) {
        e0 e0VarN0;
        Boolean bool;
        a aVar;
        i0 i0VarS;
        vc.l lVar2 = lVar;
        boolean zA = AbstractC3114p.a(enumC3113o);
        boolean z12 = (z11 && z10) ? false : true;
        E e10 = null;
        if (!zA && m10.L0().isEmpty()) {
            return new b(null, 1, false);
        }
        InterfaceC1180h interfaceC1180hQ = m10.N0().q();
        if (interfaceC1180hQ == null) {
            return new b(null, 1, false);
        }
        C3101e c3101e = (C3101e) lVar2.invoke(Integer.valueOf(i10));
        InterfaceC1180h interfaceC1180hF = AbstractC3116r.f(interfaceC1180hQ, c3101e, enumC3113o);
        Boolean boolH = AbstractC3116r.h(c3101e, enumC3113o);
        if (interfaceC1180hF == null || (e0VarN0 = interfaceC1180hF.k()) == null) {
            e0VarN0 = m10.N0();
        }
        e0 e0Var = e0VarN0;
        AbstractC4862t.d(e0Var, "enhancedClassifier?.typeConstructor ?: constructor");
        int iA = i10 + 1;
        List listL0 = m10.L0();
        List parameters = e0Var.getParameters();
        AbstractC4862t.d(parameters, "typeConstructor.parameters");
        Iterator it = listL0.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C4207u.v(listL0, 10), C4207u.v(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            f0 f0Var = (f0) it2.next();
            i0 i0Var = (i0) next;
            if (z12) {
                bool = boolH;
                if (!i0Var.a()) {
                    aVar = d(i0Var.getType().Q0(), lVar2, iA, z11);
                } else if (((C3101e) lVar2.invoke(Integer.valueOf(iA))).d() == EnumC3104h.FORCE_FLEXIBILITY) {
                    t0 t0VarQ0 = i0Var.getType().Q0();
                    aVar = new a(F.d(B.c(t0VarQ0).R0(false), B.d(t0VarQ0).R0(true)), 1);
                } else {
                    aVar = new a(null, 1);
                }
            } else {
                bool = boolH;
                aVar = new a(e10, 0);
            }
            iA += aVar.a();
            if (aVar.b() != null) {
                E eB = aVar.b();
                u0 u0VarB = i0Var.b();
                AbstractC4862t.d(u0VarB, "arg.projectionKind");
                i0VarS = Hd.a.f(eB, u0VarB, f0Var);
            } else if (interfaceC1180hF == null || i0Var.a()) {
                i0VarS = interfaceC1180hF != null ? q0.s(f0Var) : null;
            } else {
                E type = i0Var.getType();
                AbstractC4862t.d(type, "arg.type");
                u0 u0VarB2 = i0Var.b();
                AbstractC4862t.d(u0VarB2, "arg.projectionKind");
                i0VarS = Hd.a.f(type, u0VarB2, f0Var);
            }
            arrayList.add(i0VarS);
            lVar2 = lVar;
            boolH = bool;
            e10 = null;
        }
        Boolean bool2 = boolH;
        int i11 = iA - i10;
        if (interfaceC1180hF == null && bool2 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((i0) it3.next()) == null) {
                    }
                }
            }
            return new b(null, i11, false);
        }
        Mc.g annotations = m10.getAnnotations();
        C3099c c3099c = AbstractC3116r.f26577b;
        if (interfaceC1180hF == null) {
            c3099c = null;
        }
        a0 a0VarB = b0.b(AbstractC3116r.e(C4206t.p(annotations, c3099c, bool2 != null ? AbstractC3116r.g() : null)));
        List listL02 = m10.L0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listL02.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(C4207u.v(arrayList, 10), C4207u.v(listL02, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            i0 i0Var2 = (i0) it5.next();
            i0 i0Var3 = (i0) next2;
            if (i0Var3 != null) {
                i0Var2 = i0Var3;
            }
            arrayList2.add(i0Var2);
        }
        M mJ = F.j(a0VarB, e0Var, arrayList2, bool2 != null ? bool2.booleanValue() : m10.O0(), null, 16, null);
        if (c3101e.b()) {
            mJ = e(mJ);
        }
        return new b(mJ, i11, bool2 != null && c3101e.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cd.C3100d.a d(Cd.t0 r21, vc.l r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.C3100d.d(Cd.t0, vc.l, int, boolean):cd.d$a");
    }

    public final M e(M m10) {
        return this.f26502a.a() ? Q.h(m10, true) : new C3103g(m10);
    }
}
