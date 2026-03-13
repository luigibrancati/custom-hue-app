package x8;

import java.util.List;
import x8.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends F.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f47752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F.e.a f47754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.e.f f47755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F.e.AbstractC0663e f47756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F.e.c f47757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f47758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f47759l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends F.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f47763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f47764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f47765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public F.e.a f47766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public F.e.f f47767h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public F.e.AbstractC0663e f47768i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public F.e.c f47769j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List f47770k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f47771l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public byte f47772m;

        @Override // x8.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f47772m == 7 && (str = this.f47760a) != null && (str2 = this.f47761b) != null && (aVar = this.f47766g) != null) {
                return new h(str, str2, this.f47762c, this.f47763d, this.f47764e, this.f47765f, aVar, this.f47767h, this.f47768i, this.f47769j, this.f47770k, this.f47771l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47760a == null) {
                sb2.append(" generator");
            }
            if (this.f47761b == null) {
                sb2.append(" identifier");
            }
            if ((this.f47772m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f47772m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f47766g == null) {
                sb2.append(" app");
            }
            if ((this.f47772m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f47766g = aVar;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b c(String str) {
            this.f47762c = str;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b d(boolean z10) {
            this.f47765f = z10;
            this.f47772m = (byte) (this.f47772m | 2);
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f47769j = cVar;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b f(Long l10) {
            this.f47764e = l10;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b g(List list) {
            this.f47770k = list;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f47760a = str;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b i(int i10) {
            this.f47771l = i10;
            this.f47772m = (byte) (this.f47772m | 4);
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f47761b = str;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b l(F.e.AbstractC0663e abstractC0663e) {
            this.f47768i = abstractC0663e;
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b m(long j10) {
            this.f47763d = j10;
            this.f47772m = (byte) (this.f47772m | 1);
            return this;
        }

        @Override // x8.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f47767h = fVar;
            return this;
        }

        public b() {
        }

        public b(F.e eVar) {
            this.f47760a = eVar.g();
            this.f47761b = eVar.i();
            this.f47762c = eVar.c();
            this.f47763d = eVar.l();
            this.f47764e = eVar.e();
            this.f47765f = eVar.n();
            this.f47766g = eVar.b();
            this.f47767h = eVar.m();
            this.f47768i = eVar.k();
            this.f47769j = eVar.d();
            this.f47770k = eVar.f();
            this.f47771l = eVar.h();
            this.f47772m = (byte) 7;
        }
    }

    @Override // x8.F.e
    public F.e.a b() {
        return this.f47754g;
    }

    @Override // x8.F.e
    public String c() {
        return this.f47750c;
    }

    @Override // x8.F.e
    public F.e.c d() {
        return this.f47757j;
    }

    @Override // x8.F.e
    public Long e() {
        return this.f47752e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        F.e.f fVar;
        F.e.AbstractC0663e abstractC0663e;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e) {
            F.e eVar = (F.e) obj;
            if (this.f47748a.equals(eVar.g()) && this.f47749b.equals(eVar.i()) && ((str = this.f47750c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f47751d == eVar.l() && ((l10 = this.f47752e) != null ? l10.equals(eVar.e()) : eVar.e() == null) && this.f47753f == eVar.n() && this.f47754g.equals(eVar.b()) && ((fVar = this.f47755h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0663e = this.f47756i) != null ? abstractC0663e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f47757j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f47758k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f47759l == eVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F.e
    public List f() {
        return this.f47758k;
    }

    @Override // x8.F.e
    public String g() {
        return this.f47748a;
    }

    @Override // x8.F.e
    public int h() {
        return this.f47759l;
    }

    public int hashCode() {
        int iHashCode = (((this.f47748a.hashCode() ^ 1000003) * 1000003) ^ this.f47749b.hashCode()) * 1000003;
        String str = this.f47750c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f47751d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f47752e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f47753f ? 1231 : 1237)) * 1000003) ^ this.f47754g.hashCode()) * 1000003;
        F.e.f fVar = this.f47755h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.AbstractC0663e abstractC0663e = this.f47756i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0663e == null ? 0 : abstractC0663e.hashCode())) * 1000003;
        F.e.c cVar = this.f47757j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f47758k;
        return this.f47759l ^ ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003);
    }

    @Override // x8.F.e
    public String i() {
        return this.f47749b;
    }

    @Override // x8.F.e
    public F.e.AbstractC0663e k() {
        return this.f47756i;
    }

    @Override // x8.F.e
    public long l() {
        return this.f47751d;
    }

    @Override // x8.F.e
    public F.e.f m() {
        return this.f47755h;
    }

    @Override // x8.F.e
    public boolean n() {
        return this.f47753f;
    }

    @Override // x8.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f47748a + ", identifier=" + this.f47749b + ", appQualitySessionId=" + this.f47750c + ", startedAt=" + this.f47751d + ", endedAt=" + this.f47752e + ", crashed=" + this.f47753f + ", app=" + this.f47754g + ", user=" + this.f47755h + ", os=" + this.f47756i + ", device=" + this.f47757j + ", events=" + this.f47758k + ", generatorType=" + this.f47759l + "}";
    }

    public h(String str, String str2, String str3, long j10, Long l10, boolean z10, F.e.a aVar, F.e.f fVar, F.e.AbstractC0663e abstractC0663e, F.e.c cVar, List list, int i10) {
        this.f47748a = str;
        this.f47749b = str2;
        this.f47750c = str3;
        this.f47751d = j10;
        this.f47752e = l10;
        this.f47753f = z10;
        this.f47754g = aVar;
        this.f47755h = fVar;
        this.f47756i = abstractC0663e;
        this.f47757j = cVar;
        this.f47758k = list;
        this.f47759l = i10;
    }
}
