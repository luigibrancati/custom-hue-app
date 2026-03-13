package Q7;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends AbstractC1908c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f14030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1908c f14033d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f14034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c f14036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC1908c f14037d;

        public static boolean b(c cVar, AbstractC1908c abstractC1908c) {
            if (cVar.equals(c.f14038b) && (abstractC1908c instanceof C1925u)) {
                return true;
            }
            if (cVar.equals(c.f14040d) && (abstractC1908c instanceof E)) {
                return true;
            }
            if (cVar.equals(c.f14039c) && (abstractC1908c instanceof u0)) {
                return true;
            }
            if (cVar.equals(c.f14041e) && (abstractC1908c instanceof C1916k)) {
                return true;
            }
            if (cVar.equals(c.f14042f) && (abstractC1908c instanceof C1921p)) {
                return true;
            }
            return cVar.equals(c.f14043g) && (abstractC1908c instanceof C1930z);
        }

        public V a() throws GeneralSecurityException {
            if (this.f14034a == null) {
                this.f14034a = d.f14046c;
            }
            if (this.f14035b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f14036c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            AbstractC1908c abstractC1908c = this.f14037d;
            if (abstractC1908c == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (abstractC1908c.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (b(this.f14036c, this.f14037d)) {
                return new V(this.f14034a, this.f14035b, this.f14036c, this.f14037d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f14036c.toString() + " when new keys are picked according to " + this.f14037d + ".");
        }

        public b c(AbstractC1908c abstractC1908c) {
            this.f14037d = abstractC1908c;
            return this;
        }

        public b d(c cVar) {
            this.f14036c = cVar;
            return this;
        }

        public b e(String str) {
            this.f14035b = str;
            return this;
        }

        public b f(d dVar) {
            this.f14034a = dVar;
            return this;
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f14038b = new c("ASSUME_AES_GCM");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f14039c = new c("ASSUME_XCHACHA20POLY1305");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14040d = new c("ASSUME_CHACHA20POLY1305");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f14041e = new c("ASSUME_AES_CTR_HMAC");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f14042f = new c("ASSUME_AES_EAX");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f14043g = new c("ASSUME_AES_GCM_SIV");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14044a;

        public c(String str) {
            this.f14044a = str;
        }

        public String toString() {
            return this.f14044a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f14045b = new d("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f14046c = new d("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f14047a;

        public d(String str) {
            this.f14047a = str;
        }

        public String toString() {
            return this.f14047a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f14030a != d.f14046c;
    }

    public AbstractC1908c c() {
        return this.f14033d;
    }

    public String d() {
        return this.f14031b;
    }

    public d e() {
        return this.f14030a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return v10.f14032c.equals(this.f14032c) && v10.f14033d.equals(this.f14033d) && v10.f14031b.equals(this.f14031b) && v10.f14030a.equals(this.f14030a);
    }

    public int hashCode() {
        return Objects.hash(V.class, this.f14031b, this.f14032c, this.f14033d, this.f14030a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f14031b + ", dekParsingStrategy: " + this.f14032c + ", dekParametersForNewKeys: " + this.f14033d + ", variant: " + this.f14030a + ")";
    }

    public V(d dVar, String str, c cVar, AbstractC1908c abstractC1908c) {
        this.f14030a = dVar;
        this.f14031b = str;
        this.f14032c = cVar;
        this.f14033d = abstractC1908c;
    }
}
