package io.sentry;

import io.sentry.protocol.Contexts;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ISpan {
    void addFeatureFlag(String str, Boolean bool);

    void finish();

    void finish(SpanStatus spanStatus);

    void finish(SpanStatus spanStatus, SentryDate sentryDate);

    Contexts getContexts();

    Object getData(String str);

    String getDescription();

    SentryDate getFinishDate();

    String getOperation();

    TracesSamplingDecision getSamplingDecision();

    SpanContext getSpanContext();

    SentryDate getStartDate();

    SpanStatus getStatus();

    String getTag(String str);

    Throwable getThrowable();

    boolean isFinished();

    boolean isNoOp();

    Boolean isSampled();

    ISentryLifecycleToken makeCurrent();

    void setContext(String str, Object obj);

    void setData(String str, Object obj);

    void setDescription(String str);

    void setMeasurement(String str, Number number);

    void setMeasurement(String str, Number number, MeasurementUnit measurementUnit);

    void setOperation(String str);

    void setStatus(SpanStatus spanStatus);

    void setTag(String str, String str2);

    void setThrowable(Throwable th);

    ISpan startChild(SpanContext spanContext, SpanOptions spanOptions);

    ISpan startChild(String str);

    ISpan startChild(String str, String str2);

    ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter);

    ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter, SpanOptions spanOptions);

    ISpan startChild(String str, String str2, SpanOptions spanOptions);

    BaggageHeader toBaggageHeader(List<String> list);

    SentryTraceHeader toSentryTrace();

    TraceContext traceContext();

    boolean updateEndDate(SentryDate sentryDate);
}
