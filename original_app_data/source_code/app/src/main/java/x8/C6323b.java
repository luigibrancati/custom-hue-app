package x8;

import x8.F;

/* JADX INFO: renamed from: x8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6323b extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f47691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f47692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f47694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final F.e f47695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F.d f47696l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F.a f47697m;

    /* JADX INFO: renamed from: x8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0665b extends F.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f47698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f47699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f47701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f47702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f47703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f47704g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f47705h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f47706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public F.e f47707j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public F.d f47708k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public F.a f47709l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public byte f47710m;

        @Override // x8.F.b
        public F a() {
            if (this.f47710m == 1 && this.f47698a != null && this.f47699b != null && this.f47701d != null && this.f47705h != null && this.f47706i != null) {
                return new C6323b(this.f47698a, this.f47699b, this.f47700c, this.f47701d, this.f47702e, this.f47703f, this.f47704g, this.f47705h, this.f47706i, this.f47707j, this.f47708k, this.f47709l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f47698a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f47699b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f47710m) == 0) {
                sb2.append(" platform");
            }
            if (this.f47701d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f47705h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f47706i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // x8.F.b
        public F.b b(F.a aVar) {
            this.f47709l = aVar;
            return this;
        }

        @Override // x8.F.b
        public F.b c(String str) {
            this.f47704g = str;
            return this;
        }

        @Override // x8.F.b
        public F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f47705h = str;
            return this;
        }

        @Override // x8.F.b
        public F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f47706i = str;
            return this;
        }

        @Override // x8.F.b
        public F.b f(String str) {
            this.f47703f = str;
            return this;
        }

        @Override // x8.F.b
        public F.b g(String str) {
            this.f47702e = str;
            return this;
        }

        @Override // x8.F.b
        public F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f47699b = str;
            return this;
        }

        @Override // x8.F.b
        public F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f47701d = str;
            return this;
        }

        @Override // x8.F.b
        public F.b j(F.d dVar) {
            this.f47708k = dVar;
            return this;
        }

        @Override // x8.F.b
        public F.b k(int i10) {
            this.f47700c = i10;
            this.f47710m = (byte) (this.f47710m | 1);
            return this;
        }

        @Override // x8.F.b
        public F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f47698a = str;
            return this;
        }

        @Override // x8.F.b
        public F.b m(F.e eVar) {
            this.f47707j = eVar;
            return this;
        }

        public C0665b() {
        }

        public C0665b(F f10) {
            this.f47698a = f10.m();
            this.f47699b = f10.i();
            this.f47700c = f10.l();
            this.f47701d = f10.j();
            this.f47702e = f10.h();
            this.f47703f = f10.g();
            this.f47704g = f10.d();
            this.f47705h = f10.e();
            this.f47706i = f10.f();
            this.f47707j = f10.n();
            this.f47708k = f10.k();
            this.f47709l = f10.c();
            this.f47710m = (byte) 1;
        }
    }

    @Override // x8.F
    public F.a c() {
        return this.f47697m;
    }

    @Override // x8.F
    public String d() {
        return this.f47692h;
    }

    @Override // x8.F
    public String e() {
        return this.f47693i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        F.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f10 = (F) obj;
            if (this.f47686b.equals(f10.m()) && this.f47687c.equals(f10.i()) && this.f47688d == f10.l() && this.f47689e.equals(f10.j()) && ((str = this.f47690f) != null ? str.equals(f10.h()) : f10.h() == null) && ((str2 = this.f47691g) != null ? str2.equals(f10.g()) : f10.g() == null) && ((str3 = this.f47692h) != null ? str3.equals(f10.d()) : f10.d() == null) && this.f47693i.equals(f10.e()) && this.f47694j.equals(f10.f()) && ((eVar = this.f47695k) != null ? eVar.equals(f10.n()) : f10.n() == null) && ((dVar = this.f47696l) != null ? dVar.equals(f10.k()) : f10.k() == null) && ((aVar = this.f47697m) != null ? aVar.equals(f10.c()) : f10.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // x8.F
    public String f() {
        return this.f47694j;
    }

    @Override // x8.F
    public String g() {
        return this.f47691g;
    }

    @Override // x8.F
    public String h() {
        return this.f47690f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f47686b.hashCode() ^ 1000003) * 1000003) ^ this.f47687c.hashCode()) * 1000003) ^ this.f47688d) * 1000003) ^ this.f47689e.hashCode()) * 1000003;
        String str = this.f47690f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f47691g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f47692h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f47693i.hashCode()) * 1000003) ^ this.f47694j.hashCode()) * 1000003;
        F.e eVar = this.f47695k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.f47696l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.f47697m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // x8.F
    public String i() {
        return this.f47687c;
    }

    @Override // x8.F
    public String j() {
        return this.f47689e;
    }

    @Override // x8.F
    public F.d k() {
        return this.f47696l;
    }

    @Override // x8.F
    public int l() {
        return this.f47688d;
    }

    @Override // x8.F
    public String m() {
        return this.f47686b;
    }

    @Override // x8.F
    public F.e n() {
        return this.f47695k;
    }

    @Override // x8.F
    public F.b o() {
        return new C0665b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f47686b + ", gmpAppId=" + this.f47687c + ", platform=" + this.f47688d + ", installationUuid=" + this.f47689e + ", firebaseInstallationId=" + this.f47690f + ", firebaseAuthenticationToken=" + this.f47691g + ", appQualitySessionId=" + this.f47692h + ", buildVersion=" + this.f47693i + ", displayVersion=" + this.f47694j + ", session=" + this.f47695k + ", ndkPayload=" + this.f47696l + ", appExitInfo=" + this.f47697m + "}";
    }

    public C6323b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f47686b = str;
        this.f47687c = str2;
        this.f47688d = i10;
        this.f47689e = str3;
        this.f47690f = str4;
        this.f47691g = str5;
        this.f47692h = str6;
        this.f47693i = str7;
        this.f47694j = str8;
        this.f47695k = eVar;
        this.f47696l = dVar;
        this.f47697m = aVar;
    }
}
