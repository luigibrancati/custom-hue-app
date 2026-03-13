package We;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f extends h implements Map {
    @Override // java.util.Map
    public void clear() {
        d().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return d().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return d().containsValue(obj);
    }

    public abstract Map d();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || d().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return d().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return d().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return d().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return d().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        d().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return d().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return d().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return d().values();
    }
}
