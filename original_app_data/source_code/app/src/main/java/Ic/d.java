package Ic;

import Lc.InterfaceC1177e;
import gc.C4179C;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;
import od.AbstractC5283e;
import sd.AbstractC5823c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final boolean a(c cVar, InterfaceC1177e classDescriptor) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(classDescriptor, "classDescriptor");
        if (!AbstractC5283e.x(classDescriptor)) {
            return false;
        }
        Set setB = cVar.b();
        kd.b bVarK = AbstractC5823c.k(classDescriptor);
        return C4179C.Y(setB, bVarK != null ? bVarK.g() : null);
    }
}
