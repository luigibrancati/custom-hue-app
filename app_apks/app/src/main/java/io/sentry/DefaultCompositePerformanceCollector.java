package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DefaultCompositePerformanceCollector implements CompositePerformanceCollector {
    private static final long TRANSACTION_COLLECTION_INTERVAL_MILLIS = 100;
    private static final long TRANSACTION_COLLECTION_TIMEOUT_MILLIS = 30000;
    private final boolean hasNoCollectors;
    private final SentryOptions options;
    private final AutoClosableReentrantLock timerLock = new AutoClosableReentrantLock();
    private volatile Timer timer = null;
    private final Map<String, CompositeData> compositeDataMap = new ConcurrentHashMap();
    private final AtomicBoolean isStarted = new AtomicBoolean(false);
    private long lastCollectionTimestamp = 0;
    private final List<IPerformanceSnapshotCollector> snapshotCollectors = new ArrayList();
    private final List<IPerformanceContinuousCollector> continuousCollectors = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class CompositeData {
        private final List<PerformanceCollectionData> dataList;
        private final long startTimestamp;
        private final ITransaction transaction;

        public boolean addDataAndCheckTimeout(PerformanceCollectionData performanceCollectionData) {
            this.dataList.add(performanceCollectionData);
            return this.transaction != null && DefaultCompositePerformanceCollector.this.options.getDateProvider().now().nanoTimestamp() > this.startTimestamp + TimeUnit.MILLISECONDS.toNanos(30000L);
        }

        private CompositeData(ITransaction iTransaction) {
            this.dataList = new ArrayList();
            this.transaction = iTransaction;
            this.startTimestamp = DefaultCompositePerformanceCollector.this.options.getDateProvider().now().nanoTimestamp();
        }
    }

    public DefaultCompositePerformanceCollector(SentryOptions sentryOptions) {
        boolean z10 = false;
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The options object is required.");
        for (IPerformanceCollector iPerformanceCollector : sentryOptions.getPerformanceCollectors()) {
            if (iPerformanceCollector instanceof IPerformanceSnapshotCollector) {
                this.snapshotCollectors.add((IPerformanceSnapshotCollector) iPerformanceCollector);
            }
            if (iPerformanceCollector instanceof IPerformanceContinuousCollector) {
                this.continuousCollectors.add((IPerformanceContinuousCollector) iPerformanceCollector);
            }
        }
        if (this.snapshotCollectors.isEmpty() && this.continuousCollectors.isEmpty()) {
            z10 = true;
        }
        this.hasNoCollectors = z10;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void close() {
        this.options.getLogger().log(SentryLevel.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.compositeDataMap.clear();
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        if (this.isStarted.getAndSet(false)) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
            try {
                if (this.timer != null) {
                    this.timer.cancel();
                    this.timer = null;
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanFinished(ISpan iSpan) {
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanFinished(iSpan);
        }
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void onSpanStarted(ISpan iSpan) {
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanStarted(iSpan);
        }
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(ITransaction iTransaction) {
        if (this.hasNoCollectors) {
            this.options.getLogger().log(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanStarted(iTransaction);
        }
        String string = iTransaction.getEventId().toString();
        if (!this.compositeDataMap.containsKey(string)) {
            this.compositeDataMap.put(string, new CompositeData(iTransaction));
        }
        start(string);
    }

    @Override // io.sentry.CompositePerformanceCollector
    public List<PerformanceCollectionData> stop(ITransaction iTransaction) {
        this.options.getLogger().log(SentryLevel.DEBUG, "stop collecting performance info for transactions %s (%s)", iTransaction.getName(), iTransaction.getSpanContext().getTraceId().toString());
        Iterator<IPerformanceContinuousCollector> it = this.continuousCollectors.iterator();
        while (it.hasNext()) {
            it.next().onSpanFinished(iTransaction);
        }
        return stop(iTransaction.getEventId().toString());
    }

    @Override // io.sentry.CompositePerformanceCollector
    public List<PerformanceCollectionData> stop(String str) {
        CompositeData compositeDataRemove = this.compositeDataMap.remove(str);
        this.options.getLogger().log(SentryLevel.DEBUG, "stop collecting performance info for " + str, new Object[0]);
        if (this.compositeDataMap.isEmpty()) {
            close();
        }
        if (compositeDataRemove != null) {
            return compositeDataRemove.dataList;
        }
        return null;
    }

    @Override // io.sentry.CompositePerformanceCollector
    public void start(String str) {
        if (this.hasNoCollectors) {
            this.options.getLogger().log(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.compositeDataMap.containsKey(str)) {
            this.compositeDataMap.put(str, new CompositeData(null));
        }
        if (this.isStarted.getAndSet(true)) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            if (this.timer == null) {
                this.timer = new Timer(true);
            }
            this.timer.schedule(new TimerTask() { // from class: io.sentry.DefaultCompositePerformanceCollector.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    Iterator it = DefaultCompositePerformanceCollector.this.snapshotCollectors.iterator();
                    while (it.hasNext()) {
                        ((IPerformanceSnapshotCollector) it.next()).setup();
                    }
                }
            }, 0L);
            final ArrayList arrayList = new ArrayList();
            this.timer.scheduleAtFixedRate(new TimerTask() { // from class: io.sentry.DefaultCompositePerformanceCollector.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - DefaultCompositePerformanceCollector.this.lastCollectionTimestamp <= 10) {
                        return;
                    }
                    arrayList.clear();
                    DefaultCompositePerformanceCollector.this.lastCollectionTimestamp = jCurrentTimeMillis;
                    PerformanceCollectionData performanceCollectionData = new PerformanceCollectionData(DefaultCompositePerformanceCollector.this.options.getDateProvider().now().nanoTimestamp());
                    Iterator it = DefaultCompositePerformanceCollector.this.snapshotCollectors.iterator();
                    while (it.hasNext()) {
                        ((IPerformanceSnapshotCollector) it.next()).collect(performanceCollectionData);
                    }
                    for (CompositeData compositeData : DefaultCompositePerformanceCollector.this.compositeDataMap.values()) {
                        if (compositeData.addDataAndCheckTimeout(performanceCollectionData) && compositeData.transaction != null) {
                            arrayList.add(compositeData.transaction);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        DefaultCompositePerformanceCollector.this.stop((ITransaction) it2.next());
                    }
                }
            }, TRANSACTION_COLLECTION_INTERVAL_MILLIS, TRANSACTION_COLLECTION_INTERVAL_MILLIS);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } finally {
        }
    }
}
