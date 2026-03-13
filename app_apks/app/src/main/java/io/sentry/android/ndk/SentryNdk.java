package io.sentry.android.ndk;

import io.sentry.android.core.NdkHandlerStrategy;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.ndk.NativeModuleListLoader;
import io.sentry.ndk.NdkOptions;
import io.sentry.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryNdk {
    private static final CountDownLatch loadLibraryLatch = new CountDownLatch(1);

    static {
        new Thread(new Runnable() { // from class: io.sentry.android.ndk.h
            @Override // java.lang.Runnable
            public final void run() {
                SentryNdk.a();
            }
        }, "SentryNdkLoadLibs").start();
    }

    private SentryNdk() {
    }

    public static /* synthetic */ void a() {
        try {
            io.sentry.ndk.SentryNdk.loadNativeLibraries();
        } catch (Throwable unused) {
        }
        loadLibraryLatch.countDown();
    }

    public static void close() {
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            io.sentry.ndk.SentryNdk.close();
        } catch (InterruptedException e10) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e10);
        }
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        SentryNdkUtil.addPackage(sentryAndroidOptions.getSdkVersion());
        try {
            if (!loadLibraryLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                throw new IllegalStateException("Timeout waiting for Sentry NDK library to load");
            }
            NdkOptions ndkOptions = new NdkOptions((String) Objects.requireNonNull(sentryAndroidOptions.getDsn(), "DSN is required for sentry-ndk"), sentryAndroidOptions.isDebug(), (String) Objects.requireNonNull(sentryAndroidOptions.getOutboxPath(), "outbox path is required for sentry-ndk"), sentryAndroidOptions.getRelease(), sentryAndroidOptions.getEnvironment(), sentryAndroidOptions.getDist(), sentryAndroidOptions.getMaxBreadcrumbs(), sentryAndroidOptions.getNativeSdkName());
            int ndkHandlerStrategy = sentryAndroidOptions.getNdkHandlerStrategy();
            if (ndkHandlerStrategy == NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT.getValue()) {
                ndkOptions.setNdkHandlerStrategy(io.sentry.ndk.NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT);
            } else if (ndkHandlerStrategy == NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START.getValue()) {
                ndkOptions.setNdkHandlerStrategy(io.sentry.ndk.NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_CHAIN_AT_START);
            }
            Double tracesSampleRate = sentryAndroidOptions.getTracesSampleRate();
            if (tracesSampleRate == null) {
                ndkOptions.setTracesSampleRate(0.0f);
            } else {
                ndkOptions.setTracesSampleRate(tracesSampleRate.floatValue());
            }
            io.sentry.ndk.SentryNdk.init(ndkOptions);
            if (sentryAndroidOptions.isEnableScopeSync()) {
                sentryAndroidOptions.addScopeObserver(new NdkScopeObserver(sentryAndroidOptions));
            }
            sentryAndroidOptions.setDebugImagesLoader(new DebugImagesLoader(sentryAndroidOptions, new NativeModuleListLoader()));
        } catch (InterruptedException e10) {
            throw new IllegalStateException("Thread interrupted while waiting for NDK libs to be loaded", e10);
        }
    }
}
