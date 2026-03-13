package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidFatalLogger implements ILogger {
    private final String tag;

    public AndroidFatalLogger() {
        this("Sentry");
    }

    private int toLogcatLevel(SentryLevel sentryLevel) {
        return 7;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(toLogcatLevel(sentryLevel), this.tag, str);
        } else {
            Log.println(toLogcatLevel(sentryLevel), this.tag, String.format(str, objArr));
        }
    }

    public AndroidFatalLogger(String str) {
        this.tag = str;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            log(sentryLevel, String.format(str, objArr), th);
        } else {
            log(sentryLevel, str, th);
        }
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        Log.wtf(this.tag, str, th);
    }
}
