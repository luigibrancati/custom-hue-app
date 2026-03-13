package hc;

import gc.AbstractC4191d;
import gc.AbstractC4195h;
import gc.C4202o;
import gc.C4205s;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;
import wc.InterfaceC6185b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC4195h implements List, RandomAccess, Serializable, InterfaceC6185b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0473b f36471d = new C0473b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f36472e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f36473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36475c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4195h implements List, RandomAccess, Serializable, InterfaceC6185b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f36476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f36479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f36480e;

        /* JADX INFO: renamed from: hc.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0472a implements ListIterator, InterfaceC6184a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f36481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f36482b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f36483c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f36484d;

            public C0472a(a list, int i10) {
                AbstractC4862t.e(list, "list");
                this.f36481a = list;
                this.f36482b = i10;
                this.f36483c = -1;
                this.f36484d = ((AbstractList) list).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f36481a.f36480e).modCount != this.f36484d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                a();
                a aVar = this.f36481a;
                int i10 = this.f36482b;
                this.f36482b = i10 + 1;
                aVar.add(i10, obj);
                this.f36483c = -1;
                this.f36484d = ((AbstractList) this.f36481a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f36482b < this.f36481a.f36478c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f36482b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                a();
                if (this.f36482b >= this.f36481a.f36478c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f36482b;
                this.f36482b = i10 + 1;
                this.f36483c = i10;
                return this.f36481a.f36476a[this.f36481a.f36477b + this.f36483c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f36482b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                a();
                int i10 = this.f36482b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f36482b = i11;
                this.f36483c = i11;
                return this.f36481a.f36476a[this.f36481a.f36477b + this.f36483c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f36482b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                a();
                int i10 = this.f36483c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f36481a.d(i10);
                this.f36482b = this.f36483c;
                this.f36483c = -1;
                this.f36484d = ((AbstractList) this.f36481a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                a();
                int i10 = this.f36483c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f36481a.set(i10, obj);
            }
        }

        public a(Object[] backing, int i10, int i11, a aVar, b root) {
            AbstractC4862t.e(backing, "backing");
            AbstractC4862t.e(root, "root");
            this.f36476a = backing;
            this.f36477b = i10;
            this.f36478c = i11;
            this.f36479d = aVar;
            this.f36480e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void r() {
            if (((AbstractList) this.f36480e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void w() {
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            s();
            r();
            p(this.f36477b + this.f36478c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            AbstractC4862t.e(elements, "elements");
            s();
            r();
            int size = elements.size();
            n(this.f36477b + this.f36478c, elements, size);
            return size > 0;
        }

        @Override // gc.AbstractC4195h
        public int c() {
            r();
            return this.f36478c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            s();
            r();
            y(this.f36477b, this.f36478c);
        }

        @Override // gc.AbstractC4195h
        public Object d(int i10) {
            s();
            r();
            AbstractC4191d.f35593a.b(i10, this.f36478c);
            return x(this.f36477b + i10);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            r();
            if (obj != this) {
                return (obj instanceof List) && t((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            r();
            AbstractC4191d.f35593a.b(i10, this.f36478c);
            return this.f36476a[this.f36477b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            r();
            return hc.c.i(this.f36476a, this.f36477b, this.f36478c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            r();
            for (int i10 = 0; i10 < this.f36478c; i10++) {
                if (AbstractC4862t.a(this.f36476a[this.f36477b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            r();
            return this.f36478c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            r();
            for (int i10 = this.f36478c - 1; i10 >= 0; i10--) {
                if (AbstractC4862t.a(this.f36476a[this.f36477b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        public final void n(int i10, Collection collection, int i11) {
            w();
            a aVar = this.f36479d;
            if (aVar != null) {
                aVar.n(i10, collection, i11);
            } else {
                this.f36480e.t(i10, collection, i11);
            }
            this.f36476a = this.f36480e.f36473a;
            this.f36478c += i11;
        }

        public final void p(int i10, Object obj) {
            w();
            a aVar = this.f36479d;
            if (aVar != null) {
                aVar.p(i10, obj);
            } else {
                this.f36480e.v(i10, obj);
            }
            this.f36476a = this.f36480e.f36473a;
            this.f36478c++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            s();
            r();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                d(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            AbstractC4862t.e(elements, "elements");
            s();
            r();
            return z(this.f36477b, this.f36478c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            AbstractC4862t.e(elements, "elements");
            s();
            r();
            return z(this.f36477b, this.f36478c, elements, true) > 0;
        }

        public final void s() {
            if (v()) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            s();
            r();
            AbstractC4191d.f35593a.b(i10, this.f36478c);
            Object[] objArr = this.f36476a;
            int i11 = this.f36477b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            AbstractC4191d.f35593a.d(i10, i11, this.f36478c);
            return new a(this.f36476a, this.f36477b + i10, i11 - i10, this, this.f36480e);
        }

        public final boolean t(List list) {
            return hc.c.h(this.f36476a, this.f36477b, this.f36478c, list);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            AbstractC4862t.e(array, "array");
            r();
            int length = array.length;
            int i10 = this.f36478c;
            if (length >= i10) {
                Object[] objArr = this.f36476a;
                int i11 = this.f36477b;
                C4202o.m(objArr, array, 0, i11, i10 + i11);
                return C4205s.e(this.f36478c, array);
            }
            Object[] objArr2 = this.f36476a;
            int i12 = this.f36477b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i12, i10 + i12, array.getClass());
            AbstractC4862t.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            r();
            return hc.c.j(this.f36476a, this.f36477b, this.f36478c, this);
        }

        public final boolean v() {
            return this.f36480e.f36475c;
        }

        public final Object x(int i10) {
            w();
            a aVar = this.f36479d;
            this.f36478c--;
            return aVar != null ? aVar.x(i10) : this.f36480e.I(i10);
        }

        public final void y(int i10, int i11) {
            if (i11 > 0) {
                w();
            }
            a aVar = this.f36479d;
            if (aVar != null) {
                aVar.y(i10, i11);
            } else {
                this.f36480e.J(i10, i11);
            }
            this.f36478c -= i11;
        }

        public final int z(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f36479d;
            int iZ = aVar != null ? aVar.z(i10, i11, collection, z10) : this.f36480e.L(i10, i11, collection, z10);
            if (iZ > 0) {
                w();
            }
            this.f36478c -= iZ;
            return iZ;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            r();
            AbstractC4191d.f35593a.c(i10, this.f36478c);
            return new C0472a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            s();
            r();
            AbstractC4191d.f35593a.c(i10, this.f36478c);
            p(this.f36477b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection elements) {
            AbstractC4862t.e(elements, "elements");
            s();
            r();
            AbstractC4191d.f35593a.c(i10, this.f36478c);
            int size = elements.size();
            n(this.f36477b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            r();
            Object[] objArr = this.f36476a;
            int i10 = this.f36477b;
            return C4202o.u(objArr, i10, this.f36478c + i10);
        }
    }

    /* JADX INFO: renamed from: hc.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0473b {
        public /* synthetic */ C0473b(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0473b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements ListIterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f36485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f36486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f36487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f36488d;

        public c(b list, int i10) {
            AbstractC4862t.e(list, "list");
            this.f36485a = list;
            this.f36486b = i10;
            this.f36487c = -1;
            this.f36488d = ((AbstractList) list).modCount;
        }

        private final void a() {
            if (((AbstractList) this.f36485a).modCount != this.f36488d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            a();
            b bVar = this.f36485a;
            int i10 = this.f36486b;
            this.f36486b = i10 + 1;
            bVar.add(i10, obj);
            this.f36487c = -1;
            this.f36488d = ((AbstractList) this.f36485a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f36486b < this.f36485a.f36474b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f36486b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            a();
            if (this.f36486b >= this.f36485a.f36474b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f36486b;
            this.f36486b = i10 + 1;
            this.f36487c = i10;
            return this.f36485a.f36473a[this.f36487c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f36486b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            a();
            int i10 = this.f36486b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f36486b = i11;
            this.f36487c = i11;
            return this.f36485a.f36473a[this.f36487c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f36486b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            a();
            int i10 = this.f36487c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f36485a.d(i10);
            this.f36486b = this.f36487c;
            this.f36487c = -1;
            this.f36488d = ((AbstractList) this.f36485a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            a();
            int i10 = this.f36487c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f36485a.set(i10, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f36475c = true;
        f36472e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    private final void E() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(int i10) {
        E();
        Object[] objArr = this.f36473a;
        Object obj = objArr[i10];
        C4202o.m(objArr, objArr, i10, i10 + 1, this.f36474b);
        hc.c.f(this.f36473a, this.f36474b - 1);
        this.f36474b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(int i10, int i11) {
        if (i11 > 0) {
            E();
        }
        Object[] objArr = this.f36473a;
        C4202o.m(objArr, objArr, i10, i10 + i11, this.f36474b);
        Object[] objArr2 = this.f36473a;
        int i12 = this.f36474b;
        hc.c.g(objArr2, i12 - i11, i12);
        this.f36474b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f36473a[i14]) == z10) {
                Object[] objArr = this.f36473a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f36473a;
        C4202o.m(objArr2, objArr2, i10 + i13, i11 + i10, this.f36474b);
        Object[] objArr3 = this.f36473a;
        int i16 = this.f36474b;
        hc.c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            E();
        }
        this.f36474b -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int i10, Collection collection, int i11) {
        E();
        B(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f36473a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i10, Object obj) {
        E();
        B(i10, 1);
        this.f36473a[i10] = obj;
    }

    private final void x() {
        if (this.f36475c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean y(List list) {
        return hc.c.h(this.f36473a, 0, this.f36474b, list);
    }

    public final void A(int i10) {
        z(this.f36474b + i10);
    }

    public final void B(int i10, int i11) {
        A(i11);
        Object[] objArr = this.f36473a;
        C4202o.m(objArr, objArr, i10 + i11, i10, this.f36474b);
        this.f36474b += i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        x();
        v(this.f36474b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        x();
        int size = elements.size();
        t(this.f36474b, elements, size);
        return size > 0;
    }

    @Override // gc.AbstractC4195h
    public int c() {
        return this.f36474b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        x();
        J(0, this.f36474b);
    }

    @Override // gc.AbstractC4195h
    public Object d(int i10) {
        x();
        AbstractC4191d.f35593a.b(i10, this.f36474b);
        return I(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && y((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        AbstractC4191d.f35593a.b(i10, this.f36474b);
        return this.f36473a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return hc.c.i(this.f36473a, 0, this.f36474b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f36474b; i10++) {
            if (AbstractC4862t.a(this.f36473a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f36474b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f36474b - 1; i10 >= 0; i10--) {
            if (AbstractC4862t.a(this.f36473a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        x();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        x();
        return L(0, this.f36474b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        x();
        return L(0, this.f36474b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        x();
        AbstractC4191d.f35593a.b(i10, this.f36474b);
        Object[] objArr = this.f36473a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        AbstractC4191d.f35593a.d(i10, i11, this.f36474b);
        return new a(this.f36473a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        int length = array.length;
        int i10 = this.f36474b;
        if (length >= i10) {
            C4202o.m(this.f36473a, array, 0, 0, i10);
            return C4205s.e(this.f36474b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f36473a, 0, i10, array.getClass());
        AbstractC4862t.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return hc.c.j(this.f36473a, 0, this.f36474b, this);
    }

    public final List w() {
        x();
        this.f36475c = true;
        return this.f36474b > 0 ? this : f36472e;
    }

    public final void z(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f36473a;
        if (i10 > objArr.length) {
            this.f36473a = hc.c.e(this.f36473a, AbstractC4191d.f35593a.e(objArr.length, i10));
        }
    }

    public b(int i10) {
        this.f36473a = hc.c.d(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        AbstractC4191d.f35593a.c(i10, this.f36474b);
        return new c(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        x();
        AbstractC4191d.f35593a.c(i10, this.f36474b);
        v(i10, obj);
    }

    public /* synthetic */ b(int i10, int i11, AbstractC4854k abstractC4854k) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection elements) {
        AbstractC4862t.e(elements, "elements");
        x();
        AbstractC4191d.f35593a.c(i10, this.f36474b);
        int size = elements.size();
        t(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return C4202o.u(this.f36473a, 0, this.f36474b);
    }
}
