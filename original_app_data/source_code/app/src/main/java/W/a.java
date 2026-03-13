package W;

import W.e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17598d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f17602d;

        @Override // W.e.a
        public e a() {
            String str = "";
            if (this.f17599a == null) {
                str = " glVersion";
            }
            if (this.f17600b == null) {
                str = str + " eglVersion";
            }
            if (this.f17601c == null) {
                str = str + " glExtensions";
            }
            if (this.f17602d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f17599a, this.f17600b, this.f17601c, this.f17602d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // W.e.a
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f17602d = str;
            return this;
        }

        @Override // W.e.a
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f17600b = str;
            return this;
        }

        @Override // W.e.a
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f17601c = str;
            return this;
        }

        @Override // W.e.a
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f17599a = str;
            return this;
        }
    }

    @Override // W.e
    public String b() {
        return this.f17598d;
    }

    @Override // W.e
    public String c() {
        return this.f17596b;
    }

    @Override // W.e
    public String d() {
        return this.f17597c;
    }

    @Override // W.e
    public String e() {
        return this.f17595a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f17595a.equals(eVar.e()) && this.f17596b.equals(eVar.c()) && this.f17597c.equals(eVar.d()) && this.f17598d.equals(eVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17598d.hashCode() ^ ((((((this.f17595a.hashCode() ^ 1000003) * 1000003) ^ this.f17596b.hashCode()) * 1000003) ^ this.f17597c.hashCode()) * 1000003);
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f17595a + ", eglVersion=" + this.f17596b + ", glExtensions=" + this.f17597c + ", eglExtensions=" + this.f17598d + "}";
    }

    public a(String str, String str2, String str3, String str4) {
        this.f17595a = str;
        this.f17596b = str2;
        this.f17597c = str3;
        this.f17598d = str4;
    }
}
