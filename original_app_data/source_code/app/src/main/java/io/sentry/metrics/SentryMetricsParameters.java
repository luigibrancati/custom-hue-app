package io.sentry.metrics;

import io.sentry.Hint;
import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SpanContext;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryMetricsParameters {
    private SentryAttributes attributes;
    private SentryDate timestamp;
    private String origin = SpanContext.DEFAULT_ORIGIN;
    private Hint hint = null;

    public static SentryMetricsParameters create(SentryDate sentryDate, SentryAttributes sentryAttributes) {
        SentryMetricsParameters sentryMetricsParameters = new SentryMetricsParameters();
        sentryMetricsParameters.setTimestamp(sentryDate);
        sentryMetricsParameters.setAttributes(sentryAttributes);
        return sentryMetricsParameters;
    }

    public SentryAttributes getAttributes() {
        return this.attributes;
    }

    public Hint getHint() {
        return this.hint;
    }

    public String getOrigin() {
        return this.origin;
    }

    public SentryDate getTimestamp() {
        return this.timestamp;
    }

    public void setAttributes(SentryAttributes sentryAttributes) {
        this.attributes = sentryAttributes;
    }

    public void setHint(Hint hint) {
        this.hint = hint;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setTimestamp(SentryDate sentryDate) {
        this.timestamp = sentryDate;
    }

    public static SentryMetricsParameters create(SentryAttributes sentryAttributes) {
        return create(null, sentryAttributes);
    }

    public static SentryMetricsParameters create(Map<String, Object> map) {
        return create(null, SentryAttributes.fromMap(map));
    }
}
