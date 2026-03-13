package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RRWebInteractionMoveEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {
    private Map<String, Object> dataUnknown;
    private int pointerId;
    private List<Position> positions;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<RRWebInteractionMoveEvent> {
        private void deserializeData(RRWebInteractionMoveEvent rRWebInteractionMoveEvent, ObjectReader objectReader, ILogger iLogger) {
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("pointerId")) {
                    rRWebInteractionMoveEvent.pointerId = objectReader.nextInt();
                } else if (strNextName.equals(JsonKeys.POSITIONS)) {
                    rRWebInteractionMoveEvent.positions = objectReader.nextListOrNull(iLogger, new Position.Deserializer());
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setDataUnknown(map);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebInteractionMoveEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebInteractionMoveEvent rRWebInteractionMoveEvent = new RRWebInteractionMoveEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionMoveEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionMoveEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionMoveEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionMoveEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String POINTER_ID = "pointerId";
        public static final String POSITIONS = "positions";
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Position implements JsonSerializable, JsonUnknown {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private int f38806id;
        private long timeOffset;
        private Map<String, Object> unknown;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private float f38807x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f38808y;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Deserializer implements JsonDeserializer<Position> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public Position deserialize(ObjectReader objectReader, ILogger iLogger) {
                String strNextName;
                objectReader.beginObject();
                Position position = new Position();
                HashMap map = null;
                while (objectReader.peek() == JsonToken.NAME) {
                    strNextName = objectReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "x":
                            position.f38807x = objectReader.nextFloat();
                            break;
                        case "y":
                            position.f38808y = objectReader.nextFloat();
                            break;
                        case "id":
                            position.f38806id = objectReader.nextInt();
                            break;
                        case "timeOffset":
                            position.timeOffset = objectReader.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            objectReader.nextUnknown(iLogger, map, strNextName);
                            break;
                    }
                }
                position.setUnknown(map);
                objectReader.endObject();
                return position;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class JsonKeys {
            public static final String ID = "id";
            public static final String TIME_OFFSET = "timeOffset";

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            public static final String f38809X = "x";

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final String f38810Y = "y";
        }

        public int getId() {
            return this.f38806id;
        }

        public long getTimeOffset() {
            return this.timeOffset;
        }

        @Override // io.sentry.JsonUnknown
        public Map<String, Object> getUnknown() {
            return this.unknown;
        }

        public float getX() {
            return this.f38807x;
        }

        public float getY() {
            return this.f38808y;
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.beginObject();
            objectWriter.name("id").value(this.f38806id);
            objectWriter.name("x").value(this.f38807x);
            objectWriter.name("y").value(this.f38808y);
            objectWriter.name(JsonKeys.TIME_OFFSET).value(this.timeOffset);
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

        public void setId(int i10) {
            this.f38806id = i10;
        }

        public void setTimeOffset(long j10) {
            this.timeOffset = j10;
        }

        @Override // io.sentry.JsonUnknown
        public void setUnknown(Map<String, Object> map) {
            this.unknown = map;
        }

        public void setX(float f10) {
            this.f38807x = f10;
        }

        public void setY(float f10) {
            this.f38808y = f10;
        }
    }

    public RRWebInteractionMoveEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove);
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        List<Position> list = this.positions;
        if (list != null && !list.isEmpty()) {
            objectWriter.name(JsonKeys.POSITIONS).value(iLogger, this.positions);
        }
        objectWriter.name("pointerId").value(this.pointerId);
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

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public List<Position> getPositions() {
        return this.positions;
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

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setPointerId(int i10) {
        this.pointerId = i10;
    }

    public void setPositions(List<Position> list) {
        this.positions = list;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
