package k9;

import java.util.Set;

/* JADX INFO: renamed from: k9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4813a extends AbstractC4814b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f39266a;

    public C4813a(Set set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f39266a = set;
    }

    @Override // k9.AbstractC4814b
    public Set b() {
        return this.f39266a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4814b) {
            return this.f39266a.equals(((AbstractC4814b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f39266a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f39266a + "}";
    }
}
