package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.Feedback;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum DataCategory {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback(Feedback.TYPE),
    Session(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile("profile"),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    DataCategory(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
