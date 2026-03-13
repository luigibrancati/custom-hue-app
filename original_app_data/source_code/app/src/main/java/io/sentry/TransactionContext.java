package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.Objects;
import io.sentry.util.TracingUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TransactionContext extends SpanContext {
    private static final TransactionNameSource DEFAULT_NAME_SOURCE = TransactionNameSource.CUSTOM;
    private static final String DEFAULT_OPERATION = "default";
    public static final String DEFAULT_TRANSACTION_NAME = "<unlabeled transaction>";
    private boolean isForNextAppStart;
    private String name;
    private TracesSamplingDecision parentSamplingDecision;
    private TransactionNameSource transactionNameSource;

    public TransactionContext(String str, String str2) {
        this(str, str2, (TracesSamplingDecision) null);
    }

    public static TransactionContext fromPropagationContext(PropagationContext propagationContext) {
        Boolean boolIsSampled = propagationContext.isSampled();
        Baggage baggage = propagationContext.getBaggage();
        return new TransactionContext(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), boolIsSampled == null ? null : new TracesSamplingDecision(boolIsSampled, baggage.getSampleRate(), propagationContext.getSampleRand()), baggage);
    }

    public String getName() {
        return this.name;
    }

    public Boolean getParentSampled() {
        TracesSamplingDecision tracesSamplingDecision = this.parentSamplingDecision;
        if (tracesSamplingDecision == null) {
            return null;
        }
        return tracesSamplingDecision.getSampled();
    }

    public TracesSamplingDecision getParentSamplingDecision() {
        return this.parentSamplingDecision;
    }

    public TransactionNameSource getTransactionNameSource() {
        return this.transactionNameSource;
    }

    public boolean isForNextAppStart() {
        return this.isForNextAppStart;
    }

    public void setForNextAppStart(boolean z10) {
        this.isForNextAppStart = z10;
    }

    public void setName(String str) {
        this.name = (String) Objects.requireNonNull(str, "name is required");
    }

    public void setParentSampled(Boolean bool) {
        if (bool == null) {
            this.parentSamplingDecision = null;
        } else {
            this.parentSamplingDecision = new TracesSamplingDecision(bool);
        }
    }

    public void setTransactionNameSource(TransactionNameSource transactionNameSource) {
        this.transactionNameSource = transactionNameSource;
    }

    public TransactionContext(String str, TransactionNameSource transactionNameSource, String str2) {
        this(str, transactionNameSource, str2, null);
    }

    public TransactionContext(String str, String str2, TracesSamplingDecision tracesSamplingDecision) {
        this(str, TransactionNameSource.CUSTOM, str2, tracesSamplingDecision);
    }

    public void setParentSampled(Boolean bool, Boolean bool2) {
        if (bool == null) {
            this.parentSamplingDecision = null;
        } else if (bool2 == null) {
            this.parentSamplingDecision = new TracesSamplingDecision(bool);
        } else {
            this.parentSamplingDecision = new TracesSamplingDecision(bool, null, bool2, null);
        }
    }

    public TransactionContext(String str, TransactionNameSource transactionNameSource, String str2, TracesSamplingDecision tracesSamplingDecision) {
        super(str2);
        this.isForNextAppStart = false;
        this.name = (String) Objects.requireNonNull(str, "name is required");
        this.transactionNameSource = transactionNameSource;
        setSamplingDecision(tracesSamplingDecision);
        this.baggage = TracingUtils.ensureBaggage(null, tracesSamplingDecision);
    }

    public TransactionContext(SentryId sentryId, SpanId spanId, SpanId spanId2, TracesSamplingDecision tracesSamplingDecision, Baggage baggage) {
        super(sentryId, spanId, DEFAULT_OPERATION, spanId2, null);
        this.isForNextAppStart = false;
        this.name = DEFAULT_TRANSACTION_NAME;
        this.parentSamplingDecision = tracesSamplingDecision;
        this.transactionNameSource = DEFAULT_NAME_SOURCE;
        this.baggage = TracingUtils.ensureBaggage(baggage, tracesSamplingDecision);
    }
}
