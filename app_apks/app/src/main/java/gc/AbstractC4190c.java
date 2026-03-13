package gc;

import java.util.Iterator;
import java.util.NoSuchElementException;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: gc.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4190c implements Iterator, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f35592b;

    public abstract void a();

    public final void b() {
        this.f35591a = 2;
    }

    public final void c(Object obj) {
        this.f35592b = obj;
        this.f35591a = 1;
    }

    public final boolean d() {
        this.f35591a = 3;
        a();
        return this.f35591a == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f35591a;
        if (i10 == 0) {
            return d();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f35591a;
        if (i10 == 1) {
            this.f35591a = 0;
            return this.f35592b;
        }
        if (i10 == 2 || !d()) {
            throw new NoSuchElementException();
        }
        this.f35591a = 0;
        return this.f35592b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
