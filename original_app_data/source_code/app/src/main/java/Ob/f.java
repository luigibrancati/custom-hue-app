package Ob;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends Eb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.c f12135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.g f12136b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Eb.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.b f12137a;

        public a(Eb.b bVar) {
            this.f12137a = bVar;
        }

        @Override // Eb.b
        public void a() {
            this.f12137a.a();
        }

        @Override // Eb.b
        public void b(Hb.c cVar) {
            this.f12137a.b(cVar);
        }

        @Override // Eb.b
        public void onError(Throwable th) {
            try {
                if (f.this.f12136b.test(th)) {
                    this.f12137a.a();
                } else {
                    this.f12137a.onError(th);
                }
            } catch (Throwable th2) {
                Ib.b.b(th2);
                this.f12137a.onError(new Ib.a(th, th2));
            }
        }
    }

    public f(Eb.c cVar, Jb.g gVar) {
        this.f12135a = cVar;
        this.f12136b = gVar;
    }

    @Override // Eb.a
    public void m(Eb.b bVar) {
        this.f12135a.b(new a(bVar));
    }
}
