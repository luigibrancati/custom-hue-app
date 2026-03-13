package M6;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: M6.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1223n extends AbstractC1219j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1218i f9347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f9348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f9349e;

    public C1223n(AbstractC1218i abstractC1218i, Object[] objArr, int i10, int i11) {
        this.f9347c = abstractC1218i;
        this.f9348d = objArr;
        this.f9349e = i11;
    }

    @Override // M6.AbstractC1212c
    public final int c(Object[] objArr, int i10) {
        return h().c(objArr, 0);
    }

    @Override // M6.AbstractC1212c, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f9347c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // M6.AbstractC1219j
    public final AbstractC1215f k() {
        return new C1222m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9349e;
    }
}
