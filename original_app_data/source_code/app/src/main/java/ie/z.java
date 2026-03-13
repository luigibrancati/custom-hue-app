package ie;

import he.AbstractC4304b;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class z {
    public static final void a(AbstractC4304b json, InterfaceC4393o writer, ce.g serializer, Object obj) {
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(writer, "writer");
        AbstractC4862t.e(serializer, "serializer");
        new H(writer, json, O.OBJ, new he.r[O.b().size()]).x(serializer, obj);
    }
}
