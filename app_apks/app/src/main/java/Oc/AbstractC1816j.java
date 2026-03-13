package Oc;

import Lc.InterfaceC1185m;
import nd.AbstractC5164c;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: Oc.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1816j extends Mc.b implements InterfaceC1185m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd.f f12269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1816j(Mc.g gVar, kd.f fVar) {
        super(gVar);
        if (gVar == null) {
            g0(0);
        }
        if (fVar == null) {
            g0(1);
        }
        this.f12269b = fVar;
    }

    public static String D0(InterfaceC1185m interfaceC1185m) {
        if (interfaceC1185m == null) {
            g0(4);
        }
        try {
            String str = AbstractC5164c.f40786j.q(interfaceC1185m) + "[" + interfaceC1185m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC1185m)) + "]";
            if (str == null) {
                g0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC1185m.getClass().getSimpleName() + StringUtils.SPACE + interfaceC1185m.getName();
            if (str2 == null) {
                g0(6);
            }
            return str2;
        }
    }

    private static /* synthetic */ void g0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Lc.I
    public kd.f getName() {
        kd.f fVar = this.f12269b;
        if (fVar == null) {
            g0(2);
        }
        return fVar;
    }

    public String toString() {
        return D0(this);
    }

    public InterfaceC1185m a() {
        return this;
    }
}
