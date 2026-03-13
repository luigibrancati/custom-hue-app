package Sb;

import Eb.q;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Sb.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2209j extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f15739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Eb.q f15740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15741e;

    /* JADX INFO: renamed from: Sb.j$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f15743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f15744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q.c f15745d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f15746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Hb.c f15747f;

        /* JADX INFO: renamed from: Sb.j$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class RunnableC0193a implements Runnable {
            public RunnableC0193a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f15742a.a();
                } finally {
                    a.this.f15745d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: Sb.j$a$b */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f15749a;

            public b(Throwable th) {
                this.f15749a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f15742a.onError(this.f15749a);
                } finally {
                    a.this.f15745d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: Sb.j$a$c */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f15751a;

            public c(Object obj) {
                this.f15751a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f15742a.c(this.f15751a);
            }
        }

        public a(Eb.p pVar, long j10, TimeUnit timeUnit, q.c cVar, boolean z10) {
            this.f15742a = pVar;
            this.f15743b = j10;
            this.f15744c = timeUnit;
            this.f15745d = cVar;
            this.f15746e = z10;
        }

        @Override // Eb.p
        public void a() {
            this.f15745d.c(new RunnableC0193a(), this.f15743b, this.f15744c);
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15747f, cVar)) {
                this.f15747f = cVar;
                this.f15742a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15745d.c(new c(obj), this.f15743b, this.f15744c);
        }

        @Override // Hb.c
        public void dispose() {
            this.f15747f.dispose();
            this.f15745d.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15745d.j();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15745d.c(new b(th), this.f15746e ? this.f15743b : 0L, this.f15744c);
        }
    }

    public C2209j(Eb.n nVar, long j10, TimeUnit timeUnit, Eb.q qVar, boolean z10) {
        super(nVar);
        this.f15738b = j10;
        this.f15739c = timeUnit;
        this.f15740d = qVar;
        this.f15741e = z10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(this.f15741e ? pVar : new ac.c(pVar), this.f15738b, this.f15739c, this.f15740d.a(), this.f15741e));
    }
}
