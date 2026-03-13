package hc;

import gc.AbstractC4194g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6185b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC4194g implements Collection, InterfaceC6185b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f36513a;

    public g(d backing) {
        AbstractC4862t.e(backing, "backing");
        this.f36513a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // gc.AbstractC4194g
    public int c() {
        return this.f36513a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f36513a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f36513a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f36513a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f36513a.R();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f36513a.P(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        this.f36513a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        this.f36513a.m();
        return super.retainAll(elements);
    }
}
