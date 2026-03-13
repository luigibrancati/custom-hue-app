package io.sentry;

import io.sentry.util.UUIDGenerator;
import io.sentry.util.UUIDStringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryUUID {
    private SentryUUID() {
    }

    public static String generateSentryId() {
        return UUIDStringUtils.toSentryIdString(UUIDGenerator.randomUUID());
    }

    public static String generateSpanId() {
        return UUIDStringUtils.toSentrySpanIdString(UUIDGenerator.randomHalfLengthUUID());
    }
}
