package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class E extends LinkedHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f22725b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22726a;

    static {
        E e10 = new E();
        f22725b = e10;
        e10.p();
    }

    public E() {
        this.f22726a = true;
    }

    public static int a(Map map) {
        int iE = 0;
        for (Map.Entry entry : map.entrySet()) {
            iE += e(entry.getValue()) ^ e(entry.getKey());
        }
        return iE;
    }

    public static int e(Object obj) {
        return obj instanceof byte[] ? AbstractC2714u.d((byte[]) obj) : obj.hashCode();
    }

    public static void g(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC2714u.a(obj);
            AbstractC2714u.a(map.get(obj));
        }
    }

    public static E i() {
        return f22725b;
    }

    public static boolean m(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean n(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && n(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public final void j() {
        if (!o()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean o() {
        return this.f22726a;
    }

    public void p() {
        this.f22726a = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        j();
        AbstractC2714u.a(obj);
        AbstractC2714u.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        j();
        g(map);
        super.putAll(map);
    }

    public void q(E e10) {
        j();
        if (e10.isEmpty()) {
            return;
        }
        putAll(e10);
    }

    public E r() {
        return isEmpty() ? new E() : new E(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        j();
        return super.remove(obj);
    }

    public E(Map map) {
        super(map);
        this.f22726a = true;
    }
}
