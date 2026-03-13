package Vb;

import Eb.q;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f17413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f17414e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f17417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f17418i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f17419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f17420c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TimeUnit f17416g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f17415f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue f17422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Hb.b f17423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ScheduledExecutorService f17424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Future f17425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ThreadFactory f17426f;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f17421a = nanos;
            this.f17422b = new ConcurrentLinkedQueue();
            this.f17423c = new Hb.b();
            this.f17426f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f.f17414e);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f17424d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f17425e = scheduledFutureScheduleWithFixedDelay;
        }

        public void a() {
            if (this.f17422b.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.f17422b) {
                if (cVar.i() > jC) {
                    return;
                }
                if (this.f17422b.remove(cVar)) {
                    this.f17423c.b(cVar);
                }
            }
        }

        public c b() {
            if (this.f17423c.j()) {
                return f.f17417h;
            }
            while (!this.f17422b.isEmpty()) {
                c cVar = (c) this.f17422b.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            c cVar2 = new c(this.f17426f);
            this.f17423c.a(cVar2);
            return cVar2;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.k(c() + this.f17421a);
            this.f17422b.offer(cVar);
        }

        public void e() {
            this.f17423c.dispose();
            Future future = this.f17425e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f17424d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends q.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f17428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f17429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f17430d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Hb.b f17427a = new Hb.b();

        public b(a aVar) {
            this.f17428b = aVar;
            this.f17429c = aVar.b();
        }

        @Override // Eb.q.c
        public Hb.c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f17427a.j() ? Kb.d.INSTANCE : this.f17429c.e(runnable, j10, timeUnit, this.f17427a);
        }

        @Override // Hb.c
        public void dispose() {
            if (this.f17430d.compareAndSet(false, true)) {
                this.f17427a.dispose();
                this.f17428b.d(this.f17429c);
            }
        }

        @Override // Hb.c
        public boolean j() {
            return this.f17430d.get();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f17431c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f17431c = 0L;
        }

        public long i() {
            return this.f17431c;
        }

        public void k(long j10) {
            this.f17431c = j10;
        }
    }

    static {
        c cVar = new c(new i("RxCachedThreadSchedulerShutdown"));
        f17417h = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        i iVar = new i("RxCachedThreadScheduler", iMax);
        f17413d = iVar;
        f17414e = new i("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, iVar);
        f17418i = aVar;
        aVar.e();
    }

    public f() {
        this(f17413d);
    }

    @Override // Eb.q
    public q.c a() {
        return new b((a) this.f17420c.get());
    }

    @Override // Eb.q
    public void f() {
        a aVar;
        a aVar2;
        do {
            aVar = (a) this.f17420c.get();
            aVar2 = f17418i;
            if (aVar == aVar2) {
                return;
            }
        } while (!T1.e.a(this.f17420c, aVar, aVar2));
        aVar.e();
    }

    public void g() {
        a aVar = new a(f17415f, f17416g, this.f17419b);
        if (T1.e.a(this.f17420c, f17418i, aVar)) {
            return;
        }
        aVar.e();
    }

    public f(ThreadFactory threadFactory) {
        this.f17419b = threadFactory;
        this.f17420c = new AtomicReference(f17418i);
        g();
    }
}
