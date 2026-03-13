package Sb;

import ac.AbstractC2684a;
import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.n f15707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15708c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC2684a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f15709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15710c;

        public a(b bVar) {
            this.f15709b = bVar;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15710c) {
                return;
            }
            this.f15710c = true;
            this.f15709b.e();
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15710c) {
                return;
            }
            this.f15709b.g();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15710c) {
                AbstractC2904a.q(th);
            } else {
                this.f15710c = true;
                this.f15709b.f(th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicInteger implements Eb.p, Hb.c, Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Object f15711k = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f15713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f15714c = new a(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference f15715d = new AtomicReference();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f15716e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ub.a f15717f = new Ub.a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Yb.b f15718g = new Yb.b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f15719h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f15720i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public dc.e f15721j;

        public b(Eb.p pVar, int i10) {
            this.f15712a = pVar;
            this.f15713b = i10;
        }

        @Override // Eb.p
        public void a() {
            this.f15714c.dispose();
            this.f15720i = true;
            d();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.u(this.f15715d, cVar)) {
                g();
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            this.f15717f.offer(obj);
            d();
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            Eb.p pVar = this.f15712a;
            Ub.a aVar = this.f15717f;
            Yb.b bVar = this.f15718g;
            int iAddAndGet = 1;
            while (this.f15716e.get() != 0) {
                dc.e eVar = this.f15721j;
                boolean z10 = this.f15720i;
                if (z10 && bVar.get() != null) {
                    aVar.clear();
                    Throwable thB = bVar.b();
                    if (eVar != null) {
                        this.f15721j = null;
                        eVar.onError(thB);
                    }
                    pVar.onError(thB);
                    return;
                }
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thB2 = bVar.b();
                    if (thB2 == null) {
                        if (eVar != null) {
                            this.f15721j = null;
                            eVar.a();
                        }
                        pVar.a();
                        return;
                    }
                    if (eVar != null) {
                        this.f15721j = null;
                        eVar.onError(thB2);
                    }
                    pVar.onError(thB2);
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f15711k) {
                    eVar.c(objPoll);
                } else {
                    if (eVar != null) {
                        this.f15721j = null;
                        eVar.a();
                    }
                    if (!this.f15719h.get()) {
                        dc.e eVarP0 = dc.e.P0(this.f15713b, this);
                        this.f15721j = eVarP0;
                        this.f15716e.getAndIncrement();
                        pVar.c(eVarP0);
                    }
                }
            }
            aVar.clear();
            this.f15721j = null;
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f15719h.compareAndSet(false, true)) {
                this.f15714c.dispose();
                if (this.f15716e.decrementAndGet() == 0) {
                    Kb.c.a(this.f15715d);
                }
            }
        }

        public void e() {
            Kb.c.a(this.f15715d);
            this.f15720i = true;
            d();
        }

        public void f(Throwable th) {
            Kb.c.a(this.f15715d);
            if (!this.f15718g.a(th)) {
                AbstractC2904a.q(th);
            } else {
                this.f15720i = true;
                d();
            }
        }

        public void g() {
            this.f15717f.offer(f15711k);
            d();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15719h.get();
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15714c.dispose();
            if (!this.f15718g.a(th)) {
                AbstractC2904a.q(th);
            } else {
                this.f15720i = true;
                d();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15716e.decrementAndGet() == 0) {
                Kb.c.a(this.f15715d);
            }
        }
    }

    public g0(Eb.n nVar, Eb.n nVar2, int i10) {
        super(nVar);
        this.f15707b = nVar2;
        this.f15708c = i10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        b bVar = new b(pVar, this.f15708c);
        pVar.b(bVar);
        this.f15707b.f(bVar.f15714c);
        this.f15624a.f(bVar);
    }
}
