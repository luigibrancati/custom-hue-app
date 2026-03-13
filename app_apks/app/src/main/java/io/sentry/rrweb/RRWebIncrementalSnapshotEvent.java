package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class RRWebIncrementalSnapshotEvent extends RRWebEvent {
    private IncrementalSource source;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Deserializer {
        public boolean deserializeValue(RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, String str, ObjectReader objectReader, ILogger iLogger) {
            if (!str.equals("source")) {
                return false;
            }
            rRWebIncrementalSnapshotEvent.source = (IncrementalSource) Objects.requireNonNull((IncrementalSource) objectReader.nextOrNull(iLogger, new IncrementalSource.Deserializer()), "");
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum IncrementalSource implements JsonSerializable {
        Mutation,
        MouseMove,
        MouseInteraction,
        Scroll,
        ViewportResize,
        Input,
        TouchMove,
        MediaInteraction,
        StyleSheetRule,
        CanvasMutation,
        Font,
        Log,
        Drag,
        StyleDeclaration,
        Selection,
        AdoptedStyleSheet,
        CustomElement;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class Deserializer implements JsonDeserializer<IncrementalSource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            public IncrementalSource deserialize(ObjectReader objectReader, ILogger iLogger) {
                return IncrementalSource.values()[objectReader.nextInt()];
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.value(ordinal());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class JsonKeys {
        public static final String SOURCE = "source";
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Serializer {
        public void serialize(RRWebIncrementalSnapshotEvent rRWebIncrementalSnapshotEvent, ObjectWriter objectWriter, ILogger iLogger) {
            objectWriter.name("source").value(iLogger, rRWebIncrementalSnapshotEvent.source);
        }
    }

    public RRWebIncrementalSnapshotEvent(IncrementalSource incrementalSource) {
        super(RRWebEventType.IncrementalSnapshot);
        this.source = incrementalSource;
    }

    public IncrementalSource getSource() {
        return this.source;
    }

    public void setSource(IncrementalSource incrementalSource) {
        this.source = incrementalSource;
    }
}
