package Wc;

import Cd.E;
import Lc.InterfaceC1173a;
import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.a0;
import Oc.C1812f;
import fc.C4034q;
import gc.C4206t;
import java.util.List;
import od.AbstractC5282d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class b extends C1812f implements a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Boolean f17883F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Boolean f17884G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC1177e interfaceC1177e, b bVar, Mc.g gVar, boolean z10, InterfaceC1174b.a aVar, a0 a0Var) {
        super(interfaceC1177e, bVar, gVar, z10, aVar, a0Var);
        if (interfaceC1177e == null) {
            g0(0);
        }
        if (gVar == null) {
            g0(1);
        }
        if (aVar == null) {
            g0(2);
        }
        if (a0Var == null) {
            g0(3);
        }
        this.f17883F = null;
        this.f17884G = null;
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b t1(InterfaceC1177e interfaceC1177e, Mc.g gVar, boolean z10, a0 a0Var) {
        if (interfaceC1177e == null) {
            g0(4);
        }
        if (gVar == null) {
            g0(5);
        }
        if (a0Var == null) {
            g0(6);
        }
        return new b(interfaceC1177e, null, gVar, z10, InterfaceC1174b.a.DECLARATION, a0Var);
    }

    @Override // Oc.p
    public boolean Q0() {
        return this.f17883F.booleanValue();
    }

    @Override // Oc.p
    public void Y0(boolean z10) {
        this.f17883F = Boolean.valueOf(z10);
    }

    @Override // Oc.p
    public void Z0(boolean z10) {
        this.f17884G = Boolean.valueOf(z10);
    }

    @Override // Oc.p, Lc.InterfaceC1173a
    public boolean f0() {
        return this.f17884G.booleanValue();
    }

    public b s1(InterfaceC1177e interfaceC1177e, b bVar, InterfaceC1174b.a aVar, a0 a0Var, Mc.g gVar) {
        if (interfaceC1177e == null) {
            g0(12);
        }
        if (aVar == null) {
            g0(13);
        }
        if (a0Var == null) {
            g0(14);
        }
        if (gVar == null) {
            g0(15);
        }
        return new b(interfaceC1177e, bVar, gVar, this.f12257E, aVar, a0Var);
    }

    @Override // Oc.C1812f
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public b L0(InterfaceC1185m interfaceC1185m, InterfaceC1196y interfaceC1196y, InterfaceC1174b.a aVar, kd.f fVar, Mc.g gVar, a0 a0Var) {
        if (interfaceC1185m == null) {
            g0(7);
        }
        if (aVar == null) {
            g0(8);
        }
        if (gVar == null) {
            g0(9);
        }
        if (a0Var == null) {
            g0(10);
        }
        if (aVar == InterfaceC1174b.a.DECLARATION || aVar == InterfaceC1174b.a.SYNTHESIZED) {
            b bVarS1 = s1((InterfaceC1177e) interfaceC1185m, (b) interfaceC1196y, aVar, a0Var, gVar);
            bVarS1.Y0(Q0());
            bVarS1.Z0(f0());
            return bVarS1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC1185m + "\nkind: " + aVar);
    }

    @Override // Wc.a
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b W(E e10, List list, E e11, C4034q c4034q) {
        if (list == null) {
            g0(16);
        }
        if (e11 == null) {
            g0(17);
        }
        b bVarL0 = L0(b(), null, f(), null, getAnnotations(), j());
        bVarL0.R0(e10 == null ? null : AbstractC5282d.i(bVarL0, e10, Mc.g.f9435K.b()), J(), C4206t.k(), getTypeParameters(), h.a(list, i(), bVarL0), e11, r(), getVisibility());
        if (c4034q != null) {
            bVarL0.U0((InterfaceC1173a.InterfaceC0132a) c4034q.e(), c4034q.f());
        }
        return bVarL0;
    }
}
