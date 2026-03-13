package K7;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: K7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1073m extends M implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f7702a;

    public C1073m(Comparator comparator) {
        this.f7702a = (Comparator) J7.n.j(comparator);
    }

    @Override // K7.M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f7702a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1073m) {
            return this.f7702a.equals(((C1073m) obj).f7702a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7702a.hashCode();
    }

    public String toString() {
        return this.f7702a.toString();
    }
}
