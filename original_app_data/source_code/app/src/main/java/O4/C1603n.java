package O4;

/* JADX INFO: renamed from: O4.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1603n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11130a;

    /* JADX INFO: renamed from: O4.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11131a;

        public /* synthetic */ a(AbstractC1619v0 abstractC1619v0) {
        }

        public C1603n a() {
            String str = this.f11131a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C1603n c1603n = new C1603n(null);
            c1603n.f11130a = str;
            return c1603n;
        }

        public a b(String str) {
            this.f11131a = str;
            return this;
        }
    }

    public /* synthetic */ C1603n(AbstractC1619v0 abstractC1619v0) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f11130a;
    }
}
