package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SentrySpanStorage {
    private static volatile SentrySpanStorage INSTANCE;
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();
    private final Map<String, ISpan> spans = new ConcurrentHashMap();

    private SentrySpanStorage() {
    }

    public static SentrySpanStorage getInstance() {
        if (INSTANCE == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new SentrySpanStorage();
                }
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
        return INSTANCE;
    }

    public ISpan get(String str) {
        return this.spans.get(str);
    }

    public ISpan removeAndGet(String str) {
        return this.spans.remove(str);
    }

    public void store(String str, ISpan iSpan) {
        this.spans.put(str, iSpan);
    }
}
