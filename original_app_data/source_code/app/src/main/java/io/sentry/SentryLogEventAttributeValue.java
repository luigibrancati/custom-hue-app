package io.sentry;

import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryLogEventAttributeValue implements JsonUnknown, JsonSerializable {
    private String type;
    private Map<String, Object> unknown;
    private Object value;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryLogEventAttributeValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryLogEventAttributeValue deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            String strNextStringOrNull = null;
            Object objNextObjectOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("type")) {
                    strNextStringOrNull = objectReader.nextStringOrNull();
                } else if (strNextName.equals("value")) {
                    objNextObjectOrNull = objectReader.nextObjectOrNull();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            if (strNextStringOrNull != null) {
                SentryLogEventAttributeValue sentryLogEventAttributeValue = new SentryLogEventAttributeValue(strNextStringOrNull, objNextObjectOrNull);
                sentryLogEventAttributeValue.setUnknown(map);
                return sentryLogEventAttributeValue;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String TYPE = "type";
        public static final String VALUE = "value";
    }

    public SentryLogEventAttributeValue(String str, Object obj) {
        this.type = str;
        if (obj == null || !str.equals("string")) {
            this.value = obj;
        } else {
            this.value = obj.toString();
        }
    }

    public String getType() {
        return this.type;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Object getValue() {
        return this.value;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("type").value(iLogger, this.type);
        objectWriter.name("value").value(iLogger, this.value);
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryLogEventAttributeValue(SentryAttributeType sentryAttributeType, Object obj) {
        this(sentryAttributeType.apiName(), obj);
    }
}
