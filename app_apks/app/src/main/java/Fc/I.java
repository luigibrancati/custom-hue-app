package Fc;

import Fc.AbstractC0833h;
import Fc.AbstractC0834i;
import Ic.j;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.U;
import Lc.V;
import Lc.W;
import Lc.a0;
import ad.InterfaceC2685a;
import bd.InterfaceC2920l;
import id.AbstractC4376a;
import java.lang.reflect.Method;
import jd.AbstractC4763d;
import jd.C4768i;
import kotlin.jvm.internal.AbstractC4862t;
import md.i;
import od.AbstractC5282d;
import od.AbstractC5283e;
import od.AbstractC5285g;
import sd.AbstractC5823c;
import td.EnumC5882e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f3848a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.b f3849b;

    static {
        kd.b bVarM = kd.b.m(new kd.c("java.lang.Void"));
        AbstractC4862t.d(bVarM, "topLevel(FqName(\"java.lang.Void\"))");
        f3849b = bVarM;
    }

    public final Ic.h a(Class cls) {
        if (cls.isPrimitive()) {
            return EnumC5882e.j(cls.getSimpleName()).s();
        }
        return null;
    }

    public final boolean b(InterfaceC1196y interfaceC1196y) {
        if (AbstractC5282d.p(interfaceC1196y) || AbstractC5282d.q(interfaceC1196y)) {
            return true;
        }
        return AbstractC4862t.a(interfaceC1196y.getName(), Kc.a.f7788e.a()) && interfaceC1196y.i().isEmpty();
    }

    public final kd.b c(Class klass) {
        AbstractC4862t.e(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            AbstractC4862t.d(componentType, "klass.componentType");
            Ic.h hVarA = a(componentType);
            if (hVarA != null) {
                return new kd.b(Ic.j.f5739u, hVarA.j());
            }
            kd.b bVarM = kd.b.m(j.a.f5797i.l());
            AbstractC4862t.d(bVarM, "topLevel(StandardNames.FqNames.array.toSafe())");
            return bVarM;
        }
        if (AbstractC4862t.a(klass, Void.TYPE)) {
            return f3849b;
        }
        Ic.h hVarA2 = a(klass);
        if (hVarA2 != null) {
            return new kd.b(Ic.j.f5739u, hVarA2.q());
        }
        kd.b bVarA = Rc.d.a(klass);
        if (!bVarA.k()) {
            Kc.c cVar = Kc.c.f7792a;
            kd.c cVarB = bVarA.b();
            AbstractC4862t.d(cVarB, "classId.asSingleFqName()");
            kd.b bVarM2 = cVar.m(cVarB);
            if (bVarM2 != null) {
                return bVarM2;
            }
        }
        return bVarA;
    }

    public final AbstractC0833h.e d(InterfaceC1196y interfaceC1196y) {
        return new AbstractC0833h.e(new AbstractC4763d.b(e(interfaceC1196y), dd.w.c(interfaceC1196y, false, false, 1, null)));
    }

    public final String e(InterfaceC1174b interfaceC1174b) {
        String strB = Uc.H.b(interfaceC1174b);
        if (strB != null) {
            return strB;
        }
        if (interfaceC1174b instanceof V) {
            String strB2 = AbstractC5823c.s(interfaceC1174b).getName().b();
            AbstractC4862t.d(strB2, "descriptor.propertyIfAccessor.name.asString()");
            return Uc.A.b(strB2);
        }
        if (interfaceC1174b instanceof W) {
            String strB3 = AbstractC5823c.s(interfaceC1174b).getName().b();
            AbstractC4862t.d(strB3, "descriptor.propertyIfAccessor.name.asString()");
            return Uc.A.e(strB3);
        }
        String strB4 = interfaceC1174b.getName().b();
        AbstractC4862t.d(strB4, "descriptor.name.asString()");
        return strB4;
    }

    public final AbstractC0834i f(U possiblyOverriddenProperty) {
        AbstractC4862t.e(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        U uA = ((U) AbstractC5283e.L(possiblyOverriddenProperty)).a();
        AbstractC4862t.d(uA, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (uA instanceof Ad.j) {
            Ad.j jVar = (Ad.j) uA;
            fd.n nVarF1 = jVar.e0();
            i.f propertySignature = AbstractC4376a.f37381d;
            AbstractC4862t.d(propertySignature, "propertySignature");
            AbstractC4376a.d dVar = (AbstractC4376a.d) hd.e.a(nVarF1, propertySignature);
            if (dVar != null) {
                return new AbstractC0834i.c(uA, nVarF1, dVar, jVar.G(), jVar.D());
            }
        } else if (uA instanceof Wc.f) {
            a0 a0VarJ = ((Wc.f) uA).j();
            InterfaceC2685a interfaceC2685a = a0VarJ instanceof InterfaceC2685a ? (InterfaceC2685a) a0VarJ : null;
            InterfaceC2920l interfaceC2920lC = interfaceC2685a != null ? interfaceC2685a.c() : null;
            if (interfaceC2920lC instanceof Rc.r) {
                return new AbstractC0834i.a(((Rc.r) interfaceC2920lC).R());
            }
            if (interfaceC2920lC instanceof Rc.u) {
                Method methodT = ((Rc.u) interfaceC2920lC).R();
                W wH = uA.h();
                a0 a0VarJ2 = wH != null ? wH.j() : null;
                InterfaceC2685a interfaceC2685a2 = a0VarJ2 instanceof InterfaceC2685a ? (InterfaceC2685a) a0VarJ2 : null;
                InterfaceC2920l interfaceC2920lC2 = interfaceC2685a2 != null ? interfaceC2685a2.c() : null;
                Rc.u uVar = interfaceC2920lC2 instanceof Rc.u ? (Rc.u) interfaceC2920lC2 : null;
                return new AbstractC0834i.b(methodT, uVar != null ? uVar.R() : null);
            }
            throw new D("Incorrect resolution sequence for Java field " + uA + " (source = " + interfaceC2920lC + ')');
        }
        V vG = uA.g();
        AbstractC4862t.b(vG);
        AbstractC0833h.e eVarD = d(vG);
        W wH2 = uA.h();
        return new AbstractC0834i.d(eVarD, wH2 != null ? d(wH2) : null);
    }

    public final AbstractC0833h g(InterfaceC1196y possiblySubstitutedFunction) {
        Method methodT;
        AbstractC4763d.b bVarB;
        AbstractC4763d.b bVarE;
        AbstractC4862t.e(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC1196y interfaceC1196yA = ((InterfaceC1196y) AbstractC5283e.L(possiblySubstitutedFunction)).a();
        AbstractC4862t.d(interfaceC1196yA, "unwrapFakeOverride(possi…titutedFunction).original");
        if (interfaceC1196yA instanceof Ad.b) {
            Ad.b bVar = (Ad.b) interfaceC1196yA;
            md.p pVarE0 = bVar.e0();
            if ((pVarE0 instanceof fd.i) && (bVarE = C4768i.f39178a.e((fd.i) pVarE0, bVar.G(), bVar.D())) != null) {
                return new AbstractC0833h.e(bVarE);
            }
            if (!(pVarE0 instanceof fd.d) || (bVarB = C4768i.f39178a.b((fd.d) pVarE0, bVar.G(), bVar.D())) == null) {
                return d(interfaceC1196yA);
            }
            InterfaceC1185m interfaceC1185mB = possiblySubstitutedFunction.b();
            AbstractC4862t.d(interfaceC1185mB, "possiblySubstitutedFunction.containingDeclaration");
            return AbstractC5285g.b(interfaceC1185mB) ? new AbstractC0833h.e(bVarB) : new AbstractC0833h.d(bVarB);
        }
        if (interfaceC1196yA instanceof Wc.e) {
            a0 a0VarJ = ((Wc.e) interfaceC1196yA).j();
            InterfaceC2685a interfaceC2685a = a0VarJ instanceof InterfaceC2685a ? (InterfaceC2685a) a0VarJ : null;
            InterfaceC2920l interfaceC2920lC = interfaceC2685a != null ? interfaceC2685a.c() : null;
            Rc.u uVar = interfaceC2920lC instanceof Rc.u ? (Rc.u) interfaceC2920lC : null;
            if (uVar != null && (methodT = uVar.R()) != null) {
                return new AbstractC0833h.c(methodT);
            }
            throw new D("Incorrect resolution sequence for Java method " + interfaceC1196yA);
        }
        if (!(interfaceC1196yA instanceof Wc.b)) {
            if (b(interfaceC1196yA)) {
                return d(interfaceC1196yA);
            }
            throw new D("Unknown origin of " + interfaceC1196yA + " (" + interfaceC1196yA.getClass() + ')');
        }
        a0 a0VarJ2 = ((Wc.b) interfaceC1196yA).j();
        InterfaceC2685a interfaceC2685a2 = a0VarJ2 instanceof InterfaceC2685a ? (InterfaceC2685a) a0VarJ2 : null;
        InterfaceC2920l interfaceC2920lC2 = interfaceC2685a2 != null ? interfaceC2685a2.c() : null;
        if (interfaceC2920lC2 instanceof Rc.o) {
            return new AbstractC0833h.b(((Rc.o) interfaceC2920lC2).R());
        }
        if (interfaceC2920lC2 instanceof Rc.l) {
            Rc.l lVar = (Rc.l) interfaceC2920lC2;
            if (lVar.m()) {
                return new AbstractC0833h.a(lVar.r());
            }
        }
        throw new D("Incorrect resolution sequence for Java constructor " + interfaceC1196yA + " (" + interfaceC2920lC2 + ')');
    }
}
