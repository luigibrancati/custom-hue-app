package io.sentry;

import io.sentry.SentryOptions;
import io.sentry.featureflags.FeatureFlagBuffer;
import io.sentry.featureflags.IFeatureFlagBuffer;
import io.sentry.internal.eventprocessor.EventProcessorAndOrder;
import io.sentry.protocol.App;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.protocol.User;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.CollectionUtils;
import io.sentry.util.EventProcessorUtils;
import io.sentry.util.ExceptionUtils;
import io.sentry.util.Objects;
import io.sentry.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Scope implements IScope {
    private WeakReference<ISpan> activeSpan;
    private List<Attachment> attachments;
    private volatile Queue<Breadcrumb> breadcrumbs;
    private ISentryClient client;
    private Contexts contexts;
    private List<EventProcessorAndOrder> eventProcessors;
    private Map<String, Object> extra;
    private final IFeatureFlagBuffer featureFlags;
    private List<String> fingerprint;
    private volatile SentryId lastEventId;
    private SentryLevel level;
    private volatile SentryOptions options;
    private PropagationContext propagationContext;
    private final AutoClosableReentrantLock propagationContextLock;
    private SentryId replayId;
    private Request request;
    private String screen;
    private volatile Session session;
    private final AutoClosableReentrantLock sessionLock;
    private Map<String, String> tags;
    private final Map<Throwable, Pair<WeakReference<ISpan>, String>> throwableToSpan;
    private ITransaction transaction;
    private final AutoClosableReentrantLock transactionLock;
    private String transactionName;
    private User user;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IWithPropagationContext {
        void accept(PropagationContext propagationContext);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IWithSession {
        void accept(Session session);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IWithTransaction {
        void accept(ITransaction iTransaction);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class SessionPair {
        private final Session current;
        private final Session previous;

        public SessionPair(Session session, Session session2) {
            this.current = session;
            this.previous = session2;
        }

        public Session getCurrent() {
            return this.current;
        }

        public Session getPrevious() {
            return this.previous;
        }
    }

    public Scope(SentryOptions sentryOptions) {
        this.activeSpan = new WeakReference<>(null);
        this.fingerprint = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.extra = new ConcurrentHashMap();
        this.eventProcessors = new CopyOnWriteArrayList();
        this.sessionLock = new AutoClosableReentrantLock();
        this.transactionLock = new AutoClosableReentrantLock();
        this.propagationContextLock = new AutoClosableReentrantLock();
        this.contexts = new Contexts();
        this.attachments = new CopyOnWriteArrayList();
        SentryId sentryId = SentryId.EMPTY_ID;
        this.replayId = sentryId;
        this.client = NoOpSentryClient.getInstance();
        this.throwableToSpan = Collections.synchronizedMap(new WeakHashMap());
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "SentryOptions is required.");
        this.breadcrumbs = createBreadcrumbsList(this.options.getMaxBreadcrumbs());
        this.featureFlags = FeatureFlagBuffer.create(sentryOptions);
        this.propagationContext = new PropagationContext();
        this.lastEventId = sentryId;
    }

    public static Queue<Breadcrumb> createBreadcrumbsList(int i10) {
        return i10 > 0 ? SynchronizedQueue.synchronizedQueue(new CircularFifoQueue(i10)) : new DisabledQueue();
    }

    private Breadcrumb executeBeforeBreadcrumb(SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback, Breadcrumb breadcrumb, Hint hint) {
        try {
            return beforeBreadcrumbCallback.execute(breadcrumb, hint);
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
            if (th.getMessage() != null) {
                breadcrumb.setData("sentry:message", th.getMessage());
            }
            return breadcrumb;
        }
    }

    @Override // io.sentry.IScope
    public void addAttachment(Attachment attachment) {
        this.attachments.add(attachment);
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(Breadcrumb breadcrumb, Hint hint) {
        if (breadcrumb == null || (this.breadcrumbs instanceof DisabledQueue)) {
            return;
        }
        if (hint == null) {
            hint = new Hint();
        }
        SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumb = this.options.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            breadcrumb = executeBeforeBreadcrumb(beforeBreadcrumb, breadcrumb, hint);
        }
        if (breadcrumb == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.breadcrumbs.add(breadcrumb);
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.addBreadcrumb(breadcrumb);
            iScopeObserver.setBreadcrumbs(this.breadcrumbs);
        }
    }

    @Override // io.sentry.IScope
    public void addEventProcessor(EventProcessor eventProcessor) {
        this.eventProcessors.add(new EventProcessorAndOrder(eventProcessor, eventProcessor.getOrder()));
    }

    @Override // io.sentry.IScope
    public void addFeatureFlag(String str, Boolean bool) {
        this.featureFlags.add(str, bool);
    }

    @Override // io.sentry.IScope
    public void assignTraceContext(SentryEvent sentryEvent) {
        Pair<WeakReference<ISpan>, String> pair;
        ISpan iSpan;
        if (!this.options.isTracingEnabled() || sentryEvent.getThrowable() == null || (pair = this.throwableToSpan.get(ExceptionUtils.findRootCause(sentryEvent.getThrowable()))) == null) {
            return;
        }
        WeakReference<ISpan> first = pair.getFirst();
        if (sentryEvent.getContexts().getTrace() == null && first != null && (iSpan = first.get()) != null) {
            sentryEvent.getContexts().setTrace(iSpan.getSpanContext());
        }
        String second = pair.getSecond();
        if (sentryEvent.getTransaction() != null || second == null) {
            return;
        }
        sentryEvent.setTransaction(second);
    }

    @Override // io.sentry.IScope
    public void bindClient(ISentryClient iSentryClient) {
        this.client = iSentryClient;
    }

    @Override // io.sentry.IScope
    public void clear() {
        this.level = null;
        this.user = null;
        this.request = null;
        this.screen = null;
        this.fingerprint.clear();
        clearBreadcrumbs();
        this.tags.clear();
        this.extra.clear();
        this.eventProcessors.clear();
        clearTransaction();
        clearAttachments();
    }

    @Override // io.sentry.IScope
    public void clearAttachments() {
        this.attachments.clear();
    }

    @Override // io.sentry.IScope
    public void clearBreadcrumbs() {
        this.breadcrumbs.clear();
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setBreadcrumbs(this.breadcrumbs);
        }
    }

    @Override // io.sentry.IScope
    public void clearSession() {
        this.session = null;
    }

    @Override // io.sentry.IScope
    public void clearTransaction() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.transactionLock.acquire();
        try {
            this.transaction = null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            this.transactionName = null;
            for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                iScopeObserver.setTransaction(null);
                iScopeObserver.setTrace(null, this);
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public Session endSession() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            Session session = null;
            if (this.session != null) {
                this.session.end();
                this.options.getContinuousProfiler().reevaluateSampling();
                Session sessionM254clone = this.session.m254clone();
                this.session = null;
                session = sessionM254clone;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return session;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public List<Attachment> getAttachments() {
        return new CopyOnWriteArrayList(this.attachments);
    }

    @Override // io.sentry.IScope
    public Queue<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    @Override // io.sentry.IScope
    public ISentryClient getClient() {
        return this.client;
    }

    @Override // io.sentry.IScope
    public Contexts getContexts() {
        return this.contexts;
    }

    @Override // io.sentry.IScope
    public List<EventProcessor> getEventProcessors() {
        return EventProcessorUtils.unwrap(this.eventProcessors);
    }

    @Override // io.sentry.IScope
    public List<EventProcessorAndOrder> getEventProcessorsWithOrder() {
        return this.eventProcessors;
    }

    @Override // io.sentry.IScope
    public Map<String, Object> getExtras() {
        return this.extra;
    }

    @Override // io.sentry.IScope
    public IFeatureFlagBuffer getFeatureFlagBuffer() {
        return this.featureFlags;
    }

    @Override // io.sentry.IScope
    public FeatureFlags getFeatureFlags() {
        return this.featureFlags.getFeatureFlags();
    }

    @Override // io.sentry.IScope
    public List<String> getFingerprint() {
        return this.fingerprint;
    }

    @Override // io.sentry.IScope
    public SentryId getLastEventId() {
        return this.lastEventId;
    }

    @Override // io.sentry.IScope
    public SentryLevel getLevel() {
        return this.level;
    }

    @Override // io.sentry.IScope
    public SentryOptions getOptions() {
        return this.options;
    }

    @Override // io.sentry.IScope
    public PropagationContext getPropagationContext() {
        return this.propagationContext;
    }

    @Override // io.sentry.IScope
    public SentryId getReplayId() {
        return this.replayId;
    }

    @Override // io.sentry.IScope
    public Request getRequest() {
        return this.request;
    }

    @Override // io.sentry.IScope
    public String getScreen() {
        return this.screen;
    }

    @Override // io.sentry.IScope
    public Session getSession() {
        return this.session;
    }

    @Override // io.sentry.IScope
    public ISpan getSpan() {
        ISpan latestActiveSpan;
        ISpan iSpan = this.activeSpan.get();
        if (iSpan != null) {
            return iSpan;
        }
        ITransaction iTransaction = this.transaction;
        return (iTransaction == null || (latestActiveSpan = iTransaction.getLatestActiveSpan()) == null) ? iTransaction : latestActiveSpan;
    }

    @Override // io.sentry.IScope
    public Map<String, String> getTags() {
        return CollectionUtils.newConcurrentHashMap(this.tags);
    }

    @Override // io.sentry.IScope
    public ITransaction getTransaction() {
        return this.transaction;
    }

    @Override // io.sentry.IScope
    public String getTransactionName() {
        ITransaction iTransaction = this.transaction;
        return iTransaction != null ? iTransaction.getName() : this.transactionName;
    }

    @Override // io.sentry.IScope
    public User getUser() {
        return this.user;
    }

    @Override // io.sentry.IScope
    public void removeContexts(String str) {
        if (str == null) {
            return;
        }
        this.contexts.remove(str);
    }

    @Override // io.sentry.IScope
    public void removeExtra(String str) {
        if (str == null) {
            return;
        }
        this.extra.remove(str);
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.removeExtra(str);
            iScopeObserver.setExtras(this.extra);
        }
    }

    @Override // io.sentry.IScope
    public void removeTag(String str) {
        if (str == null) {
            return;
        }
        this.tags.remove(str);
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.removeTag(str);
            iScopeObserver.setTags(this.tags);
        }
    }

    @Override // io.sentry.IScope
    public void replaceOptions(SentryOptions sentryOptions) {
        this.options = sentryOptions;
        Queue<Breadcrumb> queue = this.breadcrumbs;
        this.breadcrumbs = createBreadcrumbsList(sentryOptions.getMaxBreadcrumbs());
        Iterator<Breadcrumb> it = queue.iterator();
        while (it.hasNext()) {
            addBreadcrumb(it.next());
        }
    }

    @Override // io.sentry.IScope
    public void setActiveSpan(ISpan iSpan) {
        this.activeSpan = new WeakReference<>(iSpan);
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, Object obj) {
        if (str == null) {
            return;
        }
        this.contexts.put(str, obj);
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setContexts(this.contexts);
        }
    }

    @Override // io.sentry.IScope
    public void setExtra(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeExtra(str);
            return;
        }
        this.extra.put(str, str2);
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.setExtra(str, str2);
            iScopeObserver.setExtras(this.extra);
        }
    }

    @Override // io.sentry.IScope
    public void setFingerprint(List<String> list) {
        if (list == null) {
            return;
        }
        this.fingerprint = new ArrayList(list);
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setFingerprint(list);
        }
    }

    @Override // io.sentry.IScope
    public void setLastEventId(SentryId sentryId) {
        this.lastEventId = sentryId;
    }

    @Override // io.sentry.IScope
    public void setLevel(SentryLevel sentryLevel) {
        this.level = sentryLevel;
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setLevel(sentryLevel);
        }
    }

    @Override // io.sentry.IScope
    public void setPropagationContext(PropagationContext propagationContext) {
        this.propagationContext = propagationContext;
        SpanContext spanContext = propagationContext.toSpanContext();
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setTrace(spanContext, this);
        }
    }

    @Override // io.sentry.IScope
    public void setReplayId(SentryId sentryId) {
        this.replayId = sentryId;
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setReplayId(sentryId);
        }
    }

    @Override // io.sentry.IScope
    public void setRequest(Request request) {
        this.request = request;
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setRequest(request);
        }
    }

    @Override // io.sentry.IScope
    public void setScreen(String str) {
        this.screen = str;
        Contexts contexts = getContexts();
        App app2 = contexts.getApp();
        if (app2 == null) {
            app2 = new App();
            contexts.setApp(app2);
        }
        if (str == null) {
            app2.setViewNames(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            app2.setViewNames(arrayList);
        }
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setContexts(contexts);
        }
    }

    @Override // io.sentry.IScope
    public void setSpanContext(Throwable th, ISpan iSpan, String str) {
        Objects.requireNonNull(th, "throwable is required");
        Objects.requireNonNull(iSpan, "span is required");
        Objects.requireNonNull(str, "transactionName is required");
        Throwable thFindRootCause = ExceptionUtils.findRootCause(th);
        if (this.throwableToSpan.containsKey(thFindRootCause)) {
            return;
        }
        this.throwableToSpan.put(thFindRootCause, new Pair<>(new WeakReference(iSpan), str));
    }

    @Override // io.sentry.IScope
    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            removeTag(str);
            return;
        }
        this.tags.put(str, str2);
        for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
            iScopeObserver.setTag(str, str2);
            iScopeObserver.setTags(this.tags);
        }
    }

    @Override // io.sentry.IScope
    public void setTransaction(String str) {
        if (str == null) {
            this.options.getLogger().log(SentryLevel.WARNING, "Transaction cannot be null", new Object[0]);
            return;
        }
        ITransaction iTransaction = this.transaction;
        if (iTransaction != null) {
            iTransaction.setName(str, TransactionNameSource.CUSTOM);
        }
        this.transactionName = str;
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setTransaction(str);
        }
    }

    @Override // io.sentry.IScope
    public void setUser(User user) {
        this.user = user;
        Iterator<IScopeObserver> it = this.options.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().setUser(user);
        }
    }

    @Override // io.sentry.IScope
    public SessionPair startSession() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            if (this.session != null) {
                this.session.end();
                this.options.getContinuousProfiler().reevaluateSampling();
            }
            Session session = this.session;
            SessionPair sessionPair = null;
            if (this.options.getRelease() != null) {
                this.session = new Session(this.options.getDistinctId(), this.user, this.options.getEnvironment(), this.options.getRelease());
                sessionPair = new SessionPair(this.session.m254clone(), session != null ? session.m254clone() : null);
            } else {
                this.options.getLogger().log(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return sessionPair;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public PropagationContext withPropagationContext(IWithPropagationContext iWithPropagationContext) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.propagationContextLock.acquire();
        try {
            iWithPropagationContext.accept(this.propagationContext);
            PropagationContext propagationContext = new PropagationContext(this.propagationContext);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return propagationContext;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public Session withSession(IWithSession iWithSession) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.sessionLock.acquire();
        try {
            iWithSession.accept(this.session);
            Session sessionM254clone = this.session != null ? this.session.m254clone() : null;
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return sessionM254clone;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public void withTransaction(IWithTransaction iWithTransaction) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.transactionLock.acquire();
        try {
            iWithTransaction.accept(this.transaction);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IScope m251clone() {
        return new Scope(this);
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, Boolean bool) {
        if (str == null) {
            return;
        }
        if (bool == null) {
            setContexts(str, (Object) null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", bool);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void setTransaction(ITransaction iTransaction) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.transactionLock.acquire();
        try {
            this.transaction = iTransaction;
            for (IScopeObserver iScopeObserver : this.options.getScopeObservers()) {
                if (iTransaction != null) {
                    iScopeObserver.setTransaction(iTransaction.getName());
                    iScopeObserver.setTrace(iTransaction.getSpanContext(), this);
                } else {
                    iScopeObserver.setTransaction(null);
                    iScopeObserver.setTrace(null, this);
                }
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            setContexts(str, (Object) null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", str2);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void addBreadcrumb(Breadcrumb breadcrumb) {
        addBreadcrumb(breadcrumb, null);
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, Number number) {
        if (str == null) {
            return;
        }
        if (number == null) {
            setContexts(str, (Object) null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", number);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, Collection<?> collection) {
        if (str == null) {
            return;
        }
        if (collection == null) {
            setContexts(str, (Object) null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", collection);
        setContexts(str, map);
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, Object[] objArr) {
        if (str == null) {
            return;
        }
        if (objArr == null) {
            setContexts(str, (Object) null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", objArr);
        setContexts(str, map);
    }

    private Scope(Scope scope) {
        this.activeSpan = new WeakReference<>(null);
        this.fingerprint = new ArrayList();
        this.tags = new ConcurrentHashMap();
        this.extra = new ConcurrentHashMap();
        this.eventProcessors = new CopyOnWriteArrayList();
        this.sessionLock = new AutoClosableReentrantLock();
        this.transactionLock = new AutoClosableReentrantLock();
        this.propagationContextLock = new AutoClosableReentrantLock();
        this.contexts = new Contexts();
        this.attachments = new CopyOnWriteArrayList();
        this.replayId = SentryId.EMPTY_ID;
        this.client = NoOpSentryClient.getInstance();
        this.throwableToSpan = Collections.synchronizedMap(new WeakHashMap());
        this.transaction = scope.transaction;
        this.transactionName = scope.transactionName;
        this.activeSpan = scope.activeSpan;
        this.session = scope.session;
        this.options = scope.options;
        this.level = scope.level;
        this.client = scope.client;
        this.lastEventId = scope.getLastEventId();
        User user = scope.user;
        this.user = user != null ? new User(user) : null;
        this.screen = scope.screen;
        this.replayId = scope.replayId;
        Request request = scope.request;
        this.request = request != null ? new Request(request) : null;
        this.fingerprint = new ArrayList(scope.fingerprint);
        this.eventProcessors = new CopyOnWriteArrayList(scope.eventProcessors);
        Breadcrumb[] breadcrumbArr = (Breadcrumb[]) scope.breadcrumbs.toArray(new Breadcrumb[0]);
        Queue<Breadcrumb> queueCreateBreadcrumbsList = createBreadcrumbsList(scope.options.getMaxBreadcrumbs());
        for (Breadcrumb breadcrumb : breadcrumbArr) {
            queueCreateBreadcrumbsList.add(new Breadcrumb(breadcrumb));
        }
        this.breadcrumbs = queueCreateBreadcrumbsList;
        Map<String, String> map = scope.tags;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.tags = concurrentHashMap;
        Map<String, Object> map2 = scope.extra;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.extra = concurrentHashMap2;
        this.contexts = new Contexts(scope.contexts);
        this.attachments = new CopyOnWriteArrayList(scope.attachments);
        this.featureFlags = scope.featureFlags.m266clone();
        this.propagationContext = new PropagationContext(scope.propagationContext);
    }

    @Override // io.sentry.IScope
    public void setContexts(String str, Character ch) {
        if (str == null) {
            return;
        }
        if (ch == null) {
            setContexts(str, (Object) null);
            return;
        }
        HashMap map = new HashMap();
        map.put("value", ch);
        setContexts(str, map);
    }
}
