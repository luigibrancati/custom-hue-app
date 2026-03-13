package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.SentryDate;
import io.sentry.SentryLongDate;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TimeSpan implements Comparable<TimeSpan> {
    private String description;
    private long startUnixTimeMs;
    private long startUptimeMs;
    private long stopUptimeMs;

    public String getDescription() {
        return this.description;
    }

    public long getDurationMs() {
        if (hasStopped()) {
            return this.stopUptimeMs - this.startUptimeMs;
        }
        return 0L;
    }

    public SentryDate getProjectedStopTimestamp() {
        if (hasStopped()) {
            return new SentryLongDate(DateUtils.millisToNanos(getProjectedStopTimestampMs()));
        }
        return null;
    }

    public long getProjectedStopTimestampMs() {
        if (hasStarted()) {
            return this.startUnixTimeMs + getDurationMs();
        }
        return 0L;
    }

    public double getProjectedStopTimestampSecs() {
        return DateUtils.millisToSeconds(getProjectedStopTimestampMs());
    }

    public SentryDate getStartTimestamp() {
        if (hasStarted()) {
            return new SentryLongDate(DateUtils.millisToNanos(getStartTimestampMs()));
        }
        return null;
    }

    public long getStartTimestampMs() {
        return this.startUnixTimeMs;
    }

    public double getStartTimestampSecs() {
        return DateUtils.millisToSeconds(this.startUnixTimeMs);
    }

    public long getStartUptimeMs() {
        return this.startUptimeMs;
    }

    public boolean hasNotStarted() {
        return this.startUptimeMs == 0;
    }

    public boolean hasNotStopped() {
        return this.stopUptimeMs == 0;
    }

    public boolean hasStarted() {
        return this.startUptimeMs != 0;
    }

    public boolean hasStopped() {
        return this.stopUptimeMs != 0;
    }

    public void reset() {
        this.description = null;
        this.startUptimeMs = 0L;
        this.stopUptimeMs = 0L;
        this.startUnixTimeMs = 0L;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setStartUnixTimeMs(long j10) {
        this.startUnixTimeMs = j10;
    }

    public void setStartedAt(long j10) {
        this.startUptimeMs = j10;
        this.startUnixTimeMs = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.startUptimeMs);
    }

    public void setStoppedAt(long j10) {
        this.stopUptimeMs = j10;
    }

    public void setup(String str, long j10, long j11, long j12) {
        this.description = str;
        this.startUnixTimeMs = j10;
        this.startUptimeMs = j11;
        this.stopUptimeMs = j12;
    }

    public void start() {
        this.startUptimeMs = SystemClock.uptimeMillis();
        this.startUnixTimeMs = System.currentTimeMillis();
    }

    public void stop() {
        this.stopUptimeMs = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    public int compareTo(TimeSpan timeSpan) {
        return Long.compare(this.startUnixTimeMs, timeSpan.startUnixTimeMs);
    }
}
