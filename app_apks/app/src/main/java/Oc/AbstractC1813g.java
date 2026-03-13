package Oc;

import Lc.InterfaceC1185m;
import Lc.a0;

/* JADX INFO: renamed from: Oc.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1813g extends AbstractC1807a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1185m f12258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f12259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1813g(Bd.n nVar, InterfaceC1185m interfaceC1185m, kd.f fVar, a0 a0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            E0(0);
        }
        if (interfaceC1185m == null) {
            E0(1);
        }
        if (fVar == null) {
            E0(2);
        }
        if (a0Var == null) {
            E0(3);
        }
        this.f12258f = interfaceC1185m;
        this.f12259g = a0Var;
        this.f12260h = z10;
    }

    private static /* synthetic */ void E0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Lc.InterfaceC1177e, Lc.InterfaceC1186n, Lc.InterfaceC1185m
    public InterfaceC1185m b() {
        InterfaceC1185m interfaceC1185m = this.f12258f;
        if (interfaceC1185m == null) {
            E0(4);
        }
        return interfaceC1185m;
    }

    public boolean isExternal() {
        return this.f12260h;
    }

    @Override // Lc.InterfaceC1188p
    public a0 j() {
        a0 a0Var = this.f12259g;
        if (a0Var == null) {
            E0(5);
        }
        return a0Var;
    }
}
