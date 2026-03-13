package a8;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: renamed from: a8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2654f extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f21130c;

    /* JADX INFO: renamed from: a8.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f21131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f21132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f21133c;

        public C2654f a() throws GeneralSecurityException {
            Integer num = this.f21131a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f21132b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f21133c != null) {
                return new C2654f(num.intValue(), this.f21132b.intValue(), this.f21133c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f21131a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) throws GeneralSecurityException {
            if (i10 >= 10 && 16 >= i10) {
                this.f21132b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f21133c = cVar;
            return this;
        }

        public b() {
            this.f21131a = null;
            this.f21132b = null;
            this.f21133c = c.f21137e;
        }
    }

    /* JADX INFO: renamed from: a8.f$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f21134b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f21135c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f21136d = new c("LEGACY");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f21137e = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21138a;

        public c(String str) {
            this.f21138a = str;
        }

        public String toString() {
            return this.f21138a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f21130c != c.f21137e;
    }

    public int c() {
        return this.f21129b;
    }

    public int d() {
        return this.f21128a;
    }

    public int e() {
        c cVar = this.f21130c;
        if (cVar == c.f21137e) {
            return c();
        }
        if (cVar != c.f21134b && cVar != c.f21135c && cVar != c.f21136d) {
            throw new IllegalStateException("Unknown variant");
        }
        int iC = c();
        return iC + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2654f)) {
            return false;
        }
        C2654f c2654f = (C2654f) obj;
        return c2654f.d() == d() && c2654f.e() == e() && c2654f.f() == f();
    }

    public c f() {
        return this.f21130c;
    }

    public int hashCode() {
        return Objects.hash(C2654f.class, Integer.valueOf(this.f21128a), Integer.valueOf(this.f21129b), this.f21130c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f21130c + ", " + this.f21129b + "-byte tags, and " + this.f21128a + "-byte key)";
    }

    public C2654f(int i10, int i11, c cVar) {
        this.f21128a = i10;
        this.f21129b = i11;
        this.f21130c = cVar;
    }
}
