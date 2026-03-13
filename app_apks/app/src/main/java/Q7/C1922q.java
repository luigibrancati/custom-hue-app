package Q7;

import Q7.C1925u;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: Q7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1922q extends AbstractC1907b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1925u f14154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f14155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f14156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f14157d;

    /* JADX INFO: renamed from: Q7.q$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C1925u f14158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g8.b f14159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f14160c;

        public C1922q a() throws GeneralSecurityException {
            C1925u c1925u = this.f14158a;
            if (c1925u == null || this.f14159b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c1925u.d() != this.f14159b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f14158a.a() && this.f14160c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14158a.a() && this.f14160c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C1922q(this.f14158a, this.f14159b, b(), this.f14160c);
        }

        public final C4160a b() {
            if (this.f14158a.f() == C1925u.c.f14184d) {
                return Z7.y.f20395a;
            }
            if (this.f14158a.f() == C1925u.c.f14183c) {
                return Z7.y.a(this.f14160c.intValue());
            }
            if (this.f14158a.f() == C1925u.c.f14182b) {
                return Z7.y.b(this.f14160c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f14158a.f());
        }

        public b c(Integer num) {
            this.f14160c = num;
            return this;
        }

        public b d(g8.b bVar) {
            this.f14159b = bVar;
            return this;
        }

        public b e(C1925u c1925u) {
            this.f14158a = c1925u;
            return this;
        }

        public b() {
            this.f14158a = null;
            this.f14159b = null;
            this.f14160c = null;
        }
    }

    public static b e() {
        return new b();
    }

    @Override // P7.g
    public Integer a() {
        return this.f14157d;
    }

    @Override // Q7.AbstractC1907b
    public C4160a c() {
        return this.f14156c;
    }

    public g8.b f() {
        return this.f14155b;
    }

    @Override // Q7.AbstractC1907b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1925u b() {
        return this.f14154a;
    }

    public C1922q(C1925u c1925u, g8.b bVar, C4160a c4160a, Integer num) {
        this.f14154a = c1925u;
        this.f14155b = bVar;
        this.f14156c = c4160a;
        this.f14157d = num;
    }
}
