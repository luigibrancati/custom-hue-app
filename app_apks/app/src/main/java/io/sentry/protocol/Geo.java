package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Geo implements JsonUnknown, JsonSerializable {
    private String city;
    private String countryCode;
    private String region;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<Geo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Geo deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Geo geo = new Geo();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "region":
                        geo.region = objectReader.nextStringOrNull();
                        break;
                    case "city":
                        geo.city = objectReader.nextStringOrNull();
                        break;
                    case "country_code":
                        geo.countryCode = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            geo.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return geo;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String CITY = "city";
        public static final String COUNTRY_CODE = "country_code";
        public static final String REGION = "region";
    }

    public Geo() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Geo fromMap(Map<String, Object> map) {
        Geo geo = new Geo();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            byte b10 = -1;
            switch (key.hashCode()) {
                case -934795532:
                    if (key.equals(JsonKeys.REGION)) {
                        b10 = 0;
                    }
                    break;
                case 3053931:
                    if (key.equals(JsonKeys.CITY)) {
                        b10 = 1;
                    }
                    break;
                case 1481071862:
                    if (key.equals(JsonKeys.COUNTRY_CODE)) {
                        b10 = 2;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    geo.region = value instanceof String ? (String) value : null;
                    break;
                case 1:
                    geo.city = value instanceof String ? (String) value : null;
                    break;
                case 2:
                    geo.countryCode = value instanceof String ? (String) value : null;
                    break;
            }
        }
        return geo;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getRegion() {
        return this.region;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.city != null) {
            objectWriter.name(JsonKeys.CITY).value(this.city);
        }
        if (this.countryCode != null) {
            objectWriter.name(JsonKeys.COUNTRY_CODE).value(this.countryCode);
        }
        if (this.region != null) {
            objectWriter.name(JsonKeys.REGION).value(this.region);
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

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public Geo(Geo geo) {
        this.city = geo.city;
        this.countryCode = geo.countryCode;
        this.region = geo.region;
    }
}
