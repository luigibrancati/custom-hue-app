package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ScopeObserverAdapter implements IScopeObserver {
    @Override // io.sentry.IScopeObserver
    public void addBreadcrumb(Breadcrumb breadcrumb) {
    }

    @Override // io.sentry.IScopeObserver
    public void removeExtra(String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void removeTag(String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void setBreadcrumbs(Collection<Breadcrumb> collection) {
    }

    @Override // io.sentry.IScopeObserver
    public void setContexts(Contexts contexts) {
    }

    @Override // io.sentry.IScopeObserver
    public void setExtras(Map<String, Object> map) {
    }

    @Override // io.sentry.IScopeObserver
    public void setFingerprint(Collection<String> collection) {
    }

    @Override // io.sentry.IScopeObserver
    public void setLevel(SentryLevel sentryLevel) {
    }

    @Override // io.sentry.IScopeObserver
    public void setReplayId(SentryId sentryId) {
    }

    @Override // io.sentry.IScopeObserver
    public void setRequest(Request request) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTags(Map<String, String> map) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTransaction(String str) {
    }

    @Override // io.sentry.IScopeObserver
    public void setUser(User user) {
    }

    @Override // io.sentry.IScopeObserver
    public void setExtra(String str, String str2) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTag(String str, String str2) {
    }

    @Override // io.sentry.IScopeObserver
    public void setTrace(SpanContext spanContext, IScope iScope) {
    }
}
