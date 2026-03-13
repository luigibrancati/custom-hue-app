package P8;

import P8.m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13170c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f13172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f13173c;

        @Override // P8.m.a
        public m a() {
            String str = "";
            if (this.f13171a == null) {
                str = " token";
            }
            if (this.f13172b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f13173c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f13171a, this.f13172b.longValue(), this.f13173c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // P8.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f13171a = str;
            return this;
        }

        @Override // P8.m.a
        public m.a c(long j10) {
            this.f13173c = Long.valueOf(j10);
            return this;
        }

        @Override // P8.m.a
        public m.a d(long j10) {
            this.f13172b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // P8.m
    public String b() {
        return this.f13168a;
    }

    @Override // P8.m
    public long c() {
        return this.f13170c;
    }

    @Override // P8.m
    public long d() {
        return this.f13169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f13168a.equals(mVar.b()) && this.f13169b == mVar.d() && this.f13170c == mVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f13168a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f13169b;
        long j11 = this.f13170c;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f13168a + ", tokenExpirationTimestamp=" + this.f13169b + ", tokenCreationTimestamp=" + this.f13170c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f13168a = str;
        this.f13169b = j10;
        this.f13170c = j11;
    }
}
