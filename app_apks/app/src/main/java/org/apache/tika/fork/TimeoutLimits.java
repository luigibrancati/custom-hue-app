package org.apache.tika.fork;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
class TimeoutLimits {
    private final long parseTimeoutMS;
    private final long pulseMS;
    private final long waitTimeoutMS;

    public TimeoutLimits(long j10, long j11, long j12) {
        this.pulseMS = j10;
        this.parseTimeoutMS = j11;
        this.waitTimeoutMS = j12;
    }

    public long getParseTimeoutMS() {
        return this.parseTimeoutMS;
    }

    public long getPulseMS() {
        return this.pulseMS;
    }

    public long getWaitTimeoutMS() {
        return this.waitTimeoutMS;
    }
}
