package Oc;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import wd.C6193e;
import wd.InterfaceC6195g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class q extends AbstractC1809c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1177e f12342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C6193e f12343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InterfaceC1177e interfaceC1177e) {
        super(Mc.g.f9435K.b());
        if (interfaceC1177e == null) {
            g0(0);
        }
        this.f12342c = interfaceC1177e;
        this.f12343d = new C6193e(interfaceC1177e, null);
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Lc.InterfaceC1185m
    public InterfaceC1185m b() {
        InterfaceC1177e interfaceC1177e = this.f12342c;
        if (interfaceC1177e == null) {
            g0(2);
        }
        return interfaceC1177e;
    }

    @Override // Lc.X
    public InterfaceC6195g getValue() {
        C6193e c6193e = this.f12343d;
        if (c6193e == null) {
            g0(1);
        }
        return c6193e;
    }

    @Override // Oc.AbstractC1816j
    public String toString() {
        return "class " + this.f12342c.getName() + "::this";
    }
}
