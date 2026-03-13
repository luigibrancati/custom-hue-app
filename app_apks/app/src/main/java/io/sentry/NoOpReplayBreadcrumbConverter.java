package io.sentry;

import io.sentry.rrweb.RRWebEvent;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpReplayBreadcrumbConverter implements ReplayBreadcrumbConverter {
    private static final NoOpReplayBreadcrumbConverter instance = new NoOpReplayBreadcrumbConverter();

    private NoOpReplayBreadcrumbConverter() {
    }

    public static NoOpReplayBreadcrumbConverter getInstance() {
        return instance;
    }

    @Override // io.sentry.ReplayBreadcrumbConverter
    public RRWebEvent convert(Breadcrumb breadcrumb) {
        return null;
    }
}
