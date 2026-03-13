package Sb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class J extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15492b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15495c;

        public a(Eb.p pVar, Jb.e eVar) {
            this.f15493a = pVar;
            this.f15494b = eVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15493a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15495c, cVar)) {
                this.f15495c = cVar;
                this.f15493a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15493a.c(obj);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15495c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15495c.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            try {
                Object objApply = this.f15494b.apply(th);
                if (objApply != null) {
                    this.f15493a.c(objApply);
                    this.f15493a.a();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f15493a.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                Ib.b.b(th2);
                this.f15493a.onError(new Ib.a(th, th2));
            }
        }
    }

    public J(Eb.n nVar, Jb.e eVar) {
        super(nVar);
        this.f15492b = eVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15492b));
    }
}
