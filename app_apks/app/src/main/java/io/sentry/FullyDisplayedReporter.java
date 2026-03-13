package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class FullyDisplayedReporter {
    private static final FullyDisplayedReporter instance = new FullyDisplayedReporter();
    private final List<FullyDisplayedReporterListener> listeners = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface FullyDisplayedReporterListener {
        void onFullyDrawn();
    }

    private FullyDisplayedReporter() {
    }

    public static FullyDisplayedReporter getInstance() {
        return instance;
    }

    public void registerFullyDrawnListener(FullyDisplayedReporterListener fullyDisplayedReporterListener) {
        this.listeners.add(fullyDisplayedReporterListener);
    }

    public void reportFullyDrawn() {
        Iterator<FullyDisplayedReporterListener> it = this.listeners.iterator();
        this.listeners.clear();
        while (it.hasNext()) {
            it.next().onFullyDrawn();
        }
    }
}
