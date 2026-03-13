package fc;

import gc.C4204q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4853j;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: fc.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4042y implements Collection, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f34290a;

    /* JADX INFO: renamed from: fc.y$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Iterator, InterfaceC6184a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f34291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34292b;

        public a(byte[] array) {
            AbstractC4862t.e(array, "array");
            this.f34291a = array;
        }

        public byte a() {
            int i10 = this.f34292b;
            byte[] bArr = this.f34291a;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f34292b));
            }
            this.f34292b = i10 + 1;
            return C4041x.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34292b < this.f34291a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C4041x.a(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C4042y(byte[] bArr) {
        this.f34290a = bArr;
    }

    public static final /* synthetic */ C4042y c(byte[] bArr) {
        return new C4042y(bArr);
    }

    public static byte[] d(int i10) {
        return e(new byte[i10]);
    }

    public static byte[] e(byte[] storage) {
        AbstractC4862t.e(storage, "storage");
        return storage;
    }

    public static boolean h(byte[] bArr, byte b10) {
        return C4204q.L(bArr, b10);
    }

    public static boolean k(byte[] bArr, Collection elements) {
        AbstractC4862t.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (!(obj instanceof C4041x) || !C4204q.L(bArr, ((C4041x) obj).s())) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(byte[] bArr, Object obj) {
        return (obj instanceof C4042y) && AbstractC4862t.a(bArr, ((C4042y) obj).y());
    }

    public static final byte n(byte[] bArr, int i10) {
        return C4041x.b(bArr[i10]);
    }

    public static int r(byte[] bArr) {
        return bArr.length;
    }

    public static int s(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean t(byte[] bArr) {
        return bArr.length == 0;
    }

    public static Iterator v(byte[] bArr) {
        return new a(bArr);
    }

    public static final void w(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    public static String x(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
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
        if (obj instanceof C4041x) {
            return f(((C4041x) obj).s());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC4862t.e(elements, "elements");
        return k(this.f34290a, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return l(this.f34290a, obj);
    }

    public boolean f(byte b10) {
        return h(this.f34290a, b10);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return s(this.f34290a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return t(this.f34290a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return v(this.f34290a);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int size() {
        return r(this.f34290a);
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
        return x(this.f34290a);
    }

    public final /* synthetic */ byte[] y() {
        return this.f34290a;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC4862t.e(array, "array");
        return AbstractC4853j.b(this, array);
    }
}
