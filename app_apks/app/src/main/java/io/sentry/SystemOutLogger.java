package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SystemOutLogger implements ILogger {
    private String captureStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", sentryLevel, String.format(str, objArr)));
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        if (th == null) {
            log(sentryLevel, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", sentryLevel, String.format(str, th.toString()), captureStackTrace(th)));
        }
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (th == null) {
            log(sentryLevel, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", sentryLevel, String.format(str, objArr), th.toString(), captureStackTrace(th)));
        }
    }
}
