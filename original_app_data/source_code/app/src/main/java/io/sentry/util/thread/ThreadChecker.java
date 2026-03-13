package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadChecker implements IThreadChecker {
    private static final long mainThreadId = Thread.currentThread().getId();
    private static final ThreadChecker instance = new ThreadChecker();

    private ThreadChecker() {
    }

    public static ThreadChecker getInstance() {
        return instance;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public String getCurrentThreadName() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j10) {
        return mainThreadId == j10;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(Thread thread) {
        return isMainThread(thread.getId());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return isMainThread(Thread.currentThread());
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(SentryThread sentryThread) {
        Long id2 = sentryThread.getId();
        return id2 != null && isMainThread(id2.longValue());
    }
}
