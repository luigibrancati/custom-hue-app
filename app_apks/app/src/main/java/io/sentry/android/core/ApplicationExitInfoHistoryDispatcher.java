package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Hint;
import io.sentry.IScopes;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.hints.BlockingFlushHint;
import io.sentry.protocol.SentryId;
import io.sentry.transport.ICurrentDateProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class ApplicationExitInfoHistoryDispatcher implements Runnable {
    static final long NINETY_DAYS_THRESHOLD = TimeUnit.DAYS.toMillis(91);
    private final Context context;
    private final SentryAndroidOptions options;
    private final ApplicationExitInfoPolicy policy;
    private final IScopes scopes;
    private final long threshold;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ApplicationExitInfoPolicy {
        Report buildReport(ApplicationExitInfo applicationExitInfo, boolean z10);

        String getLabel();

        Long getLastReportedTimestamp();

        int getTargetReason();

        boolean shouldReportHistorical();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Report {
        private final SentryEvent event;
        private final BlockingFlushHint flushHint;
        private final Hint hint;

        public Report(SentryEvent sentryEvent, Hint hint, BlockingFlushHint blockingFlushHint) {
            this.event = sentryEvent;
            this.hint = hint;
            this.flushHint = blockingFlushHint;
        }

        public SentryEvent getEvent() {
            return this.event;
        }

        public BlockingFlushHint getFlushHint() {
            return this.flushHint;
        }

        public Hint getHint() {
            return this.hint;
        }
    }

    public ApplicationExitInfoHistoryDispatcher(Context context, IScopes iScopes, SentryAndroidOptions sentryAndroidOptions, ICurrentDateProvider iCurrentDateProvider, ApplicationExitInfoPolicy applicationExitInfoPolicy) {
        this.context = ContextUtils.getApplicationContext(context);
        this.scopes = iScopes;
        this.options = sentryAndroidOptions;
        this.policy = applicationExitInfoPolicy;
        this.threshold = iCurrentDateProvider.getCurrentTimeMillis() - NINETY_DAYS_THRESHOLD;
    }

    private ApplicationExitInfo removeLatest(List<ApplicationExitInfo> list) {
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo next = it.next();
            if (next.getReason() == this.policy.getTargetReason()) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    private void report(ApplicationExitInfo applicationExitInfo, boolean z10) {
        BlockingFlushHint flushHint;
        Report reportBuildReport = this.policy.buildReport(applicationExitInfo, z10);
        if (reportBuildReport == null || this.scopes.captureEvent(reportBuildReport.getEvent(), reportBuildReport.getHint()).equals(SentryId.EMPTY_ID) || (flushHint = reportBuildReport.getFlushHint()) == null || flushHint.waitFlush()) {
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", this.policy.getLabel(), reportBuildReport.getEvent().getEventId());
    }

    private void reportHistorical(List<ApplicationExitInfo> list, Long l10) {
        Collections.reverse(list);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getReason() == this.policy.getTargetReason()) {
                if (applicationExitInfo.getTimestamp() < this.threshold) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "%s happened too long ago %s.", this.policy.getLabel(), applicationExitInfo);
                } else if (l10 == null || applicationExitInfo.getTimestamp() > l10.longValue()) {
                    report(applicationExitInfo, false);
                } else {
                    this.options.getLogger().log(SentryLevel.DEBUG, "%s has already been reported %s.", this.policy.getLabel(), applicationExitInfo);
                }
            }
        }
    }

    private void waitPreviousSessionFlush() {
        IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof EnvelopeCache) && this.options.isEnableAutoSessionTracking()) {
            EnvelopeCache envelopeCache = (EnvelopeCache) envelopeDiskCache;
            if (envelopeCache.waitPreviousSessionFlush()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
            envelopeCache.flushPreviousSession();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService("activity");
        if (activityManager == null) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        waitPreviousSessionFlush();
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        Long lastReportedTimestamp = this.policy.getLastReportedTimestamp();
        ApplicationExitInfo applicationExitInfoRemoveLatest = removeLatest(arrayList);
        if (applicationExitInfoRemoveLatest == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "No %ss have been found in the historical exit reasons list.", this.policy.getLabel());
            return;
        }
        if (applicationExitInfoRemoveLatest.getTimestamp() < this.threshold) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Latest %s happened too long ago, returning early.", this.policy.getLabel());
            return;
        }
        if (lastReportedTimestamp != null && applicationExitInfoRemoveLatest.getTimestamp() <= lastReportedTimestamp.longValue()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Latest %s has already been reported, returning early.", this.policy.getLabel());
            return;
        }
        if (this.policy.shouldReportHistorical()) {
            reportHistorical(arrayList, lastReportedTimestamp);
        }
        report(applicationExitInfoRemoveLatest, true);
    }
}
