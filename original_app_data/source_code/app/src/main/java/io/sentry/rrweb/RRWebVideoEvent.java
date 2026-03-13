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
public final class RRWebVideoEvent extends RRWebEvent implements JsonUnknown, JsonSerializable {
    public static final String EVENT_TAG = "video";
    public static final String REPLAY_CONTAINER = "mp4";
    public static final String REPLAY_ENCODING = "h264";
    public static final String REPLAY_FRAME_RATE_TYPE_CONSTANT = "constant";
    public static final String REPLAY_FRAME_RATE_TYPE_VARIABLE = "variable";
    private String container;
    private Map<String, Object> dataUnknown;
    private long durationMs;
    private String encoding;
    private int frameCount;
    private int frameRate;
    private String frameRateType;
    private int height;
    private int left;
    private Map<String, Object> payloadUnknown;
    private int segmentId;
    private long size;
    private String tag;
    private int top;
    private Map<String, Object> unknown;
    private int width;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<RRWebVideoEvent> {
        private void deserializeData(RRWebVideoEvent rRWebVideoEvent, ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebVideoEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebVideoEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebVideoEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void deserializePayload(RRWebVideoEvent rRWebVideoEvent, ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -1992012396:
                        if (strNextName.equals("duration")) {
                            b10 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strNextName.equals(JsonKeys.SEGMENT_ID)) {
                            b10 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strNextName.equals("height")) {
                            b10 = 2;
                        }
                        break;
                    case -410956671:
                        if (strNextName.equals(JsonKeys.CONTAINER)) {
                            b10 = 3;
                        }
                        break;
                    case -296512606:
                        if (strNextName.equals(JsonKeys.FRAME_COUNT)) {
                            b10 = 4;
                        }
                        break;
                    case 115029:
                        if (strNextName.equals(JsonKeys.TOP)) {
                            b10 = 5;
                        }
                        break;
                    case 3317767:
                        if (strNextName.equals(JsonKeys.LEFT)) {
                            b10 = 6;
                        }
                        break;
                    case 3530753:
                        if (strNextName.equals(JsonKeys.SIZE)) {
                            b10 = 7;
                        }
                        break;
                    case 113126854:
                        if (strNextName.equals("width")) {
                            b10 = 8;
                        }
                        break;
                    case 545057773:
                        if (strNextName.equals(JsonKeys.FRAME_RATE)) {
                            b10 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strNextName.equals(JsonKeys.ENCODING)) {
                            b10 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strNextName.equals(JsonKeys.FRAME_RATE_TYPE)) {
                            b10 = 11;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        rRWebVideoEvent.durationMs = objectReader.nextLong();
                        break;
                    case 1:
                        rRWebVideoEvent.segmentId = objectReader.nextInt();
                        break;
                    case 2:
                        Integer numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.height = numNextIntegerOrNull != null ? numNextIntegerOrNull.intValue() : 0;
                        break;
                    case 3:
                        String strNextStringOrNull = objectReader.nextStringOrNull();
                        rRWebVideoEvent.container = strNextStringOrNull != null ? strNextStringOrNull : "";
                        break;
                    case 4:
                        Integer numNextIntegerOrNull2 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.frameCount = numNextIntegerOrNull2 != null ? numNextIntegerOrNull2.intValue() : 0;
                        break;
                    case 5:
                        Integer numNextIntegerOrNull3 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.top = numNextIntegerOrNull3 != null ? numNextIntegerOrNull3.intValue() : 0;
                        break;
                    case 6:
                        Integer numNextIntegerOrNull4 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.left = numNextIntegerOrNull4 != null ? numNextIntegerOrNull4.intValue() : 0;
                        break;
                    case 7:
                        Long lNextLongOrNull = objectReader.nextLongOrNull();
                        rRWebVideoEvent.size = lNextLongOrNull == null ? 0L : lNextLongOrNull.longValue();
                        break;
                    case 8:
                        Integer numNextIntegerOrNull5 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.width = numNextIntegerOrNull5 != null ? numNextIntegerOrNull5.intValue() : 0;
                        break;
                    case 9:
                        Integer numNextIntegerOrNull6 = objectReader.nextIntegerOrNull();
                        rRWebVideoEvent.frameRate = numNextIntegerOrNull6 != null ? numNextIntegerOrNull6.intValue() : 0;
                        break;
                    case 10:
                        String strNextStringOrNull2 = objectReader.nextStringOrNull();
                        rRWebVideoEvent.encoding = strNextStringOrNull2 != null ? strNextStringOrNull2 : "";
                        break;
                    case 11:
                        String strNextStringOrNull3 = objectReader.nextStringOrNull();
                        rRWebVideoEvent.frameRateType = strNextStringOrNull3 != null ? strNextStringOrNull3 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            rRWebVideoEvent.setPayloadUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebVideoEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebVideoEvent rRWebVideoEvent = new RRWebVideoEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebVideoEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebVideoEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebVideoEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebVideoEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String CONTAINER = "container";
        public static final String DATA = "data";
        public static final String DURATION = "duration";
        public static final String ENCODING = "encoding";
        public static final String FRAME_COUNT = "frameCount";
        public static final String FRAME_RATE = "frameRate";
        public static final String FRAME_RATE_TYPE = "frameRateType";
        public static final String HEIGHT = "height";
        public static final String LEFT = "left";
        public static final String PAYLOAD = "payload";
        public static final String SEGMENT_ID = "segmentId";
        public static final String SIZE = "size";
        public static final String TOP = "top";
        public static final String WIDTH = "width";
    }

    public RRWebVideoEvent() {
        super(RRWebEventType.Custom);
        this.encoding = REPLAY_ENCODING;
        this.container = REPLAY_CONTAINER;
        this.frameRateType = REPLAY_FRAME_RATE_TYPE_CONSTANT;
        this.tag = "video";
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
        objectWriter.name(JsonKeys.SEGMENT_ID).value(this.segmentId);
        objectWriter.name(JsonKeys.SIZE).value(this.size);
        objectWriter.name("duration").value(this.durationMs);
        objectWriter.name(JsonKeys.ENCODING).value(this.encoding);
        objectWriter.name(JsonKeys.CONTAINER).value(this.container);
        objectWriter.name("height").value(this.height);
        objectWriter.name("width").value(this.width);
        objectWriter.name(JsonKeys.FRAME_COUNT).value(this.frameCount);
        objectWriter.name(JsonKeys.FRAME_RATE).value(this.frameRate);
        objectWriter.name(JsonKeys.FRAME_RATE_TYPE).value(this.frameRateType);
        objectWriter.name(JsonKeys.LEFT).value(this.left);
        objectWriter.name(JsonKeys.TOP).value(this.top);
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

    @Override // io.sentry.rrweb.RRWebEvent
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RRWebVideoEvent.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        RRWebVideoEvent rRWebVideoEvent = (RRWebVideoEvent) obj;
        return this.segmentId == rRWebVideoEvent.segmentId && this.size == rRWebVideoEvent.size && this.durationMs == rRWebVideoEvent.durationMs && this.height == rRWebVideoEvent.height && this.width == rRWebVideoEvent.width && this.frameCount == rRWebVideoEvent.frameCount && this.frameRate == rRWebVideoEvent.frameRate && this.left == rRWebVideoEvent.left && this.top == rRWebVideoEvent.top && Objects.equals(this.tag, rRWebVideoEvent.tag) && Objects.equals(this.encoding, rRWebVideoEvent.encoding) && Objects.equals(this.container, rRWebVideoEvent.container) && Objects.equals(this.frameRateType, rRWebVideoEvent.frameRateType);
    }

    public String getContainer() {
        return this.container;
    }

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public String getFrameRateType() {
        return this.frameRateType;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLeft() {
        return this.left;
    }

    public Map<String, Object> getPayloadUnknown() {
        return this.payloadUnknown;
    }

    public int getSegmentId() {
        return this.segmentId;
    }

    public long getSize() {
        return this.size;
    }

    public String getTag() {
        return this.tag;
    }

    public int getTop() {
        return this.top;
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
        return Objects.hash(Integer.valueOf(super.hashCode()), this.tag, Integer.valueOf(this.segmentId), Long.valueOf(this.size), Long.valueOf(this.durationMs), this.encoding, this.container, Integer.valueOf(this.height), Integer.valueOf(this.width), Integer.valueOf(this.frameCount), this.frameRateType, Integer.valueOf(this.frameRate), Integer.valueOf(this.left), Integer.valueOf(this.top));
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

    public void setContainer(String str) {
        this.container = str;
    }

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setDurationMs(long j10) {
        this.durationMs = j10;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    public void setFrameCount(int i10) {
        this.frameCount = i10;
    }

    public void setFrameRate(int i10) {
        this.frameRate = i10;
    }

    public void setFrameRateType(String str) {
        this.frameRateType = str;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setLeft(int i10) {
        this.left = i10;
    }

    public void setPayloadUnknown(Map<String, Object> map) {
        this.payloadUnknown = map;
    }

    public void setSegmentId(int i10) {
        this.segmentId = i10;
    }

    public void setSize(long j10) {
        this.size = j10;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTop(int i10) {
        this.top = i10;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }
}
