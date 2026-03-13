package Oc;

import Lc.AbstractC1192u;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.X;
import Lc.Z;
import Lc.a0;
import io.flutter.Build;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class G extends p implements Z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC1185m interfaceC1185m, Z z10, Mc.g gVar, kd.f fVar, InterfaceC1174b.a aVar, a0 a0Var) {
        super(interfaceC1185m, z10, gVar, fVar, aVar, a0Var);
        if (interfaceC1185m == null) {
            g0(0);
        }
        if (gVar == null) {
            g0(1);
        }
        if (fVar == null) {
            g0(2);
        }
        if (aVar == null) {
            g0(3);
        }
        if (a0Var == null) {
            g0(4);
        }
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case Build.API_LEVELS.API_30 /* 30 */:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static G l1(InterfaceC1185m interfaceC1185m, Mc.g gVar, kd.f fVar, InterfaceC1174b.a aVar, a0 a0Var) {
        if (interfaceC1185m == null) {
            g0(5);
        }
        if (gVar == null) {
            g0(6);
        }
        if (fVar == null) {
            g0(7);
        }
        if (aVar == null) {
            g0(8);
        }
        if (a0Var == null) {
            g0(9);
        }
        return new G(interfaceC1185m, null, gVar, fVar, aVar, a0Var);
    }

    @Override // Oc.p
    public p L0(InterfaceC1185m interfaceC1185m, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a aVar, kd.f fVar, Mc.g gVar, a0 a0Var) {
        if (interfaceC1185m == null) {
            g0(25);
        }
        if (aVar == null) {
            g0(26);
        }
        if (gVar == null) {
            g0(27);
        }
        if (a0Var == null) {
            g0(28);
        }
        Z z10 = (Z) interfaceC1196y;
        if (fVar == null) {
            fVar = getName();
        }
        return new G(interfaceC1185m, z10, gVar, fVar, aVar, a0Var);
    }

    @Override // Lc.InterfaceC1174b
    /* JADX INFO: renamed from: k1 */
    public Z H0(InterfaceC1185m interfaceC1185m, Lc.D d10, AbstractC1192u abstractC1192u, InterfaceC1174b.a aVar, boolean z10) {
        Z z11 = (Z) super.K0(interfaceC1185m, d10, abstractC1192u, aVar, z10);
        if (z11 == null) {
            g0(29);
        }
        return z11;
    }

    @Override // Oc.p, Oc.AbstractC1817k, Oc.AbstractC1816j, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public Z a() {
        Z z10 = (Z) super.a();
        if (z10 == null) {
            g0(24);
        }
        return z10;
    }

    @Override // Oc.p
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public G R0(X x10, X x11, List list, List list2, List list3, Cd.E e10, Lc.D d10, AbstractC1192u abstractC1192u) {
        if (list == null) {
            g0(14);
        }
        if (list2 == null) {
            g0(15);
        }
        if (list3 == null) {
            g0(16);
        }
        if (abstractC1192u == null) {
            g0(17);
        }
        G gO1 = o1(x10, x11, list, list2, list3, e10, d10, abstractC1192u, null);
        if (gO1 == null) {
            g0(18);
        }
        return gO1;
    }

    public G o1(X x10, X x11, List list, List list2, List list3, Cd.E e10, Lc.D d10, AbstractC1192u abstractC1192u, Map map) {
        if (list == null) {
            g0(19);
        }
        if (list2 == null) {
            g0(20);
        }
        if (list3 == null) {
            g0(21);
        }
        if (abstractC1192u == null) {
            g0(22);
        }
        super.R0(x10, x11, list, list2, list3, e10, d10, abstractC1192u);
        if (map != null && !map.isEmpty()) {
            this.f12292D = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // Oc.p, Lc.InterfaceC1196y, Lc.Z
    public InterfaceC1196y.a u() {
        InterfaceC1196y.a aVarU = super.u();
        if (aVarU == null) {
            g0(30);
        }
        return aVarU;
    }
}
