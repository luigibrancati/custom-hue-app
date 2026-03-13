package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Attachment;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.Integration;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryEvent;
import io.sentry.SentryItemType;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.ApplicationExitInfoHistoryDispatcher;
import io.sentry.android.core.NativeEventCollector;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.tombstone.NativeExceptionMechanism;
import io.sentry.android.core.internal.tombstone.TombstoneParser;
import io.sentry.hints.Backfillable;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.hints.NativeCrashExit;
import io.sentry.protocol.DebugMeta;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryThread;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.InputStream;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class TombstoneIntegration implements Integration, Closeable {
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private SentryAndroidOptions options;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class TombstonePolicy implements ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy {
        private final Context context;
        private final NativeEventCollector nativeEventCollector;
        private final SentryAndroidOptions options;

        public TombstonePolicy(SentryAndroidOptions sentryAndroidOptions, Context context) {
            this.options = sentryAndroidOptions;
            this.nativeEventCollector = new NativeEventCollector(sentryAndroidOptions);
            this.context = context;
        }

        private void addNativeAttachmentsToTombstoneHint(NativeEventCollector.NativeEventData nativeEventData, Hint hint) {
            for (SentryEnvelopeItem sentryEnvelopeItem : nativeEventData.getEnvelope().getItems()) {
                try {
                    String fileName = sentryEnvelopeItem.getHeader().getFileName();
                    if (sentryEnvelopeItem.getHeader().getType() == SentryItemType.Attachment && fileName != null) {
                        hint.addAttachment(new Attachment(sentryEnvelopeItem.getData(), fileName, sentryEnvelopeItem.getHeader().getContentType(), sentryEnvelopeItem.getHeader().getAttachmentType(), false));
                    }
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                }
            }
        }

        private void mergeNativeCrashes(SentryEvent sentryEvent, SentryEvent sentryEvent2) {
            List<SentryException> exceptions = sentryEvent2.getExceptions();
            DebugMeta debugMeta = sentryEvent2.getDebugMeta();
            List<SentryThread> threads = sentryEvent2.getThreads();
            if (exceptions == null || exceptions.isEmpty() || debugMeta == null || threads == null) {
                return;
            }
            Mechanism mechanism = exceptions.get(0).getMechanism();
            if (mechanism != null) {
                mechanism.setType(NativeExceptionMechanism.TOMBSTONE_MERGED.getValue());
            }
            sentryEvent.setExceptions(exceptions);
            sentryEvent.setDebugMeta(debugMeta);
            sentryEvent.setThreads(threads);
        }

        private SentryEvent mergeWithMatchingNativeEvents(long j10, SentryEvent sentryEvent, Hint hint) {
            NativeEventCollector.NativeEventData nativeEventDataFindAndRemoveMatchingNativeEvent = this.nativeEventCollector.findAndRemoveMatchingNativeEvent(j10);
            if (nativeEventDataFindAndRemoveMatchingNativeEvent == null) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No matching native event found for tombstone.", new Object[0]);
                return null;
            }
            this.options.getLogger().log(SentryLevel.DEBUG, "Found matching native event for tombstone, removing from outbox: %s", nativeEventDataFindAndRemoveMatchingNativeEvent.getFile().getName());
            if (!this.nativeEventCollector.deleteNativeEventFile(nativeEventDataFindAndRemoveMatchingNativeEvent)) {
                return null;
            }
            SentryEvent event = nativeEventDataFindAndRemoveMatchingNativeEvent.getEvent();
            mergeNativeCrashes(event, sentryEvent);
            addNativeAttachmentsToTombstoneHint(nativeEventDataFindAndRemoveMatchingNativeEvent, hint);
            return event;
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public ApplicationExitInfoHistoryDispatcher.Report buildReport(ApplicationExitInfo applicationExitInfo, boolean z10) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream == null) {
                    this.options.getLogger().log(SentryLevel.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    return null;
                }
                TombstoneParser tombstoneParser = new TombstoneParser(traceInputStream, this.options.getInAppIncludes(), this.options.getInAppExcludes(), this.context.getApplicationInfo().nativeLibraryDir);
                try {
                    SentryEvent sentryEvent = tombstoneParser.parse();
                    tombstoneParser.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    sentryEvent.setTimestamp(DateUtils.getDateTime(timestamp));
                    TombstoneHint tombstoneHint = new TombstoneHint(this.options.getFlushTimeoutMillis(), this.options.getLogger(), timestamp, z10);
                    Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(tombstoneHint);
                    try {
                        SentryEvent sentryEventMergeWithMatchingNativeEvents = mergeWithMatchingNativeEvents(timestamp, sentryEvent, hintCreateWithTypeCheckHint);
                        if (sentryEventMergeWithMatchingNativeEvents != null) {
                            sentryEvent = sentryEventMergeWithMatchingNativeEvents;
                        }
                    } catch (Throwable th) {
                        this.options.getLogger().log(SentryLevel.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new ApplicationExitInfoHistoryDispatcher.Report(sentryEvent, hintCreateWithTypeCheckHint, tombstoneHint);
                } finally {
                }
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th2.getMessage());
                return null;
            }
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public String getLabel() {
            return AndroidEnvelopeCache.LAST_TOMBSTONE_MARKER_LABEL;
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public Long getLastReportedTimestamp() {
            return AndroidEnvelopeCache.lastReportedTombstone(this.options);
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public int getTargetReason() {
            return 5;
        }

        @Override // io.sentry.android.core.ApplicationExitInfoHistoryDispatcher.ApplicationExitInfoPolicy
        public boolean shouldReportHistorical() {
            return this.options.isReportHistoricalTombstones();
        }
    }

    public TombstoneIntegration(Context context) {
        this(context, CurrentDateProvider.getInstance());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.options.isTombstoneEnabled()));
        if (this.options.isTombstoneEnabled()) {
            if (this.options.getCacheDirPath() == null) {
                this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                ISentryExecutorService executorService = sentryOptions.getExecutorService();
                Context context = this.context;
                SentryAndroidOptions sentryAndroidOptions2 = this.options;
                executorService.submit(new ApplicationExitInfoHistoryDispatcher(context, iScopes, sentryAndroidOptions2, this.dateProvider, new TombstonePolicy(sentryAndroidOptions2, context)));
            } catch (Throwable th) {
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Failed to start tombstone processor.", th);
            }
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            IntegrationUtils.addIntegrationToSdkVersion(AndroidEnvelopeCache.LAST_TOMBSTONE_MARKER_LABEL);
        }
    }

    public TombstoneIntegration(Context context, ICurrentDateProvider iCurrentDateProvider) {
        this.context = ContextUtils.getApplicationContext(context);
        this.dateProvider = iCurrentDateProvider;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class TombstoneHint extends BlockingFlushHint implements Backfillable, NativeCrashExit {
        private final boolean shouldEnrich;
        private final long tombstoneTimestamp;

        public TombstoneHint(long j10, ILogger iLogger, long j11, boolean z10) {
            super(j10, iLogger);
            this.tombstoneTimestamp = j11;
            this.shouldEnrich = z10;
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public boolean isFlushable(SentryId sentryId) {
            return true;
        }

        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return this.shouldEnrich;
        }

        @Override // io.sentry.hints.NativeCrashExit
        public Long timestamp() {
            return Long.valueOf(this.tombstoneTimestamp);
        }

        @Override // io.sentry.hints.DiskFlushNotification
        public void setFlushable(SentryId sentryId) {
        }
    }
}
