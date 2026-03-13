package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends F.e.d.a.b.AbstractC0656e.AbstractC0658b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47882e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f47883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f47886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f47888f;

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a
        public F.e.d.a.b.AbstractC0656e.AbstractC0658b a() {
            String str;
            if (this.f47888f == 7 && (str = this.f47884b) != null) {
                return new s(this.f47883a, str, this.f47885c, this.f47886d, this.f47887e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f47888f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f47884b == null) {
                sb2.append(" symbol");
            }
            if ((this.f47888f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f47888f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a
        public F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a b(String str) {
            this.f47885c = str;
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a
        public F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a c(int i10) {
            this.f47887e = i10;
            this.f47888f = (byte) (this.f47888f | 4);
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a
        public F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a d(long j10) {
            this.f47886d = j10;
            this.f47888f = (byte) (this.f47888f | 2);
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a
        public F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a e(long j10) {
            this.f47883a = j10;
            this.f47888f = (byte) (this.f47888f | 1);
            return this;
        }

        @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a
        public F.e.d.a.b.AbstractC0656e.AbstractC0658b.AbstractC0659a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f47884b = str;
            return this;
        }
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b
    public String b() {
        return this.f47880c;
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b
    public int c() {
        return this.f47882e;
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b
    public long d() {
        return this.f47881d;
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b
    public long e() {
        return this.f47878a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0656e.AbstractC0658b) {
            F.e.d.a.b.AbstractC0656e.AbstractC0658b abstractC0658b = (F.e.d.a.b.AbstractC0656e.AbstractC0658b) obj;
            if (this.f47878a == abstractC0658b.e() && this.f47879b.equals(abstractC0658b.f()) && ((str = this.f47880c) != null ? str.equals(abstractC0658b.b()) : abstractC0658b.b() == null) && this.f47881d == abstractC0658b.d() && this.f47882e == abstractC0658b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.e.d.a.b.AbstractC0656e.AbstractC0658b
    public String f() {
        return this.f47879b;
    }

    public int hashCode() {
        long j10 = this.f47878a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f47879b.hashCode()) * 1000003;
        String str = this.f47880c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f47881d;
        return this.f47882e ^ ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f47878a + ", symbol=" + this.f47879b + ", file=" + this.f47880c + ", offset=" + this.f47881d + ", importance=" + this.f47882e + "}";
    }

    public s(long j10, String str, String str2, long j11, int i10) {
        this.f47878a = j10;
        this.f47879b = str;
        this.f47880c = str2;
        this.f47881d = j11;
        this.f47882e = i10;
    }
}
