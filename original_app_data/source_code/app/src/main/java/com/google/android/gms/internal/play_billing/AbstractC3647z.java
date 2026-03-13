package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3647z extends Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30273b;

    public AbstractC3647z(int i10, int i11) {
        AbstractC3629w.b(i11, i10, "index");
        this.f30272a = i10;
        this.f30273b = i11;
    }

    public abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f30273b < this.f30272a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30273b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f30273b;
        this.f30273b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30273b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f30273b - 1;
        this.f30273b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30273b - 1;
    }
}
