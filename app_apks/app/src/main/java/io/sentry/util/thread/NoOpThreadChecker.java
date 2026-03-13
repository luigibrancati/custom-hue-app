package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpThreadChecker implements IThreadChecker {
    private static final NoOpThreadChecker instance = new NoOpThreadChecker();

    public static NoOpThreadChecker getInstance() {
        return instance;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return 0L;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public String getCurrentThreadName() {
        return "";
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread() {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j10) {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(SentryThread sentryThread) {
        return false;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(Thread thread) {
        return false;
    }
}
