package Sb;

import bc.AbstractC2904a;

/* JADX INFO: renamed from: Sb.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2213n extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.d f15772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Jb.d f15773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jb.a f15774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Jb.a f15775e;

    /* JADX INFO: renamed from: Sb.n$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.d f15777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Jb.d f15778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Jb.a f15779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Jb.a f15780e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Hb.c f15781f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f15782g;

        public a(Eb.p pVar, Jb.d dVar, Jb.d dVar2, Jb.a aVar, Jb.a aVar2) {
            this.f15776a = pVar;
            this.f15777b = dVar;
            this.f15778c = dVar2;
            this.f15779d = aVar;
            this.f15780e = aVar2;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15782g) {
                return;
            }
            try {
                this.f15779d.run();
                this.f15782g = true;
                this.f15776a.a();
                try {
                    this.f15780e.run();
                } catch (Throwable th) {
                    Ib.b.b(th);
                    AbstractC2904a.q(th);
                }
            } catch (Throwable th2) {
                Ib.b.b(th2);
                onError(th2);
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15781f, cVar)) {
                this.f15781f = cVar;
                this.f15776a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15782g) {
                return;
            }
            try {
                this.f15777b.accept(obj);
                this.f15776a.c(obj);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15781f.dispose();
                onError(th);
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15781f.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15781f.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15782g) {
                AbstractC2904a.q(th);
                return;
            }
            this.f15782g = true;
            try {
                this.f15778c.accept(th);
            } catch (Throwable th2) {
                Ib.b.b(th2);
                th = new Ib.a(th, th2);
            }
            this.f15776a.onError(th);
            try {
                this.f15780e.run();
            } catch (Throwable th3) {
                Ib.b.b(th3);
                AbstractC2904a.q(th3);
            }
        }
    }

    public C2213n(Eb.n nVar, Jb.d dVar, Jb.d dVar2, Jb.a aVar, Jb.a aVar2) {
        super(nVar);
        this.f15772b = dVar;
        this.f15773c = dVar2;
        this.f15774d = aVar;
        this.f15775e = aVar2;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15772b, this.f15773c, this.f15774d, this.f15775e));
    }
}
