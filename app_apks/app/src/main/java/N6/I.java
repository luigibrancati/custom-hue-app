package N6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends F0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Map f9761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f9762d;

    public I(S s10, Map map) {
        this.f9762d = s10;
        this.f9761c = map;
    }

    @Override // N6.F0
    public final Set a() {
        return new G(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection get(Object obj) {
        Collection collection = (Collection) G0.a(this.f9761c, obj);
        if (collection == null) {
            return null;
        }
        return this.f9762d.k(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        S s10 = this.f9762d;
        if (this.f9761c == s10.f10032d) {
            s10.r();
        } else {
            AbstractC1552y0.a(new H(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return G0.b(this.f9761c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f9761c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f9761c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f9762d.l();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f9761c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection collectionH = this.f9762d.h();
        collectionH.addAll(collection);
        this.f9762d.f10033e -= collection.size();
        collection.clear();
        return collectionH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9761c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f9761c.toString();
    }
}
