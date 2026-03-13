package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC3637x1 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Runnable f30262a = new RunnableC3625v1(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f30263b = new RunnableC3625v1(null);

    public abstract Object a();

    public abstract String b();

    public abstract void c(Throwable th);

    public abstract void d(Object obj);

    public final void e() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC3619u1 runnableC3619u1 = new RunnableC3619u1(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, runnableC3619u1)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f30262a)) == f30263b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f30262a)) == f30263b) {
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
        RunnableC3619u1 runnableC3619u1 = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof RunnableC3619u1)) {
                if (runnable != f30263b) {
                    break;
                }
            } else {
                runnableC3619u1 = (RunnableC3619u1) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f30263b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(runnableC3619u1);
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
                        if (!compareAndSet(threadCurrentThread, f30262a)) {
                            g(threadCurrentThread);
                        }
                        c(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f30262a)) {
                            g(threadCurrentThread);
                        }
                        d(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f30262a)) {
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
        if (runnable == f30262a) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC3619u1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
