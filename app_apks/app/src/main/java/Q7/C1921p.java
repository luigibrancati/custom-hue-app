package Q7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: Q7.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1921p extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f14140d;

    /* JADX INFO: renamed from: Q7.p$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f14141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f14142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f14144d;

        public C1921p a() throws GeneralSecurityException {
            Integer num = this.f14141a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f14142b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f14144d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f14143c != null) {
                return new C1921p(num.intValue(), this.f14142b.intValue(), this.f14143c.intValue(), this.f14144d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f14142b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f14141a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) throws GeneralSecurityException {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f14143c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f14144d = cVar;
            return this;
        }

        public b() {
            this.f14141a = null;
            this.f14142b = null;
            this.f14143c = null;
            this.f14144d = c.f14147d;
        }
    }

    /* JADX INFO: renamed from: Q7.p$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14145b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f14146c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14147d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14148a;

        public c(String str) {
            this.f14148a = str;
        }

        public String toString() {
            return this.f14148a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f14140d != c.f14147d;
    }

    public int c() {
        return this.f14138b;
    }

    public int d() {
        return this.f14137a;
    }

    public int e() {
        return this.f14139c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1921p)) {
            return false;
        }
        C1921p c1921p = (C1921p) obj;
        return c1921p.d() == d() && c1921p.c() == c() && c1921p.e() == e() && c1921p.f() == f();
    }

    public c f() {
        return this.f14140d;
    }

    public int hashCode() {
        return Objects.hash(C1921p.class, Integer.valueOf(this.f14137a), Integer.valueOf(this.f14138b), Integer.valueOf(this.f14139c), this.f14140d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f14140d + ", " + this.f14138b + "-byte IV, " + this.f14139c + "-byte tag, and " + this.f14137a + "-byte key)";
    }

    public C1921p(int i10, int i11, int i12, c cVar) {
        this.f14137a = i10;
        this.f14138b = i11;
        this.f14139c = i12;
        this.f14140d = cVar;
    }
}
