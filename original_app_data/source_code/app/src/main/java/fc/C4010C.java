package fc;

import gc.C4204q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: fc.C, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4010C implements Collection, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f34245a;

    /* JADX INFO: renamed from: fc.C$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f34246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34247b;

        public a(long[] array) {
            AbstractC4862t.e(array, "array");
            this.f34246a = array;
        }

        public long a() {
            int i10 = this.f34247b;
            long[] jArr = this.f34246a;
            if (i10 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f34247b));
            }
            this.f34247b = i10 + 1;
            return C4009B.b(jArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34247b < this.f34246a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4009B.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4010C(long[] jArr) {
        this.f34245a = jArr;
    }

    public static final /* synthetic */ C4010C c(long[] jArr) {
        return new C4010C(jArr);
    }

    public static long[] d(int i10) {
        return e(new long[i10]);
    }

    public static long[] e(long[] storage) {
        AbstractC4862t.e(storage, "storage");
        return storage;
    }

    public static boolean h(long[] jArr, long j10) {
        return C4204q.O(jArr, j10);
    }

    public static boolean k(long[] jArr, Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!(obj instanceof C4009B) || !C4204q.O(jArr, ((C4009B) obj).s())) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(long[] jArr, Object obj) {
        return (obj instanceof C4010C) && AbstractC4862t.a(jArr, ((C4010C) obj).y());
    }

    public static final long n(long[] jArr, int i10) {
        return C4009B.b(jArr[i10]);
    }

    public static int r(long[] jArr) {
        return jArr.length;
    }

    public static int s(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static boolean t(long[] jArr) {
        return jArr.length == 0;
    }

    public static Iterator v(long[] jArr) {
        return new a(jArr);
    }

    public static final void w(long[] jArr, int i10, long j10) {
        jArr[i10] = j10;
    }

    public static String x(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
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
        if (obj instanceof C4009B) {
            return f(((C4009B) obj).s());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        return k(this.f34245a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f34245a, obj);
    }

    public boolean f(long j10) {
        return h(this.f34245a, j10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return s(this.f34245a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return t(this.f34245a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f34245a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f34245a);
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
        return x(this.f34245a);
    }

    public final /* synthetic */ long[] y() {
        return this.f34245a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        return AbstractC4853j.b(this, array);
    }
}
