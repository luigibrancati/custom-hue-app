package e6;

/* JADX INFO: renamed from: e6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3942c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3942c f33759c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f33761b;

    /* JADX INFO: renamed from: e6.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f33762a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f33763b = b.REASON_UNKNOWN;

        public C3942c a() {
            return new C3942c(this.f33762a, this.f33763b);
        }

        public a b(long j10) {
            this.f33762a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f33763b = bVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: e6.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b implements K8.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // K8.c
        public int getNumber() {
            return this.number_;
        }
    }

    public C3942c(long j10, b bVar) {
        this.f33760a = j10;
        this.f33761b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f33760a;
    }

    public b b() {
        return this.f33761b;
    }
}
