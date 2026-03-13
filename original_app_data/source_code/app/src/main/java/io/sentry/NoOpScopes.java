package io.sentry;

import io.sentry.logger.ILoggerApi;
import io.sentry.logger.NoOpLoggerApi;
import io.sentry.metrics.IMetricsApi;
import io.sentry.metrics.NoOpMetricsApi;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import io.sentry.util.LazyEvaluator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpScopes implements IScopes {
    private static final NoOpScopes instance = new NoOpScopes();
    private final LazyEvaluator<SentryOptions> emptyOptions = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.l
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final Object evaluate() {
            return SentryOptions.empty();
        }
    });

    private NoOpScopes() {
    }

    public static NoOpScopes getInstance() {
        return instance;
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(Breadcrumb breadcrumb) {
    }

    @Override // io.sentry.IScopes
    public SentryId captureCheckIn(CheckIn checkIn) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureException(Throwable th, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureFeedback(Feedback feedback, Hint hint, ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureProfileChunk(ProfileChunk profileChunk) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureReplay(SentryReplayEvent sentryReplayEvent, Hint hint) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public void close() {
    }

    @Override // io.sentry.IScopes
    public TransactionContext continueTrace(String str, List<String> list) {
        return null;
    }

    @Override // io.sentry.IScopes
    public IScopes forkedCurrentScope(String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    public IScopes forkedRootScopes(String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    public IScopes forkedScopes(String str) {
        return getInstance();
    }

    @Override // io.sentry.IScopes
    public BaggageHeader getBaggage() {
        return null;
    }

    @Override // io.sentry.IScopes
    public IScope getGlobalScope() {
        return NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    public IScope getIsolationScope() {
        return NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    public SentryId getLastEventId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryOptions getOptions() {
        return this.emptyOptions.getValue();
    }

    @Override // io.sentry.IScopes
    public IScopes getParentScopes() {
        return null;
    }

    @Override // io.sentry.IScopes
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.IScopes
    public IScope getScope() {
        return NoOpScope.getInstance();
    }

    @Override // io.sentry.IScopes
    public ISpan getSpan() {
        return null;
    }

    @Override // io.sentry.IScopes
    public SentryTraceHeader getTraceparent() {
        return null;
    }

    @Override // io.sentry.IScopes
    public ITransaction getTransaction() {
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isAncestorOf(IScopes iScopes) {
        return false;
    }

    @Override // io.sentry.IScopes
    public Boolean isCrashedLastRun() {
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.IScopes
    public boolean isHealthy() {
        return true;
    }

    @Override // io.sentry.IScopes
    public boolean isNoOp() {
        return true;
    }

    @Override // io.sentry.IScopes
    public ILoggerApi logger() {
        return NoOpLoggerApi.getInstance();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken makeCurrent() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public IMetricsApi metrics() {
        return NoOpMetricsApi.getInstance();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushIsolationScope() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushScope() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        return NoOpTransaction.getInstance();
    }

    @Override // io.sentry.IScopes
    public void withIsolationScope(ScopeCallback scopeCallback) {
        scopeCallback.run(NoOpScope.getInstance());
    }

    @Override // io.sentry.IScopes
    public void withScope(ScopeCallback scopeCallback) {
        scopeCallback.run(NoOpScope.getInstance());
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
    }

    @Override // io.sentry.IScopes
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    public SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IScopes
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m250clone() {
        return NoOpHub.getInstance();
    }

    @Override // io.sentry.IScopes
    public void close(boolean z10) {
    }

    @Override // io.sentry.IScopes
    public void clearBreadcrumbs() {
    }

    @Override // io.sentry.IScopes
    public void endSession() {
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void popScope() {
    }

    @Override // io.sentry.IScopes
    public void reportFullyDisplayed() {
    }

    @Override // io.sentry.IScopes
    public void startProfiler() {
    }

    @Override // io.sentry.IScopes
    public void startSession() {
    }

    @Override // io.sentry.IScopes
    public void stopProfiler() {
    }

    @Override // io.sentry.IScopes
    public void bindClient(ISentryClient iSentryClient) {
    }

    @Override // io.sentry.IScopes
    public void captureUserFeedback(UserFeedback userFeedback) {
    }

    @Override // io.sentry.IScopes
    public void flush(long j10) {
    }

    @Override // io.sentry.IScopes
    public void removeExtra(String str) {
    }

    @Override // io.sentry.IScopes
    public void removeTag(String str) {
    }

    @Override // io.sentry.IScopes
    public void setActiveSpan(ISpan iSpan) {
    }

    @Override // io.sentry.IScopes
    public void setFingerprint(List<String> list) {
    }

    @Override // io.sentry.IScopes
    public void setLevel(SentryLevel sentryLevel) {
    }

    @Override // io.sentry.IScopes
    public void setTransaction(String str) {
    }

    @Override // io.sentry.IScopes
    public void setUser(User user) {
    }

    @Override // io.sentry.IScopes
    public void addFeatureFlag(String str, Boolean bool) {
    }

    @Override // io.sentry.IScopes
    public void configureScope(ScopeType scopeType, ScopeCallback scopeCallback) {
    }

    @Override // io.sentry.IScopes
    public void setExtra(String str, String str2) {
    }

    @Override // io.sentry.IScopes
    public void setTag(String str, String str2) {
    }

    @Override // io.sentry.IScopes
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
    }
}
