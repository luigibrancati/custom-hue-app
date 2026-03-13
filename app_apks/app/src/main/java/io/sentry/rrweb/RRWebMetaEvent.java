package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RRWebMetaEvent extends RRWebEvent implements JsonUnknown, JsonSerializable {
    private Map<String, Object> dataUnknown;
    private int height;
    private String href;
    private Map<String, Object> unknown;
    private int width;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<RRWebMetaEvent> {
        private void deserializeData(RRWebMetaEvent rRWebMetaEvent, ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "height":
                        Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        rRWebMetaEvent.height = numNextIntegerOrNull != null ? numNextIntegerOrNull.intValue() : 0;
                        break;
                    case "href":
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        if (strNextStringOrNull == null) {
                            strNextStringOrNull = "";
                        }
                        rRWebMetaEvent.href = strNextStringOrNull;
                        break;
                    case "width":
                        Integer numNextIntegerOrNull2 = objectReader.nextIntegerOrNull();
                        rRWebMetaEvent.width = numNextIntegerOrNull2 != null ? numNextIntegerOrNull2.intValue() : 0;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rRWebMetaEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebMetaEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebMetaEvent rRWebMetaEvent = new RRWebMetaEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebMetaEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebMetaEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebMetaEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebMetaEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String HEIGHT = "height";
        public static final String HREF = "href";
        public static final String WIDTH = "width";
    }

    public RRWebMetaEvent() {
        super(RRWebEventType.Meta);
        this.href = "";
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.HREF).value(this.href);
        objectWriter.name("height").value(this.height);
        objectWriter.name("width").value(this.width);
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

    @Override // io.sentry.rrweb.RRWebEvent
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RRWebMetaEvent.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        RRWebMetaEvent rRWebMetaEvent = (RRWebMetaEvent) obj;
        return this.height == rRWebMetaEvent.height && this.width == rRWebMetaEvent.width && Objects.equals(this.href, rRWebMetaEvent.href);
    }

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public int getHeight() {
        return this.height;
    }

    public String getHref() {
        return this.href;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // io.sentry.rrweb.RRWebEvent
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.href, Integer.valueOf(this.height), Integer.valueOf(this.width));
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
        objectWriter.endObject();
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setHref(String str) {
        this.href = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }
}
