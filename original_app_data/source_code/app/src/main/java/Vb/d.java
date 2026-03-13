package Vb;

import Eb.q;
import bc.AbstractC2904a;
import cc.AbstractC3096a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f17387d = AbstractC3096a.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f17389c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f17390a;

        public a(b bVar) {
            this.f17390a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f17390a;
            bVar.f17393b.a(d.this.c(bVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AtomicReference implements Runnable, Hb.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Kb.g f17392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Kb.g f17393b;

        public b(Runnable runnable) {
            super(runnable);
            this.f17392a = new Kb.g();
            this.f17393b = new Kb.g();
        }

        @Override // Hb.c
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f17392a.dispose();
                this.f17393b.dispose();
            }
        }

        @Override // Hb.c
        public boolean j() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    Kb.g gVar = this.f17392a;
                    Kb.c cVar = Kb.c.DISPOSED;
                    gVar.lazySet(cVar);
                    this.f17393b.lazySet(cVar);
                } catch (Throwable th) {
                    lazySet(null);
                    this.f17392a.lazySet(Kb.c.DISPOSED);
                    this.f17393b.lazySet(Kb.c.DISPOSED);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends q.c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f17394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f17395b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f17397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f17398e = new AtomicInteger();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Hb.b f17399f = new Hb.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ub.a f17396c = new Ub.a();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends AtomicBoolean implements Runnable, Hb.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Runnable f17400a;

            public a(Runnable runnable) {
                this.f17400a = runnable;
            }

            @Override // Hb.c
            public void dispose() {
                lazySet(true);
            }

            @Override // Hb.c
            public boolean j() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f17400a.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b extends AtomicInteger implements Runnable, Hb.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Runnable f17401a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Kb.b f17402b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public volatile Thread f17403c;

            public b(Runnable runnable, Kb.b bVar) {
                this.f17401a = runnable;
                this.f17402b = bVar;
            }

            public void a() {
                Kb.b bVar = this.f17402b;
                if (bVar != null) {
                    bVar.c(this);
                }
            }

            @Override // Hb.c
            public void dispose() {
                while (true) {
                    int i10 = get();
                    if (i10 >= 2) {
                        return;
                    }
                    if (i10 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f17403c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f17403c = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // Hb.c
            public boolean j() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f17403c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f17403c = null;
                        return;
                    }
                    try {
                        this.f17401a.run();
                        this.f17403c = null;
                        if (compareAndSet(1, 2)) {
                            a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th) {
                        this.f17403c = null;
                        if (compareAndSet(1, 2)) {
                            a();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: Vb.d$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public final class RunnableC0224c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Kb.g f17404a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Runnable f17405b;

            public RunnableC0224c(Kb.g gVar, Runnable runnable) {
                this.f17404a = gVar;
                this.f17405b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17404a.a(c.this.b(this.f17405b));
            }
        }

        public c(Executor executor, boolean z10) {
            this.f17395b = executor;
            this.f17394a = z10;
        }

        @Override // Eb.q.c
        public Hb.c b(Runnable runnable) {
            Hb.c aVar;
            if (this.f17397d) {
                return Kb.d.INSTANCE;
            }
            Runnable runnableR = AbstractC2904a.r(runnable);
            if (this.f17394a) {
                aVar = new b(runnableR, this.f17399f);
                this.f17399f.a(aVar);
            } else {
                aVar = new a(runnableR);
            }
            this.f17396c.offer(aVar);
            if (this.f17398e.getAndIncrement() != 0) {
                return aVar;
            }
            try {
                this.f17395b.execute(this);
                return aVar;
            } catch (RejectedExecutionException e10) {
                this.f17397d = true;
                this.f17396c.clear();
                AbstractC2904a.q(e10);
                return Kb.d.INSTANCE;
            }
        }

        @Override // Eb.q.c
        public Hb.c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (j10 <= 0) {
                return b(runnable);
            }
            if (this.f17397d) {
                return Kb.d.INSTANCE;
            }
            Kb.g gVar = new Kb.g();
            Kb.g gVar2 = new Kb.g(gVar);
            l lVar = new l(new RunnableC0224c(gVar2, AbstractC2904a.r(runnable)), this.f17399f);
            this.f17399f.a(lVar);
            Executor executor = this.f17395b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    lVar.a(((ScheduledExecutorService) executor).schedule((Callable) lVar, j10, timeUnit));
                } catch (RejectedExecutionException e10) {
                    this.f17397d = true;
                    AbstractC2904a.q(e10);
                    return Kb.d.INSTANCE;
                }
            } else {
                lVar.a(new Vb.c(d.f17387d.d(lVar, j10, timeUnit)));
            }
            gVar.a(lVar);
            return gVar2;
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f17397d) {
                return;
            }
            this.f17397d = true;
            this.f17399f.dispose();
            if (this.f17398e.getAndIncrement() == 0) {
                this.f17396c.clear();
            }
        }

        @Override // Hb.c
        public boolean j() {
            return this.f17397d;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ub.a aVar = this.f17396c;
            int iAddAndGet = 1;
            while (!this.f17397d) {
                do {
                    Runnable runnable = (Runnable) aVar.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else if (this.f17397d) {
                        aVar.clear();
                        return;
                    } else {
                        iAddAndGet = this.f17398e.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f17397d);
                aVar.clear();
                return;
            }
            aVar.clear();
        }
    }

    public d(Executor executor, boolean z10) {
        this.f17389c = executor;
        this.f17388b = z10;
    }

    @Override // Eb.q
    public q.c a() {
        return new c(this.f17389c, this.f17388b);
    }

    @Override // Eb.q
    public Hb.c c(Runnable runnable) {
        Runnable runnableR = AbstractC2904a.r(runnable);
        try {
            if (this.f17389c instanceof ExecutorService) {
                k kVar = new k(runnableR);
                kVar.a(((ExecutorService) this.f17389c).submit(kVar));
                return kVar;
            }
            if (this.f17388b) {
                c.b bVar = new c.b(runnableR, null);
                this.f17389c.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(runnableR);
            this.f17389c.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e10) {
            AbstractC2904a.q(e10);
            return Kb.d.INSTANCE;
        }
    }

    @Override // Eb.q
    public Hb.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        Runnable runnableR = AbstractC2904a.r(runnable);
        if (!(this.f17389c instanceof ScheduledExecutorService)) {
            b bVar = new b(runnableR);
            bVar.f17392a.a(f17387d.d(new a(bVar), j10, timeUnit));
            return bVar;
        }
        try {
            k kVar = new k(runnableR);
            kVar.a(((ScheduledExecutorService) this.f17389c).schedule(kVar, j10, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e10) {
            AbstractC2904a.q(e10);
            return Kb.d.INSTANCE;
        }
    }

    @Override // Eb.q
    public Hb.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        if (!(this.f17389c instanceof ScheduledExecutorService)) {
            return super.e(runnable, j10, j11, timeUnit);
        }
        try {
            j jVar = new j(AbstractC2904a.r(runnable));
            jVar.a(((ScheduledExecutorService) this.f17389c).scheduleAtFixedRate(jVar, j10, j11, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e10) {
            AbstractC2904a.q(e10);
            return Kb.d.INSTANCE;
        }
    }
}
