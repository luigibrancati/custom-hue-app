package a6;

import a6.t;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f21058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f21059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f21061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f21064h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f21065i;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f21066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f21067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f21068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f21069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f21070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f21071f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f21072g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public w f21073h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q f21074i;

        @Override // a6.t.a
        public t a() {
            String str = "";
            if (this.f21066a == null) {
                str = " eventTimeMs";
            }
            if (this.f21069d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f21072g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f21066a.longValue(), this.f21067b, this.f21068c, this.f21069d.longValue(), this.f21070e, this.f21071f, this.f21072g.longValue(), this.f21073h, this.f21074i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // a6.t.a
        public t.a b(p pVar) {
            this.f21068c = pVar;
            return this;
        }

        @Override // a6.t.a
        public t.a c(Integer num) {
            this.f21067b = num;
            return this;
        }

        @Override // a6.t.a
        public t.a d(long j10) {
            this.f21066a = Long.valueOf(j10);
            return this;
        }

        @Override // a6.t.a
        public t.a e(long j10) {
            this.f21069d = Long.valueOf(j10);
            return this;
        }

        @Override // a6.t.a
        public t.a f(q qVar) {
            this.f21074i = qVar;
            return this;
        }

        @Override // a6.t.a
        public t.a g(w wVar) {
            this.f21073h = wVar;
            return this;
        }

        @Override // a6.t.a
        public t.a h(byte[] bArr) {
            this.f21070e = bArr;
            return this;
        }

        @Override // a6.t.a
        public t.a i(String str) {
            this.f21071f = str;
            return this;
        }

        @Override // a6.t.a
        public t.a j(long j10) {
            this.f21072g = Long.valueOf(j10);
            return this;
        }
    }

    @Override // a6.t
    public p b() {
        return this.f21059c;
    }

    @Override // a6.t
    public Integer c() {
        return this.f21058b;
    }

    @Override // a6.t
    public long d() {
        return this.f21057a;
    }

    @Override // a6.t
    public long e() {
        return this.f21060d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f21057a == tVar.d() && ((num = this.f21058b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f21059c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f21060d == tVar.e()) {
                if (Arrays.equals(this.f21061e, tVar instanceof j ? ((j) tVar).f21061e : tVar.h()) && ((str = this.f21062f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f21063g == tVar.j() && ((wVar = this.f21064h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f21065i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // a6.t
    public q f() {
        return this.f21065i;
    }

    @Override // a6.t
    public w g() {
        return this.f21064h;
    }

    @Override // a6.t
    public byte[] h() {
        return this.f21061e;
    }

    public int hashCode() {
        long j10 = this.f21057a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f21058b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f21059c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f21060d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f21061e)) * 1000003;
        String str = this.f21062f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f21063g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f21064h;
        int iHashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f21065i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // a6.t
    public String i() {
        return this.f21062f;
    }

    @Override // a6.t
    public long j() {
        return this.f21063g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f21057a + ", eventCode=" + this.f21058b + ", complianceData=" + this.f21059c + ", eventUptimeMs=" + this.f21060d + ", sourceExtension=" + Arrays.toString(this.f21061e) + ", sourceExtensionJsonProto3=" + this.f21062f + ", timezoneOffsetSeconds=" + this.f21063g + ", networkConnectionInfo=" + this.f21064h + ", experimentIds=" + this.f21065i + "}";
    }

    public j(long j10, Integer num, p pVar, long j11, byte[] bArr, String str, long j12, w wVar, q qVar) {
        this.f21057a = j10;
        this.f21058b = num;
        this.f21059c = pVar;
        this.f21060d = j11;
        this.f21061e = bArr;
        this.f21062f = str;
        this.f21063g = j12;
        this.f21064h = wVar;
        this.f21065i = qVar;
    }
}
