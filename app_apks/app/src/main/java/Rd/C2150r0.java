package Rd;

import Wd.AbstractC2321a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import lc.InterfaceC4992i;

/* JADX INFO: renamed from: Rd.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2150r0 extends AbstractC2149q0 implements W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f15205c;

    public C2150r0(Executor executor) {
        this.f15205c = executor;
        AbstractC2321a.a(J0());
    }

    @Override // Rd.W
    public void G(long j10, InterfaceC2138l interfaceC2138l) {
        long j11;
        Executor executorJ0 = J0();
        ScheduledFuture scheduledFutureQ0 = null;
        ScheduledExecutorService scheduledExecutorService = executorJ0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorJ0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureQ0 = Q0(scheduledExecutorService, new R0(this, interfaceC2138l), interfaceC2138l.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureQ0 != null) {
            AbstractC2146p.c(interfaceC2138l, new C2134j(scheduledFutureQ0));
        } else {
            S.f15149h.G(j11, interfaceC2138l);
        }
    }

    @Override // Rd.W
    public InterfaceC2127f0 H(long j10, Runnable runnable, InterfaceC4992i interfaceC4992i) {
        long j11;
        Runnable runnable2;
        InterfaceC4992i interfaceC4992i2;
        Executor executorJ0 = J0();
        ScheduledFuture scheduledFutureQ0 = null;
        ScheduledExecutorService scheduledExecutorService = executorJ0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorJ0 : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            interfaceC4992i2 = interfaceC4992i;
            scheduledFutureQ0 = Q0(scheduledExecutorService, runnable2, interfaceC4992i2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            interfaceC4992i2 = interfaceC4992i;
        }
        return scheduledFutureQ0 != null ? new C2125e0(scheduledFutureQ0) : S.f15149h.H(j11, runnable2, interfaceC4992i2);
    }

    @Override // Rd.AbstractC2149q0
    public Executor J0() {
        return this.f15205c;
    }

    public final void M0(InterfaceC4992i interfaceC4992i, RejectedExecutionException rejectedExecutionException) {
        C0.c(interfaceC4992i, AbstractC2145o0.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture Q0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC4992i interfaceC4992i, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            this.M0(interfaceC4992i, e10);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorJ0 = J0();
        ExecutorService executorService = executorJ0 instanceof ExecutorService ? (ExecutorService) executorJ0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2150r0) && ((C2150r0) obj).J0() == J0();
    }

    public int hashCode() {
        return System.identityHashCode(J0());
    }

    @Override // Rd.I
    public void k0(InterfaceC4992i interfaceC4992i, Runnable runnable) {
        Runnable runnableH;
        try {
            Executor executorJ0 = J0();
            AbstractC2118b abstractC2118b = AbstractC2120c.f15162a;
            if (abstractC2118b == null || (runnableH = abstractC2118b.h(runnable)) == null) {
                runnableH = runnable;
            }
            executorJ0.execute(runnableH);
        } catch (RejectedExecutionException e10) {
            AbstractC2118b abstractC2118b2 = AbstractC2120c.f15162a;
            if (abstractC2118b2 != null) {
                abstractC2118b2.e();
            }
            M0(interfaceC4992i, e10);
            C2123d0.b().k0(interfaceC4992i, runnable);
        }
    }

    @Override // Rd.I
    public String toString() {
        return J0().toString();
    }
}
