package Sb;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.g f15625b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.g f15627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15629d;

        public a(Eb.p pVar, Jb.g gVar) {
            this.f15626a = pVar;
            this.f15627b = gVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15629d) {
                return;
            }
            this.f15629d = true;
            this.f15626a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15628c, cVar)) {
                this.f15628c = cVar;
                this.f15626a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15629d) {
                return;
            }
            try {
                if (this.f15627b.test(obj)) {
                    this.f15626a.c(obj);
                    return;
                }
                this.f15629d = true;
                this.f15628c.dispose();
                this.f15626a.a();
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15628c.dispose();
                onError(th);
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15628c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15628c.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15629d) {
                AbstractC2904a.q(th);
            } else {
                this.f15629d = true;
                this.f15626a.onError(th);
            }
        }
    }

    public a0(Eb.n nVar, Jb.g gVar) {
        super(nVar);
        this.f15625b = gVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15625b));
    }
}
