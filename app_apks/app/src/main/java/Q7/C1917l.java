package Q7;

import Q7.C1921p;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Q7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1917l extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1921p f14121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f14122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f14123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14124d;

    /* JADX INFO: renamed from: Q7.l$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1921p f14125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g8.b f14126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14127c;

        public C1917l a() throws GeneralSecurityException {
            C1921p c1921p = this.f14125a;
            if (c1921p == null || this.f14126b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c1921p.d() != this.f14126b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f14125a.a() && this.f14127c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14125a.a() && this.f14127c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1917l(this.f14125a, this.f14126b, b(), this.f14127c);
        }

        public final C4160a b() {
            if (this.f14125a.f() == C1921p.c.f14147d) {
                return Z7.y.f20395a;
            }
            if (this.f14125a.f() == C1921p.c.f14146c) {
                return Z7.y.a(this.f14127c.intValue());
            }
            if (this.f14125a.f() == C1921p.c.f14145b) {
                return Z7.y.b(this.f14127c.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f14125a.f());
        }

        public b c(Integer num) {
            this.f14127c = num;
            return this;
        }

        public b d(g8.b bVar) {
            this.f14126b = bVar;
            return this;
        }

        public b e(C1921p c1921p) {
            this.f14125a = c1921p;
            return this;
        }

        public b() {
            this.f14125a = null;
            this.f14126b = null;
            this.f14127c = null;
        }
    }

    public static b e() {
        return new b();
    }

    @Override // P7.g
    public Integer a() {
        return this.f14124d;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14123c;
    }

    public g8.b f() {
        return this.f14122b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1921p b() {
        return this.f14121a;
    }

    public C1917l(C1921p c1921p, g8.b bVar, C4160a c4160a, Integer num) {
        this.f14121a = c1921p;
        this.f14122b = bVar;
        this.f14123c = c4160a;
        this.f14124d = num;
    }
}
