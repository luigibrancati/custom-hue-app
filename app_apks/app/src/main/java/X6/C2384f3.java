package X6;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2384f3 extends M3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f18933k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2376e3 f18934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2376e3 f18935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f18936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f18937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f18938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f18939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f18940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f18941j;

    public C2384f3(C2416j3 c2416j3) {
        super(c2416j3);
        this.f18940i = new Object();
        this.f18941j = new Semaphore(2);
        this.f18936e = new PriorityBlockingQueue();
        this.f18937f = new LinkedBlockingQueue();
        this.f18938g = new C2360c3(this, "Thread death: Uncaught exception on worker thread");
        this.f18939h = new C2360c3(this, "Thread death: Uncaught exception on network thread");
    }

    public final /* synthetic */ void A(C2376e3 c2376e3) {
        this.f18935d = null;
    }

    public final /* synthetic */ Object B() {
        return this.f18940i;
    }

    public final /* synthetic */ Semaphore C() {
        return this.f18941j;
    }

    public final /* synthetic */ boolean D() {
        return false;
    }

    public final void F(C2368d3 c2368d3) {
        synchronized (this.f18940i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f18936e;
                priorityBlockingQueue.add(c2368d3);
                C2376e3 c2376e3 = this.f18934c;
                if (c2376e3 == null) {
                    C2376e3 c2376e32 = new C2376e3(this, "Measurement Worker", priorityBlockingQueue);
                    this.f18934c = c2376e32;
                    c2376e32.setUncaughtExceptionHandler(this.f18938g);
                    this.f18934c.start();
                } else {
                    c2376e3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // X6.L3
    public final void g() {
        if (Thread.currentThread() != this.f18935d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // X6.L3
    public final void h() {
        if (Thread.currentThread() != this.f18934c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // X6.M3
    public final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f18934c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f18934c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f18935d;
    }

    public final Future r(Callable callable) {
        l();
        AbstractC6056k.l(callable);
        C2368d3 c2368d3 = new C2368d3(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f18934c) {
            F(c2368d3);
            return c2368d3;
        }
        if (!this.f18936e.isEmpty()) {
            this.f18400a.a().r().a("Callable skipped the worker queue.");
        }
        c2368d3.run();
        return c2368d3;
    }

    public final Future s(Callable callable) {
        l();
        AbstractC6056k.l(callable);
        C2368d3 c2368d3 = new C2368d3(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f18934c) {
            c2368d3.run();
            return c2368d3;
        }
        F(c2368d3);
        return c2368d3;
    }

    public final void t(Runnable runnable) {
        l();
        AbstractC6056k.l(runnable);
        F(new C2368d3(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f18400a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C2526x2 c2526x2R = this.f18400a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                c2526x2R.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f18400a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        AbstractC6056k.l(runnable);
        F(new C2368d3(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        AbstractC6056k.l(runnable);
        C2368d3 c2368d3 = new C2368d3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f18940i) {
            try {
                BlockingQueue blockingQueue = this.f18937f;
                blockingQueue.add(c2368d3);
                C2376e3 c2376e3 = this.f18935d;
                if (c2376e3 == null) {
                    C2376e3 c2376e32 = new C2376e3(this, "Measurement Network", blockingQueue);
                    this.f18935d = c2376e32;
                    c2376e32.setUncaughtExceptionHandler(this.f18939h);
                    this.f18935d.start();
                } else {
                    c2376e3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ C2376e3 x() {
        return this.f18934c;
    }

    public final /* synthetic */ void y(C2376e3 c2376e3) {
        this.f18934c = null;
    }

    public final /* synthetic */ C2376e3 z() {
        return this.f18935d;
    }
}
