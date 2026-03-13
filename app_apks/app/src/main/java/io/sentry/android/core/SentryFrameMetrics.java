package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class SentryFrameMetrics {
    private int frozenFrameCount;
    private long frozenFrameDelayNanos;
    private int slowFrameCount;
    private long slowFrameDelayNanos;
    private long totalDurationNanos;

    public SentryFrameMetrics() {
    }

    public void addFrame(long j10, long j11, boolean z10, boolean z11) {
        this.totalDurationNanos += j10;
        if (z11) {
            this.frozenFrameDelayNanos += j11;
            this.frozenFrameCount++;
        } else if (z10) {
            this.slowFrameDelayNanos += j11;
            this.slowFrameCount++;
        }
    }

    public void clear() {
        this.slowFrameCount = 0;
        this.slowFrameDelayNanos = 0L;
        this.frozenFrameCount = 0;
        this.frozenFrameDelayNanos = 0L;
        this.totalDurationNanos = 0L;
    }

    public boolean containsValidData() {
        return this.slowFrameCount >= 0 && this.slowFrameDelayNanos >= 0 && this.frozenFrameCount >= 0 && this.frozenFrameDelayNanos >= 0 && this.totalDurationNanos >= 0;
    }

    public SentryFrameMetrics diffTo(SentryFrameMetrics sentryFrameMetrics) {
        return new SentryFrameMetrics(this.slowFrameCount - sentryFrameMetrics.slowFrameCount, this.slowFrameDelayNanos - sentryFrameMetrics.slowFrameDelayNanos, this.frozenFrameCount - sentryFrameMetrics.frozenFrameCount, this.frozenFrameDelayNanos - sentryFrameMetrics.frozenFrameDelayNanos, this.totalDurationNanos - sentryFrameMetrics.totalDurationNanos);
    }

    public SentryFrameMetrics duplicate() {
        return new SentryFrameMetrics(this.slowFrameCount, this.slowFrameDelayNanos, this.frozenFrameCount, this.frozenFrameDelayNanos, this.totalDurationNanos);
    }

    public int getFrozenFrameCount() {
        return this.frozenFrameCount;
    }

    public long getFrozenFrameDelayNanos() {
        return this.frozenFrameDelayNanos;
    }

    public int getSlowFrameCount() {
        return this.slowFrameCount;
    }

    public long getSlowFrameDelayNanos() {
        return this.slowFrameDelayNanos;
    }

    public int getSlowFrozenFrameCount() {
        return this.slowFrameCount + this.frozenFrameCount;
    }

    public long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public SentryFrameMetrics(int i10, long j10, int i11, long j11, long j12) {
        this.slowFrameCount = i10;
        this.slowFrameDelayNanos = j10;
        this.frozenFrameCount = i11;
        this.frozenFrameDelayNanos = j11;
        this.totalDurationNanos = j12;
    }
}
