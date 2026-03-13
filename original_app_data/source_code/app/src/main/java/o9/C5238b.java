package o9;

import o9.AbstractC5240d;

/* JADX INFO: renamed from: o9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5238b extends AbstractC5240d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f41310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f41311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f41312f;

    /* JADX INFO: renamed from: o9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0550b extends AbstractC5240d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f41313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f41314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f41315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f41316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f41317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f41318f;

        @Override // o9.AbstractC5240d.a
        public AbstractC5240d a() {
            if (this.f41318f == 1 && this.f41313a != null && this.f41314b != null && this.f41315c != null && this.f41316d != null) {
                return new C5238b(this.f41313a, this.f41314b, this.f41315c, this.f41316d, this.f41317e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f41313a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f41314b == null) {
                sb2.append(" variantId");
            }
            if (this.f41315c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f41316d == null) {
                sb2.append(" parameterValue");
            }
            if ((this.f41318f & 1) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // o9.AbstractC5240d.a
        public AbstractC5240d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f41315c = str;
            return this;
        }

        @Override // o9.AbstractC5240d.a
        public AbstractC5240d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f41316d = str;
            return this;
        }

        @Override // o9.AbstractC5240d.a
        public AbstractC5240d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f41313a = str;
            return this;
        }

        @Override // o9.AbstractC5240d.a
        public AbstractC5240d.a e(long j10) {
            this.f41317e = j10;
            this.f41318f = (byte) (this.f41318f | 1);
            return this;
        }

        @Override // o9.AbstractC5240d.a
        public AbstractC5240d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f41314b = str;
            return this;
        }
    }

    @Override // o9.AbstractC5240d
    public String b() {
        return this.f41310d;
    }

    @Override // o9.AbstractC5240d
    public String c() {
        return this.f41311e;
    }

    @Override // o9.AbstractC5240d
    public String d() {
        return this.f41308b;
    }

    @Override // o9.AbstractC5240d
    public long e() {
        return this.f41312f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5240d) {
            AbstractC5240d abstractC5240d = (AbstractC5240d) obj;
            if (this.f41308b.equals(abstractC5240d.d()) && this.f41309c.equals(abstractC5240d.f()) && this.f41310d.equals(abstractC5240d.b()) && this.f41311e.equals(abstractC5240d.c()) && this.f41312f == abstractC5240d.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // o9.AbstractC5240d
    public String f() {
        return this.f41309c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f41308b.hashCode() ^ 1000003) * 1000003) ^ this.f41309c.hashCode()) * 1000003) ^ this.f41310d.hashCode()) * 1000003) ^ this.f41311e.hashCode()) * 1000003;
        long j10 = this.f41312f;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f41308b + ", variantId=" + this.f41309c + ", parameterKey=" + this.f41310d + ", parameterValue=" + this.f41311e + ", templateVersion=" + this.f41312f + "}";
    }

    public C5238b(String str, String str2, String str3, String str4, long j10) {
        this.f41308b = str;
        this.f41309c = str2;
        this.f41310d = str3;
        this.f41311e = str4;
        this.f41312f = j10;
    }
}
