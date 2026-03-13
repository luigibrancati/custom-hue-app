package gc;

import fc.C4034q;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Q extends P {
    public static Map i() {
        C4182F c4182f = C4182F.f35580a;
        AbstractC4862t.c(c4182f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c4182f;
    }

    public static Object j(Map map, Object obj) {
        AbstractC4862t.e(map, "<this>");
        return O.a(map, obj);
    }

    public static HashMap k(C4034q... pairs) {
        AbstractC4862t.e(pairs, "pairs");
        HashMap map = new HashMap(P.e(pairs.length));
        r(map, pairs);
        return map;
    }

    public static Map l(C4034q... pairs) {
        AbstractC4862t.e(pairs, "pairs");
        return pairs.length > 0 ? v(pairs, new LinkedHashMap(P.e(pairs.length))) : i();
    }

    public static Map m(C4034q... pairs) {
        AbstractC4862t.e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(P.e(pairs.length));
        r(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map n(Map map) {
        AbstractC4862t.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : P.g(map) : i();
    }

    public static Map o(Map map, C4034q pair) {
        AbstractC4862t.e(map, "<this>");
        AbstractC4862t.e(pair, "pair");
        if (map.isEmpty()) {
            return P.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.e(), pair.f());
        return linkedHashMap;
    }

    public static Map p(Map map, Map map2) {
        AbstractC4862t.e(map, "<this>");
        AbstractC4862t.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void q(Map map, Iterable pairs) {
        AbstractC4862t.e(map, "<this>");
        AbstractC4862t.e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C4034q c4034q = (C4034q) it.next();
            map.put(c4034q.a(), c4034q.b());
        }
    }

    public static final void r(Map map, C4034q[] pairs) {
        AbstractC4862t.e(map, "<this>");
        AbstractC4862t.e(pairs, "pairs");
        for (C4034q c4034q : pairs) {
            map.put(c4034q.a(), c4034q.b());
        }
    }

    public static Map s(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return n(t(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i();
        }
        if (size != 1) {
            return t(iterable, new LinkedHashMap(P.e(collection.size())));
        }
        return P.f((C4034q) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map t(Iterable iterable, Map destination) {
        AbstractC4862t.e(iterable, "<this>");
        AbstractC4862t.e(destination, "destination");
        q(destination, iterable);
        return destination;
    }

    public static Map u(Map map) {
        AbstractC4862t.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? w(map) : P.g(map) : i();
    }

    public static final Map v(C4034q[] c4034qArr, Map destination) {
        AbstractC4862t.e(c4034qArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        r(destination, c4034qArr);
        return destination;
    }

    public static Map w(Map map) {
        AbstractC4862t.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
