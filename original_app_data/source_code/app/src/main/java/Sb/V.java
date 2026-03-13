package Sb;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class V extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.q f15584b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicReference implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f15586b = new AtomicReference();

        public a(Eb.p pVar) {
            this.f15585a = pVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15585a.a();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15586b, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15585a.c(obj);
        }

        public void d(Hb.c cVar) {
            Kb.c.u(this, cVar);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this.f15586b);
            Kb.c.a(this);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15585a.onError(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f15587a;

        public b(a aVar) {
            this.f15587a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            V.this.f15624a.f(this.f15587a);
        }
    }

    public V(Eb.n nVar, Eb.q qVar) {
        super(nVar);
        this.f15584b = qVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar = new a(pVar);
        pVar.b(aVar);
        aVar.d(this.f15584b.c(new b(aVar)));
    }
}
