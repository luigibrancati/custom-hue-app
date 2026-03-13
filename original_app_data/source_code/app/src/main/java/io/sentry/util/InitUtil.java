package io.sentry.util;

import io.sentry.IContinuousProfiler;
import io.sentry.IProfileConverter;
import io.sentry.ManifestVersionDetector;
import io.sentry.NoOpContinuousProfiler;
import io.sentry.NoOpProfileConverter;
import io.sentry.NoopVersionDetector;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.profiling.ProfilingServiceLoader;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class InitUtil {
    private static String getOrCreateProfilingTracesDir(SentryOptions sentryOptions) {
        String profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        if (profilingTracesDirPath != null) {
            return profilingTracesDirPath;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            String absolutePath = file.getAbsolutePath();
            sentryOptions.setProfilingTracesDirPath(absolutePath);
            return absolutePath;
        }
        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
    }

    public static IProfileConverter initializeProfileConverter(SentryOptions sentryOptions) {
        if (!shouldInitializeProfileConverter(sentryOptions)) {
            return sentryOptions.getProfilerConverter();
        }
        IProfileConverter iProfileConverterLoadProfileConverter = ProfilingServiceLoader.loadProfileConverter();
        if (iProfileConverterLoadProfileConverter instanceof NoOpProfileConverter) {
            sentryOptions.getLogger().log(SentryLevel.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
        } else {
            sentryOptions.setProfilerConverter(iProfileConverterLoadProfileConverter);
            sentryOptions.getLogger().log(SentryLevel.INFO, "Successfully loaded profile converter", new Object[0]);
        }
        return sentryOptions.getProfilerConverter();
    }

    public static IContinuousProfiler initializeProfiler(SentryOptions sentryOptions) {
        if (!shouldInitializeProfiler(sentryOptions)) {
            return sentryOptions.getContinuousProfiler();
        }
        try {
            IContinuousProfiler iContinuousProfilerLoadContinuousProfiler = ProfilingServiceLoader.loadContinuousProfiler(sentryOptions.getLogger(), getOrCreateProfilingTracesDir(sentryOptions), sentryOptions.getProfilingTracesHz(), sentryOptions.getExecutorService());
            if (iContinuousProfilerLoadContinuousProfiler instanceof NoOpContinuousProfiler) {
                sentryOptions.getLogger().log(SentryLevel.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
            } else {
                sentryOptions.setContinuousProfiler(iContinuousProfilerLoadContinuousProfiler);
                sentryOptions.getLogger().log(SentryLevel.INFO, "Successfully loaded profiler", new Object[0]);
            }
        } catch (Exception e10) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to create default profiling traces directory", e10);
        }
        return sentryOptions.getContinuousProfiler();
    }

    public static boolean shouldInit(SentryOptions sentryOptions, SentryOptions sentryOptions2, boolean z10) {
        if (Platform.isJvm() && (sentryOptions2.getVersionDetector() instanceof NoopVersionDetector)) {
            sentryOptions2.setVersionDetector(new ManifestVersionDetector(sentryOptions2));
        }
        if (!sentryOptions2.getVersionDetector().checkForMixedVersions()) {
            return !z10 || sentryOptions == null || sentryOptions2.isForceInit() || sentryOptions.getInitPriority().ordinal() <= sentryOptions2.getInitPriority().ordinal();
        }
        sentryOptions2.getLogger().log(SentryLevel.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See " + (Platform.isAndroid() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions") + " for more details.");
    }

    private static boolean shouldInitializeProfileConverter(SentryOptions sentryOptions) {
        return Platform.isJvm() && sentryOptions.isContinuousProfilingEnabled() && (sentryOptions.getProfilerConverter() instanceof NoOpProfileConverter);
    }

    private static boolean shouldInitializeProfiler(SentryOptions sentryOptions) {
        return Platform.isJvm() && sentryOptions.isContinuousProfilingEnabled() && (sentryOptions.getContinuousProfiler() instanceof NoOpContinuousProfiler);
    }
}
