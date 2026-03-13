package io.sentry;

import io.sentry.TraceContext;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelopeHeader implements JsonSerializable, JsonUnknown {
    private final SentryId eventId;
    private final SdkVersion sdkVersion;
    private Date sentAt;
    private final TraceContext traceContext;
    private Map<String, Object> unknown;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryEnvelopeHeader> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryEnvelopeHeader deserialize(ObjectReader objectReader, ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            SentryId sentryId = null;
            SdkVersion sdkVersion = null;
            TraceContext traceContext = null;
            Date dateNextDateOrNull = null;
            HashMap map = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "sdk":
                        sdkVersion = (SdkVersion) objectReader.nextOrNull(iLogger, new SdkVersion.Deserializer());
                        break;
                    case "trace":
                        traceContext = (TraceContext) objectReader.nextOrNull(iLogger, new TraceContext.Deserializer());
                        break;
                    case "event_id":
                        sentryId = (SentryId) objectReader.nextOrNull(iLogger, new SentryId.Deserializer());
                        break;
                    case "sent_at":
                        dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        objectReader.nextUnknown(iLogger, map, strNextName);
                        break;
                }
            }
            SentryEnvelopeHeader sentryEnvelopeHeader = new SentryEnvelopeHeader(sentryId, sdkVersion, traceContext);
            sentryEnvelopeHeader.setSentAt(dateNextDateOrNull);
            sentryEnvelopeHeader.setUnknown(map);
            objectReader.endObject();
            return sentryEnvelopeHeader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String EVENT_ID = "event_id";
        public static final String SDK = "sdk";
        public static final String SENT_AT = "sent_at";
        public static final String TRACE = "trace";
    }

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion) {
        this(sentryId, sdkVersion, null);
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public Date getSentAt() {
        return this.sentAt;
    }

    public TraceContext getTraceContext() {
        return this.traceContext;
    }

    @Override // io.sentry.JsonUnknown
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.beginObject();
        if (this.eventId != null) {
            objectWriter.name("event_id").value(iLogger, this.eventId);
        }
        if (this.sdkVersion != null) {
            objectWriter.name("sdk").value(iLogger, this.sdkVersion);
        }
        if (this.traceContext != null) {
            objectWriter.name("trace").value(iLogger, this.traceContext);
        }
        if (this.sentAt != null) {
            objectWriter.name(JsonKeys.SENT_AT).value(iLogger, DateUtils.getTimestamp(this.sentAt));
        }
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

    public void setSentAt(Date date) {
        this.sentAt = date;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public SentryEnvelopeHeader(SentryId sentryId, SdkVersion sdkVersion, TraceContext traceContext) {
        this.eventId = sentryId;
        this.sdkVersion = sdkVersion;
        this.traceContext = traceContext;
    }

    public SentryEnvelopeHeader(SentryId sentryId) {
        this(sentryId, null);
    }

    public SentryEnvelopeHeader() {
        this(new SentryId());
    }
}
