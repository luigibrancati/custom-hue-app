package Q7;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14150b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14151b = new a("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f14152c = new a("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14153a;

        public a(String str) {
            this.f14153a = str;
        }

        public String toString() {
            return this.f14153a;
        }
    }

    public p0(a aVar, int i10) {
        this.f14149a = aVar;
        this.f14150b = i10;
    }

    public static p0 b(a aVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new p0(aVar, i10);
    }

    @Override // P7.v
    public boolean a() {
        return this.f14149a != a.f14152c;
    }

    public int c() {
        return this.f14150b;
    }

    public a d() {
        return this.f14149a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p0Var.d() == d() && p0Var.c() == c();
    }

    public int hashCode() {
        return Objects.hash(p0.class, this.f14149a, Integer.valueOf(this.f14150b));
    }

    public String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f14149a + "salt_size_bytes: " + this.f14150b + ")";
    }
}
