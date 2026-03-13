package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends F.e.d.AbstractC0661d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47911a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.AbstractC0661d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47912a;

        @Override // x8.F.e.d.AbstractC0661d.a
        public F.e.d.AbstractC0661d a() {
            String str = this.f47912a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // x8.F.e.d.AbstractC0661d.a
        public F.e.d.AbstractC0661d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f47912a = str;
            return this;
        }
    }

    @Override // x8.F.e.d.AbstractC0661d
    public String b() {
        return this.f47911a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0661d) {
            return this.f47911a.equals(((F.e.d.AbstractC0661d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f47911a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f47911a + "}";
    }

    public v(String str) {
        this.f47911a = str;
    }
}
