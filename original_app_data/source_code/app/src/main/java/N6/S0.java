package N6;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f10034a;

    public S0(Iterator it) {
        it.getClass();
        this.f10034a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10034a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f10034a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f10034a.remove();
    }
}
