package N6;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N0 extends AbstractC1526w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1513v0 f9959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient AbstractC1487t0 f9960d;

    public N0(AbstractC1513v0 abstractC1513v0, AbstractC1487t0 abstractC1487t0) {
        this.f9959c = abstractC1513v0;
        this.f9960d = abstractC1487t0;
    }

    @Override // N6.AbstractC1423o0
    public final int c(Object[] objArr, int i10) {
        return this.f9960d.c(objArr, i10);
    }

    @Override // N6.AbstractC1423o0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9959c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f9960d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
