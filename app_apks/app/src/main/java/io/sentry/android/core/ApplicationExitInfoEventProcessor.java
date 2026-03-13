package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.BackfillingEventProcessor;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IpAddressUtils;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEvent;
import io.sentry.SentryExceptionFactory;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryStackTraceFactory;
import io.sentry.SpanContext;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.cache.PersistingOptionsObserver;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.hints.AbnormalExit;
import io.sentry.hints.Backfillable;
import io.sentry.protocol.App;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Device;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.Request;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.HintUtils;
import io.sentry.util.SentryRandom;
import io.sentry.util.runtime.IRuntimeManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ApplicationExitInfoEventProcessor implements BackfillingEventProcessor {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final List<HintEnricher> hintEnrichers = Collections.singletonList(new AnrHintEnricher());
    private final SentryAndroidOptions options;
    private final PersistingScopeObserver persistingScopeObserver;
    private final SentryExceptionFactory sentryExceptionFactory;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class AnrHintEnricher implements HintEnricher {
        private AnrHintEnricher() {
        }

        private SentryThread findMainThread(List<SentryThread> list) {
            if (list == null) {
                return null;
            }
            for (SentryThread sentryThread : list) {
                String name = sentryThread.getName();
                if (name != null && name.equals(SentryThread.JsonKeys.MAIN)) {
                    return sentryThread;
                }
            }
            return null;
        }

        private boolean isBackgroundAnr(Object obj) {
            if (obj instanceof AbnormalExit) {
                return "anr_background".equals(((AbnormalExit) obj).mechanism());
            }
            return false;
        }

        private void setAnrExceptions(SentryEvent sentryEvent, Backfillable backfillable, boolean z10) {
            if (sentryEvent.getExceptions() != null) {
                return;
            }
            Mechanism mechanism = new Mechanism();
            if (backfillable.shouldEnrich()) {
                mechanism.setType("AppExitInfo");
            } else {
                mechanism.setType("HistoricalAppExitInfo");
            }
            String str = AndroidEnvelopeCache.LAST_ANR_MARKER_LABEL;
            if (z10) {
                str = "Background " + AndroidEnvelopeCache.LAST_ANR_MARKER_LABEL;
            }
            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
            SentryThread sentryThreadFindMainThread = findMainThread(sentryEvent.getThreads());
            if (sentryThreadFindMainThread == null) {
                sentryThreadFindMainThread = new SentryThread();
                sentryThreadFindMainThread.setStacktrace(new SentryStackTrace());
            }
            sentryEvent.setExceptions(ApplicationExitInfoEventProcessor.this.sentryExceptionFactory.getSentryExceptionsFromThread(sentryThreadFindMainThread, mechanism, applicationNotResponding));
        }

        private void setAppForeground(SentryBaseEvent sentryBaseEvent, boolean z10) {
            App app2 = sentryBaseEvent.getContexts().getApp();
            if (app2 == null) {
                app2 = new App();
                sentryBaseEvent.getContexts().setApp(app2);
            }
            if (app2.getInForeground() == null) {
                app2.setInForeground(Boolean.valueOf(z10));
            }
        }

        private void setDefaultAnrFingerprint(SentryEvent sentryEvent, boolean z10) {
            if (sentryEvent.getFingerprints() == null) {
                sentryEvent.setFingerprints(Arrays.asList("{{ default }}", z10 ? "background-anr" : "foreground-anr"));
            }
        }

        @Override // io.sentry.android.core.ApplicationExitInfoEventProcessor.HintEnricher
        public void applyPostEnrichment(SentryEvent sentryEvent, Backfillable backfillable, Object obj) {
            boolean zIsBackgroundAnr = isBackgroundAnr(obj);
            setAppForeground(sentryEvent, !zIsBackgroundAnr);
            setDefaultAnrFingerprint(sentryEvent, zIsBackgroundAnr);
        }

        @Override // io.sentry.android.core.ApplicationExitInfoEventProcessor.HintEnricher
        public void applyPreEnrichment(SentryEvent sentryEvent, Backfillable backfillable, Object obj) {
            boolean zIsBackgroundAnr = isBackgroundAnr(obj);
            ApplicationExitInfoEventProcessor.this.setDefaultPlatform(sentryEvent);
            setAnrExceptions(sentryEvent, backfillable, zIsBackgroundAnr);
        }

        @Override // io.sentry.android.core.ApplicationExitInfoEventProcessor.HintEnricher
        public boolean supports(Object obj) {
            return obj instanceof AbnormalExit;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface HintEnricher {
        void applyPostEnrichment(SentryEvent sentryEvent, Backfillable backfillable, Object obj);

        void applyPreEnrichment(SentryEvent sentryEvent, Backfillable backfillable, Object obj);

        boolean supports(Object obj);
    }

    public ApplicationExitInfoEventProcessor(Context context, SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.options = sentryAndroidOptions;
        this.buildInfoProvider = buildInfoProvider;
        this.persistingScopeObserver = sentryAndroidOptions.findPersistingScopeObserver();
        this.sentryExceptionFactory = new SentryExceptionFactory(new SentryStackTraceFactory(sentryAndroidOptions));
    }

    private void backfillOptions(SentryEvent sentryEvent) {
        setRelease(sentryEvent);
        setEnvironment(sentryEvent);
        setDist(sentryEvent);
        setDebugMeta(sentryEvent);
        setSdk(sentryEvent);
        setApp(sentryEvent);
        setOptionsTags(sentryEvent);
    }

    private void backfillScope(SentryEvent sentryEvent) {
        setRequest(sentryEvent);
        setUser(sentryEvent);
        setScopeTags(sentryEvent);
        setBreadcrumbs(sentryEvent);
        setExtras(sentryEvent);
        setContexts(sentryEvent);
        setTransaction(sentryEvent);
        setFingerprints(sentryEvent);
        setLevel(sentryEvent);
        setTrace(sentryEvent);
        setReplayId(sentryEvent);
    }

    private HintEnricher findEnricher(Object obj) {
        for (HintEnricher hintEnricher : this.hintEnrichers) {
            if (hintEnricher.supports(obj)) {
                return hintEnricher;
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    private Device getDevice() {
        Device device = new Device();
        device.setManufacturer(Build.MANUFACTURER);
        device.setBrand(Build.BRAND);
        device.setFamily(ContextUtils.getFamily(this.options.getLogger()));
        device.setModel(Build.MODEL);
        device.setModelId(Build.ID);
        device.setArchs(ContextUtils.getArchitectures());
        ActivityManager.MemoryInfo memInfo = ContextUtils.getMemInfo(this.context, this.options.getLogger());
        if (memInfo != null) {
            device.setMemorySize(getMemorySize(memInfo));
        }
        device.setSimulator(this.buildInfoProvider.isEmulator());
        DisplayMetrics displayMetrics = ContextUtils.getDisplayMetrics(this.context, this.options.getLogger());
        if (displayMetrics != null) {
            device.setScreenWidthPixels(Integer.valueOf(displayMetrics.widthPixels));
            device.setScreenHeightPixels(Integer.valueOf(displayMetrics.heightPixels));
            device.setScreenDensity(Float.valueOf(displayMetrics.density));
            device.setScreenDpi(Integer.valueOf(displayMetrics.densityDpi));
        }
        if (device.getId() == null) {
            device.setId(getDeviceId());
        }
        List<Integer> maxFrequencies = CpuInfoUtils.getInstance().readMaxFrequencies();
        if (!maxFrequencies.isEmpty()) {
            device.setProcessorFrequency(Double.valueOf(((Integer) Collections.max(maxFrequencies)).doubleValue()));
            device.setProcessorCount(Integer.valueOf(maxFrequencies.size()));
        }
        return device;
    }

    private String getDeviceId() {
        try {
            return (String) this.options.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.H
                @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
                public final Object run() {
                    return Installation.id(this.f38484a.context);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private Long getMemorySize(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private void mergeOS(SentryBaseEvent sentryBaseEvent) {
        String str;
        OperatingSystem operatingSystem = sentryBaseEvent.getContexts().getOperatingSystem();
        sentryBaseEvent.getContexts().setOperatingSystem(DeviceInfoUtil.getInstance(this.context, this.options).getOperatingSystem());
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
            user.setId(getDeviceId());
        }
        if (user.getIpAddress() == null && this.options.isSendDefaultPii()) {
            user.setIpAddress(IpAddressUtils.DEFAULT_IP_ADDRESS);
        }
    }

    private <T> T readFromDisk(SentryOptions sentryOptions, String str, Class<T> cls) {
        PersistingScopeObserver persistingScopeObserver = this.persistingScopeObserver;
        if (persistingScopeObserver == null) {
            return null;
        }
        return (T) persistingScopeObserver.read(sentryOptions, str, cls);
    }

    private boolean sampleReplay(SentryEvent sentryEvent) {
        String str = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.REPLAY_ERROR_SAMPLE_RATE_FILENAME, String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= SentryRandom.current().nextDouble()) {
                return true;
            }
            this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", sentryEvent.getEventId());
            return false;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error parsing replay sample rate.", th);
            return false;
        }
    }

    private void setApp(SentryBaseEvent sentryBaseEvent) {
        App app2 = sentryBaseEvent.getContexts().getApp();
        if (app2 == null) {
            app2 = new App();
        }
        app2.setAppName(ContextUtils.getApplicationName(this.context));
        PackageInfo packageInfo = ContextUtils.getPackageInfo(this.context, this.buildInfoProvider);
        if (packageInfo != null) {
            app2.setAppIdentifier(packageInfo.packageName);
        }
        String release = sentryBaseEvent.getRelease() != null ? sentryBaseEvent.getRelease() : (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.RELEASE_FILENAME, String.class);
        if (release != null) {
            try {
                String strSubstring = release.substring(release.indexOf(64) + 1, release.indexOf(43));
                String strSubstring2 = release.substring(release.indexOf(43) + 1);
                app2.setAppVersion(strSubstring);
                app2.setAppBuild(strSubstring2);
            } catch (Throwable unused) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", release);
            }
        }
        try {
            ContextUtils.SplitApksInfo splitApksInfo = DeviceInfoUtil.getInstance(this.context, this.options).getSplitApksInfo();
            if (splitApksInfo != null) {
                app2.setSplitApks(Boolean.valueOf(splitApksInfo.isSplitApks()));
                if (splitApksInfo.getSplitNames() != null) {
                    app2.setSplitNames(Arrays.asList(splitApksInfo.getSplitNames()));
                }
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting split apks info.", th);
        }
        sentryBaseEvent.getContexts().setApp(app2);
    }

    private void setBreadcrumbs(SentryBaseEvent sentryBaseEvent) {
        List<Breadcrumb> list = (List) readFromDisk(this.options, PersistingScopeObserver.BREADCRUMBS_FILENAME, List.class);
        if (list == null) {
            return;
        }
        if (sentryBaseEvent.getBreadcrumbs() == null) {
            sentryBaseEvent.setBreadcrumbs(list);
        } else {
            sentryBaseEvent.getBreadcrumbs().addAll(list);
        }
    }

    private void setContexts(SentryBaseEvent sentryBaseEvent) {
        Contexts contexts = (Contexts) readFromDisk(this.options, PersistingScopeObserver.CONTEXTS_FILENAME, Contexts.class);
        if (contexts == null) {
            return;
        }
        Contexts contexts2 = sentryBaseEvent.getContexts();
        for (Map.Entry<String, Object> entry : new Contexts(contexts).entrySet()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof SpanContext)) {
                if (!contexts2.containsKey(entry.getKey())) {
                    contexts2.put(entry.getKey(), value);
                }
            }
        }
    }

    private void setDebugMeta(SentryBaseEvent sentryBaseEvent) {
        DebugMeta debugMeta = sentryBaseEvent.getDebugMeta();
        if (debugMeta == null) {
            debugMeta = new DebugMeta();
        }
        if (debugMeta.getImages() == null) {
            debugMeta.setImages(new ArrayList());
        }
        List<DebugImage> images = debugMeta.getImages();
        if (images != null) {
            String str = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.PROGUARD_UUID_FILENAME, String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                images.add(debugImage);
            }
            sentryBaseEvent.setDebugMeta(debugMeta);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPlatform(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getPlatform() == null) {
            sentryBaseEvent.setPlatform("java");
        }
    }

    private void setDevice(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getContexts().getDevice() == null) {
            sentryBaseEvent.getContexts().setDevice(getDevice());
        }
    }

    private void setDist(SentryBaseEvent sentryBaseEvent) {
        String str;
        if (sentryBaseEvent.getDist() == null) {
            sentryBaseEvent.setDist((String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.DIST_FILENAME, String.class));
        }
        if (sentryBaseEvent.getDist() != null || (str = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.RELEASE_FILENAME, String.class)) == null) {
            return;
        }
        try {
            sentryBaseEvent.setDist(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.options.getLogger().log(SentryLevel.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void setEnvironment(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getEnvironment() == null) {
            String environment = (String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.ENVIRONMENT_FILENAME, String.class);
            if (environment == null) {
                environment = this.options.getEnvironment();
            }
            sentryBaseEvent.setEnvironment(environment);
        }
    }

    private void setExtras(SentryBaseEvent sentryBaseEvent) {
        Map map = (Map) readFromDisk(this.options, PersistingScopeObserver.EXTRAS_FILENAME, Map.class);
        if (map == null) {
            return;
        }
        if (sentryBaseEvent.getExtras() == null) {
            sentryBaseEvent.setExtras(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!sentryBaseEvent.getExtras().containsKey(entry.getKey())) {
                sentryBaseEvent.getExtras().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void setFingerprints(SentryEvent sentryEvent) {
        List<String> list = (List) readFromDisk(this.options, PersistingScopeObserver.FINGERPRINT_FILENAME, List.class);
        if (sentryEvent.getFingerprints() == null) {
            sentryEvent.setFingerprints(list);
        }
    }

    private void setLevel(SentryEvent sentryEvent) {
        SentryLevel sentryLevel = (SentryLevel) readFromDisk(this.options, PersistingScopeObserver.LEVEL_FILENAME, SentryLevel.class);
        if (sentryEvent.getLevel() == null) {
            sentryEvent.setLevel(sentryLevel);
        }
    }

    private void setOptionsTags(SentryBaseEvent sentryBaseEvent) {
        Map map = (Map) PersistingOptionsObserver.read(this.options, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(entry.getKey())) {
                sentryBaseEvent.setTag((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void setRelease(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRelease() == null) {
            sentryBaseEvent.setRelease((String) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.RELEASE_FILENAME, String.class));
        }
    }

    private void setReplayId(SentryEvent sentryEvent) {
        String str = (String) readFromDisk(this.options, PersistingScopeObserver.REPLAY_FILENAME, String.class);
        String cacheDirPath = this.options.getCacheDirPath();
        if (cacheDirPath == null) {
            return;
        }
        if (!new File(cacheDirPath, "replay_" + str).exists()) {
            if (!sampleReplay(sentryEvent)) {
                return;
            }
            File[] fileArrListFiles = new File(cacheDirPath).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= sentryEvent.getTimestamp().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        PersistingScopeObserver.store(this.options, str, PersistingScopeObserver.REPLAY_FILENAME);
        sentryEvent.getContexts().put("replay_id", str);
    }

    private void setRequest(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getRequest() == null) {
            sentryBaseEvent.setRequest((Request) readFromDisk(this.options, PersistingScopeObserver.REQUEST_FILENAME, Request.class));
        }
    }

    private void setScopeTags(SentryBaseEvent sentryBaseEvent) {
        Map map = (Map) readFromDisk(this.options, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (sentryBaseEvent.getTags() == null) {
            sentryBaseEvent.setTags(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!sentryBaseEvent.getTags().containsKey(entry.getKey())) {
                sentryBaseEvent.setTag((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void setSdk(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getSdk() == null) {
            sentryBaseEvent.setSdk((SdkVersion) PersistingOptionsObserver.read(this.options, PersistingOptionsObserver.SDK_VERSION_FILENAME, SdkVersion.class));
        }
    }

    private void setSideLoadedInfo(SentryBaseEvent sentryBaseEvent) {
        try {
            ContextUtils.SideLoadedInfo sideLoadedInfo = DeviceInfoUtil.getInstance(this.context, this.options).getSideLoadedInfo();
            if (sideLoadedInfo != null) {
                for (Map.Entry<String, String> entry : sideLoadedInfo.asTags().entrySet()) {
                    sentryBaseEvent.setTag(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting side loaded info.", th);
        }
    }

    private void setStaticValues(SentryEvent sentryEvent) {
        mergeUser(sentryEvent);
        setSideLoadedInfo(sentryEvent);
    }

    private void setTrace(SentryEvent sentryEvent) {
        SpanContext spanContext = (SpanContext) readFromDisk(this.options, PersistingScopeObserver.TRACE_FILENAME, SpanContext.class);
        if (sentryEvent.getContexts().getTrace() != null || spanContext == null) {
            return;
        }
        sentryEvent.getContexts().setTrace(spanContext);
    }

    private void setTransaction(SentryEvent sentryEvent) {
        String str = (String) readFromDisk(this.options, PersistingScopeObserver.TRANSACTION_FILENAME, String.class);
        if (sentryEvent.getTransaction() == null) {
            sentryEvent.setTransaction(str);
        }
    }

    private void setUser(SentryBaseEvent sentryBaseEvent) {
        if (sentryBaseEvent.getUser() == null) {
            sentryBaseEvent.setUser((User) readFromDisk(this.options, PersistingScopeObserver.USER_FILENAME, User.class));
        }
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 12000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        Object sentrySdkHint = HintUtils.getSentrySdkHint(hint);
        if (!(sentrySdkHint instanceof Backfillable)) {
            this.options.getLogger().log(SentryLevel.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return sentryEvent;
        }
        Backfillable backfillable = (Backfillable) sentrySdkHint;
        HintEnricher hintEnricherFindEnricher = findEnricher(sentrySdkHint);
        if (hintEnricherFindEnricher != null) {
            hintEnricherFindEnricher.applyPreEnrichment(sentryEvent, backfillable, sentrySdkHint);
        }
        mergeOS(sentryEvent);
        setDevice(sentryEvent);
        if (!backfillable.shouldEnrich()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return sentryEvent;
        }
        backfillScope(sentryEvent);
        backfillOptions(sentryEvent);
        setStaticValues(sentryEvent);
        if (hintEnricherFindEnricher != null) {
            hintEnricherFindEnricher.applyPostEnrichment(sentryEvent, backfillable, sentrySdkHint);
        }
        return sentryEvent;
    }
}
