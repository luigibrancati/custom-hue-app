package io.sentry.util;

import io.sentry.ISentryLifecycleToken;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleHelper {
    public static void close(Object obj) {
        if (obj == null || !(obj instanceof ISentryLifecycleToken)) {
            return;
        }
        ((ISentryLifecycleToken) obj).close();
    }
}
