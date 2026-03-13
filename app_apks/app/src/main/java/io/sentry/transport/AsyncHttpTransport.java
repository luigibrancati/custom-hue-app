package io.sentry.transport;

import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryDateProvider;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.Cached;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.transport.AsyncHttpTransport;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AsyncHttpTransport implements ITransport {
    private final HttpConnection connection;
    private volatile Runnable currentRunnable;
    private final IEnvelopeCache envelopeCache;
    private final QueuedThreadPoolExecutor executor;
    private final SentryOptions options;
    private final RateLimiter rateLimiter;
    private final ITransportGate transportGate;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class AsyncConnectionThreadFactory implements ThreadFactory {
        private int cnt;

        private AsyncConnectionThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryAsyncConnection-");
            int i10 = this.cnt;
            this.cnt = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class EnvelopeSender implements Runnable {
        private final SentryEnvelope envelope;
        private final IEnvelopeCache envelopeCache;
        private final TransportResult failedResult = TransportResult.error();
        private final Hint hint;

        public EnvelopeSender(SentryEnvelope sentryEnvelope, Hint hint, IEnvelopeCache iEnvelopeCache) {
            this.envelope = (SentryEnvelope) Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
            this.hint = hint;
            this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(iEnvelopeCache, "EnvelopeCache is required.");
        }

        public static /* synthetic */ void a(EnvelopeSender envelopeSender, TransportResult transportResult, SubmissionResult submissionResult) {
            AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(transportResult.isSuccess()));
            submissionResult.setResult(transportResult.isSuccess());
        }

        public static /* synthetic */ void b(EnvelopeSender envelopeSender, DiskFlushNotification diskFlushNotification) {
            if (!diskFlushNotification.isFlushable(envelopeSender.envelope.getHeader().getEventId())) {
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                diskFlushNotification.markFlushed();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        public static /* synthetic */ void d(EnvelopeSender envelopeSender, boolean z10, SentryEnvelope sentryEnvelope, Object obj, Class cls) {
            if (z10) {
                envelopeSender.getClass();
            } else {
                LogUtils.logNotInstanceOf(cls, obj, AsyncHttpTransport.this.options.getLogger());
                AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, sentryEnvelope);
            }
        }

        public static /* synthetic */ void f(EnvelopeSender envelopeSender, boolean z10, Object obj, Class cls) {
            if (z10) {
                envelopeSender.getClass();
            } else {
                LogUtils.logNotInstanceOf(cls, obj, AsyncHttpTransport.this.options.getLogger());
                AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, envelopeSender.envelope);
            }
        }

        private TransportResult flush() {
            TransportResult transportResult = this.failedResult;
            this.envelope.getHeader().setSentAt(null);
            final boolean zStoreEnvelope = this.envelopeCache.storeEnvelope(this.envelope, this.hint);
            HintUtils.runIfHasType(this.hint, DiskFlushNotification.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.e
                @Override // io.sentry.util.HintUtils.SentryConsumer
                public final void accept(Object obj) {
                    AsyncHttpTransport.EnvelopeSender.b(this.f38819a, (DiskFlushNotification) obj);
                }
            });
            if (!AsyncHttpTransport.this.transportGate.isConnected()) {
                HintUtils.runIfHasType(this.hint, Retryable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.h
                    @Override // io.sentry.util.HintUtils.SentryConsumer
                    public final void accept(Object obj) {
                        ((Retryable) obj).setRetry(true);
                    }
                }, new HintUtils.SentryHintFallback() { // from class: io.sentry.transport.i
                    @Override // io.sentry.util.HintUtils.SentryHintFallback
                    public final void accept(Object obj, Class cls) {
                        AsyncHttpTransport.EnvelopeSender.f(this.f38823a, zStoreEnvelope, obj, cls);
                    }
                });
                return transportResult;
            }
            final SentryEnvelope sentryEnvelopeAttachReportToEnvelope = AsyncHttpTransport.this.options.getClientReportRecorder().attachReportToEnvelope(this.envelope);
            try {
                sentryEnvelopeAttachReportToEnvelope.getHeader().setSentAt(DateUtils.nanosToDate(AsyncHttpTransport.this.options.getDateProvider().now().nanoTimestamp()));
                TransportResult transportResultSend = AsyncHttpTransport.this.connection.send(sentryEnvelopeAttachReportToEnvelope);
                if (transportResultSend.isSuccess()) {
                    this.envelopeCache.discard(this.envelope);
                    return transportResultSend;
                }
                String str = "The transport failed to send the envelope with response code " + transportResultSend.getResponseCode();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, str, new Object[0]);
                if (transportResultSend.getResponseCode() >= 400) {
                    this.envelopeCache.discard(this.envelope);
                    if (transportResultSend.getResponseCode() != 429) {
                        AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, sentryEnvelopeAttachReportToEnvelope);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e10) {
                HintUtils.runIfHasType(this.hint, Retryable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.f
                    @Override // io.sentry.util.HintUtils.SentryConsumer
                    public final void accept(Object obj) {
                        ((Retryable) obj).setRetry(true);
                    }
                }, new HintUtils.SentryHintFallback() { // from class: io.sentry.transport.g
                    @Override // io.sentry.util.HintUtils.SentryHintFallback
                    public final void accept(Object obj, Class cls) {
                        AsyncHttpTransport.EnvelopeSender.d(this.f38820a, zStoreEnvelope, sentryEnvelopeAttachReportToEnvelope, obj, cls);
                    }
                });
                throw new IllegalStateException("Sending the event failed.", e10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncHttpTransport.this.currentRunnable = this;
            final TransportResult transportResultFlush = this.failedResult;
            try {
                transportResultFlush = flush();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Envelope flushed", new Object[0]);
            } finally {
            }
        }
    }

    public AsyncHttpTransport(SentryOptions sentryOptions, RateLimiter rateLimiter, ITransportGate iTransportGate, RequestDetails requestDetails) {
        this(initExecutor(sentryOptions.getMaxQueueSize(), sentryOptions.getEnvelopeDiskCache(), sentryOptions.getLogger(), sentryOptions.getDateProvider()), sentryOptions, rateLimiter, iTransportGate, new HttpConnection(sentryOptions, requestDetails, rateLimiter));
    }

    public static /* synthetic */ void b(AsyncHttpTransport asyncHttpTransport, Enqueable enqueable) {
        asyncHttpTransport.getClass();
        enqueable.markEnqueued();
        asyncHttpTransport.options.getLogger().log(SentryLevel.DEBUG, "Envelope enqueued", new Object[0]);
    }

    public static /* synthetic */ void d(IEnvelopeCache iEnvelopeCache, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof EnvelopeSender) {
            EnvelopeSender envelopeSender = (EnvelopeSender) runnable;
            if (!HintUtils.hasType(envelopeSender.hint, Cached.class)) {
                iEnvelopeCache.storeEnvelope(envelopeSender.envelope, envelopeSender.hint);
            }
            markHintWhenSendingFailed(envelopeSender.hint, true);
            iLogger.log(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    private static QueuedThreadPoolExecutor initExecutor(int i10, final IEnvelopeCache iEnvelopeCache, final ILogger iLogger, SentryDateProvider sentryDateProvider) {
        return new QueuedThreadPoolExecutor(1, i10, new AsyncConnectionThreadFactory(), new RejectedExecutionHandler() { // from class: io.sentry.transport.c
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AsyncHttpTransport.d(iEnvelopeCache, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, sentryDateProvider);
    }

    private static void markHintWhenSendingFailed(Hint hint, final boolean z10) {
        HintUtils.runIfHasType(hint, SubmissionResult.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.a
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((SubmissionResult) obj).setResult(false);
            }
        });
        HintUtils.runIfHasType(hint, Retryable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.b
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((Retryable) obj).setRetry(z10);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close(false);
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j10) {
        this.executor.waitTillIdle(j10);
    }

    @Override // io.sentry.transport.ITransport
    public RateLimiter getRateLimiter() {
        return this.rateLimiter;
    }

    @Override // io.sentry.transport.ITransport
    public boolean isHealthy() {
        return (this.rateLimiter.isAnyRateLimitActive() || this.executor.didRejectRecently()) ? false : true;
    }

    @Override // io.sentry.transport.ITransport
    public void send(SentryEnvelope sentryEnvelope, Hint hint) {
        IEnvelopeCache noOpEnvelopeCache = this.envelopeCache;
        boolean z10 = false;
        if (HintUtils.hasType(hint, Cached.class)) {
            noOpEnvelopeCache = NoOpEnvelopeCache.getInstance();
            this.options.getLogger().log(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z10 = true;
        }
        SentryEnvelope sentryEnvelopeFilter = this.rateLimiter.filter(sentryEnvelope, hint);
        if (sentryEnvelopeFilter == null) {
            if (z10) {
                this.envelopeCache.discard(sentryEnvelope);
                return;
            }
            return;
        }
        if (HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
            sentryEnvelopeFilter = this.options.getClientReportRecorder().attachReportToEnvelope(sentryEnvelopeFilter);
        }
        Future<?> futureSubmit = this.executor.submit(new EnvelopeSender(sentryEnvelopeFilter, hint, noOpEnvelopeCache));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            HintUtils.runIfHasType(hint, Enqueable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.d
                @Override // io.sentry.util.HintUtils.SentryConsumer
                public final void accept(Object obj) {
                    AsyncHttpTransport.b(this.f38818a, (Enqueable) obj);
                }
            });
        } else {
            this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.QUEUE_OVERFLOW, sentryEnvelopeFilter);
        }
    }

    @Override // io.sentry.transport.ITransport
    public void close(boolean z10) {
        this.rateLimiter.close();
        this.executor.shutdown();
        this.options.getLogger().log(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        if (z10) {
            return;
        }
        try {
            long flushTimeoutMillis = this.options.getFlushTimeoutMillis();
            if (this.executor.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.executor.shutdownNow();
            if (this.currentRunnable != null) {
                this.executor.getRejectedExecutionHandler().rejectedExecution(this.currentRunnable, this.executor);
            }
        } catch (InterruptedException unused) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    public AsyncHttpTransport(QueuedThreadPoolExecutor queuedThreadPoolExecutor, SentryOptions sentryOptions, RateLimiter rateLimiter, ITransportGate iTransportGate, HttpConnection httpConnection) {
        this.currentRunnable = null;
        this.executor = (QueuedThreadPoolExecutor) Objects.requireNonNull(queuedThreadPoolExecutor, "executor is required");
        this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(sentryOptions.getEnvelopeDiskCache(), "envelopeCache is required");
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
        this.rateLimiter = (RateLimiter) Objects.requireNonNull(rateLimiter, "rateLimiter is required");
        this.transportGate = (ITransportGate) Objects.requireNonNull(iTransportGate, "transportGate is required");
        this.connection = (HttpConnection) Objects.requireNonNull(httpConnection, "httpConnection is required");
    }
}
