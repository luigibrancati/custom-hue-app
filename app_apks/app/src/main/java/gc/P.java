package gc;

import fc.C4034q;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class P extends O {
    public static Map b(Map builder) {
        AbstractC4862t.e(builder, "builder");
        return ((hc.d) builder).l();
    }

    public static Map c() {
        return new hc.d();
    }

    public static Map d(int i10) {
        return new hc.d(i10);
    }

    public static int e(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map f(C4034q pair) {
        AbstractC4862t.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.e(), pair.f());
        AbstractC4862t.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map g(Map map) {
        AbstractC4862t.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC4862t.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static SortedMap h(Map map, Comparator comparator) {
        AbstractC4862t.e(map, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
