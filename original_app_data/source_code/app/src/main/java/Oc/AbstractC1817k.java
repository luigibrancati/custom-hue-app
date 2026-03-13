package Oc;

import Lc.InterfaceC1185m;
import Lc.InterfaceC1186n;
import Lc.InterfaceC1188p;
import Lc.a0;

/* JADX INFO: renamed from: Oc.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1817k extends AbstractC1816j implements InterfaceC1186n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1185m f12270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f12271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1817k(InterfaceC1185m interfaceC1185m, Mc.g gVar, kd.f fVar, a0 a0Var) {
        super(gVar, fVar);
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
        this.f12270c = interfaceC1185m;
        this.f12271d = a0Var;
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Oc.AbstractC1816j, Lc.InterfaceC1185m
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1188p a() {
        InterfaceC1188p interfaceC1188p = (InterfaceC1188p) super.a();
        if (interfaceC1188p == null) {
            g0(4);
        }
        return interfaceC1188p;
    }

    public InterfaceC1185m b() {
        InterfaceC1185m interfaceC1185m = this.f12270c;
        if (interfaceC1185m == null) {
            g0(5);
        }
        return interfaceC1185m;
    }

    @Override // Lc.InterfaceC1188p
    public a0 j() {
        a0 a0Var = this.f12271d;
        if (a0Var == null) {
            g0(6);
        }
        return a0Var;
    }
}
