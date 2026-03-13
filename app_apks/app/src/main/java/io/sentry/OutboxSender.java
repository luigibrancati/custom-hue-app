package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Flushable;
import io.sentry.hints.Resettable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import io.sentry.util.SampleRateUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class OutboxSender extends DirectoryProcessor implements IEnvelopeSender {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final IEnvelopeReader envelopeReader;
    private final ILogger logger;
    private final IScopes scopes;
    private final ISerializer serializer;

    public OutboxSender(IScopes iScopes, IEnvelopeReader iEnvelopeReader, ISerializer iSerializer, ILogger iLogger, long j10, int i10) {
        super(iScopes, iLogger, j10, i10);
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required.");
        this.envelopeReader = (IEnvelopeReader) Objects.requireNonNull(iEnvelopeReader, "Envelope reader is required.");
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required.");
    }

    public static /* synthetic */ void b(OutboxSender outboxSender, File file, Retryable retryable) {
        outboxSender.getClass();
        if (retryable.isRetry()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            outboxSender.logger.log(SentryLevel.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e10) {
            outboxSender.logger.log(SentryLevel.ERROR, e10, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private TracesSamplingDecision extractSamplingDecision(TraceContext traceContext) {
        String sampleRate;
        if (traceContext != null && (sampleRate = traceContext.getSampleRate()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(sampleRate));
                if (SampleRateUtils.isValidTracesSampleRate(dValueOf, false)) {
                    String sampleRand = traceContext.getSampleRand();
                    if (sampleRand != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(sampleRand));
                        if (SampleRateUtils.isValidTracesSampleRate(dValueOf2, false)) {
                            return new TracesSamplingDecision(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return SampleRateUtils.backfilledSampleRand(new TracesSamplingDecision(Boolean.TRUE, dValueOf));
                }
                this.logger.log(SentryLevel.ERROR, "Invalid sample rate parsed from TraceContext: %s", sampleRate);
            } catch (Exception unused) {
                this.logger.log(SentryLevel.ERROR, "Unable to parse sample rate from TraceContext: %s", sampleRate);
            }
        }
        return new TracesSamplingDecision(Boolean.TRUE);
    }

    private void logEnvelopeItemNull(SentryEnvelopeItem sentryEnvelopeItem, int i10) {
        this.logger.log(SentryLevel.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i10), sentryEnvelopeItem.getHeader().getType());
    }

    private void logItemCaptured(int i10) {
        this.logger.log(SentryLevel.DEBUG, "Item %d is being captured.", Integer.valueOf(i10));
    }

    private void logTimeout(SentryId sentryId) {
        this.logger.log(SentryLevel.WARNING, "Timed out waiting for event id submission: %s", sentryId);
    }

    private void logUnexpectedEventId(SentryEnvelope sentryEnvelope, SentryId sentryId, int i10) {
        this.logger.log(SentryLevel.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i10), sentryEnvelope.getHeader().getEventId(), sentryId);
    }

    private void processEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        BufferedReader bufferedReader;
        Object sentrySdkHint;
        this.logger.log(SentryLevel.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(CollectionUtils.size(sentryEnvelope.getItems())));
        int i10 = 0;
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            i10++;
            if (sentryEnvelopeItem.getHeader() == null) {
                this.logger.log(SentryLevel.ERROR, "Item %d has no header", Integer.valueOf(i10));
            } else if (SentryItemType.Event.equals(sentryEnvelopeItem.getHeader().getType())) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.getData()), UTF_8));
                    try {
                        SentryEvent sentryEvent = (SentryEvent) this.serializer.deserialize(bufferedReader, SentryEvent.class);
                        if (sentryEvent == null) {
                            logEnvelopeItemNull(sentryEnvelopeItem, i10);
                        } else {
                            if (sentryEvent.getSdk() != null) {
                                HintUtils.setIsFromHybridSdk(hint, sentryEvent.getSdk().getName());
                            }
                            if (sentryEnvelope.getHeader().getEventId() == null || sentryEnvelope.getHeader().getEventId().equals(sentryEvent.getEventId())) {
                                this.scopes.captureEvent(sentryEvent, hint);
                                logItemCaptured(i10);
                                if (!waitFlush(hint)) {
                                    logTimeout(sentryEvent.getEventId());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                logUnexpectedEventId(sentryEnvelope, sentryEvent.getEventId(), i10);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    this.logger.log(SentryLevel.ERROR, "Item failed to process.", th);
                }
                sentrySdkHint = HintUtils.getSentrySdkHint(hint);
                if (!(sentrySdkHint instanceof SubmissionResult) && !((SubmissionResult) sentrySdkHint).isSuccess()) {
                    this.logger.log(SentryLevel.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i10));
                    return;
                }
                HintUtils.runIfHasType(hint, Resettable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.p
                    @Override // io.sentry.util.HintUtils.SentryConsumer
                    public final void accept(Object obj) {
                        ((Resettable) obj).reset();
                    }
                });
            } else {
                if (SentryItemType.Transaction.equals(sentryEnvelopeItem.getHeader().getType())) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(sentryEnvelopeItem.getData()), UTF_8));
                        try {
                            SentryTransaction sentryTransaction = (SentryTransaction) this.serializer.deserialize(bufferedReader, SentryTransaction.class);
                            if (sentryTransaction == null) {
                                logEnvelopeItemNull(sentryEnvelopeItem, i10);
                            } else if (sentryEnvelope.getHeader().getEventId() == null || sentryEnvelope.getHeader().getEventId().equals(sentryTransaction.getEventId())) {
                                TraceContext traceContext = sentryEnvelope.getHeader().getTraceContext();
                                if (sentryTransaction.getContexts().getTrace() != null) {
                                    sentryTransaction.getContexts().getTrace().setSamplingDecision(extractSamplingDecision(traceContext));
                                }
                                this.scopes.captureTransaction(sentryTransaction, traceContext, hint);
                                logItemCaptured(i10);
                                if (!waitFlush(hint)) {
                                    logTimeout(sentryTransaction.getEventId());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                logUnexpectedEventId(sentryEnvelope, sentryTransaction.getEventId(), i10);
                                bufferedReader.close();
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.logger.log(SentryLevel.ERROR, "Item failed to process.", th2);
                    }
                } else {
                    this.scopes.captureEnvelope(new SentryEnvelope(sentryEnvelope.getHeader().getEventId(), sentryEnvelope.getHeader().getSdkVersion(), sentryEnvelopeItem), hint);
                    this.logger.log(SentryLevel.DEBUG, "%s item %d is being captured.", sentryEnvelopeItem.getHeader().getType().getItemType(), Integer.valueOf(i10));
                    if (!waitFlush(hint)) {
                        this.logger.log(SentryLevel.WARNING, "Timed out waiting for item type submission: %s", sentryEnvelopeItem.getHeader().getType().getItemType());
                        return;
                    }
                }
                sentrySdkHint = HintUtils.getSentrySdkHint(hint);
                if (!(sentrySdkHint instanceof SubmissionResult)) {
                }
                HintUtils.runIfHasType(hint, Resettable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.p
                    @Override // io.sentry.util.HintUtils.SentryConsumer
                    public final void accept(Object obj) {
                        ((Resettable) obj).reset();
                    }
                });
            }
        }
    }

    private boolean waitFlush(Hint hint) {
        Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
        if (sentrySdkHint instanceof Flushable) {
            return ((Flushable) sentrySdkHint).waitFlush();
        }
        LogUtils.logNotInstanceOf(Flushable.class, sentrySdkHint, this.logger);
        return true;
    }

    @Override // io.sentry.DirectoryProcessor
    public boolean isRelevantFileName(String str) {
        return (str == null || str.startsWith(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE) || str.startsWith(EnvelopeCache.PREFIX_PREVIOUS_SESSION_FILE) || str.startsWith(EnvelopeCache.STARTUP_CRASH_MARKER_FILE)) ? false : true;
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
        Objects.requireNonNull(file, "File is required.");
        try {
            if (!isRelevantFileName(file.getName())) {
                this.logger.log(SentryLevel.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                SentryEnvelope sentryEnvelope = this.envelopeReader.read(bufferedInputStream);
                if (sentryEnvelope == null) {
                    this.logger.log(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    processEnvelope(sentryEnvelope, hint);
                    this.logger.log(SentryLevel.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                }
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            this.logger.log(SentryLevel.ERROR, "Error processing envelope.", e10);
        } finally {
            HintUtils.runIfHasTypeLogIfNot(hint, Retryable.class, this.logger, new HintUtils.SentryConsumer() { // from class: io.sentry.q
                @Override // io.sentry.util.HintUtils.SentryConsumer
                public final void accept(Object obj) {
                    OutboxSender.b(this.f38794a, file, (Retryable) obj);
                }
            });
        }
    }
}
