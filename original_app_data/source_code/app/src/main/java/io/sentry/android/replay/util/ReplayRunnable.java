package io.sentry.android.replay.util;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/util/ReplayRunnable;", "Ljava/lang/Runnable;", "", "taskName", "delegate", "<init>", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "Lfc/H;", "run", "()V", "Ljava/lang/String;", "getTaskName", "()Ljava/lang/String;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayRunnable implements Runnable {
    public static final int $stable = 8;
    private final /* synthetic */ Runnable $$delegate_0;
    private final String taskName;

    public ReplayRunnable(String taskName, Runnable delegate) {
        AbstractC4862t.e(taskName, "taskName");
        AbstractC4862t.e(delegate, "delegate");
        this.taskName = taskName;
        this.$$delegate_0 = delegate;
    }

    public final String getTaskName() {
        return this.taskName;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.$$delegate_0.run();
    }
}
