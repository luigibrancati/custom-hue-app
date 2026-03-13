package Oc;

import Lc.InterfaceC1185m;
import Lc.a0;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class N extends M {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bd.j f12227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC6082a f12228h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1185m interfaceC1185m, Mc.g gVar, kd.f fVar, Cd.E e10, boolean z10, a0 a0Var) {
        super(interfaceC1185m, gVar, fVar, e10, a0Var);
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
        this.f12226f = z10;
    }

    private static /* synthetic */ void g0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public void K0(Bd.j jVar, InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            g0(5);
        }
        this.f12228h = interfaceC6082a;
        if (jVar == null) {
            jVar = (Bd.j) interfaceC6082a.invoke();
        }
        this.f12227g = jVar;
    }

    @Override // Lc.k0
    public boolean L() {
        return this.f12226f;
    }

    public void L0(InterfaceC6082a interfaceC6082a) {
        if (interfaceC6082a == null) {
            g0(4);
        }
        K0(null, interfaceC6082a);
    }

    @Override // Lc.k0
    public qd.g n0() {
        Bd.j jVar = this.f12227g;
        if (jVar != null) {
            return (qd.g) jVar.invoke();
        }
        return null;
    }
}
