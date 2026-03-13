package N6;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M0 extends AbstractC1526w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient AbstractC1513v0 f9815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f9816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f9817e = 1;

    public M0(AbstractC1513v0 abstractC1513v0, Object[] objArr, int i10, int i11) {
        this.f9815c = abstractC1513v0;
        this.f9816d = objArr;
    }

    @Override // N6.AbstractC1423o0
    public final int c(Object[] objArr, int i10) {
        return h().c(objArr, i10);
    }

    @Override // N6.AbstractC1423o0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f9815c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // N6.AbstractC1526w0
    public final AbstractC1487t0 k() {
        return new L0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9817e;
    }
}
