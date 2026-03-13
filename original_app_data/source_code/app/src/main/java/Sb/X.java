package Sb;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class X extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15608b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Hb.c f15611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f15612d;

        public a(Eb.p pVar, long j10) {
            this.f15609a = pVar;
            this.f15612d = j10;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15610b) {
                return;
            }
            this.f15610b = true;
            this.f15611c.dispose();
            this.f15609a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15611c, cVar)) {
                this.f15611c = cVar;
                if (this.f15612d != 0) {
                    this.f15609a.b(this);
                    return;
                }
                this.f15610b = true;
                cVar.dispose();
                Kb.d.a(this.f15609a);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15610b) {
                return;
            }
            long j10 = this.f15612d;
            long j11 = j10 - 1;
            this.f15612d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f15609a.c(obj);
                if (z10) {
                    a();
                }
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15611c.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15611c.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15610b) {
                AbstractC2904a.q(th);
                return;
            }
            this.f15610b = true;
            this.f15611c.dispose();
            this.f15609a.onError(th);
        }
    }

    public X(Eb.n nVar, long j10) {
        super(nVar);
        this.f15608b = j10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15608b));
    }
}
