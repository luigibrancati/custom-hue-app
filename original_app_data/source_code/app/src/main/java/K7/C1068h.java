package K7;

import java.io.Serializable;

/* JADX INFO: renamed from: K7.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1068h extends M implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J7.f f7675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f7676b;

    public C1068h(J7.f fVar, M m10) {
        this.f7675a = (J7.f) J7.n.j(fVar);
        this.f7676b = (M) J7.n.j(m10);
    }

    @Override // K7.M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7676b.compare(this.f7675a.apply(obj), this.f7675a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1068h) {
            C1068h c1068h = (C1068h) obj;
            if (this.f7675a.equals(c1068h.f7675a) && this.f7676b.equals(c1068h.f7676b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return J7.j.b(this.f7675a, this.f7676b);
    }

    public String toString() {
        return this.f7676b + ".onResultOf(" + this.f7675a + ")";
    }
}
