package L;

import L.InterfaceC1099g0;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class R0 implements InterfaceC1099g0 {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final Comparator f7932Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final R0 f7933R;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final TreeMap f7934P;

    static {
        Comparator comparator = new Comparator() { // from class: L.Q0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((InterfaceC1099g0.a) obj).c().compareTo(((InterfaceC1099g0.a) obj2).c());
            }
        };
        f7932Q = comparator;
        f7933R = new R0(new TreeMap(comparator));
    }

    public R0(TreeMap treeMap) {
        this.f7934P = treeMap;
    }

    public static R0 e0() {
        return f7933R;
    }

    public static R0 f0(InterfaceC1099g0 interfaceC1099g0) {
        if (R0.class.equals(interfaceC1099g0.getClass())) {
            return (R0) interfaceC1099g0;
        }
        TreeMap treeMap = new TreeMap(f7932Q);
        for (InterfaceC1099g0.a aVar : interfaceC1099g0.b()) {
            Set<InterfaceC1099g0.c> setH = interfaceC1099g0.h(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (InterfaceC1099g0.c cVar : setH) {
                arrayMap.put(cVar, interfaceC1099g0.g(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new R0(treeMap);
    }

    @Override // L.InterfaceC1099g0
    public Object a(InterfaceC1099g0.a aVar) {
        Map map = (Map) this.f7934P.get(aVar);
        if (map != null) {
            return map.get((InterfaceC1099g0.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // L.InterfaceC1099g0
    public Set b() {
        return Collections.unmodifiableSet(this.f7934P.keySet());
    }

    @Override // L.InterfaceC1099g0
    public Object c(InterfaceC1099g0.a aVar, Object obj) {
        Map map = (Map) this.f7934P.get(aVar);
        return map == null ? obj : map.get((InterfaceC1099g0.c) Collections.min(map.keySet()));
    }

    @Override // L.InterfaceC1099g0
    public boolean d(InterfaceC1099g0.a aVar) {
        return this.f7934P.containsKey(aVar);
    }

    @Override // L.InterfaceC1099g0
    public void e(String str, InterfaceC1099g0.b bVar) {
        for (Map.Entry entry : this.f7934P.tailMap(InterfaceC1099g0.a.a(str, Void.class)).entrySet()) {
            if (!((InterfaceC1099g0.a) entry.getKey()).c().startsWith(str) || !bVar.a((InterfaceC1099g0.a) entry.getKey())) {
                return;
            }
        }
    }

    @Override // L.InterfaceC1099g0
    public InterfaceC1099g0.c f(InterfaceC1099g0.a aVar) {
        Map map = (Map) this.f7934P.get(aVar);
        if (map != null) {
            return (InterfaceC1099g0.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // L.InterfaceC1099g0
    public Object g(InterfaceC1099g0.a aVar, InterfaceC1099g0.c cVar) {
        Map map = (Map) this.f7934P.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // L.InterfaceC1099g0
    public Set h(InterfaceC1099g0.a aVar) {
        Map map = (Map) this.f7934P.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }
}
