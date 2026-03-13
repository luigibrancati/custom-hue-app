package Sb;

import bc.AbstractC2904a;

/* JADX INFO: renamed from: Sb.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2205f extends Eb.r implements Mb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15696a;

    /* JADX INFO: renamed from: Sb.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.t f15697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Hb.c f15698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f15699c;

        public a(Eb.t tVar) {
            this.f15697a = tVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15698b = Kb.c.DISPOSED;
            this.f15697a.onSuccess(Long.valueOf(this.f15699c));
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15698b, cVar)) {
                this.f15698b = cVar;
                this.f15697a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15699c++;
        }

        @Override // Hb.c
        public void dispose() {
            this.f15698b.dispose();
            this.f15698b = Kb.c.DISPOSED;
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15698b.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15698b = Kb.c.DISPOSED;
            this.f15697a.onError(th);
        }
    }

    public C2205f(Eb.n nVar) {
        this.f15696a = nVar;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        this.f15696a.f(new a(tVar));
    }

    @Override // Mb.b
    public Eb.k a() {
        return AbstractC2904a.m(new C2204e(this.f15696a));
    }
}
