package N6;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C1 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Runnable f9684a = new B1(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f9685b = new B1(null);

    public abstract Object a();

    public abstract String b();

    public abstract void c(Throwable th);

    public abstract void d(Object obj);

    public final void e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC1566z1 runnableC1566z1 = new RunnableC1566z1(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC1566z1)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f9684a)) == f9685b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f9684a)) == f9685b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public abstract boolean f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC1566z1 runnableC1566z1 = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof RunnableC1566z1)) {
                if (runnable != f9685b) {
                    break;
                }
            } else {
                runnableC1566z1 = (RunnableC1566z1) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f9685b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(runnableC1566z1);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zF = f();
            if (!zF) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, f9684a)) {
                            g(threadCurrentThread);
                        }
                        c(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f9684a)) {
                            g(threadCurrentThread);
                        }
                        d(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f9684a)) {
                g(threadCurrentThread);
            }
            if (zF) {
                return;
            }
            d(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f9684a) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC1566z1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
