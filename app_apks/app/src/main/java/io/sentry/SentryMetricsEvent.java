package io.sentry;

import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SpanId;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryMetricsEvent implements JsonUnknown, JsonSerializable {
    private Map<String, SentryLogEventAttributeValue> attributes;
    private String name;
    private SpanId spanId;
    private Double timestamp;
    private SentryId traceId;
    private String type;
    private String unit;
    private Map<String, Object> unknown;
    private Double value;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryMetricsEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryMetricsEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            HashMap map = null;
            SentryId sentryId = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            Double dNextDoubleOrNull2 = null;
            Map<String, SentryLogEventAttributeValue> mapNextMapOrNull = null;
            SpanId spanId = null;
            String strNextStringOrNull3 = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        break;
                    case "name":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "unit":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        break;
                    case "value":
                        dNextDoubleOrNull2 = objectReader.nextDoubleOrNull();
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
            if (strNextStringOrNull2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"type\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException3);
                throw illegalStateException3;
            }
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException4);
                throw illegalStateException4;
            }
            if (dNextDoubleOrNull2 == null) {
                IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"value\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException5);
                throw illegalStateException5;
            }
            SentryMetricsEvent sentryMetricsEvent = new SentryMetricsEvent(sentryId, dNextDoubleOrNull, strNextStringOrNull, strNextStringOrNull2, dNextDoubleOrNull2);
            sentryMetricsEvent.setAttributes(mapNextMapOrNull);
            sentryMetricsEvent.setSpanId(spanId);
            sentryMetricsEvent.setUnit(strNextStringOrNull3);
            sentryMetricsEvent.setUnknown(map);
            return sentryMetricsEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String ATTRIBUTES = "attributes";
        public static final String NAME = "name";
        public static final String SPAN_ID = "span_id";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
        public static final String TYPE = "type";
        public static final String UNIT = "unit";
        public static final String VALUE = "value";
    }

    public SentryMetricsEvent(SentryId sentryId, SentryDate sentryDate, String str, String str2, Double d10) {
        this(sentryId, Double.valueOf(DateUtils.nanosToSeconds(sentryDate.nanoTimestamp())), str, str2, d10);
    }

    public Map<String, SentryLogEventAttributeValue> getAttributes() {
        return this.attributes;
    }

    public String getName() {
        return this.name;
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

    public String getType() {
        return this.type;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Double getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, DateUtils.doubleToBigDecimal(this.timestamp));
        objectWriter.name("type").value(this.type);
        objectWriter.name("name").value(this.name);
        objectWriter.name("value").value(this.value);
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        if (this.spanId != null) {
            objectWriter.name("span_id").value(iLogger, this.spanId);
        }
        if (this.unit != null) {
            objectWriter.name("unit").value(iLogger, this.unit);
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

    public void setName(String str) {
        this.name = str;
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

    public void setType(String str) {
        this.type = str;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setValue(Double d10) {
        this.value = d10;
    }

    public SentryMetricsEvent(SentryId sentryId, Double d10, String str, String str2, Double d11) {
        this.traceId = sentryId;
        this.timestamp = d10;
        this.name = str;
        this.type = str2;
        this.value = d11;
    }
}
