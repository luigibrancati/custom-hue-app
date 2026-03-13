package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISerializer;
import io.sentry.PropagationContext;
import io.sentry.ScopeCallback;
import io.sentry.ScopeType;
import io.sentry.ScopesAdapter;
import io.sentry.Sentry;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.App;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryTransaction;
import io.sentry.protocol.User;
import io.sentry.util.MapObjectWriter;
import io.sentry.util.TracingUtils;
import io.sentry.util.runtime.IRuntimeManager;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class InternalSentrySdk {
    private static void addTimeSpanToSerializedSpans(TimeSpan timeSpan, List<Map<String, Object>> list) {
        if (timeSpan.hasNotStarted()) {
            ScopesAdapter.getInstance().getOptions().getLogger().log(SentryLevel.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (timeSpan.hasNotStopped()) {
            ScopesAdapter.getInstance().getOptions().getLogger().log(SentryLevel.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", timeSpan.getDescription());
        map.put("start_timestamp_ms", Long.valueOf(timeSpan.getStartTimestampMs()));
        map.put("end_timestamp_ms", Long.valueOf(timeSpan.getProjectedStopTimestampMs()));
        list.add(map);
    }

    public static /* synthetic */ void c(Session.State state, boolean z10, AtomicReference atomicReference, SentryOptions sentryOptions, IScope iScope) {
        Session session = iScope.getSession();
        if (session == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Session is null on updateSession", new Object[0]);
        } else if (session.update(state, null, z10, null)) {
            if (session.getStatus() == Session.State.Crashed) {
                session.end();
                iScope.clearSession();
            }
            atomicReference.set(session);
        }
    }

    public static SentryId captureEnvelope(byte[] bArr, boolean z10) {
        ScopesAdapter scopesAdapter = ScopesAdapter.getInstance();
        SentryOptions options = scopesAdapter.getOptions();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ISerializer serializer = options.getSerializer();
                SentryEnvelope sentryEnvelope = options.getEnvelopeReader().read(byteArrayInputStream);
                if (sentryEnvelope == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Session.State state = null;
                boolean z11 = false;
                for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
                    arrayList.add(sentryEnvelopeItem);
                    SentryEvent event = sentryEnvelopeItem.getEvent(serializer);
                    if (event != null) {
                        if (event.isCrashed()) {
                            state = Session.State.Crashed;
                        }
                        if (event.isCrashed() || event.isErrored()) {
                            z11 = true;
                        }
                    }
                }
                Session sessionUpdateSession = updateSession(scopesAdapter, options, state, z11);
                if (sessionUpdateSession != null) {
                    arrayList.add(SentryEnvelopeItem.fromSession(serializer, sessionUpdateSession));
                    deleteCurrentSessionFile(options, (z10 && scopesAdapter.getOptions().getThreadChecker().isMainThread()) ? false : true);
                    if (z10) {
                        scopesAdapter.startSession();
                    }
                }
                SentryId sentryIdCaptureEnvelope = scopesAdapter.captureEnvelope(new SentryEnvelope(sentryEnvelope.getHeader(), arrayList));
                byteArrayInputStream.close();
                return sentryIdCaptureEnvelope;
            } finally {
            }
        } catch (Throwable th) {
            options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope", th);
            return null;
        }
        options.getLogger().log(SentryLevel.ERROR, "Failed to capture envelope", th);
        return null;
    }

    private static void deleteCurrentSessionFile(final SentryOptions sentryOptions, boolean z10) {
        if (z10) {
            deleteCurrentSessionFile(sentryOptions);
            return;
        }
        try {
            sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.Y
                @Override // java.lang.Runnable
                public final void run() {
                    InternalSentrySdk.deleteCurrentSessionFile(sentryOptions);
                }
            });
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Submission of deletion of the current session file rejected.", th);
        }
    }

    public static Map<String, Object> getAppStartMeasurement() {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        ArrayList arrayList = new ArrayList();
        addTimeSpanToSerializedSpans(appStartMetrics.createProcessInitSpan(), arrayList);
        addTimeSpanToSerializedSpans(appStartMetrics.getApplicationOnCreateTimeSpan(), arrayList);
        Iterator<TimeSpan> it = appStartMetrics.getContentProviderOnCreateTimeSpans().iterator();
        while (it.hasNext()) {
            addTimeSpanToSerializedSpans(it.next(), arrayList);
        }
        for (ActivityLifecycleTimeSpan activityLifecycleTimeSpan : appStartMetrics.getActivityLifecycleTimeSpans()) {
            addTimeSpanToSerializedSpans(activityLifecycleTimeSpan.getOnCreate(), arrayList);
            addTimeSpanToSerializedSpans(activityLifecycleTimeSpan.getOnStart(), arrayList);
        }
        HashMap map = new HashMap();
        map.put(SentryTransaction.JsonKeys.SPANS, arrayList);
        map.put("type", appStartMetrics.getAppStartType().toString().toLowerCase(Locale.ROOT));
        if (appStartMetrics.getAppStartTimeSpan().hasStarted()) {
            map.put("app_start_timestamp_ms", Long.valueOf(appStartMetrics.getAppStartTimeSpan().getStartTimestampMs()));
        }
        return map;
    }

    public static IScope getCurrentScope() {
        final AtomicReference atomicReference = new AtomicReference();
        ScopesAdapter.getInstance().configureScope(ScopeType.COMBINED, new ScopeCallback() { // from class: io.sentry.android.core.W
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                atomicReference.set(iScope.m245clone());
            }
        });
        return (IScope) atomicReference.get();
    }

    public static Map<String, Object> serializeScope(final Context context, SentryAndroidOptions sentryAndroidOptions, IScope iScope) {
        HashMap map = new HashMap();
        if (iScope != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                MapObjectWriter mapObjectWriter = new MapObjectWriter(map);
                DeviceInfoUtil deviceInfoUtil = DeviceInfoUtil.getInstance(context, sentryAndroidOptions);
                iScope.getContexts().setDevice(deviceInfoUtil.collectDeviceInformation(true, true));
                iScope.getContexts().setOperatingSystem(deviceInfoUtil.getOperatingSystem());
                User user = iScope.getUser();
                if (user == null) {
                    user = new User();
                    iScope.setUser(user);
                }
                if (user.getId() == null) {
                    try {
                        user.setId((String) sentryAndroidOptions.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.V
                            @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
                            public final Object run() {
                                return Installation.id(context);
                            }
                        }));
                    } catch (RuntimeException e10) {
                        logger.log(SentryLevel.ERROR, "Could not retrieve installation ID", e10);
                    }
                }
                App app2 = iScope.getContexts().getApp();
                if (app2 == null) {
                    app2 = new App();
                }
                app2.setAppName(ContextUtils.getApplicationName(context));
                TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(sentryAndroidOptions);
                if (appStartTimeSpanWithFallback.hasStarted()) {
                    app2.setAppStartTime(DateUtils.toUtilDate(appStartTimeSpanWithFallback.getStartTimestamp()));
                }
                BuildInfoProvider buildInfoProvider = new BuildInfoProvider(sentryAndroidOptions.getLogger());
                PackageInfo packageInfo = ContextUtils.getPackageInfo(context, RecognitionOptions.AZTEC, sentryAndroidOptions.getLogger(), buildInfoProvider);
                if (packageInfo != null) {
                    ContextUtils.setAppPackageInfo(packageInfo, buildInfoProvider, deviceInfoUtil, app2);
                }
                iScope.getContexts().setApp(app2);
                mapObjectWriter.name(SentryBaseEvent.JsonKeys.USER).value(logger, iScope.getUser());
                mapObjectWriter.name("contexts").value(logger, iScope.getContexts());
                mapObjectWriter.name("tags").value(logger, iScope.getTags());
                mapObjectWriter.name("extras").value(logger, iScope.getExtras());
                mapObjectWriter.name(SentryEvent.JsonKeys.FINGERPRINT).value(logger, iScope.getFingerprint());
                mapObjectWriter.name("level").value(logger, iScope.getLevel());
                mapObjectWriter.name(SentryBaseEvent.JsonKeys.BREADCRUMBS).value(logger, iScope.getBreadcrumbs());
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Could not serialize scope.", th);
                return new HashMap();
            }
        }
        return map;
    }

    public static void setTrace(String str, String str2, Double d10, Double d11) {
        TracingUtils.setTrace(Sentry.getCurrentScopes(), PropagationContext.fromExistingTrace(str, str2, d10, d11));
    }

    private static Session updateSession(IScopes iScopes, final SentryOptions sentryOptions, final Session.State state, final boolean z10) {
        final AtomicReference atomicReference = new AtomicReference();
        iScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.X
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                InternalSentrySdk.c(state, z10, atomicReference, sentryOptions, iScope);
            }
        });
        return (Session) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteCurrentSessionFile(SentryOptions sentryOptions) {
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null) {
            sentryOptions.getLogger().log(SentryLevel.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else if (!sentryOptions.isEnableAutoSessionTracking()) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
        } else {
            if (EnvelopeCache.getCurrentSessionFile(cacheDirPath).delete()) {
                return;
            }
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }
}
