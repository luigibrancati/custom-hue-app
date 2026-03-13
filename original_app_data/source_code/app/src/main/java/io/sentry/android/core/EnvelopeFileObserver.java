package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.Hint;
import io.sentry.IEnvelopeSender;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.hints.ApplyScopeData;
import io.sentry.hints.Cached;
import io.sentry.hints.Flushable;
import io.sentry.hints.Resettable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class EnvelopeFileObserver extends FileObserver {
    private final IEnvelopeSender envelopeSender;
    private final long flushTimeoutMillis;
    private final ILogger logger;
    private final String rootPath;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class CachedEnvelopeHint implements Cached, Retryable, SubmissionResult, Flushable, ApplyScopeData, Resettable {
        private final long flushTimeoutMillis;
        private CountDownLatch latch;
        private final ILogger logger;
        boolean retry;
        boolean succeeded;

        public CachedEnvelopeHint(long j10, ILogger iLogger) {
            reset();
            this.flushTimeoutMillis = j10;
            this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required.");
        }

        @Override // io.sentry.hints.Retryable
        public boolean isRetry() {
            return this.retry;
        }

        @Override // io.sentry.hints.SubmissionResult
        public boolean isSuccess() {
            return this.succeeded;
        }

        @Override // io.sentry.hints.Resettable
        public void reset() {
            this.latch = new CountDownLatch(1);
            this.retry = false;
            this.succeeded = false;
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

    public EnvelopeFileObserver(String str, IEnvelopeSender iEnvelopeSender, ILogger iLogger, long j10) {
        super(str);
        this.rootPath = str;
        this.envelopeSender = (IEnvelopeSender) Objects.requireNonNull(iEnvelopeSender, "Envelope sender is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
        this.flushTimeoutMillis = j10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        this.logger.log(SentryLevel.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i10), this.rootPath, str);
        Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(new CachedEnvelopeHint(this.flushTimeoutMillis, this.logger));
        this.envelopeSender.processEnvelopeFile(this.rootPath + File.separator + str, hintCreateWithTypeCheckHint);
    }
}
