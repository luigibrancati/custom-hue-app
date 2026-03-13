package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.OptionsContainer;
import io.sentry.ScopeCallback;
import io.sentry.Sentry;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryAndroid {
    private static final String FRAGMENT_CLASS_NAME = "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks";
    static final String SENTRY_DISTRIBUTION_INTEGRATION_CLASS_NAME = "io.sentry.android.distribution.DistributionIntegration";
    static final String SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME = "io.sentry.android.fragment.FragmentLifecycleIntegration";
    static final String SENTRY_REPLAY_INTEGRATION_CLASS_NAME = "io.sentry.android.replay.ReplayIntegration";
    static final String SENTRY_TIMBER_INTEGRATION_CLASS_NAME = "io.sentry.android.timber.SentryTimberIntegration";
    private static final String TIMBER_CLASS_NAME = "timber.log.Timber";
    private static final long sdkInitMillis = SystemClock.uptimeMillis();
    protected static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();

    private SentryAndroid() {
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, IScope iScope) {
        Session session = iScope.getSession();
        if (session == null || session.getStarted() == null) {
            return;
        }
        atomicBoolean.set(true);
    }

    public static /* synthetic */ void c(ILogger iLogger, Context context, Sentry.OptionsConfiguration optionsConfiguration, SentryAndroidOptions sentryAndroidOptions) {
        boolean z10;
        io.sentry.util.LoadClass loadClass = new io.sentry.util.LoadClass();
        boolean zIsClassAvailable = loadClass.isClassAvailable(TIMBER_CLASS_NAME, sentryAndroidOptions);
        boolean z11 = true;
        if (loadClass.isClassAvailable(FRAGMENT_CLASS_NAME, sentryAndroidOptions) && loadClass.isClassAvailable(SENTRY_FRAGMENT_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) {
            z10 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        boolean z12 = (zIsClassAvailable && loadClass.isClassAvailable(SENTRY_TIMBER_INTEGRATION_CLASS_NAME, sentryAndroidOptions)) ? z10 : false;
        boolean zIsClassAvailable2 = loadClass.isClassAvailable(SENTRY_REPLAY_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        boolean zIsClassAvailable3 = loadClass.isClassAvailable(SENTRY_DISTRIBUTION_INTEGRATION_CLASS_NAME, sentryAndroidOptions);
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(iLogger);
        io.sentry.util.LoadClass loadClass2 = new io.sentry.util.LoadClass();
        ActivityFramesTracker activityFramesTracker = new ActivityFramesTracker(loadClass2, sentryAndroidOptions);
        AndroidOptionsInitializer.loadDefaultAndMetadataOptions(sentryAndroidOptions, context, iLogger, buildInfoProvider);
        AndroidOptionsInitializer.installDefaultIntegrations(context, sentryAndroidOptions, buildInfoProvider, loadClass2, activityFramesTracker, z11, z12, zIsClassAvailable2, zIsClassAvailable3);
        boolean z13 = z12;
        boolean z14 = z11;
        try {
            optionsConfiguration.configure(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        if (sentryAndroidOptions.isEnablePerformanceV2() && buildInfoProvider.getSdkInfoVersion() >= 24) {
            TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
            if (appStartTimeSpan.hasNotStarted()) {
                appStartTimeSpan.setStartedAt(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            appStartMetrics.registerLifecycleCallbacks((Application) context.getApplicationContext());
        }
        TimeSpan sdkInitTimeSpan = appStartMetrics.getSdkInitTimeSpan();
        if (sdkInitTimeSpan.hasNotStarted()) {
            sdkInitTimeSpan.setStartedAt(sdkInitMillis);
        }
        AndroidOptionsInitializer.initializeIntegrationsAndProcessors(sentryAndroidOptions, context, buildInfoProvider, loadClass2, activityFramesTracker, zIsClassAvailable2);
        deduplicateIntegrations(sentryAndroidOptions, z14, z13);
    }

    private static void deduplicateIntegrations(SentryOptions sentryOptions, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Integration integration : sentryOptions.getIntegrations()) {
            if (z10 && (integration instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(integration);
            }
            if (z11 && (integration instanceof SentryTimberIntegration)) {
                arrayList.add(integration);
            }
            if (integration instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(integration);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i10 = 0; i10 < arrayList2.size() - 1; i10++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList2.get(i10));
            }
        }
        if (arrayList.size() > 1) {
            for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList.get(i11));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i12 = 0; i12 < arrayList3.size() - 1; i12++) {
                sentryOptions.getIntegrations().remove((Integration) arrayList3.get(i12));
            }
        }
    }

    public static void init(Context context) {
        init(context, new AndroidLogger());
    }

    public static void init(Context context, ILogger iLogger) {
        init(context, iLogger, new Sentry.OptionsConfiguration() { // from class: io.sentry.android.core.f0
            @Override // io.sentry.Sentry.OptionsConfiguration
            public final void configure(SentryOptions sentryOptions) {
                SentryAndroid.a((SentryAndroidOptions) sentryOptions);
            }
        });
    }

    public static void init(Context context, Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        init(context, new AndroidLogger(), optionsConfiguration);
    }

    @SuppressLint({"NewApi"})
    public static void init(final Context context, final ILogger iLogger, final Sentry.OptionsConfiguration<SentryAndroidOptions> optionsConfiguration) {
        try {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                Sentry.init(OptionsContainer.create(SentryAndroidOptions.class), new Sentry.OptionsConfiguration() { // from class: io.sentry.android.core.d0
                    @Override // io.sentry.Sentry.OptionsConfiguration
                    public final void configure(SentryOptions sentryOptions) {
                        SentryAndroid.c(iLogger, context, optionsConfiguration, (SentryAndroidOptions) sentryOptions);
                    }
                }, true);
                IScopes currentScopes = Sentry.getCurrentScopes();
                if (ContextUtils.isForegroundImportance()) {
                    if (currentScopes.getOptions().isEnableAutoSessionTracking()) {
                        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        currentScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.e0
                            @Override // io.sentry.ScopeCallback
                            public final void run(IScope iScope) {
                                SentryAndroid.b(atomicBoolean, iScope);
                            }
                        });
                        if (!atomicBoolean.get()) {
                            currentScopes.startSession();
                        }
                    }
                    currentScopes.getOptions().getReplayController().start();
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
        } catch (IllegalAccessException e10) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InstantiationException e11) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (NoSuchMethodException e12) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (InvocationTargetException e13) {
            iLogger.log(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        }
    }

    public static /* synthetic */ void a(SentryAndroidOptions sentryAndroidOptions) {
    }
}
