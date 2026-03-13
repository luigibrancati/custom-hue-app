package io.sentry;

import io.sentry.MonitorConfig;
import io.sentry.MonitorContexts;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class CheckIn implements JsonUnknown, JsonSerializable {
    private final SentryId checkInId;
    private final MonitorContexts contexts;
    private Double duration;
    private String environment;
    private MonitorConfig monitorConfig;
    private String monitorSlug;
    private String release;
    private String status;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<CheckIn> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public CheckIn deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryId sentryIdDeserialize = null;
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            HashMap map = null;
            Double dNextDoubleOrNull = null;
            String strNextStringOrNull3 = null;
            String strNextStringOrNull4 = null;
            MonitorConfig monitorConfigDeserialize = null;
            MonitorContexts monitorContextsDeserialize = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "monitor_config":
                        monitorConfigDeserialize = new MonitorConfig.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "duration":
                        dNextDoubleOrNull = objectReader.nextDoubleOrNull();
                        break;
                    case "status":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "contexts":
                        monitorContextsDeserialize = new MonitorContexts.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "environment":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    case "release":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "check_in_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "monitor_slug":
                        strNextStringOrNull = objectReader.nextStringOrNull();
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
            if (sentryIdDeserialize == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"check_in_id\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"check_in_id\"", illegalStateException);
                throw illegalStateException;
            }
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"monitor_slug\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"monitor_slug\"", illegalStateException2);
                throw illegalStateException2;
            }
            if (strNextStringOrNull2 == null) {
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"status\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"status\"", illegalStateException3);
                throw illegalStateException3;
            }
            CheckIn checkIn = new CheckIn(sentryIdDeserialize, strNextStringOrNull, strNextStringOrNull2);
            checkIn.setDuration(dNextDoubleOrNull);
            checkIn.setRelease(strNextStringOrNull3);
            checkIn.setEnvironment(strNextStringOrNull4);
            checkIn.setMonitorConfig(monitorConfigDeserialize);
            checkIn.getContexts().putAll(monitorContextsDeserialize);
            checkIn.setUnknown(map);
            return checkIn;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String CHECK_IN_ID = "check_in_id";
        public static final String CONTEXTS = "contexts";
        public static final String DURATION = "duration";
        public static final String ENVIRONMENT = "environment";
        public static final String MONITOR_CONFIG = "monitor_config";
        public static final String MONITOR_SLUG = "monitor_slug";
        public static final String RELEASE = "release";
        public static final String STATUS = "status";
    }

    public CheckIn(String str, CheckInStatus checkInStatus) {
        this((SentryId) null, str, checkInStatus.apiName());
    }

    public SentryId getCheckInId() {
        return this.checkInId;
    }

    public MonitorContexts getContexts() {
        return this.contexts;
    }

    public Double getDuration() {
        return this.duration;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public MonitorConfig getMonitorConfig() {
        return this.monitorConfig;
    }

    public String getMonitorSlug() {
        return this.monitorSlug;
    }

    public String getRelease() {
        return this.release;
    }

    public String getStatus() {
        return this.status;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name(JsonKeys.CHECK_IN_ID);
        this.checkInId.serialize(objectWriter, iLogger);
        objectWriter.name(JsonKeys.MONITOR_SLUG).value(this.monitorSlug);
        objectWriter.name("status").value(this.status);
        if (this.duration != null) {
            objectWriter.name("duration").value(this.duration);
        }
        if (this.release != null) {
            objectWriter.name("release").value(this.release);
        }
        if (this.environment != null) {
            objectWriter.name("environment").value(this.environment);
        }
        if (this.monitorConfig != null) {
            objectWriter.name(JsonKeys.MONITOR_CONFIG);
            this.monitorConfig.serialize(objectWriter, iLogger);
        }
        if (this.contexts != null) {
            objectWriter.name("contexts");
            this.contexts.serialize(objectWriter, iLogger);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setDuration(Double d10) {
        this.duration = d10;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setMonitorConfig(MonitorConfig monitorConfig) {
        this.monitorConfig = monitorConfig;
    }

    public void setMonitorSlug(String str) {
        this.monitorSlug = str;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public CheckIn(SentryId sentryId, String str, CheckInStatus checkInStatus) {
        this(sentryId, str, checkInStatus.apiName());
    }

    public void setStatus(CheckInStatus checkInStatus) {
        this.status = checkInStatus.apiName();
    }

    public CheckIn(SentryId sentryId, String str, String str2) {
        this.contexts = new MonitorContexts();
        this.checkInId = sentryId == null ? new SentryId() : sentryId;
        this.monitorSlug = str;
        this.status = str2;
    }
}
