package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map.Entry f9790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f9791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L f9792c;

    public K(L l10, Iterator it) {
        this.f9791b = it;
        this.f9792c = l10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9791b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f9791b.next();
        this.f9790a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1564z.f(this.f9790a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f9790a.getValue();
        this.f9791b.remove();
        this.f9792c.f9802b.f10033e -= collection.size();
        collection.clear();
        this.f9790a = null;
    }
}
