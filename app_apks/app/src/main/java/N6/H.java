package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f9747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f9748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f9749c;

    public H(I i10) {
        this.f9749c = i10;
        this.f9747a = i10.f9761c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9747a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f9747a.next();
        this.f9748b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new C1436p0(key, this.f9749c.f9762d.k(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractC1564z.f(this.f9748b != null, "no calls to next() since the last call to remove()");
        this.f9747a.remove();
        this.f9749c.f9762d.f10033e -= this.f9748b.size();
        this.f9748b.clear();
        this.f9748b = null;
    }
}
