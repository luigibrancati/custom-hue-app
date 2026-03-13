package Sb;

import Eb.q;
import bc.AbstractC2904a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class I extends AbstractC2200a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb.q f15478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15480d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Nb.b implements Eb.p, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Eb.p f15481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q.c f15482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f15484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Mb.h f15485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Hb.c f15486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Throwable f15487g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f15488h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f15489i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f15491k;

        public a(Eb.p pVar, q.c cVar, boolean z10, int i10) {
            this.f15481a = pVar;
            this.f15482b = cVar;
            this.f15483c = z10;
            this.f15484d = i10;
        }

        @Override // Eb.p
        public void a() {
            if (this.f15488h) {
                return;
            }
            this.f15488h = true;
            g();
        }

        @Override // Eb.p
        public void b(Hb.c cVar) {
            if (Kb.c.w(this.f15486f, cVar)) {
                this.f15486f = cVar;
                if (cVar instanceof Mb.c) {
                    Mb.c cVar2 = (Mb.c) cVar;
                    int iQ = cVar2.q(7);
                    if (iQ == 1) {
                        this.f15490j = iQ;
                        this.f15485e = cVar2;
                        this.f15488h = true;
                        this.f15481a.b(this);
                        g();
                        return;
                    }
                    if (iQ == 2) {
                        this.f15490j = iQ;
                        this.f15485e = cVar2;
                        this.f15481a.b(this);
                        return;
                    }
                }
                this.f15485e = new Ub.c(this.f15484d);
                this.f15481a.b(this);
            }
        }

        @Override // Eb.p
        public void c(Object obj) {
            if (this.f15488h) {
                return;
            }
            if (this.f15490j != 2) {
                this.f15485e.offer(obj);
            }
            g();
        }

        @Override // Mb.h
        public void clear() {
            this.f15485e.clear();
        }

        public boolean d(boolean z10, boolean z11, Eb.p pVar) {
            if (this.f15489i) {
                this.f15485e.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th = this.f15487g;
            if (this.f15483c) {
                if (!z11) {
                    return false;
                }
                this.f15489i = true;
                if (th != null) {
                    pVar.onError(th);
                } else {
                    pVar.a();
                }
                this.f15482b.dispose();
                return true;
            }
            if (th != null) {
                this.f15489i = true;
                this.f15485e.clear();
                pVar.onError(th);
                this.f15482b.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f15489i = true;
            pVar.a();
            this.f15482b.dispose();
            return true;
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f15489i) {
                return;
            }
            this.f15489i = true;
            this.f15486f.dispose();
            this.f15482b.dispose();
            if (this.f15491k || getAndIncrement() != 0) {
                return;
            }
            this.f15485e.clear();
        }

        public void e() {
            int iAddAndGet = 1;
            while (!this.f15489i) {
                boolean z10 = this.f15488h;
                Throwable th = this.f15487g;
                if (!this.f15483c && z10 && th != null) {
                    this.f15489i = true;
                    this.f15481a.onError(this.f15487g);
                    this.f15482b.dispose();
                    return;
                }
                this.f15481a.c(null);
                if (z10) {
                    this.f15489i = true;
                    Throwable th2 = this.f15487g;
                    if (th2 != null) {
                        this.f15481a.onError(th2);
                    } else {
                        this.f15481a.a();
                    }
                    this.f15482b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void f() {
            /*
                r7 = this;
                Mb.h r0 = r7.f15485e
                Eb.p r1 = r7.f15481a
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.f15488h
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.d(r4, r5, r1)
                if (r4 == 0) goto L13
                goto L2e
            L13:
                boolean r4 = r7.f15488h
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.d(r4, r6, r1)
                if (r4 == 0) goto L25
                goto L2e
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
            L2e:
                return
            L2f:
                r1.c(r5)
                goto L13
            L33:
                r3 = move-exception
                Ib.b.b(r3)
                r7.f15489i = r2
                Hb.c r2 = r7.f15486f
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                Eb.q$c r7 = r7.f15482b
                r7.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sb.I.a.f():void");
        }

        public void g() {
            if (getAndIncrement() == 0) {
                this.f15482b.b(this);
            }
        }

        @Override // Mb.h
        public boolean isEmpty() {
            return this.f15485e.isEmpty();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f15489i;
        }

        @Override // Eb.p
        public void onError(Throwable th) {
            if (this.f15488h) {
                AbstractC2904a.q(th);
                return;
            }
            this.f15487g = th;
            this.f15488h = true;
            g();
        }

        @Override // Mb.h
        public Object poll() {
            return this.f15485e.poll();
        }

        @Override // Mb.d
        public int q(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f15491k = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15491k) {
                e();
            } else {
                f();
            }
        }
    }

    public I(Eb.n nVar, Eb.q qVar, boolean z10, int i10) {
        super(nVar);
        this.f15478b = qVar;
        this.f15479c = z10;
        this.f15480d = i10;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        Eb.q qVar = this.f15478b;
        if (qVar instanceof Vb.o) {
            this.f15624a.f(pVar);
        } else {
            this.f15624a.f(new a(pVar, qVar.a(), this.f15479c, this.f15480d));
        }
    }
}
