package We;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f17970a;

    public n(Iterator it) {
        this.f17970a = (Iterator) Ve.a.a(it);
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17970a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f17970a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f17970a.remove();
    }
}
