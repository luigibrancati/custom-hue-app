package O;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b extends d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O.a f10693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f10694d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f10695e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O7.e f10696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile O7.e f10697g;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ O7.e f10698a;

        public a(O7.e eVar) {
            this.f10698a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [O.b] */
        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        b.this.d(n.m(this.f10698a));
                    } catch (ExecutionException e10) {
                        b.this.e(e10.getCause());
                    }
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                }
            } finally {
                b.this.f10697g = null;
            }
        }
    }

    public b(O.a aVar, O7.e eVar) {
        this.f10693c = (O.a) X0.h.g(aVar);
        this.f10696f = (O7.e) X0.h.g(eVar);
    }

    @Override // O.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        i(this.f10694d, Boolean.valueOf(z10));
        h(this.f10696f, z10);
        h(this.f10697g, z10);
        return true;
    }

    @Override // O.d, java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            O7.e eVar = this.f10696f;
            if (eVar != null) {
                eVar.get();
            }
            this.f10695e.await();
            O7.e eVar2 = this.f10697g;
            if (eVar2 != null) {
                eVar2.get();
            }
        }
        return super.get();
    }

    public final void h(Future future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    public final void i(BlockingQueue blockingQueue, Object obj) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(obj);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final Object k(BlockingQueue blockingQueue) {
        Object objTake;
        boolean z10 = false;
        while (true) {
            try {
                objTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [O.b, O.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [O.b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3, types: [O.d] */
    /* JADX WARN: Type inference failed for: r4v4, types: [O.b] */
    /* JADX WARN: Type inference failed for: r4v6, types: [O.d] */
    /* JADX WARN: Type inference failed for: r4v7, types: [O.d] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r42;
        try {
            try {
                try {
                    try {
                        try {
                            O7.e eVarApply = this.f10693c.apply(n.m(this.f10696f));
                            this.f10697g = eVarApply;
                            if (isCancelled()) {
                                eVarApply.cancel(((Boolean) k(this.f10694d)).booleanValue());
                                this.f10697g = null;
                            } else {
                                eVarApply.b(new a(eVarApply), N.a.a());
                            }
                        } catch (CancellationException unused) {
                            cancel(false);
                        } catch (ExecutionException e10) {
                            e(e10.getCause());
                        }
                    } catch (Error e11) {
                        this.e(e11);
                        r42 = this;
                    }
                } catch (Exception e12) {
                    this.e(e12);
                    r42 = this;
                }
            } finally {
                this.f10693c = null;
                this.f10696f = null;
                this.f10695e.countDown();
            }
        } catch (UndeclaredThrowableException e13) {
            this.e(e13.getCause());
            r42 = this;
        }
    }

    @Override // O.d, java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            O7.e eVar = this.f10696f;
            if (eVar != null) {
                long jNanoTime = System.nanoTime();
                eVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f10695e.await(j10, timeUnit)) {
                j10 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                O7.e eVar2 = this.f10697g;
                if (eVar2 != null) {
                    eVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j10, timeUnit);
    }
}
