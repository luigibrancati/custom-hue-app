package L;

import L.InterfaceC1099g0;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class M0 extends R0 implements L0 {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final InterfaceC1099g0.c f7912S = InterfaceC1099g0.c.OPTIONAL;

    public M0(TreeMap treeMap) {
        super(treeMap);
    }

    public static M0 g0() {
        return new M0(new TreeMap(R0.f7932Q));
    }

    public static M0 h0(InterfaceC1099g0 interfaceC1099g0) {
        TreeMap treeMap = new TreeMap(R0.f7932Q);
        for (InterfaceC1099g0.a aVar : interfaceC1099g0.b()) {
            Set<InterfaceC1099g0.c> setH = interfaceC1099g0.h(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC1099g0.c cVar : setH) {
                arrayMap.put(cVar, interfaceC1099g0.g(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new M0(treeMap);
    }

    @Override // L.L0
    public void H(InterfaceC1099g0.a aVar, Object obj) {
        Y(aVar, f7912S, obj);
    }

    @Override // L.L0
    public void Y(InterfaceC1099g0.a aVar, InterfaceC1099g0.c cVar, Object obj) {
        Map map = (Map) this.f7934P.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f7934P.put(aVar, arrayMap);
            arrayMap.put(cVar, obj);
            return;
        }
        InterfaceC1099g0.c cVar2 = (InterfaceC1099g0.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), obj) || !InterfaceC1099g0.M(cVar2, cVar)) {
            map.put(cVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + obj);
    }

    public Object i0(InterfaceC1099g0.a aVar) {
        return this.f7934P.remove(aVar);
    }
}
