package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class PerformanceCollectionData {
    private final long nanoTimestamp;
    private Double cpuUsagePercentage = null;
    private Long usedHeapMemory = null;
    private Long usedNativeMemory = null;

    public PerformanceCollectionData(long j10) {
        this.nanoTimestamp = j10;
    }

    public Double getCpuUsagePercentage() {
        return this.cpuUsagePercentage;
    }

    public long getNanoTimestamp() {
        return this.nanoTimestamp;
    }

    public Long getUsedHeapMemory() {
        return this.usedHeapMemory;
    }

    public Long getUsedNativeMemory() {
        return this.usedNativeMemory;
    }

    public void setCpuUsagePercentage(Double d10) {
        this.cpuUsagePercentage = d10;
    }

    public void setUsedHeapMemory(Long l10) {
        this.usedHeapMemory = l10;
    }

    public void setUsedNativeMemory(Long l10) {
        this.usedNativeMemory = l10;
    }
}
