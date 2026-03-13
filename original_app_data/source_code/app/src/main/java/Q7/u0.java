package Q7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14186a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14187b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f14188c = new a("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f14189d = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14190a;

        public a(String str) {
            this.f14190a = str;
        }

        public String toString() {
            return this.f14190a;
        }
    }

    public u0(a aVar) {
        this.f14186a = aVar;
    }

    public static u0 b(a aVar) {
        return new u0(aVar);
    }

    @Override // P7.v
    public boolean a() {
        return this.f14186a != a.f14189d;
    }

    public a c() {
        return this.f14186a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u0) && ((u0) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(u0.class, this.f14186a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f14186a + ")";
    }
}
