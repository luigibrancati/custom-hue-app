package Q7;

import Q7.C1916k;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Q7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1911f extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1916k f14073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f14074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g8.b f14075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4160a f14076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f14077e;

    /* JADX INFO: renamed from: Q7.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1916k f14078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g8.b f14079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g8.b f14080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f14081d;

        public C1911f a() throws GeneralSecurityException {
            C1916k c1916k = this.f14078a;
            if (c1916k == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.f14079b == null || this.f14080c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (c1916k.c() != this.f14079b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f14078a.e() != this.f14080c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f14078a.a() && this.f14081d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14078a.a() && this.f14081d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1911f(this.f14078a, this.f14079b, this.f14080c, b(), this.f14081d);
        }

        public final C4160a b() {
            if (this.f14078a.h() == C1916k.d.f14107d) {
                return Z7.y.f20395a;
            }
            if (this.f14078a.h() == C1916k.d.f14106c) {
                return Z7.y.a(this.f14081d.intValue());
            }
            if (this.f14078a.h() == C1916k.d.f14105b) {
                return Z7.y.b(this.f14081d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f14078a.h());
        }

        public b c(g8.b bVar) {
            this.f14079b = bVar;
            return this;
        }

        public b d(g8.b bVar) {
            this.f14080c = bVar;
            return this;
        }

        public b e(Integer num) {
            this.f14081d = num;
            return this;
        }

        public b f(C1916k c1916k) {
            this.f14078a = c1916k;
            return this;
        }

        public b() {
            this.f14078a = null;
            this.f14079b = null;
            this.f14080c = null;
            this.f14081d = null;
        }
    }

    public static b e() {
        return new b();
    }

    @Override // P7.g
    public Integer a() {
        return this.f14077e;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14076d;
    }

    public g8.b f() {
        return this.f14074b;
    }

    public g8.b g() {
        return this.f14075c;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1916k b() {
        return this.f14073a;
    }

    public C1911f(C1916k c1916k, g8.b bVar, g8.b bVar2, C4160a c4160a, Integer num) {
        this.f14073a = c1916k;
        this.f14074b = bVar;
        this.f14075c = bVar2;
        this.f14076d = c4160a;
        this.f14077e = num;
    }
}
