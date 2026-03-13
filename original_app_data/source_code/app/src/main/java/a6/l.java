package a6;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21089a;

    public l(long j10) {
        this.f21089a = j10;
    }

    @Override // a6.v
    public long c() {
        return this.f21089a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f21089a == ((v) obj).c();
    }

    public int hashCode() {
        long j10 = this.f21089a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f21089a + "}";
    }
}
