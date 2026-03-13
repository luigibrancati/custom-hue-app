package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IScopeObserver {
    void addBreadcrumb(Breadcrumb breadcrumb);

    void removeExtra(String str);

    void removeTag(String str);

    void setBreadcrumbs(Collection<Breadcrumb> collection);

    void setContexts(Contexts contexts);

    void setExtra(String str, String str2);

    void setExtras(Map<String, Object> map);

    void setFingerprint(Collection<String> collection);

    void setLevel(SentryLevel sentryLevel);

    void setReplayId(SentryId sentryId);

    void setRequest(Request request);

    void setTag(String str, String str2);

    void setTags(Map<String, String> map);

    void setTrace(SpanContext spanContext, IScope iScope);

    void setTransaction(String str);

    void setUser(User user);
}
