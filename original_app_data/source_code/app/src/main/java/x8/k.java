package x8;

import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends F.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47795i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f47799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f47800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f47801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f47802g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f47803h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f47804i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f47805j;

        @Override // x8.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f47805j == 63 && (str = this.f47797b) != null && (str2 = this.f47803h) != null && (str3 = this.f47804i) != null) {
                return new k(this.f47796a, str, this.f47798c, this.f47799d, this.f47800e, this.f47801f, this.f47802g, str2, str3);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f47805j & 1) == 0) {
                sb2.append(" arch");
            }
            if (this.f47797b == null) {
                sb2.append(" model");
            }
            if ((this.f47805j & 2) == 0) {
                sb2.append(" cores");
            }
            if ((this.f47805j & 4) == 0) {
                sb2.append(" ram");
            }
            if ((this.f47805j & 8) == 0) {
                sb2.append(" diskSpace");
            }
            if ((this.f47805j & 16) == 0) {
                sb2.append(" simulator");
            }
            if ((this.f47805j & 32) == 0) {
                sb2.append(" state");
            }
            if (this.f47803h == null) {
                sb2.append(" manufacturer");
            }
            if (this.f47804i == null) {
                sb2.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.c.a
        public F.e.c.a b(int i10) {
            this.f47796a = i10;
            this.f47805j = (byte) (this.f47805j | 1);
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a c(int i10) {
            this.f47798c = i10;
            this.f47805j = (byte) (this.f47805j | 2);
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a d(long j10) {
            this.f47800e = j10;
            this.f47805j = (byte) (this.f47805j | 8);
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f47803h = str;
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f47797b = str;
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f47804i = str;
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a h(long j10) {
            this.f47799d = j10;
            this.f47805j = (byte) (this.f47805j | 4);
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a i(boolean z10) {
            this.f47801f = z10;
            this.f47805j = (byte) (this.f47805j | 16);
            return this;
        }

        @Override // x8.F.e.c.a
        public F.e.c.a j(int i10) {
            this.f47802g = i10;
            this.f47805j = (byte) (this.f47805j | 32);
            return this;
        }
    }

    @Override // x8.F.e.c
    public int b() {
        return this.f47787a;
    }

    @Override // x8.F.e.c
    public int c() {
        return this.f47789c;
    }

    @Override // x8.F.e.c
    public long d() {
        return this.f47791e;
    }

    @Override // x8.F.e.c
    public String e() {
        return this.f47794h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.c) {
            F.e.c cVar = (F.e.c) obj;
            if (this.f47787a == cVar.b() && this.f47788b.equals(cVar.f()) && this.f47789c == cVar.c() && this.f47790d == cVar.h() && this.f47791e == cVar.d() && this.f47792f == cVar.j() && this.f47793g == cVar.i() && this.f47794h.equals(cVar.e()) && this.f47795i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.e.c
    public String f() {
        return this.f47788b;
    }

    @Override // x8.F.e.c
    public String g() {
        return this.f47795i;
    }

    @Override // x8.F.e.c
    public long h() {
        return this.f47790d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f47787a ^ 1000003) * 1000003) ^ this.f47788b.hashCode()) * 1000003) ^ this.f47789c) * 1000003;
        long j10 = this.f47790d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47791e;
        return this.f47795i.hashCode() ^ ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f47792f ? 1231 : 1237)) * 1000003) ^ this.f47793g) * 1000003) ^ this.f47794h.hashCode()) * 1000003);
    }

    @Override // x8.F.e.c
    public int i() {
        return this.f47793g;
    }

    @Override // x8.F.e.c
    public boolean j() {
        return this.f47792f;
    }

    public String toString() {
        return "Device{arch=" + this.f47787a + ", model=" + this.f47788b + ", cores=" + this.f47789c + ", ram=" + this.f47790d + ", diskSpace=" + this.f47791e + ", simulator=" + this.f47792f + ", state=" + this.f47793g + ", manufacturer=" + this.f47794h + ", modelClass=" + this.f47795i + "}";
    }

    public k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f47787a = i10;
        this.f47788b = str;
        this.f47789c = i11;
        this.f47790d = j10;
        this.f47791e = j11;
        this.f47792f = z10;
        this.f47793g = i12;
        this.f47794h = str2;
        this.f47795i = str3;
    }
}
