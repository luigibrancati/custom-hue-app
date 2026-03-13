package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.hints.EventDropReason;
import io.sentry.protocol.SentryException;
import io.sentry.util.HintUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DeduplicateMultithreadedEventProcessor implements EventProcessor {
    private final SentryOptions options;
    private final Map<String, Long> processedEvents = Collections.synchronizedMap(new HashMap());

    public DeduplicateMultithreadedEventProcessor(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 7000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        SentryException unhandledException;
        String type;
        Long threadId;
        if (!HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class) || (unhandledException = sentryEvent.getUnhandledException()) == null || (type = unhandledException.getType()) == null || (threadId = unhandledException.getThreadId()) == null) {
            return sentryEvent;
        }
        Long l10 = this.processedEvents.get(type);
        if (l10 == null || l10.equals(threadId)) {
            this.processedEvents.put(type, threadId);
            return sentryEvent;
        }
        this.options.getLogger().log(SentryLevel.INFO, "Event %s has been dropped due to multi-threaded deduplication", sentryEvent.getEventId());
        HintUtils.setEventDropReason(hint, EventDropReason.MULTITHREADED_DEDUPLICATION);
        return null;
    }
}
