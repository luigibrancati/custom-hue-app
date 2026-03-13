package We;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e extends h implements Collection {
    @Override // java.util.Collection
    public boolean add(Object obj) {
        return d().add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        return d().addAll(collection);
    }

    @Override // java.util.Collection
    public void clear() {
        d().clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return d().contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return d().containsAll(collection);
    }

    public abstract Collection d();

    public Object[] e() {
        return toArray(new Object[size()]);
    }

    public Object[] f(Object[] objArr) {
        return l.c(this, objArr);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return d().isEmpty();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        return d().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        return d().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        return d().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return d().size();
    }

    @Override // java.util.Collection
    public abstract Object[] toArray(Object[] objArr);
}
