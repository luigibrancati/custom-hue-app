package gc;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4846c;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: gc.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4198k implements Collection, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f35603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35604b;

    public C4198k(Object[] values, boolean z10) {
        AbstractC4862t.e(values, "values");
        this.f35603a = values;
        this.f35604b = z10;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f35603a.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C4204q.P(this.f35603a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f35603a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC4846c.a(this.f35603a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        return AbstractC4853j.b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C4205s.b(this.f35603a, this.f35604b);
    }
}
