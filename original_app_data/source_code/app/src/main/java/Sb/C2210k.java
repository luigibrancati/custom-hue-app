package Sb;

import bc.AbstractC2904a;

/* JADX INFO: renamed from: Sb.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2210k extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.n f15754b;

    /* JADX INFO: renamed from: Sb.k$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Eb.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Kb.g f15755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Eb.p f15756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15757c;

        /* JADX INFO: renamed from: Sb.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0194a implements Eb.p {
            public C0194a() {
            }

            @Override // Eb.p
            public void a() {
                a.this.f15756b.a();
            }

            @Override // Eb.p
            public void b(Hb.c cVar) {
                a.this.f15755a.b(cVar);
            }

            @Override // Eb.p
            public void c(Object obj) {
                a.this.f15756b.c(obj);
            }

            @Override // Eb.p
            public void onError(Throwable th) {
                a.this.f15756b.onError(th);
            }
        }

        public a(Kb.g gVar, Eb.p pVar) {
            this.f15755a = gVar;
            this.f15756b = pVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15757c) {
                return;
            }
            this.f15757c = true;
            C2210k.this.f15753a.f(new C0194a());
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            this.f15755a.b(cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            a();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15757c) {
                AbstractC2904a.q(th);
            } else {
                this.f15757c = true;
                this.f15756b.onError(th);
            }
        }
    }

    public C2210k(Eb.n nVar, Eb.n nVar2) {
        this.f15753a = nVar;
        this.f15754b = nVar2;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        Kb.g gVar = new Kb.g();
        pVar.b(gVar);
        this.f15754b.f(new a(gVar, pVar));
    }
}
