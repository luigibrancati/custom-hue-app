package Q7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: Q7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1930z extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f14203b;

    /* JADX INFO: renamed from: Q7.z$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f14204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f14205b;

        public C1930z a() throws GeneralSecurityException {
            Integer num = this.f14204a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f14205b != null) {
                return new C1930z(num.intValue(), this.f14205b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f14204a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f14205b = cVar;
            return this;
        }

        public b() {
            this.f14204a = null;
            this.f14205b = c.f14208d;
        }
    }

    /* JADX INFO: renamed from: Q7.z$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14206b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f14207c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14208d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14209a;

        public c(String str) {
            this.f14209a = str;
        }

        public String toString() {
            return this.f14209a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f14203b != c.f14208d;
    }

    public int c() {
        return this.f14202a;
    }

    public c d() {
        return this.f14203b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1930z)) {
            return false;
        }
        C1930z c1930z = (C1930z) obj;
        return c1930z.c() == c() && c1930z.d() == d();
    }

    public int hashCode() {
        return Objects.hash(C1930z.class, Integer.valueOf(this.f14202a), this.f14203b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f14203b + ", " + this.f14202a + "-byte key)";
    }

    public C1930z(int i10, c cVar) {
        this.f14202a = i10;
        this.f14203b = cVar;
    }
}
