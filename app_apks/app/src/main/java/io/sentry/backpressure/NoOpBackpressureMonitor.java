package io.sentry.backpressure;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpBackpressureMonitor implements IBackpressureMonitor {
    private static final NoOpBackpressureMonitor instance = new NoOpBackpressureMonitor();

    private NoOpBackpressureMonitor() {
    }

    public static NoOpBackpressureMonitor getInstance() {
        return instance;
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public int getDownsampleFactor() {
        return 0;
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void close() {
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void start() {
    }
}
