package K7;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: K7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1061a extends Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7631b;

    public AbstractC1061a(int i10, int i11) {
        J7.n.l(i11, i10);
        this.f7630a = i10;
        this.f7631b = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7631b < this.f7630a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7631b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f7631b;
        this.f7631b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7631b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f7631b - 1;
        this.f7631b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7631b - 1;
    }
}
