package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private SentryAndroidOptions options;
    volatile LifecycleWatcher watcher;

    private void removeObserver() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            LifecycleWatcher lifecycleWatcher = this.watcher;
            this.watcher = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            if (lifecycleWatcher != null) {
                AppState.getInstance().removeAppStateListener(lifecycleWatcher);
                SentryAndroidOptions sentryAndroidOptions = this.options;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        removeObserver();
        AppState.getInstance().unregisterLifecycleObserver();
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.log(sentryLevel, "enableSessionTracking enabled: %s", Boolean.valueOf(this.options.isEnableAutoSessionTracking()));
        this.options.getLogger().log(sentryLevel, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.options.isEnableAppLifecycleBreadcrumbs()));
        if (!this.options.isEnableAutoSessionTracking() && !this.options.isEnableAppLifecycleBreadcrumbs()) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.watcher != null) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } else {
                this.watcher = new LifecycleWatcher(iScopes, this.options.getSessionTrackingIntervalMillis(), this.options.isEnableAutoSessionTracking(), this.options.isEnableAppLifecycleBreadcrumbs());
                AppState.getInstance().addAppStateListener(this.watcher);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                sentryOptions.getLogger().log(sentryLevel, "AppLifecycleIntegration installed.", new Object[0]);
                IntegrationUtils.addIntegrationToSdkVersion("AppLifecycle");
            }
        } finally {
        }
    }
}
