package Rd;

import Rd.AbstractC2137k0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class S extends AbstractC2137k0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S f15149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f15150i;

    static {
        Long l10;
        S s10 = new S();
        f15149h = s10;
        AbstractC2135j0.e1(s10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f15150i = timeUnit.toNanos(l10.longValue());
    }

    public final synchronized void E1() {
        if (H1()) {
            debugStatus = 3;
            y1();
            AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread F1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f15149h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean G1() {
        return debugStatus == 4;
    }

    @Override // Rd.AbstractC2137k0, Rd.W
    public InterfaceC2127f0 H(long j10, Runnable runnable, InterfaceC4992i interfaceC4992i) {
        return B1(j10, runnable);
    }

    public final boolean H1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final synchronized boolean I1() {
        if (H1()) {
            return false;
        }
        debugStatus = 1;
        AbstractC4862t.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void J1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Rd.AbstractC2139l0
    public Thread k1() {
        Thread thread = _thread;
        return thread == null ? F1() : thread;
    }

    @Override // Rd.AbstractC2139l0
    public void l1(long j10, AbstractC2137k0.c cVar) {
        J1();
    }

    @Override // Rd.AbstractC2137k0
    public void q1(Runnable runnable) {
        if (G1()) {
            J1();
        }
        super.q1(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        X0.f15153a.d(this);
        AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
        if (abstractC2118b != null) {
            abstractC2118b.c();
        }
        try {
            if (!I1()) {
                _thread = null;
                E1();
                AbstractC2118b abstractC2118b2 = AbstractC2120c.f15162a;
                if (abstractC2118b2 != null) {
                    abstractC2118b2.g();
                }
                if (w1()) {
                    return;
                }
                k1();
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jH1 = h1();
                if (jH1 == Long.MAX_VALUE) {
                    AbstractC2118b abstractC2118b3 = AbstractC2120c.f15162a;
                    long jA = abstractC2118b3 != null ? abstractC2118b3.a() : System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f15150i + jA;
                    }
                    long j11 = j10 - jA;
                    if (j11 <= 0) {
                        _thread = null;
                        E1();
                        AbstractC2118b abstractC2118b4 = AbstractC2120c.f15162a;
                        if (abstractC2118b4 != null) {
                            abstractC2118b4.g();
                        }
                        if (w1()) {
                            return;
                        }
                        k1();
                        return;
                    }
                    jH1 = Bc.k.i(jH1, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jH1 > 0) {
                    if (H1()) {
                        _thread = null;
                        E1();
                        AbstractC2118b abstractC2118b5 = AbstractC2120c.f15162a;
                        if (abstractC2118b5 != null) {
                            abstractC2118b5.g();
                        }
                        if (w1()) {
                            return;
                        }
                        k1();
                        return;
                    }
                    AbstractC2118b abstractC2118b6 = AbstractC2120c.f15162a;
                    if (abstractC2118b6 != null) {
                        abstractC2118b6.b(this, jH1);
                    } else {
                        LockSupport.parkNanos(this, jH1);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            E1();
            AbstractC2118b abstractC2118b7 = AbstractC2120c.f15162a;
            if (abstractC2118b7 != null) {
                abstractC2118b7.g();
            }
            if (!w1()) {
                k1();
            }
            throw th;
        }
    }

    @Override // Rd.AbstractC2137k0, Rd.AbstractC2135j0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Rd.I
    public String toString() {
        return "DefaultExecutor";
    }
}
