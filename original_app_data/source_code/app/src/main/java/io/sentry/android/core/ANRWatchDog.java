package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.transport.ICurrentDateProvider;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class ANRWatchDog extends Thread {
    private final ANRListener anrListener;
    private final Context context;
    private volatile long lastKnownActiveUiTimestampMs;
    private final ILogger logger;
    private long pollingIntervalMs;
    private final boolean reportInDebug;
    private final AtomicBoolean reported;
    private final Runnable ticker;
    private final ICurrentDateProvider timeProvider;
    private final long timeoutIntervalMillis;
    private final MainLooperHandler uiHandler;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ANRListener {
        void onAppNotResponding(ApplicationNotResponding applicationNotResponding);
    }

    public ANRWatchDog(long j10, boolean z10, ANRListener aNRListener, ILogger iLogger, Context context) {
        this(new ICurrentDateProvider() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.ICurrentDateProvider
            public final long getCurrentTimeMillis() {
                return SystemClock.uptimeMillis();
            }
        }, j10, 500L, z10, aNRListener, iLogger, new MainLooperHandler(), context);
    }

    public static /* synthetic */ void a(ANRWatchDog aNRWatchDog, ICurrentDateProvider iCurrentDateProvider) {
        aNRWatchDog.getClass();
        aNRWatchDog.lastKnownActiveUiTimestampMs = iCurrentDateProvider.getCurrentTimeMillis();
        aNRWatchDog.reported.set(false);
    }

    private boolean isProcessNotResponding() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.ticker.run();
        while (!isInterrupted()) {
            this.uiHandler.post(this.ticker);
            try {
                Thread.sleep(this.pollingIntervalMs);
                if (this.timeProvider.getCurrentTimeMillis() - this.lastKnownActiveUiTimestampMs > this.timeoutIntervalMillis) {
                    if (!this.reportInDebug && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.logger.log(SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.reported.set(true);
                    } else if (isProcessNotResponding() && this.reported.compareAndSet(false, true)) {
                        this.anrListener.onAppNotResponding(new ApplicationNotResponding("Application Not Responding for at least " + this.timeoutIntervalMillis + " ms.", this.uiHandler.getThread()));
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.logger.log(SentryLevel.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.logger.log(SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }

    public ANRWatchDog(final ICurrentDateProvider iCurrentDateProvider, long j10, long j11, boolean z10, ANRListener aNRListener, ILogger iLogger, MainLooperHandler mainLooperHandler, Context context) {
        super("|ANR-WatchDog|");
        this.lastKnownActiveUiTimestampMs = 0L;
        this.reported = new AtomicBoolean(false);
        this.timeProvider = iCurrentDateProvider;
        this.timeoutIntervalMillis = j10;
        this.pollingIntervalMs = j11;
        this.reportInDebug = z10;
        this.anrListener = aNRListener;
        this.logger = iLogger;
        this.uiHandler = mainLooperHandler;
        this.context = context;
        this.ticker = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                ANRWatchDog.a(this.f38506a, iCurrentDateProvider);
            }
        };
        if (j10 < this.pollingIntervalMs * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.pollingIntervalMs * 2)));
        }
    }
}
