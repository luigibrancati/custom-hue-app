package io.sentry.android.core;

import android.app.Activity;
import io.sentry.Hint;
import io.sentry.Sentry;
import io.sentry.SentryEvent;
import io.sentry.SentryFeedbackOptions;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.SentryUserFeedbackDialog;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryAndroidOptions extends SentryOptions {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private BeforeCaptureCallback beforeScreenshotCaptureCallback;
    private BeforeCaptureCallback beforeViewHierarchyCaptureCallback;
    private SentryFrameMetricsCollector frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private IDebugImagesLoader debugImagesLoader = NoOpDebugImagesLoader.getInstance();
    private boolean collectAdditionalContext = true;
    private boolean collectExternalStorageContext = false;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;
    private NdkHandlerStrategy ndkHandlerStrategy = NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean enableSystemEventBreadcrumbsExtras = false;
    private boolean reportHistoricalAnrs = false;
    private boolean reportHistoricalTombstones = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;
    private boolean enableTombstone = false;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class AndroidUserFeedbackIDialogHandler implements SentryFeedbackOptions.IDialogHandler {
        @Override // io.sentry.SentryFeedbackOptions.IDialogHandler
        public void showDialog(SentryId sentryId, SentryFeedbackOptions.OptionsConfigurator optionsConfigurator) {
            Activity activity = CurrentActivityHolder.getInstance().getActivity();
            if (activity == null) {
                Sentry.getCurrentScopes().getOptions().getLogger().log(SentryLevel.ERROR, "Cannot show user feedback dialog, no activity is available. Make sure to call SentryAndroid.init() in your Application.onCreate() method.", new Object[0]);
            } else {
                new SentryUserFeedbackDialog.Builder(activity).associatedEventId(sentryId).configurator(optionsConfigurator).create().show();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface BeforeCaptureCallback {
        boolean execute(SentryEvent sentryEvent, Hint hint, boolean z10);
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.32.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private SdkVersion createSdkVersion() {
        SdkVersion sdkVersionUpdateSdkVersion = SdkVersion.updateSdkVersion(getSdkVersion(), BuildConfig.SENTRY_ANDROID_SDK_NAME, "8.32.0");
        sdkVersionUpdateSdkVersion.addPackage("maven:io.sentry:sentry-android-core", "8.32.0");
        return sdkVersionUpdateSdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z10) {
        this.enableActivityLifecycleBreadcrumbs = z10;
        this.enableAppComponentBreadcrumbs = z10;
        this.enableSystemEventBreadcrumbs = z10;
        this.enableAppLifecycleBreadcrumbs = z10;
        this.enableNetworkEventBreadcrumbs = z10;
        setEnableUserInteractionBreadcrumbs(z10);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public BeforeCaptureCallback getBeforeScreenshotCaptureCallback() {
        return this.beforeScreenshotCaptureCallback;
    }

    public BeforeCaptureCallback getBeforeViewHierarchyCaptureCallback() {
        return this.beforeViewHierarchyCaptureCallback;
    }

    public IDebugImagesLoader getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public SentryFrameMetricsCollector getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isCollectExternalStorageContext() {
        return this.collectExternalStorageContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public boolean isReportHistoricalTombstones() {
        return this.reportHistoricalTombstones;
    }

    public boolean isTombstoneEnabled() {
        return this.enableTombstone;
    }

    public void setAnrEnabled(boolean z10) {
        this.anrEnabled = z10;
    }

    public void setAnrReportInDebug(boolean z10) {
        this.anrReportInDebug = z10;
    }

    public void setAnrTimeoutIntervalMillis(long j10) {
        this.anrTimeoutIntervalMillis = j10;
    }

    public void setAttachAnrThreadDump(boolean z10) {
        this.attachAnrThreadDump = z10;
    }

    public void setAttachScreenshot(boolean z10) {
        this.attachScreenshot = z10;
    }

    public void setAttachViewHierarchy(boolean z10) {
        this.attachViewHierarchy = z10;
    }

    public void setBeforeScreenshotCaptureCallback(BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeScreenshotCaptureCallback = beforeCaptureCallback;
    }

    public void setBeforeViewHierarchyCaptureCallback(BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeViewHierarchyCaptureCallback = beforeCaptureCallback;
    }

    public void setCollectAdditionalContext(boolean z10) {
        this.collectAdditionalContext = z10;
    }

    public void setCollectExternalStorageContext(boolean z10) {
        this.collectExternalStorageContext = z10;
    }

    public void setDebugImagesLoader(IDebugImagesLoader iDebugImagesLoader) {
        if (iDebugImagesLoader == null) {
            iDebugImagesLoader = NoOpDebugImagesLoader.getInstance();
        }
        this.debugImagesLoader = iDebugImagesLoader;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z10) {
        this.enableActivityLifecycleBreadcrumbs = z10;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z10) {
        this.enableActivityLifecycleTracingAutoFinish = z10;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z10) {
        this.enableAppComponentBreadcrumbs = z10;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z10) {
        this.enableAppLifecycleBreadcrumbs = z10;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z10) {
        this.enableAutoActivityLifecycleTracing = z10;
    }

    public void setEnableAutoTraceIdGeneration(boolean z10) {
        this.enableAutoTraceIdGeneration = z10;
    }

    public void setEnableFramesTracking(boolean z10) {
        this.enableFramesTracking = z10;
    }

    public void setEnableNdk(boolean z10) {
        this.enableNdk = z10;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z10) {
        this.enableNetworkEventBreadcrumbs = z10;
    }

    public void setEnablePerformanceV2(boolean z10) {
        this.enablePerformanceV2 = z10;
    }

    public void setEnableRootCheck(boolean z10) {
        this.enableRootCheck = z10;
    }

    public void setEnableScopeSync(boolean z10) {
        this.enableScopeSync = z10;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z10) {
        this.enableSystemEventBreadcrumbs = z10;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z10) {
        this.enableSystemEventBreadcrumbsExtras = z10;
    }

    public void setFrameMetricsCollector(SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this.frameMetricsCollector = sentryFrameMetricsCollector;
    }

    public void setNativeHandlerStrategy(NdkHandlerStrategy ndkHandlerStrategy) {
        this.ndkHandlerStrategy = ndkHandlerStrategy;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z10) {
        this.reportHistoricalAnrs = z10;
    }

    public void setReportHistoricalTombstones(boolean z10) {
        this.reportHistoricalTombstones = z10;
    }

    public void setStartupCrashFlushTimeoutMillis(long j10) {
        this.startupCrashFlushTimeoutMillis = j10;
    }

    public void setTombstoneEnabled(boolean z10) {
        this.enableTombstone = z10;
    }
}
