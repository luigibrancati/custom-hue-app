package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnvelopeSender extends DirectoryProcessor implements IEnvelopeSender {
    private final ILogger logger;
    private final IScopes scopes;
    private final ISerializer serializer;

    public EnvelopeSender(IScopes iScopes, ISerializer iSerializer, ILogger iLogger, long j10, int i10) {
        super(iScopes, iLogger, j10, i10);
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void b(EnvelopeSender envelopeSender, Flushable flushable) {
        envelopeSender.getClass();
        if (flushable.waitFlush()) {
            return;
        }
        envelopeSender.logger.log(SentryLevel.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void c(EnvelopeSender envelopeSender, File file, Retryable retryable) {
        envelopeSender.getClass();
        if (retryable.isRetry()) {
            envelopeSender.logger.log(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            envelopeSender.safeDelete(file, "after trying to capture it");
            envelopeSender.logger.log(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void d(EnvelopeSender envelopeSender, Throwable th, File file, Retryable retryable) {
        envelopeSender.getClass();
        retryable.setRetry(false);
        envelopeSender.logger.log(SentryLevel.INFO, th, "File '%s' won't retry.", file.getAbsolutePath());
    }

    private void safeDelete(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.logger.log(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.DirectoryProcessor
    public boolean isRelevantFileName(String str) {
        return str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }

    @Override // io.sentry.DirectoryProcessor
    public /* bridge */ /* synthetic */ void processDirectory(File file) {
        super.processDirectory(file);
    }

    @Override // io.sentry.IEnvelopeSender
    public void processEnvelopeFile(String str, Hint hint) {
        Objects.requireNonNull(str, "Path is required.");
        processFile(new File(str), hint);
    }

    @Override // io.sentry.DirectoryProcessor
    public void processFile(final File file, Hint hint) {
        ILogger iLogger;
        HintUtils.SentryConsumer sentryConsumer;
        if (!file.isFile()) {
            this.logger.log(SentryLevel.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!isRelevantFileName(file.getName())) {
            this.logger.log(SentryLevel.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.logger.log(SentryLevel.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        SentryEnvelope sentryEnvelopeDeserializeEnvelope = this.serializer.deserializeEnvelope(bufferedInputStream);
                        if (sentryEnvelopeDeserializeEnvelope == null) {
                            this.logger.log(SentryLevel.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.scopes.captureEnvelope(sentryEnvelopeDeserializeEnvelope, hint);
                        }
                        HintUtils.runIfHasTypeLogIfNot(hint, Flushable.class, this.logger, new HintUtils.SentryConsumer() { // from class: io.sentry.b
                            @Override // io.sentry.util.HintUtils.SentryConsumer
                            public final void accept(Object obj) {
                                EnvelopeSender.b(this.f38693a, (Flushable) obj);
                            }
                        });
                        bufferedInputStream.close();
                        HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new HintUtils.SentryConsumer() { // from class: io.sentry.c
                            @Override // io.sentry.util.HintUtils.SentryConsumer
                            public final void accept(Object obj) {
                                EnvelopeSender.c(this.f38696a, file, (Retryable) obj);
                            }
                        });
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e10) {
                    this.logger.log(SentryLevel.ERROR, e10, "I/O on file '%s' failed.", file.getAbsolutePath());
                    iLogger = this.logger;
                    sentryConsumer = new HintUtils.SentryConsumer() { // from class: io.sentry.c
                        @Override // io.sentry.util.HintUtils.SentryConsumer
                        public final void accept(Object obj) {
                            EnvelopeSender.c(this.f38696a, file, (Retryable) obj);
                        }
                    };
                    HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, iLogger, sentryConsumer);
                } catch (Throwable th3) {
                    this.logger.log(SentryLevel.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
                    HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new HintUtils.SentryConsumer() { // from class: io.sentry.d
                        @Override // io.sentry.util.HintUtils.SentryConsumer
                        public final void accept(Object obj) {
                            EnvelopeSender.d(this.f38727a, th3, file, (Retryable) obj);
                        }
                    });
                    iLogger = this.logger;
                    sentryConsumer = new HintUtils.SentryConsumer() { // from class: io.sentry.c
                        @Override // io.sentry.util.HintUtils.SentryConsumer
                        public final void accept(Object obj) {
                            EnvelopeSender.c(this.f38696a, file, (Retryable) obj);
                        }
                    };
                    HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, iLogger, sentryConsumer);
                }
            } catch (FileNotFoundException e11) {
                this.logger.log(SentryLevel.ERROR, e11, "File '%s' cannot be found.", file.getAbsolutePath());
                iLogger = this.logger;
                sentryConsumer = new HintUtils.SentryConsumer() { // from class: io.sentry.c
                    @Override // io.sentry.util.HintUtils.SentryConsumer
                    public final void accept(Object obj) {
                        EnvelopeSender.c(this.f38696a, file, (Retryable) obj);
                    }
                };
                HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, iLogger, sentryConsumer);
            }
        } catch (Throwable th4) {
            HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new HintUtils.SentryConsumer() { // from class: io.sentry.c
                @Override // io.sentry.util.HintUtils.SentryConsumer
                public final void accept(Object obj) {
                    EnvelopeSender.c(this.f38696a, file, (Retryable) obj);
                }
            });
            throw th4;
        }
    }
}
