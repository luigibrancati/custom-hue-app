package N6;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: N6.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1345i0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1358j0 f10305a;

    public C1345i0(C1358j0 c1358j0) {
        this.f10305a = c1358j0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f10305a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C1358j0 c1358j0 = this.f10305a;
        Map mapO = c1358j0.o();
        return mapO != null ? mapO.values().iterator() : new C1267c0(c1358j0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f10305a.size();
    }
}
