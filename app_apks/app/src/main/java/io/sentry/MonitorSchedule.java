package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class MonitorSchedule implements JsonUnknown, JsonSerializable {
    private String type;
    private String unit;
    private Map<String, Object> unknown;
    private String value;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<MonitorSchedule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public MonitorSchedule deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "type":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "unit":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "value":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
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
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextStringOrNull2 != null) {
                MonitorSchedule monitorSchedule = new MonitorSchedule(strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3);
                monitorSchedule.setUnknown(map);
                return monitorSchedule;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"value\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String TYPE = "type";
        public static final String UNIT = "unit";
        public static final String VALUE = "value";
    }

    public MonitorSchedule(String str, String str2, String str3) {
        this.type = str;
        this.value = str2;
        this.unit = str3;
    }

    public static MonitorSchedule crontab(String str) {
        return new MonitorSchedule(MonitorScheduleType.CRONTAB.apiName(), str, null);
    }

    public static MonitorSchedule interval(Integer num, MonitorScheduleUnit monitorScheduleUnit) {
        return new MonitorSchedule(MonitorScheduleType.INTERVAL.apiName(), num.toString(), monitorScheduleUnit.apiName());
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

    public String getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(this.type);
        if (MonitorScheduleType.INTERVAL.apiName().equalsIgnoreCase(this.type)) {
            try {
                objectWriter.name("value").value(Integer.valueOf(this.value));
            } catch (Throwable unused) {
                iLogger.log(SentryLevel.ERROR, "Unable to serialize monitor schedule value: %s", this.value);
            }
        } else {
            objectWriter.name("value").value(this.value);
        }
        if (this.unit != null) {
            objectWriter.name("unit").value(this.unit);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
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

    public void setValue(String str) {
        this.value = str;
    }

    public void setUnit(MonitorScheduleUnit monitorScheduleUnit) {
        this.unit = monitorScheduleUnit == null ? null : monitorScheduleUnit.apiName();
    }

    public void setValue(Integer num) {
        this.value = num.toString();
    }
}
