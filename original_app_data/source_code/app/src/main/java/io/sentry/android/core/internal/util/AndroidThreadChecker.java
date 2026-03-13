package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.protocol.SentryThread;
import io.sentry.util.thread.IThreadChecker;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidThreadChecker implements IThreadChecker {
    private static final AndroidThreadChecker instance = new AndroidThreadChecker();
    public static volatile long mainThreadSystemId = Process.myTid();

    private AndroidThreadChecker() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.f
            @Override // java.lang.Runnable
            public final void run() {
                AndroidThreadChecker.mainThreadSystemId = Process.myTid();
            }
        });
    }

    public static AndroidThreadChecker getInstance() {
        return instance;
    }

    public static long getThreadId(Thread thread) {
        return Build.VERSION.SDK_INT >= 36 ? thread.threadId() : thread.getId();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public long currentThreadSystemId() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public String getCurrentThreadName() {
        return isMainThread() ? SentryThread.JsonKeys.MAIN : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(long j10) {
        return getThreadId(Looper.getMainLooper().getThread()) == j10;
    }

    @Override // io.sentry.util.thread.IThreadChecker
    public boolean isMainThread(Thread thread) {
        return isMainThread(getThreadId(thread));
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
