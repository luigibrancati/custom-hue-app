package N6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class O extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f9975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f9976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Collection f9977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S f9978e;

    public O(S s10, Object obj, Collection collection, O o10) {
        this.f9978e = s10;
        this.f9974a = obj;
        this.f9975b = collection;
        this.f9976c = o10;
        this.f9977d = o10 == null ? null : o10.f9975b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.f9975b.isEmpty();
        boolean zAdd = this.f9975b.add(obj);
        if (zAdd) {
            this.f9978e.f10033e++;
            if (zIsEmpty) {
                c();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f9975b.addAll(collection);
        if (zAddAll) {
            int size2 = this.f9975b.size();
            this.f9978e.f10033e += size2 - size;
            if (size == 0) {
                c();
                return true;
            }
        }
        return zAddAll;
    }

    public final void c() {
        O o10 = this.f9976c;
        if (o10 != null) {
            o10.c();
            return;
        }
        S s10 = this.f9978e;
        s10.f10032d.put(this.f9974a, this.f9975b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f9975b.clear();
        this.f9978e.f10033e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f9975b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f9975b.containsAll(collection);
    }

    public final void d() {
        O o10 = this.f9976c;
        if (o10 != null) {
            o10.d();
        } else if (this.f9975b.isEmpty()) {
            S s10 = this.f9978e;
            s10.f10032d.remove(this.f9974a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f9975b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f9975b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new N(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.f9975b.remove(obj);
        if (zRemove) {
            S s10 = this.f9978e;
            s10.f10033e--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f9975b.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f9975b.size();
            this.f9978e.f10033e += size2 - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f9975b.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f9975b.size();
            this.f9978e.f10033e += size2 - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f9975b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f9975b.toString();
    }

    public final void zzb() {
        O o10 = this.f9976c;
        if (o10 != null) {
            o10.zzb();
            O o11 = this.f9976c;
            if (o11.f9975b != this.f9977d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.f9975b.isEmpty()) {
            S s10 = this.f9978e;
            Collection collection = (Collection) s10.f10032d.get(this.f9974a);
            if (collection != null) {
                this.f9975b = collection;
            }
        }
    }
}
