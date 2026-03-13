package Dd;

import Cd.E;
import Cd.e0;
import Cd.f0;
import Cd.i0;
import Cd.q0;
import Cd.u0;
import Lc.InterfaceC1185m;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import nd.AbstractC5164c;
import pd.AbstractC5463d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    public static final E a(E e10) {
        return (E) Id.b.a(e10).d();
    }

    public static final String b(e0 e0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + e0Var, sb2);
        c("hashCode: " + e0Var.hashCode(), sb2);
        c("javaClass: " + e0Var.getClass().getCanonicalName(), sb2);
        for (InterfaceC1185m interfaceC1185mQ = e0Var.q(); interfaceC1185mQ != null; interfaceC1185mQ = interfaceC1185mQ.b()) {
            c("fqName: " + AbstractC5164c.f40783g.q(interfaceC1185mQ), sb2);
            c("javaClass: " + interfaceC1185mQ.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        AbstractC4862t.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final StringBuilder c(String str, StringBuilder sb2) {
        AbstractC4862t.e(str, "<this>");
        sb2.append(str);
        AbstractC4862t.d(sb2, "append(value)");
        sb2.append('\n');
        AbstractC4862t.d(sb2, "append('\\n')");
        return sb2;
    }

    public static final E d(E subtype, E supertype, t typeCheckingProcedureCallbacks) {
        AbstractC4862t.e(subtype, "subtype");
        AbstractC4862t.e(supertype, "supertype");
        AbstractC4862t.e(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new q(subtype, null));
        e0 e0VarN0 = supertype.N0();
        while (!arrayDeque.isEmpty()) {
            q qVar = (q) arrayDeque.poll();
            E eB = qVar.b();
            e0 e0VarN02 = eB.N0();
            if (typeCheckingProcedureCallbacks.a(e0VarN02, e0VarN0)) {
                boolean zO0 = eB.O0();
                for (q qVarA = qVar.a(); qVarA != null; qVarA = qVarA.a()) {
                    E eB2 = qVarA.b();
                    List listL0 = eB2.L0();
                    if (listL0 == null || !listL0.isEmpty()) {
                        Iterator it = listL0.iterator();
                        while (it.hasNext()) {
                            u0 u0VarB = ((i0) it.next()).b();
                            u0 u0Var = u0.INVARIANT;
                            if (u0VarB != u0Var) {
                                E eN = AbstractC5463d.f(f0.f1357c.a(eB2), false, 1, null).c().n(eB, u0Var);
                                AbstractC4862t.d(eN, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                                eB = a(eN);
                                break;
                            }
                        }
                        eB = f0.f1357c.a(eB2).c().n(eB, u0.INVARIANT);
                        AbstractC4862t.d(eB, "{\n                    Ty…ARIANT)\n                }");
                    } else {
                        eB = f0.f1357c.a(eB2).c().n(eB, u0.INVARIANT);
                        AbstractC4862t.d(eB, "{\n                    Ty…ARIANT)\n                }");
                    }
                    zO0 = zO0 || eB2.O0();
                }
                e0 e0VarN03 = eB.N0();
                if (typeCheckingProcedureCallbacks.a(e0VarN03, e0VarN0)) {
                    return q0.p(eB, zO0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(e0VarN03) + ", \n\nsupertype: " + b(e0VarN0) + " \n" + typeCheckingProcedureCallbacks.a(e0VarN03, e0VarN0));
            }
            for (E immediateSupertype : e0VarN02.o()) {
                AbstractC4862t.d(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new q(immediateSupertype, qVar));
            }
        }
        return null;
    }
}
