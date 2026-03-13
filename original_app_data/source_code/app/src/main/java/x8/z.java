package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends F.e.AbstractC0663e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47931d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.AbstractC0663e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f47935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f47936e;

        @Override // x8.F.e.AbstractC0663e.a
        public F.e.AbstractC0663e a() {
            String str;
            String str2;
            if (this.f47936e == 3 && (str = this.f47933b) != null && (str2 = this.f47934c) != null) {
                return new z(this.f47932a, str, str2, this.f47935d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f47936e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f47933b == null) {
                sb2.append(" version");
            }
            if (this.f47934c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f47936e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.AbstractC0663e.a
        public F.e.AbstractC0663e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f47934c = str;
            return this;
        }

        @Override // x8.F.e.AbstractC0663e.a
        public F.e.AbstractC0663e.a c(boolean z10) {
            this.f47935d = z10;
            this.f47936e = (byte) (this.f47936e | 2);
            return this;
        }

        @Override // x8.F.e.AbstractC0663e.a
        public F.e.AbstractC0663e.a d(int i10) {
            this.f47932a = i10;
            this.f47936e = (byte) (this.f47936e | 1);
            return this;
        }

        @Override // x8.F.e.AbstractC0663e.a
        public F.e.AbstractC0663e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f47933b = str;
            return this;
        }
    }

    @Override // x8.F.e.AbstractC0663e
    public String b() {
        return this.f47930c;
    }

    @Override // x8.F.e.AbstractC0663e
    public int c() {
        return this.f47928a;
    }

    @Override // x8.F.e.AbstractC0663e
    public String d() {
        return this.f47929b;
    }

    @Override // x8.F.e.AbstractC0663e
    public boolean e() {
        return this.f47931d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.AbstractC0663e) {
            F.e.AbstractC0663e abstractC0663e = (F.e.AbstractC0663e) obj;
            if (this.f47928a == abstractC0663e.c() && this.f47929b.equals(abstractC0663e.d()) && this.f47930c.equals(abstractC0663e.b()) && this.f47931d == abstractC0663e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f47931d ? 1231 : 1237) ^ ((((((this.f47928a ^ 1000003) * 1000003) ^ this.f47929b.hashCode()) * 1000003) ^ this.f47930c.hashCode()) * 1000003);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f47928a + ", version=" + this.f47929b + ", buildVersion=" + this.f47930c + ", jailbroken=" + this.f47931d + "}";
    }

    public z(int i10, String str, String str2, boolean z10) {
        this.f47928a = i10;
        this.f47929b = str;
        this.f47930c = str2;
        this.f47931d = z10;
    }
}
