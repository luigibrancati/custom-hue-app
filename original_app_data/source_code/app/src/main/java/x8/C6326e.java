package x8;

import x8.F;

/* JADX INFO: renamed from: x8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6326e extends F.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47737b;

    /* JADX INFO: renamed from: x8.e$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47739b;

        @Override // x8.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f47738a;
            if (str2 != null && (str = this.f47739b) != null) {
                return new C6326e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47738a == null) {
                sb2.append(" key");
            }
            if (this.f47739b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.c.a
        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f47738a = str;
            return this;
        }

        @Override // x8.F.c.a
        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f47739b = str;
            return this;
        }
    }

    @Override // x8.F.c
    public String b() {
        return this.f47736a;
    }

    @Override // x8.F.c
    public String c() {
        return this.f47737b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.c) {
            F.c cVar = (F.c) obj;
            if (this.f47736a.equals(cVar.b()) && this.f47737b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f47737b.hashCode() ^ ((this.f47736a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f47736a + ", value=" + this.f47737b + "}";
    }

    public C6326e(String str, String str2) {
        this.f47736a = str;
        this.f47737b = str2;
    }
}
