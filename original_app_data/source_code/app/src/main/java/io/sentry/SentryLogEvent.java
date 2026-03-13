package io.sentry;

import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryLogLevel;
import io.sentry.SpanId;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryLogEvent implements JsonUnknown, JsonSerializable {
    private Map<String, SentryLogEventAttributeValue> attributes;
    private String body;
    private SentryLogLevel level;
    private Integer severityNumber;
    private SpanId spanId;
    private Double timestamp;
    private SentryId traceId;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryLogEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryLogEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryId sentryId = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull = null;
            HashMap map = null;
            SentryLogLevel sentryLogLevel = null;
            Map<String, SentryLogEventAttributeValue> mapNextMapOrNull = null;
            Integer numNextIntegerOrNull = null;
            SpanId spanId = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        break;
                    case "severity_number":
                        numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        break;
                    case "body":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        break;
                    case "level":
                        sentryLogLevel = (SentryLogLevel) objectReader.nextOrNull(iLogger, new SentryLogLevel.Deserializer());
                        break;
                    case "attributes":
                        mapNextMapOrNull = objectReader.nextMapOrNull(iLogger, new SentryLogEventAttributeValue.Deserializer());
                        break;
                    case "trace_id":
                        sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            objectReader.endObject();
            if (sentryId == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (dNextDoubleOrNull == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"timestamp\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"timestamp\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"body\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (sentryLogLevel == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"level\"", illegalStateException4);
                throw illegalStateException4;
            }
            SentryLogEvent sentryLogEvent = new SentryLogEvent(sentryId, dNextDoubleOrNull, strNextStringOrNull, sentryLogLevel);
            sentryLogEvent.setAttributes(mapNextMapOrNull);
            sentryLogEvent.setSeverityNumber(numNextIntegerOrNull);
            sentryLogEvent.setSpanId(spanId);
            sentryLogEvent.setUnknown(map);
            return sentryLogEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String ATTRIBUTES = "attributes";
        public static final String BODY = "body";
        public static final String LEVEL = "level";
        public static final String SEVERITY_NUMBER = "severity_number";
        public static final String SPAN_ID = "span_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
    }

    public SentryLogEvent(SentryId sentryId, SentryDate sentryDate, String str, SentryLogLevel sentryLogLevel) {
        this(sentryId, Double.valueOf(DateUtils.nanosToSeconds(sentryDate.nanoTimestamp())), str, sentryLogLevel);
    }

    public Map<String, SentryLogEventAttributeValue> getAttributes() {
        return this.attributes;
    }

    public String getBody() {
        return this.body;
    }

    public SentryLogLevel getLevel() {
        return this.level;
    }

    public Integer getSeverityNumber() {
        return this.severityNumber;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public Double getTimestamp() {
        return this.timestamp;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, DateUtils.doubleToBigDecimal(this.timestamp));
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        if (this.spanId != null) {
            objectWriter.name("span_id").value(iLogger, this.spanId);
        }
        objectWriter.name(JsonKeys.BODY).value(this.body);
        objectWriter.name("level").value(iLogger, this.level);
        if (this.severityNumber != null) {
            objectWriter.name(JsonKeys.SEVERITY_NUMBER).value(iLogger, this.severityNumber);
        }
        if (this.attributes != null) {
            objectWriter.name("attributes").value(iLogger, this.attributes);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAttribute(String str, SentryLogEventAttributeValue sentryLogEventAttributeValue) {
        if (str == null) {
            return;
        }
        if (this.attributes == null) {
            this.attributes = new HashMap();
        }
        this.attributes.put(str, sentryLogEventAttributeValue);
    }

    public void setAttributes(Map<String, SentryLogEventAttributeValue> map) {
        this.attributes = map;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setLevel(SentryLogLevel sentryLogLevel) {
        this.level = sentryLogLevel;
    }

    public void setSeverityNumber(Integer num) {
        this.severityNumber = num;
    }

    public void setSpanId(SpanId spanId) {
        this.spanId = spanId;
    }

    public void setTimestamp(Double d10) {
        this.timestamp = d10;
    }

    public void setTraceId(SentryId sentryId) {
        this.traceId = sentryId;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryLogEvent(SentryId sentryId, Double d10, String str, SentryLogLevel sentryLogLevel) {
        this.traceId = sentryId;
        this.timestamp = d10;
        this.body = str;
        this.level = sentryLogLevel;
    }
}
