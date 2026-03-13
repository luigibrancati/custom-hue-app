package gc;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4862t;
import wc.InterfaceC6184a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class L implements Iterator, InterfaceC6184a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f35585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35586b;

    public L(Iterator iterator) {
        AbstractC4862t.e(iterator, "iterator");
        this.f35585a = iterator;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4186J next() {
        int i10 = this.f35586b;
        this.f35586b = i10 + 1;
        if (i10 < 0) {
            C4206t.u();
        }
        return new C4186J(i10, this.f35585a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35585a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
