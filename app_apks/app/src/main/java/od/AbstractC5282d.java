package od;

import Cd.E;
import Cd.M;
import Cd.k0;
import Cd.u0;
import Lc.AbstractC1191t;
import Lc.AbstractC1192u;
import Lc.AbstractC1195x;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1196y;
import Lc.U;
import Lc.X;
import Lc.Z;
import Lc.a0;
import Mc.g;
import Oc.C;
import Oc.C1812f;
import Oc.D;
import Oc.F;
import Oc.G;
import Oc.L;
import io.flutter.Build;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.Collections;
import java.util.List;
import sd.AbstractC5823c;
import wd.C6190b;
import wd.C6191c;
import wd.C6192d;

/* JADX INFO: renamed from: od.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5282d {

    /* JADX INFO: renamed from: od.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends C1812f {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1177e interfaceC1177e, a0 a0Var, boolean z10) {
            super(interfaceC1177e, null, Mc.g.f9435K.b(), true, InterfaceC1174b.a.DECLARATION, a0Var);
            if (interfaceC1177e == null) {
                g0(0);
            }
            if (a0Var == null) {
                g0(1);
            }
            q1(Collections.EMPTY_LIST, AbstractC5283e.k(interfaceC1177e, z10));
        }

        private static /* synthetic */ void g0(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case Build.API_LEVELS.API_30 /* 30 */:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case Build.API_LEVELS.API_30 /* 30 */:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static X b(InterfaceC1173a interfaceC1173a, E e10, kd.f fVar, Mc.g gVar) {
        if (interfaceC1173a == null) {
            a(32);
        }
        if (gVar == null) {
            a(33);
        }
        if (e10 == null) {
            return null;
        }
        return new F(interfaceC1173a, new C6191c(interfaceC1173a, e10, fVar, null), gVar);
    }

    public static X c(InterfaceC1177e interfaceC1177e, E e10, kd.f fVar, Mc.g gVar) {
        if (interfaceC1177e == null) {
            a(34);
        }
        if (gVar == null) {
            a(35);
        }
        if (e10 == null) {
            return null;
        }
        return new F(interfaceC1177e, new C6190b(interfaceC1177e, e10, fVar, null), gVar);
    }

    public static D d(U u10, Mc.g gVar) {
        if (u10 == null) {
            a(13);
        }
        if (gVar == null) {
            a(14);
        }
        return j(u10, gVar, true, false, false);
    }

    public static Oc.E e(U u10, Mc.g gVar, Mc.g gVar2) {
        if (u10 == null) {
            a(0);
        }
        if (gVar == null) {
            a(1);
        }
        if (gVar2 == null) {
            a(2);
        }
        return n(u10, gVar, gVar2, true, false, false, u10.j());
    }

    public static U f(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(26);
        }
        InterfaceC1177e interfaceC1177eA = AbstractC1195x.a(AbstractC5283e.g(interfaceC1177e), kd.i.f39611a.i());
        if (interfaceC1177eA == null) {
            return null;
        }
        g.a aVar = Mc.g.f9435K;
        Mc.g gVarB = aVar.b();
        Lc.D d10 = Lc.D.FINAL;
        AbstractC1192u abstractC1192u = AbstractC1191t.f8775e;
        kd.f fVar = Ic.j.f5723e;
        InterfaceC1174b.a aVar2 = InterfaceC1174b.a.SYNTHESIZED;
        C cO0 = C.O0(interfaceC1177e, gVarB, d10, abstractC1192u, false, fVar, aVar2, interfaceC1177e.j(), false, false, false, false, false, false);
        D d11 = new D(cO0, aVar.b(), d10, abstractC1192u, false, false, false, aVar2, null, interfaceC1177e.j());
        cO0.U0(d11, null);
        M mH = Cd.F.h(Cd.a0.f1311b.h(), interfaceC1177eA.k(), Collections.singletonList(new k0(interfaceC1177e.p())), false);
        List list = Collections.EMPTY_LIST;
        cO0.b1(mH, list, null, null, list);
        d11.P0(cO0.getReturnType());
        return cO0;
    }

    public static Z g(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(24);
        }
        g.a aVar = Mc.g.f9435K;
        G gL1 = G.l1(interfaceC1177e, aVar.b(), Ic.j.f5724f, InterfaceC1174b.a.SYNTHESIZED, interfaceC1177e.j());
        L l10 = new L(gL1, null, 0, aVar.b(), kd.f.s("value"), AbstractC5823c.j(interfaceC1177e).W(), false, false, false, null, interfaceC1177e.j());
        List list = Collections.EMPTY_LIST;
        G gN1 = gL1.R0(null, null, list, list, Collections.singletonList(l10), interfaceC1177e.p(), Lc.D.FINAL, AbstractC1191t.f8775e);
        if (gN1 == null) {
            a(25);
        }
        return gN1;
    }

    public static Z h(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(22);
        }
        G gL1 = G.l1(interfaceC1177e, Mc.g.f9435K.b(), Ic.j.f5722d, InterfaceC1174b.a.SYNTHESIZED, interfaceC1177e.j());
        List list = Collections.EMPTY_LIST;
        G gN1 = gL1.R0(null, null, list, list, list, AbstractC5823c.j(interfaceC1177e).l(u0.INVARIANT, interfaceC1177e.p()), Lc.D.FINAL, AbstractC1191t.f8775e);
        if (gN1 == null) {
            a(23);
        }
        return gN1;
    }

    public static X i(InterfaceC1173a interfaceC1173a, E e10, Mc.g gVar) {
        if (interfaceC1173a == null) {
            a(30);
        }
        if (gVar == null) {
            a(31);
        }
        if (e10 == null) {
            return null;
        }
        return new F(interfaceC1173a, new C6192d(interfaceC1173a, e10, null), gVar);
    }

    public static D j(U u10, Mc.g gVar, boolean z10, boolean z11, boolean z12) {
        if (u10 == null) {
            a(15);
        }
        if (gVar == null) {
            a(16);
        }
        return k(u10, gVar, z10, z11, z12, u10.j());
    }

    public static D k(U u10, Mc.g gVar, boolean z10, boolean z11, boolean z12, a0 a0Var) {
        if (u10 == null) {
            a(17);
        }
        if (gVar == null) {
            a(18);
        }
        if (a0Var == null) {
            a(19);
        }
        return new D(u10, gVar, u10.r(), u10.getVisibility(), z10, z11, z12, InterfaceC1174b.a.DECLARATION, null, a0Var);
    }

    public static C1812f l(InterfaceC1177e interfaceC1177e, a0 a0Var) {
        if (interfaceC1177e == null) {
            a(20);
        }
        if (a0Var == null) {
            a(21);
        }
        return new a(interfaceC1177e, a0Var, false);
    }

    public static Oc.E m(U u10, Mc.g gVar, Mc.g gVar2, boolean z10, boolean z11, boolean z12, AbstractC1192u abstractC1192u, a0 a0Var) {
        if (u10 == null) {
            a(7);
        }
        if (gVar == null) {
            a(8);
        }
        if (gVar2 == null) {
            a(9);
        }
        if (abstractC1192u == null) {
            a(10);
        }
        if (a0Var == null) {
            a(11);
        }
        Oc.E e10 = new Oc.E(u10, gVar, u10.r(), abstractC1192u, z10, z11, z12, InterfaceC1174b.a.DECLARATION, null, a0Var);
        e10.Q0(Oc.E.O0(e10, u10.getType(), gVar2));
        return e10;
    }

    public static Oc.E n(U u10, Mc.g gVar, Mc.g gVar2, boolean z10, boolean z11, boolean z12, a0 a0Var) {
        if (u10 == null) {
            a(3);
        }
        if (gVar == null) {
            a(4);
        }
        if (gVar2 == null) {
            a(5);
        }
        if (a0Var == null) {
            a(6);
        }
        return m(u10, gVar, gVar2, z10, z11, z12, u10.getVisibility(), a0Var);
    }

    public static boolean o(InterfaceC1196y interfaceC1196y) {
        if (interfaceC1196y == null) {
            a(29);
        }
        return interfaceC1196y.f() == InterfaceC1174b.a.SYNTHESIZED && AbstractC5283e.A(interfaceC1196y.b());
    }

    public static boolean p(InterfaceC1196y interfaceC1196y) {
        if (interfaceC1196y == null) {
            a(28);
        }
        return interfaceC1196y.getName().equals(Ic.j.f5724f) && o(interfaceC1196y);
    }

    public static boolean q(InterfaceC1196y interfaceC1196y) {
        if (interfaceC1196y == null) {
            a(27);
        }
        return interfaceC1196y.getName().equals(Ic.j.f5722d) && o(interfaceC1196y);
    }
}
