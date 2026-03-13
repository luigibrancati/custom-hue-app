package io.sentry.transport;

import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.HintUtils;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RateLimiter implements Closeable {
    private static final int HTTP_RETRY_AFTER_DEFAULT_DELAY_MILLIS = 60000;
    private final ICurrentDateProvider currentDateProvider;
    private final SentryOptions options;
    private final List<IRateLimitObserver> rateLimitObservers;
    private final Map<DataCategory, Date> sentryRetryAfterLimit;
    private Timer timer;
    private final AutoClosableReentrantLock timerLock;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface IRateLimitObserver {
        void onRateLimitChanged(RateLimiter rateLimiter);
    }

    public RateLimiter(ICurrentDateProvider iCurrentDateProvider, SentryOptions sentryOptions) {
        this.sentryRetryAfterLimit = new ConcurrentHashMap();
        this.rateLimitObservers = new CopyOnWriteArrayList();
        this.timer = null;
        this.timerLock = new AutoClosableReentrantLock();
        this.currentDateProvider = iCurrentDateProvider;
        this.options = sentryOptions;
    }

    private void applyRetryAfterOnlyIfLonger(DataCategory dataCategory, Date date) {
        Date date2 = this.sentryRetryAfterLimit.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            this.sentryRetryAfterLimit.put(dataCategory, date);
            notifyRateLimitObservers();
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
            try {
                if (this.timer == null) {
                    this.timer = new Timer(true);
                }
                this.timer.schedule(new TimerTask() { // from class: io.sentry.transport.RateLimiter.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        RateLimiter.this.notifyRateLimitObservers();
                    }
                }, date);
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
        }
    }

    public static /* synthetic */ void c(RateLimiter rateLimiter, DiskFlushNotification diskFlushNotification) {
        rateLimiter.getClass();
        diskFlushNotification.markFlushed();
        rateLimiter.options.getLogger().log(SentryLevel.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
    }

    private List<DataCategory> getCategoryFromItemType(String str) {
        str.getClass();
        switch (str) {
            case "attachment":
                return Collections.singletonList(DataCategory.Attachment);
            case "replay_video":
                return Collections.singletonList(DataCategory.Replay);
            case "profile_chunk":
                return Arrays.asList(DataCategory.ProfileChunkUi, DataCategory.ProfileChunk);
            case "profile":
                return Collections.singletonList(DataCategory.Profile);
            case "feedback":
                return Collections.singletonList(DataCategory.Feedback);
            case "log":
                return Collections.singletonList(DataCategory.LogItem);
            case "span":
                return Collections.singletonList(DataCategory.Span);
            case "event":
                return Collections.singletonList(DataCategory.Error);
            case "trace_metric":
                return Collections.singletonList(DataCategory.TraceMetric);
            case "check_in":
                return Collections.singletonList(DataCategory.Monitor);
            case "session":
                return Collections.singletonList(DataCategory.Session);
            case "transaction":
                return Collections.singletonList(DataCategory.Transaction);
            default:
                return Collections.singletonList(DataCategory.Unknown);
        }
    }

    private boolean isRetryAfter(String str) {
        Iterator<DataCategory> it = getCategoryFromItemType(str).iterator();
        while (it.hasNext()) {
            if (isActiveForCategory(it.next())) {
                return true;
            }
        }
        return false;
    }

    private void markHintWhenSendingFailed(Hint hint, final boolean z10) {
        HintUtils.runIfHasType(hint, SubmissionResult.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.k
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((SubmissionResult) obj).setResult(false);
            }
        });
        HintUtils.runIfHasType(hint, Retryable.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.l
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                ((Retryable) obj).setRetry(z10);
            }
        });
        HintUtils.runIfHasType(hint, DiskFlushNotification.class, new HintUtils.SentryConsumer() { // from class: io.sentry.transport.m
            @Override // io.sentry.util.HintUtils.SentryConsumer
            public final void accept(Object obj) {
                RateLimiter.c(this.f38828a, (DiskFlushNotification) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyRateLimitObservers() {
        Iterator<IRateLimitObserver> it = this.rateLimitObservers.iterator();
        while (it.hasNext()) {
            it.next().onRateLimitChanged(this);
        }
    }

    private long parseRetryAfterOrDefault(String str) {
        if (str == null) {
            return 60000L;
        }
        try {
            return (long) (Double.parseDouble(str) * 1000.0d);
        } catch (NumberFormatException unused) {
            return 60000L;
        }
    }

    public void addRateLimitObserver(IRateLimitObserver iRateLimitObserver) {
        this.rateLimitObservers.add(iRateLimitObserver);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.timerLock.acquire();
        try {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            this.rateLimitObservers.clear();
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
    }

    public SentryEnvelope filter(SentryEnvelope sentryEnvelope, Hint hint) {
        ArrayList arrayList = null;
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (isRetryAfter(sentryEnvelopeItem.getHeader().getType().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(sentryEnvelopeItem);
                this.options.getClientReportRecorder().recordLostEnvelopeItem(DiscardReason.RATELIMIT_BACKOFF, sentryEnvelopeItem);
            }
        }
        if (arrayList == null) {
            return sentryEnvelope;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
        ArrayList arrayList2 = new ArrayList();
        for (SentryEnvelopeItem sentryEnvelopeItem2 : sentryEnvelope.getItems()) {
            if (!arrayList.contains(sentryEnvelopeItem2)) {
                arrayList2.add(sentryEnvelopeItem2);
            }
        }
        if (!arrayList2.isEmpty()) {
            return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList2);
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
        markHintWhenSendingFailed(hint, false);
        return null;
    }

    public boolean isActiveForCategory(DataCategory dataCategory) {
        Date date;
        Date date2 = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Date date3 = this.sentryRetryAfterLimit.get(DataCategory.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (DataCategory.Unknown.equals(dataCategory) || (date = this.sentryRetryAfterLimit.get(dataCategory)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    public boolean isAnyRateLimitActive() {
        Date date = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Iterator<DataCategory> it = this.sentryRetryAfterLimit.keySet().iterator();
        while (it.hasNext()) {
            Date date2 = this.sentryRetryAfterLimit.get(it.next());
            if (date2 != null && !date.after(date2)) {
                return true;
            }
        }
        return false;
    }

    public void removeRateLimitObserver(IRateLimitObserver iRateLimitObserver) {
        this.rateLimitObservers.remove(iRateLimitObserver);
    }

    public void updateRetryAfterLimits(String str, String str2, int i10) {
        if (str == null) {
            if (i10 == 429) {
                applyRetryAfterOnlyIfLonger(DataCategory.All, new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault(str2)));
                return;
            }
            return;
        }
        for (String str3 : str.split(",", -1)) {
            String[] strArrSplit = str3.replace(StringUtils.SPACE, "").split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1);
            if (strArrSplit.length > 0) {
                long retryAfterOrDefault = parseRetryAfterOrDefault(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    String str4 = strArrSplit[1];
                    Date date = new Date(this.currentDateProvider.getCurrentTimeMillis() + retryAfterOrDefault);
                    if (str4 == null || str4.isEmpty()) {
                        applyRetryAfterOnlyIfLonger(DataCategory.All, date);
                    } else {
                        for (String str5 : str4.split(";", -1)) {
                            DataCategory dataCategoryValueOf = DataCategory.Unknown;
                            try {
                                String strCamelCase = io.sentry.util.StringUtils.camelCase(str5);
                                if (strCamelCase != null) {
                                    dataCategoryValueOf = DataCategory.valueOf(strCamelCase);
                                } else {
                                    this.options.getLogger().log(SentryLevel.ERROR, "Couldn't capitalize: %s", str5);
                                }
                            } catch (IllegalArgumentException e10) {
                                this.options.getLogger().log(SentryLevel.INFO, e10, "Unknown category: %s", str5);
                            }
                            if (!DataCategory.Unknown.equals(dataCategoryValueOf)) {
                                applyRetryAfterOnlyIfLonger(dataCategoryValueOf, date);
                            }
                        }
                    }
                }
            }
        }
    }

    public RateLimiter(SentryOptions sentryOptions) {
        this(CurrentDateProvider.getInstance(), sentryOptions);
    }
}
