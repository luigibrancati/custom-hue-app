package O6;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U5 extends Q5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient P5 f11474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f11475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f11476e;

    public U5(P5 p52, Object[] objArr, int i10, int i11) {
        this.f11474c = p52;
        this.f11475d = objArr;
        this.f11476e = i11;
    }

    @Override // O6.M4
    public final int c(Object[] objArr, int i10) {
        return h().c(objArr, 0);
    }

    @Override // O6.M4, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11474c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // O6.Q5
    public final N5 k() {
        return new T5(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11476e;
    }
}
