package io.sentry;

import io.sentry.hints.Cached;
import io.sentry.hints.Enqueable;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.transport.RateLimiter;
import io.sentry.util.HintUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
abstract class DirectoryProcessor {
    private static final long ENVELOPE_PROCESSING_DELAY = 100;
    private final long flushTimeoutMillis;
    private final ILogger logger;
    private final Queue<String> processedEnvelopes;
    private final IScopes scopes;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class SendCachedEnvelopeHint implements Cached, Retryable, SubmissionResult, Flushable, Enqueable {
        private final String filePath;
        private final long flushTimeoutMillis;
        private final ILogger logger;
        private final Queue<String> processedEnvelopes;
        boolean retry = false;
        boolean succeeded = false;
        private final CountDownLatch latch = new CountDownLatch(1);

        public SendCachedEnvelopeHint(long j10, ILogger iLogger, String str, Queue<String> queue) {
            this.flushTimeoutMillis = j10;
            this.filePath = str;
            this.processedEnvelopes = queue;
            this.logger = iLogger;
        }

        @Override // io.sentry.hints.Retryable
        public boolean isRetry() {
            return this.retry;
        }

        @Override // io.sentry.hints.SubmissionResult
        public boolean isSuccess() {
            return this.succeeded;
        }

        @Override // io.sentry.hints.Enqueable
        public void markEnqueued() {
            this.processedEnvelopes.add(this.filePath);
        }

        @Override // io.sentry.hints.SubmissionResult
        public void setResult(boolean z10) {
            this.succeeded = z10;
            this.latch.countDown();
        }

        @Override // io.sentry.hints.Retryable
        public void setRetry(boolean z10) {
            this.retry = z10;
        }

        @Override // io.sentry.hints.Flushable
        public boolean waitFlush() {
            try {
                return this.latch.await(this.flushTimeoutMillis, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.logger.log(SentryLevel.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }
    }

    public DirectoryProcessor(IScopes iScopes, ILogger iLogger, long j10, int i10) {
        this.scopes = iScopes;
        this.logger = iLogger;
        this.flushTimeoutMillis = j10;
        this.processedEnvelopes = SynchronizedQueue.synchronizedQueue(new CircularFifoQueue(i10));
    }

    public abstract boolean isRelevantFileName(String str);

    public void processDirectory(File file) {
        try {
            ILogger iLogger = this.logger;
            SentryLevel sentryLevel = SentryLevel.DEBUG;
            iLogger.log(sentryLevel, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.a
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f38466a.isRelevantFileName(str);
                }
            });
            if (fileArrListFiles == null) {
                this.logger.log(SentryLevel.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                return;
            }
            this.logger.log(sentryLevel, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.processedEnvelopes.contains(absolutePath)) {
                        this.logger.log(SentryLevel.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        RateLimiter rateLimiter = this.scopes.getRateLimiter();
                        if (rateLimiter != null && rateLimiter.isActiveForCategory(DataCategory.All)) {
                            this.logger.log(SentryLevel.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.logger.log(SentryLevel.DEBUG, "Processing file: %s", absolutePath);
                            processFile(file2, HintUtils.createWithTypeCheckHint(new SendCachedEnvelopeHint(this.flushTimeoutMillis, this.logger, absolutePath, this.processedEnvelopes)));
                            Thread.sleep(ENVELOPE_PROCESSING_DELAY);
                        }
                    }
                } else {
                    this.logger.log(SentryLevel.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    public abstract void processFile(File file, Hint hint);
}
