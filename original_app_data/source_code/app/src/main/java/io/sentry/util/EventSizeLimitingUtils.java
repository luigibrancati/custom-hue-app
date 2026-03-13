package io.sentry.util;

import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EventSizeLimitingUtils {
    private static final int FRAMES_PER_SIDE = 250;
    private static final int MAX_FRAMES_PER_STACK = 500;

    private EventSizeLimitingUtils() {
    }

    private static boolean isSizeOk(SentryEvent sentryEvent, SentryOptions sentryOptions) {
        return JsonSerializationUtils.byteSizeOf(sentryOptions.getSerializer(), sentryOptions.getLogger(), sentryEvent) <= SentryOptions.MAX_EVENT_SIZE_BYTES;
    }

    public static SentryEvent limitEventSize(SentryEvent sentryEvent, Hint hint, SentryOptions sentryOptions) {
        SentryEvent sentryEventExecute;
        try {
            if (sentryOptions.isEnableEventSizeLimiting() && !isSizeOk(sentryEvent, sentryOptions)) {
                sentryOptions.getLogger().log(SentryLevel.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", sentryEvent.getEventId(), Long.valueOf(SentryOptions.MAX_EVENT_SIZE_BYTES));
                SentryOptions.OnOversizedEventCallback onOversizedEvent = sentryOptions.getOnOversizedEvent();
                if (onOversizedEvent != null) {
                    try {
                        sentryEventExecute = onOversizedEvent.execute(sentryEvent, hint);
                        if (isSizeOk(sentryEventExecute, sentryOptions)) {
                            return sentryEventExecute;
                        }
                    } catch (Throwable th) {
                        sentryOptions.getLogger().log(SentryLevel.ERROR, "The onOversizedEvent callback threw an exception. It will be ignored and automatic reduction will continue.", th);
                        sentryEventExecute = sentryEvent;
                    }
                } else {
                    sentryEventExecute = sentryEvent;
                }
                SentryEvent sentryEventRemoveAllBreadcrumbs = removeAllBreadcrumbs(sentryEventExecute, sentryOptions);
                if (isSizeOk(sentryEventRemoveAllBreadcrumbs, sentryOptions)) {
                    return sentryEventRemoveAllBreadcrumbs;
                }
                SentryEvent sentryEventTruncateStackFrames = truncateStackFrames(sentryEventRemoveAllBreadcrumbs, sentryOptions);
                if (!isSizeOk(sentryEventTruncateStackFrames, sentryOptions)) {
                    sentryOptions.getLogger().log(SentryLevel.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", sentryEvent.getEventId());
                }
                return sentryEventTruncateStackFrames;
            }
            return sentryEvent;
        } catch (Throwable th2) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            return sentryEvent;
        }
    }

    private static SentryEvent removeAllBreadcrumbs(SentryEvent sentryEvent, SentryOptions sentryOptions) {
        List<Breadcrumb> breadcrumbs = sentryEvent.getBreadcrumbs();
        if (breadcrumbs != null && !breadcrumbs.isEmpty()) {
            sentryEvent.setBreadcrumbs(null);
            sentryOptions.getLogger().log(SentryLevel.DEBUG, "Removed breadcrumbs to reduce size of event %s", sentryEvent.getEventId());
        }
        return sentryEvent;
    }

    private static SentryEvent truncateStackFrames(SentryEvent sentryEvent, SentryOptions sentryOptions) {
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions != null) {
            Iterator<SentryException> it = exceptions.iterator();
            while (it.hasNext()) {
                SentryStackTrace stacktrace = it.next().getStacktrace();
                if (stacktrace != null) {
                    truncateStackFramesInStackTrace(stacktrace, sentryEvent, sentryOptions, "Truncated exception stack frames of event %s");
                }
            }
        }
        List<SentryThread> threads = sentryEvent.getThreads();
        if (threads != null) {
            Iterator<SentryThread> it2 = threads.iterator();
            while (it2.hasNext()) {
                SentryStackTrace stacktrace2 = it2.next().getStacktrace();
                if (stacktrace2 != null) {
                    truncateStackFramesInStackTrace(stacktrace2, sentryEvent, sentryOptions, "Truncated thread stack frames for event %s");
                }
            }
        }
        return sentryEvent;
    }

    private static void truncateStackFramesInStackTrace(SentryStackTrace sentryStackTrace, SentryEvent sentryEvent, SentryOptions sentryOptions, String str) {
        List<SentryStackFrame> frames = sentryStackTrace.getFrames();
        if (frames == null || frames.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(frames.subList(0, FRAMES_PER_SIDE));
        arrayList.addAll(frames.subList(frames.size() - FRAMES_PER_SIDE, frames.size()));
        sentryStackTrace.setFrames(arrayList);
        sentryOptions.getLogger().log(SentryLevel.DEBUG, str, sentryEvent.getEventId());
    }
}
