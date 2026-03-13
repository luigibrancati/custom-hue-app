package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class SentryDate implements Comparable<SentryDate> {
    public long diff(SentryDate sentryDate) {
        return nanoTimestamp() - sentryDate.nanoTimestamp();
    }

    public final boolean isAfter(SentryDate sentryDate) {
        return diff(sentryDate) > 0;
    }

    public final boolean isBefore(SentryDate sentryDate) {
        return diff(sentryDate) < 0;
    }

    public long laterDateNanosTimestampByDiff(SentryDate sentryDate) {
        return (sentryDate == null || compareTo(sentryDate) >= 0) ? nanoTimestamp() : sentryDate.nanoTimestamp();
    }

    public abstract long nanoTimestamp();

    @Override // java.lang.Comparable
    public int compareTo(SentryDate sentryDate) {
        return Long.valueOf(nanoTimestamp()).compareTo(Long.valueOf(sentryDate.nanoTimestamp()));
    }
}
