package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.InitPriority;
import io.sentry.ProfileLifecycle;
import io.sentry.ScreenshotStrategyType;
import io.sentry.SentryFeedbackOptions;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryReplayOptions;
import io.sentry.protocol.SdkVersion;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class ManifestMetadataReader {
    static final String ANR_ATTACH_THREAD_DUMPS = "io.sentry.anr.attach-thread-dumps";
    static final String ANR_ENABLE = "io.sentry.anr.enable";
    static final String ANR_REPORT_DEBUG = "io.sentry.anr.report-debug";
    static final String ANR_TIMEOUT_INTERVAL_MILLIS = "io.sentry.anr.timeout-interval-millis";
    static final String ATTACH_SCREENSHOT = "io.sentry.attach-screenshot";
    static final String ATTACH_THREADS = "io.sentry.attach-threads";
    static final String ATTACH_VIEW_HIERARCHY = "io.sentry.attach-view-hierarchy";
    static final String AUTO_INIT = "io.sentry.auto-init";
    static final String AUTO_SESSION_TRACKING_ENABLE = "io.sentry.auto-session-tracking.enable";
    static final String BREADCRUMBS_ACTIVITY_LIFECYCLE_ENABLE = "io.sentry.breadcrumbs.activity-lifecycle";
    static final String BREADCRUMBS_APP_COMPONENTS_ENABLE = "io.sentry.breadcrumbs.app-components";
    static final String BREADCRUMBS_APP_LIFECYCLE_ENABLE = "io.sentry.breadcrumbs.app-lifecycle";
    static final String BREADCRUMBS_NETWORK_EVENTS_ENABLE = "io.sentry.breadcrumbs.network-events";
    static final String BREADCRUMBS_SYSTEM_EVENTS_ENABLE = "io.sentry.breadcrumbs.system-events";
    static final String BREADCRUMBS_USER_INTERACTION_ENABLE = "io.sentry.breadcrumbs.user-interaction";
    static final String CLIENT_REPORTS_ENABLE = "io.sentry.send-client-reports";
    static final String COLLECT_ADDITIONAL_CONTEXT = "io.sentry.additional-context";
    static final String COLLECT_EXTERNAL_STORAGE_CONTEXT = "io.sentry.external-storage-context";
    static final String DEADLINE_TIMEOUT = "io.sentry.traces.deadline-timeout";
    static final String DEBUG = "io.sentry.debug";
    static final String DEBUG_LEVEL = "io.sentry.debug.level";
    static final String DSN = "io.sentry.dsn";
    static final String ENABLE_APP_START_PROFILING = "io.sentry.profiling.enable-app-start";
    static final String ENABLE_AUTO_TRACE_ID_GENERATION = "io.sentry.traces.enable-auto-id-generation";
    static final String ENABLE_LOGS = "io.sentry.logs.enabled";
    static final String ENABLE_METRICS = "io.sentry.metrics.enabled";
    static final String ENABLE_PERFORMANCE_V2 = "io.sentry.performance-v2.enable";
    static final String ENABLE_ROOT_CHECK = "io.sentry.enable-root-check";
    static final String ENABLE_SCOPE_PERSISTENCE = "io.sentry.enable-scope-persistence";
    static final String ENABLE_SENTRY = "io.sentry.enabled";
    static final String ENVIRONMENT = "io.sentry.environment";
    static final String FEEDBACK_EMAIL_REQUIRED = "io.sentry.feedback.is-email-required";
    static final String FEEDBACK_NAME_REQUIRED = "io.sentry.feedback.is-name-required";
    static final String FEEDBACK_SHOW_BRANDING = "io.sentry.feedback.show-branding";
    static final String FEEDBACK_SHOW_EMAIL = "io.sentry.feedback.show-email";
    static final String FEEDBACK_SHOW_NAME = "io.sentry.feedback.show-name";
    static final String FEEDBACK_USE_SENTRY_USER = "io.sentry.feedback.use-sentry-user";
    static final String FORCE_INIT = "io.sentry.force-init";
    static final String IDLE_TIMEOUT = "io.sentry.traces.idle-timeout";
    static final String IGNORED_ERRORS = "io.sentry.ignored-errors";
    static final String IN_APP_EXCLUDES = "io.sentry.in-app-excludes";
    static final String IN_APP_INCLUDES = "io.sentry.in-app-includes";
    static final String MAX_BREADCRUMBS = "io.sentry.max-breadcrumbs";
    static final String NDK_ENABLE = "io.sentry.ndk.enable";
    static final String NDK_SCOPE_SYNC_ENABLE = "io.sentry.ndk.scope-sync.enable";
    static final String NDK_SDK_NAME = "io.sentry.ndk.sdk-name";
    static final String PERFORM_FRAMES_TRACKING = "io.sentry.traces.frames-tracking";
    static final String PROFILER_START_ON_APP_START = "io.sentry.traces.profiling.start-on-app-start";
    static final String PROFILES_SAMPLE_RATE = "io.sentry.traces.profiling.sample-rate";
    static final String PROFILE_LIFECYCLE = "io.sentry.traces.profiling.lifecycle";
    static final String PROFILE_SESSION_SAMPLE_RATE = "io.sentry.traces.profiling.session-sample-rate";
    static final String PROGUARD_UUID = "io.sentry.proguard-uuid";
    static final String RELEASE = "io.sentry.release";
    static final String REPLAYS_DEBUG = "io.sentry.session-replay.debug";
    static final String REPLAYS_ERROR_SAMPLE_RATE = "io.sentry.session-replay.on-error-sample-rate";
    static final String REPLAYS_MASK_ALL_IMAGES = "io.sentry.session-replay.mask-all-images";
    static final String REPLAYS_MASK_ALL_TEXT = "io.sentry.session-replay.mask-all-text";
    static final String REPLAYS_NETWORK_CAPTURE_BODIES = "io.sentry.session-replay.network-capture-bodies";
    static final String REPLAYS_NETWORK_DETAIL_ALLOW_URLS = "io.sentry.session-replay.network-detail-allow-urls";
    static final String REPLAYS_NETWORK_DETAIL_DENY_URLS = "io.sentry.session-replay.network-detail-deny-urls";
    static final String REPLAYS_NETWORK_REQUEST_HEADERS = "io.sentry.session-replay.network-request-headers";
    static final String REPLAYS_NETWORK_RESPONSE_HEADERS = "io.sentry.session-replay.network-response-headers";
    static final String REPLAYS_SCREENSHOT_STRATEGY = "io.sentry.session-replay.screenshot-strategy";
    static final String REPLAYS_SESSION_SAMPLE_RATE = "io.sentry.session-replay.session-sample-rate";
    static final String SAMPLE_RATE = "io.sentry.sample-rate";
    static final String SDK_NAME = "io.sentry.sdk.name";
    static final String SDK_VERSION = "io.sentry.sdk.version";
    static final String SEND_DEFAULT_PII = "io.sentry.send-default-pii";
    static final String SEND_MODULES = "io.sentry.send-modules";
    static final String SENTRY_GRADLE_PLUGIN_INTEGRATIONS = "io.sentry.gradle-plugin-integrations";
    static final String SESSION_TRACKING_TIMEOUT_INTERVAL_MILLIS = "io.sentry.session-tracking.timeout-interval-millis";
    static final String SPOTLIGHT_CONNECTION_URL = "io.sentry.spotlight.url";
    static final String SPOTLIGHT_ENABLE = "io.sentry.spotlight.enable";
    static final String TOMBSTONE_ENABLE = "io.sentry.tombstone.enable";
    static final String TRACES_ACTIVITY_AUTO_FINISH_ENABLE = "io.sentry.traces.activity.auto-finish.enable";
    static final String TRACES_ACTIVITY_ENABLE = "io.sentry.traces.activity.enable";
    static final String TRACES_SAMPLE_RATE = "io.sentry.traces.sample-rate";
    static final String TRACES_UI_ENABLE = "io.sentry.traces.user-interaction.enable";
    static final String TRACE_PROPAGATION_TARGETS = "io.sentry.traces.trace-propagation-targets";
    static final String TRACE_SAMPLING = "io.sentry.traces.trace-sampling";
    static final String TTFD_ENABLE = "io.sentry.traces.time-to-full-display.enable";
    static final String UNCAUGHT_EXCEPTION_HANDLER_ENABLE = "io.sentry.uncaught-exception-handler.enable";

    private ManifestMetadataReader() {
    }

    public static void applyMetadata(Context context, SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        Objects.requireNonNull(context, "The application context is required.");
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle metadata = getMetadata(context, sentryAndroidOptions.getLogger(), buildInfoProvider);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (metadata != null) {
                sentryAndroidOptions.setDebug(readBool(metadata, logger, DEBUG, sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String string = readString(metadata, logger, DEBUG_LEVEL, strName.toLowerCase(locale));
                    if (string != null) {
                        sentryAndroidOptions.setDiagnosticLevel(SentryLevel.valueOf(string.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(readBool(metadata, logger, ANR_ENABLE, sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setTombstoneEnabled(readBool(metadata, logger, TOMBSTONE_ENABLE, sentryAndroidOptions.isTombstoneEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(readBool(metadata, logger, AUTO_SESSION_TRACKING_ENABLE, sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double d10 = readDouble(metadata, logger, SAMPLE_RATE);
                    if (d10 != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(d10));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(readBool(metadata, logger, ANR_REPORT_DEBUG, sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(readLong(metadata, logger, ANR_TIMEOUT_INTERVAL_MILLIS, sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(readBool(metadata, logger, ANR_ATTACH_THREAD_DUMPS, sentryAndroidOptions.isAttachAnrThreadDump()));
                String string2 = readString(metadata, logger, DSN, sentryAndroidOptions.getDsn());
                boolean bool = readBool(metadata, logger, ENABLE_SENTRY, sentryAndroidOptions.isEnabled());
                if (!bool || (string2 != null && string2.isEmpty())) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (string2 == null) {
                    sentryAndroidOptions.getLogger().log(SentryLevel.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(bool);
                sentryAndroidOptions.setDsn(string2);
                sentryAndroidOptions.setEnableNdk(readBool(metadata, logger, NDK_ENABLE, sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(readBool(metadata, logger, NDK_SCOPE_SYNC_ENABLE, sentryAndroidOptions.isEnableScopeSync()));
                String string3 = readString(metadata, logger, NDK_SDK_NAME, sentryAndroidOptions.getNativeSdkName());
                if (string3 != null) {
                    sentryAndroidOptions.setNativeSdkName(string3);
                }
                sentryAndroidOptions.setRelease(readString(metadata, logger, RELEASE, sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(readString(metadata, logger, ENVIRONMENT, sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(readLong(metadata, logger, SESSION_TRACKING_TIMEOUT_INTERVAL_MILLIS, sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) readLong(metadata, logger, MAX_BREADCRUMBS, sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_ACTIVITY_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_SYSTEM_EVENTS_ENABLE, sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_COMPONENTS_ENABLE, sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_USER_INTERACTION_ENABLE, sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_NETWORK_EVENTS_ENABLE, sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(readBool(metadata, logger, UNCAUGHT_EXCEPTION_HANDLER_ENABLE, sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(readBool(metadata, logger, ATTACH_THREADS, sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(readBool(metadata, logger, ATTACH_SCREENSHOT, sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(readBool(metadata, logger, ATTACH_VIEW_HIERARCHY, sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(readBool(metadata, logger, CLIENT_REPORTS_ENABLE, sentryAndroidOptions.isSendClientReports()));
                if (readBool(metadata, logger, AUTO_INIT, true)) {
                    sentryAndroidOptions.setInitPriority(InitPriority.LOW);
                }
                sentryAndroidOptions.setForceInit(readBool(metadata, logger, FORCE_INIT, sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(readBool(metadata, logger, COLLECT_ADDITIONAL_CONTEXT, sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(readBool(metadata, logger, COLLECT_EXTERNAL_STORAGE_CONTEXT, sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double d11 = readDouble(metadata, logger, TRACES_SAMPLE_RATE);
                    if (d11 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(d11));
                    }
                }
                sentryAndroidOptions.setTraceSampling(readBool(metadata, logger, TRACE_SAMPLING, sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(readBool(metadata, logger, TRACES_ACTIVITY_ENABLE, sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(readBool(metadata, logger, TRACES_ACTIVITY_AUTO_FINISH_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double d12 = readDouble(metadata, logger, PROFILES_SAMPLE_RATE);
                    if (d12 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(d12));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double d13 = readDouble(metadata, logger, PROFILE_SESSION_SAMPLE_RATE);
                    if (d13 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d13));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String string4 = readString(metadata, logger, PROFILE_LIFECYCLE, strName2.toLowerCase(locale2));
                if (string4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(ProfileLifecycle.valueOf(string4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(readBool(metadata, logger, PROFILER_START_ON_APP_START, sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(readBool(metadata, logger, TRACES_UI_ENABLE, sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(readBool(metadata, logger, TTFD_ENABLE, sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long j10 = readLong(metadata, logger, IDLE_TIMEOUT, -1L);
                if (j10 != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(j10));
                }
                List<String> list5 = readList(metadata, logger, TRACE_PROPAGATION_TARGETS);
                if (metadata.containsKey(TRACE_PROPAGATION_TARGETS) && list5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (list5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(list5);
                }
                sentryAndroidOptions.setEnableFramesTracking(readBool(metadata, logger, PERFORM_FRAMES_TRACKING, true));
                sentryAndroidOptions.setProguardUuid(readString(metadata, logger, PROGUARD_UUID, sentryAndroidOptions.getProguardUuid()));
                SdkVersion sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new SdkVersion("", "");
                }
                sdkVersion.setName(readStringNotNull(metadata, logger, SDK_NAME, sdkVersion.getName()));
                sdkVersion.setVersion(readStringNotNull(metadata, logger, SDK_VERSION, sdkVersion.getVersion()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(readBool(metadata, logger, SEND_DEFAULT_PII, sentryAndroidOptions.isSendDefaultPii()));
                List<String> list6 = readList(metadata, logger, SENTRY_GRADLE_PLUGIN_INTEGRATIONS);
                if (list6 != null) {
                    Iterator<String> it = list6.iterator();
                    while (it.hasNext()) {
                        SentryIntegrationPackageStorage.getInstance().addIntegration(it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(readBool(metadata, logger, ENABLE_ROOT_CHECK, sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(readBool(metadata, logger, SEND_MODULES, sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(readBool(metadata, logger, ENABLE_PERFORMANCE_V2, sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(readBool(metadata, logger, ENABLE_APP_START_PROFILING, sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(readBool(metadata, logger, ENABLE_SCOPE_PERSISTENCE, sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(readBool(metadata, logger, ENABLE_AUTO_TRACE_ID_GENERATION, sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(readLong(metadata, logger, DEADLINE_TIMEOUT, sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().getSessionSampleRate() == null) {
                    double d14 = readDouble(metadata, logger, REPLAYS_SESSION_SAMPLE_RATE);
                    if (d14 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().setSessionSampleRate(Double.valueOf(d14));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().getOnErrorSampleRate() == null) {
                    double d15 = readDouble(metadata, logger, REPLAYS_ERROR_SAMPLE_RATE);
                    if (d15 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().setOnErrorSampleRate(Double.valueOf(d15));
                    }
                }
                sentryAndroidOptions.getSessionReplay().setMaskAllText(readBool(metadata, logger, REPLAYS_MASK_ALL_TEXT, true));
                sentryAndroidOptions.getSessionReplay().setMaskAllImages(readBool(metadata, logger, REPLAYS_MASK_ALL_IMAGES, true));
                sentryAndroidOptions.getSessionReplay().setDebug(readBool(metadata, logger, REPLAYS_DEBUG, false));
                String string5 = readString(metadata, logger, REPLAYS_SCREENSHOT_STRATEGY, null);
                if (string5 != null) {
                    if ("canvas".equals(string5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().setScreenshotStrategy(ScreenshotStrategyType.CANVAS);
                    } else {
                        sentryAndroidOptions.getSessionReplay().setScreenshotStrategy(ScreenshotStrategyType.PIXEL_COPY);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().getNetworkDetailAllowUrls().isEmpty() && (list4 = readList(metadata, logger, REPLAYS_NETWORK_DETAIL_ALLOW_URLS)) != null && !list4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = it2.next().trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().setNetworkDetailAllowUrls(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().getNetworkDetailDenyUrls().isEmpty() && (list3 = readList(metadata, logger, REPLAYS_NETWORK_DETAIL_DENY_URLS)) != null && !list3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = it3.next().trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().setNetworkDetailDenyUrls(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().setNetworkCaptureBodies(readBool(metadata, logger, REPLAYS_NETWORK_CAPTURE_BODIES, sentryAndroidOptions.getSessionReplay().isNetworkCaptureBodies()));
                if (sentryAndroidOptions.getSessionReplay().getNetworkRequestHeaders().size() == SentryReplayOptions.getNetworkDetailsDefaultHeaders().size() && (list2 = readList(metadata, logger, REPLAYS_NETWORK_REQUEST_HEADERS)) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<String> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = it4.next().trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().setNetworkRequestHeaders(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().getNetworkResponseHeaders().size() == SentryReplayOptions.getNetworkDetailsDefaultHeaders().size() && (list = readList(metadata, logger, REPLAYS_NETWORK_RESPONSE_HEADERS)) != null && !list.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<String> it5 = list.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = it5.next().trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().setNetworkResponseHeaders(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(readList(metadata, logger, IGNORED_ERRORS));
                List<String> list7 = readList(metadata, logger, IN_APP_INCLUDES);
                if (list7 != null && !list7.isEmpty()) {
                    Iterator<String> it6 = list7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude(it6.next());
                    }
                }
                List<String> list8 = readList(metadata, logger, IN_APP_EXCLUDES);
                if (list8 != null && !list8.isEmpty()) {
                    Iterator<String> it7 = list8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude(it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().setEnabled(readBool(metadata, logger, ENABLE_LOGS, sentryAndroidOptions.getLogs().isEnabled()));
                sentryAndroidOptions.getMetrics().setEnabled(readBool(metadata, logger, ENABLE_METRICS, sentryAndroidOptions.getMetrics().isEnabled()));
                SentryFeedbackOptions feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.setNameRequired(readBool(metadata, logger, FEEDBACK_NAME_REQUIRED, feedbackOptions.isNameRequired()));
                feedbackOptions.setShowName(readBool(metadata, logger, FEEDBACK_SHOW_NAME, feedbackOptions.isShowName()));
                feedbackOptions.setEmailRequired(readBool(metadata, logger, FEEDBACK_EMAIL_REQUIRED, feedbackOptions.isEmailRequired()));
                feedbackOptions.setShowEmail(readBool(metadata, logger, FEEDBACK_SHOW_EMAIL, feedbackOptions.isShowEmail()));
                feedbackOptions.setUseSentryUser(readBool(metadata, logger, FEEDBACK_USE_SENTRY_USER, feedbackOptions.isUseSentryUser()));
                feedbackOptions.setShowBranding(readBool(metadata, logger, FEEDBACK_SHOW_BRANDING, feedbackOptions.isShowBranding()));
                sentryAndroidOptions.setEnableSpotlight(readBool(metadata, logger, SPOTLIGHT_ENABLE, sentryAndroidOptions.isEnableSpotlight()));
                String string6 = readString(metadata, logger, SPOTLIGHT_CONNECTION_URL, null);
                if (string6 != null) {
                    sentryAndroidOptions.setSpotlightConnectionUrl(string6);
                }
            }
            sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    private static Bundle getMetadata(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        if (buildInfoProvider == null) {
            buildInfoProvider = new BuildInfoProvider(iLogger);
        }
        ApplicationInfo applicationInfo = ContextUtils.getApplicationInfo(context, buildInfoProvider);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }

    public static boolean isAutoInit(Context context, ILogger iLogger) {
        Objects.requireNonNull(context, "The application context is required.");
        try {
            Bundle metadata = getMetadata(context, iLogger, null);
            if (metadata != null) {
                return readBool(metadata, iLogger, AUTO_INIT, true);
            }
            return true;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Failed to read auto-init from android manifest metadata.", th);
            return true;
        }
    }

    private static boolean readBool(Bundle bundle, ILogger iLogger, String str, boolean z10) {
        boolean z11 = bundle.getBoolean(str, z10);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + z11, new Object[0]);
        return z11;
    }

    private static double readDouble(Bundle bundle, ILogger iLogger, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.log(SentryLevel.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    private static List<String> readList(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + string, new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long readLong(Bundle bundle, ILogger iLogger, String str, long j10) {
        long j11 = bundle.getInt(str, (int) j10);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + j11, new Object[0]);
        return j11;
    }

    private static String readString(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }

    private static String readStringNotNull(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + string, new Object[0]);
        return string;
    }
}
