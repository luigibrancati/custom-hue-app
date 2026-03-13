package io.sentry;

import io.sentry.SentryBaseEvent;
import io.sentry.SentryOptions;
import io.sentry.config.PropertiesProvider;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ExternalOptions {
    private static final String PROXY_PORT_DEFAULT = "80";
    private Boolean captureOpenTelemetryEvents;
    private SentryOptions.Cron cron;
    private Boolean debug;
    private String dist;
    private String dsn;
    private Boolean enableBackpressureHandling;
    private Boolean enableDatabaseTransactionTracing;
    private Boolean enableDeduplication;
    private Boolean enableLogs;
    private Boolean enableMetrics;
    private Boolean enablePrettySerializationOutput;
    private Boolean enableSpotlight;
    private Boolean enableUncaughtExceptionHandler;
    private Boolean enabled;
    private String environment;
    private Boolean forceInit;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<String> ignoredCheckIns;
    private List<String> ignoredErrors;
    private List<String> ignoredTransactions;
    private SentryOptions.RequestSize maxRequestBodySize;
    private Boolean printUncaughtStackTrace;
    private ProfileLifecycle profileLifecycle;
    private Double profileSessionSampleRate;
    private Double profilesSampleRate;
    private String profilingTracesDirPath;
    private String proguardUuid;
    private SentryOptions.Proxy proxy;
    private String release;
    private Boolean sendClientReports;
    private Boolean sendDefaultPii;
    private Boolean sendModules;
    private String serverName;
    private String spotlightConnectionUrl;
    private Double tracesSampleRate;
    private final Map<String, String> tags = new ConcurrentHashMap();
    private final List<String> inAppExcludes = new CopyOnWriteArrayList();
    private final List<String> inAppIncludes = new CopyOnWriteArrayList();
    private List<String> tracePropagationTargets = null;
    private final List<String> contextTags = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private Set<String> bundleIds = new CopyOnWriteArraySet();

    /* JADX WARN: Multi-variable type inference failed */
    public static ExternalOptions from(PropertiesProvider propertiesProvider, ILogger iLogger) {
        ExternalOptions externalOptions = new ExternalOptions();
        externalOptions.setDsn(propertiesProvider.getProperty("dsn"));
        externalOptions.setEnvironment(propertiesProvider.getProperty("environment"));
        externalOptions.setRelease(propertiesProvider.getProperty("release"));
        externalOptions.setDist(propertiesProvider.getProperty(SentryBaseEvent.JsonKeys.DIST));
        externalOptions.setServerName(propertiesProvider.getProperty("servername"));
        externalOptions.setEnableUncaughtExceptionHandler(propertiesProvider.getBooleanProperty("uncaught.handler.enabled"));
        externalOptions.setPrintUncaughtStackTrace(propertiesProvider.getBooleanProperty("uncaught.handler.print-stacktrace"));
        externalOptions.setTracesSampleRate(propertiesProvider.getDoubleProperty("traces-sample-rate"));
        externalOptions.setProfilesSampleRate(propertiesProvider.getDoubleProperty("profiles-sample-rate"));
        externalOptions.setDebug(propertiesProvider.getBooleanProperty("debug"));
        externalOptions.setEnableDeduplication(propertiesProvider.getBooleanProperty("enable-deduplication"));
        externalOptions.setSendClientReports(propertiesProvider.getBooleanProperty("send-client-reports"));
        externalOptions.setForceInit(propertiesProvider.getBooleanProperty("force-init"));
        String property = propertiesProvider.getProperty("max-request-body-size");
        if (property != null) {
            externalOptions.setMaxRequestBodySize(SentryOptions.RequestSize.valueOf(property.toUpperCase(Locale.ROOT)));
        }
        for (Map.Entry<String, String> entry : propertiesProvider.getMap("tags").entrySet()) {
            externalOptions.setTag(entry.getKey(), entry.getValue());
        }
        String property2 = propertiesProvider.getProperty("proxy.host");
        String property3 = propertiesProvider.getProperty("proxy.user");
        String property4 = propertiesProvider.getProperty("proxy.pass");
        String property5 = propertiesProvider.getProperty("proxy.port", PROXY_PORT_DEFAULT);
        if (property2 != null) {
            externalOptions.setProxy(new SentryOptions.Proxy(property2, property5, property3, property4));
        }
        Iterator<String> it = propertiesProvider.getList("in-app-includes").iterator();
        while (it.hasNext()) {
            externalOptions.addInAppInclude(it.next());
        }
        Iterator<String> it2 = propertiesProvider.getList("in-app-excludes").iterator();
        while (it2.hasNext()) {
            externalOptions.addInAppExclude(it2.next());
        }
        List<String> list = propertiesProvider.getProperty("trace-propagation-targets") != null ? propertiesProvider.getList("trace-propagation-targets") : null;
        if (list == null && propertiesProvider.getProperty("tracing-origins") != null) {
            list = propertiesProvider.getList("tracing-origins");
        }
        if (list != null) {
            Iterator<String> it3 = list.iterator();
            while (it3.hasNext()) {
                externalOptions.addTracePropagationTarget(it3.next());
            }
        }
        Iterator<String> it4 = propertiesProvider.getList("context-tags").iterator();
        while (it4.hasNext()) {
            externalOptions.addContextTag(it4.next());
        }
        externalOptions.setProguardUuid(propertiesProvider.getProperty("proguard-uuid"));
        Iterator<String> it5 = propertiesProvider.getList("bundle-ids").iterator();
        while (it5.hasNext()) {
            externalOptions.addBundleId(it5.next());
        }
        externalOptions.setIdleTimeout(propertiesProvider.getLongProperty("idle-timeout"));
        externalOptions.setIgnoredErrors(propertiesProvider.getListOrNull("ignored-errors"));
        externalOptions.setEnabled(propertiesProvider.getBooleanProperty("enabled"));
        externalOptions.setEnablePrettySerializationOutput(propertiesProvider.getBooleanProperty("enable-pretty-serialization-output"));
        externalOptions.setSendModules(propertiesProvider.getBooleanProperty("send-modules"));
        externalOptions.setSendDefaultPii(propertiesProvider.getBooleanProperty("send-default-pii"));
        externalOptions.setIgnoredCheckIns(propertiesProvider.getListOrNull("ignored-checkins"));
        externalOptions.setIgnoredTransactions(propertiesProvider.getListOrNull("ignored-transactions"));
        externalOptions.setEnableBackpressureHandling(propertiesProvider.getBooleanProperty("enable-backpressure-handling"));
        externalOptions.setEnableDatabaseTransactionTracing(propertiesProvider.getBooleanProperty("enable-database-transaction-tracing"));
        externalOptions.setGlobalHubMode(propertiesProvider.getBooleanProperty("global-hub-mode"));
        externalOptions.setCaptureOpenTelemetryEvents(propertiesProvider.getBooleanProperty("capture-open-telemetry-events"));
        externalOptions.setEnableLogs(propertiesProvider.getBooleanProperty("logs.enabled"));
        externalOptions.setEnableMetrics(propertiesProvider.getBooleanProperty("metrics.enabled"));
        for (String str : propertiesProvider.getList("ignored-exceptions-for-type")) {
            try {
                Class<?> cls = Class.forName(str);
                if (Throwable.class.isAssignableFrom(cls)) {
                    externalOptions.addIgnoredExceptionForType(cls);
                } else {
                    iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str, str);
                }
            } catch (ClassNotFoundException unused) {
                iLogger.log(SentryLevel.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str, str);
            }
        }
        Long longProperty = propertiesProvider.getLongProperty("cron.default-checkin-margin");
        Long longProperty2 = propertiesProvider.getLongProperty("cron.default-max-runtime");
        String property6 = propertiesProvider.getProperty("cron.default-timezone");
        Long longProperty3 = propertiesProvider.getLongProperty("cron.default-failure-issue-threshold");
        Long longProperty4 = propertiesProvider.getLongProperty("cron.default-recovery-threshold");
        if (longProperty != null || longProperty2 != null || property6 != null || longProperty3 != null || longProperty4 != null) {
            SentryOptions.Cron cron = new SentryOptions.Cron();
            cron.setDefaultCheckinMargin(longProperty);
            cron.setDefaultMaxRuntime(longProperty2);
            cron.setDefaultTimezone(property6);
            cron.setDefaultFailureIssueThreshold(longProperty3);
            cron.setDefaultRecoveryThreshold(longProperty4);
            externalOptions.setCron(cron);
        }
        externalOptions.setEnableSpotlight(propertiesProvider.getBooleanProperty("enable-spotlight"));
        externalOptions.setSpotlightConnectionUrl(propertiesProvider.getProperty("spotlight-connection-url"));
        externalOptions.setProfileSessionSampleRate(propertiesProvider.getDoubleProperty("profile-session-sample-rate"));
        externalOptions.setProfilingTracesDirPath(propertiesProvider.getProperty("profiling-traces-dir-path"));
        String property7 = propertiesProvider.getProperty("profile-lifecycle");
        if (property7 != null && !property7.isEmpty()) {
            externalOptions.setProfileLifecycle(ProfileLifecycle.valueOf(property7.toUpperCase()));
        }
        return externalOptions;
    }

    public void addBundleId(String str) {
        this.bundleIds.add(str);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addTracePropagationTarget(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public SentryOptions.Cron getCron() {
        return this.cron;
    }

    public Boolean getDebug() {
        return this.debug;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableDeduplication() {
        return this.enableDeduplication;
    }

    public Boolean getEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<String> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public SentryOptions.RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public Boolean getPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public ProfileLifecycle getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public String getProfilingTracesDirPath() {
        return this.profilingTracesDirPath;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public SentryOptions.Proxy getProxy() {
        return this.proxy;
    }

    public String getRelease() {
        return this.release;
    }

    public Boolean getSendClientReports() {
        return this.sendClientReports;
    }

    public String getServerName() {
        return this.serverName;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        return this.tracePropagationTargets;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public Boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public Boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public Boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public Boolean isEnableLogs() {
        return this.enableLogs;
    }

    public Boolean isEnableMetrics() {
        return this.enableMetrics;
    }

    public Boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public Boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public Boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public Boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public Boolean isSendModules() {
        return this.sendModules;
    }

    public void setCaptureOpenTelemetryEvents(Boolean bool) {
        this.captureOpenTelemetryEvents = bool;
    }

    public void setCron(SentryOptions.Cron cron) {
        this.cron = cron;
    }

    public void setDebug(Boolean bool) {
        this.debug = bool;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
    }

    public void setEnableBackpressureHandling(Boolean bool) {
        this.enableBackpressureHandling = bool;
    }

    public void setEnableDatabaseTransactionTracing(Boolean bool) {
        this.enableDatabaseTransactionTracing = bool;
    }

    public void setEnableDeduplication(Boolean bool) {
        this.enableDeduplication = bool;
    }

    public void setEnableLogs(Boolean bool) {
        this.enableLogs = bool;
    }

    public void setEnableMetrics(Boolean bool) {
        this.enableMetrics = bool;
    }

    public void setEnablePrettySerializationOutput(Boolean bool) {
        this.enablePrettySerializationOutput = bool;
    }

    public void setEnableSpotlight(Boolean bool) {
        this.enableSpotlight = bool;
    }

    public void setEnableUncaughtExceptionHandler(Boolean bool) {
        this.enableUncaughtExceptionHandler = bool;
    }

    public void setEnabled(Boolean bool) {
        this.enabled = bool;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setForceInit(Boolean bool) {
        this.forceInit = bool;
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l10) {
        this.idleTimeout = l10;
    }

    public void setIgnoredCheckIns(List<String> list) {
        this.ignoredCheckIns = list;
    }

    public void setIgnoredErrors(List<String> list) {
        this.ignoredErrors = list;
    }

    public void setIgnoredTransactions(List<String> list) {
        this.ignoredTransactions = list;
    }

    public void setMaxRequestBodySize(SentryOptions.RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setPrintUncaughtStackTrace(Boolean bool) {
        this.printUncaughtStackTrace = bool;
    }

    public void setProfileLifecycle(ProfileLifecycle profileLifecycle) {
        this.profileLifecycle = profileLifecycle;
    }

    public void setProfileSessionSampleRate(Double d10) {
        this.profileSessionSampleRate = d10;
    }

    public void setProfilesSampleRate(Double d10) {
        this.profilesSampleRate = d10;
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(SentryOptions.Proxy proxy) {
        this.proxy = proxy;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSendClientReports(Boolean bool) {
        this.sendClientReports = bool;
    }

    public void setSendDefaultPii(Boolean bool) {
        this.sendDefaultPii = bool;
    }

    public void setSendModules(Boolean bool) {
        this.sendModules = bool;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTracesSampleRate(Double d10) {
        this.tracesSampleRate = d10;
    }
}
