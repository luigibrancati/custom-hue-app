package io.sentry.logger;

import io.sentry.SentryAttributes;
import io.sentry.SentryDate;
import io.sentry.SpanContext;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryLogParameters {
    private SentryAttributes attributes;
    private String origin = SpanContext.DEFAULT_ORIGIN;
    private SentryDate timestamp;

    public static SentryLogParameters create(SentryDate sentryDate, SentryAttributes sentryAttributes) {
        SentryLogParameters sentryLogParameters = new SentryLogParameters();
        sentryLogParameters.setTimestamp(sentryDate);
        sentryLogParameters.setAttributes(sentryAttributes);
        return sentryLogParameters;
    }

    public SentryAttributes getAttributes() {
        return this.attributes;
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

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setTimestamp(SentryDate sentryDate) {
        this.timestamp = sentryDate;
    }

    public static SentryLogParameters create(SentryAttributes sentryAttributes) {
        return create(null, sentryAttributes);
    }
}
