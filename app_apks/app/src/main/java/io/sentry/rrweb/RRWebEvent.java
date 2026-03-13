package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RRWebEvent {
    private long timestamp;
    private RRWebEventType type;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer {
        public boolean deserializeValue(RRWebEvent rRWebEvent, String str, ObjectReader objectReader, ILogger iLogger) {
            str.getClass();
            if (str.equals("type")) {
                rRWebEvent.type = (RRWebEventType) Objects.requireNonNull((RRWebEventType) objectReader.nextOrNull(iLogger, new RRWebEventType.Deserializer()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            rRWebEvent.timestamp = objectReader.nextLong();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String TAG = "tag";
        public static final String TIMESTAMP = "timestamp";
        public static final String TYPE = "type";
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Serializer {
        public void serialize(RRWebEvent rRWebEvent, ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.name("type").value(iLogger, rRWebEvent.type);
            objectWriter.name("timestamp").value(rRWebEvent.timestamp);
        }
    }

    public RRWebEvent(RRWebEventType rRWebEventType) {
        this.type = rRWebEventType;
        this.timestamp = System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RRWebEvent)) {
            return false;
        }
        RRWebEvent rRWebEvent = (RRWebEvent) obj;
        return this.timestamp == rRWebEvent.timestamp && this.type == rRWebEvent.type;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public RRWebEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.type, Long.valueOf(this.timestamp));
    }

    public void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public void setType(RRWebEventType rRWebEventType) {
        this.type = rRWebEventType;
    }

    public RRWebEvent() {
        this(RRWebEventType.Custom);
    }
}
