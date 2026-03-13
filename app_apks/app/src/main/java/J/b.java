package J;

import E.W0;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H.b f5852a;

        public a(H.b resolvedFeatureGroup) {
            AbstractC4862t.e(resolvedFeatureGroup, "resolvedFeatureGroup");
            this.f5852a = resolvedFeatureGroup;
        }

        public final H.b a() {
            return this.f5852a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC4862t.a(this.f5852a, ((a) obj).f5852a);
        }

        public int hashCode() {
            return this.f5852a.hashCode();
        }

        public String toString() {
            return "Supported(resolvedFeatureGroup=" + this.f5852a + ')';
        }
    }

    /* JADX INFO: renamed from: J.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0100b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0100b f5853a = new C0100b();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W0 f5854a;

        public c(W0 unsupportedUseCase) {
            AbstractC4862t.e(unsupportedUseCase, "unsupportedUseCase");
            this.f5854a = unsupportedUseCase;
        }

        public final W0 a() {
            return this.f5854a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC4862t.a(this.f5854a, ((c) obj).f5854a);
        }

        public int hashCode() {
            return this.f5854a.hashCode();
        }

        public String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.f5854a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final G.b f5856b;

        public d(String requiredUseCases, G.b featureRequiring) {
            AbstractC4862t.e(requiredUseCases, "requiredUseCases");
            AbstractC4862t.e(featureRequiring, "featureRequiring");
            this.f5855a = requiredUseCases;
            this.f5856b = featureRequiring;
        }

        public final G.b a() {
            return this.f5856b;
        }

        public final String b() {
            return this.f5855a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC4862t.a(this.f5855a, dVar.f5855a) && AbstractC4862t.a(this.f5856b, dVar.f5856b);
        }

        public int hashCode() {
            return (this.f5855a.hashCode() * 31) + this.f5856b.hashCode();
        }

        public String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.f5855a + ", featureRequiring=" + this.f5856b + ')';
        }
    }
}
