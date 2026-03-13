package k1;

import gc.C4179C;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4778a {
    public static final Set a(Set set) {
        AbstractC4862t.e(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(C4179C.Z0(set));
        AbstractC4862t.d(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public static final Map b(Map map) {
        AbstractC4862t.e(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        AbstractC4862t.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }
}
