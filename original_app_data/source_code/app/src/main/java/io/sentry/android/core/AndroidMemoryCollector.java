package io.sentry.android.core;

import android.os.Debug;
import io.sentry.IPerformanceSnapshotCollector;
import io.sentry.PerformanceCollectionData;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidMemoryCollector implements IPerformanceSnapshotCollector {
    @Override // io.sentry.IPerformanceSnapshotCollector
    public void collect(PerformanceCollectionData performanceCollectionData) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        performanceCollectionData.setUsedHeapMemory(Long.valueOf(jFreeMemory));
        performanceCollectionData.setUsedNativeMemory(Long.valueOf(nativeHeapSize));
    }

    @Override // io.sentry.IPerformanceSnapshotCollector
    public void setup() {
    }
}
