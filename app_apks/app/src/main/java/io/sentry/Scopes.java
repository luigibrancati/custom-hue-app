package io.sentry;

import io.sentry.Scope;
import io.sentry.clientreport.DiscardReason;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.hints.SessionEndHint;
import io.sentry.hints.SessionStartHint;
import io.sentry.logger.ILoggerApi;
import io.sentry.logger.LoggerApi;
import io.sentry.metrics.IMetricsApi;
import io.sentry.metrics.MetricsApi;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.transport.RateLimiter;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.util.SpanUtils;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Scopes implements IScopes {
    private final CombinedScopeView combinedScope;
    private final CompositePerformanceCollector compositePerformanceCollector;
    private final String creator;
    private final IScope globalScope;
    private final IScope isolationScope;
    private final ILoggerApi logger;
    private final IMetricsApi metrics;
    private final Scopes parentScopes;
    private final IScope scope;

    public Scopes(IScope iScope, IScope iScope2, IScope iScope3, String str) {
        this(iScope, iScope2, iScope3, null, str);
    }

    private void assignTraceContext(SentryEvent sentryEvent) {
        getCombinedScopeView().assignTraceContext(sentryEvent);
    }

    private IScope buildLocalScope(IScope iScope, ScopeCallback scopeCallback) {
        if (scopeCallback != null) {
            try {
                IScope iScopeM251clone = iScope.m245clone();
                scopeCallback.run(iScopeM251clone);
                return iScopeM251clone;
            } catch (Throwable th) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'ScopeCallback' callback.", th);
            }
        }
        return iScope;
    }

    private SentryId captureEventInternal(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        SentryId sentryIdCaptureEvent = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return sentryIdCaptureEvent;
        }
        if (sentryEvent == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return sentryIdCaptureEvent;
        }
        try {
            assignTraceContext(sentryEvent);
            sentryIdCaptureEvent = getClient().captureEvent(sentryEvent, buildLocalScope(getCombinedScopeView(), scopeCallback), hint);
            updateLastEventId(sentryIdCaptureEvent);
            return sentryIdCaptureEvent;
        } catch (Throwable th) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing event with id: " + sentryEvent.getEventId(), th);
            return sentryIdCaptureEvent;
        }
    }

    private SentryId captureExceptionInternal(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        SentryId sentryIdCaptureEvent = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                SentryEvent sentryEvent = new SentryEvent(th);
                assignTraceContext(sentryEvent);
                sentryIdCaptureEvent = getClient().captureEvent(sentryEvent, buildLocalScope(getCombinedScopeView(), scopeCallback), hint);
            } catch (Throwable th2) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing exception: " + th.getMessage(), th2);
            }
        }
        updateLastEventId(sentryIdCaptureEvent);
        return sentryIdCaptureEvent;
    }

    private SentryId captureMessageInternal(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        SentryId sentryIdCaptureMessage = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                sentryIdCaptureMessage = getClient().captureMessage(str, sentryLevel, buildLocalScope(getCombinedScopeView(), scopeCallback));
            } catch (Throwable th) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing message: " + str, th);
            }
        }
        updateLastEventId(sentryIdCaptureMessage);
        return sentryIdCaptureMessage;
    }

    private ITransaction createTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        ITransaction noOpTransaction;
        Objects.requireNonNull(transactionContext, "transactionContext is required");
        transactionContext.setOrigin(transactionOptions.getOrigin());
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            noOpTransaction = NoOpTransaction.getInstance();
        } else if (SpanUtils.isIgnored(getOptions().getIgnoredSpanOrigins(), transactionContext.getOrigin())) {
            getOptions().getLogger().log(SentryLevel.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", transactionContext.getOrigin());
            noOpTransaction = NoOpTransaction.getInstance();
        } else if (!getOptions().getInstrumenter().equals(transactionContext.getInstrumenter())) {
            getOptions().getLogger().log(SentryLevel.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", transactionContext.getInstrumenter(), getOptions().getInstrumenter());
            noOpTransaction = NoOpTransaction.getInstance();
        } else if (getOptions().isTracingEnabled()) {
            TracesSamplingDecision tracesSamplingDecisionSample = getOptions().getInternalTracesSampler().sample(new SamplingContext(transactionContext, transactionOptions.getCustomSamplingContext(), getSampleRand(transactionContext), null));
            transactionContext.setSamplingDecision(tracesSamplingDecisionSample);
            ISpanFactory spanFactory = transactionOptions.getSpanFactory();
            if (spanFactory == null) {
                spanFactory = getOptions().getSpanFactory();
            }
            if (tracesSamplingDecisionSample.getSampled().booleanValue() && getOptions().isContinuousProfilingEnabled()) {
                ProfileLifecycle profileLifecycle = getOptions().getProfileLifecycle();
                ProfileLifecycle profileLifecycle2 = ProfileLifecycle.TRACE;
                if (profileLifecycle == profileLifecycle2 && transactionContext.getProfilerId().equals(SentryId.EMPTY_ID)) {
                    getOptions().getContinuousProfiler().startProfiler(profileLifecycle2, getOptions().getInternalTracesSampler());
                }
            }
            ITransaction iTransactionCreateTransaction = spanFactory.createTransaction(transactionContext, this, transactionOptions, this.compositePerformanceCollector);
            if (tracesSamplingDecisionSample.getSampled().booleanValue() && tracesSamplingDecisionSample.getProfileSampled().booleanValue()) {
                ITransactionProfiler transactionProfiler = getOptions().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.bindTransaction(iTransactionCreateTransaction);
                } else if (transactionOptions.isAppStartTransaction()) {
                    transactionProfiler.bindTransaction(iTransactionCreateTransaction);
                }
            }
            noOpTransaction = iTransactionCreateTransaction;
        } else {
            getOptions().getLogger().log(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
            noOpTransaction = NoOpTransaction.getInstance();
        }
        if (transactionOptions.isBindToScope()) {
            noOpTransaction.makeCurrent();
        }
        return noOpTransaction;
    }

    private Double getSampleRand(TransactionContext transactionContext) {
        Double sampleRand;
        Baggage baggage = transactionContext.getBaggage();
        return (baggage == null || (sampleRand = baggage.getSampleRand()) == null) ? getCombinedScopeView().getPropagationContext().getSampleRand() : sampleRand;
    }

    private void updateLastEventId(SentryId sentryId) {
        getCombinedScopeView().setLastEventId(sentryId);
    }

    private static void validateOptions(SentryOptions sentryOptions) {
        Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        if (sentryOptions.getDsn() == null || sentryOptions.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        } else if (breadcrumb == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "addBreadcrumb called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().addBreadcrumb(breadcrumb, hint);
        }
    }

    @Override // io.sentry.IScopes
    public void addFeatureFlag(String str, Boolean bool) {
        this.combinedScope.addFeatureFlag(str, bool);
    }

    @Override // io.sentry.IScopes
    public void bindClient(ISentryClient iSentryClient) {
        if (iSentryClient != null) {
            getOptions().getLogger().log(SentryLevel.DEBUG, "New client bound to scope.", new Object[0]);
            getCombinedScopeView().bindClient(iSentryClient);
        } else {
            getOptions().getLogger().log(SentryLevel.DEBUG, "NoOp client bound to scope.", new Object[0]);
            getCombinedScopeView().bindClient(NoOpSentryClient.getInstance());
        }
    }

    @Override // io.sentry.IScopes
    public SentryId captureCheckIn(CheckIn checkIn) {
        SentryId sentryIdCaptureCheckIn = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                sentryIdCaptureCheckIn = getClient().captureCheckIn(checkIn, getCombinedScopeView(), null);
            } catch (Throwable th) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing check-in for slug", th);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureCheckIn' call is a no-op.", new Object[0]);
        }
        updateLastEventId(sentryIdCaptureCheckIn);
        return sentryIdCaptureCheckIn;
    }

    @Override // io.sentry.IScopes
    public SentryId captureEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required.");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                SentryId sentryIdCaptureEnvelope = getClient().captureEnvelope(sentryEnvelope, hint);
                if (sentryIdCaptureEnvelope != null) {
                    return sentryIdCaptureEnvelope;
                }
            } catch (Throwable th) {
                this.getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing envelope.", th);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint) {
        return captureEventInternal(sentryEvent, hint, null);
    }

    @Override // io.sentry.IScopes
    public SentryId captureException(Throwable th, Hint hint) {
        return captureExceptionInternal(th, hint, null);
    }

    @Override // io.sentry.IScopes
    public SentryId captureFeedback(Feedback feedback, Hint hint, ScopeCallback scopeCallback) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
        } else if (feedback.getMessage().isEmpty()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "captureFeedback called with empty message.", new Object[0]);
        } else {
            try {
                return getClient().captureFeedback(feedback, hint, buildLocalScope(getCombinedScopeView(), scopeCallback));
            } catch (Throwable th) {
                this.getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing feedback: " + feedback.getMessage(), th);
            }
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    public SentryId captureMessage(String str, SentryLevel sentryLevel) {
        return captureMessageInternal(str, sentryLevel, null);
    }

    @Override // io.sentry.IScopes
    public SentryId captureProfileChunk(ProfileChunk profileChunk) {
        Objects.requireNonNull(profileChunk, "profilingContinuousData is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                return getClient().captureProfileChunk(profileChunk, getScope());
            } catch (Throwable th) {
                this.getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing profile chunk with id: " + profileChunk.getChunkId(), th);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    public SentryId captureReplay(SentryReplayEvent sentryReplayEvent, Hint hint) {
        SentryId sentryId = SentryId.EMPTY_ID;
        if (isEnabled()) {
            try {
                return getClient().captureReplayEvent(sentryReplayEvent, getCombinedScopeView(), hint);
            } catch (Throwable th) {
                this.getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing replay", th);
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    public SentryId captureTransaction(SentryTransaction sentryTransaction, TraceContext traceContext, Hint hint, ProfilingTraceData profilingTraceData) {
        SentryTransaction sentryTransaction2;
        Objects.requireNonNull(sentryTransaction, "transaction is required");
        SentryId sentryId = SentryId.EMPTY_ID;
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
        } else if (!sentryTransaction.isFinished()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", sentryTransaction.getEventId());
        } else {
            if (Boolean.TRUE.equals(Boolean.valueOf(sentryTransaction.isSampled()))) {
                try {
                    sentryTransaction2 = sentryTransaction;
                } catch (Throwable th) {
                    th = th;
                    sentryTransaction2 = sentryTransaction;
                }
                try {
                    return getClient().captureTransaction(sentryTransaction2, traceContext, getCombinedScopeView(), hint, profilingTraceData);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    this.getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing transaction with id: " + sentryTransaction2.getEventId(), th3);
                    return sentryId;
                }
            }
            getOptions().getLogger().log(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", sentryTransaction.getEventId());
            if (getOptions().getBackpressureMonitor().getDownsampleFactor() > 0) {
                IClientReportRecorder clientReportRecorder = getOptions().getClientReportRecorder();
                DiscardReason discardReason = DiscardReason.BACKPRESSURE;
                clientReportRecorder.recordLostEvent(discardReason, DataCategory.Transaction);
                getOptions().getClientReportRecorder().recordLostEvent(discardReason, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            } else {
                IClientReportRecorder clientReportRecorder2 = getOptions().getClientReportRecorder();
                DiscardReason discardReason2 = DiscardReason.SAMPLE_RATE;
                clientReportRecorder2.recordLostEvent(discardReason2, DataCategory.Transaction);
                getOptions().getClientReportRecorder().recordLostEvent(discardReason2, DataCategory.Span, sentryTransaction.getSpans().size() + 1);
            }
        }
        return sentryId;
    }

    @Override // io.sentry.IScopes
    public void captureUserFeedback(UserFeedback userFeedback) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'captureUserFeedback' call is a no-op.", new Object[0]);
            return;
        }
        try {
            getClient().captureUserFeedback(userFeedback);
        } catch (Throwable th) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error while capturing captureUserFeedback: " + userFeedback.toString(), th);
        }
    }

    @Override // io.sentry.IScopes
    public void clearBreadcrumbs() {
        if (isEnabled()) {
            getCombinedScopeView().clearBreadcrumbs();
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'clearBreadcrumbs' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void close() {
        close(false);
    }

    @Override // io.sentry.IScopes
    public void configureScope(ScopeType scopeType, ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            scopeCallback.run(this.combinedScope.getSpecificScope(scopeType));
        } catch (Throwable th) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.IScopes
    public TransactionContext continueTrace(String str, List<String> list) {
        final PropagationContext propagationContextFromHeaders = PropagationContext.fromHeaders(getOptions().getLogger(), str, list);
        configureScope(new ScopeCallback() { // from class: io.sentry.z
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                iScope.withPropagationContext(new Scope.IWithPropagationContext() { // from class: io.sentry.s
                    @Override // io.sentry.Scope.IWithPropagationContext
                    public final void accept(PropagationContext propagationContext) {
                        iScope.setPropagationContext(propagationContext);
                    }
                });
            }
        });
        if (getOptions().isTracingEnabled()) {
            return TransactionContext.fromPropagationContext(propagationContextFromHeaders);
        }
        return null;
    }

    @Override // io.sentry.IScopes
    public void endSession() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        Session sessionEndSession = getCombinedScopeView().endSession();
        if (sessionEndSession != null) {
            getClient().captureSession(sessionEndSession, HintUtils.createWithTypeCheckHint(new SessionEndHint()));
        }
    }

    @Override // io.sentry.IScopes
    public void flush(long j10) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            getClient().flush(j10);
        } catch (Throwable th) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.IScopes
    public IScopes forkedCurrentScope(String str) {
        return new Scopes(this.scope.m245clone(), this.isolationScope, this.globalScope, this, str);
    }

    @Override // io.sentry.IScopes
    public IScopes forkedRootScopes(String str) {
        return Sentry.forkedRootScopes(str);
    }

    @Override // io.sentry.IScopes
    public IScopes forkedScopes(String str) {
        return new Scopes(this.scope.m245clone(), this.isolationScope.m245clone(), this.globalScope, this, str);
    }

    @Override // io.sentry.IScopes
    public BaggageHeader getBaggage() {
        if (isEnabled()) {
            TracingUtils.TracingHeaders tracingHeadersTrace = TracingUtils.trace(this, null, getSpan());
            if (tracingHeadersTrace != null) {
                return tracingHeadersTrace.getBaggageHeader();
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getBaggage' call is a no-op.", new Object[0]);
        }
        return null;
    }

    public ISentryClient getClient() {
        return getCombinedScopeView().getClient();
    }

    public IScope getCombinedScopeView() {
        return this.combinedScope;
    }

    public String getCreator() {
        return this.creator;
    }

    @Override // io.sentry.IScopes
    public IScope getGlobalScope() {
        return this.globalScope;
    }

    @Override // io.sentry.IScopes
    public IScope getIsolationScope() {
        return this.isolationScope;
    }

    @Override // io.sentry.IScopes
    public SentryId getLastEventId() {
        return getCombinedScopeView().getLastEventId();
    }

    @Override // io.sentry.IScopes
    public SentryOptions getOptions() {
        return this.combinedScope.getOptions();
    }

    @Override // io.sentry.IScopes
    public IScopes getParentScopes() {
        return this.parentScopes;
    }

    @Override // io.sentry.IScopes
    public RateLimiter getRateLimiter() {
        return getClient().getRateLimiter();
    }

    @Override // io.sentry.IScopes
    public IScope getScope() {
        return this.scope;
    }

    @Override // io.sentry.IScopes
    public ISpan getSpan() {
        if (isEnabled()) {
            return getCombinedScopeView().getSpan();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.IScopes
    public SentryTraceHeader getTraceparent() {
        if (isEnabled()) {
            TracingUtils.TracingHeaders tracingHeadersTrace = TracingUtils.trace(this, null, getSpan());
            if (tracingHeadersTrace != null) {
                return tracingHeadersTrace.getSentryTraceHeader();
            }
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getTraceparent' call is a no-op.", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.IScopes
    public ITransaction getTransaction() {
        if (isEnabled()) {
            return getCombinedScopeView().getTransaction();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.IScopes
    public boolean isAncestorOf(IScopes iScopes) {
        if (iScopes == null) {
            return false;
        }
        if (this == iScopes) {
            return true;
        }
        if (iScopes.getParentScopes() != null) {
            return isAncestorOf(iScopes.getParentScopes());
        }
        return false;
    }

    @Override // io.sentry.IScopes
    public Boolean isCrashedLastRun() {
        return SentryCrashLastRunState.getInstance().isCrashedLastRun(getOptions().getCacheDirPath(), !getOptions().isEnableAutoSessionTracking());
    }

    @Override // io.sentry.IScopes
    public boolean isEnabled() {
        return getClient().isEnabled();
    }

    @Override // io.sentry.IScopes
    public boolean isHealthy() {
        return getClient().isHealthy();
    }

    @Override // io.sentry.IScopes
    public ILoggerApi logger() {
        return this.logger;
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken makeCurrent() {
        return Sentry.setCurrentScopes(this);
    }

    @Override // io.sentry.IScopes
    public IMetricsApi metrics() {
        return this.metrics;
    }

    @Override // io.sentry.IScopes
    @Deprecated
    public void popScope() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'popScope' call is a no-op.", new Object[0]);
            return;
        }
        Scopes scopes = this.parentScopes;
        if (scopes != null) {
            scopes.makeCurrent();
        }
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushIsolationScope() {
        if (isEnabled()) {
            return forkedScopes("pushIsolationScope").makeCurrent();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushIsolationScope' call is a no-op.", new Object[0]);
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public ISentryLifecycleToken pushScope() {
        if (isEnabled()) {
            return forkedCurrentScope("pushScope").makeCurrent();
        }
        getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'pushScope' call is a no-op.", new Object[0]);
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.IScopes
    public void removeExtra(String str) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeExtra' call is a no-op.", new Object[0]);
        } else if (str == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "removeExtra called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().removeExtra(str);
        }
    }

    @Override // io.sentry.IScopes
    public void removeTag(String str) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'removeTag' call is a no-op.", new Object[0]);
        } else if (str == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "removeTag called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().removeTag(str);
        }
    }

    @Override // io.sentry.IScopes
    public void reportFullyDisplayed() {
        if (getOptions().isEnableTimeToFullDisplayTracing()) {
            getOptions().getFullyDisplayedReporter().reportFullyDrawn();
        }
    }

    @Override // io.sentry.IScopes
    public void setActiveSpan(ISpan iSpan) {
        getCombinedScopeView().setActiveSpan(iSpan);
    }

    @Override // io.sentry.IScopes
    public void setExtra(String str, String str2) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setExtra' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "setExtra called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().setExtra(str, str2);
        }
    }

    @Override // io.sentry.IScopes
    public void setFingerprint(List<String> list) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setFingerprint' call is a no-op.", new Object[0]);
        } else if (list == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "setFingerprint called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().setFingerprint(list);
        }
    }

    @Override // io.sentry.IScopes
    public void setLevel(SentryLevel sentryLevel) {
        if (isEnabled()) {
            getCombinedScopeView().setLevel(sentryLevel);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setLevel' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
        getCombinedScopeView().setSpanContext(th, iSpan, str);
    }

    @Override // io.sentry.IScopes
    public void setTag(String str, String str2) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            getCombinedScopeView().setTag(str, str2);
        }
    }

    @Override // io.sentry.IScopes
    public void setTransaction(String str) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setTransaction' call is a no-op.", new Object[0]);
        } else if (str != null) {
            getCombinedScopeView().setTransaction(str);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Transaction cannot be null", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void setUser(User user) {
        if (isEnabled()) {
            getCombinedScopeView().setUser(user);
        } else {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.IScopes
    public void startProfiler() {
        if (!getOptions().isContinuousProfilingEnabled()) {
            if (getOptions().isProfilingEnabled()) {
                getOptions().getLogger().log(SentryLevel.WARNING, "Continuous Profiling is not enabled. Set profilesSampleRate and profilesSampler to null to enable it.", new Object[0]);
            }
        } else {
            ProfileLifecycle profileLifecycle = getOptions().getProfileLifecycle();
            ProfileLifecycle profileLifecycle2 = ProfileLifecycle.MANUAL;
            if (profileLifecycle != profileLifecycle2) {
                getOptions().getLogger().log(SentryLevel.WARNING, "Profiling lifecycle is %s. Profiling cannot be started manually.", getOptions().getProfileLifecycle().name());
            } else {
                getOptions().getContinuousProfiler().startProfiler(profileLifecycle2, getOptions().getInternalTracesSampler());
            }
        }
    }

    @Override // io.sentry.IScopes
    public void startSession() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        Scope.SessionPair sessionPairStartSession = getCombinedScopeView().startSession();
        if (sessionPairStartSession == null) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        if (sessionPairStartSession.getPrevious() != null) {
            getClient().captureSession(sessionPairStartSession.getPrevious(), HintUtils.createWithTypeCheckHint(new SessionEndHint()));
        }
        getClient().captureSession(sessionPairStartSession.getCurrent(), HintUtils.createWithTypeCheckHint(new SessionStartHint()));
    }

    @Override // io.sentry.IScopes
    public ITransaction startTransaction(TransactionContext transactionContext, TransactionOptions transactionOptions) {
        return createTransaction(transactionContext, transactionOptions);
    }

    @Override // io.sentry.IScopes
    public void stopProfiler() {
        if (!getOptions().isContinuousProfilingEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Continuous Profiling is not enabled. Set profilesSampleRate and profilesSampler to null to enable it.", new Object[0]);
            return;
        }
        ProfileLifecycle profileLifecycle = getOptions().getProfileLifecycle();
        ProfileLifecycle profileLifecycle2 = ProfileLifecycle.MANUAL;
        if (profileLifecycle != profileLifecycle2) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Profiling lifecycle is %s. Profiling cannot be stopped manually.", getOptions().getProfileLifecycle().name());
        } else {
            getOptions().getLogger().log(SentryLevel.DEBUG, "Stopped continuous Profiling.", new Object[0]);
            getOptions().getContinuousProfiler().stopProfiler(profileLifecycle2);
        }
    }

    @Override // io.sentry.IScopes
    public void withIsolationScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            try {
                scopeCallback.run(NoOpScope.getInstance());
                return;
            } catch (Throwable th) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withIsolationScope' callback.", th);
                return;
            }
        }
        IScopes iScopesForkedScopes = forkedScopes("withIsolationScope");
        try {
            ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopesForkedScopes.makeCurrent();
            try {
                scopeCallback.run(iScopesForkedScopes.getIsolationScope());
                if (iSentryLifecycleTokenMakeCurrent != null) {
                    iSentryLifecycleTokenMakeCurrent.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withIsolationScope' callback.", th2);
        }
    }

    @Override // io.sentry.IScopes
    public void withScope(ScopeCallback scopeCallback) {
        if (!isEnabled()) {
            try {
                scopeCallback.run(NoOpScope.getInstance());
                return;
            } catch (Throwable th) {
                getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", th);
                return;
            }
        }
        IScopes iScopesForkedCurrentScope = forkedCurrentScope("withScope");
        try {
            ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = iScopesForkedCurrentScope.makeCurrent();
            try {
                scopeCallback.run(iScopesForkedCurrentScope.getScope());
                if (iSentryLifecycleTokenMakeCurrent != null) {
                    iSentryLifecycleTokenMakeCurrent.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error in the 'withScope' callback.", th2);
        }
    }

    private Scopes(IScope iScope, IScope iScope2, IScope iScope3, Scopes scopes, String str) {
        this.combinedScope = new CombinedScopeView(iScope3, iScope2, iScope);
        this.scope = iScope;
        this.isolationScope = iScope2;
        this.globalScope = iScope3;
        this.parentScopes = scopes;
        this.creator = str;
        SentryOptions options = getOptions();
        validateOptions(options);
        this.compositePerformanceCollector = options.getCompositePerformanceCollector();
        this.logger = new LoggerApi(this);
        this.metrics = new MetricsApi(this);
    }

    @Override // io.sentry.IScopes
    public SentryId captureEvent(SentryEvent sentryEvent, Hint hint, ScopeCallback scopeCallback) {
        return captureEventInternal(sentryEvent, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    public SentryId captureException(Throwable th, Hint hint, ScopeCallback scopeCallback) {
        return captureExceptionInternal(th, hint, scopeCallback);
    }

    @Override // io.sentry.IScopes
    public SentryId captureMessage(String str, SentryLevel sentryLevel, ScopeCallback scopeCallback) {
        return captureMessageInternal(str, sentryLevel, scopeCallback);
    }

    @Override // io.sentry.IScopes
    @Deprecated
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IHub m252clone() {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new HubScopesWrapper(forkedScopes("scopes clone"));
    }

    @Override // io.sentry.IScopes
    public void close(final boolean z10) {
        if (!isEnabled()) {
            getOptions().getLogger().log(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (Integration integration : getOptions().getIntegrations()) {
                if (integration instanceof Closeable) {
                    try {
                        ((Closeable) integration).close();
                    } catch (Throwable th) {
                        getOptions().getLogger().log(SentryLevel.WARNING, "Failed to close the integration {}.", integration, th);
                    }
                }
            }
            configureScope(new ScopeCallback() { // from class: io.sentry.t
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.clear();
                }
            });
            configureScope(ScopeType.ISOLATION, new ScopeCallback() { // from class: io.sentry.u
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.clear();
                }
            });
            getOptions().getBackpressureMonitor().close();
            getOptions().getTransactionProfiler().close();
            getOptions().getContinuousProfiler().close(true);
            getOptions().getCompositePerformanceCollector().close();
            getOptions().getConnectionStatusProvider().close();
            final ISentryExecutorService executorService = getOptions().getExecutorService();
            if (z10) {
                try {
                    executorService.submit(new Runnable() { // from class: io.sentry.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            executorService.close(this.f38849a.getOptions().getShutdownTimeoutMillis());
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    getOptions().getLogger().log(SentryLevel.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e10);
                    executorService.close(getOptions().getShutdownTimeoutMillis());
                }
            } else {
                executorService.close(getOptions().getShutdownTimeoutMillis());
            }
            configureScope(ScopeType.CURRENT, new ScopeCallback() { // from class: io.sentry.w
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.getClient().close(z10);
                }
            });
            configureScope(ScopeType.ISOLATION, new ScopeCallback() { // from class: io.sentry.x
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.getClient().close(z10);
                }
            });
            configureScope(ScopeType.GLOBAL, new ScopeCallback() { // from class: io.sentry.y
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    iScope.getClient().close(z10);
                }
            });
        } catch (Throwable th2) {
            getOptions().getLogger().log(SentryLevel.ERROR, "Error while closing the Scopes.", th2);
        }
    }

    @Override // io.sentry.IScopes
    public void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, new Hint());
    }
}
