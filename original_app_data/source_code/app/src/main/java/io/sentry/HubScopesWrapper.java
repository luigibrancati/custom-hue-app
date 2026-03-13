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
@Deprecated
public final class HubScopesWrapper implements IHub {
    private final IScopes scopes;

    public HubScopesWrapper(IScopes iScopes) {
        this.scopes = iScopes;
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        this.scopes.addBreadcrumb(breadcrumb, hint);
    }

    @Override // io.sentry.IScopes
    public void addFeatureFlag(String str, Boolean bool) {
        this.scopes.addFeatureFlag(str, bool);
    }

    @Override // io.sentry.IScopes
    public void bindClient(ISentryClient iSentryClient) {
        this.scopes.bindClient(iSentryClient);
    }

    @Override // io.sentry.IScopes
    public SentryId captureCheckIn(CheckIn checkIn) {
        return this.scopes.captureCheckIn(checkIn);
    }

    @Override // io.sentry.IScopes
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        return this.scopes.captureEnvelope(sentryEnvelope, hint);
    }

    @Override // io.sentry.IScopes
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return this.scopes.captureEvent(sentryEvent, hint);
    }

    @Override // io.sentry.IScopes
    public SentryId captureException(Throwable th, Hint hint) {
        return this.scopes.captureException(th, hint);
    }

    @Override // io.sentry.IScopes
    public SentryId captureFeedback(Feedback feedback, Hint hint, ScopeCallback scopeCallback) {
        return this.scopes.captureFeedback(feedback, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return this.scopes.captureMessage(str, sentryLevel);
    }

    @Override // io.sentry.IScopes
    public SentryId captureProfileChunk(ProfileChunk profileChunk) {
        return this.scopes.captureProfileChunk(profileChunk);
    }

    @Override // io.sentry.IScopes
    public SentryId captureReplay(SentryReplayEvent sentryReplayEvent, Hint hint) {
        return this.scopes.captureReplay(sentryReplayEvent, hint);
    }

    @Override // io.sentry.IScopes
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData) {
        return this.scopes.captureTransaction(sentryTransaction, traceContext, hint, profilingTraceData);
    }

    @Override // io.sentry.IScopes
    public void captureUserFeedback(UserFeedback userFeedback) {
        this.scopes.captureUserFeedback(userFeedback);
    }

    @Override // io.sentry.IScopes
    public void clearBreadcrumbs() {
        this.scopes.clearBreadcrumbs();
    }

    @Override // io.sentry.IScopes
    public void close() {
        this.scopes.close();
    }

    @Override // io.sentry.IScopes
    public void configureScope(ScopeType scopeType, ScopeCallback scopeCallback) {
        this.scopes.configureScope(scopeType, scopeCallback);
    }

    @Override // io.sentry.IScopes
    public TransactionContext continueTrace(String str, List<String> list) {
        return this.scopes.continueTrace(str, list);
    }

    @Override // io.sentry.IScopes
    public void endSession() {
        this.scopes.endSession();
    }

    @Override // io.sentry.IScopes
    public void flush(long j10) {
        this.scopes.flush(j10);
    }

    @Override // io.sentry.IScopes
    public IScopes forkedCurrentScope(String str) {
        return this.scopes.forkedCurrentScope(str);
    }

    @Override // io.sentry.IScopes
    public IScopes forkedRootScopes(String str) {
        return Sentry.forkedRootScopes(str);
    }

    @Override // io.sentry.IScopes
    public IScopes forkedScopes(String str) {
        return this.scopes.forkedScopes(str);
    }

    @Override // io.sentry.IScopes
    public BaggageHeader getBaggage() {
        return this.scopes.getBaggage();
    }

    @Override // io.sentry.IScopes
    public IScope getGlobalScope() {
        return Sentry.getGlobalScope();
    }

    @Override // io.sentry.IScopes
    public IScope getIsolationScope() {
        return this.scopes.getIsolationScope();
    }

    @Override // io.sentry.IScopes
    public SentryId getLastEventId() {
        return this.scopes.getLastEventId();
    }

    @Override // io.sentry.IScopes
    public SentryOptions getOptions() {
        return this.scopes.getOptions();
    }

    @Override // io.sentry.IScopes
    public IScopes getParentScopes() {
        return this.scopes.getParentScopes();
    }

    @Override // io.sentry.IScopes
    public RateLimiter getRateLimiter() {
        return this.scopes.getRateLimiter();
    }

    @Override // io.sentry.IScopes
    public IScope getScope() {
        return this.scopes.getScope();
    }

    public IScopes getScopes() {
        return this.scopes;
    }

    @Override // io.sentry.IScopes
    public ISpan getSpan() {
        return this.scopes.getSpan();
    }

    @Override // io.sentry.IScopes
    public SentryTraceHeader getTraceparent() {
        return this.scopes.getTraceparent();
    }

    @Override // io.sentry.IScopes
    public ITransaction getTransaction() {
        return this.scopes.getTransaction();
    }

    @Override // io.sentry.IScopes
    public boolean isAncestorOf(IScopes iScopes) {
        return this.scopes.isAncestorOf(iScopes);
    }

    @Override // io.sentry.IScopes
    public Boolean isCrashedLastRun() {
        return this.scopes.isCrashedLastRun();
    }

    @Override // io.sentry.IScopes
    public boolean isEnabled() {
        return this.scopes.isEnabled();
    }

    @Override // io.sentry.IScopes
    public boolean isHealthy() {
        return this.scopes.isHealthy();
    }

    @Override // io.sentry.IScopes
    public ILoggerApi logger() {
        return this.scopes.logger();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken makeCurrent() {
        return this.scopes.makeCurrent();
    }

    @Override // io.sentry.IScopes
    public IMetricsApi metrics() {
        return this.scopes.metrics();
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void popScope() {
        this.scopes.popScope();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushIsolationScope() {
        return this.scopes.pushIsolationScope();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushScope() {
        return this.scopes.pushScope();
    }

    @Override // io.sentry.IScopes
    public void removeExtra(String str) {
        this.scopes.removeExtra(str);
    }

    @Override // io.sentry.IScopes
    public void removeTag(String str) {
        this.scopes.removeTag(str);
    }

    @Override // io.sentry.IScopes
    public void reportFullyDisplayed() {
        this.scopes.reportFullyDisplayed();
    }

    @Override // io.sentry.IScopes
    public void setActiveSpan(ISpan iSpan) {
        this.scopes.setActiveSpan(iSpan);
    }

    @Override // io.sentry.IScopes
    public void setExtra(String str, String str2) {
        this.scopes.setExtra(str, str2);
    }

    @Override // io.sentry.IScopes
    public void setFingerprint(List<String> list) {
        this.scopes.setFingerprint(list);
    }

    @Override // io.sentry.IScopes
    public void setLevel(SentryLevel sentryLevel) {
        this.scopes.setLevel(sentryLevel);
    }

    @Override // io.sentry.IScopes
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
        this.scopes.setSpanContext(th, iSpan, str);
    }

    @Override // io.sentry.IScopes
    public void setTag(String str, String str2) {
        this.scopes.setTag(str, str2);
    }

    @Override // io.sentry.IScopes
    public void setTransaction(String str) {
        this.scopes.setTransaction(str);
    }

    @Override // io.sentry.IScopes
    public void setUser(User user) {
        this.scopes.setUser(user);
    }

    @Override // io.sentry.IScopes
    public void startProfiler() {
        this.scopes.startProfiler();
    }

    @Override // io.sentry.IScopes
    public void startSession() {
        this.scopes.startSession();
    }

    @Override // io.sentry.IScopes
    public ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        return this.scopes.startTransaction(transactionContext, transactionOptions);
    }

    @Override // io.sentry.IScopes
    public void stopProfiler() {
        this.scopes.stopProfiler();
    }

    @Override // io.sentry.IScopes
    public void withIsolationScope(ScopeCallback scopeCallback) {
        this.scopes.withIsolationScope(scopeCallback);
    }

    @Override // io.sentry.IScopes
    public void withScope(ScopeCallback scopeCallback) {
        this.scopes.withScope(scopeCallback);
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(Breadcrumb breadcrumb) {
        this.scopes.addBreadcrumb(breadcrumb);
    }

    @Override // io.sentry.IScopes
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        return this.scopes.captureEvent(sentryEvent, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    public SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        return this.scopes.captureException(th, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    public SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        return this.scopes.captureMessage(str, sentryLevel, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m247clone() {
        return this.scopes.m253clone();
    }

    @Override // io.sentry.IScopes
    public void close(boolean z10) {
        this.scopes.close(z10);
    }
}
