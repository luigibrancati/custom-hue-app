package fc;

import gc.C4204q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: fc.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4008A implements Collection, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f34240a;

    /* JADX INFO: renamed from: fc.A$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f34241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34242b;

        public a(int[] array) {
            AbstractC4862t.e(array, "array");
            this.f34241a = array;
        }

        public int a() {
            int i10 = this.f34242b;
            int[] iArr = this.f34241a;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f34242b));
            }
            this.f34242b = i10 + 1;
            return C4043z.b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34242b < this.f34241a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4043z.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4008A(int[] iArr) {
        this.f34240a = iArr;
    }

    public static final /* synthetic */ C4008A c(int[] iArr) {
        return new C4008A(iArr);
    }

    public static int[] d(int i10) {
        return e(new int[i10]);
    }

    public static int[] e(int[] storage) {
        AbstractC4862t.e(storage, "storage");
        return storage;
    }

    public static boolean h(int[] iArr, int i10) {
        return C4204q.N(iArr, i10);
    }

    public static boolean k(int[] iArr, Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!(obj instanceof C4043z) || !C4204q.N(iArr, ((C4043z) obj).s())) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(int[] iArr, Object obj) {
        return (obj instanceof C4008A) && AbstractC4862t.a(iArr, ((C4008A) obj).y());
    }

    public static final int n(int[] iArr, int i10) {
        return C4043z.b(iArr[i10]);
    }

    public static int r(int[] iArr) {
        return iArr.length;
    }

    public static int s(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static boolean t(int[] iArr) {
        return iArr.length == 0;
    }

    public static Iterator v(int[] iArr) {
        return new a(iArr);
    }

    public static final void w(int[] iArr, int i10, int i11) {
        iArr[i10] = i11;
    }

    public static String x(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
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
        if (obj instanceof C4043z) {
            return f(((C4043z) obj).s());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        return k(this.f34240a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f34240a, obj);
    }

    public boolean f(int i10) {
        return h(this.f34240a, i10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return s(this.f34240a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return t(this.f34240a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f34240a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f34240a);
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
        return x(this.f34240a);
    }

    public final /* synthetic */ int[] y() {
        return this.f34240a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        return AbstractC4853j.b(this, array);
    }
}
