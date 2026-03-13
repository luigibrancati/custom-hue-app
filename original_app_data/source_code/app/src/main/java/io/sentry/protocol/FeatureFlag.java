package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class FeatureFlag implements JsonUnknown, JsonSerializable {
    public static final String DATA_PREFIX = "flag.evaluation.";
    private String flag;
    private boolean result;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<FeatureFlag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public FeatureFlag deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            String strNextStringOrNull = null;
            Boolean boolNextBooleanOrNull = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals(JsonKeys.RESULT)) {
                    boolNextBooleanOrNull = objectReader.nextBooleanOrNull();
                } else if (strNextName.equals(JsonKeys.FLAG)) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (boolNextBooleanOrNull == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            FeatureFlag featureFlag = new FeatureFlag(strNextStringOrNull, boolNextBooleanOrNull.booleanValue());
            featureFlag.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return featureFlag;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String FLAG = "flag";
        public static final String RESULT = "result";
    }

    public FeatureFlag(String str, boolean z10) {
        this.flag = str;
        this.result = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FeatureFlag.class == obj.getClass()) {
            FeatureFlag featureFlag = (FeatureFlag) obj;
            if (Objects.equals(this.flag, featureFlag.flag) && Objects.equals(Boolean.valueOf(this.result), Boolean.valueOf(featureFlag.result))) {
                return true;
            }
        }
        return false;
    }

    public String getFlag() {
        return this.flag;
    }

    public Boolean getResult() {
        return Boolean.valueOf(this.result);
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return Objects.hash(this.flag, Boolean.valueOf(this.result));
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.FLAG).value(this.flag);
        objectWriter.name(JsonKeys.RESULT).value(this.result);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setFlag(String str) {
        this.flag = str;
    }

    public void setResult(Boolean bool) {
        this.result = bool.booleanValue();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
