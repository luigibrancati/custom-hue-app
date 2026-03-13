package Sb;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Y extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.n f15613b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f15615b = new AtomicReference();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0189a f15616c = new C0189a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Yb.b f15617d = new Yb.b();

        /* JADX INFO: renamed from: Sb.Y$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0189a extends AtomicReference implements Eb.p {
            public C0189a() {
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
                Kb.c.a(this);
                a.this.d();
            }

            @Override // Eb.p
            public void onError(Throwable th) {
                a.this.e(th);
            }
        }

        public a(Eb.p pVar) {
            this.f15614a = pVar;
        }

        @Override // Eb.p
        public void a() {
            Kb.c.a(this.f15616c);
            Yb.g.a(this.f15614a, this, this.f15617d);
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15615b, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            Yb.g.e(this.f15614a, obj, this, this.f15617d);
        }

        public void d() {
            Kb.c.a(this.f15615b);
            Yb.g.a(this.f15614a, this, this.f15617d);
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this.f15615b);
            Kb.c.a(this.f15616c);
        }

        public void e(Throwable th) {
            Kb.c.a(this.f15615b);
            Yb.g.c(this.f15614a, th, this, this.f15617d);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) this.f15615b.get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            Kb.c.a(this.f15616c);
            Yb.g.c(this.f15614a, th, this, this.f15617d);
        }
    }

    public Y(Eb.n nVar, Eb.n nVar2) {
        super(nVar);
        this.f15613b = nVar2;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar = new a(pVar);
        pVar.b(aVar);
        this.f15613b.f(aVar.f15616c);
        this.f15624a.f(aVar);
    }
}
