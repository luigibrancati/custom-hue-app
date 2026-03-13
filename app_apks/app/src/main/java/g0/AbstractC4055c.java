package g0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import wc.InterfaceC6184a;

/* JADX INFO: renamed from: g0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4055c implements Iterator, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4063k[] f34793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34795c = true;

    public AbstractC4055c(C4062j c4062j, AbstractC4063k[] abstractC4063kArr) {
        this.f34793a = abstractC4063kArr;
        abstractC4063kArr[0].g(c4062j.h(), c4062j.e() * 2);
        this.f34794b = 0;
        b();
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void b() {
        if (this.f34793a[this.f34794b].d()) {
            return;
        }
        for (int i10 = this.f34794b; -1 < i10; i10--) {
            int iC = c(i10);
            if (iC == -1 && this.f34793a[i10].e()) {
                this.f34793a[i10].f();
                iC = c(i10);
            }
            if (iC != -1) {
                this.f34794b = iC;
                return;
            }
            if (i10 > 0) {
                this.f34793a[i10 - 1].f();
            }
            this.f34793a[i10].g(C4062j.f34799e.a().h(), 0);
        }
        this.f34795c = false;
    }

    public final int c(int i10) {
        if (this.f34793a[i10].d()) {
            return i10;
        }
        if (!this.f34793a[i10].e()) {
            return -1;
        }
        C4062j c4062jA = this.f34793a[i10].a();
        if (i10 == 6) {
            this.f34793a[i10 + 1].g(c4062jA.h(), c4062jA.h().length);
        } else {
            this.f34793a[i10 + 1].g(c4062jA.h(), c4062jA.e() * 2);
        }
        return c(i10 + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f34795c;
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object next = this.f34793a[this.f34794b].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
