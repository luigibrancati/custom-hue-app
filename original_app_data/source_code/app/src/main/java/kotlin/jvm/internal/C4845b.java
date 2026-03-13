package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4845b implements Iterator, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f39784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39785b;

    public C4845b(Object[] array) {
        AbstractC4862t.e(array, "array");
        this.f39784a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f39785b < this.f39784a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f39784a;
            int i10 = this.f39785b;
            this.f39785b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f39785b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
