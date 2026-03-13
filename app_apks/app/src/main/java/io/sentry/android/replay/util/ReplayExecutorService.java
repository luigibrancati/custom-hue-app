package io.sentry.android.replay.util;

import Od.C;
import d.AbstractC3783B;
import fc.C4015H;
import io.sentry.ILogger;
import io.sentry.MonitorConfig;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012Jä\u0001\u0010\u001b\u001a^\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\u0018\u00010\u001a0\u0018\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u0015H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJü\u0001\u0010\u001b\u001a^\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\u0018\u00010\u001a0\u0018\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u00152\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001eJ\u0090\u0001\u0010\u001f\u001a\n \n*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u0015H\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J¨\u0001\u0010\u001f\u001a\n \n*\u0004\u0018\u00018\u00008\u0000\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132d\u0010\b\u001a`\u0012*\b\u0001\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016 \n*.\u0012(\u0012&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016\u0018\u00010\u00170\u00152\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\u001f\u0010!J\u0010\u0010\"\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b$\u0010#JH\u0010&\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010%0%2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u008a\u0001\u0010&\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010%0%\"\u0010\b\u0000\u0010(*\n \n*\u0004\u0018\u00010\u00130\u00132*\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u00162\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u001d\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b&\u0010)JP\u0010+\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010%0%2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u000e\u0010*\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b+\u0010,JP\u0010-\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010%0%2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u000e\u0010*\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b-\u0010,J4\u0010.\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000f0\u000f \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u001a0\u0018H\u0096\u0001¢\u0006\u0004\b.\u0010/Jf\u00100\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u000f0\u000f2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b0\u00101Jr\u00100\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00190\u0019\"\u0010\b\u0000\u0010\u0014*\n \n*\u0004\u0018\u00010\u00130\u00132*\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b0\u00102J\u001d\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108¨\u00069"}, d2 = {"Lio/sentry/android/replay/util/ReplayExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "delegate", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "<init>", "(Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/SentryOptions;)V", "", "p0", "Ljava/util/concurrent/TimeUnit;", "kotlin.jvm.PlatformType", "p1", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "Ljava/lang/Runnable;", "Lfc/H;", "execute", "(Ljava/lang/Runnable;)V", "", "T", "", "Ljava/util/concurrent/Callable;", "", "", "Ljava/util/concurrent/Future;", "", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "p2", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "()Z", "isTerminated", "Ljava/util/concurrent/ScheduledFuture;", MonitorConfig.JsonKeys.SCHEDULE, "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "V", "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "p3", "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "shutdownNow", "()Ljava/util/List;", "submit", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;", "task", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "shutdown", "()V", "Ljava/util/concurrent/ScheduledExecutorService;", "Lio/sentry/SentryOptions;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayExecutorService implements ScheduledExecutorService, AutoCloseable {
    public static final int $stable = 8;
    private final ScheduledExecutorService delegate;
    private final SentryOptions options;

    public ReplayExecutorService(ScheduledExecutorService delegate, SentryOptions options) {
        AbstractC4862t.e(delegate, "delegate");
        AbstractC4862t.e(options, "options");
        this.delegate = delegate;
        this.options = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submit$lambda$0(Runnable runnable, ReplayExecutorService replayExecutorService) {
        try {
            runnable.run();
        } catch (Throwable th) {
            ILogger logger = replayExecutorService.options.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to execute task ");
            sb2.append(runnable instanceof ReplayRunnable ? ((ReplayRunnable) runnable).getTaskName() : "");
            logger.log(sentryLevel, sb2.toString(), th);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long p02, TimeUnit p12) {
        return this.delegate.awaitTermination(p02, p12);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC3783B.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable p02) {
        this.delegate.execute(p02);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p02) {
        return this.delegate.invokeAll(p02);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p02) {
        return (T) this.delegate.invokeAny(p02);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable p02, long p12, TimeUnit p22) {
        return this.delegate.schedule(p02, p12, p22);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable p02, long p12, long p22, TimeUnit p32) {
        return this.delegate.scheduleAtFixedRate(p02, p12, p22, p32);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable p02, long p12, long p22, TimeUnit p32) {
        return this.delegate.scheduleWithFixedDelay(p02, p12, p22, p32);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this) {
            if (!isShutdown()) {
                this.delegate.shutdown();
            }
            try {
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
            if (awaitTermination(this.options.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                C4015H c4015h = C4015H.f34254a;
            } else {
                shutdownNow();
                C4015H c4015h2 = C4015H.f34254a;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.delegate.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable p02, T p12) {
        return this.delegate.submit(p02, p12);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> p02, long p12, TimeUnit p22) {
        return this.delegate.invokeAll(p02, p12, p22);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> p02, long p12, TimeUnit p22) {
        return (T) this.delegate.invokeAny(p02, p12, p22);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> p02, long p12, TimeUnit p22) {
        return this.delegate.schedule(p02, p12, p22);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> p02) {
        return this.delegate.submit(p02);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable task) {
        AbstractC4862t.e(task, "task");
        String name = Thread.currentThread().getName();
        AbstractC4862t.d(name, "getName(...)");
        if (C.P(name, "SentryReplayIntegration", false, 2, null)) {
            task.run();
            return null;
        }
        try {
            return this.delegate.submit(new Runnable() { // from class: io.sentry.android.replay.util.c
                @Override // java.lang.Runnable
                public final void run() {
                    ReplayExecutorService.submit$lambda$0(task, this);
                }
            });
        } catch (Throwable th) {
            ILogger logger = this.options.getLogger();
            SentryLevel sentryLevel = SentryLevel.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to submit task ");
            sb2.append(task instanceof ReplayRunnable ? ((ReplayRunnable) task).getTaskName() : "");
            sb2.append(" to executor");
            logger.log(sentryLevel, sb2.toString(), th);
            return null;
        }
    }
}
