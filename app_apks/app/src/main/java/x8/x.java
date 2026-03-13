package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends F.e.d.AbstractC0662e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47923b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.AbstractC0662e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47925b;

        @Override // x8.F.e.d.AbstractC0662e.b.a
        public F.e.d.AbstractC0662e.b a() {
            String str;
            String str2 = this.f47924a;
            if (str2 != null && (str = this.f47925b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47924a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f47925b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.AbstractC0662e.b.a
        public F.e.d.AbstractC0662e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f47924a = str;
            return this;
        }

        @Override // x8.F.e.d.AbstractC0662e.b.a
        public F.e.d.AbstractC0662e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f47925b = str;
            return this;
        }
    }

    @Override // x8.F.e.d.AbstractC0662e.b
    public String b() {
        return this.f47922a;
    }

    @Override // x8.F.e.d.AbstractC0662e.b
    public String c() {
        return this.f47923b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0662e.b) {
            F.e.d.AbstractC0662e.b bVar = (F.e.d.AbstractC0662e.b) obj;
            if (this.f47922a.equals(bVar.b()) && this.f47923b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f47923b.hashCode() ^ ((this.f47922a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f47922a + ", variantId=" + this.f47923b + "}";
    }

    public x(String str, String str2) {
        this.f47922a = str;
        this.f47923b = str2;
    }
}
