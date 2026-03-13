package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends F.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.e.a.b f47776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47779g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.a.AbstractC0648a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public F.e.a.b f47783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f47784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f47786g;

        @Override // x8.F.e.a.AbstractC0648a
        public F.e.a a() {
            String str;
            String str2 = this.f47780a;
            if (str2 != null && (str = this.f47781b) != null) {
                return new i(str2, str, this.f47782c, this.f47783d, this.f47784e, this.f47785f, this.f47786g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47780a == null) {
                sb2.append(" identifier");
            }
            if (this.f47781b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.a.AbstractC0648a
        public F.e.a.AbstractC0648a b(String str) {
            this.f47785f = str;
            return this;
        }

        @Override // x8.F.e.a.AbstractC0648a
        public F.e.a.AbstractC0648a c(String str) {
            this.f47786g = str;
            return this;
        }

        @Override // x8.F.e.a.AbstractC0648a
        public F.e.a.AbstractC0648a d(String str) {
            this.f47782c = str;
            return this;
        }

        @Override // x8.F.e.a.AbstractC0648a
        public F.e.a.AbstractC0648a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f47780a = str;
            return this;
        }

        @Override // x8.F.e.a.AbstractC0648a
        public F.e.a.AbstractC0648a f(String str) {
            this.f47784e = str;
            return this;
        }

        @Override // x8.F.e.a.AbstractC0648a
        public F.e.a.AbstractC0648a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f47781b = str;
            return this;
        }
    }

    @Override // x8.F.e.a
    public String b() {
        return this.f47778f;
    }

    @Override // x8.F.e.a
    public String c() {
        return this.f47779g;
    }

    @Override // x8.F.e.a
    public String d() {
        return this.f47775c;
    }

    @Override // x8.F.e.a
    public String e() {
        return this.f47773a;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.a.b bVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.a) {
            F.e.a aVar = (F.e.a) obj;
            if (this.f47773a.equals(aVar.e()) && this.f47774b.equals(aVar.h()) && ((str = this.f47775c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f47776d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f47777e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f47778f) != null ? str3.equals(aVar.b()) : aVar.b() == null) && ((str4 = this.f47779g) != null ? str4.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.e.a
    public String f() {
        return this.f47777e;
    }

    @Override // x8.F.e.a
    public F.e.a.b g() {
        return this.f47776d;
    }

    @Override // x8.F.e.a
    public String h() {
        return this.f47774b;
    }

    public int hashCode() {
        int iHashCode = (((this.f47773a.hashCode() ^ 1000003) * 1000003) ^ this.f47774b.hashCode()) * 1000003;
        String str = this.f47775c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        F.e.a.b bVar = this.f47776d;
        int iHashCode3 = (iHashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f47777e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f47778f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f47779g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f47773a + ", version=" + this.f47774b + ", displayVersion=" + this.f47775c + ", organization=" + this.f47776d + ", installationUuid=" + this.f47777e + ", developmentPlatform=" + this.f47778f + ", developmentPlatformVersion=" + this.f47779g + "}";
    }

    public i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f47773a = str;
        this.f47774b = str2;
        this.f47775c = str3;
        this.f47776d = bVar;
        this.f47777e = str4;
        this.f47778f = str5;
        this.f47779g = str6;
    }
}
