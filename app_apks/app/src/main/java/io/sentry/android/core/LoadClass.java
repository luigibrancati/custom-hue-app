package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class LoadClass extends io.sentry.util.LoadClass {
    private final io.sentry.util.LoadClass delegate = new io.sentry.util.LoadClass();

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(String str, ILogger iLogger) {
        return this.delegate.isClassAvailable(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    public Class<?> loadClass(String str, ILogger iLogger) {
        return this.delegate.loadClass(str, iLogger);
    }

    @Override // io.sentry.util.LoadClass
    public boolean isClassAvailable(String str, SentryOptions sentryOptions) {
        return this.delegate.isClassAvailable(str, sentryOptions);
    }
}
