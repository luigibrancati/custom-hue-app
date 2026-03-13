package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.ScreenshotStrategyType;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RRWebOptionsEvent extends RRWebEvent implements JsonSerializable, JsonUnknown {
    public static final String EVENT_TAG = "options";
    private Map<String, Object> dataUnknown;
    private Map<String, Object> optionsPayload;
    private String tag;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<RRWebOptionsEvent> {
        private void deserializeData(RRWebOptionsEvent rRWebOptionsEvent, ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("payload")) {
                    deserializePayload(rRWebOptionsEvent, objectReader, iLogger);
                } else if (strNextName.equals("tag")) {
                    String strNextStringOrNull = objectReader.nextStringOrNull();
                    if (strNextStringOrNull == null) {
                        strNextStringOrNull = "";
                    }
                    rRWebOptionsEvent.tag = strNextStringOrNull;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                }
            }
            rRWebOptionsEvent.setDataUnknown(concurrentHashMap);
            objectReader.endObject();
        }

        private void deserializePayload(RRWebOptionsEvent rRWebOptionsEvent, ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                if (map == null) {
                    map = new HashMap();
                }
                objectReader.nextUnknown(iLogger, map, strNextName);
            }
            if (map != null) {
                rRWebOptionsEvent.setOptionsPayload(map);
            }
            objectReader.endObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public RRWebOptionsEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            objectReader.beginObject();
            RRWebOptionsEvent rRWebOptionsEvent = new RRWebOptionsEvent();
            RRWebEvent.Deserializer deserializer = new RRWebEvent.Deserializer();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                String strNextName = objectReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("data")) {
                    deserializeData(rRWebOptionsEvent, objectReader, iLogger);
                } else if (!deserializer.deserializeValue(rRWebOptionsEvent, strNextName, objectReader, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    objectReader.nextUnknown(iLogger, map, strNextName);
                }
            }
            rRWebOptionsEvent.setUnknown(map);
            objectReader.endObject();
            return rRWebOptionsEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String DATA = "data";
        public static final String PAYLOAD = "payload";
    }

    public RRWebOptionsEvent() {
        super(RRWebEventType.Custom);
        this.optionsPayload = new HashMap();
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
        Map<String, Object> map = this.optionsPayload;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.optionsPayload.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    public Map<String, Object> getDataUnknown() {
        return this.dataUnknown;
    }

    public Map<String, Object> getOptionsPayload() {
        return this.optionsPayload;
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

    public void setDataUnknown(Map<String, Object> map) {
        this.dataUnknown = map;
    }

    public void setOptionsPayload(Map<String, Object> map) {
        this.optionsPayload = map;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public RRWebOptionsEvent(SentryOptions sentryOptions) {
        String str;
        this();
        SdkVersion sdkVersion = sentryOptions.getSdkVersion();
        if (sdkVersion != null) {
            this.optionsPayload.put("nativeSdkName", sdkVersion.getName());
            this.optionsPayload.put("nativeSdkVersion", sdkVersion.getVersion());
        }
        SentryReplayOptions sessionReplay = sentryOptions.getSessionReplay();
        this.optionsPayload.put("errorSampleRate", sessionReplay.getOnErrorSampleRate());
        this.optionsPayload.put("sessionSampleRate", sessionReplay.getSessionSampleRate());
        this.optionsPayload.put("maskAllImages", Boolean.valueOf(sessionReplay.getMaskViewClasses().contains(SentryReplayOptions.IMAGE_VIEW_CLASS_NAME)));
        this.optionsPayload.put("maskAllText", Boolean.valueOf(sessionReplay.getMaskViewClasses().contains(SentryReplayOptions.TEXT_VIEW_CLASS_NAME)));
        this.optionsPayload.put("quality", sessionReplay.getQuality().serializedName());
        this.optionsPayload.put("maskedViewClasses", sessionReplay.getMaskViewClasses());
        this.optionsPayload.put("unmaskedViewClasses", sessionReplay.getUnmaskViewClasses());
        if (sessionReplay.getScreenshotStrategy() == ScreenshotStrategyType.PIXEL_COPY) {
            str = "pixelCopy";
        } else {
            str = "canvas";
        }
        this.optionsPayload.put("screenshotStrategy", str);
        this.optionsPayload.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.getNetworkDetailAllowUrls().isEmpty()));
        if (sessionReplay.getNetworkDetailAllowUrls().isEmpty()) {
            return;
        }
        this.optionsPayload.put("networkDetailAllowUrls", sessionReplay.getNetworkDetailAllowUrls());
        this.optionsPayload.put("networkRequestHeaders", sessionReplay.getNetworkRequestHeaders());
        this.optionsPayload.put("networkResponseHeaders", sessionReplay.getNetworkResponseHeaders());
        this.optionsPayload.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.isNetworkCaptureBodies()));
        if (sessionReplay.getNetworkDetailDenyUrls().isEmpty()) {
            return;
        }
        this.optionsPayload.put("networkDetailDenyUrls", sessionReplay.getNetworkDetailDenyUrls());
    }
}
