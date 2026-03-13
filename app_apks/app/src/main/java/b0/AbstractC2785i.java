package b0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: b0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2785i implements Iterator, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24908c;

    public AbstractC2785i(int i10) {
        this.f24906a = i10;
    }

    public abstract Object a(int i10);

    public abstract void b(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24907b < this.f24906a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f24907b);
        this.f24907b++;
        this.f24908c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f24908c) {
            c0.d.b("Call next() before removing an element.");
        }
        int i10 = this.f24907b - 1;
        this.f24907b = i10;
        b(i10);
        this.f24906a--;
        this.f24908c = false;
    }
}
