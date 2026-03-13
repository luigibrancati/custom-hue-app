package Q8;

import Q8.c;
import Q8.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f14211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14216h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f14218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f14220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f14221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f14222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f14223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f14224h;

        @Override // Q8.d.a
        public d a() {
            if (this.f14224h == 3 && this.f14218b != null) {
                return new a(this.f14217a, this.f14218b, this.f14219c, this.f14220d, this.f14221e, this.f14222f, this.f14223g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f14218b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f14224h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f14224h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // Q8.d.a
        public d.a b(String str) {
            this.f14219c = str;
            return this;
        }

        @Override // Q8.d.a
        public d.a c(long j10) {
            this.f14221e = j10;
            this.f14224h = (byte) (this.f14224h | 1);
            return this;
        }

        @Override // Q8.d.a
        public d.a d(String str) {
            this.f14217a = str;
            return this;
        }

        @Override // Q8.d.a
        public d.a e(String str) {
            this.f14223g = str;
            return this;
        }

        @Override // Q8.d.a
        public d.a f(String str) {
            this.f14220d = str;
            return this;
        }

        @Override // Q8.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f14218b = aVar;
            return this;
        }

        @Override // Q8.d.a
        public d.a h(long j10) {
            this.f14222f = j10;
            this.f14224h = (byte) (this.f14224h | 2);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f14217a = dVar.d();
            this.f14218b = dVar.g();
            this.f14219c = dVar.b();
            this.f14220d = dVar.f();
            this.f14221e = dVar.c();
            this.f14222f = dVar.h();
            this.f14223g = dVar.e();
            this.f14224h = (byte) 3;
        }
    }

    @Override // Q8.d
    public String b() {
        return this.f14212d;
    }

    @Override // Q8.d
    public long c() {
        return this.f14214f;
    }

    @Override // Q8.d
    public String d() {
        return this.f14210b;
    }

    @Override // Q8.d
    public String e() {
        return this.f14216h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f14210b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f14211c.equals(dVar.g()) && ((str = this.f14212d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f14213e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f14214f == dVar.c() && this.f14215g == dVar.h() && ((str3 = this.f14216h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Q8.d
    public String f() {
        return this.f14213e;
    }

    @Override // Q8.d
    public c.a g() {
        return this.f14211c;
    }

    @Override // Q8.d
    public long h() {
        return this.f14215g;
    }

    public int hashCode() {
        String str = this.f14210b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f14211c.hashCode()) * 1000003;
        String str2 = this.f14212d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14213e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f14214f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f14215g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f14216h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // Q8.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f14210b + ", registrationStatus=" + this.f14211c + ", authToken=" + this.f14212d + ", refreshToken=" + this.f14213e + ", expiresInSecs=" + this.f14214f + ", tokenCreationEpochInSecs=" + this.f14215g + ", fisError=" + this.f14216h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f14210b = str;
        this.f14211c = aVar;
        this.f14212d = str2;
        this.f14213e = str3;
        this.f14214f = j10;
        this.f14215g = j11;
        this.f14216h = str4;
    }
}
