package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends F.e.d.a.b.AbstractC0654d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47866c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.b.AbstractC0654d.AbstractC0655a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f47869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f47870d;

        @Override // x8.F.e.d.a.b.AbstractC0654d.AbstractC0655a
        public F.e.d.a.b.AbstractC0654d a() {
            String str;
            String str2;
            if (this.f47870d == 1 && (str = this.f47867a) != null && (str2 = this.f47868b) != null) {
                return new q(str, str2, this.f47869c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47867a == null) {
                sb2.append(" name");
            }
            if (this.f47868b == null) {
                sb2.append(" code");
            }
            if ((this.f47870d & 1) == 0) {
                sb2.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.b.AbstractC0654d.AbstractC0655a
        public F.e.d.a.b.AbstractC0654d.AbstractC0655a b(long j10) {
            this.f47869c = j10;
            this.f47870d = (byte) (this.f47870d | 1);
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0654d.AbstractC0655a
        public F.e.d.a.b.AbstractC0654d.AbstractC0655a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f47868b = str;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0654d.AbstractC0655a
        public F.e.d.a.b.AbstractC0654d.AbstractC0655a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f47867a = str;
            return this;
        }
    }

    @Override // x8.F.e.d.a.b.AbstractC0654d
    public long b() {
        return this.f47866c;
    }

    @Override // x8.F.e.d.a.b.AbstractC0654d
    public String c() {
        return this.f47865b;
    }

    @Override // x8.F.e.d.a.b.AbstractC0654d
    public String d() {
        return this.f47864a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0654d) {
            F.e.d.a.b.AbstractC0654d abstractC0654d = (F.e.d.a.b.AbstractC0654d) obj;
            if (this.f47864a.equals(abstractC0654d.d()) && this.f47865b.equals(abstractC0654d.c()) && this.f47866c == abstractC0654d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f47864a.hashCode() ^ 1000003) * 1000003) ^ this.f47865b.hashCode()) * 1000003;
        long j10 = this.f47866c;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "Signal{name=" + this.f47864a + ", code=" + this.f47865b + ", address=" + this.f47866c + "}";
    }

    public q(String str, String str2, long j10) {
        this.f47864a = str;
        this.f47865b = str2;
        this.f47866c = j10;
    }
}
