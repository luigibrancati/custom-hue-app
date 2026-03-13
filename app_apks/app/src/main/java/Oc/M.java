package Oc;

import Lc.InterfaceC1185m;
import Lc.X;
import Lc.a0;
import Lc.k0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class M extends AbstractC1817k implements k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Cd.E f12225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(InterfaceC1185m interfaceC1185m, Mc.g gVar, kd.f fVar, Cd.E e10, a0 a0Var) {
        super(interfaceC1185m, gVar, fVar, a0Var);
        if (interfaceC1185m == null) {
            g0(0);
        }
        if (gVar == null) {
            g0(1);
        }
        if (fVar == null) {
            g0(2);
        }
        if (a0Var == null) {
            g0(3);
        }
        this.f12225e = e10;
    }

    private static /* synthetic */ void g0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void G0(Cd.E e10) {
        this.f12225e = e10;
    }

    public X J() {
        return null;
    }

    public X M() {
        return null;
    }

    @Override // Lc.InterfaceC1173a
    public boolean f0() {
        return false;
    }

    public Cd.E getReturnType() {
        Cd.E type = getType();
        if (type == null) {
            g0(10);
        }
        return type;
    }

    @Override // Lc.i0
    public Cd.E getType() {
        Cd.E e10 = this.f12225e;
        if (e10 == null) {
            g0(4);
        }
        return e10;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            g0(8);
        }
        return list;
    }

    @Override // Lc.InterfaceC1173a
    public List i() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            g0(6);
        }
        return list;
    }
}
