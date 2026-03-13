package a8;

import a8.n;
import g8.C4160a;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f21142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f21143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4160a f21144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f21145d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f21146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g8.b f21147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f21148c;

        public i a() throws GeneralSecurityException {
            n nVar = this.f21146a;
            if (nVar == null || this.f21147b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (nVar.e() != this.f21147b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f21146a.a() && this.f21148c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f21146a.a() && this.f21148c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f21146a, this.f21147b, b(), this.f21148c);
        }

        public final C4160a b() {
            if (this.f21146a.g() == n.d.f21172e) {
                return Z7.y.f20395a;
            }
            if (this.f21146a.g() == n.d.f21171d || this.f21146a.g() == n.d.f21170c) {
                return Z7.y.a(this.f21148c.intValue());
            }
            if (this.f21146a.g() == n.d.f21169b) {
                return Z7.y.b(this.f21148c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f21146a.g());
        }

        public b c(Integer num) {
            this.f21148c = num;
            return this;
        }

        public b d(g8.b bVar) {
            this.f21147b = bVar;
            return this;
        }

        public b e(n nVar) {
            this.f21146a = nVar;
            return this;
        }

        public b() {
            this.f21146a = null;
            this.f21147b = null;
            this.f21148c = null;
        }
    }

    public static b e() {
        return new b();
    }

    @Override // P7.g
    public Integer a() {
        return this.f21145d;
    }

    @Override // a8.p
    public C4160a c() {
        return this.f21144c;
    }

    public g8.b f() {
        return this.f21143b;
    }

    @Override // a8.p
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n b() {
        return this.f21142a;
    }

    public i(n nVar, g8.b bVar, C4160a c4160a, Integer num) {
        this.f21142a = nVar;
        this.f21143b = bVar;
        this.f21144c = c4160a;
        this.f21145d = num;
    }
}
