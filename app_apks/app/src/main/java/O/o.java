package O;

import E.AbstractC0807p0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements O7.e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f10730a;

        public a(Throwable th) {
            this.f10730a = th;
        }

        @Override // O.o, java.util.concurrent.Future
        public Object get() throws ExecutionException {
            throw new ExecutionException(this.f10730a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f10730a + "]]";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends a implements ScheduledFuture {
        public b(Throwable th) {
            super(th);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f10731b = new c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f10732a;

        public c(Object obj) {
            this.f10732a = obj;
        }

        @Override // O.o, java.util.concurrent.Future
        public Object get() {
            return this.f10732a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f10732a + "]]";
        }
    }

    public static O7.e p() {
        return c.f10731b;
    }

    @Override // O7.e
    public void b(Runnable runnable, Executor executor) {
        X0.h.g(runnable);
        X0.h.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            AbstractC0807p0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        X0.h.g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
