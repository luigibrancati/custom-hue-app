package io.sentry.logger;

import io.sentry.SentryDate;
import io.sentry.SentryLogLevel;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface ILoggerApi {
    void debug(String str, Object... objArr);

    void error(String str, Object... objArr);

    void fatal(String str, Object... objArr);

    void info(String str, Object... objArr);

    void log(SentryLogLevel sentryLogLevel, SentryDate sentryDate, String str, Object... objArr);

    void log(SentryLogLevel sentryLogLevel, SentryLogParameters sentryLogParameters, String str, Object... objArr);

    void log(SentryLogLevel sentryLogLevel, String str, Object... objArr);

    void trace(String str, Object... objArr);

    void warn(String str, Object... objArr);
}
