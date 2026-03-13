package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.sentry.DateUtils;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.IpAddressUtils;
import io.sentry.NoOpLogger;
import io.sentry.SentryAttributeType;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEventAttributeValue;
import io.sentry.SentryMetricsEvent;
import io.sentry.SentryReplayEvent;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.App;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import io.sentry.util.runtime.IRuntimeManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class DefaultAndroidEventProcessor implements EventProcessor {
    private final BuildInfoProvider buildInfoProvider;
    final Context context;
    private final LazyEvaluator<String> deviceFamily = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.android.core.N
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final Object evaluate() {
            return ContextUtils.getFamily(NoOpLogger.getInstance());
        }
    });
    final Future<DeviceInfoUtil> deviceInfoUtil;
    private final SentryAndroidOptions options;

    public DefaultAndroidEventProcessor(Context context, BuildInfoProvider buildInfoProvider, final SentryAndroidOptions sentryAndroidOptions) {
        Future<DeviceInfoUtil> futureSubmit;
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required.");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.O
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return DeviceInfoUtil.getInstance(this.f38485a.context, sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Device info caching task rejected.", e10);
            futureSubmit = null;
        }
        this.deviceInfoUtil = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void fixExceptionOrder(SentryEvent sentryEvent) {
        SentryStackTrace stacktrace;
        List<SentryStackFrame> frames;
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions == null || exceptions.size() <= 1) {
            return;
        }
        SentryException sentryException = exceptions.get(exceptions.size() - 1);
        if (!"java.lang".equals(sentryException.getModule()) || (stacktrace = sentryException.getStacktrace()) == null || (frames = stacktrace.getFrames()) == null) {
            return;
        }
        Iterator<SentryStackFrame> it = frames.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().getModule())) {
                Collections.reverse(exceptions);
                return;
            }
        }
    }

    private void mergeOS(SentryBaseEvent sentryBaseEvent) {
        String str;
        OperatingSystem operatingSystem = sentryBaseEvent.getContexts().getOperatingSystem();
        Future<DeviceInfoUtil> future = this.deviceInfoUtil;
        if (future != null) {
            try {
                sentryBaseEvent.getContexts().setOperatingSystem(future.get().getOperatingSystem());
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
            }
        } else {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
        }
        if (operatingSystem != null) {
            String name = operatingSystem.getName();
            if (name == null || name.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + name.trim().toLowerCase(Locale.ROOT);
            }
            sentryBaseEvent.getContexts().put(str, operatingSystem);
        }
    }

    private void mergeUser(SentryBaseEvent sentryBaseEvent) {
        User user = sentryBaseEvent.getUser();
        if (user == null) {
            user = new User();
            sentryBaseEvent.setUser(user);
        }
        if (user.getId() == null) {
            user.setId((String) this.options.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.Q
                @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
                public final Object run() {
                    return Installation.id(this.f38488a.context);
                }
            }));
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    private void processNonCachedEvent(SentryBaseEvent sentryBaseEvent, Hint hint) {
        App app2 = sentryBaseEvent.getContexts().getApp();
        if (app2 == null) {
            app2 = new App();
        }
        setAppExtras(app2, hint);
        setPackageInfo(sentryBaseEvent, app2);
        sentryBaseEvent.getContexts().setApp(app2);
    }

    private void setAppExtras(App app2, Hint hint) {
        Boolean boolIsInBackground;
        app2.setAppName(ContextUtils.getApplicationName(this.context));
        TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options);
        if (appStartTimeSpanWithFallback.hasStarted()) {
            app2.setAppStartTime(DateUtils.toUtilDate(appStartTimeSpanWithFallback.getStartTimestamp()));
        }
        if (HintUtils.isFromHybridSdk(hint) || app2.getInForeground() != null || (boolIsInBackground = AppState.getInstance().isInBackground()) == null) {
            return;
        }
        app2.setInForeground(Boolean.valueOf(!boolIsInBackground.booleanValue()));
    }

    private void setCommons(SentryBaseEvent sentryBaseEvent, boolean z10, boolean z11) {
        mergeUser(sentryBaseEvent);
        setDevice(sentryBaseEvent, z10, z11);
        setSideLoadedInfo(sentryBaseEvent);
    }

    private void setDevice(SentryBaseEvent sentryBaseEvent, boolean z10, boolean z11) {
        if (sentryBaseEvent.getContexts().getDevice() == null) {
            if (this.deviceInfoUtil != null) {
                try {
                    sentryBaseEvent.getContexts().setDevice(this.deviceInfoUtil.get().collectDeviceInformation(z10, z11));
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
                }
            } else {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            mergeOS(sentryBaseEvent);
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent, String str) {
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist(str);
        }
    }

    private void setOs(SentryLogEvent sentryLogEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryLogEvent.setAttribute("os.name", new SentryLogEventAttributeValue(sentryAttributeType, "Android"));
            sentryLogEvent.setAttribute("os.version", new SentryLogEventAttributeValue(sentryAttributeType, Build.VERSION.RELEASE));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
        }
    }

    private void setPackageInfo(SentryBaseEvent sentryBaseEvent, App app2) {
        DeviceInfoUtil deviceInfoUtil;
        PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, RecognitionOptions.AZTEC, this.options.getLogger(), this.buildInfoProvider);
        if (packageInfo != null) {
            setDist(sentryBaseEvent, ContextUtils.getVersionCode(packageInfo, this.buildInfoProvider));
            Future<DeviceInfoUtil> future = this.deviceInfoUtil;
            if (future != null) {
                try {
                    deviceInfoUtil = future.get();
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
                    deviceInfoUtil = null;
                }
                ContextUtils.setAppPackageInfo(packageInfo, this.buildInfoProvider, deviceInfoUtil, app2);
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            deviceInfoUtil = null;
            ContextUtils.setAppPackageInfo(packageInfo, this.buildInfoProvider, deviceInfoUtil, app2);
        }
    }

    private void setSideLoadedInfo(SentryBaseEvent sentryBaseEvent) {
        Future<DeviceInfoUtil> future = this.deviceInfoUtil;
        if (future == null) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            ContextUtils.SideLoadedInfo sideLoadedInfo = future.get().getSideLoadedInfo();
            if (sideLoadedInfo != null) {
                for (Map.Entry<String, String> entry : sideLoadedInfo.asTags().entrySet()) {
                    sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void setThreads(SentryEvent sentryEvent, Hint hint) {
        if (sentryEvent.getThreads() != null) {
            boolean zIsFromHybridSdk = HintUtils.isFromHybridSdk(hint);
            for (SentryThread sentryThread : sentryEvent.getThreads()) {
                boolean zIsMainThread = AndroidThreadChecker.getInstance().isMainThread(sentryThread);
                if (sentryThread.isCurrent() == null) {
                    sentryThread.setCurrent(Boolean.valueOf(zIsMainThread));
                }
                if (!zIsFromHybridSdk && sentryThread.isMain() == null) {
                    sentryThread.setMain(Boolean.valueOf(zIsMainThread));
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

    public User getDefaultUser(final Context context) {
        User user = new User();
        user.setId((String) this.options.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.P
            @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
            public final Object run() {
                return Installation.id(context);
            }
        }));
        return user;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 8000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        boolean zShouldApplyScopeData = shouldApplyScopeData(sentryEvent, hint);
        if (zShouldApplyScopeData) {
            processNonCachedEvent(sentryEvent, hint);
            setThreads(sentryEvent, hint);
        }
        setCommons(sentryEvent, true, zShouldApplyScopeData);
        fixExceptionOrder(sentryEvent);
        return sentryEvent;
    }

    private void setOs(SentryMetricsEvent sentryMetricsEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryMetricsEvent.setAttribute("os.name", new SentryLogEventAttributeValue(sentryAttributeType, "Android"));
            sentryMetricsEvent.setAttribute("os.version", new SentryLogEventAttributeValue(sentryAttributeType, Build.VERSION.RELEASE));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve os system", th);
        }
    }

    @Override // io.sentry.EventProcessor
    public SentryLogEvent process(SentryLogEvent sentryLogEvent) {
        setDevice(sentryLogEvent);
        setOs(sentryLogEvent);
        return sentryLogEvent;
    }

    private void setDevice(SentryLogEvent sentryLogEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryLogEvent.setAttribute("device.brand", new SentryLogEventAttributeValue(sentryAttributeType, Build.BRAND));
            sentryLogEvent.setAttribute("device.model", new SentryLogEventAttributeValue(sentryAttributeType, Build.MODEL));
            sentryLogEvent.setAttribute("device.family", new SentryLogEventAttributeValue(sentryAttributeType, this.deviceFamily.getValue()));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
        }
    }

    @Override // io.sentry.EventProcessor
    public SentryMetricsEvent process(SentryMetricsEvent sentryMetricsEvent, Hint hint) {
        setDevice(sentryMetricsEvent);
        setOs(sentryMetricsEvent);
        return sentryMetricsEvent;
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        boolean zShouldApplyScopeData = shouldApplyScopeData(sentryTransaction, hint);
        if (zShouldApplyScopeData) {
            processNonCachedEvent(sentryTransaction, hint);
        }
        setCommons(sentryTransaction, false, zShouldApplyScopeData);
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    public SentryReplayEvent process(SentryReplayEvent sentryReplayEvent, Hint hint) {
        boolean zShouldApplyScopeData = shouldApplyScopeData(sentryReplayEvent, hint);
        if (zShouldApplyScopeData) {
            processNonCachedEvent(sentryReplayEvent, hint);
        }
        setCommons(sentryReplayEvent, false, zShouldApplyScopeData);
        return sentryReplayEvent;
    }

    private void setDevice(SentryMetricsEvent sentryMetricsEvent) {
        try {
            SentryAttributeType sentryAttributeType = SentryAttributeType.STRING;
            sentryMetricsEvent.setAttribute("device.brand", new SentryLogEventAttributeValue(sentryAttributeType, Build.BRAND));
            sentryMetricsEvent.setAttribute("device.model", new SentryLogEventAttributeValue(sentryAttributeType, Build.MODEL));
            sentryMetricsEvent.setAttribute("device.family", new SentryLogEventAttributeValue(sentryAttributeType, this.deviceFamily.getValue()));
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve device info", th);
        }
    }
}
