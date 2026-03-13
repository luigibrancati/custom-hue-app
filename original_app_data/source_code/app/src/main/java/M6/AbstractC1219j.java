package M6;

import java.util.Set;

/* JADX INFO: renamed from: M6.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1219j extends AbstractC1212c implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AbstractC1215f f9342b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final AbstractC1215f h() {
        AbstractC1215f abstractC1215f = this.f9342b;
        if (abstractC1215f != null) {
            return abstractC1215f;
        }
        AbstractC1215f abstractC1215fK = k();
        this.f9342b = abstractC1215fK;
        return abstractC1215fK;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.a(this);
    }

    public AbstractC1215f k() {
        Object[] array = toArray();
        AbstractC1228t abstractC1228t = AbstractC1215f.f9332b;
        return AbstractC1215f.k(array, array.length);
    }
}
