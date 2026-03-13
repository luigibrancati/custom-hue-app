package N6;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class P extends N implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f9987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q10) {
        super(q10);
        this.f9987d = q10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.f9987d.isEmpty();
        a();
        ((ListIterator) this.f9956a).add(obj);
        this.f9987d.f10007f.f10033e++;
        if (zIsEmpty) {
            this.f9987d.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f9956a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f9956a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f9956a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f9956a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f9956a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q10, int i10) {
        super(q10, ((List) q10.f9975b).listIterator(i10));
        this.f9987d = q10;
    }
}
