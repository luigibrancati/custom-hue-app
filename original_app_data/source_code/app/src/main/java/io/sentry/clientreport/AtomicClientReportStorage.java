package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.util.LazyEvaluator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class AtomicClientReportStorage implements IClientReportStorage {
    private final LazyEvaluator<Map<ClientReportKey, AtomicLong>> lostEventCounts = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.clientreport.a
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final Object evaluate() {
            return AtomicClientReportStorage.a();
        }
    });

    public static /* synthetic */ Map a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (DiscardReason discardReason : DiscardReason.values()) {
            for (DataCategory dataCategory : DataCategory.values()) {
                concurrentHashMap.put(new ClientReportKey(discardReason.getReason(), dataCategory.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.IClientReportStorage
    public void addCount(ClientReportKey clientReportKey, Long l10) {
        AtomicLong atomicLong = this.lostEventCounts.getValue().get(clientReportKey);
        if (atomicLong != null) {
            atomicLong.addAndGet(l10.longValue());
        }
    }

    @Override // io.sentry.clientreport.IClientReportStorage
    public List<DiscardedEvent> resetCountsAndGet() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ClientReportKey, AtomicLong> entry : this.lostEventCounts.getValue().entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new DiscardedEvent(entry.getKey().getReason(), entry.getKey().getCategory(), lValueOf));
            }
        }
        return arrayList;
    }
}
