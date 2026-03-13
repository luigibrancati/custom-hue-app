package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends F.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.e.d.a f47808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.e.d.c f47809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F.e.d.AbstractC0661d f47810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F.e.d.f f47811f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f47812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public F.e.d.a f47814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public F.e.d.c f47815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public F.e.d.AbstractC0661d f47816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public F.e.d.f f47817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f47818g;

        @Override // x8.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f47818g == 1 && (str = this.f47813b) != null && (aVar = this.f47814c) != null && (cVar = this.f47815d) != null) {
                return new l(this.f47812a, str, aVar, cVar, this.f47816e, this.f47817f);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((1 & this.f47818g) == 0) {
                sb2.append(" timestamp");
            }
            if (this.f47813b == null) {
                sb2.append(" type");
            }
            if (this.f47814c == null) {
                sb2.append(" app");
            }
            if (this.f47815d == null) {
                sb2.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f47814c = aVar;
            return this;
        }

        @Override // x8.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f47815d = cVar;
            return this;
        }

        @Override // x8.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0661d abstractC0661d) {
            this.f47816e = abstractC0661d;
            return this;
        }

        @Override // x8.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f47817f = fVar;
            return this;
        }

        @Override // x8.F.e.d.b
        public F.e.d.b f(long j10) {
            this.f47812a = j10;
            this.f47818g = (byte) (this.f47818g | 1);
            return this;
        }

        @Override // x8.F.e.d.b
        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f47813b = str;
            return this;
        }

        public b() {
        }

        public b(F.e.d dVar) {
            this.f47812a = dVar.f();
            this.f47813b = dVar.g();
            this.f47814c = dVar.b();
            this.f47815d = dVar.c();
            this.f47816e = dVar.d();
            this.f47817f = dVar.e();
            this.f47818g = (byte) 1;
        }
    }

    @Override // x8.F.e.d
    public F.e.d.a b() {
        return this.f47808c;
    }

    @Override // x8.F.e.d
    public F.e.d.c c() {
        return this.f47809d;
    }

    @Override // x8.F.e.d
    public F.e.d.AbstractC0661d d() {
        return this.f47810e;
    }

    @Override // x8.F.e.d
    public F.e.d.f e() {
        return this.f47811f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0661d abstractC0661d;
        F.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d) {
            F.e.d dVar = (F.e.d) obj;
            if (this.f47806a == dVar.f() && this.f47807b.equals(dVar.g()) && this.f47808c.equals(dVar.b()) && this.f47809d.equals(dVar.c()) && ((abstractC0661d = this.f47810e) != null ? abstractC0661d.equals(dVar.d()) : dVar.d() == null) && ((fVar = this.f47811f) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.e.d
    public long f() {
        return this.f47806a;
    }

    @Override // x8.F.e.d
    public String g() {
        return this.f47807b;
    }

    @Override // x8.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f47806a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f47807b.hashCode()) * 1000003) ^ this.f47808c.hashCode()) * 1000003) ^ this.f47809d.hashCode()) * 1000003;
        F.e.d.AbstractC0661d abstractC0661d = this.f47810e;
        int iHashCode2 = (iHashCode ^ (abstractC0661d == null ? 0 : abstractC0661d.hashCode())) * 1000003;
        F.e.d.f fVar = this.f47811f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f47806a + ", type=" + this.f47807b + ", app=" + this.f47808c + ", device=" + this.f47809d + ", log=" + this.f47810e + ", rollouts=" + this.f47811f + "}";
    }

    public l(long j10, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0661d abstractC0661d, F.e.d.f fVar) {
        this.f47806a = j10;
        this.f47807b = str;
        this.f47808c = aVar;
        this.f47809d = cVar;
        this.f47810e = abstractC0661d;
        this.f47811f = fVar;
    }
}
