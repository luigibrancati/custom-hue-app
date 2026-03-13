package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Z1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f29829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public E0 f29830b;

    public /* synthetic */ Z1(G0 g02, Y1 y12) {
        if (!(g02 instanceof C3377b2)) {
            this.f29829a = null;
            this.f29830b = (E0) g02;
            return;
        }
        C3377b2 c3377b2 = (C3377b2) g02;
        ArrayDeque arrayDeque = new ArrayDeque(c3377b2.k());
        this.f29829a = arrayDeque;
        arrayDeque.push(c3377b2);
        this.f29830b = b(c3377b2.f29835d);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E0 next() {
        E0 e0B;
        E0 e02 = this.f29830b;
        if (e02 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f29829a;
            e0B = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            e0B = b(((C3377b2) this.f29829a.pop()).f29836e);
        } while (e0B.f() == 0);
        this.f29830b = e0B;
        return e02;
    }

    public final E0 b(G0 g02) {
        while (g02 instanceof C3377b2) {
            C3377b2 c3377b2 = (C3377b2) g02;
            this.f29829a.push(c3377b2);
            g02 = c3377b2.f29835d;
        }
        return (E0) g02;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29830b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
