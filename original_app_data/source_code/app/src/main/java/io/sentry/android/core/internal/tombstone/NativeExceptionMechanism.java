package io.sentry.android.core.internal.tombstone;

import io.sentry.android.core.cache.AndroidEnvelopeCache;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public enum NativeExceptionMechanism {
    TOMBSTONE(AndroidEnvelopeCache.LAST_TOMBSTONE_MARKER_LABEL),
    SIGNAL_HANDLER("signalhandler"),
    TOMBSTONE_MERGED("TombstoneMerged");

    private final String value;

    NativeExceptionMechanism(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
