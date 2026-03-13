package N;

import B0.c;
import O.n;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d.AbstractC3783B;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal f9483b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f9484a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return N.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f9485a;

        public b(Runnable runnable) {
            this.f9485a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f9485a.run();
            return null;
        }
    }

    /* JADX INFO: renamed from: N.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class RunnableScheduledFutureC0146c implements RunnableScheduledFuture {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f9487a = new AtomicReference(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Callable f9489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final O7.e f9490d;

        /* JADX INFO: renamed from: N.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements c.InterfaceC0018c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f9491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Callable f9492b;

            /* JADX INFO: renamed from: N.c$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            public class RunnableC0147a implements Runnable {
                public RunnableC0147a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0146c.this.f9487a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f9491a.removeCallbacks(RunnableScheduledFutureC0146c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f9491a = handler;
                this.f9492b = callable;
            }

            @Override // B0.c.InterfaceC0018c
            public Object a(c.a aVar) {
                aVar.a(new RunnableC0147a(), N.a.a());
                RunnableScheduledFutureC0146c.this.f9487a.set(aVar);
                return "HandlerScheduledFuture-" + this.f9492b.toString();
            }
        }

        public RunnableScheduledFutureC0146c(Handler handler, long j10, Callable callable) {
            this.f9488b = j10;
            this.f9489c = callable;
            this.f9490d = B0.c.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f9490d.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f9490d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f9488b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f9490d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f9490d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            c.a aVar = (c.a) this.f9487a.getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.c(this.f9489c.call());
                } catch (Exception e10) {
                    aVar.f(e10);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            return this.f9490d.get(j10, timeUnit);
        }
    }

    public c(Handler handler) {
        this.f9484a = handler;
    }

    public final RejectedExecutionException a() {
        return new RejectedExecutionException(this.f9484a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC3783B.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f9484a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        RunnableScheduledFutureC0146c runnableScheduledFutureC0146c = new RunnableScheduledFutureC0146c(this.f9484a, jUptimeMillis, callable);
        return this.f9484a.postAtTime(runnableScheduledFutureC0146c, jUptimeMillis) ? runnableScheduledFutureC0146c : n.o(a());
    }
}
