package io.sentry;

import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.RateLimiter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class NoOpSentryClient implements ISentryClient {
    private static final NoOpSentryClient instance = new NoOpSentryClient();

    private NoOpSentryClient() {
    }

    public static NoOpSentryClient getInstance() {
        return instance;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureCheckIn(CheckIn checkIn, IScope iScope, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureEvent(SentryEvent sentryEvent, IScope iScope, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureFeedback(Feedback feedback, Hint hint, IScope iScope) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureProfileChunk(ProfileChunk profileChunk, IScope iScope) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureReplayEvent(SentryReplayEvent sentryReplayEvent, IScope iScope, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, IScope iScope, Hint hint, ProfilingTraceData profilingTraceData) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.ISentryClient
    public void close() {
    }

    @Override // io.sentry.ISentryClient
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.ISentryClient
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.ISentryClient
    public void close(boolean z10) {
    }

    @Override // io.sentry.ISentryClient
    public void captureBatchedLogEvents(SentryLogEvents sentryLogEvents) {
    }

    @Override // io.sentry.ISentryClient
    public void captureBatchedMetricsEvents(SentryMetricsEvents sentryMetricsEvents) {
    }

    @Override // io.sentry.ISentryClient
    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    @Override // io.sentry.ISentryClient
    public void flush(long j10) {
    }

    @Override // io.sentry.ISentryClient
    public void captureLog(SentryLogEvent sentryLogEvent, IScope iScope) {
    }

    @Override // io.sentry.ISentryClient
    public void captureSession(Session session, Hint hint) {
    }

    @Override // io.sentry.ISentryClient
    public void captureMetric(SentryMetricsEvent sentryMetricsEvent, IScope iScope, Hint hint) {
    }
}
