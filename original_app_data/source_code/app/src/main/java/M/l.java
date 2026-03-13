package M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8866b;

    public l(long j10, long j11) {
        this.f8865a = j10;
        this.f8866b = j11;
    }

    public long a() {
        return this.f8866b;
    }

    public long b() {
        return this.f8865a;
    }

    public String toString() {
        return this.f8865a + "/" + this.f8866b;
    }

    public l(double d10) {
        this((long) (d10 * 10000.0d), 10000L);
    }
}
