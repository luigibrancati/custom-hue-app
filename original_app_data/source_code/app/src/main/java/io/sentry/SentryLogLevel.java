package io.sentry;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum SentryLogLevel implements JsonSerializable {
    TRACE(1),
    DEBUG(5),
    INFO(9),
    WARN(13),
    ERROR(17),
    FATAL(21);

    private final int severityNumber;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryLogLevel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryLogLevel deserialize(ObjectReader objectReader, ILogger iLogger) {
            return SentryLogLevel.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
        }
    }

    SentryLogLevel(int i10) {
        this.severityNumber = i10;
    }

    public int getSeverityNumber() {
        return this.severityNumber;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(name().toLowerCase(Locale.ROOT));
    }
}
