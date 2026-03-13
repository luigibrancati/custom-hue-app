package N6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S extends V implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Map f10032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f10033e;

    public S(Map map) {
        AbstractC1564z.d(map.isEmpty());
        this.f10032d = map;
    }

    public static /* bridge */ /* synthetic */ void t(S s10, Object obj) {
        Object objRemove;
        try {
            objRemove = s10.f10032d.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            s10.f10033e -= size;
        }
    }

    @Override // N6.V
    public final Collection b() {
        return new U(this);
    }

    @Override // N6.V
    public final Iterator c() {
        return new F(this);
    }

    @Override // N6.V
    public final Map d() {
        return new I(this, this.f10032d);
    }

    @Override // N6.V
    public final Set e() {
        return new L(this, this.f10032d);
    }

    @Override // N6.H0
    public final int f() {
        return this.f10033e;
    }

    public abstract Collection h();

    public abstract Collection i();

    public abstract Collection j(Collection collection);

    public abstract Collection k(Object obj, Collection collection);

    public final Collection n(Object obj) {
        Collection collectionH = (Collection) this.f10032d.get(obj);
        if (collectionH == null) {
            collectionH = h();
        }
        return k(obj, collectionH);
    }

    public final Collection o(Object obj) {
        Collection collection = (Collection) this.f10032d.remove(obj);
        if (collection == null) {
            return i();
        }
        Collection collectionH = h();
        collectionH.addAll(collection);
        this.f10033e -= collection.size();
        collection.clear();
        return j(collectionH);
    }

    public final List p(Object obj, List list, O o10) {
        return list instanceof RandomAccess ? new M(this, obj, list, o10) : new Q(this, obj, list, o10);
    }

    @Override // N6.H0
    public final void r() {
        Iterator it = this.f10032d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f10032d.clear();
        this.f10033e = 0;
    }

    @Override // N6.H0
    public final boolean x(Object obj, Object obj2) {
        Collection collection = (Collection) this.f10032d.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f10033e++;
            return true;
        }
        Collection collectionH = h();
        if (!collectionH.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f10033e++;
        this.f10032d.put(obj, collectionH);
        return true;
    }
}
