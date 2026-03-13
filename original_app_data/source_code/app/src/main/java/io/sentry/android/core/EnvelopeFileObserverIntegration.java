package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.OutboxSender;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnvelopeFileObserverIntegration implements Integration, Closeable {
    private ILogger logger;
    private EnvelopeFileObserver observer;
    private boolean isClosed = false;
    protected final AutoClosableReentrantLock startLock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        public String getPath(SentryOptions sentryOptions) {
            return sentryOptions.getOutboxPath();
        }
    }

    public static /* synthetic */ void a(EnvelopeFileObserverIntegration envelopeFileObserverIntegration, IScopes iScopes, SentryOptions sentryOptions, String str) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = envelopeFileObserverIntegration.startLock.acquire();
        try {
            if (!envelopeFileObserverIntegration.isClosed) {
                envelopeFileObserverIntegration.startOutboxSender(iScopes, sentryOptions, str);
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

    public static EnvelopeFileObserverIntegration getOutboxFileObserver() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    private void startOutboxSender(IScopes iScopes, SentryOptions sentryOptions, String str) {
        EnvelopeFileObserver envelopeFileObserver = new EnvelopeFileObserver(str, new OutboxSender(iScopes, sentryOptions.getEnvelopeReader(), sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis(), sentryOptions.getMaxQueueSize()), sentryOptions.getLogger(), sentryOptions.getFlushTimeoutMillis());
        this.observer = envelopeFileObserver;
        try {
            envelopeFileObserver.startWatching();
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion("EnvelopeFileObserver");
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.startLock.acquire();
        try {
            this.isClosed = true;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            EnvelopeFileObserver envelopeFileObserver = this.observer;
            if (envelopeFileObserver != null) {
                envelopeFileObserver.stopWatching();
                ILogger iLogger = this.logger;
                if (iLogger != null) {
                    iLogger.log(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
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

    public abstract String getPath(SentryOptions sentryOptions);

    @Override // io.sentry.Integration
    public final void register(final IScopes iScopes, final SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        this.logger = sentryOptions.getLogger();
        final String path = getPath(sentryOptions);
        if (path == null) {
            this.logger.log(SentryLevel.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.logger.log(SentryLevel.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", path);
        try {
            sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.U
                @Override // java.lang.Runnable
                public final void run() {
                    EnvelopeFileObserverIntegration.a(this.f38494a, iScopes, sentryOptions, path);
                }
            });
        } catch (Throwable th) {
            this.logger.log(SentryLevel.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th);
        }
    }
}
