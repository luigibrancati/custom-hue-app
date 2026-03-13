package R8;

import R8.d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f14918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f14919e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f14923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f14924e;

        @Override // R8.d.a
        public d a() {
            return new a(this.f14920a, this.f14921b, this.f14922c, this.f14923d, this.f14924e);
        }

        @Override // R8.d.a
        public d.a b(f fVar) {
            this.f14923d = fVar;
            return this;
        }

        @Override // R8.d.a
        public d.a c(String str) {
            this.f14921b = str;
            return this;
        }

        @Override // R8.d.a
        public d.a d(String str) {
            this.f14922c = str;
            return this;
        }

        @Override // R8.d.a
        public d.a e(d.b bVar) {
            this.f14924e = bVar;
            return this;
        }

        @Override // R8.d.a
        public d.a f(String str) {
            this.f14920a = str;
            return this;
        }
    }

    @Override // R8.d
    public f b() {
        return this.f14918d;
    }

    @Override // R8.d
    public String c() {
        return this.f14916b;
    }

    @Override // R8.d
    public String d() {
        return this.f14917c;
    }

    @Override // R8.d
    public d.b e() {
        return this.f14919e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f14915a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f14916b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f14917c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f14918d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f14919e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // R8.d
    public String f() {
        return this.f14915a;
    }

    public int hashCode() {
        String str = this.f14915a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f14916b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14917c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f14918d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f14919e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f14915a + ", fid=" + this.f14916b + ", refreshToken=" + this.f14917c + ", authToken=" + this.f14918d + ", responseCode=" + this.f14919e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f14915a = str;
        this.f14916b = str2;
        this.f14917c = str3;
        this.f14918d = fVar;
        this.f14919e = bVar;
    }
}
