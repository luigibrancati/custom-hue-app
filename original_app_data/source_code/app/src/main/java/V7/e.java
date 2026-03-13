package V7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f17283b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f17284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f17285b;

        public e a() throws GeneralSecurityException {
            Integer num = this.f17284a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f17285b != null) {
                return new e(num.intValue(), this.f17285b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 32 && i10 != 48 && i10 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i10)));
            }
            this.f17284a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f17285b = cVar;
            return this;
        }

        public b() {
            this.f17284a = null;
            this.f17285b = c.f17288d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f17286b = new c("TINK");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f17287c = new c("CRUNCHY");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f17288d = new c("NO_PREFIX");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17289a;

        public c(String str) {
            this.f17289a = str;
        }

        public String toString() {
            return this.f17289a;
        }
    }

    public static b b() {
        return new b();
    }

    @Override // P7.v
    public boolean a() {
        return this.f17283b != c.f17288d;
    }

    public int c() {
        return this.f17282a;
    }

    public c d() {
        return this.f17283b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.c() == c() && eVar.d() == d();
    }

    public int hashCode() {
        return Objects.hash(e.class, Integer.valueOf(this.f17282a), this.f17283b);
    }

    public String toString() {
        return "AesSiv Parameters (variant: " + this.f17283b + ", " + this.f17282a + "-byte key)";
    }

    public e(int i10, c cVar) {
        this.f17282a = i10;
        this.f17283b = cVar;
    }
}
