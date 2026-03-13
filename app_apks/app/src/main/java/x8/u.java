package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends F.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f47898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47903f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f47904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f47906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f47908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f47909f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f47910g;

        @Override // x8.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f47910g == 31) {
                return new u(this.f47904a, this.f47905b, this.f47906c, this.f47907d, this.f47908e, this.f47909f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f47910g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f47910g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f47910g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f47910g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f47910g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.c.a
        public F.e.d.c.a b(Double d10) {
            this.f47904a = d10;
            return this;
        }

        @Override // x8.F.e.d.c.a
        public F.e.d.c.a c(int i10) {
            this.f47905b = i10;
            this.f47910g = (byte) (this.f47910g | 1);
            return this;
        }

        @Override // x8.F.e.d.c.a
        public F.e.d.c.a d(long j10) {
            this.f47909f = j10;
            this.f47910g = (byte) (this.f47910g | 16);
            return this;
        }

        @Override // x8.F.e.d.c.a
        public F.e.d.c.a e(int i10) {
            this.f47907d = i10;
            this.f47910g = (byte) (this.f47910g | 4);
            return this;
        }

        @Override // x8.F.e.d.c.a
        public F.e.d.c.a f(boolean z10) {
            this.f47906c = z10;
            this.f47910g = (byte) (this.f47910g | 2);
            return this;
        }

        @Override // x8.F.e.d.c.a
        public F.e.d.c.a g(long j10) {
            this.f47908e = j10;
            this.f47910g = (byte) (this.f47910g | 8);
            return this;
        }
    }

    @Override // x8.F.e.d.c
    public Double b() {
        return this.f47898a;
    }

    @Override // x8.F.e.d.c
    public int c() {
        return this.f47899b;
    }

    @Override // x8.F.e.d.c
    public long d() {
        return this.f47903f;
    }

    @Override // x8.F.e.d.c
    public int e() {
        return this.f47901d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.c) {
            F.e.d.c cVar = (F.e.d.c) obj;
            Double d10 = this.f47898a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f47899b == cVar.c() && this.f47900c == cVar.g() && this.f47901d == cVar.e() && this.f47902e == cVar.f() && this.f47903f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x8.F.e.d.c
    public long f() {
        return this.f47902e;
    }

    @Override // x8.F.e.d.c
    public boolean g() {
        return this.f47900c;
    }

    public int hashCode() {
        Double d10 = this.f47898a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f47899b) * 1000003) ^ (this.f47900c ? 1231 : 1237)) * 1000003) ^ this.f47901d) * 1000003;
        long j10 = this.f47902e;
        long j11 = this.f47903f;
        return ((int) (j11 ^ (j11 >>> 32))) ^ ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f47898a + ", batteryVelocity=" + this.f47899b + ", proximityOn=" + this.f47900c + ", orientation=" + this.f47901d + ", ramUsed=" + this.f47902e + ", diskUsed=" + this.f47903f + "}";
    }

    public u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f47898a = d10;
        this.f47899b = i10;
        this.f47900c = z10;
        this.f47901d = i11;
        this.f47902e = j10;
        this.f47903f = j11;
    }
}
