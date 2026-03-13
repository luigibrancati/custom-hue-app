package X;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X.a f17975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f17976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f17977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17978d;

    public c(X.a aVar, d dVar, b bVar, int i10) {
        this.f17975a = aVar;
        this.f17976b = dVar;
        this.f17977c = bVar;
        this.f17978d = i10;
    }

    public int a() {
        return this.f17978d;
    }

    public X.a b() {
        return this.f17975a;
    }

    public b c() {
        return this.f17977c;
    }

    public d d() {
        return this.f17976b;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public X.a f17979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f17980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f17981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17982d;

        public a() {
            this.f17979a = X.a.f17971c;
            this.f17980b = null;
            this.f17981c = null;
            this.f17982d = 0;
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f17979a, this.f17980b, this.f17981c, this.f17982d);
        }

        public a c(int i10) {
            this.f17982d = i10;
            return this;
        }

        public a d(X.a aVar) {
            this.f17979a = aVar;
            return this;
        }

        public a e(b bVar) {
            this.f17981c = bVar;
            return this;
        }

        public a f(d dVar) {
            this.f17980b = dVar;
            return this;
        }

        public a(c cVar) {
            this.f17979a = X.a.f17971c;
            this.f17980b = null;
            this.f17981c = null;
            this.f17982d = 0;
            this.f17979a = cVar.b();
            this.f17980b = cVar.d();
            this.f17981c = cVar.c();
            this.f17982d = cVar.a();
        }
    }
}
