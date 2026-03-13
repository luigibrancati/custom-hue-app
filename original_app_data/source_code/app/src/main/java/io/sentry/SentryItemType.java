package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.clientreport.ClientReport;
import io.sentry.protocol.Feedback;
import io.sentry.protocol.SentryTransaction;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum SentryItemType implements JsonSerializable {
    Session(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent(SentryReplayEvent.REPLAY_EVENT_TYPE),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback(Feedback.TYPE),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryItemType> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryItemType deserialize(ObjectReader objectReader, ILogger iLogger) {
            return SentryItemType.valueOfLabel(objectReader.nextString().toLowerCase(Locale.ROOT));
        }
    }

    SentryItemType(String str) {
        this.itemType = str;
    }

    public static SentryItemType resolve(Object obj) {
        return obj instanceof SentryEvent ? ((SentryEvent) obj).getContexts().getFeedback() == null ? Event : Feedback : obj instanceof SentryTransaction ? Transaction : obj instanceof Session ? Session : obj instanceof ClientReport ? ClientReport : Attachment;
    }

    public static SentryItemType valueOfLabel(String str) {
        for (SentryItemType sentryItemType : values()) {
            if (sentryItemType.itemType.equals(str)) {
                return sentryItemType;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(this.itemType);
    }
}
