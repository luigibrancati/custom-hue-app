package io.sentry;

import io.sentry.protocol.Feedback;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.RateLimiter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ISentryClient {
    void captureBatchedLogEvents(SentryLogEvents sentryLogEvents);

    void captureBatchedMetricsEvents(SentryMetricsEvents sentryMetricsEvents);

    SentryId captureCheckIn(CheckIn checkIn, IScope iScope, Hint hint);

    default SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, null);
    }

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint);

    default SentryId captureEvent(SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, null, null);
    }

    SentryId captureEvent(SentryEvent sentryEvent, IScope iScope, Hint hint);

    default SentryId captureException(Throwable th) {
        return captureException(th, null, null);
    }

    SentryId captureFeedback(Feedback feedback, Hint hint, IScope iScope);

    void captureLog(SentryLogEvent sentryLogEvent, IScope iScope);

    default SentryId captureMessage(String str, SentryLevel sentryLevel, IScope iScope) {
        SentryEvent sentryEvent = new SentryEvent();
        Message message = new Message();
        message.setFormatted(str);
        sentryEvent.setMessage(message);
        sentryEvent.setLevel(sentryLevel);
        return captureEvent(sentryEvent, iScope);
    }

    void captureMetric(SentryMetricsEvent sentryMetricsEvent, IScope iScope, Hint hint);

    SentryId captureProfileChunk(ProfileChunk profileChunk, IScope iScope);

    SentryId captureReplayEvent(SentryReplayEvent sentryReplayEvent, IScope iScope, Hint hint);

    default void captureSession(Session session) {
        captureSession(session, null);
    }

    void captureSession(Session session, Hint hint);

    default SentryId captureTransaction(SentryTransaction sentryTransaction, IScope iScope, Hint hint) {
        return captureTransaction(sentryTransaction, null, iScope, hint);
    }

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, IScope iScope, Hint hint, ProfilingTraceData profilingTraceData);

    void captureUserFeedback(UserFeedback userFeedback);

    void close();

    void close(boolean z10);

    void flush(long j10);

    RateLimiter getRateLimiter();

    boolean isEnabled();

    default boolean isHealthy() {
        return true;
    }

    default SentryId captureEvent(SentryEvent sentryEvent, IScope iScope) {
        return captureEvent(sentryEvent, iScope, null);
    }

    default SentryId captureException(Throwable th, IScope iScope, Hint hint) {
        return captureEvent(new SentryEvent(th), iScope, hint);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, IScope iScope, Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, iScope, hint, null);
    }

    default SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return captureEvent(sentryEvent, null, hint);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null, null);
    }

    default SentryId captureException(Throwable th, Hint hint) {
        return captureException(th, null, hint);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction) {
        return captureTransaction(sentryTransaction, null, null, null);
    }

    default SentryId captureException(Throwable th, IScope iScope) {
        return captureException(th, iScope, null);
    }

    default SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return captureMessage(str, sentryLevel, null);
    }
}
