package cd;

import Gd.t;
import Uc.AbstractC2299a;
import Uc.EnumC2300b;
import Uc.y;
import gc.C4179C;
import gc.C4204q;
import gc.C4206t;
import gc.C4207u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;

/* JADX INFO: renamed from: cd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3097a {

    /* JADX INFO: renamed from: cd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0338a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Gd.i f26492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f26493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Gd.o f26494c;

        public C0338a(Gd.i iVar, y yVar, Gd.o oVar) {
            this.f26492a = iVar;
            this.f26493b = yVar;
            this.f26494c = oVar;
        }

        public final y a() {
            return this.f26493b;
        }

        public final Gd.i b() {
            return this.f26492a;
        }

        public final Gd.o c() {
            return this.f26494c;
        }
    }

    /* JADX INFO: renamed from: cd.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends v implements vc.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3115q f26495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3101e[] f26496b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3115q c3115q, C3101e[] c3101eArr) {
            super(1);
            this.f26495a = c3115q;
            this.f26496b = c3101eArr;
        }

        public final C3101e a(int i10) {
            Map mapA;
            C3101e c3101e;
            C3115q c3115q = this.f26495a;
            if (c3115q != null && (mapA = c3115q.a()) != null && (c3101e = (C3101e) mapA.get(Integer.valueOf(i10))) != null) {
                return c3101e;
            }
            C3101e[] c3101eArr = this.f26496b;
            return (i10 < 0 || i10 > C4204q.a0(c3101eArr)) ? C3101e.f26508e.a() : c3101eArr[i10];
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: cd.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends v implements vc.l {
        public c() {
            super(1);
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object extractNullability) {
            AbstractC4862t.e(extractNullability, "$this$extractNullability");
            return Boolean.valueOf(AbstractC3097a.this.r(extractNullability));
        }
    }

    /* JADX INFO: renamed from: cd.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends v implements vc.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Gd.p f26499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Gd.p pVar) {
            super(1);
            this.f26499b = pVar;
        }

        @Override // vc.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterable invoke(C0338a it) {
            Gd.n nVarA0;
            List listU;
            C0338a c0338a;
            Gd.g gVarQ;
            AbstractC4862t.e(it, "it");
            if (AbstractC3097a.this.u()) {
                Gd.i iVarB = it.b();
                if (((iVarB == null || (gVarQ = this.f26499b.Q(iVarB)) == null) ? null : this.f26499b.o0(gVarQ)) != null) {
                    return null;
                }
            }
            Gd.i iVarB2 = it.b();
            if (iVarB2 == null || (nVarA0 = this.f26499b.a0(iVarB2)) == null || (listU = this.f26499b.u(nVarA0)) == null) {
                return null;
            }
            List listZ = this.f26499b.Z(it.b());
            Gd.p pVar = this.f26499b;
            AbstractC3097a abstractC3097a = AbstractC3097a.this;
            Iterator it2 = listU.iterator();
            Iterator it3 = listZ.iterator();
            ArrayList arrayList = new ArrayList(Math.min(C4207u.v(listU, 10), C4207u.v(listZ, 10)));
            while (it2.hasNext() && it3.hasNext()) {
                Object next = it2.next();
                Gd.m mVar = (Gd.m) it3.next();
                Gd.o oVar = (Gd.o) next;
                if (pVar.v0(mVar)) {
                    c0338a = new C0338a(null, it.a(), oVar);
                } else {
                    Gd.i iVarK0 = pVar.k0(mVar);
                    c0338a = new C0338a(iVarK0, abstractC3097a.c(iVarK0, it.a()), oVar);
                }
                arrayList.add(c0338a);
            }
            return arrayList;
        }
    }

    public boolean A(Gd.i iVar) {
        AbstractC4862t.e(iVar, "<this>");
        return false;
    }

    public final C3105i B(C3105i c3105i, C3105i c3105i2) {
        return c3105i == null ? c3105i2 : (c3105i2 != null && ((c3105i.d() && !c3105i2.d()) || ((c3105i.d() || !c3105i2.d()) && (c3105i.c().compareTo(c3105i2.c()) < 0 || c3105i.c().compareTo(c3105i2.c()) <= 0)))) ? c3105i2 : c3105i;
    }

    public final List C(Gd.i iVar) {
        return f(new C0338a(iVar, c(iVar, m()), null), new d(v()));
    }

    public final vc.l b(Gd.i iVar, Iterable overrides, C3115q c3115q, boolean z10) {
        int size;
        Gd.i iVarB;
        AbstractC4862t.e(iVar, "<this>");
        AbstractC4862t.e(overrides, "overrides");
        List listC = C(iVar);
        ArrayList arrayList = new ArrayList(C4207u.v(overrides, 10));
        Iterator it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(C((Gd.i) it.next()));
        }
        if (q()) {
            size = 1;
            break;
        }
        if (x() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
            Iterator it2 = overrides.iterator();
            while (it2.hasNext()) {
                if (!y(iVar, (Gd.i) it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listC.size();
        C3101e[] c3101eArr = new C3101e[size];
        int i10 = 0;
        while (i10 < size) {
            C3101e c3101eE = e((C0338a) listC.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C0338a c0338a = (C0338a) C4179C.k0((List) it3.next(), i10);
                C3101e c3101eD = (c0338a == null || (iVarB = c0338a.b()) == null) ? null : d(iVarB);
                if (c3101eD != null) {
                    arrayList2.add(c3101eD);
                }
            }
            c3101eArr[i10] = AbstractC3117s.a(c3101eE, arrayList2, i10 == 0 && x(), i10 == 0 && n(), z10);
            i10++;
        }
        return new b(c3115q, c3101eArr);
    }

    public final y c(Gd.i iVar, y yVar) {
        return h().c(yVar, i(iVar));
    }

    public final C3101e d(Gd.i iVar) {
        EnumC3104h enumC3104hT;
        EnumC3104h enumC3104hT2 = t(iVar);
        EnumC3102f enumC3102f = null;
        if (enumC3104hT2 == null) {
            Gd.i iVarP = p(iVar);
            enumC3104hT = iVarP != null ? t(iVarP) : null;
        } else {
            enumC3104hT = enumC3104hT2;
        }
        Gd.p pVarV = v();
        Kc.c cVar = Kc.c.f7792a;
        if (cVar.l(s(pVarV.o(iVar)))) {
            enumC3102f = EnumC3102f.READ_ONLY;
        } else if (cVar.k(s(pVarV.z(iVar)))) {
            enumC3102f = EnumC3102f.MUTABLE;
        }
        return new C3101e(enumC3104hT, enumC3102f, v().T(iVar) || A(iVar), enumC3104hT != enumC3104hT2);
    }

    public final C3101e e(C0338a c0338a) {
        Iterable iterableK;
        C3105i c3105iD;
        C3105i c3105iJ;
        Gd.i iVarB;
        Gd.n nVarA0;
        if (c0338a.b() == null) {
            Gd.p pVarV = v();
            Gd.o oVarC = c0338a.c();
            if ((oVarC != null ? pVarV.m0(oVarC) : null) == t.IN) {
                return C3101e.f26508e.a();
            }
        }
        boolean z10 = false;
        boolean z11 = c0338a.c() == null;
        Gd.i iVarB2 = c0338a.b();
        if (iVarB2 == null || (iterableK = i(iVarB2)) == null) {
            iterableK = C4206t.k();
        }
        Gd.p pVarV2 = v();
        Gd.i iVarB3 = c0338a.b();
        Gd.o oVarV = (iVarB3 == null || (nVarA0 = pVarV2.a0(iVarB3)) == null) ? null : pVarV2.V(nVarA0);
        boolean z12 = l() == EnumC2300b.TYPE_PARAMETER_BOUNDS;
        if (z11) {
            if (z12 || !o() || (iVarB = c0338a.b()) == null || !w(iVarB)) {
                iterableK = C4179C.A0(k(), iterableK);
            } else {
                Iterable iterableK2 = k();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterableK2) {
                    if (!h().m(obj)) {
                        arrayList.add(obj);
                    }
                }
                iterableK = C4179C.C0(arrayList, iterableK);
            }
        }
        EnumC3102f enumC3102fE = h().e(iterableK);
        C3105i c3105iF = h().f(iterableK, new c());
        if (c3105iF != null) {
            EnumC3104h enumC3104hC = c3105iF.c();
            if (c3105iF.c() == EnumC3104h.NOT_NULL && oVarV != null) {
                z10 = true;
            }
            return new C3101e(enumC3104hC, enumC3102fE, z10, c3105iF.d());
        }
        EnumC2300b enumC2300bL = (z11 || z12) ? l() : EnumC2300b.TYPE_USE;
        y yVarA = c0338a.a();
        Uc.r rVarA = yVarA != null ? yVarA.a(enumC2300bL) : null;
        C3105i c3105iJ2 = oVarV != null ? j(oVarV) : null;
        if (c3105iJ2 == null || (c3105iD = C3105i.b(c3105iJ2, EnumC3104h.NOT_NULL, false, 2, null)) == null) {
            c3105iD = rVarA != null ? rVarA.d() : null;
        }
        boolean z13 = (c3105iJ2 != null ? c3105iJ2.c() : null) == EnumC3104h.NOT_NULL || !(oVarV == null || rVarA == null || !rVarA.c());
        Gd.o oVarC2 = c0338a.c();
        if (oVarC2 == null || (c3105iJ = j(oVarC2)) == null) {
            c3105iJ = null;
        } else if (c3105iJ.c() == EnumC3104h.NULLABLE) {
            c3105iJ = C3105i.b(c3105iJ, EnumC3104h.FORCE_FLEXIBILITY, false, 2, null);
        }
        C3105i c3105iB = B(c3105iJ, c3105iD);
        EnumC3104h enumC3104hC2 = c3105iB != null ? c3105iB.c() : null;
        if (c3105iB != null && c3105iB.d()) {
            z10 = true;
        }
        return new C3101e(enumC3104hC2, enumC3102fE, z13, z10);
    }

    public final List f(Object obj, vc.l lVar) {
        ArrayList arrayList = new ArrayList(1);
        g(obj, arrayList, lVar);
        return arrayList;
    }

    public final void g(Object obj, List list, vc.l lVar) {
        list.add(obj);
        Iterable iterable = (Iterable) lVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next(), list, lVar);
            }
        }
    }

    public abstract AbstractC2299a h();

    public abstract Iterable i(Gd.i iVar);

    public final C3105i j(Gd.o oVar) {
        List arrayList;
        EnumC3104h enumC3104h;
        Gd.p pVarV = v();
        if (!z(oVar)) {
            return null;
        }
        List listR = pVarV.R(oVar);
        if (listR == null || !listR.isEmpty()) {
            Iterator it = listR.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!pVarV.d0((Gd.i) it.next())) {
                    if (listR == null || !listR.isEmpty()) {
                        Iterator it2 = listR.iterator();
                        while (it2.hasNext()) {
                            if (t((Gd.i) it2.next()) != null) {
                                arrayList = listR;
                                break;
                            }
                        }
                    }
                    if (listR == null || !listR.isEmpty()) {
                        Iterator it3 = listR.iterator();
                        while (it3.hasNext()) {
                            if (p((Gd.i) it3.next()) != null) {
                                arrayList = new ArrayList();
                                Iterator it4 = listR.iterator();
                                while (it4.hasNext()) {
                                    Gd.i iVarP = p((Gd.i) it4.next());
                                    if (iVarP != null) {
                                        arrayList.add(iVarP);
                                    }
                                }
                                if (arrayList == null || !arrayList.isEmpty()) {
                                    Iterator it5 = arrayList.iterator();
                                    while (it5.hasNext()) {
                                        if (!pVarV.p0((Gd.i) it5.next())) {
                                            enumC3104h = EnumC3104h.NOT_NULL;
                                            break;
                                        }
                                    }
                                    enumC3104h = EnumC3104h.NULLABLE;
                                } else {
                                    enumC3104h = EnumC3104h.NULLABLE;
                                }
                                return new C3105i(enumC3104h, arrayList != listR);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public abstract Iterable k();

    public abstract EnumC2300b l();

    public abstract y m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract Gd.i p(Gd.i iVar);

    public boolean q() {
        return false;
    }

    public abstract boolean r(Object obj);

    public abstract kd.d s(Gd.i iVar);

    public final EnumC3104h t(Gd.i iVar) {
        Gd.p pVarV = v();
        if (pVarV.y0(pVarV.o(iVar))) {
            return EnumC3104h.NULLABLE;
        }
        if (pVarV.y0(pVarV.z(iVar))) {
            return null;
        }
        return EnumC3104h.NOT_NULL;
    }

    public abstract boolean u();

    public abstract Gd.p v();

    public abstract boolean w(Gd.i iVar);

    public abstract boolean x();

    public abstract boolean y(Gd.i iVar, Gd.i iVar2);

    public abstract boolean z(Gd.o oVar);
}
