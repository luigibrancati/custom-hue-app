package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class UserFeedback implements JsonUnknown, JsonSerializable {
    private String comments;
    private String email;
    private final SentryId eventId;
    private String name;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<UserFeedback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public UserFeedback deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryId sentryIdDeserialize = null;
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "comments":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        break;
                    case "email":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "event_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
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
            if (sentryIdDeserialize != null) {
                UserFeedback userFeedback = new UserFeedback(sentryIdDeserialize, strNextStringOrNull, strNextStringOrNull2, strNextStringOrNull3);
                userFeedback.setUnknown(map);
                return userFeedback;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.log(SentryLevel.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String COMMENTS = "comments";
        public static final String EMAIL = "email";
        public static final String EVENT_ID = "event_id";
        public static final String NAME = "name";
    }

    public UserFeedback(SentryId sentryId) {
        this(sentryId, null, null, null);
    }

    public String getComments() {
        return this.comments;
    }

    public String getEmail() {
        return this.email;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public String getName() {
        return this.name;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("event_id");
        this.eventId.serialize(objectWriter, iLogger);
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.email != null) {
            objectWriter.name("email").value(this.email);
        }
        if (this.comments != null) {
            objectWriter.name(JsonKeys.COMMENTS).value(this.comments);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setComments(String str) {
        this.comments = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.eventId + ", name='" + this.name + "', email='" + this.email + "', comments='" + this.comments + "'}";
    }

    public UserFeedback(SentryId sentryId, String str, String str2, String str3) {
        this.eventId = sentryId;
        this.name = str;
        this.email = str2;
        this.comments = str3;
    }
}
