package K7;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends M implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f7618a;

    public T(M m10) {
        this.f7618a = (M) J7.n.j(m10);
    }

    @Override // K7.M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7618a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T) {
            return this.f7618a.equals(((T) obj).f7618a);
        }
        return false;
    }

    @Override // K7.M
    public M g() {
        return this.f7618a;
    }

    public int hashCode() {
        return -this.f7618a.hashCode();
    }

    public String toString() {
        return this.f7618a + ".reverse()";
    }
}
