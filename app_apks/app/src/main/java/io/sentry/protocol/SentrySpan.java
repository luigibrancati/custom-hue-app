package io.sentry.protocol;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.Span;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentrySpan implements JsonUnknown, JsonSerializable {
    private Map<String, Object> data;
    private final String description;
    private final Map<String, MeasurementValue> measurements;
    private final String op;
    private final String origin;
    private final SpanId parentSpanId;
    private final SpanId spanId;
    private final Double startTimestamp;
    private final SpanStatus status;
    private final Map<String, String> tags;
    private final Double timestamp;
    private final SentryId traceId;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentrySpan> {
        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.log(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentrySpan deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            Map map = null;
            SentryId sentryIdDeserialize = null;
            SpanId spanIdDeserialize = null;
            Map map2 = null;
            String strNextStringOrNull = null;
            Double dValueOf2 = null;
            SpanId spanId = null;
            String strNextStringOrNull2 = null;
            SpanStatus spanStatus = null;
            String strNextStringOrNull3 = null;
            Map map3 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d10 = dValueOf;
                Map map4 = map;
                SentryId sentryId = sentryIdDeserialize;
                SpanId spanId2 = spanIdDeserialize;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (d10 == null) {
                        throw missingRequiredFieldException("start_timestamp", iLogger);
                    }
                    if (sentryId == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (spanId2 == null) {
                        throw missingRequiredFieldException("span_id", iLogger);
                    }
                    if (strNextStringOrNull == null) {
                        throw missingRequiredFieldException("op", iLogger);
                    }
                    Map map5 = map4 == null ? new HashMap() : map4;
                    if (map2 == null) {
                        map2 = new HashMap();
                    }
                    SentrySpan sentrySpan = new SentrySpan(d10, dValueOf2, sentryId, spanId2, spanId, strNextStringOrNull, strNextStringOrNull2, spanStatus, strNextStringOrNull3, map5, map2, map3);
                    sentrySpan.setUnknown(concurrentHashMap2);
                    objectReader.endObject();
                    return sentrySpan;
                }
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanIdDeserialize = new SpanId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "parent_span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "description":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = objectReader.nextDoubleOrNull();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            dValueOf = dateNextDateOrNull != null ? Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "origin":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "status":
                        spanStatus = (SpanStatus) objectReader.nextOrNull(iLogger, new SpanStatus.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "measurements":
                        map2 = objectReader.nextMapOrNull(iLogger, new MeasurementValue.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "op":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "data":
                        map3 = (Map) objectReader.nextObjectOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "tags":
                        map = (Map) objectReader.nextObjectOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = objectReader.nextDoubleOrNull();
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                            dValueOf2 = dateNextDateOrNull2 != null ? Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull2)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                    case "trace_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d10;
                        map = map4;
                        spanIdDeserialize = spanId2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        dValueOf = d10;
                        map = map4;
                        sentryIdDeserialize = sentryId;
                        spanIdDeserialize = spanId2;
                        break;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String DESCRIPTION = "description";
        public static final String MEASUREMENTS = "measurements";
        public static final String OP = "op";
        public static final String ORIGIN = "origin";
        public static final String PARENT_SPAN_ID = "parent_span_id";
        public static final String SPAN_ID = "span_id";
        public static final String START_TIMESTAMP = "start_timestamp";
        public static final String STATUS = "status";
        public static final String TAGS = "tags";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRACE_ID = "trace_id";
    }

    public SentrySpan(Span span) {
        this(span, span.getData());
    }

    private BigDecimal doubleToBigDecimal(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    public String getOp() {
        return this.op;
    }

    public String getOrigin() {
        return this.origin;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public Double getStartTimestamp() {
        return this.startTimestamp;
    }

    public SpanStatus getStatus() {
        return this.status;
    }

    public Map<String, String> getTags() {
        return this.tags;
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

    public boolean isFinished() {
        return this.timestamp != null;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("start_timestamp").value(iLogger, doubleToBigDecimal(this.startTimestamp));
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(this.timestamp));
        }
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("span_id").value(iLogger, this.spanId);
        if (this.parentSpanId != null) {
            objectWriter.name("parent_span_id").value(iLogger, this.parentSpanId);
        }
        objectWriter.name("op").value(this.op);
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (this.status != null) {
            objectWriter.name("status").value(iLogger, this.status);
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(iLogger, this.origin);
        }
        if (!this.tags.isEmpty()) {
            objectWriter.name("tags").value(iLogger, this.tags);
        }
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        if (!this.measurements.isEmpty()) {
            objectWriter.name("measurements").value(iLogger, this.measurements);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.unknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentrySpan(Span span, Map<String, Object> map) {
        Objects.requireNonNull(span, "span is required");
        this.description = span.getDescription();
        this.op = span.getOperation();
        this.spanId = span.getSpanId();
        this.parentSpanId = span.getParentSpanId();
        this.traceId = span.getTraceId();
        this.status = span.getStatus();
        this.origin = span.getSpanContext().getOrigin();
        Map<String, String> mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap(span.getTags());
        this.tags = mapNewConcurrentHashMap == null ? new ConcurrentHashMap<>() : mapNewConcurrentHashMap;
        Map<String, MeasurementValue> mapNewConcurrentHashMap2 = CollectionUtils.newConcurrentHashMap(span.getMeasurements());
        this.measurements = mapNewConcurrentHashMap2 == null ? new ConcurrentHashMap<>() : mapNewConcurrentHashMap2;
        this.timestamp = span.getFinishDate() == null ? null : Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().laterDateNanosTimestampByDiff(span.getFinishDate())));
        this.startTimestamp = Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().nanoTimestamp()));
        this.data = map;
        FeatureFlags featureFlags = span.getSpanContext().getFeatureFlagBuffer().getFeatureFlags();
        if (featureFlags != null) {
            if (this.data == null) {
                this.data = new HashMap();
            }
            for (FeatureFlag featureFlag : featureFlags.getValues()) {
                this.data.put(FeatureFlag.DATA_PREFIX + featureFlag.getFlag(), featureFlag.getResult());
            }
        }
    }

    public SentrySpan(Double d10, Double d11, SentryId sentryId, SpanId spanId, SpanId spanId2, String str, String str2, SpanStatus spanStatus, String str3, Map<String, String> map, Map<String, MeasurementValue> map2, Map<String, Object> map3) {
        this.startTimestamp = d10;
        this.timestamp = d11;
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.op = str;
        this.description = str2;
        this.status = spanStatus;
        this.origin = str3;
        this.tags = map;
        this.measurements = map2;
        this.data = map3;
    }
}
