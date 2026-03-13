package fc;

import gc.C4204q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: fc.F, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4013F implements Collection, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short[] f34251a;

    /* JADX INFO: renamed from: fc.F$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short[] f34252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34253b;

        public a(short[] array) {
            AbstractC4862t.e(array, "array");
            this.f34252a = array;
        }

        public short a() {
            int i10 = this.f34253b;
            short[] sArr = this.f34252a;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f34253b));
            }
            this.f34253b = i10 + 1;
            return C4012E.b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34253b < this.f34252a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4012E.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4013F(short[] sArr) {
        this.f34251a = sArr;
    }

    public static final /* synthetic */ C4013F c(short[] sArr) {
        return new C4013F(sArr);
    }

    public static short[] d(int i10) {
        return e(new short[i10]);
    }

    public static short[] e(short[] storage) {
        AbstractC4862t.e(storage, "storage");
        return storage;
    }

    public static boolean h(short[] sArr, short s10) {
        return C4204q.Q(sArr, s10);
    }

    public static boolean k(short[] sArr, Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!(obj instanceof C4012E) || !C4204q.Q(sArr, ((C4012E) obj).u())) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(short[] sArr, Object obj) {
        return (obj instanceof C4013F) && AbstractC4862t.a(sArr, ((C4013F) obj).y());
    }

    public static final short n(short[] sArr, int i10) {
        return C4012E.b(sArr[i10]);
    }

    public static int r(short[] sArr) {
        return sArr.length;
    }

    public static int s(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean t(short[] sArr) {
        return sArr.length == 0;
    }

    public static Iterator v(short[] sArr) {
        return new a(sArr);
    }

    public static final void w(short[] sArr, int i10, short s10) {
        sArr[i10] = s10;
    }

    public static String x(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C4012E) {
            return f(((C4012E) obj).u());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        return k(this.f34251a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f34251a, obj);
    }

    public boolean f(short s10) {
        return h(this.f34251a, s10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return s(this.f34251a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return t(this.f34251a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f34251a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f34251a);
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
    public Object[] toArray() {
        return AbstractC4853j.a(this);
    }

    public String toString() {
        return x(this.f34251a);
    }

    public final /* synthetic */ short[] y() {
        return this.f34251a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        return AbstractC4853j.b(this, array);
    }
}
