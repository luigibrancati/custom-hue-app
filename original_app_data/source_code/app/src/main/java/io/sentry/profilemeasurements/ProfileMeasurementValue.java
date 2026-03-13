package io.sentry.profilemeasurements;

import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ProfileMeasurementValue implements JsonUnknown, JsonSerializable {
    private String relativeStartNs;
    private double timestamp;
    private Map<String, Object> unknown;
    private double value;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<ProfileMeasurementValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ProfileMeasurementValue deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            Double dValueOf;
            objectReader.beginObject();
            ProfileMeasurementValue profileMeasurementValue = new ProfileMeasurementValue();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "elapsed_since_start_ns":
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            break;
                        } else {
                            profileMeasurementValue.relativeStartNs = strNextStringOrNull;
                            break;
                        }
                        break;
                    case "timestamp":
                        try {
                            dValueOf = objectReader.nextDoubleOrNull();
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            dValueOf = dateNextDateOrNull != null ? Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull)) : null;
                        }
                        if (dValueOf == null) {
                            break;
                        } else {
                            profileMeasurementValue.timestamp = dValueOf.doubleValue();
                            break;
                        }
                        break;
                    case "value":
                        Double dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        if (dNextDoubleOrNull == null) {
                            break;
                        } else {
                            profileMeasurementValue.value = dNextDoubleOrNull.doubleValue();
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            profileMeasurementValue.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileMeasurementValue;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String START_NS = "elapsed_since_start_ns";
        public static final String TIMESTAMP = "timestamp";
        public static final String VALUE = "value";
    }

    public ProfileMeasurementValue() {
        this(0L, 0, 0L);
    }

    private BigDecimal doubleToBigDecimal(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProfileMeasurementValue.class == obj.getClass()) {
            ProfileMeasurementValue profileMeasurementValue = (ProfileMeasurementValue) obj;
            if (Objects.equals(this.unknown, profileMeasurementValue.unknown) && this.relativeStartNs.equals(profileMeasurementValue.relativeStartNs) && this.value == profileMeasurementValue.value && this.timestamp == profileMeasurementValue.timestamp) {
                return true;
            }
        }
        return false;
    }

    public String getRelativeStartNs() {
        return this.relativeStartNs;
    }

    public double getTimestamp() {
        return this.timestamp;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.unknown, this.relativeStartNs, Double.valueOf(this.value));
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("value").value(iLogger, Double.valueOf(this.value));
        objectWriter.name(JsonKeys.START_NS).value(iLogger, this.relativeStartNs);
        objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(Double.valueOf(this.timestamp)));
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

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public ProfileMeasurementValue(Long l10, Number number, long j10) {
        this.relativeStartNs = l10.toString();
        this.value = number.doubleValue();
        this.timestamp = DateUtils.nanosToSeconds(j10);
    }
}
