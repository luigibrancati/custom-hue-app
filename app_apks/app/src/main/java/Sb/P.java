package Sb;

import dc.C3891b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class P extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15536b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15537a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final dc.d f15540d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Eb.n f15543g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f15544h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f15538b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Yb.b f15539c = new Yb.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0188a f15541e = new C0188a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicReference f15542f = new AtomicReference();

        /* JADX INFO: renamed from: Sb.P$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0188a extends AtomicReference implements Eb.p {
            public C0188a() {
            }

            @Override // Eb.p
            public void a() {
                a.this.d();
            }

            @Override // Eb.p
            public void b(Hb.c cVar) {
                Kb.c.u(this, cVar);
            }

            @Override // Eb.p
            public void c(Object obj) {
                a.this.f();
            }

            @Override // Eb.p
            public void onError(Throwable th) {
                a.this.e(th);
            }
        }

        public a(Eb.p pVar, dc.d dVar, Eb.n nVar) {
            this.f15537a = pVar;
            this.f15540d = dVar;
            this.f15543g = nVar;
        }

        @Override // Eb.p
        public void a() {
            Kb.c.p(this.f15542f, null);
            this.f15544h = false;
            this.f15540d.c(0);
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15542f, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            Yb.g.e(this.f15537a, obj, this, this.f15539c);
        }

        public void d() {
            Kb.c.a(this.f15542f);
            Yb.g.a(this.f15537a, this, this.f15539c);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this.f15542f);
            Kb.c.a(this.f15541e);
        }

        public void e(Throwable th) {
            Kb.c.a(this.f15542f);
            Yb.g.c(this.f15537a, th, this, this.f15539c);
        }

        public void f() {
            g();
        }

        public void g() {
            if (this.f15538b.getAndIncrement() == 0) {
                while (!j()) {
                    if (!this.f15544h) {
                        this.f15544h = true;
                        this.f15543g.f(this);
                    }
                    if (this.f15538b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) this.f15542f.get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            Kb.c.a(this.f15541e);
            Yb.g.c(this.f15537a, th, this, this.f15539c);
        }
    }

    public P(Eb.n nVar, Jb.e eVar) {
        super(nVar);
        this.f15536b = eVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        dc.d dVarO0 = C3891b.Q0().O0();
        try {
            Eb.n nVar = (Eb.n) Lb.b.e(this.f15536b.apply(dVarO0), "The handler returned a null ObservableSource");
            a aVar = new a(pVar, dVarO0, this.f15624a);
            pVar.b(aVar);
            nVar.f(aVar.f15541e);
            aVar.g();
        } catch (Throwable th) {
            Ib.b.b(th);
            Kb.d.p(th, pVar);
        }
    }
}
