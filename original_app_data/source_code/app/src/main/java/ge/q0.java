package ge;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f35737a = AbstractC4228c0.a();

    public static final ee.e a(String serialName, ee.d kind) {
        AbstractC4862t.e(serialName, "serialName");
        AbstractC4862t.e(kind, "kind");
        b(serialName);
        return new p0(serialName, kind);
    }

    public static final void b(String serialName) {
        AbstractC4862t.e(serialName, "serialName");
        for (ce.b bVar : f35737a.values()) {
            if (AbstractC4862t.a(serialName, bVar.getDescriptor().i())) {
                throw new IllegalArgumentException(Od.v.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + kotlin.jvm.internal.M.b(bVar.getClass()).l() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
