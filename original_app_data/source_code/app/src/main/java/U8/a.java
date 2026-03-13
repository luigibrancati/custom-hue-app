package U8;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f16767p = new C0209a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f16771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f16772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f16773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f16774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f16777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f16778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f16779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f16780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f16781n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f16782o;

    /* JADX INFO: renamed from: U8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0209a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f16783a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f16784b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16785c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f16786d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f16787e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f16788f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f16789g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16790h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16791i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f16792j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f16793k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f16794l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f16795m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f16796n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f16797o = "";

        public a a() {
            return new a(this.f16783a, this.f16784b, this.f16785c, this.f16786d, this.f16787e, this.f16788f, this.f16789g, this.f16790h, this.f16791i, this.f16792j, this.f16793k, this.f16794l, this.f16795m, this.f16796n, this.f16797o);
        }

        public C0209a b(String str) {
            this.f16795m = str;
            return this;
        }

        public C0209a c(String str) {
            this.f16789g = str;
            return this;
        }

        public C0209a d(String str) {
            this.f16797o = str;
            return this;
        }

        public C0209a e(b bVar) {
            this.f16794l = bVar;
            return this;
        }

        public C0209a f(String str) {
            this.f16785c = str;
            return this;
        }

        public C0209a g(String str) {
            this.f16784b = str;
            return this;
        }

        public C0209a h(c cVar) {
            this.f16786d = cVar;
            return this;
        }

        public C0209a i(String str) {
            this.f16788f = str;
            return this;
        }

        public C0209a j(int i10) {
            this.f16790h = i10;
            return this;
        }

        public C0209a k(long j10) {
            this.f16783a = j10;
            return this;
        }

        public C0209a l(d dVar) {
            this.f16787e = dVar;
            return this;
        }

        public C0209a m(String str) {
            this.f16792j = str;
            return this;
        }

        public C0209a n(int i10) {
            this.f16791i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b implements K8.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // K8.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements K8.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i10) {
            this.number_ = i10;
        }

        @Override // K8.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d implements K8.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i10) {
            this.number_ = i10;
        }

        @Override // K8.c
        public int getNumber() {
            return this.number_;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f16768a = j10;
        this.f16769b = str;
        this.f16770c = str2;
        this.f16771d = cVar;
        this.f16772e = dVar;
        this.f16773f = str3;
        this.f16774g = str4;
        this.f16775h = i10;
        this.f16776i = i11;
        this.f16777j = str5;
        this.f16778k = j11;
        this.f16779l = bVar;
        this.f16780m = str6;
        this.f16781n = j12;
        this.f16782o = str7;
    }

    public static C0209a p() {
        return new C0209a();
    }

    public String a() {
        return this.f16780m;
    }

    public long b() {
        return this.f16778k;
    }

    public long c() {
        return this.f16781n;
    }

    public String d() {
        return this.f16774g;
    }

    public String e() {
        return this.f16782o;
    }

    public b f() {
        return this.f16779l;
    }

    public String g() {
        return this.f16770c;
    }

    public String h() {
        return this.f16769b;
    }

    public c i() {
        return this.f16771d;
    }

    public String j() {
        return this.f16773f;
    }

    public int k() {
        return this.f16775h;
    }

    public long l() {
        return this.f16768a;
    }

    public d m() {
        return this.f16772e;
    }

    public String n() {
        return this.f16777j;
    }

    public int o() {
        return this.f16776i;
    }
}
