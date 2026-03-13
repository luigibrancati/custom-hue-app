package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class LogUtils {
    public static void logNotInstanceOf(Class<?> cls, Object obj, ILogger iLogger) {
        iLogger.log(SentryLevel.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }
}
