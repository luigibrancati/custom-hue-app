package io.sentry;

import io.sentry.util.LazyEvaluator;
import io.sentry.util.StringUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SpanId implements JsonSerializable {
    public static final SpanId EMPTY_ID = new SpanId(StringUtils.PROPER_NIL_UUID.replace("-", "").substring(0, 16));
    private final LazyEvaluator<String> lazyValue;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer implements JsonDeserializer<SpanId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public SpanId deserialize(ObjectReader objectReader, ILogger iLogger) {
            return new SpanId(objectReader.nextString());
        }
    }

    public SpanId(final String str) {
        Objects.requireNonNull(str, "value is required");
        this.lazyValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.R0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return SpanId.a(str);
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SpanId.class != obj.getClass()) {
            return false;
        }
        return this.lazyValue.getValue().equals(((SpanId) obj).lazyValue.getValue());
    }

    public int hashCode() {
        return this.lazyValue.getValue().hashCode();
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
        objectWriter.value(this.lazyValue.getValue());
    }

    public String toString() {
        return this.lazyValue.getValue();
    }

    public SpanId() {
        this.lazyValue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.Q0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return SentryUUID.generateSpanId();
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }
}
