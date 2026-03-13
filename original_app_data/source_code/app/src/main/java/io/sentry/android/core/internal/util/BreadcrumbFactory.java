package io.sentry.android.core.internal.util;

import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.SentryThread;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class BreadcrumbFactory {
    public static Breadcrumb forSession(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE);
        breadcrumb.setData(SentryThread.JsonKeys.STATE, str);
        breadcrumb.setCategory("app.lifecycle");
        breadcrumb.setLevel(SentryLevel.INFO);
        return breadcrumb;
    }
}
