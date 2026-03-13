package e6;

/* JADX INFO: renamed from: e6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3945f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3945f f33774c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f33776b;

    /* JADX INFO: renamed from: e6.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f33777a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f33778b = 0;

        public C3945f a() {
            return new C3945f(this.f33777a, this.f33778b);
        }

        public a b(long j10) {
            this.f33778b = j10;
            return this;
        }

        public a c(long j10) {
            this.f33777a = j10;
            return this;
        }
    }

    public C3945f(long j10, long j11) {
        this.f33775a = j10;
        this.f33776b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f33776b;
    }

    public long b() {
        return this.f33775a;
    }
}
