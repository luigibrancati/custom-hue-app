package O6;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q5 extends M4 implements Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient N5 f11437b;

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

    public final N5 h() {
        N5 n52 = this.f11437b;
        if (n52 != null) {
            return n52;
        }
        N5 n5K = k();
        this.f11437b = n5K;
        return n5K;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1635b.a(this);
    }

    public N5 k() {
        return N5.k(toArray());
    }
}
