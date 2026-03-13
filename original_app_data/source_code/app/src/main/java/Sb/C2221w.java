package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Sb.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2221w extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jb.e f15842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15843c;

    /* JADX INFO: renamed from: Sb.w$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AtomicInteger implements Eb.p, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15845b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Jb.e f15849f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Hb.c f15851h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f15852i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Hb.b f15846c = new Hb.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Yb.b f15848e = new Yb.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f15847d = new AtomicInteger(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicReference f15850g = new AtomicReference();

        /* JADX INFO: renamed from: Sb.w$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class C0195a extends AtomicReference implements Eb.t, Hb.c {
            public C0195a() {
            }

            @Override // Eb.t
            public void b(Hb.c cVar) {
                Kb.c.u(this, cVar);
            }

            @Override // Hb.c
            public void dispose() {
                Kb.c.a(this);
            }

            @Override // Hb.c
            public boolean j() {
                return Kb.c.b((Hb.c) get());
            }

            @Override // Eb.t
            public void onError(Throwable th) {
                a.this.h(this, th);
            }

            @Override // Eb.t
            public void onSuccess(Object obj) {
                a.this.i(this, obj);
            }
        }

        public a(Eb.p pVar, Jb.e eVar, boolean z10) {
            this.f15844a = pVar;
            this.f15849f = eVar;
            this.f15845b = z10;
        }

        @Override // Eb.p
        public void a() {
            this.f15847d.decrementAndGet();
            e();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15851h, cVar)) {
                this.f15851h = cVar;
                this.f15844a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            try {
                Eb.v vVar = (Eb.v) Lb.b.e(this.f15849f.apply(obj), "The mapper returned a null SingleSource");
                this.f15847d.getAndIncrement();
                C0195a c0195a = new C0195a();
                if (this.f15852i || !this.f15846c.a(c0195a)) {
                    return;
                }
                vVar.c(c0195a);
            } catch (Throwable th) {
                Ib.b.b(th);
                this.f15851h.dispose();
                onError(th);
            }
        }

        public void d() {
            Ub.c cVar = (Ub.c) this.f15850g.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        @Override // Hb.c
        public void dispose() {
            this.f15852i = true;
            this.f15851h.dispose();
            this.f15846c.dispose();
        }

        public void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        public void f() {
            Eb.p pVar = this.f15844a;
            AtomicInteger atomicInteger = this.f15847d;
            AtomicReference atomicReference = this.f15850g;
            int iAddAndGet = 1;
            while (!this.f15852i) {
                if (!this.f15845b && ((Throwable) this.f15848e.get()) != null) {
                    Throwable thB = this.f15848e.b();
                    d();
                    pVar.onError(thB);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                Ub.c cVar = (Ub.c) atomicReference.get();
                Object objPoll = cVar != null ? cVar.poll() : null;
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thB2 = this.f15848e.b();
                    if (thB2 != null) {
                        pVar.onError(thB2);
                        return;
                    } else {
                        pVar.a();
                        return;
                    }
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    pVar.c(objPoll);
                }
            }
            d();
        }

        public Ub.c g() {
            Ub.c cVar;
            do {
                Ub.c cVar2 = (Ub.c) this.f15850g.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new Ub.c(Eb.k.h());
            } while (!T1.e.a(this.f15850g, null, cVar));
            return cVar;
        }

        public void h(C0195a c0195a, Throwable th) {
            this.f15846c.c(c0195a);
            if (!this.f15848e.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            if (!this.f15845b) {
                this.f15851h.dispose();
                this.f15846c.dispose();
            }
            this.f15847d.decrementAndGet();
            e();
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(Sb.C2221w.a.C0195a r3, java.lang.Object r4) {
            /*
                r2 = this;
                Hb.b r0 = r2.f15846c
                r0.c(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                Eb.p r1 = r2.f15844a
                r1.c(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f15847d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference r4 = r2.f15850g
                java.lang.Object r4 = r4.get()
                Ub.c r4 = (Ub.c) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                Yb.b r3 = r2.f15848e
                java.lang.Throwable r3 = r3.b()
                if (r3 == 0) goto L41
                Eb.p r2 = r2.f15844a
                r2.onError(r3)
                return
            L41:
                Eb.p r2 = r2.f15844a
                r2.a()
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                goto L62
            L4e:
                Ub.c r3 = r2.g()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f15847d
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L63
            L62:
                return
            L63:
                r2.f()
                return
            L67:
                r2 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Sb.C2221w.a.i(Sb.w$a$a, java.lang.Object):void");
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15852i;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            this.f15847d.decrementAndGet();
            if (!this.f15848e.a(th)) {
                AbstractC2904a.q(th);
                return;
            }
            if (!this.f15845b) {
                this.f15846c.dispose();
            }
            e();
        }
    }

    public C2221w(Eb.n nVar, Jb.e eVar, boolean z10) {
        super(nVar);
        this.f15842b = eVar;
        this.f15843c = z10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        this.f15624a.f(new a(pVar, this.f15842b, this.f15843c));
    }
}
