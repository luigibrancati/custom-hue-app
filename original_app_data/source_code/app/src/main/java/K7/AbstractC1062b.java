package K7;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: K7.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1062b extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f7632a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f7633b;

    /* JADX INFO: renamed from: K7.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object a();

    public final Object b() {
        this.f7632a = a.DONE;
        return null;
    }

    public final boolean c() {
        this.f7632a = a.FAILED;
        this.f7633b = a();
        if (this.f7632a == a.DONE) {
            return false;
        }
        this.f7632a = a.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        J7.n.o(this.f7632a != a.FAILED);
        int iOrdinal = this.f7632a.ordinal();
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
        this.f7632a = a.NOT_READY;
        Object objA = K.a(this.f7633b);
        this.f7633b = null;
        return objA;
    }
}
