package Sb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class B extends AbstractC2200a {
    public B(Eb.n nVar) {
        super(nVar);
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Hb.c f15456b;

        public a(Eb.p pVar) {
            this.f15455a = pVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15455a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            this.f15456b = cVar;
            this.f15455a.b(this);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15456b.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15456b.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15455a.onError(th);
        }

        @Override // Eb.p
        public void c(Object obj) {
        }
    }
}
