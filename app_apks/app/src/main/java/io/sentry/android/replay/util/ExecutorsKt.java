package io.sentry.android.replay.util;

import io.sentry.ISentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"submitSafely", "Ljava/util/concurrent/Future;", "Lio/sentry/ISentryExecutorService;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/SentryOptions;", "taskName", "", "task", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExecutorsKt {
    public static final Future<?> submitSafely(ISentryExecutorService iSentryExecutorService, final SentryOptions options, final String taskName, final Runnable task) {
        AbstractC4862t.e(iSentryExecutorService, "<this>");
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(taskName, "taskName");
        AbstractC4862t.e(task, "task");
        try {
            return iSentryExecutorService.submit(new Runnable() { // from class: io.sentry.android.replay.util.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorsKt.submitSafely$lambda$0(task, options, taskName);
                }
            });
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to submit task " + taskName + " to executor", th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$0(Runnable runnable, SentryOptions sentryOptions, String str) {
        try {
            runnable.run();
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to execute task " + str, th);
        }
    }
}
