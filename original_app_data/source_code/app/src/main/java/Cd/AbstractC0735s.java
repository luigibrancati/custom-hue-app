package Cd;

import Lc.InterfaceC1180h;
import Lc.InterfaceC1185m;
import io.sentry.protocol.FeatureFlag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Cd.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0735s {
    public static /* synthetic */ void a(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = FeatureFlag.JsonKeys.RESULT;
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static n0 b(List list, l0 l0Var, InterfaceC1185m interfaceC1185m, List list2) {
        if (list == null) {
            a(0);
        }
        if (l0Var == null) {
            a(1);
        }
        if (interfaceC1185m == null) {
            a(2);
        }
        if (list2 == null) {
            a(3);
        }
        n0 n0VarC = c(list, l0Var, interfaceC1185m, list2, null);
        if (n0VarC != null) {
            return n0VarC;
        }
        throw new AssertionError("Substitution failed");
    }

    public static n0 c(List list, l0 l0Var, InterfaceC1185m interfaceC1185m, List list2, boolean[] zArr) {
        if (list == null) {
            a(5);
        }
        if (l0Var == null) {
            a(6);
        }
        if (interfaceC1185m == null) {
            a(7);
        }
        if (list2 == null) {
            a(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Lc.f0 f0Var = (Lc.f0) it.next();
            Oc.K kP0 = Oc.K.P0(interfaceC1185m, f0Var.getAnnotations(), f0Var.w(), f0Var.m(), f0Var.getName(), i10, Lc.a0.f8746a, f0Var.K());
            map.put(f0Var.k(), new k0(kP0.p()));
            map2.put(f0Var, kP0);
            list2.add(kP0);
            i10++;
        }
        f0 f0VarJ = f0.j(map);
        n0 n0VarH = n0.h(l0Var, f0VarJ);
        n0 n0VarH2 = n0.h(l0Var.h(), f0VarJ);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Lc.f0 f0Var2 = (Lc.f0) it2.next();
            Oc.K k10 = (Oc.K) map2.get(f0Var2);
            for (E e10 : f0Var2.getUpperBounds()) {
                InterfaceC1180h interfaceC1180hQ = e10.N0().q();
                E eP = (((interfaceC1180hQ instanceof Lc.f0) && Hd.a.k((Lc.f0) interfaceC1180hQ)) ? n0VarH : n0VarH2).p(e10, u0.OUT_VARIANCE);
                if (eP == null) {
                    return null;
                }
                if (eP != e10 && zArr != null) {
                    zArr[0] = true;
                }
                k10.M0(eP);
            }
            k10.V0();
        }
        return n0VarH;
    }
}
