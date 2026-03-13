package a6;

import a6.u;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f21077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f21078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f21080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f21081g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f21082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f21083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f21084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f21085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f21086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f21087f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public x f21088g;

        @Override // a6.u.a
        public u a() {
            String str = "";
            if (this.f21082a == null) {
                str = " requestTimeMs";
            }
            if (this.f21083b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f21082a.longValue(), this.f21083b.longValue(), this.f21084c, this.f21085d, this.f21086e, this.f21087f, this.f21088g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a6.u.a
        public u.a b(o oVar) {
            this.f21084c = oVar;
            return this;
        }

        @Override // a6.u.a
        public u.a c(List list) {
            this.f21087f = list;
            return this;
        }

        @Override // a6.u.a
        public u.a d(Integer num) {
            this.f21085d = num;
            return this;
        }

        @Override // a6.u.a
        public u.a e(String str) {
            this.f21086e = str;
            return this;
        }

        @Override // a6.u.a
        public u.a f(x xVar) {
            this.f21088g = xVar;
            return this;
        }

        @Override // a6.u.a
        public u.a g(long j10) {
            this.f21082a = Long.valueOf(j10);
            return this;
        }

        @Override // a6.u.a
        public u.a h(long j10) {
            this.f21083b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // a6.u
    public o b() {
        return this.f21077c;
    }

    @Override // a6.u
    public List c() {
        return this.f21080f;
    }

    @Override // a6.u
    public Integer d() {
        return this.f21078d;
    }

    @Override // a6.u
    public String e() {
        return this.f21079e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f21075a == uVar.g() && this.f21076b == uVar.h() && ((oVar = this.f21077c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f21078d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f21079e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f21080f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.f21081g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // a6.u
    public x f() {
        return this.f21081g;
    }

    @Override // a6.u
    public long g() {
        return this.f21075a;
    }

    @Override // a6.u
    public long h() {
        return this.f21076b;
    }

    public int hashCode() {
        long j10 = this.f21075a;
        long j11 = this.f21076b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f21077c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f21078d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f21079e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f21080f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f21081g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f21075a + ", requestUptimeMs=" + this.f21076b + ", clientInfo=" + this.f21077c + ", logSource=" + this.f21078d + ", logSourceName=" + this.f21079e + ", logEvents=" + this.f21080f + ", qosTier=" + this.f21081g + "}";
    }

    public k(long j10, long j11, o oVar, Integer num, String str, List list, x xVar) {
        this.f21075a = j10;
        this.f21076b = j11;
        this.f21077c = oVar;
        this.f21078d = num;
        this.f21079e = str;
        this.f21080f = list;
        this.f21081g = xVar;
    }
}
