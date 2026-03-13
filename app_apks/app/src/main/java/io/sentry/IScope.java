package io.sentry;

import io.sentry.Scope;
import io.sentry.featureflags.IFeatureFlagBuffer;
import io.sentry.internal.eventprocessor.EventProcessorAndOrder;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IScope {
    void addAttachment(Attachment attachment);

    void addBreadcrumb(Breadcrumb breadcrumb);

    void addBreadcrumb(Breadcrumb breadcrumb, Hint hint);

    void addEventProcessor(EventProcessor eventProcessor);

    void addFeatureFlag(String str, Boolean bool);

    void assignTraceContext(SentryEvent sentryEvent);

    void bindClient(ISentryClient iSentryClient);

    void clear();

    void clearAttachments();

    void clearBreadcrumbs();

    void clearSession();

    void clearTransaction();

    /* JADX INFO: renamed from: clone */
    IScope m251clone();

    Session endSession();

    List<Attachment> getAttachments();

    Queue<Breadcrumb> getBreadcrumbs();

    ISentryClient getClient();

    Contexts getContexts();

    List<EventProcessor> getEventProcessors();

    List<EventProcessorAndOrder> getEventProcessorsWithOrder();

    Map<String, Object> getExtras();

    IFeatureFlagBuffer getFeatureFlagBuffer();

    FeatureFlags getFeatureFlags();

    List<String> getFingerprint();

    SentryId getLastEventId();

    SentryLevel getLevel();

    SentryOptions getOptions();

    PropagationContext getPropagationContext();

    SentryId getReplayId();

    Request getRequest();

    String getScreen();

    Session getSession();

    ISpan getSpan();

    Map<String, String> getTags();

    ITransaction getTransaction();

    String getTransactionName();

    User getUser();

    void removeContexts(String str);

    void removeExtra(String str);

    void removeTag(String str);

    void replaceOptions(SentryOptions sentryOptions);

    void setActiveSpan(ISpan iSpan);

    void setContexts(String str, Boolean bool);

    void setContexts(String str, Character ch);

    void setContexts(String str, Number number);

    void setContexts(String str, Object obj);

    void setContexts(String str, String str2);

    void setContexts(String str, Collection<?> collection);

    void setContexts(String str, Object[] objArr);

    void setExtra(String str, String str2);

    void setFingerprint(List<String> list);

    void setLastEventId(SentryId sentryId);

    void setLevel(SentryLevel sentryLevel);

    void setPropagationContext(PropagationContext propagationContext);

    void setReplayId(SentryId sentryId);

    void setRequest(Request request);

    void setScreen(String str);

    void setSpanContext(Throwable th, ISpan iSpan, String str);

    void setTag(String str, String str2);

    void setTransaction(ITransaction iTransaction);

    void setTransaction(String str);

    void setUser(User user);

    Scope.SessionPair startSession();

    PropagationContext withPropagationContext(Scope.IWithPropagationContext iWithPropagationContext);

    Session withSession(Scope.IWithSession iWithSession);

    void withTransaction(Scope.IWithTransaction iWithTransaction);
}
