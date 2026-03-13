package io.sentry.android.core;

import android.util.Log;
import io.sentry.Breadcrumb;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryLogLevel;
import io.sentry.logger.ILoggerApi;
import io.sentry.logger.SentryLogParameters;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryLogcatAdapter {
    private static void addAsBreadcrumb(String str, SentryLevel sentryLevel, String str2) {
        addAsBreadcrumb(str, sentryLevel, str2, null);
    }

    private static void addAsLog(SentryLogLevel sentryLogLevel, String str, Throwable th) {
        ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
        if (scopesAdapter.getOptions().getLogs().isEnabled()) {
            String message = th != null ? th.getMessage() : null;
            SentryLogParameters sentryLogParameters = new SentryLogParameters();
            sentryLogParameters.setOrigin("auto.log.logcat");
            if (th == null || message == null) {
                scopesAdapter.logger().log(sentryLogLevel, sentryLogParameters, str, new Object[0]);
                return;
            }
            ILoggerApi iLoggerApiLogger = scopesAdapter.logger();
            if (str != null) {
                message = str + "\n" + message;
            }
            iLoggerApiLogger.log(sentryLogLevel, sentryLogParameters, message, new Object[0]);
        }
    }

    public static int d(String str, String str2) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2);
        addAsLog(SentryLogLevel.DEBUG, str2, null);
        return Log.d(str, str2);
    }

    public static int e(String str, String str2) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2);
        addAsLog(SentryLogLevel.ERROR, str2, null);
        return Log.e(str, str2);
    }

    public static int i(String str, String str2) {
        addAsBreadcrumb(str, SentryLevel.INFO, str2);
        addAsLog(SentryLogLevel.INFO, str2, null);
        return Log.i(str, str2);
    }

    public static int v(String str, String str2) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2);
        addAsLog(SentryLogLevel.TRACE, str2, null);
        return Log.v(str, str2);
    }

    public static int w(String str, String str2) {
        addAsBreadcrumb(str, SentryLevel.WARNING, str2);
        addAsLog(SentryLogLevel.WARN, str2, null);
        return Log.w(str, str2);
    }

    public static int wtf(String str, String str2) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2);
        addAsLog(SentryLogLevel.FATAL, str2, null);
        return Log.wtf(str, str2);
    }

    private static void addAsBreadcrumb(String str, SentryLevel sentryLevel, Throwable th) {
        addAsBreadcrumb(str, sentryLevel, null, th);
    }

    private static void addAsBreadcrumb(String str, SentryLevel sentryLevel, String str2, Throwable th) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setCategory("Logcat");
        breadcrumb.setMessage(str2);
        breadcrumb.setLevel(sentryLevel);
        if (str != null) {
            breadcrumb.setData("tag", str);
        }
        if (th != null && th.getMessage() != null) {
            breadcrumb.setData("throwable", th.getMessage());
        }
        Sentry.addBreadcrumb(breadcrumb);
    }

    public static int d(String str, String str2, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2, th);
        addAsLog(SentryLogLevel.DEBUG, str2, th);
        return Log.d(str, str2, th);
    }

    public static int e(String str, String str2, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2, th);
        addAsLog(SentryLogLevel.ERROR, str2, th);
        return Log.e(str, str2, th);
    }

    public static int i(String str, String str2, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.INFO, str2, th);
        addAsLog(SentryLogLevel.INFO, str2, th);
        return Log.i(str, str2, th);
    }

    public static int v(String str, String str2, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.DEBUG, str2, th);
        addAsLog(SentryLogLevel.TRACE, str2, th);
        return Log.v(str, str2, th);
    }

    public static int w(String str, String str2, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.WARNING, str2, th);
        addAsLog(SentryLogLevel.WARN, str2, th);
        return Log.w(str, str2, th);
    }

    public static int wtf(String str, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.ERROR, th);
        addAsLog(SentryLogLevel.FATAL, null, th);
        return Log.wtf(str, th);
    }

    public static int w(String str, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.WARNING, th);
        addAsLog(SentryLogLevel.WARN, null, th);
        return Log.w(str, th);
    }

    public static int wtf(String str, String str2, Throwable th) {
        addAsBreadcrumb(str, SentryLevel.ERROR, str2, th);
        addAsLog(SentryLogLevel.FATAL, str2, th);
        return Log.wtf(str, str2, th);
    }
}
