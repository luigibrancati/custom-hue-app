package io.sentry;

import io.sentry.exception.InvalidSentryTraceHeaderException;
import io.sentry.protocol.SentryId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryTraceHeader {
    private static final Pattern SENTRY_TRACEPARENT_HEADER_REGEX = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    public static final String SENTRY_TRACE_HEADER = "sentry-trace";
    private final Boolean sampled;
    private final SpanId spanId;
    private final SentryId traceId;

    public SentryTraceHeader(SentryId sentryId, SpanId spanId, Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.sampled = bool;
    }

    public String getName() {
        return SENTRY_TRACE_HEADER;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public String getValue() {
        Boolean bool = this.sampled;
        if (bool != null) {
            return String.format("%s-%s-%s", this.traceId, this.spanId, bool.booleanValue() ? "1" : WebrtcBuildVersion.maint_version);
        }
        return String.format("%s-%s", this.traceId, this.spanId);
    }

    public Boolean isSampled() {
        return this.sampled;
    }

    public SentryTraceHeader(String str) throws InvalidSentryTraceHeaderException {
        Matcher matcher = SENTRY_TRACEPARENT_HEADER_REGEX.matcher(str);
        if (matcher.matches()) {
            this.traceId = new SentryId(matcher.group(1));
            this.spanId = new SpanId(matcher.group(2));
            String strGroup = matcher.group(3);
            this.sampled = strGroup == null ? null : Boolean.valueOf("1".equals(strGroup.substring(1)));
            return;
        }
        throw new InvalidSentryTraceHeaderException(str);
    }
}
