package a8;

import a8.C2654f;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: a8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2649a extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2654f f21117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f21118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f21119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f21120d;

    /* JADX INFO: renamed from: a8.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C2654f f21121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g8.b f21122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f21123c;

        public C2649a a() throws GeneralSecurityException {
            C2654f c2654f = this.f21121a;
            if (c2654f == null || this.f21122b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c2654f.d() != this.f21122b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f21121a.a() && this.f21123c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f21121a.a() && this.f21123c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C2649a(this.f21121a, this.f21122b, b(), this.f21123c);
        }

        public final C4160a b() {
            if (this.f21121a.f() == C2654f.c.f21137e) {
                return Z7.y.f20395a;
            }
            if (this.f21121a.f() == C2654f.c.f21136d || this.f21121a.f() == C2654f.c.f21135c) {
                return Z7.y.a(this.f21123c.intValue());
            }
            if (this.f21121a.f() == C2654f.c.f21134b) {
                return Z7.y.b(this.f21123c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f21121a.f());
        }

        public b c(g8.b bVar) {
            this.f21122b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f21123c = num;
            return this;
        }

        public b e(C2654f c2654f) {
            this.f21121a = c2654f;
            return this;
        }

        public b() {
            this.f21121a = null;
            this.f21122b = null;
            this.f21123c = null;
        }
    }

    public static b e() {
        return new b();
    }

    @Override // P7.g
    public Integer a() {
        return this.f21120d;
    }

    @Override // a8.p
    public C4160a c() {
        return this.f21119c;
    }

    public g8.b f() {
        return this.f21118b;
    }

    @Override // a8.p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2654f b() {
        return this.f21117a;
    }

    public C2649a(C2654f c2654f, g8.b bVar, C4160a c4160a, Integer num) {
        this.f21117a = c2654f;
        this.f21118b = bVar;
        this.f21119c = c4160a;
        this.f21120d = num;
    }
}
