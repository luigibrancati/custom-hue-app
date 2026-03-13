package Sb;

/* JADX INFO: renamed from: Sb.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2204e extends AbstractC2200a {

    /* JADX INFO: renamed from: Sb.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Hb.c f15690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15691c;

        public a(Eb.p pVar) {
            this.f15689a = pVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15689a.c(Long.valueOf(this.f15691c));
            this.f15689a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15690b, cVar)) {
                this.f15690b = cVar;
                this.f15689a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15691c++;
        }

        @Override // Hb.c
        public void dispose() {
            this.f15690b.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15690b.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15689a.onError(th);
        }
    }

    public C2204e(Eb.n nVar) {
        super(nVar);
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar));
    }
}
