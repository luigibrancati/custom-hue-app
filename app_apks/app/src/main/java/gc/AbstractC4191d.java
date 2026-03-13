package gc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: gc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4191d extends AbstractC4189b implements List, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35593a = new a(null);

    /* JADX INFO: renamed from: gc.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }

        public final boolean f(Collection c10, Collection other) {
            AbstractC4862t.e(c10, "c");
            AbstractC4862t.e(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!AbstractC4862t.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c10) {
            AbstractC4862t.e(c10, "c");
            Iterator it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: gc.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35594a;

        public b() {
        }

        public final int a() {
            return this.f35594a;
        }

        public final void b(int i10) {
            this.f35594a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35594a < AbstractC4191d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC4191d abstractC4191d = AbstractC4191d.this;
            int i10 = this.f35594a;
            this.f35594a = i10 + 1;
            return abstractC4191d.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: gc.d$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c extends b implements ListIterator, InterfaceC6184a {
        public c(int i10) {
            super();
            AbstractC4191d.f35593a.c(i10, AbstractC4191d.this.size());
            b(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC4191d abstractC4191d = AbstractC4191d.this;
            b(a() - 1);
            return abstractC4191d.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: gc.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0465d extends AbstractC4191d implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC4191d f35597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35599d;

        public C0465d(AbstractC4191d list, int i10, int i11) {
            AbstractC4862t.e(list, "list");
            this.f35597b = list;
            this.f35598c = i10;
            AbstractC4191d.f35593a.d(i10, i11, list.size());
            this.f35599d = i11 - i10;
        }

        @Override // gc.AbstractC4189b
        public int d() {
            return this.f35599d;
        }

        @Override // gc.AbstractC4191d, java.util.List
        public Object get(int i10) {
            AbstractC4191d.f35593a.b(i10, this.f35599d);
            return this.f35597b.get(this.f35598c + i10);
        }

        @Override // gc.AbstractC4191d, java.util.List
        public List subList(int i10, int i11) {
            AbstractC4191d.f35593a.d(i10, i11, this.f35599d);
            AbstractC4191d abstractC4191d = this.f35597b;
            int i12 = this.f35598c;
            return new C0465d(abstractC4191d, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f35593a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f35593a.g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (AbstractC4862t.a(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC4862t.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new C0465d(this, i10, i11);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new c(i10);
    }
}
