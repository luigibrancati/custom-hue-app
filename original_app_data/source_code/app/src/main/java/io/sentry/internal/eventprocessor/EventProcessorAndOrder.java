package io.sentry.internal.eventprocessor;

import io.sentry.EventProcessor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EventProcessorAndOrder implements Comparable<EventProcessorAndOrder> {
    private final EventProcessor eventProcessor;
    private final Long order;

    public EventProcessorAndOrder(EventProcessor eventProcessor, Long l10) {
        this.eventProcessor = eventProcessor;
        if (l10 == null) {
            this.order = Long.valueOf(System.nanoTime());
        } else {
            this.order = l10;
        }
    }

    public EventProcessor getEventProcessor() {
        return this.eventProcessor;
    }

    public Long getOrder() {
        return this.order;
    }

    @Override // java.lang.Comparable
    public int compareTo(EventProcessorAndOrder eventProcessorAndOrder) {
        return this.order.compareTo(eventProcessorAndOrder.order);
    }
}
