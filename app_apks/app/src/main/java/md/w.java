package md;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class w extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f40390a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements ListIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ListIterator f40391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f40392b;

        public a(int i10) {
            this.f40392b = i10;
            this.f40391a = w.this.f40390a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f40391a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f40391a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f40391a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f40391a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f40391a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f40391a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator f40394a;

        public b() {
            this.f40394a = w.this.f40390a.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f40394a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40394a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public w(n nVar) {
        this.f40390a = nVar;
    }

    @Override // md.n
    public void G(AbstractC5050d abstractC5050d) {
        throw new UnsupportedOperationException();
    }

    @Override // md.n
    public AbstractC5050d a0(int i10) {
        return this.f40390a.a0(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f40390a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // md.n
    public List o() {
        return this.f40390a.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f40390a.size();
    }

    @Override // md.n
    public n u() {
        return this;
    }
}
