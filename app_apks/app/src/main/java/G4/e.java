package G4;

import gc.Q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f4517a = new e();

    public final Map a(Map map) {
        AbstractC4862t.e(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return Q.w(linkedHashMap);
    }

    public final Map b(List events) {
        AbstractC4862t.e(events, "events");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            E4.a aVar = (E4.a) it.next();
            e eVar = f4517a;
            Map mapI0 = aVar.I0();
            AbstractC4862t.b(mapI0);
            Object obj = mapI0.get(E4.e.SET.b());
            AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
            linkedHashMap.putAll(eVar.a(T.c(obj)));
        }
        return linkedHashMap;
    }
}
