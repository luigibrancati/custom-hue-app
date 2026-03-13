package Vb;

import Eb.q;
import bc.AbstractC2904a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f17448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f17449e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f17450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f17451c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends q.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScheduledExecutorService f17452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Hb.b f17453b = new Hb.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f17454c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f17452a = scheduledExecutorService;
        }

        @Override // Eb.q.c
        public Hb.c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f17454c) {
                return Kb.d.INSTANCE;
            }
            l lVar = new l(AbstractC2904a.r(runnable), this.f17453b);
            this.f17453b.a(lVar);
            try {
                lVar.a(j10 <= 0 ? this.f17452a.submit((Callable) lVar) : this.f17452a.schedule((Callable) lVar, j10, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                AbstractC2904a.q(e10);
                return Kb.d.INSTANCE;
            }
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f17454c) {
                return;
            }
            this.f17454c = true;
            this.f17453b.dispose();
        }

        @Override // Hb.c
        public boolean j() {
            return this.f17454c;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f17449e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f17448d = new i("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public n() {
        this(f17448d);
    }

    public static ScheduledExecutorService g(ThreadFactory threadFactory) {
        return m.a(threadFactory);
    }

    @Override // Eb.q
    public q.c a() {
        return new a((ScheduledExecutorService) this.f17451c.get());
    }

    @Override // Eb.q
    public Hb.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        k kVar = new k(AbstractC2904a.r(runnable));
        try {
            kVar.a(j10 <= 0 ? ((ScheduledExecutorService) this.f17451c.get()).submit(kVar) : ((ScheduledExecutorService) this.f17451c.get()).schedule(kVar, j10, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e10) {
            AbstractC2904a.q(e10);
            return Kb.d.INSTANCE;
        }
    }

    @Override // Eb.q
    public Hb.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableR = AbstractC2904a.r(runnable);
        if (j11 > 0) {
            j jVar = new j(runnableR);
            try {
                jVar.a(((ScheduledExecutorService) this.f17451c.get()).scheduleAtFixedRate(jVar, j10, j11, timeUnit));
                return jVar;
            } catch (RejectedExecutionException e10) {
                AbstractC2904a.q(e10);
                return Kb.d.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f17451c.get();
        e eVar = new e(runnableR, scheduledExecutorService);
        try {
            eVar.b(j10 <= 0 ? scheduledExecutorService.submit(eVar) : scheduledExecutorService.schedule(eVar, j10, timeUnit));
            return eVar;
        } catch (RejectedExecutionException e11) {
            AbstractC2904a.q(e11);
            return Kb.d.INSTANCE;
        }
    }

    @Override // Eb.q
    public void f() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f17451c.get();
        ScheduledExecutorService scheduledExecutorService3 = f17449e;
        if (scheduledExecutorService2 == scheduledExecutorService3 || (scheduledExecutorService = (ScheduledExecutorService) this.f17451c.getAndSet(scheduledExecutorService3)) == scheduledExecutorService3) {
            return;
        }
        scheduledExecutorService.shutdownNow();
    }

    public n(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f17451c = atomicReference;
        this.f17450b = threadFactory;
        atomicReference.lazySet(g(threadFactory));
    }
}
