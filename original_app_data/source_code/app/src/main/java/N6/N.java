package N6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class N implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f9956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f9957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9958c;

    public N(O o10, Iterator it) {
        this.f9958c = o10;
        this.f9957b = o10.f9975b;
        this.f9956a = it;
    }

    public final void a() {
        this.f9958c.zzb();
        if (this.f9958c.f9975b != this.f9957b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f9956a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f9956a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9956a.remove();
        S s10 = this.f9958c.f9978e;
        s10.f10033e--;
        this.f9958c.d();
    }

    public N(O o10) {
        this.f9958c = o10;
        Collection collection = o10.f9975b;
        this.f9957b = collection;
        this.f9956a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
