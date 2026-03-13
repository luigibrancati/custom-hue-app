package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Span implements ISpan {
    private final SpanContext context;
    private final SpanOptions options;
    private final IScopes scopes;
    private SpanFinishedCallback spanFinishedCallback;
    private SentryDate startTimestamp;
    private Throwable throwable;
    private SentryDate timestamp;
    private final SentryTracer transaction;
    private boolean finished = false;
    private final AtomicBoolean isFinishing = new AtomicBoolean(false);
    private final Map<String, Object> data = new ConcurrentHashMap();
    private final Map<String, MeasurementValue> measurements = new ConcurrentHashMap();
    private final Contexts contexts = new Contexts();

    public Span(SentryTracer sentryTracer, IScopes iScopes, SpanContext spanContext, SpanOptions spanOptions, SpanFinishedCallback spanFinishedCallback) {
        this.context = spanContext;
        spanContext.setOrigin(spanOptions.getOrigin());
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "transaction is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        this.options = spanOptions;
        this.spanFinishedCallback = spanFinishedCallback;
        SentryDate startTimestamp = spanOptions.getStartTimestamp();
        if (startTimestamp != null) {
            this.startTimestamp = startTimestamp;
        } else {
            this.startTimestamp = iScopes.getOptions().getDateProvider().now();
        }
    }

    private List<Span> getDirectChildren() {
        ArrayList arrayList = new ArrayList();
        for (Span span : this.transaction.getSpans()) {
            if (span.getParentSpanId() != null && span.getParentSpanId().equals(getSpanId())) {
                arrayList.add(span);
            }
        }
        return arrayList;
    }

    private void updateStartDate(SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    @Override // io.sentry.ISpan
    public void addFeatureFlag(String str, Boolean bool) {
        this.context.addFeatureFlag(str, bool);
    }

    @Override // io.sentry.ISpan
    public void finish() {
        finish(this.context.getStatus());
    }

    @Override // io.sentry.ISpan
    public Contexts getContexts() {
        return this.contexts;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return this.context.getDescription();
    }

    @Override // io.sentry.ISpan
    public SentryDate getFinishDate() {
        return this.timestamp;
    }

    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @Override // io.sentry.ISpan
    public String getOperation() {
        return this.context.getOperation();
    }

    public SpanOptions getOptions() {
        return this.options;
    }

    public SpanId getParentSpanId() {
        return this.context.getParentSpanId();
    }

    @Override // io.sentry.ISpan
    public TracesSamplingDecision getSamplingDecision() {
        return this.context.getSamplingDecision();
    }

    @Override // io.sentry.ISpan
    public SpanContext getSpanContext() {
        return this.context;
    }

    public SpanFinishedCallback getSpanFinishedCallback() {
        return this.spanFinishedCallback;
    }

    public SpanId getSpanId() {
        return this.context.getSpanId();
    }

    @Override // io.sentry.ISpan
    public SentryDate getStartDate() {
        return this.startTimestamp;
    }

    @Override // io.sentry.ISpan
    public SpanStatus getStatus() {
        return this.context.getStatus();
    }

    @Override // io.sentry.ISpan
    public String getTag(String str) {
        if (str == null) {
            return null;
        }
        return this.context.getTags().get(str);
    }

    public Map<String, String> getTags() {
        return this.context.getTags();
    }

    @Override // io.sentry.ISpan
    public Throwable getThrowable() {
        return this.throwable;
    }

    public SentryId getTraceId() {
        return this.context.getTraceId();
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return this.finished;
    }

    @Override // io.sentry.ISpan
    public boolean isNoOp() {
        return false;
    }

    public Boolean isProfileSampled() {
        return this.context.getProfileSampled();
    }

    @Override // io.sentry.ISpan
    public Boolean isSampled() {
        return this.context.getSampled();
    }

    @Override // io.sentry.ISpan
    public ISentryLifecycleToken makeCurrent() {
        return NoOpScopesLifecycleToken.getInstance();
    }

    @Override // io.sentry.ISpan
    public void setContext(String str, Object obj) {
        this.contexts.put(str, obj);
    }

    @Override // io.sentry.ISpan
    public void setData(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.data.remove(str);
        } else {
            this.data.put(str, obj);
        }
    }

    @Override // io.sentry.ISpan
    public void setDescription(String str) {
        this.context.setDescription(str);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(String str, Number number) {
        if (isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new MeasurementValue(number, null));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number);
        }
    }

    @Override // io.sentry.ISpan
    public void setOperation(String str) {
        this.context.setOperation(str);
    }

    public void setSpanFinishedCallback(SpanFinishedCallback spanFinishedCallback) {
        this.spanFinishedCallback = spanFinishedCallback;
    }

    @Override // io.sentry.ISpan
    public void setStatus(SpanStatus spanStatus) {
        this.context.setStatus(spanStatus);
    }

    @Override // io.sentry.ISpan
    public void setTag(String str, String str2) {
        this.context.setTag(str, str2);
    }

    @Override // io.sentry.ISpan
    public void setThrowable(Throwable th) {
        this.throwable = th;
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str) {
        return startChild(str, (String) null);
    }

    @Override // io.sentry.ISpan
    public BaggageHeader toBaggageHeader(List<String> list) {
        return this.transaction.toBaggageHeader(list);
    }

    @Override // io.sentry.ISpan
    public SentryTraceHeader toSentryTrace() {
        return new SentryTraceHeader(this.context.getTraceId(), this.context.getSpanId(), this.context.getSampled());
    }

    @Override // io.sentry.ISpan
    public TraceContext traceContext() {
        return this.transaction.traceContext();
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(SentryDate sentryDate) {
        if (this.timestamp == null) {
            return false;
        }
        this.timestamp = sentryDate;
        return true;
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus) {
        finish(spanStatus, this.scopes.getOptions().getDateProvider().now());
    }

    @Override // io.sentry.ISpan
    public Object getData(String str) {
        if (str == null) {
            return null;
        }
        return this.data.get(str);
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter, SpanOptions spanOptions) {
        return this.finished ? NoOpSpan.getInstance() : this.transaction.startChild(this.context.getSpanId(), str, str2, sentryDate, instrumenter, spanOptions);
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus, SentryDate sentryDate) {
        List<Span> directChildren;
        SentryDate sentryDate2;
        if (this.finished || !this.isFinishing.compareAndSet(false, true)) {
            return;
        }
        this.context.setStatus(spanStatus);
        if (sentryDate == null) {
            sentryDate = this.scopes.getOptions().getDateProvider().now();
        }
        this.timestamp = sentryDate;
        if (this.options.isTrimStart() || this.options.isTrimEnd()) {
            if (this.transaction.getRoot().getSpanId().equals(getSpanId())) {
                directChildren = this.transaction.getChildren();
            } else {
                directChildren = getDirectChildren();
            }
            SentryDate startDate = null;
            SentryDate finishDate = null;
            for (Span span : directChildren) {
                if (startDate == null || span.getStartDate().isBefore(startDate)) {
                    startDate = span.getStartDate();
                }
                if (finishDate == null || (span.getFinishDate() != null && span.getFinishDate().isAfter(finishDate))) {
                    finishDate = span.getFinishDate();
                }
            }
            if (this.options.isTrimStart() && startDate != null && this.startTimestamp.isBefore(startDate)) {
                updateStartDate(startDate);
            }
            if (this.options.isTrimEnd() && finishDate != null && ((sentryDate2 = this.timestamp) == null || sentryDate2.isAfter(finishDate))) {
                updateEndDate(finishDate);
            }
        }
        Throwable th = this.throwable;
        if (th != null) {
            this.scopes.setSpanContext(th, this, this.transaction.getName());
        }
        SpanFinishedCallback spanFinishedCallback = this.spanFinishedCallback;
        if (spanFinishedCallback != null) {
            spanFinishedCallback.execute(this);
        }
        this.finished = true;
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2) {
        if (this.finished) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(String str, Number number, MeasurementUnit measurementUnit) {
        if (isFinished()) {
            this.scopes.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new MeasurementValue(number, measurementUnit.apiName()));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number, measurementUnit);
        }
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2, SpanOptions spanOptions) {
        if (this.finished) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2, spanOptions);
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(SpanContext spanContext, SpanOptions spanOptions) {
        return this.transaction.startChild(spanContext, spanOptions);
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter) {
        return startChild(str, str2, sentryDate, instrumenter, new SpanOptions());
    }

    public Span(TransactionContext transactionContext, SentryTracer sentryTracer, IScopes iScopes, SpanOptions spanOptions) {
        SpanContext spanContext = (SpanContext) Objects.requireNonNull(transactionContext, "context is required");
        this.context = spanContext;
        spanContext.setOrigin(spanOptions.getOrigin());
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "scopes are required");
        this.spanFinishedCallback = null;
        SentryDate startTimestamp = spanOptions.getStartTimestamp();
        if (startTimestamp != null) {
            this.startTimestamp = startTimestamp;
        } else {
            this.startTimestamp = iScopes.getOptions().getDateProvider().now();
        }
        this.options = spanOptions;
    }
}
