package k9;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39298b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f39299a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f39300b = com.google.firebase.remoteconfig.internal.c.f31928j;

        public u c() {
            return new u(this);
        }

        public b d(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f39299a = j10;
            return this;
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f39300b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public long a() {
        return this.f39297a;
    }

    public long b() {
        return this.f39298b;
    }

    public u(b bVar) {
        this.f39297a = bVar.f39299a;
        this.f39298b = bVar.f39300b;
    }
}
