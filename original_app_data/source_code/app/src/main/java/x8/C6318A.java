package x8;

import x8.F;

/* JADX INFO: renamed from: x8.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6318A extends F.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47515a;

    /* JADX INFO: renamed from: x8.A$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47516a;

        @Override // x8.F.e.f.a
        public F.e.f a() {
            String str = this.f47516a;
            if (str != null) {
                return new C6318A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // x8.F.e.f.a
        public F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f47516a = str;
            return this;
        }
    }

    @Override // x8.F.e.f
    public String b() {
        return this.f47515a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f47515a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f47515a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f47515a + "}";
    }

    public C6318A(String str) {
        this.f47515a = str;
    }
}
