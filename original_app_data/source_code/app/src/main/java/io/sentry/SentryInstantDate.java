package io.sentry;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryInstantDate extends SentryDate {
    private final Instant date;

    public SentryInstantDate() {
        this(Instant.now());
    }

    @Override // io.sentry.SentryDate
    public long nanoTimestamp() {
        return DateUtils.secondsToNanos(this.date.getEpochSecond()) + ((long) this.date.getNano());
    }

    public SentryInstantDate(Instant instant) {
        this.date = instant;
    }
}
