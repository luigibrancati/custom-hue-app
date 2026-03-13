package io.sentry;

import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Cached;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class MainEventProcessor implements EventProcessor, Closeable {
    private volatile HostnameCache hostnameCache = null;
    private final SentryOptions options;
    private final SentryExceptionFactory sentryExceptionFactory;
    private final SentryThreadFactory sentryThreadFactory;

    public MainEventProcessor(SentryOptions sentryOptions) {
        SentryOptions sentryOptions2 = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
        this.options = sentryOptions2;
        SentryStackTraceFactory sentryStackTraceFactory = new SentryStackTraceFactory(sentryOptions2);
        this.sentryExceptionFactory = new SentryExceptionFactory(sentryStackTraceFactory);
        this.sentryThreadFactory = new SentryThreadFactory(sentryStackTraceFactory);
    }

    private void ensureHostnameCache() {
        if (this.hostnameCache == null) {
            this.hostnameCache = HostnameCache.getInstance();
        }
    }

    private boolean isCachedHint(Hint hint) {
        return HintUtils.hasType(hint, Cached.class);
    }

    private void mergeUser(SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            user = new User();
            sentryBaseEvent.setUser(user);
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    private void processNonCachedEvent(SentryBaseEvent sentryBaseEvent) {
        setRelease(sentryBaseEvent);
        setEnvironment(sentryBaseEvent);
        setServerName(sentryBaseEvent);
        setDist(sentryBaseEvent);
        setSdk(sentryBaseEvent);
        setTags(sentryBaseEvent);
        mergeUser(sentryBaseEvent);
    }

    private void setCommons(SentryBaseEvent sentryBaseEvent) {
        setPlatform(sentryBaseEvent);
    }

    private void setDebugMeta(SentryBaseEvent sentryBaseEvent) {
        DebugMeta debugMetaBuildDebugMeta = DebugMeta.buildDebugMeta(sentryBaseEvent.getDebugMeta(), this.options);
        if (debugMetaBuildDebugMeta != null) {
            sentryBaseEvent.setDebugMeta(debugMetaBuildDebugMeta);
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(this.options.getDist());
        }
    }

    private void setEnvironment(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getEnvironment() == null) {
            sentryBaseEvent.setEnvironment(this.options.getEnvironment());
        }
    }

    private void setExceptions(SentryEvent sentryEvent) {
        Throwable throwableMechanism = sentryEvent.getThrowableMechanism();
        if (throwableMechanism != null) {
            sentryEvent.setExceptions(this.sentryExceptionFactory.getSentryExceptions(throwableMechanism));
        }
    }

    private void setModules(SentryEvent sentryEvent) {
        Map<String, String> orLoadModules = this.options.getModulesLoader().getOrLoadModules();
        if (orLoadModules == null) {
            return;
        }
        Map<String, String> modules = sentryEvent.getModules();
        if (modules == null) {
            sentryEvent.setModules(orLoadModules);
        } else {
            modules.putAll(orLoadModules);
        }
    }

    private void setPlatform(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getPlatform() == null) {
            sentryBaseEvent.setPlatform("java");
        }
    }

    private void setRelease(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRelease() == null) {
            sentryBaseEvent.setRelease(this.options.getRelease());
        }
    }

    private void setSdk(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getSdk() == null) {
            sentryBaseEvent.setSdk(this.options.getSdkVersion());
        }
    }

    private void setServerName(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getServerName() == null) {
            sentryBaseEvent.setServerName(this.options.getServerName());
        }
        if (this.options.isAttachServerName() && sentryBaseEvent.getServerName() == null) {
            ensureHostnameCache();
            if (this.hostnameCache != null) {
                sentryBaseEvent.setServerName(this.hostnameCache.getHostname());
            }
        }
    }

    private void setTags(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(this.options.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.options.getTags().entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(entry.getKey())) {
                sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
            }
        }
    }

    private void setThreads(SentryEvent sentryEvent, Hint hint) {
        boolean zIgnoreCurrentThread;
        if (sentryEvent.getThreads() == null) {
            List<SentryException> exceptions = sentryEvent.getExceptions();
            ArrayList arrayList = null;
            if (exceptions != null && !exceptions.isEmpty()) {
                for (SentryException sentryException : exceptions) {
                    if (sentryException.getMechanism() != null && sentryException.getThreadId() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(sentryException.getThreadId());
                    }
                }
            }
            if (this.options.isAttachThreads() || HintUtils.hasType(hint, AbnormalExit.class)) {
                Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
                boolean zIsAttachStacktrace = this.options.isAttachStacktrace();
                if (sentrySdkHint instanceof AbnormalExit) {
                    zIgnoreCurrentThread = ((AbnormalExit) sentrySdkHint).ignoreCurrentThread();
                    zIsAttachStacktrace = true;
                } else {
                    zIgnoreCurrentThread = false;
                }
                sentryEvent.setThreads(this.sentryThreadFactory.getCurrentThreads(arrayList, zIgnoreCurrentThread, zIsAttachStacktrace));
                return;
            }
            if (this.options.isAttachStacktrace()) {
                if ((exceptions == null || exceptions.isEmpty()) && !isCachedHint(hint)) {
                    sentryEvent.setThreads(this.sentryThreadFactory.getCurrentThread(this.options.isAttachStacktrace()));
                }
            }
        }
    }

    private boolean shouldApplyScopeData(SentryBaseEvent sentryBaseEvent, Hint hint) {
        if (HintUtils.shouldApplyScopeData(hint)) {
            return true;
        }
        this.options.getLogger().log(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", sentryBaseEvent.getEventId());
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hostnameCache != null) {
            this.hostnameCache.close();
        }
    }

    public HostnameCache getHostnameCache() {
        return this.hostnameCache;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 0L;
    }

    public boolean isClosed() {
        if (this.hostnameCache != null) {
            return this.hostnameCache.isClosed();
        }
        return true;
    }

    @Override // io.sentry.EventProcessor
    public SentryLogEvent process(SentryLogEvent sentryLogEvent) {
        return sentryLogEvent;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        setCommons(sentryEvent);
        setExceptions(sentryEvent);
        setDebugMeta(sentryEvent);
        setModules(sentryEvent);
        if (shouldApplyScopeData(sentryEvent, hint)) {
            processNonCachedEvent(sentryEvent);
            setThreads(sentryEvent, hint);
        }
        return sentryEvent;
    }

    public MainEventProcessor(SentryOptions sentryOptions, SentryThreadFactory sentryThreadFactory, SentryExceptionFactory sentryExceptionFactory) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
        this.sentryThreadFactory = (SentryThreadFactory) Objects.requireNonNull(sentryThreadFactory, "The SentryThreadFactory is required.");
        this.sentryExceptionFactory = (SentryExceptionFactory) Objects.requireNonNull(sentryExceptionFactory, "The SentryExceptionFactory is required.");
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        setCommons(sentryTransaction);
        setDebugMeta(sentryTransaction);
        if (shouldApplyScopeData(sentryTransaction, hint)) {
            processNonCachedEvent(sentryTransaction);
        }
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    public SentryReplayEvent process(SentryReplayEvent sentryReplayEvent, Hint hint) {
        setCommons(sentryReplayEvent);
        if (shouldApplyScopeData(sentryReplayEvent, hint)) {
            processNonCachedEvent(sentryReplayEvent);
            SdkVersion sdkVersion = this.options.getSessionReplay().getSdkVersion();
            if (sdkVersion != null) {
                sentryReplayEvent.setSdk(sdkVersion);
            }
        }
        return sentryReplayEvent;
    }
}
