package Oc;

import Cd.u0;
import Lc.InterfaceC1185m;
import Lc.a0;
import Lc.d0;
import Lc.f0;
import java.util.ArrayList;
import java.util.List;
import od.AbstractC5283e;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class K extends AbstractC1811e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vc.l f12213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f12214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12215m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC1185m interfaceC1185m, Mc.g gVar, boolean z10, u0 u0Var, kd.f fVar, int i10, a0 a0Var, vc.l lVar, d0 d0Var, Bd.n nVar) {
        super(nVar, interfaceC1185m, gVar, fVar, u0Var, z10, i10, a0Var, d0Var);
        if (interfaceC1185m == null) {
            g0(19);
        }
        if (gVar == null) {
            g0(20);
        }
        if (u0Var == null) {
            g0(21);
        }
        if (fVar == null) {
            g0(22);
        }
        if (a0Var == null) {
            g0(23);
        }
        if (d0Var == null) {
            g0(24);
        }
        if (nVar == null) {
            g0(25);
        }
        this.f12214l = new ArrayList(1);
        this.f12215m = false;
        this.f12213k = lVar;
    }

    public static K P0(InterfaceC1185m interfaceC1185m, Mc.g gVar, boolean z10, u0 u0Var, kd.f fVar, int i10, a0 a0Var, Bd.n nVar) {
        if (interfaceC1185m == null) {
            g0(6);
        }
        if (gVar == null) {
            g0(7);
        }
        if (u0Var == null) {
            g0(8);
        }
        if (fVar == null) {
            g0(9);
        }
        if (a0Var == null) {
            g0(10);
        }
        if (nVar == null) {
            g0(11);
        }
        return Q0(interfaceC1185m, gVar, z10, u0Var, fVar, i10, a0Var, null, d0.a.f8751a, nVar);
    }

    public static K Q0(InterfaceC1185m interfaceC1185m, Mc.g gVar, boolean z10, u0 u0Var, kd.f fVar, int i10, a0 a0Var, vc.l lVar, d0 d0Var, Bd.n nVar) {
        if (interfaceC1185m == null) {
            g0(12);
        }
        if (gVar == null) {
            g0(13);
        }
        if (u0Var == null) {
            g0(14);
        }
        if (fVar == null) {
            g0(15);
        }
        if (a0Var == null) {
            g0(16);
        }
        if (d0Var == null) {
            g0(17);
        }
        if (nVar == null) {
            g0(18);
        }
        return new K(interfaceC1185m, gVar, z10, u0Var, fVar, i10, a0Var, lVar, d0Var, nVar);
    }

    public static f0 R0(InterfaceC1185m interfaceC1185m, Mc.g gVar, boolean z10, u0 u0Var, kd.f fVar, int i10, Bd.n nVar) {
        if (interfaceC1185m == null) {
            g0(0);
        }
        if (gVar == null) {
            g0(1);
        }
        if (u0Var == null) {
            g0(2);
        }
        if (fVar == null) {
            g0(3);
        }
        if (nVar == null) {
            g0(4);
        }
        K kP0 = P0(interfaceC1185m, gVar, z10, u0Var, fVar, i10, a0.f8746a, nVar);
        kP0.M0(AbstractC5823c.j(interfaceC1185m).y());
        kP0.V0();
        return kP0;
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Oc.AbstractC1811e
    public void K0(Cd.E e10) {
        if (e10 == null) {
            g0(27);
        }
        vc.l lVar = this.f12213k;
        if (lVar == null) {
            return;
        }
        lVar.invoke(e10);
    }

    @Override // Oc.AbstractC1811e
    public List L0() {
        N0();
        List list = this.f12214l;
        if (list == null) {
            g0(28);
        }
        return list;
    }

    public void M0(Cd.E e10) {
        if (e10 == null) {
            g0(26);
        }
        O0();
        S0(e10);
    }

    public final void N0() {
        if (this.f12215m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + U0());
    }

    public final void O0() {
        if (this.f12215m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + U0());
        }
    }

    public final void S0(Cd.E e10) {
        if (Cd.G.a(e10)) {
            return;
        }
        this.f12214l.add(e10);
    }

    public boolean T0() {
        return this.f12215m;
    }

    public final String U0() {
        return getName() + " declared in " + AbstractC5283e.m(b());
    }

    public void V0() {
        O0();
        this.f12215m = true;
    }
}
