package io.sentry;

import io.sentry.protocol.SentryId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class W3CTraceparentHeader {
    public static final String TRACEPARENT_HEADER = "traceparent";
    private final Boolean sampled;
    private final SpanId spanId;
    private final SentryId traceId;

    public W3CTraceparentHeader(SentryId sentryId, SpanId spanId, Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.sampled = bool;
    }

    public String getName() {
        return TRACEPARENT_HEADER;
    }

    public String getValue() {
        Boolean bool = this.sampled;
        return String.format("00-%s-%s-%s", this.traceId, this.spanId, (bool == null || !bool.booleanValue()) ? "00" : "01");
    }
}
