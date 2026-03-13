package a8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f21157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f21158d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f21159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f21160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f21161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f21162d;

        public static void f(int i10, c cVar) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f21163b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f21164c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f21165d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f21166e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f21167f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public n a() throws GeneralSecurityException {
            Integer num = this.f21159a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f21160b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f21161c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f21162d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f21159a));
            }
            f(this.f21160b.intValue(), this.f21161c);
            return new n(this.f21159a.intValue(), this.f21160b.intValue(), this.f21162d, this.f21161c);
        }

        public b b(c cVar) {
            this.f21161c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f21159a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.f21160b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f21162d = dVar;
            return this;
        }

        public b() {
            this.f21159a = null;
            this.f21160b = null;
            this.f21161c = null;
            this.f21162d = d.f21172e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21163b = new c("SHA1");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f21164c = new c("SHA224");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f21165d = new c("SHA256");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f21166e = new c("SHA384");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f21167f = new c("SHA512");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21168a;

        public c(String str) {
            this.f21168a = str;
        }

        public String toString() {
            return this.f21168a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f21169b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f21170c = new d("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f21171d = new d("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f21172e = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21173a;

        public d(String str) {
            this.f21173a = str;
        }

        public String toString() {
            return this.f21173a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f21157c != d.f21172e;
    }

    public int c() {
        return this.f21156b;
    }

    public c d() {
        return this.f21158d;
    }

    public int e() {
        return this.f21155a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.e() == e() && nVar.f() == f() && nVar.g() == g() && nVar.d() == d();
    }

    public int f() {
        d dVar = this.f21157c;
        if (dVar == d.f21172e) {
            return c();
        }
        if (dVar != d.f21169b && dVar != d.f21170c && dVar != d.f21171d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public d g() {
        return this.f21157c;
    }

    public int hashCode() {
        return Objects.hash(n.class, Integer.valueOf(this.f21155a), Integer.valueOf(this.f21156b), this.f21157c, this.f21158d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f21157c + ", hashType: " + this.f21158d + ", " + this.f21156b + "-byte tags, and " + this.f21155a + "-byte key)";
    }

    public n(int i10, int i11, d dVar, c cVar) {
        this.f21155a = i10;
        this.f21156b = i11;
        this.f21157c = dVar;
        this.f21158d = cVar;
    }
}
