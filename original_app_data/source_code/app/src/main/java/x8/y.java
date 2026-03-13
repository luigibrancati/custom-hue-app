package x8;

import java.util.List;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends F.e.d.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47926a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f47927a;

        @Override // x8.F.e.d.f.a
        public F.e.d.f a() {
            List list = this.f47927a;
            if (list != null) {
                return new y(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // x8.F.e.d.f.a
        public F.e.d.f.a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f47927a = list;
            return this;
        }
    }

    @Override // x8.F.e.d.f
    public List b() {
        return this.f47926a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.f) {
            return this.f47926a.equals(((F.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f47926a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f47926a + "}";
    }

    public y(List list) {
        this.f47926a = list;
    }
}
