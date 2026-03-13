package b0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class v implements Map, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2775F f24956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2784h f24957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f24958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public M f24959d;

    public v(AbstractC2775F parent) {
        AbstractC4862t.e(parent, "parent");
        this.f24956a = parent;
    }

    public Set a() {
        C2784h c2784h = this.f24957b;
        if (c2784h != null) {
            return c2784h;
        }
        C2784h c2784h2 = new C2784h(this.f24956a);
        this.f24957b = c2784h2;
        return c2784h2;
    }

    public Set b() {
        n nVar = this.f24958c;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this.f24956a);
        this.f24958c = nVar2;
        return nVar2;
    }

    public int c() {
        return this.f24956a.f24842e;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f24956a.b(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f24956a.c(obj);
    }

    public Collection d() {
        M m10 = this.f24959d;
        if (m10 != null) {
            return m10;
        }
        M m11 = new M(this.f24956a);
        this.f24959d = m11;
        return m11;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC4862t.a(this.f24956a, ((v) obj).f24956a);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f24956a.d(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f24956a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f24956a.g();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    public String toString() {
        return this.f24956a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
