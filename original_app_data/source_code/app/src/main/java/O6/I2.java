package O6;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class I2 extends AbstractC1649d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11321b;

    public I2(int i10, int i11) {
        G1.b(i11, i10, "index");
        this.f11320a = i10;
        this.f11321b = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11321b < this.f11320a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11321b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11321b;
        this.f11321b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11321b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11321b - 1;
        this.f11321b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11321b - 1;
    }
}
