package Q7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f13997a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13998b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f13999c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f14000d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14001a;

        public a(String str) {
            this.f14001a = str;
        }

        public String toString() {
            return this.f14001a;
        }
    }

    public E(a aVar) {
        this.f13997a = aVar;
    }

    public static E b(a aVar) {
        return new E(aVar);
    }

    @Override // P7.v
    public boolean a() {
        return this.f13997a != a.f14000d;
    }

    public a c() {
        return this.f13997a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof E) && ((E) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(E.class, this.f13997a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f13997a + ")";
    }
}
