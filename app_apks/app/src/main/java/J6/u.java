package J6;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6280b;

    public u(int i10, int i11) {
        r.c(i11, i10, "index");
        this.f6279a = i10;
        this.f6280b = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f6280b < this.f6279a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6280b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6280b;
        this.f6280b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6280b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6280b - 1;
        this.f6280b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6280b - 1;
    }
}
