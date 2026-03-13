package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryUUID;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.StringUtils;
import io.sentry.util.UUIDStringUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryId implements JsonSerializable {
    public static final SentryId EMPTY_ID = new SentryId(StringUtils.PROPER_NIL_UUID.replace("-", ""));
    private final LazyEvaluator<String> lazyStringValue;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SentryId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SentryId deserialize(ObjectReader objectReader, ILogger iLogger) {
            return new SentryId(objectReader.nextString());
        }
    }

    public SentryId() {
        this((UUID) null);
    }

    public static /* synthetic */ String a(SentryId sentryId, UUID uuid) {
        sentryId.getClass();
        return sentryId.normalize(UUIDStringUtils.toSentryIdString(uuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String normalize(String str) {
        return StringUtils.normalizeUUID(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SentryId.class != obj.getClass()) {
            return false;
        }
        return this.lazyStringValue.getValue().equals(((SentryId) obj).lazyStringValue.getValue());
    }

    public int hashCode() {
        return this.lazyStringValue.getValue().hashCode();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(toString());
    }

    public String toString() {
        return this.lazyStringValue.getValue();
    }

    public SentryId(final UUID uuid) {
        if (uuid != null) {
            this.lazyStringValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.protocol.a
                @Override // io.sentry.util.LazyEvaluator.Evaluator
                public final Object evaluate() {
                    return SentryId.a(this.f38789a, uuid);
                }
            });
        } else {
            this.lazyStringValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.protocol.b
                @Override // io.sentry.util.LazyEvaluator.Evaluator
                public final Object evaluate() {
                    return SentryUUID.generateSentryId();
                }
            });
        }
    }

    public SentryId(String str) {
        final String strNormalizeUUID = StringUtils.normalizeUUID(str);
        if (strNormalizeUUID.length() != 32 && strNormalizeUUID.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strNormalizeUUID.length() == 36) {
            this.lazyStringValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.protocol.c
                @Override // io.sentry.util.LazyEvaluator.Evaluator
                public final Object evaluate() {
                    return this.f38791a.normalize(strNormalizeUUID);
                }
            });
        } else {
            this.lazyStringValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.protocol.d
                @Override // io.sentry.util.LazyEvaluator.Evaluator
                public final Object evaluate() {
                    return SentryId.b(strNormalizeUUID);
                }
            });
        }
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }
}
