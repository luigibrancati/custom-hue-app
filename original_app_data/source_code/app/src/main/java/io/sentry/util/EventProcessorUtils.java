package io.sentry.util;

import io.sentry.EventProcessor;
import io.sentry.internal.eventprocessor.EventProcessorAndOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EventProcessorUtils {
    public static List<EventProcessor> unwrap(List<EventProcessorAndOrder> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<EventProcessorAndOrder> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getEventProcessor());
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
