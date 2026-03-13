package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends F.e.d.a.b.AbstractC0650a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47847d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.b.AbstractC0650a.AbstractC0651a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f47848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f47849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f47851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f47852e;

        @Override // x8.F.e.d.a.b.AbstractC0650a.AbstractC0651a
        public F.e.d.a.b.AbstractC0650a a() {
            String str;
            if (this.f47852e == 3 && (str = this.f47850c) != null) {
                return new o(this.f47848a, this.f47849b, str, this.f47851d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f47852e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f47852e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f47850c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.b.AbstractC0650a.AbstractC0651a
        public F.e.d.a.b.AbstractC0650a.AbstractC0651a b(long j10) {
            this.f47848a = j10;
            this.f47852e = (byte) (this.f47852e | 1);
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0650a.AbstractC0651a
        public F.e.d.a.b.AbstractC0650a.AbstractC0651a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f47850c = str;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0650a.AbstractC0651a
        public F.e.d.a.b.AbstractC0650a.AbstractC0651a d(long j10) {
            this.f47849b = j10;
            this.f47852e = (byte) (this.f47852e | 2);
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0650a.AbstractC0651a
        public F.e.d.a.b.AbstractC0650a.AbstractC0651a e(String str) {
            this.f47851d = str;
            return this;
        }
    }

    @Override // x8.F.e.d.a.b.AbstractC0650a
    public long b() {
        return this.f47844a;
    }

    @Override // x8.F.e.d.a.b.AbstractC0650a
    public String c() {
        return this.f47846c;
    }

    @Override // x8.F.e.d.a.b.AbstractC0650a
    public long d() {
        return this.f47845b;
    }

    @Override // x8.F.e.d.a.b.AbstractC0650a
    public String e() {
        return this.f47847d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0650a) {
            F.e.d.a.b.AbstractC0650a abstractC0650a = (F.e.d.a.b.AbstractC0650a) obj;
            if (this.f47844a == abstractC0650a.b() && this.f47845b == abstractC0650a.d() && this.f47846c.equals(abstractC0650a.c()) && ((str = this.f47847d) != null ? str.equals(abstractC0650a.e()) : abstractC0650a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f47844a;
        long j11 = this.f47845b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f47846c.hashCode()) * 1000003;
        String str = this.f47847d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f47844a + ", size=" + this.f47845b + ", name=" + this.f47846c + ", uuid=" + this.f47847d + "}";
    }

    public o(long j10, long j11, String str, String str2) {
        this.f47844a = j10;
        this.f47845b = j11;
        this.f47846c = str;
        this.f47847d = str2;
    }
}
