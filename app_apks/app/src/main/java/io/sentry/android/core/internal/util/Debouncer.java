package io.sentry.android.core.internal.util;

import io.sentry.transport.ICurrentDateProvider;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Debouncer {
    private final AtomicInteger executions = new AtomicInteger(0);
    private final AtomicLong lastExecutionTime = new AtomicLong(0);
    private final int maxExecutions;
    private final ICurrentDateProvider timeProvider;
    private final long waitTimeMs;

    public Debouncer(ICurrentDateProvider iCurrentDateProvider, long j10, int i10) {
        this.timeProvider = iCurrentDateProvider;
        this.waitTimeMs = j10;
        this.maxExecutions = i10 <= 0 ? 1 : i10;
    }

    public boolean checkForDebounce() {
        long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
        if (this.lastExecutionTime.get() == 0 || this.lastExecutionTime.get() + this.waitTimeMs <= currentTimeMillis) {
            this.executions.set(0);
            this.lastExecutionTime.set(currentTimeMillis);
            return false;
        }
        if (this.executions.incrementAndGet() < this.maxExecutions) {
            return false;
        }
        this.executions.set(0);
        return true;
    }
}
