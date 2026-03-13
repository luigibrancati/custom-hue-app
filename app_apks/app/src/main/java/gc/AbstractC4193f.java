package gc;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: gc.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4193f implements Map, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35601a = new a(null);

    /* JADX INFO: renamed from: gc.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public static final CharSequence k(AbstractC4193f abstractC4193f, Map.Entry it) {
        AbstractC4862t.e(it, "it");
        return abstractC4193f.i(it);
    }

    public final boolean c(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        AbstractC4862t.c(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!AbstractC4862t.a(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        AbstractC4862t.c(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet != null && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC4862t.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    public abstract Set e();

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set setEntrySet = map.entrySet();
        if (setEntrySet != null && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!c((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int f();

    public abstract Collection g();

    public final String h(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public final String i(Map.Entry entry) {
        return h(entry.getKey()) + '=' + h(entry.getValue());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return f();
    }

    public String toString() {
        return C4179C.q0(entrySet(), ", ", "{", "}", 0, null, new vc.l() { // from class: gc.e
            @Override // vc.l
            public final Object invoke(Object obj) {
                return AbstractC4193f.k(this.f35600a, (Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return g();
    }
}
