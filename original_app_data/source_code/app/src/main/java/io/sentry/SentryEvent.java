package io.sentry;

import io.sentry.SentryBaseEvent;
import io.sentry.SentryLevel;
import io.sentry.protocol.Message;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryThread;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryEvent extends SentryBaseEvent implements JsonUnknown, JsonSerializable {
    private SentryValues<SentryException> exception;
    private List<String> fingerprint;
    private SentryLevel level;
    private String logger;
    private Message message;
    private Map<String, String> modules;
    private SentryValues<SentryThread> threads;
    private Date timestamp;
    private String transaction;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryEvent deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryEvent sentryEvent = new SentryEvent();
            SentryBaseEvent.Deserializer deserializer = new SentryBaseEvent.Deserializer();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fingerprint":
                        List list = (List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            sentryEvent.fingerprint = list;
                            break;
                        }
                        break;
                    case "threads":
                        objectReader.beginObject();
                        objectReader.nextName();
                        sentryEvent.threads = new SentryValues(objectReader.nextListOrNull(iLogger, new SentryThread.Deserializer()));
                        objectReader.endObject();
                        break;
                    case "logger":
                        sentryEvent.logger = objectReader.nextStringOrNull();
                        break;
                    case "timestamp":
                        Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        if (dateNextDateOrNull == null) {
                            break;
                        } else {
                            sentryEvent.timestamp = dateNextDateOrNull;
                            break;
                        }
                        break;
                    case "level":
                        sentryEvent.level = (SentryLevel) objectReader.nextOrNull(iLogger, new SentryLevel.Deserializer());
                        break;
                    case "message":
                        sentryEvent.message = (Message) objectReader.nextOrNull(iLogger, new Message.Deserializer());
                        break;
                    case "modules":
                        sentryEvent.modules = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "exception":
                        objectReader.beginObject();
                        objectReader.nextName();
                        sentryEvent.exception = new SentryValues(objectReader.nextListOrNull(iLogger, new SentryException.Deserializer()));
                        objectReader.endObject();
                        break;
                    case "transaction":
                        sentryEvent.transaction = objectReader.nextStringOrNull();
                        break;
                    default:
                        if (!deserializer.deserializeValue(sentryEvent, strNextName, objectReader, iLogger)) {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            sentryEvent.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return sentryEvent;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String EXCEPTION = "exception";
        public static final String FINGERPRINT = "fingerprint";
        public static final String LEVEL = "level";
        public static final String LOGGER = "logger";
        public static final String MESSAGE = "message";
        public static final String MODULES = "modules";
        public static final String THREADS = "threads";
        public static final String TIMESTAMP = "timestamp";
        public static final String TRANSACTION = "transaction";
    }

    public SentryEvent(SentryId sentryId, Date date) {
        super(sentryId);
        this.timestamp = date;
    }

    public List<SentryException> getExceptions() {
        SentryValues<SentryException> sentryValues = this.exception;
        if (sentryValues == null) {
            return null;
        }
        return sentryValues.getValues();
    }

    public List<String> getFingerprints() {
        return this.fingerprint;
    }

    public SentryLevel getLevel() {
        return this.level;
    }

    public String getLogger() {
        return this.logger;
    }

    public Message getMessage() {
        return this.message;
    }

    public String getModule(String str) {
        Map<String, String> map = this.modules;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public Map<String, String> getModules() {
        return this.modules;
    }

    public List<SentryThread> getThreads() {
        SentryValues<SentryThread> sentryValues = this.threads;
        if (sentryValues != null) {
            return sentryValues.getValues();
        }
        return null;
    }

    public Date getTimestamp() {
        return (Date) this.timestamp.clone();
    }

    public String getTransaction() {
        return this.transaction;
    }

    public SentryException getUnhandledException() {
        SentryValues<SentryException> sentryValues = this.exception;
        if (sentryValues == null) {
            return null;
        }
        for (SentryException sentryException : sentryValues.getValues()) {
            if (sentryException.getMechanism() != null && sentryException.getMechanism().isHandled() != null && !sentryException.getMechanism().isHandled().booleanValue()) {
                return sentryException;
            }
        }
        return null;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public boolean isCrashed() {
        return getUnhandledException() != null;
    }

    public boolean isErrored() {
        SentryValues<SentryException> sentryValues = this.exception;
        return (sentryValues == null || sentryValues.getValues().isEmpty()) ? false : true;
    }

    public void removeModule(String str) {
        Map<String, String> map = this.modules;
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("timestamp").value(iLogger, this.timestamp);
        if (this.message != null) {
            objectWriter.name("message").value(iLogger, this.message);
        }
        if (this.logger != null) {
            objectWriter.name(JsonKeys.LOGGER).value(this.logger);
        }
        SentryValues<SentryThread> sentryValues = this.threads;
        if (sentryValues != null && !sentryValues.getValues().isEmpty()) {
            objectWriter.name(JsonKeys.THREADS);
            objectWriter.beginObject();
            objectWriter.name("values").value(iLogger, this.threads.getValues());
            objectWriter.endObject();
        }
        SentryValues<SentryException> sentryValues2 = this.exception;
        if (sentryValues2 != null && !sentryValues2.getValues().isEmpty()) {
            objectWriter.name("exception");
            objectWriter.beginObject();
            objectWriter.name("values").value(iLogger, this.exception.getValues());
            objectWriter.endObject();
        }
        if (this.level != null) {
            objectWriter.name("level").value(iLogger, this.level);
        }
        if (this.transaction != null) {
            objectWriter.name("transaction").value(this.transaction);
        }
        if (this.fingerprint != null) {
            objectWriter.name(JsonKeys.FINGERPRINT).value(iLogger, this.fingerprint);
        }
        if (this.modules != null) {
            objectWriter.name(JsonKeys.MODULES).value(iLogger, this.modules);
        }
        new SentryBaseEvent.Serializer().serialize(this, objectWriter, iLogger);
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

    public void setExceptions(List<SentryException> list) {
        this.exception = new SentryValues<>(list);
    }

    public void setFingerprints(List<String> list) {
        this.fingerprint = list != null ? new ArrayList(list) : null;
    }

    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
    }

    public void setLogger(String str) {
        this.logger = str;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setModule(String str, String str2) {
        if (this.modules == null) {
            this.modules = new HashMap();
        }
        this.modules.put(str, str2);
    }

    public void setModules(Map<String, String> map) {
        this.modules = CollectionUtils.newHashMap(map);
    }

    public void setThreads(List<SentryThread> list) {
        this.threads = new SentryValues<>(list);
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public void setTransaction(String str) {
        this.transaction = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryEvent(Throwable th) {
        this();
        this.throwable = th;
    }

    public SentryEvent() {
        this(new SentryId(), DateUtils.getCurrentDateTime());
    }

    public SentryEvent(Date date) {
        this(new SentryId(), date);
    }
}
