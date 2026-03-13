package Q3;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface s0 {
    void a(r0 r0Var);

    List b(String str);

    default void c(String id2, Set tags) {
        AbstractC4862t.e(id2, "id");
        AbstractC4862t.e(tags, "tags");
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            a(new r0((String) it.next(), id2));
        }
    }
}
