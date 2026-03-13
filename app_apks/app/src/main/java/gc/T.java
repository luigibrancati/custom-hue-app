package gc;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class T {
    public static Set a(Set builder) {
        AbstractC4862t.e(builder, "builder");
        return ((hc.h) builder).d();
    }

    public static Set b() {
        return new hc.h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC4862t.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
