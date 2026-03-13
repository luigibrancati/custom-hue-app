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
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RRWebInteractionEvent extends RRWebIncrementalSnapshotEvent implements JsonSerializable, JsonUnknown {
    private static final int POINTER_TYPE_TOUCH = 2;
    private Map<String, Object> dataUnknown;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f38801id;
    private InteractionType interactionType;
    private int pointerId;
    private int pointerType;
    private Map<String, Object> unknown;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f38802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f38803y;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<RRWebInteractionEvent> {
        private void deserializeData(RRWebInteractionEvent rRWebInteractionEvent, ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            RRWebIncrementalSnapshotEvent.Deserializer deserializer = new RRWebIncrementalSnapshotEvent.Deserializer();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "x":
                        rRWebInteractionEvent.f38802x = objectReader.nextFloat();
                        break;
                    case "y":
                        rRWebInteractionEvent.f38803y = objectReader.nextFloat();
                        break;
                    case "id":
                        rRWebInteractionEvent.f38801id = objectReader.nextInt();
                        break;
                    case "type":
                        rRWebInteractionEvent.interactionType = (InteractionType) objectReader.nextOrNull(iLogger, new InteractionType.Deserializer());
                        break;
                    case "pointerType":
                        rRWebInteractionEvent.pointerType = objectReader.nextInt();
                        break;
                    case "pointerId":
                        rRWebInteractionEvent.pointerId = objectReader.nextInt();
                        break;
                    default:
                        if (!deserializer.deserializeValue(rRWebInteractionEvent, strNextName, objectReader, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            objectReader.nextUnknown(iLogger, map, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            rRWebInteractionEvent.setDataUnknown(map);
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebInteractionEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebInteractionEvent rRWebInteractionEvent = new RRWebInteractionEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebInteractionEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebInteractionEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebInteractionEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebInteractionEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum InteractionType implements JsonSerializable {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Deserializer implements JsonDeserializer<InteractionType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public InteractionType deserialize(ObjectReader objectReader, ILogger iLogger) {
                return InteractionType.values()[objectReader.nextInt()];
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String ID = "id";
        public static final String POINTER_ID = "pointerId";
        public static final String POINTER_TYPE = "pointerType";
        public static final String TYPE = "type";

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public static final String f38804X = "x";

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final String f38805Y = "y";
    }

    public RRWebInteractionEvent() {
        super(RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction);
        this.pointerType = 2;
    }

    private void serializeData(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        new RRWebIncrementalSnapshotEvent.Serializer().serialize(this, objectWriter, iLogger);
        objectWriter.name("type").value(iLogger, this.interactionType);
        objectWriter.name("id").value(this.f38801id);
        objectWriter.name("x").value(this.f38802x);
        objectWriter.name("y").value(this.f38803y);
        objectWriter.name(JsonKeys.POINTER_TYPE).value(this.pointerType);
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

    public int getId() {
        return this.f38801id;
    }

    public InteractionType getInteractionType() {
        return this.interactionType;
    }

    public int getPointerId() {
        return this.pointerId;
    }

    public int getPointerType() {
        return this.pointerType;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public float getX() {
        return this.f38802x;
    }

    public float getY() {
        return this.f38803y;
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

    public void setId(int i10) {
        this.f38801id = i10;
    }

    public void setInteractionType(InteractionType interactionType) {
        this.interactionType = interactionType;
    }

    public void setPointerId(int i10) {
        this.pointerId = i10;
    }

    public void setPointerType(int i10) {
        this.pointerType = i10;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setX(float f10) {
        this.f38802x = f10;
    }

    public void setY(float f10) {
        this.f38803y = f10;
    }
}
