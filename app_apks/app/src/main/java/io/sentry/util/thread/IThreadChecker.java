package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IThreadChecker {
    long currentThreadSystemId();

    String getCurrentThreadName();

    boolean isMainThread();

    boolean isMainThread(long j10);

    boolean isMainThread(SentryThread sentryThread);

    boolean isMainThread(Thread thread);
}
