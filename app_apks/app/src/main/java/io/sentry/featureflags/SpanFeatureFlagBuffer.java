package io.sentry.featureflags;

import io.sentry.ISentryLifecycleToken;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.FeatureFlags;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SpanFeatureFlagBuffer implements IFeatureFlagBuffer {
    private static final int MAX_SIZE = 10;
    private Map<String, Boolean> flags = null;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    private SpanFeatureFlagBuffer() {
    }

    public static IFeatureFlagBuffer create() {
        return new SpanFeatureFlagBuffer();
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(String str, Boolean bool) {
        if (str == null || bool == null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.flags == null) {
                this.flags = new LinkedHashMap(10);
            }
            if (this.flags.size() < 10 || this.flags.containsKey(str)) {
                this.flags.put(str, bool);
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

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public FeatureFlags getFeatureFlags() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            Map<String, Boolean> map = this.flags;
            if (map != null && !map.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.flags.size());
                for (Map.Entry<String, Boolean> entry : this.flags.entrySet()) {
                    arrayList.add(new FeatureFlag(entry.getKey(), entry.getValue().booleanValue()));
                }
                FeatureFlags featureFlags = new FeatureFlags(arrayList);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return featureFlags;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
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

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m268clone() {
        return create();
    }
}
