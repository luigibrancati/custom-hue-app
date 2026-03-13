package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentrySample implements JsonUnknown, JsonSerializable {
    private int stackId;
    private String threadId;
    private double timestamp;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentrySample> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentrySample deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentrySample sentrySample = new SentrySample();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "thread_id":
                        sentrySample.threadId = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        sentrySample.timestamp = objectReader.nextDouble();
                        break;
                    case "stack_id":
                        sentrySample.stackId = objectReader.nextInt();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            sentrySample.setUnknown(map);
            objectReader.endObject();
            return sentrySample;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String STACK_ID = "stack_id";
        public static final String THREAD_ID = "thread_id";
        public static final String TIMESTAMP = "timestamp";
    }

    private BigDecimal doubleToBigDecimal(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public int getStackId() {
        return this.stackId;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public double getTimestamp() {
        return this.timestamp;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(Double.valueOf(this.timestamp)));
        objectWriter.name(JsonKeys.STACK_ID).value(iLogger, Integer.valueOf(this.stackId));
        if (this.threadId != null) {
            objectWriter.name("thread_id").value(iLogger, this.threadId);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setStackId(int i10) {
        this.stackId = i10;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setTimestamp(double d10) {
        this.timestamp = d10;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
