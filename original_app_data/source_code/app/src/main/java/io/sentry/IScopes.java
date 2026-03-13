package io.sentry;

import io.sentry.logger.ILoggerApi;
import io.sentry.metrics.IMetricsApi;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IScopes {
    void addBreadcrumb(Breadcrumb breadcrumb);

    void addBreadcrumb(Breadcrumb breadcrumb, Hint hint);

    default void addBreadcrumb(String str) {
        addBreadcrumb(new Breadcrumb(str));
    }

    void addFeatureFlag(String str, Boolean bool);

    void bindClient(ISentryClient iSentryClient);

    SentryId captureCheckIn(CheckIn checkIn);

    default SentryId captureEnvelope(SentryEnvelope sentryEnvelope) {
        return captureEnvelope(sentryEnvelope, new Hint());
    }

    SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint);

    default SentryId captureEvent(SentryEvent sentryEvent) {
        return captureEvent(sentryEvent, new Hint());
    }

    SentryId captureEvent(SentryEvent sentryEvent, Hint hint);

    SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback);

    default SentryId captureException(Throwable th) {
        return captureException(th, new Hint());
    }

    SentryId captureException(Throwable th, Hint hint);

    SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback);

    default SentryId captureFeedback(Feedback feedback) {
        return captureFeedback(feedback, null);
    }

    SentryId captureFeedback(Feedback feedback, Hint hint, ScopeCallback scopeCallback);

    default SentryId captureMessage(String str) {
        return captureMessage(str, SentryLevel.INFO);
    }

    SentryId captureMessage(String str, SentryLevel sentryLevel);

    SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback);

    SentryId captureProfileChunk(ProfileChunk profileChunk);

    SentryId captureReplay(SentryReplayEvent sentryReplayEvent, Hint hint);

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint) {
        return captureTransaction(sentryTransaction, traceContext, hint, null);
    }

    SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData);

    void captureUserFeedback(UserFeedback userFeedback);

    void clearBreadcrumbs();

    @Deprecated
    /* JADX INFO: renamed from: clone */
    IHub m253clone();

    void close();

    void close(boolean z10);

    default void configureScope(ScopeCallback scopeCallback) {
        configureScope(null, scopeCallback);
    }

    void configureScope(ScopeType scopeType, ScopeCallback scopeCallback);

    TransactionContext continueTrace(String str, List<String> list);

    void endSession();

    void flush(long j10);

    IScopes forkedCurrentScope(String str);

    IScopes forkedRootScopes(String str);

    IScopes forkedScopes(String str);

    BaggageHeader getBaggage();

    IScope getGlobalScope();

    IScope getIsolationScope();

    SentryId getLastEventId();

    SentryOptions getOptions();

    IScopes getParentScopes();

    RateLimiter getRateLimiter();

    IScope getScope();

    ISpan getSpan();

    SentryTraceHeader getTraceparent();

    ITransaction getTransaction();

    boolean isAncestorOf(IScopes iScopes);

    Boolean isCrashedLastRun();

    boolean isEnabled();

    boolean isHealthy();

    default boolean isNoOp() {
        return false;
    }

    ILoggerApi logger();

    ISentryLifecycleToken makeCurrent();

    IMetricsApi metrics();

    @Deprecated
    void popScope();

    ISentryLifecycleToken pushIsolationScope();

    ISentryLifecycleToken pushScope();

    void removeExtra(String str);

    void removeTag(String str);

    void reportFullyDisplayed();

    void setActiveSpan(ISpan iSpan);

    void setExtra(String str, String str2);

    void setFingerprint(List<String> list);

    void setLevel(SentryLevel sentryLevel);

    void setSpanContext(Throwable th, ISpan iSpan, String str);

    void setTag(String str, String str2);

    void setTransaction(String str);

    void setUser(User user);

    void startProfiler();

    void startSession();

    default ITransaction startTransaction(TransactionContext transactionContext) {
        return startTransaction(transactionContext, new TransactionOptions());
    }

    ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions);

    void stopProfiler();

    void withIsolationScope(ScopeCallback scopeCallback);

    void withScope(ScopeCallback scopeCallback);

    default void addBreadcrumb(String str, String str2) {
        Breadcrumb breadcrumb = new Breadcrumb(str);
        breadcrumb.setCategory(str2);
        addBreadcrumb(breadcrumb);
    }

    default SentryId captureEvent(SentryEvent sentryEvent, ScopeCallback scopeCallback) {
        return captureEvent(sentryEvent, new Hint(), scopeCallback);
    }

    default SentryId captureException(Throwable th, ScopeCallback scopeCallback) {
        return captureException(th, new Hint(), scopeCallback);
    }

    default SentryId captureFeedback(Feedback feedback, Hint hint) {
        return captureFeedback(feedback, hint, null);
    }

    default SentryId captureMessage(String str, ScopeCallback scopeCallback) {
        return captureMessage(str, SentryLevel.INFO, scopeCallback);
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, Hint hint) {
        return captureTransaction(sentryTransaction, null, hint);
    }

    default ITransaction startTransaction(String str, String str2) {
        return startTransaction(str, str2, new TransactionOptions());
    }

    default SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext) {
        return captureTransaction(sentryTransaction, traceContext, null);
    }

    default ITransaction startTransaction(String str, String str2, TransactionOptions transactionOptions) {
        return startTransaction(new TransactionContext(str, str2), transactionOptions);
    }
}
