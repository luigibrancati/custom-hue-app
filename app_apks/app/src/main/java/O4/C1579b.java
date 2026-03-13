package O4;

/* JADX INFO: renamed from: O4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1579b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11037a;

    /* JADX INFO: renamed from: O4.b$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11038a;

        public /* synthetic */ a(B b10) {
        }

        public C1579b a() {
            String str = this.f11038a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C1579b c1579b = new C1579b(null);
            c1579b.f11037a = str;
            return c1579b;
        }

        public a b(String str) {
            this.f11038a = str;
            return this;
        }
    }

    public /* synthetic */ C1579b(B b10) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f11037a;
    }
}
