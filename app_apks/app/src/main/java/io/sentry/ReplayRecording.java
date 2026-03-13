package io.sentry;

import io.sentry.rrweb.RRWebBreadcrumbEvent;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebInteractionEvent;
import io.sentry.rrweb.RRWebInteractionMoveEvent;
import io.sentry.rrweb.RRWebMetaEvent;
import io.sentry.rrweb.RRWebSpanEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.MapObjectReader;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ReplayRecording implements JsonUnknown, JsonSerializable {
    private List<? extends RRWebEvent> payload;
    private Integer segmentId;
    private Map<String, Object> unknown;

    /* JADX INFO: renamed from: io.sentry.ReplayRecording$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$rrweb$RRWebEventType;
        static final /* synthetic */ int[] $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource;

        static {
            int[] iArr = new int[RRWebEventType.values().length];
            $SwitchMap$io$sentry$rrweb$RRWebEventType = iArr;
            try {
                iArr[RRWebEventType.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[RRWebEventType.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebEventType[RRWebEventType.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RRWebIncrementalSnapshotEvent.IncrementalSource.values().length];
            $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource = iArr2;
            try {
                iArr2[RRWebIncrementalSnapshotEvent.IncrementalSource.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource[RRWebIncrementalSnapshotEvent.IncrementalSource.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<ReplayRecording> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public ReplayRecording deserialize(ObjectReader objectReader, ILogger iLogger) {
            ReplayRecording replayRecording = new ReplayRecording();
            objectReader.beginObject();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numNextIntegerOrNull = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("segment_id")) {
                    numNextIntegerOrNull = objectReader.nextIntegerOrNull();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            objectReader.endObject();
            objectReader.setLenient(true);
            List list = (List) objectReader.nextObjectOrNull();
            objectReader.setLenient(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        MapObjectReader mapObjectReader = new MapObjectReader(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                RRWebEventType rRWebEventType = RRWebEventType.values()[((Integer) value).intValue()];
                                int i10 = AnonymousClass1.$SwitchMap$io$sentry$rrweb$RRWebEventType[rRWebEventType.ordinal()];
                                if (i10 == 1) {
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        RRWebIncrementalSnapshotEvent.IncrementalSource incrementalSource = RRWebIncrementalSnapshotEvent.IncrementalSource.values()[num.intValue()];
                                        int i11 = AnonymousClass1.$SwitchMap$io$sentry$rrweb$RRWebIncrementalSnapshotEvent$IncrementalSource[incrementalSource.ordinal()];
                                        if (i11 == 1) {
                                            arrayList.add(new RRWebInteractionEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                        } else if (i11 != 2) {
                                            iLogger.log(SentryLevel.DEBUG, "Unsupported rrweb incremental snapshot type %s", incrementalSource);
                                        } else {
                                            arrayList.add(new RRWebInteractionMoveEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                        }
                                    }
                                } else if (i10 == 2) {
                                    arrayList.add(new RRWebMetaEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                } else if (i10 != 3) {
                                    iLogger.log(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                } else {
                                    Map map4 = (Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(new RRWebSpanEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(new RRWebVideoEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(new RRWebBreadcrumbEvent.Deserializer().deserialize((ObjectReader) mapObjectReader, iLogger));
                                                break;
                                            default:
                                                iLogger.log(SentryLevel.DEBUG, "Unsupported rrweb event type %s", rRWebEventType);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            replayRecording.setSegmentId(numNextIntegerOrNull);
            replayRecording.setPayload(arrayList);
            replayRecording.setUnknown(map);
            return replayRecording;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String SEGMENT_ID = "segment_id";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ReplayRecording.class == obj.getClass()) {
            ReplayRecording replayRecording = (ReplayRecording) obj;
            if (Objects.equals(this.segmentId, replayRecording.segmentId) && Objects.equals(this.payload, replayRecording.payload)) {
                return true;
            }
        }
        return false;
    }

    public List<? extends RRWebEvent> getPayload() {
        return this.payload;
    }

    public Integer getSegmentId() {
        return this.segmentId;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        return Objects.hash(this.segmentId, this.payload);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.segmentId != null) {
            objectWriter.name("segment_id").value(this.segmentId);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
        objectWriter.setLenient(true);
        if (this.segmentId != null) {
            objectWriter.jsonValue("\n");
        }
        List<? extends RRWebEvent> list = this.payload;
        if (list != null) {
            objectWriter.value(iLogger, list);
        }
        objectWriter.setLenient(false);
    }

    public void setPayload(List<? extends RRWebEvent> list) {
        this.payload = list;
    }

    public void setSegmentId(Integer num) {
        this.segmentId = num;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }
}
