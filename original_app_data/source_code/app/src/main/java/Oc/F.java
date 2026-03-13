package Oc;

import Lc.InterfaceC1185m;
import wd.InterfaceC6195g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class F extends AbstractC1809c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1185m f12201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC6195g f12202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(InterfaceC1185m interfaceC1185m, InterfaceC6195g interfaceC6195g, Mc.g gVar) {
        super(gVar);
        if (interfaceC1185m == null) {
            g0(0);
        }
        if (interfaceC6195g == null) {
            g0(1);
        }
        if (gVar == null) {
            g0(2);
        }
        this.f12201c = interfaceC1185m;
        this.f12202d = interfaceC6195g;
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getValue";
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                objArr[2] = "copy";
            } else if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Lc.InterfaceC1185m
    public InterfaceC1185m b() {
        InterfaceC1185m interfaceC1185m = this.f12201c;
        if (interfaceC1185m == null) {
            g0(4);
        }
        return interfaceC1185m;
    }

    @Override // Lc.X
    public InterfaceC6195g getValue() {
        InterfaceC6195g interfaceC6195g = this.f12202d;
        if (interfaceC6195g == null) {
            g0(3);
        }
        return interfaceC6195g;
    }
}
