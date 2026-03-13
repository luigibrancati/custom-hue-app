package Sb;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class G extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.c f15469b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f15471b = new AtomicReference();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0187a f15472c = new C0187a(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Yb.b f15473d = new Yb.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f15474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f15475f;

        /* JADX INFO: renamed from: Sb.G$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0187a extends AtomicReference implements Eb.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f15476a;

            public C0187a(a aVar) {
                this.f15476a = aVar;
            }

            @Override // Eb.b
            public void a() {
                this.f15476a.d();
            }

            @Override // Eb.b
            public void b(Hb.c cVar) {
                Kb.c.u(this, cVar);
            }

            @Override // Eb.b
            public void onError(Throwable th) {
                this.f15476a.e(th);
            }
        }

        public a(Eb.p pVar) {
            this.f15470a = pVar;
        }

        @Override // Eb.p
        public void a() {
            this.f15474e = true;
            if (this.f15475f) {
                Yb.g.a(this.f15470a, this, this.f15473d);
            }
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            Kb.c.u(this.f15471b, cVar);
        }

        @Override // Eb.p
        public void c(Object obj) {
            Yb.g.e(this.f15470a, obj, this, this.f15473d);
        }

        public void d() {
            this.f15475f = true;
            if (this.f15474e) {
                Yb.g.a(this.f15470a, this, this.f15473d);
            }
        }

        @Override // Hb.c
        public void dispose() {
            Kb.c.a(this.f15471b);
            Kb.c.a(this.f15472c);
        }

        public void e(Throwable th) {
            Kb.c.a(this.f15471b);
            Yb.g.c(this.f15470a, th, this, this.f15473d);
        }

        @Override // Hb.c
        public boolean j() {
            return Kb.c.b((Hb.c) this.f15471b.get());
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            Kb.c.a(this.f15472c);
            Yb.g.c(this.f15470a, th, this, this.f15473d);
        }
    }

    public G(Eb.k kVar, Eb.c cVar) {
        super(kVar);
        this.f15469b = cVar;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        a aVar = new a(pVar);
        pVar.b(aVar);
        this.f15624a.f(aVar);
        this.f15469b.b(aVar.f15472c);
    }
}
