package io.sentry;

import io.sentry.IConnectionStatusProvider;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SendCachedEnvelopeFireAndForgetIntegration implements Integration, IConnectionStatusProvider.IConnectionStatusObserver, Closeable {
    private IConnectionStatusProvider connectionStatusProvider;
    private final SendFireAndForgetFactory factory;
    private SentryOptions options;
    private IScopes scopes;
    private SendFireAndForget sender;
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final AtomicBoolean isClosed = new AtomicBoolean(false);
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface SendFireAndForget {
        void send();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface SendFireAndForgetDirPath {
        String getDirPath();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface SendFireAndForgetFactory {
        static /* synthetic */ void a(ILogger iLogger, String str, DirectoryProcessor directoryProcessor, File file) {
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            iLogger.log(sentryLevel, "Started processing cached files from %s", str);
            directoryProcessor.processDirectory(file);
            iLogger.log(sentryLevel, "Finished processing cached files from %s", str);
        }

        SendFireAndForget create(IScopes iScopes, SentryOptions sentryOptions);

        default boolean hasValidPath(String str, ILogger iLogger) {
            if (str != null && !str.isEmpty()) {
                return true;
            }
            iLogger.log(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
            return false;
        }

        default SendFireAndForget processDir(final DirectoryProcessor directoryProcessor, final String str, final ILogger iLogger) {
            final File file = new File(str);
            return new SendFireAndForget() { // from class: io.sentry.B
                @Override // io.sentry.SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget
                public final void send() {
                    SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory.a(iLogger, str, directoryProcessor, file);
                }
            };
        }
    }

    public SendCachedEnvelopeFireAndForgetIntegration(SendFireAndForgetFactory sendFireAndForgetFactory) {
        this.factory = (SendFireAndForgetFactory) Objects.requireNonNull(sendFireAndForgetFactory, "SendFireAndForgetFactory is required");
    }

    public static /* synthetic */ void a(SendCachedEnvelopeFireAndForgetIntegration sendCachedEnvelopeFireAndForgetIntegration, SentryOptions sentryOptions, IScopes iScopes) {
        sendCachedEnvelopeFireAndForgetIntegration.getClass();
        try {
            if (sendCachedEnvelopeFireAndForgetIntegration.isClosed.get()) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, not trying to send after closing.", new Object[0]);
                return;
            }
            if (!sendCachedEnvelopeFireAndForgetIntegration.isInitialized.getAndSet(true)) {
                IConnectionStatusProvider connectionStatusProvider = sentryOptions.getConnectionStatusProvider();
                sendCachedEnvelopeFireAndForgetIntegration.connectionStatusProvider = connectionStatusProvider;
                connectionStatusProvider.addConnectionStatusObserver(sendCachedEnvelopeFireAndForgetIntegration);
                sendCachedEnvelopeFireAndForgetIntegration.sender = sendCachedEnvelopeFireAndForgetIntegration.factory.create(iScopes, sentryOptions);
            }
            IConnectionStatusProvider iConnectionStatusProvider = sendCachedEnvelopeFireAndForgetIntegration.connectionStatusProvider;
            if (iConnectionStatusProvider != null && iConnectionStatusProvider.getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, no connection.", new Object[0]);
                return;
            }
            RateLimiter rateLimiter = iScopes.getRateLimiter();
            if (rateLimiter != null && rateLimiter.isActiveForCategory(DataCategory.All)) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "SendCachedEnvelopeFireAndForgetIntegration, rate limiting active.", new Object[0]);
                return;
            }
            SendFireAndForget sendFireAndForget = sendCachedEnvelopeFireAndForgetIntegration.sender;
            if (sendFireAndForget == null) {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            } else {
                sendFireAndForget.send();
            }
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed trying to send cached events.", th);
        }
    }

    private void sendCachedEnvelopes(final IScopes iScopes, final SentryOptions sentryOptions) {
        try {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        SendCachedEnvelopeFireAndForgetIntegration.a(this.f38402a, sentryOptions, iScopes);
                    }
                });
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
        } catch (RejectedExecutionException e10) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th3) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th3);
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
        SentryOptions sentryOptions;
        IScopes iScopes = this.scopes;
        if (iScopes == null || (sentryOptions = this.options) == null || connectionStatus == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
            return;
        }
        sendCachedEnvelopes(iScopes, sentryOptions);
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required");
        if (!this.factory.hasValidPath(sentryOptions.getCacheDirPath(), sentryOptions.getLogger())) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        sentryOptions.getLogger().log(SentryLevel.DEBUG, "SendCachedEventFireAndForgetIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("SendCachedEnvelopeFireAndForget");
        sendCachedEnvelopes(iScopes, sentryOptions);
    }
}
