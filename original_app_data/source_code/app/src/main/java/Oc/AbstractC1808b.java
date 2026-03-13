package Oc;

import Cd.u0;
import Lc.InterfaceC1185m;
import Lc.a0;
import Lc.d0;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: Oc.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1808b extends AbstractC1811e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1808b(Bd.n nVar, InterfaceC1185m interfaceC1185m, Mc.g gVar, kd.f fVar, u0 u0Var, boolean z10, int i10, a0 a0Var, d0 d0Var) {
        super(nVar, interfaceC1185m, gVar, fVar, u0Var, z10, i10, a0Var, d0Var);
        if (nVar == null) {
            g0(0);
        }
        if (interfaceC1185m == null) {
            g0(1);
        }
        if (gVar == null) {
            g0(2);
        }
        if (fVar == null) {
            g0(3);
        }
        if (u0Var == null) {
            g0(4);
        }
        if (a0Var == null) {
            g0(5);
        }
        if (d0Var == null) {
            g0(6);
        }
    }

    public static /* synthetic */ void g0(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Oc.AbstractC1816j
    public String toString() {
        String str = "";
        String str2 = w() ? "reified " : "";
        if (m() != u0.INVARIANT) {
            str = m() + StringUtils.SPACE;
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
