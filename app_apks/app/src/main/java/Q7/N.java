package Q7;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14017b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14018b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f14019c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14020a;

        public a(String str) {
            this.f14020a = str;
        }

        public String toString() {
            return this.f14020a;
        }
    }

    public N(String str, a aVar) {
        this.f14016a = str;
        this.f14017b = aVar;
    }

    public static N b(String str, a aVar) {
        return new N(str, aVar);
    }

    @Override // P7.v
    public boolean a() {
        return this.f14017b != a.f14019c;
    }

    public String c() {
        return this.f14016a;
    }

    public a d() {
        return this.f14017b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return n10.f14016a.equals(this.f14016a) && n10.f14017b.equals(this.f14017b);
    }

    public int hashCode() {
        return Objects.hash(N.class, this.f14016a, this.f14017b);
    }

    public String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f14016a + ", variant: " + this.f14017b + ")";
    }
}
