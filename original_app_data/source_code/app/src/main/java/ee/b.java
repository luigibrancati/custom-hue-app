package ee;

import ge.r0;
import je.AbstractC4771b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final Cc.d a(e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        if (eVar instanceof r0) {
            return a(((r0) eVar).k());
        }
        return null;
    }

    public static final e b(AbstractC4771b abstractC4771b, e descriptor) {
        ce.b bVarB;
        AbstractC4862t.e(abstractC4771b, "<this>");
        AbstractC4862t.e(descriptor, "descriptor");
        Cc.d dVarA = a(descriptor);
        if (dVarA == null || (bVarB = AbstractC4771b.b(abstractC4771b, dVarA, null, 2, null)) == null) {
            return null;
        }
        return bVarB.getDescriptor();
    }
}
