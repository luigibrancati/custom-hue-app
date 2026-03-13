package ge;

import gc.C4179C;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class U extends z0 {
    public String h0(String parentName, String childName) {
        AbstractC4862t.e(parentName, "parentName");
        AbstractC4862t.e(childName, "childName");
        if (parentName.length() == 0) {
            return childName;
        }
        return parentName + '.' + childName;
    }

    public String i0(ee.e descriptor, int i10) {
        AbstractC4862t.e(descriptor, "descriptor");
        return descriptor.e(i10);
    }

    @Override // ge.z0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final String c0(ee.e eVar, int i10) {
        AbstractC4862t.e(eVar, "<this>");
        return k0(i0(eVar, i10));
    }

    public final String k0(String nestedName) {
        AbstractC4862t.e(nestedName, "nestedName");
        String str = (String) b0();
        if (str == null) {
            str = "";
        }
        return h0(str, nestedName);
    }

    public final String l0() {
        return d0().isEmpty() ? "$" : C4179C.q0(d0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
