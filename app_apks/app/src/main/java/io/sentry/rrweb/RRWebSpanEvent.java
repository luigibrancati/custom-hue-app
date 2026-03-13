package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RRWebSpanEvent extends RRWebEvent implements JsonSerializable, JsonUnknown {
    public static final String EVENT_TAG = "performanceSpan";
    private Map<String, Object> data;
    private Map<String, Object> dataUnknown;
    private String description;
    private double endTimestamp;
    private String op;
    private Map<String, Object> payloadUnknown;
    private double startTimestamp;
    private String tag;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<RRWebSpanEvent> {
        private void deserializeData(RRWebSpanEvent rRWebSpanEvent, ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebSpanEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebSpanEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebSpanEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(RRWebSpanEvent rRWebSpanEvent, ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "description":
                        rRWebSpanEvent.description = objectReader.nextStringOrNull();
                        break;
                    case "endTimestamp":
                        rRWebSpanEvent.endTimestamp = objectReader.nextDouble();
                        break;
                    case "startTimestamp":
                        rRWebSpanEvent.startTimestamp = objectReader.nextDouble();
                        break;
                    case "op":
                        rRWebSpanEvent.op = objectReader.nextStringOrNull();
                        break;
                    case "data":
                        Map mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        if (mapNewConcurrentHashMap == null) {
                            break;
                        } else {
                            rRWebSpanEvent.data = mapNewConcurrentHashMap;
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
            rRWebSpanEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebSpanEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebSpanEvent rRWebSpanEvent = new RRWebSpanEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebSpanEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebSpanEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebSpanEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebSpanEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String DESCRIPTION = "description";
        public static final String END_TIMESTAMP = "endTimestamp";
        public static final String OP = "op";
        public static final String PAYLOAD = "payload";
        public static final String START_TIMESTAMP = "startTimestamp";
    }

    public RRWebSpanEvent() {
        super(RRWebEventType.Custom);
        this.tag = EVENT_TAG;
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("tag").value(this.tag);
        objectWriter.name("payload");
        serializePayload(objectWriter, iLogger);
        Map<String, Object> map = this.dataUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.dataUnknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    private void serializePayload(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.op != null) {
            objectWriter.name("op").value(this.op);
        }
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        objectWriter.name(JsonKeys.START_TIMESTAMP).value(iLogger, BigDecimal.valueOf(this.startTimestamp));
        objectWriter.name(JsonKeys.END_TIMESTAMP).value(iLogger, BigDecimal.valueOf(this.endTimestamp));
        if (this.data != null) {
            objectWriter.name("data").value(iLogger, this.data);
        }
        Map<String, Object> map = this.payloadUnknown;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.payloadUnknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public String getDescription() {
        return this.description;
    }

    public double getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getOp() {
        return this.op;
    }

    public Map<String, Object> getPayloadUnknown() {
        return this.payloadUnknown;
    }

    public double getStartTimestamp() {
        return this.startTimestamp;
    }

    public String getTag() {
        return this.tag;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("data");
        serializeData(objectWriter, iLogger);
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
        this.data = map == null ? null : new ConcurrentHashMap(map);
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setEndTimestamp(double d10) {
        this.endTimestamp = d10;
    }

    public void setOp(String str) {
        this.op = str;
    }

    public void setPayloadUnknown(Map<String, Object> map) {
        this.payloadUnknown = map;
    }

    public void setStartTimestamp(double d10) {
        this.startTimestamp = d10;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
