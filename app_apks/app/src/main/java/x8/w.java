package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends F.e.d.AbstractC0662e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.e.d.AbstractC0662e.b f47913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47916d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.AbstractC0662e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public F.e.d.AbstractC0662e.b f47917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f47920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f47921e;

        @Override // x8.F.e.d.AbstractC0662e.a
        public F.e.d.AbstractC0662e a() {
            F.e.d.AbstractC0662e.b bVar;
            String str;
            String str2;
            if (this.f47921e == 1 && (bVar = this.f47917a) != null && (str = this.f47918b) != null && (str2 = this.f47919c) != null) {
                return new w(bVar, str, str2, this.f47920d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47917a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f47918b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f47919c == null) {
                sb2.append(" parameterValue");
            }
            if ((this.f47921e & 1) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.AbstractC0662e.a
        public F.e.d.AbstractC0662e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f47918b = str;
            return this;
        }

        @Override // x8.F.e.d.AbstractC0662e.a
        public F.e.d.AbstractC0662e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f47919c = str;
            return this;
        }

        @Override // x8.F.e.d.AbstractC0662e.a
        public F.e.d.AbstractC0662e.a d(F.e.d.AbstractC0662e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f47917a = bVar;
            return this;
        }

        @Override // x8.F.e.d.AbstractC0662e.a
        public F.e.d.AbstractC0662e.a e(long j10) {
            this.f47920d = j10;
            this.f47921e = (byte) (this.f47921e | 1);
            return this;
        }
    }

    @Override // x8.F.e.d.AbstractC0662e
    public String b() {
        return this.f47914b;
    }

    @Override // x8.F.e.d.AbstractC0662e
    public String c() {
        return this.f47915c;
    }

    @Override // x8.F.e.d.AbstractC0662e
    public F.e.d.AbstractC0662e.b d() {
        return this.f47913a;
    }

    @Override // x8.F.e.d.AbstractC0662e
    public long e() {
        return this.f47916d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0662e) {
            F.e.d.AbstractC0662e abstractC0662e = (F.e.d.AbstractC0662e) obj;
            if (this.f47913a.equals(abstractC0662e.d()) && this.f47914b.equals(abstractC0662e.b()) && this.f47915c.equals(abstractC0662e.c()) && this.f47916d == abstractC0662e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f47913a.hashCode() ^ 1000003) * 1000003) ^ this.f47914b.hashCode()) * 1000003) ^ this.f47915c.hashCode()) * 1000003;
        long j10 = this.f47916d;
        return ((int) (j10 ^ (j10 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f47913a + ", parameterKey=" + this.f47914b + ", parameterValue=" + this.f47915c + ", templateVersion=" + this.f47916d + "}";
    }

    public w(F.e.d.AbstractC0662e.b bVar, String str, String str2, long j10) {
        this.f47913a = bVar;
        this.f47914b = str;
        this.f47915c = str2;
        this.f47916d = j10;
    }
}
