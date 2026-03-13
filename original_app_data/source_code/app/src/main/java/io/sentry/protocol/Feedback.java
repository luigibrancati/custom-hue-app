package io.sentry.protocol;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Feedback implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "feedback";
    private SentryId associatedEventId;
    private String contactEmail;
    private String message;
    private String name;
    private SentryId replayId;
    private Map<String, Object> unknown;
    private String url;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<Feedback> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public Feedback deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            String strNextStringOrNull3 = null;
            SentryId sentryIdDeserialize = null;
            SentryId sentryIdDeserialize2 = null;
            String strNextStringOrNull4 = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "associated_event_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "replay_id":
                        sentryIdDeserialize2 = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        break;
                    case "url":
                        strNextStringOrNull4 = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        break;
                    case "contact_email":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        break;
                    case "message":
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
            if (strNextStringOrNull == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.log(SentryLevel.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            Feedback feedback = new Feedback(strNextStringOrNull);
            feedback.contactEmail = strNextStringOrNull2;
            feedback.name = strNextStringOrNull3;
            feedback.associatedEventId = sentryIdDeserialize;
            feedback.replayId = sentryIdDeserialize2;
            feedback.url = strNextStringOrNull4;
            feedback.unknown = map;
            return feedback;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String ASSOCIATED_EVENT_ID = "associated_event_id";
        public static final String CONTACT_EMAIL = "contact_email";
        public static final String MESSAGE = "message";
        public static final String NAME = "name";
        public static final String REPLAY_ID = "replay_id";
        public static final String URL = "url";
    }

    public Feedback(String str) {
        setMessage(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) obj;
        return Objects.equals(this.message, feedback.message) && Objects.equals(this.contactEmail, feedback.contactEmail) && Objects.equals(this.name, feedback.name) && Objects.equals(this.associatedEventId, feedback.associatedEventId) && Objects.equals(this.replayId, feedback.replayId) && Objects.equals(this.url, feedback.url) && Objects.equals(this.unknown, feedback.unknown);
    }

    public SentryId getAssociatedEventId() {
        return this.associatedEventId;
    }

    public String getContactEmail() {
        return this.contactEmail;
    }

    public String getMessage() {
        return this.message;
    }

    public String getName() {
        return this.name;
    }

    public SentryId getReplayId() {
        return this.replayId;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(this.message, this.contactEmail, this.name, this.associatedEventId, this.replayId, this.url, this.unknown);
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        objectWriter.name("message").value(this.message);
        if (this.contactEmail != null) {
            objectWriter.name(JsonKeys.CONTACT_EMAIL).value(this.contactEmail);
        }
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.associatedEventId != null) {
            objectWriter.name(JsonKeys.ASSOCIATED_EVENT_ID);
            this.associatedEventId.serialize(objectWriter, iLogger);
        }
        if (this.replayId != null) {
            objectWriter.name("replay_id");
            this.replayId.serialize(objectWriter, iLogger);
        }
        if (this.url != null) {
            objectWriter.name("url").value(this.url);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setAssociatedEventId(SentryId sentryId) {
        this.associatedEventId = sentryId;
    }

    public void setContactEmail(String str) {
        this.contactEmail = str;
    }

    public void setMessage(String str) {
        if (str.length() > 4096) {
            this.message = str.substring(0, RecognitionOptions.AZTEC);
        } else {
            this.message = str;
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReplayId(SentryId sentryId) {
        this.replayId = sentryId;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "Feedback{message='" + this.message + "', contactEmail='" + this.contactEmail + "', name='" + this.name + "', associatedEventId=" + this.associatedEventId + ", replayId=" + this.replayId + ", url='" + this.url + "', unknown=" + this.unknown + '}';
    }

    public Feedback(Feedback feedback) {
        this.message = feedback.message;
        this.contactEmail = feedback.contactEmail;
        this.name = feedback.name;
        this.associatedEventId = feedback.associatedEventId;
        this.replayId = feedback.replayId;
        this.url = feedback.url;
        this.unknown = CollectionUtils.newConcurrentHashMap(feedback.unknown);
    }
}
