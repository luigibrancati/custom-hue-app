package Sb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class U extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15580b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f15582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15583c;

        public a(Eb.p pVar, long j10) {
            this.f15581a = pVar;
            this.f15582b = j10;
        }

        @Override // Eb.p
        public void a() {
            this.f15581a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15583c, cVar)) {
                this.f15583c = cVar;
                this.f15581a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            long j10 = this.f15582b;
            if (j10 != 0) {
                this.f15582b = j10 - 1;
            } else {
                this.f15581a.c(obj);
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15583c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15583c.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15581a.onError(th);
        }
    }

    public U(Eb.n nVar, long j10) {
        super(nVar);
        this.f15580b = j10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15580b));
    }
}
