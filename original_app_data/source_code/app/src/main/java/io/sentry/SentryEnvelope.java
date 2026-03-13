package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryEnvelope {
    private final SentryEnvelopeHeader header;
    private final Iterable<SentryEnvelopeItem> items;

    public SentryEnvelope(SentryEnvelopeHeader sentryEnvelopeHeader, Iterable<SentryEnvelopeItem> iterable) {
        this.header = (SentryEnvelopeHeader) Objects.requireNonNull(sentryEnvelopeHeader, "SentryEnvelopeHeader is required.");
        this.items = (Iterable) Objects.requireNonNull(iterable, "SentryEnvelope items are required.");
    }

    public static SentryEnvelope from(ISerializer iSerializer, Session session, SdkVersion sdkVersion) {
        Objects.requireNonNull(iSerializer, "Serializer is required.");
        Objects.requireNonNull(session, "session is required.");
        return new SentryEnvelope((SentryId) null, sdkVersion, SentryEnvelopeItem.fromSession(iSerializer, session));
    }

    public SentryEnvelopeHeader getHeader() {
        return this.header;
    }

    public Iterable<SentryEnvelopeItem> getItems() {
        return this.items;
    }

    public SentryEnvelope(SentryId sentryId, SdkVersion sdkVersion, Iterable<SentryEnvelopeItem> iterable) {
        this.header = new SentryEnvelopeHeader(sentryId, sdkVersion);
        this.items = (Iterable) Objects.requireNonNull(iterable, "SentryEnvelope items are required.");
    }

    public static SentryEnvelope from(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent, SdkVersion sdkVersion) {
        Objects.requireNonNull(iSerializer, "Serializer is required.");
        Objects.requireNonNull(sentryBaseEvent, "item is required.");
        return new SentryEnvelope(sentryBaseEvent.getEventId(), sdkVersion, SentryEnvelopeItem.fromEvent(iSerializer, sentryBaseEvent));
    }

    public SentryEnvelope(SentryId sentryId, SdkVersion sdkVersion, SentryEnvelopeItem sentryEnvelopeItem) {
        Objects.requireNonNull(sentryEnvelopeItem, "SentryEnvelopeItem is required.");
        this.header = new SentryEnvelopeHeader(sentryId, sdkVersion);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(sentryEnvelopeItem);
        this.items = arrayList;
    }

    public static SentryEnvelope from(ISerializer iSerializer, ProfilingTraceData profilingTraceData, long j10, SdkVersion sdkVersion) {
        Objects.requireNonNull(iSerializer, "Serializer is required.");
        Objects.requireNonNull(profilingTraceData, "Profiling trace data is required.");
        return new SentryEnvelope(new SentryId(profilingTraceData.getProfileId()), sdkVersion, SentryEnvelopeItem.fromProfilingTrace(profilingTraceData, j10, iSerializer));
    }
}
