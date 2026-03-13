package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ReusableCountLatch {
    private final Sync sync;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Sync extends AbstractQueuedSynchronizer {
        private static final long serialVersionUID = 5970133580157457018L;

        public Sync(int i10) {
            setState(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void decrement() {
            releaseShared(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getCount() {
            return getState();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void increment() {
            int state;
            do {
                state = getState();
            } while (!compareAndSetState(state, state + 1));
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public int tryAcquireShared(int i10) {
            return getState() == 0 ? 1 : -1;
        }

        @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
        public boolean tryReleaseShared(int i10) {
            int state;
            int i11;
            do {
                state = getState();
                if (state == 0) {
                    return false;
                }
                i11 = state - 1;
            } while (!compareAndSetState(state, i11));
            return i11 == 0;
        }
    }

    public ReusableCountLatch(int i10) {
        if (i10 >= 0) {
            this.sync = new Sync(i10);
            return;
        }
        throw new IllegalArgumentException("negative initial count '" + i10 + "' is not allowed");
    }

    public void decrement() {
        this.sync.decrement();
    }

    public int getCount() {
        return this.sync.getCount();
    }

    public void increment() {
        this.sync.increment();
    }

    public void waitTillZero() throws InterruptedException {
        this.sync.acquireSharedInterruptibly(1);
    }

    public boolean waitTillZero(long j10, TimeUnit timeUnit) {
        return this.sync.tryAcquireSharedNanos(1, timeUnit.toNanos(j10));
    }

    public ReusableCountLatch() {
        this(0);
    }
}
