package io.sentry.android.core.cache;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.TombstoneIntegration;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.cache.EnvelopeCache;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.Objects;
import io.sentry.util.runtime.IRuntimeManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidEnvelopeCache extends EnvelopeCache {
    public static final String LAST_ANR_MARKER_LABEL = "ANR";
    public static final String LAST_ANR_REPORT = "last_anr_report";
    public static final String LAST_TOMBSTONE_MARKER_LABEL = "Tombstone";
    public static final String LAST_TOMBSTONE_REPORT = "last_tombstone_report";
    private static final List<TimestampMarkerHandler<?>> TIMESTAMP_MARKER_HANDLERS = Arrays.asList(new TimestampMarkerHandler(AnrV2Integration.AnrV2Hint.class, LAST_ANR_MARKER_LABEL, LAST_ANR_REPORT, new TimestampMarkerHandler.TimestampExtractor() { // from class: io.sentry.android.core.cache.c
        @Override // io.sentry.android.core.cache.AndroidEnvelopeCache.TimestampMarkerHandler.TimestampExtractor
        public final Long extract(Object obj) {
            return ((AnrV2Integration.AnrV2Hint) obj).timestamp();
        }
    }), new TimestampMarkerHandler(TombstoneIntegration.TombstoneHint.class, LAST_TOMBSTONE_MARKER_LABEL, LAST_TOMBSTONE_REPORT, new TimestampMarkerHandler.TimestampExtractor() { // from class: io.sentry.android.core.cache.d
        @Override // io.sentry.android.core.cache.AndroidEnvelopeCache.TimestampMarkerHandler.TimestampExtractor
        public final Long extract(Object obj) {
            return ((TombstoneIntegration.TombstoneHint) obj).timestamp();
        }
    }));
    private final ICurrentDateProvider currentDateProvider;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TimestampMarkerHandler<T> {
        private final String label;
        private final String reportFilename;
        private final TimestampExtractor<T> timestampProvider;
        private final Class<T> type;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public interface TimestampExtractor<T> {
            Long extract(T t10);
        }

        public TimestampMarkerHandler(Class<T> cls, String str, String str2, TimestampExtractor<T> timestampExtractor) {
            this.type = cls;
            this.label = str;
            this.reportFilename = str2;
            this.timestampProvider = timestampExtractor;
        }

        public static /* synthetic */ void a(TimestampMarkerHandler timestampMarkerHandler, SentryAndroidOptions sentryAndroidOptions, AndroidEnvelopeCache androidEnvelopeCache, Object obj) {
            Long lExtract = timestampMarkerHandler.timestampProvider.extract(obj);
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Writing last reported %s marker with timestamp %d", timestampMarkerHandler.label, lExtract);
            androidEnvelopeCache.writeLastReportedMarker(lExtract, timestampMarkerHandler.reportFilename, timestampMarkerHandler.label);
        }

        public void handle(final AndroidEnvelopeCache androidEnvelopeCache, Hint hint, final SentryAndroidOptions sentryAndroidOptions) {
            HintUtils.runIfHasType(hint, this.type, new HintUtils.SentryConsumer() { // from class: io.sentry.android.core.cache.e
                @Override // io.sentry.util.HintUtils.SentryConsumer
                public final void accept(Object obj) {
                    AndroidEnvelopeCache.TimestampMarkerHandler.a(this.f38517a, sentryAndroidOptions, androidEnvelopeCache, obj);
                }
            });
        }
    }

    public AndroidEnvelopeCache(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, AndroidCurrentDateProvider.getInstance());
    }

    public static boolean hasStartupCrashMarker(SentryOptions sentryOptions) {
        String outboxPath = sentryOptions.getOutboxPath();
        if (outboxPath == null) {
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        final File file = new File(outboxPath, EnvelopeCache.STARTUP_CRASH_MARKER_FILE);
        try {
            boolean zBooleanValue = ((Boolean) sentryOptions.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.cache.a
                @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
                public final Object run() {
                    return Boolean.valueOf(file.exists());
                }
            })).booleanValue();
            if (!zBooleanValue || ((Boolean) sentryOptions.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.cache.b
                @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
                public final Object run() {
                    return Boolean.valueOf(file.delete());
                }
            })).booleanValue()) {
                return zBooleanValue;
            }
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zBooleanValue;
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            return false;
        }
    }

    public static Long lastReportedAnr(SentryOptions sentryOptions) {
        return lastReportedMarker(sentryOptions, LAST_ANR_REPORT, LAST_ANR_MARKER_LABEL);
    }

    private static Long lastReportedMarker(SentryOptions sentryOptions, String str, String str2) {
        File file = new File((String) Objects.requireNonNull(sentryOptions.getCacheDirPath(), "Cache dir path should be set for getting " + str2 + "s reported"), str);
        try {
            String text = FileUtils.readText(file);
            if (text != null && !text.equals("null")) {
                return Long.valueOf(Long.parseLong(text.trim()));
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof FileNotFoundException) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Last " + str2 + " marker does not exist. %s.", file.getAbsolutePath());
            } else {
                sentryOptions.getLogger().log(SentryLevel.ERROR, "Error reading last " + str2 + " marker", th);
            }
            return null;
        }
    }

    public static Long lastReportedTombstone(SentryOptions sentryOptions) {
        return lastReportedMarker(sentryOptions, LAST_TOMBSTONE_REPORT, LAST_TOMBSTONE_MARKER_LABEL);
    }

    private boolean storeInternalAndroid(SentryEnvelope sentryEnvelope, Hint hint) {
        boolean zStoreEnvelope = super.storeEnvelope(sentryEnvelope, hint);
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.options;
        TimeSpan sdkInitTimeSpan = AppStartMetrics.getInstance().getSdkInitTimeSpan();
        if (HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class) && sdkInitTimeSpan.hasStarted()) {
            long currentTimeMillis = this.currentDateProvider.getCurrentTimeMillis() - sdkInitTimeSpan.getStartUptimeMs();
            if (currentTimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(currentTimeMillis));
                writeStartupCrashMarkerFile();
            }
        }
        Iterator<TimestampMarkerHandler<?>> it = TIMESTAMP_MARKER_HANDLERS.iterator();
        while (it.hasNext()) {
            it.next().handle(this, hint, sentryAndroidOptions);
        }
        return zStoreEnvelope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeLastReportedMarker(Long l10, String str, String str2) {
        String cacheDirPath = this.options.getCacheDirPath();
        if (cacheDirPath == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Cache dir path is null, the " + str2 + " marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, str));
            try {
                fileOutputStream.write(String.valueOf(l10).getBytes(UTF_8));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error writing the " + str2 + " marker to the disk", th);
        }
    }

    private void writeStartupCrashMarkerFile() {
        String outboxPath = this.options.getOutboxPath();
        if (outboxPath == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, EnvelopeCache.STARTUP_CRASH_MARKER_FILE).createNewFile();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error writing the startup crash marker file to the disk", th);
        }
    }

    public File getDirectory() {
        return this.directory;
    }

    @Override // io.sentry.cache.EnvelopeCache, io.sentry.cache.IEnvelopeCache
    public void store(SentryEnvelope sentryEnvelope, Hint hint) {
        storeInternalAndroid(sentryEnvelope, hint);
    }

    @Override // io.sentry.cache.EnvelopeCache, io.sentry.cache.IEnvelopeCache
    public boolean storeEnvelope(SentryEnvelope sentryEnvelope, Hint hint) {
        return storeInternalAndroid(sentryEnvelope, hint);
    }

    public AndroidEnvelopeCache(SentryAndroidOptions sentryAndroidOptions, ICurrentDateProvider iCurrentDateProvider) {
        super(sentryAndroidOptions, (String) Objects.requireNonNull(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.currentDateProvider = iCurrentDateProvider;
    }
}
