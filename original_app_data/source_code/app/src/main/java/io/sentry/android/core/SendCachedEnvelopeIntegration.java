package io.sentry.android.core;

import io.sentry.DataCategory;
import io.sentry.IConnectionStatusProvider;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class SendCachedEnvelopeIntegration implements Integration, IConnectionStatusProvider.IConnectionStatusObserver, Closeable {
    private IConnectionStatusProvider connectionStatusProvider;
    private final SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory factory;
    private SentryAndroidOptions options;
    private IScopes scopes;
    private SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget sender;
    private final LazyEvaluator<Boolean> startupCrashMarkerEvaluator;
    private final AtomicBoolean startupCrashHandled = new AtomicBoolean(false);
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final AtomicBoolean isClosed = new AtomicBoolean(false);
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    public SendCachedEnvelopeIntegration(SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory sendFireAndForgetFactory, LazyEvaluator<Boolean> lazyEvaluator) {
        this.factory = (SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory) Objects.requireNonNull(sendFireAndForgetFactory, "SendFireAndForgetFactory is required");
        this.startupCrashMarkerEvaluator = lazyEvaluator;
    }

    public static /* synthetic */ void a(SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration, SentryAndroidOptions sentryAndroidOptions, IScopes iScopes) {
        sendCachedEnvelopeIntegration.getClass();
        try {
            if (sendCachedEnvelopeIntegration.isClosed.get()) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeIntegration.isInitialized.getAndSet(true)) {
                IConnectionStatusProvider connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                sendCachedEnvelopeIntegration.connectionStatusProvider = connectionStatusProvider;
                connectionStatusProvider.addConnectionStatusObserver(sendCachedEnvelopeIntegration);
                sendCachedEnvelopeIntegration.sender = sendCachedEnvelopeIntegration.factory.create(iScopes, sentryAndroidOptions);
            }
            IConnectionStatusProvider iConnectionStatusProvider = sendCachedEnvelopeIntegration.connectionStatusProvider;
            if (iConnectionStatusProvider != null && iConnectionStatusProvider.getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                return;
            }
            RateLimiter rateLimiter = iScopes.getRateLimiter();
            if (rateLimiter != null && rateLimiter.isActiveForCategory(DataCategory.All)) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                return;
            }
            SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget sendFireAndForget = sendCachedEnvelopeIntegration.sender;
            if (sendFireAndForget == null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
            } else {
                sendFireAndForget.send();
            }
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed trying to send cached events.", th);
        }
    }

    private void sendCachedEnvelopes(final IScopes iScopes, final SentryAndroidOptions sentryAndroidOptions) {
        try {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                Future<?> futureSubmit = sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeIntegration.a(this.f38512a, sentryAndroidOptions, iScopes);
                    }
                });
                if (this.startupCrashMarkerEvaluator.getValue().booleanValue() && this.startupCrashHandled.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } finally {
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
        IConnectionStatusProvider iConnectionStatusProvider = this.connectionStatusProvider;
        if (iConnectionStatusProvider != null) {
            iConnectionStatusProvider.removeConnectionStatusObserver(this);
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.IConnectionStatusObserver
    public void onConnectionStatusChanged(IConnectionStatusProvider.ConnectionStatus connectionStatus) {
        SentryAndroidOptions sentryAndroidOptions;
        IScopes iScopes = this.scopes;
        if (iScopes == null || (sentryAndroidOptions = this.options) == null || connectionStatus == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
            return;
        }
        sendCachedEnvelopes(iScopes, sentryAndroidOptions);
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        if (!this.factory.hasValidPath(sentryOptions.getCacheDirPath(), sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            IntegrationUtils.addIntegrationToSdkVersion("SendCachedEnvelope");
            sendCachedEnvelopes(iScopes, this.options);
        }
    }
}
