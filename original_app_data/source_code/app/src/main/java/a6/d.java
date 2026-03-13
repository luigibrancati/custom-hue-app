package a6;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21040a;

    public d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f21040a = list;
    }

    @Override // a6.n
    public List c() {
        return this.f21040a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f21040a.equals(((n) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f21040a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f21040a + "}";
    }
}
