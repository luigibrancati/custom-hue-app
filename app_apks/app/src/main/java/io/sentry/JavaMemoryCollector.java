package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class JavaMemoryCollector implements IPerformanceSnapshotCollector {
    private final Runtime runtime = Runtime.getRuntime();

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(PerformanceCollectionData performanceCollectionData) {
        performanceCollectionData.setUsedHeapMemory(Long.valueOf(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
    }
}
