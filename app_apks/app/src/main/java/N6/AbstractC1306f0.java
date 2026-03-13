package N6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: N6.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1306f0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10241c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1358j0 f10242d;

    public /* synthetic */ AbstractC1306f0(C1358j0 c1358j0, AbstractC1293e0 abstractC1293e0) {
        this.f10242d = c1358j0;
        this.f10239a = c1358j0.f10334e;
        this.f10240b = c1358j0.h();
    }

    public abstract Object a(int i10);

    public final void b() {
        if (this.f10242d.f10334e != this.f10239a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10240b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f10240b;
        this.f10241c = i10;
        Object objA = a(i10);
        this.f10240b = this.f10242d.i(this.f10240b);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        AbstractC1564z.f(this.f10241c >= 0, "no calls to next() since the last call to remove()");
        this.f10239a += 32;
        int i10 = this.f10241c;
        C1358j0 c1358j0 = this.f10242d;
        c1358j0.remove(C1358j0.j(c1358j0, i10));
        this.f10240b--;
        this.f10241c = -1;
    }
}
