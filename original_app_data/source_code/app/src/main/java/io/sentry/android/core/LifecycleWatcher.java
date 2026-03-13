package io.sentry.android.core;

import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ScopeCallback;
import io.sentry.SentryLevel;
import io.sentry.Session;
import io.sentry.android.core.AppState;
import io.sentry.protocol.SentryThread;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class LifecycleWatcher implements AppState.AppStateListener {
    private final ICurrentDateProvider currentDateProvider;
    private final boolean enableAppLifecycleBreadcrumbs;
    private final boolean enableSessionTracking;
    private final AtomicLong lastUpdatedSession;
    private final IScopes scopes;
    private final long sessionIntervalMillis;
    private final LazyEvaluator<Timer> timer;
    private final AutoClosableReentrantLock timerLock;
    private TimerTask timerTask;

    public LifecycleWatcher(IScopes iScopes, long j10, boolean z10, boolean z11) {
        this(iScopes, j10, z10, z11, CurrentDateProvider.getInstance());
    }

    public static /* synthetic */ void a(LifecycleWatcher lifecycleWatcher, IScope iScope) {
        Session session;
        if (lifecycleWatcher.lastUpdatedSession.get() != 0 || (session = iScope.getSession()) == null || session.getStarted() == null) {
            return;
        }
        lifecycleWatcher.lastUpdatedSession.set(session.getStarted().getTime());
    }

    private void addAppBreadcrumb(String str) {
        if (this.enableAppLifecycleBreadcrumbs) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType("navigation");
            breadcrumb.setData(SentryThread.JsonKeys.STATE, str);
            breadcrumb.setCategory("app.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            this.scopes.addBreadcrumb(breadcrumb);
        }
    }

    public static /* synthetic */ Timer b() {
        return new Timer(true);
    }

    private void cancelTask() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            TimerTask timerTask = this.timerTask;
            if (timerTask != null) {
                timerTask.cancel();
                this.timerTask = null;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void scheduleEndSession() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            cancelTask();
            this.timerTask = new TimerTask() { // from class: io.sentry.android.core.LifecycleWatcher.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    if (LifecycleWatcher.this.enableSessionTracking) {
                        LifecycleWatcher.this.scopes.endSession();
                    }
                    LifecycleWatcher.this.scopes.getOptions().getReplayController().stop();
                    LifecycleWatcher.this.scopes.getOptions().getContinuousProfiler().close(false);
                }
            };
            this.timer.getValue().schedule(this.timerTask, this.sessionIntervalMillis);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void startSession() {
        cancelTask();
        long currentTimeMillis = this.currentDateProvider.getCurrentTimeMillis();
        this.scopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.a0
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                LifecycleWatcher.a(this.f38505a, iScope);
            }
        });
        long j10 = this.lastUpdatedSession.get();
        if (j10 == 0 || j10 + this.sessionIntervalMillis <= currentTimeMillis) {
            if (this.enableSessionTracking) {
                this.scopes.startSession();
            }
            this.scopes.getOptions().getReplayController().start();
        }
        this.scopes.getOptions().getReplayController().resume();
        this.lastUpdatedSession.set(currentTimeMillis);
    }

    public Timer getTimer() {
        return this.timer.getValue();
    }

    public TimerTask getTimerTask() {
        return this.timerTask;
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onBackground() {
        this.lastUpdatedSession.set(this.currentDateProvider.getCurrentTimeMillis());
        this.scopes.getOptions().getReplayController().pause();
        scheduleEndSession();
        addAppBreadcrumb("background");
    }

    @Override // io.sentry.android.core.AppState.AppStateListener
    public void onForeground() {
        startSession();
        addAppBreadcrumb("foreground");
    }

    public LifecycleWatcher(IScopes iScopes, long j10, boolean z10, boolean z11, ICurrentDateProvider iCurrentDateProvider) {
        this.lastUpdatedSession = new AtomicLong(0L);
        this.timer = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.Z
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return LifecycleWatcher.b();
            }
        });
        this.timerLock = new AutoClosableReentrantLock();
        this.sessionIntervalMillis = j10;
        this.enableSessionTracking = z10;
        this.enableAppLifecycleBreadcrumbs = z11;
        this.scopes = iScopes;
        this.currentDateProvider = iCurrentDateProvider;
    }
}
