package Q7;

import Q7.C1930z;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Q7.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1926v extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1930z f14191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f14192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f14193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14194d;

    /* JADX INFO: renamed from: Q7.v$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1930z f14195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g8.b f14196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14197c;

        public C1926v a() throws GeneralSecurityException {
            C1930z c1930z = this.f14195a;
            if (c1930z == null || this.f14196b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c1930z.c() != this.f14196b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f14195a.a() && this.f14197c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14195a.a() && this.f14197c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1926v(this.f14195a, this.f14196b, b(), this.f14197c);
        }

        public final C4160a b() {
            if (this.f14195a.d() == C1930z.c.f14208d) {
                return Z7.y.f20395a;
            }
            if (this.f14195a.d() == C1930z.c.f14207c) {
                return Z7.y.a(this.f14197c.intValue());
            }
            if (this.f14195a.d() == C1930z.c.f14206b) {
                return Z7.y.b(this.f14197c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f14195a.d());
        }

        public b c(Integer num) {
            this.f14197c = num;
            return this;
        }

        public b d(g8.b bVar) {
            this.f14196b = bVar;
            return this;
        }

        public b e(C1930z c1930z) {
            this.f14195a = c1930z;
            return this;
        }

        public b() {
            this.f14195a = null;
            this.f14196b = null;
            this.f14197c = null;
        }
    }

    public static b e() {
        return new b();
    }

    @Override // P7.g
    public Integer a() {
        return this.f14194d;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14193c;
    }

    public g8.b f() {
        return this.f14192b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1930z b() {
        return this.f14191a;
    }

    public C1926v(C1930z c1930z, g8.b bVar, C4160a c4160a, Integer num) {
        this.f14191a = c1930z;
        this.f14192b = bVar;
        this.f14193c = c4160a;
        this.f14194d = num;
    }
}
