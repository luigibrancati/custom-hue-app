package bd;

import gc.C4179C;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    public static final boolean a(r rVar) {
        kd.c cVarE;
        InterfaceC2906B interfaceC2906B = (InterfaceC2906B) C4179C.H0(rVar.i());
        x type = interfaceC2906B != null ? interfaceC2906B.getType() : null;
        InterfaceC2918j interfaceC2918j = type instanceof InterfaceC2918j ? (InterfaceC2918j) type : null;
        if (interfaceC2918j == null) {
            return false;
        }
        InterfaceC2917i interfaceC2917iA = interfaceC2918j.a();
        return (interfaceC2917iA instanceof InterfaceC2915g) && (cVarE = ((InterfaceC2915g) interfaceC2917iA).e()) != null && AbstractC4862t.a(cVarE.b(), "java.lang.Object");
    }

    public static final boolean b(r rVar) {
        String strB = rVar.getName().b();
        int iHashCode = strB.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strB.equals("equals")) {
                    return a(rVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strB.equals("hashCode")) {
                return false;
            }
        } else if (!strB.equals("toString")) {
            return false;
        }
        return rVar.i().isEmpty();
    }

    public static final boolean c(q qVar) {
        AbstractC4862t.e(qVar, "<this>");
        return qVar.O().J() && (qVar instanceof r) && b((r) qVar);
    }
}
