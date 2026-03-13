package io.sentry.util;

import io.sentry.ISentryLifecycleToken;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AutoClosableReentrantLock extends ReentrantLock {
    private static final long serialVersionUID = -3283069816958445549L;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class AutoClosableReentrantLockLifecycleToken implements ISentryLifecycleToken {
        private final ReentrantLock lock;

        public AutoClosableReentrantLockLifecycleToken(ReentrantLock reentrantLock) {
            this.lock = reentrantLock;
        }

        @Override // io.sentry.ISentryLifecycleToken, java.lang.AutoCloseable
        public void close() {
            this.lock.unlock();
        }
    }

    public ISentryLifecycleToken acquire() {
        lock();
        return new AutoClosableReentrantLockLifecycleToken(this);
    }
}
