package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryException implements JsonUnknown, JsonSerializable {
    private Mechanism mechanism;
    private String module;
    private SentryStackTrace stacktrace;
    private Long threadId;
    private String type;
    private Map<String, Object> unknown;
    private String value;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryException> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryException deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            SentryException sentryException = new SentryException();
            objectReader.beginObject();
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "thread_id":
                        sentryException.threadId = objectReader.nextLongOrNull();
                        break;
                    case "module":
                        sentryException.module = objectReader.nextStringOrNull();
                        break;
                    case "type":
                        sentryException.type = objectReader.nextStringOrNull();
                        break;
                    case "value":
                        sentryException.value = objectReader.nextStringOrNull();
                        break;
                    case "mechanism":
                        sentryException.mechanism = (Mechanism) objectReader.nextOrNull(iLogger, new Mechanism.Deserializer());
                        break;
                    case "stacktrace":
                        sentryException.stacktrace = (SentryStackTrace) objectReader.nextOrNull(iLogger, new SentryStackTrace.Deserializer());
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
            sentryException.setUnknown(map);
            return sentryException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String MECHANISM = "mechanism";
        public static final String MODULE = "module";
        public static final String STACKTRACE = "stacktrace";
        public static final String THREAD_ID = "thread_id";
        public static final String TYPE = "type";
        public static final String VALUE = "value";
    }

    public Mechanism getMechanism() {
        return this.mechanism;
    }

    public String getModule() {
        return this.module;
    }

    public SentryStackTrace getStacktrace() {
        return this.stacktrace;
    }

    public Long getThreadId() {
        return this.threadId;
    }

    public String getType() {
        return this.type;
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
        if (this.type != null) {
            objectWriter.name("type").value(this.type);
        }
        if (this.value != null) {
            objectWriter.name("value").value(this.value);
        }
        if (this.module != null) {
            objectWriter.name("module").value(this.module);
        }
        if (this.threadId != null) {
            objectWriter.name("thread_id").value(this.threadId);
        }
        if (this.stacktrace != null) {
            objectWriter.name("stacktrace").value(iLogger, this.stacktrace);
        }
        if (this.mechanism != null) {
            objectWriter.name(JsonKeys.MECHANISM).value(iLogger, this.mechanism);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setMechanism(Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setStacktrace(SentryStackTrace sentryStackTrace) {
        this.stacktrace = sentryStackTrace;
    }

    public void setThreadId(Long l10) {
        this.threadId = l10;
    }

    public void setType(String str) {
        this.type = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
