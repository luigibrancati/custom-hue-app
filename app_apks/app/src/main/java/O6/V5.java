package O6;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V5 extends Q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient P5 f11489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient N5 f11490d;

    public V5(P5 p52, N5 n52) {
        this.f11489c = p52;
        this.f11490d = n52;
    }

    @Override // O6.M4
    public final int c(Object[] objArr, int i10) {
        return this.f11490d.c(objArr, 0);
    }

    @Override // O6.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f11489c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f11490d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11489c.size();
    }
}
