package x8;

import x8.F;

/* JADX INFO: renamed from: x8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6325d extends F.a.AbstractC0646a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47732c;

    /* JADX INFO: renamed from: x8.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.a.AbstractC0646a.AbstractC0647a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47735c;

        @Override // x8.F.a.AbstractC0646a.AbstractC0647a
        public F.a.AbstractC0646a a() {
            String str;
            String str2;
            String str3 = this.f47733a;
            if (str3 != null && (str = this.f47734b) != null && (str2 = this.f47735c) != null) {
                return new C6325d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47733a == null) {
                sb2.append(" arch");
            }
            if (this.f47734b == null) {
                sb2.append(" libraryName");
            }
            if (this.f47735c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.a.AbstractC0646a.AbstractC0647a
        public F.a.AbstractC0646a.AbstractC0647a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f47733a = str;
            return this;
        }

        @Override // x8.F.a.AbstractC0646a.AbstractC0647a
        public F.a.AbstractC0646a.AbstractC0647a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f47735c = str;
            return this;
        }

        @Override // x8.F.a.AbstractC0646a.AbstractC0647a
        public F.a.AbstractC0646a.AbstractC0647a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f47734b = str;
            return this;
        }
    }

    @Override // x8.F.a.AbstractC0646a
    public String b() {
        return this.f47730a;
    }

    @Override // x8.F.a.AbstractC0646a
    public String c() {
        return this.f47732c;
    }

    @Override // x8.F.a.AbstractC0646a
    public String d() {
        return this.f47731b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a.AbstractC0646a) {
            F.a.AbstractC0646a abstractC0646a = (F.a.AbstractC0646a) obj;
            if (this.f47730a.equals(abstractC0646a.b()) && this.f47731b.equals(abstractC0646a.d()) && this.f47732c.equals(abstractC0646a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f47732c.hashCode() ^ ((((this.f47730a.hashCode() ^ 1000003) * 1000003) ^ this.f47731b.hashCode()) * 1000003);
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f47730a + ", libraryName=" + this.f47731b + ", buildId=" + this.f47732c + "}";
    }

    public C6325d(String str, String str2, String str3) {
        this.f47730a = str;
        this.f47731b = str2;
        this.f47732c = str3;
    }
}
