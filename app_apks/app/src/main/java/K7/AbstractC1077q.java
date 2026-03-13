package K7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: K7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1077q extends r implements Map {
    public abstract Map b();

    public boolean c(Object obj) {
        return F.b(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        b().clear();
    }

    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    public boolean d(Object obj) {
        return F.c(this, obj);
    }

    public int e() {
        return U.d(entrySet());
    }

    public Set entrySet() {
        return b().entrySet();
    }

    public Object get(Object obj) {
        return b().get(obj);
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    public Set keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return b().remove(obj);
    }

    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return b().values();
    }
}
