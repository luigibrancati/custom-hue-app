package O4;

/* JADX INFO: renamed from: O4.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1622x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11183a;

    /* JADX INFO: renamed from: O4.x$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11184a;

        public /* synthetic */ a(K0 k02) {
        }

        public C1622x a() {
            if (this.f11184a != null) {
                return new C1622x(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f11184a = str;
            return this;
        }
    }

    public /* synthetic */ C1622x(a aVar, K0 k02) {
        this.f11183a = aVar.f11184a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f11183a;
    }
}
