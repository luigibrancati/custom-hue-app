package Uc;

import Lc.InterfaceC1174b;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1194w;
import Lc.U;
import od.AbstractC5283e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {
    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC1174b interfaceC1174b) {
        InterfaceC1194w interfaceC1194wT0;
        if (interfaceC1174b == null) {
            a(3);
        }
        if ((interfaceC1174b instanceof U) && (interfaceC1194wT0 = ((U) interfaceC1174b).t0()) != null && interfaceC1194wT0.getAnnotations().K(A.f16835b)) {
            return true;
        }
        return interfaceC1174b.getAnnotations().K(A.f16835b);
    }

    public static boolean c(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            a(1);
        }
        return AbstractC5283e.x(interfaceC1185m) && AbstractC5283e.w(interfaceC1185m.b()) && !d((InterfaceC1177e) interfaceC1185m);
    }

    public static boolean d(InterfaceC1177e interfaceC1177e) {
        if (interfaceC1177e == null) {
            a(2);
        }
        return Ic.d.a(Ic.c.f5683a, interfaceC1177e);
    }

    public static boolean e(U u10) {
        if (u10 == null) {
            a(0);
        }
        if (u10.f() == InterfaceC1174b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(u10.b())) {
            return true;
        }
        return AbstractC5283e.x(u10.b()) && b(u10);
    }
}
