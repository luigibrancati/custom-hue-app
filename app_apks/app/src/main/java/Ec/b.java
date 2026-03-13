package Ec;

import Cc.f;
import Cc.p;
import Cc.q;
import Fc.A;
import Fc.D;
import Lc.EnumC1178f;
import Lc.InterfaceC1177e;
import Lc.InterfaceC1180h;
import gc.C4179C;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final Cc.d a(f fVar) {
        Object obj;
        Cc.d dVarB;
        AbstractC4862t.e(fVar, "<this>");
        if (fVar instanceof Cc.d) {
            return (Cc.d) fVar;
        }
        if (!(fVar instanceof q)) {
            throw new D("Cannot calculate JVM erasure for type: " + fVar);
        }
        List upperBounds = ((q) fVar).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            p pVar = (p) next;
            AbstractC4862t.c(pVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC1180h interfaceC1180hQ = ((A) pVar).m().N0().q();
            InterfaceC1177e interfaceC1177e = interfaceC1180hQ instanceof InterfaceC1177e ? (InterfaceC1177e) interfaceC1180hQ : null;
            if (interfaceC1177e != null && interfaceC1177e.f() != EnumC1178f.INTERFACE && interfaceC1177e.f() != EnumC1178f.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        p pVar2 = (p) obj;
        if (pVar2 == null) {
            pVar2 = (p) C4179C.j0(upperBounds);
        }
        return (pVar2 == null || (dVarB = b(pVar2)) == null) ? M.b(Object.class) : dVarB;
    }

    public static final Cc.d b(p pVar) {
        Cc.d dVarA;
        AbstractC4862t.e(pVar, "<this>");
        f fVarA = pVar.a();
        if (fVarA != null && (dVarA = a(fVarA)) != null) {
            return dVarA;
        }
        throw new D("Cannot calculate JVM erasure for type: " + pVar);
    }
}
