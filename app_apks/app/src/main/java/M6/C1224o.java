package M6;

import java.util.Iterator;

/* JADX INFO: renamed from: M6.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1224o extends AbstractC1219j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1218i f9350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient AbstractC1215f f9351d;

    public C1224o(AbstractC1218i abstractC1218i, AbstractC1215f abstractC1215f) {
        this.f9350c = abstractC1218i;
        this.f9351d = abstractC1215f;
    }

    @Override // M6.AbstractC1212c
    public final int c(Object[] objArr, int i10) {
        return this.f9351d.c(objArr, 0);
    }

    @Override // M6.AbstractC1212c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9350c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f9351d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9350c.size();
    }
}
