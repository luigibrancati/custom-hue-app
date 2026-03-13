package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Sb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2203d extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yb.e f15662d;

    /* JADX INFO: renamed from: Sb.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Yb.b f15666d = new Yb.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0191a f15667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f15668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Mb.h f15669g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Hb.c f15670h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f15671i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f15672j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f15673k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f15674l;

        /* JADX INFO: renamed from: Sb.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0191a extends AtomicReference implements Eb.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Eb.p f15675a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f15676b;

            public C0191a(Eb.p pVar, a aVar) {
                this.f15675a = pVar;
                this.f15676b = aVar;
            }

            @Override // Eb.p
            public void a() {
                a aVar = this.f15676b;
                aVar.f15671i = false;
                aVar.d();
            }

            @Override // Eb.p
            public void b(Hb.c cVar) {
                Kb.c.p(this, cVar);
            }

            @Override // Eb.p
            public void c(Object obj) {
                this.f15675a.c(obj);
            }

            public void d() {
                Kb.c.a(this);
            }

            @Override // Eb.p
            public void onError(Throwable th) {
                a aVar = this.f15676b;
                if (!aVar.f15666d.a(th)) {
                    AbstractC2904a.q(th);
                    return;
                }
                if (!aVar.f15668f) {
                    aVar.f15670h.dispose();
                }
                aVar.f15671i = false;
                aVar.d();
            }
        }

        public a(Eb.p pVar, Jb.e eVar, int i10, boolean z10) {
            this.f15663a = pVar;
            this.f15664b = eVar;
            this.f15665c = i10;
            this.f15668f = z10;
            this.f15667e = new C0191a(pVar, this);
        }

        @Override // Eb.p
        public void a() {
            this.f15672j = true;
            d();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15670h, cVar)) {
                this.f15670h = cVar;
                if (cVar instanceof Mb.c) {
                    Mb.c cVar2 = (Mb.c) cVar;
                    int iQ = cVar2.q(3);
                    if (iQ == 1) {
                        this.f15674l = iQ;
                        this.f15669g = cVar2;
                        this.f15672j = true;
                        this.f15663a.b(this);
                        d();
                        return;
                    }
                    if (iQ == 2) {
                        this.f15674l = iQ;
                        this.f15669g = cVar2;
                        this.f15663a.b(this);
                        return;
                    }
                }
                this.f15669g = new Ub.c(this.f15665c);
                this.f15663a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15674l == 0) {
                this.f15669g.offer(obj);
            }
            d();
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            Eb.p pVar = this.f15663a;
            Mb.h hVar = this.f15669g;
            Yb.b bVar = this.f15666d;
            while (true) {
                if (!this.f15671i) {
                    if (this.f15673k) {
                        hVar.clear();
                        return;
                    }
                    if (!this.f15668f && ((Throwable) bVar.get()) != null) {
                        hVar.clear();
                        this.f15673k = true;
                        pVar.onError(bVar.b());
                        return;
                    }
                    boolean z10 = this.f15672j;
                    try {
                        Object objPoll = hVar.poll();
                        boolean z11 = objPoll == null;
                        if (z10 && z11) {
                            this.f15673k = true;
                            Throwable thB = bVar.b();
                            if (thB != null) {
                                pVar.onError(thB);
                                return;
                            } else {
                                pVar.a();
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                Eb.n nVar = (Eb.n) Lb.b.e(this.f15664b.apply(objPoll), "The mapper returned a null ObservableSource");
                                if (nVar instanceof Callable) {
                                    try {
                                        Object objCall = ((Callable) nVar).call();
                                        if (objCall != null && !this.f15673k) {
                                            pVar.c(objCall);
                                        }
                                    } catch (Throwable th) {
                                        Ib.b.b(th);
                                        bVar.a(th);
                                    }
                                } else {
                                    this.f15671i = true;
                                    nVar.f(this.f15667e);
                                }
                            } catch (Throwable th2) {
                                Ib.b.b(th2);
                                this.f15673k = true;
                                this.f15670h.dispose();
                                hVar.clear();
                                bVar.a(th2);
                                pVar.onError(bVar.b());
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Ib.b.b(th3);
                        this.f15673k = true;
                        this.f15670h.dispose();
                        bVar.a(th3);
                        pVar.onError(bVar.b());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15673k = true;
            this.f15670h.dispose();
            this.f15667e.d();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15673k;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (!this.f15666d.a(th)) {
                AbstractC2904a.q(th);
            } else {
                this.f15672j = true;
                d();
            }
        }
    }

    /* JADX INFO: renamed from: Sb.d$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Jb.e f15678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f15679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Mb.h f15681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Hb.c f15682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f15683g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f15684h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f15685i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15686j;

        /* JADX INFO: renamed from: Sb.d$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AtomicReference implements Eb.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Eb.p f15687a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f15688b;

            public a(Eb.p pVar, b bVar) {
                this.f15687a = pVar;
                this.f15688b = bVar;
            }

            @Override // Eb.p
            public void a() {
                this.f15688b.e();
            }

            @Override // Eb.p
            public void b(Hb.c cVar) {
                Kb.c.p(this, cVar);
            }

            @Override // Eb.p
            public void c(Object obj) {
                this.f15687a.c(obj);
            }

            public void d() {
                Kb.c.a(this);
            }

            @Override // Eb.p
            public void onError(Throwable th) {
                this.f15688b.dispose();
                this.f15687a.onError(th);
            }
        }

        public b(Eb.p pVar, Jb.e eVar, int i10) {
            this.f15677a = pVar;
            this.f15678b = eVar;
            this.f15680d = i10;
            this.f15679c = new a(pVar, this);
        }

        @Override // Eb.p
        public void a() {
            if (this.f15685i) {
                return;
            }
            this.f15685i = true;
            d();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15682f, cVar)) {
                this.f15682f = cVar;
                if (cVar instanceof Mb.c) {
                    Mb.c cVar2 = (Mb.c) cVar;
                    int iQ = cVar2.q(3);
                    if (iQ == 1) {
                        this.f15686j = iQ;
                        this.f15681e = cVar2;
                        this.f15685i = true;
                        this.f15677a.b(this);
                        d();
                        return;
                    }
                    if (iQ == 2) {
                        this.f15686j = iQ;
                        this.f15681e = cVar2;
                        this.f15677a.b(this);
                        return;
                    }
                }
                this.f15681e = new Ub.c(this.f15680d);
                this.f15677a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15685i) {
                return;
            }
            if (this.f15686j == 0) {
                this.f15681e.offer(obj);
            }
            d();
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f15684h) {
                if (!this.f15683g) {
                    boolean z10 = this.f15685i;
                    try {
                        Object objPoll = this.f15681e.poll();
                        boolean z11 = objPoll == null;
                        if (z10 && z11) {
                            this.f15684h = true;
                            this.f15677a.a();
                            return;
                        } else if (!z11) {
                            try {
                                Eb.n nVar = (Eb.n) Lb.b.e(this.f15678b.apply(objPoll), "The mapper returned a null ObservableSource");
                                this.f15683g = true;
                                nVar.f(this.f15679c);
                            } catch (Throwable th) {
                                Ib.b.b(th);
                                dispose();
                                this.f15681e.clear();
                                this.f15677a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Ib.b.b(th2);
                        dispose();
                        this.f15681e.clear();
                        this.f15677a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f15681e.clear();
        }

        @Override // Hb.c
        public void dispose() {
            this.f15684h = true;
            this.f15679c.d();
            this.f15682f.dispose();
            if (getAndIncrement() == 0) {
                this.f15681e.clear();
            }
        }

        public void e() {
            this.f15683g = false;
            d();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15684h;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15685i) {
                AbstractC2904a.q(th);
                return;
            }
            this.f15685i = true;
            dispose();
            this.f15677a.onError(th);
        }
    }

    public C2203d(Eb.n nVar, Jb.e eVar, int i10, Yb.e eVar2) {
        super(nVar);
        this.f15660b = eVar;
        this.f15662d = eVar2;
        this.f15661c = Math.max(8, i10);
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        if (T.b(this.f15624a, pVar, this.f15660b)) {
            return;
        }
        if (this.f15662d == Yb.e.IMMEDIATE) {
            this.f15624a.f(new b(new ac.c(pVar), this.f15660b, this.f15661c));
        } else {
            this.f15624a.f(new a(pVar, this.f15660b, this.f15661c, this.f15662d == Yb.e.END));
        }
    }
}
