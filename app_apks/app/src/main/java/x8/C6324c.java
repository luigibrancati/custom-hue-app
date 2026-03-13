package x8;

import java.util.List;
import x8.F;

/* JADX INFO: renamed from: x8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6324c extends F.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f47717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f47719i;

    /* JADX INFO: renamed from: x8.c$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f47724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f47725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f47726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f47727h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f47728i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f47729j;

        @Override // x8.F.a.b
        public F.a a() {
            String str;
            if (this.f47729j == 63 && (str = this.f47721b) != null) {
                return new C6324c(this.f47720a, str, this.f47722c, this.f47723d, this.f47724e, this.f47725f, this.f47726g, this.f47727h, this.f47728i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f47729j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f47721b == null) {
                sb2.append(" processName");
            }
            if ((this.f47729j & 2) == 0) {
                sb2.append(" reasonCode");
            }
            if ((this.f47729j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f47729j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f47729j & 16) == 0) {
                sb2.append(" rss");
            }
            if ((this.f47729j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.a.b
        public F.a.b b(List list) {
            this.f47728i = list;
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b c(int i10) {
            this.f47723d = i10;
            this.f47729j = (byte) (this.f47729j | 4);
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b d(int i10) {
            this.f47720a = i10;
            this.f47729j = (byte) (this.f47729j | 1);
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f47721b = str;
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b f(long j10) {
            this.f47724e = j10;
            this.f47729j = (byte) (this.f47729j | 8);
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b g(int i10) {
            this.f47722c = i10;
            this.f47729j = (byte) (this.f47729j | 2);
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b h(long j10) {
            this.f47725f = j10;
            this.f47729j = (byte) (this.f47729j | 16);
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b i(long j10) {
            this.f47726g = j10;
            this.f47729j = (byte) (this.f47729j | 32);
            return this;
        }

        @Override // x8.F.a.b
        public F.a.b j(String str) {
            this.f47727h = str;
            return this;
        }
    }

    @Override // x8.F.a
    public List b() {
        return this.f47719i;
    }

    @Override // x8.F.a
    public int c() {
        return this.f47714d;
    }

    @Override // x8.F.a
    public int d() {
        return this.f47711a;
    }

    @Override // x8.F.a
    public String e() {
        return this.f47712b;
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a) {
            F.a aVar = (F.a) obj;
            if (this.f47711a == aVar.d() && this.f47712b.equals(aVar.e()) && this.f47713c == aVar.g() && this.f47714d == aVar.c() && this.f47715e == aVar.f() && this.f47716f == aVar.h() && this.f47717g == aVar.i() && ((str = this.f47718h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.f47719i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.a
    public long f() {
        return this.f47715e;
    }

    @Override // x8.F.a
    public int g() {
        return this.f47713c;
    }

    @Override // x8.F.a
    public long h() {
        return this.f47716f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f47711a ^ 1000003) * 1000003) ^ this.f47712b.hashCode()) * 1000003) ^ this.f47713c) * 1000003) ^ this.f47714d) * 1000003;
        long j10 = this.f47715e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47716f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f47717g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f47718h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f47719i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // x8.F.a
    public long i() {
        return this.f47717g;
    }

    @Override // x8.F.a
    public String j() {
        return this.f47718h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f47711a + ", processName=" + this.f47712b + ", reasonCode=" + this.f47713c + ", importance=" + this.f47714d + ", pss=" + this.f47715e + ", rss=" + this.f47716f + ", timestamp=" + this.f47717g + ", traceFile=" + this.f47718h + ", buildIdMappingForArch=" + this.f47719i + "}";
    }

    public C6324c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f47711a = i10;
        this.f47712b = str;
        this.f47713c = i11;
        this.f47714d = i12;
        this.f47715e = j10;
        this.f47716f = j11;
        this.f47717g = j12;
        this.f47718h = str2;
        this.f47719i = list;
    }
}
