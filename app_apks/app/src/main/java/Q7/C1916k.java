package Q7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: Q7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1916k extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f14091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f14092f;

    /* JADX INFO: renamed from: Q7.k$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f14093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f14094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f14096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f14097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d f14098f;

        public static void h(int i10, c cVar) throws GeneralSecurityException {
            if (cVar == c.f14099b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f14100c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f14101d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f14102e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f14103f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public C1916k a() throws GeneralSecurityException {
            if (this.f14093a == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.f14094b == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.f14095c == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.f14096d;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f14097e == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f14098f == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            h(num.intValue(), this.f14097e);
            return new C1916k(this.f14093a.intValue(), this.f14094b.intValue(), this.f14095c.intValue(), this.f14096d.intValue(), this.f14098f, this.f14097e);
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f14093a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f14097e = cVar;
            return this;
        }

        public b d(int i10) throws InvalidAlgorithmParameterException {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
            }
            this.f14094b = Integer.valueOf(i10);
            return this;
        }

        public b e(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.f14095c = Integer.valueOf(i10);
            return this;
        }

        public b f(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.f14096d = Integer.valueOf(i10);
            return this;
        }

        public b g(d dVar) {
            this.f14098f = dVar;
            return this;
        }

        public b() {
            this.f14093a = null;
            this.f14094b = null;
            this.f14095c = null;
            this.f14096d = null;
            this.f14097e = null;
            this.f14098f = d.f14107d;
        }
    }

    /* JADX INFO: renamed from: Q7.k$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14099b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f14100c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14101d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f14102e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f14103f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14104a;

        public c(String str) {
            this.f14104a = str;
        }

        public String toString() {
            return this.f14104a;
        }
    }

    /* JADX INFO: renamed from: Q7.k$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f14105b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f14106c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f14107d = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14108a;

        public d(String str) {
            this.f14108a = str;
        }

        public String toString() {
            return this.f14108a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f14091e != d.f14107d;
    }

    public int c() {
        return this.f14087a;
    }

    public c d() {
        return this.f14092f;
    }

    public int e() {
        return this.f14088b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1916k)) {
            return false;
        }
        C1916k c1916k = (C1916k) obj;
        return c1916k.c() == c() && c1916k.e() == e() && c1916k.f() == f() && c1916k.g() == g() && c1916k.h() == h() && c1916k.d() == d();
    }

    public int f() {
        return this.f14089c;
    }

    public int g() {
        return this.f14090d;
    }

    public d h() {
        return this.f14091e;
    }

    public int hashCode() {
        return Objects.hash(C1916k.class, Integer.valueOf(this.f14087a), Integer.valueOf(this.f14088b), Integer.valueOf(this.f14089c), Integer.valueOf(this.f14090d), this.f14091e, this.f14092f);
    }

    public String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.f14091e + ", hashType: " + this.f14092f + ", " + this.f14089c + "-byte IV, and " + this.f14090d + "-byte tags, and " + this.f14087a + "-byte AES key, and " + this.f14088b + "-byte HMAC key)";
    }

    public C1916k(int i10, int i11, int i12, int i13, d dVar, c cVar) {
        this.f14087a = i10;
        this.f14088b = i11;
        this.f14089c = i12;
        this.f14090d = i13;
        this.f14091e = dVar;
        this.f14092f = cVar;
    }
}
