package N6;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class D extends U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9693b;

    public D(int i10, int i11) {
        AbstractC1564z.b(i11, i10, "index");
        this.f9692a = i10;
        this.f9693b = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f9693b < this.f9692a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f9693b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9693b;
        this.f9693b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f9693b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9693b - 1;
        this.f9693b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f9693b - 1;
    }
}
