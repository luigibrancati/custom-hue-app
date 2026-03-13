package X6;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f18248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f18249b;

    public F(G g10) {
        Objects.requireNonNull(g10);
        this.f18249b = g10;
        this.f18248a = g10.n().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f18248a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18248a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
