package Q7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: Q7.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1925u extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f14177d;

    /* JADX INFO: renamed from: Q7.u$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f14178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f14179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f14181d;

        public C1925u a() throws GeneralSecurityException {
            Integer num = this.f14178a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f14181d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f14179b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f14180c != null) {
                return new C1925u(num.intValue(), this.f14179b.intValue(), this.f14180c.intValue(), this.f14181d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f14179b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f14178a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f14180c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f14181d = cVar;
            return this;
        }

        public b() {
            this.f14178a = null;
            this.f14179b = null;
            this.f14180c = null;
            this.f14181d = c.f14184d;
        }
    }

    /* JADX INFO: renamed from: Q7.u$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14182b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f14183c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14184d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14185a;

        public c(String str) {
            this.f14185a = str;
        }

        public String toString() {
            return this.f14185a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f14177d != c.f14184d;
    }

    public int c() {
        return this.f14175b;
    }

    public int d() {
        return this.f14174a;
    }

    public int e() {
        return this.f14176c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1925u)) {
            return false;
        }
        C1925u c1925u = (C1925u) obj;
        return c1925u.d() == d() && c1925u.c() == c() && c1925u.e() == e() && c1925u.f() == f();
    }

    public c f() {
        return this.f14177d;
    }

    public int hashCode() {
        return Objects.hash(C1925u.class, Integer.valueOf(this.f14174a), Integer.valueOf(this.f14175b), Integer.valueOf(this.f14176c), this.f14177d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f14177d + ", " + this.f14175b + "-byte IV, " + this.f14176c + "-byte tag, and " + this.f14174a + "-byte key)";
    }

    public C1925u(int i10, int i11, int i12, c cVar) {
        this.f14174a = i10;
        this.f14175b = i11;
        this.f14176c = i12;
        this.f14177d = cVar;
    }
}
