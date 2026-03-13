package Sb;

import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C extends Eb.a implements Mb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Eb.n f15457a;

    public C(Eb.n nVar) {
        this.f15457a = nVar;
    }

    @Override // Mb.b
    public Eb.k a() {
        return AbstractC2904a.m(new B(this.f15457a));
    }

    @Override // Eb.a
    public void m(Eb.b bVar) {
        this.f15457a.f(new a(bVar));
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.b f15458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Hb.c f15459b;

        public a(Eb.b bVar) {
            this.f15458a = bVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15458a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            this.f15459b = cVar;
            this.f15458a.b(this);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15459b.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15459b.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15458a.onError(th);
        }

        @Override // Eb.p
        public void c(Object obj) {
        }
    }
}
