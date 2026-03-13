package e6;

/* JADX INFO: renamed from: e6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3944e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3944e f33769c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f33771b;

    /* JADX INFO: renamed from: e6.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f33772a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f33773b = 0;

        public C3944e a() {
            return new C3944e(this.f33772a, this.f33773b);
        }

        public a b(long j10) {
            this.f33772a = j10;
            return this;
        }

        public a c(long j10) {
            this.f33773b = j10;
            return this;
        }
    }

    public C3944e(long j10, long j11) {
        this.f33770a = j10;
        this.f33771b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f33770a;
    }

    public long b() {
        return this.f33771b;
    }
}
