package o9;

import java.util.Set;

/* JADX INFO: renamed from: o9.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5239c extends AbstractC5241e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f41319a;

    public C5239c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f41319a = set;
    }

    @Override // o9.AbstractC5241e
    public Set b() {
        return this.f41319a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5241e) {
            return this.f41319a.equals(((AbstractC5241e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f41319a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f41319a + "}";
    }
}
