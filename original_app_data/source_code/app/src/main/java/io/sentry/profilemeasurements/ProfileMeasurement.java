package io.sentry.profilemeasurements;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ProfileMeasurement implements JsonUnknown, JsonSerializable {
    public static final String ID_CPU_USAGE = "cpu_usage";
    public static final String ID_FROZEN_FRAME_RENDERS = "frozen_frame_renders";
    public static final String ID_MEMORY_FOOTPRINT = "memory_footprint";
    public static final String ID_MEMORY_NATIVE_FOOTPRINT = "memory_native_footprint";
    public static final String ID_SCREEN_FRAME_RATES = "screen_frame_rates";
    public static final String ID_SLOW_FRAME_RENDERS = "slow_frame_renders";
    public static final String ID_UNKNOWN = "unknown";
    public static final String UNIT_BYTES = "byte";
    public static final String UNIT_HZ = "hz";
    public static final String UNIT_NANOSECONDS = "nanosecond";
    public static final String UNIT_PERCENT = "percent";
    public static final String UNIT_UNKNOWN = "unknown";
    private String unit;
    private Map<String, Object> unknown;
    private Collection<ProfileMeasurementValue> values;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<ProfileMeasurement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ProfileMeasurement deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ProfileMeasurement profileMeasurement = new ProfileMeasurement();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("values")) {
                    List listNextListOrNull = objectReader.nextListOrNull(iLogger, new ProfileMeasurementValue.Deserializer());
                    if (listNextListOrNull != null) {
                        profileMeasurement.values = listNextListOrNull;
                    }
                } else if (strNextName.equals("unit")) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull != null) {
                        profileMeasurement.unit = strNextStringOrNull;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            profileMeasurement.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return profileMeasurement;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String UNIT = "unit";
        public static final String VALUES = "values";
    }

    public ProfileMeasurement() {
        this("unknown", new ArrayList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProfileMeasurement.class == obj.getClass()) {
            ProfileMeasurement profileMeasurement = (ProfileMeasurement) obj;
            if (Objects.equals(this.unknown, profileMeasurement.unknown) && this.unit.equals(profileMeasurement.unit) && new ArrayList(this.values).equals(new ArrayList(profileMeasurement.values))) {
                return true;
            }
        }
        return false;
    }

    public String getUnit() {
        return this.unit;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Collection<ProfileMeasurementValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        return Objects.hash(this.unknown, this.unit, this.values);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("unit").value(iLogger, this.unit);
        objectWriter.name("values").value(iLogger, this.values);
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

    public void setUnit(String str) {
        this.unit = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setValues(Collection<ProfileMeasurementValue> collection) {
        this.values = collection;
    }

    public ProfileMeasurement(String str, Collection<ProfileMeasurementValue> collection) {
        this.unit = str;
        this.values = collection;
    }
}
