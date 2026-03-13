package O4;

/* JADX INFO: renamed from: O4.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1624y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11185a;

    /* JADX INFO: renamed from: O4.y$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11186a;

        public /* synthetic */ a(L0 l02) {
        }

        public C1624y a() {
            if (this.f11186a != null) {
                return new C1624y(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f11186a = str;
            return this;
        }
    }

    public /* synthetic */ C1624y(a aVar, L0 l02) {
        this.f11185a = aVar.f11186a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f11185a;
    }
}
