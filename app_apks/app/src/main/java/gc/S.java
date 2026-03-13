package gc;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class S extends AbstractC4195h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35587a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements ListIterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ListIterator f35588a;

        public a(int i10) {
            this.f35588a = S.this.f35587a.listIterator(z.U(S.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f35588a.add(obj);
            this.f35588a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f35588a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f35588a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f35588a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return z.T(S.this, this.f35588a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f35588a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return z.T(S.this, this.f35588a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f35588a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f35588a.set(obj);
        }
    }

    public S(List delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f35587a = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f35587a.add(z.U(this, i10), obj);
    }

    @Override // gc.AbstractC4195h
    public int c() {
        return this.f35587a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f35587a.clear();
    }

    @Override // gc.AbstractC4195h
    public Object d(int i10) {
        return this.f35587a.remove(z.S(this, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f35587a.get(z.S(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f35587a.set(z.S(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
