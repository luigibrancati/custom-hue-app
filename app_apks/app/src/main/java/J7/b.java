package J7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f6282a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6283b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object a();

    public final Object b() {
        this.f6282a = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f6282a = a.FAILED;
        this.f6283b = a();
        if (this.f6282a == a.DONE) {
            return false;
        }
        this.f6282a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        n.o(this.f6282a != a.FAILED);
        int iOrdinal = this.f6282a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6282a = a.NOT_READY;
        Object objA = i.a(this.f6283b);
        this.f6283b = null;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
