package V7;

import V7.e;
import Z7.y;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f17271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f17272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f17273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f17274d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f17275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g8.b f17276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f17277c;

        public a a() throws GeneralSecurityException {
            e eVar = this.f17275a;
            if (eVar == null || this.f17276b == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            }
            if (eVar.c() != this.f17276b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f17275a.a() && this.f17277c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f17275a.a() && this.f17277c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f17275a, this.f17276b, b(), this.f17277c);
        }

        public final C4160a b() {
            if (this.f17275a.d() == e.c.f17288d) {
                return y.f20395a;
            }
            if (this.f17275a.d() == e.c.f17287c) {
                return y.a(this.f17277c.intValue());
            }
            if (this.f17275a.d() == e.c.f17286b) {
                return y.b(this.f17277c.intValue());
            }
            throw new IllegalStateException("Unknown AesSivParameters.Variant: " + this.f17275a.d());
        }

        public b c(Integer num) {
            this.f17277c = num;
            return this;
        }

        public b d(g8.b bVar) {
            this.f17276b = bVar;
            return this;
        }

        public b e(e eVar) {
            this.f17275a = eVar;
            return this;
        }

        public b() {
            this.f17275a = null;
            this.f17276b = null;
            this.f17277c = null;
        }
    }

    public static b e() {
        return new b();
    }

    @Override // P7.g
    public Integer a() {
        return this.f17274d;
    }

    @Override // V7.g
    public C4160a c() {
        return this.f17273c;
    }

    public g8.b f() {
        return this.f17272b;
    }

    @Override // V7.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e b() {
        return this.f17271a;
    }

    public a(e eVar, g8.b bVar, C4160a c4160a, Integer num) {
        this.f17271a = eVar;
        this.f17272b = bVar;
        this.f17273c = c4160a;
        this.f17274d = num;
    }
}
