package io.sentry.featureflags;

import io.sentry.ISentryLifecycleToken;
import io.sentry.ScopeType;
import io.sentry.SentryOptions;
import io.sentry.protocol.FeatureFlag;
import io.sentry.protocol.FeatureFlags;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class FeatureFlagBuffer implements IFeatureFlagBuffer {
    private volatile CopyOnWriteArrayList<FeatureFlagEntry> flags;
    private final AutoClosableReentrantLock lock;
    private int maxSize;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class FeatureFlagEntry {
        private final String flag;
        private final Long nanos;
        private final boolean result;

        public FeatureFlagEntry(String str, boolean z10, Long l10) {
            this.flag = str;
            this.result = z10;
            this.nanos = l10;
        }

        public FeatureFlag toFeatureFlag() {
            return new FeatureFlag(this.flag, this.result);
        }
    }

    private FeatureFlagBuffer(int i10) {
        this.lock = new AutoClosableReentrantLock();
        this.maxSize = i10;
        this.flags = new CopyOnWriteArrayList<>();
    }

    public static IFeatureFlagBuffer create(SentryOptions sentryOptions) {
        int maxFeatureFlags = sentryOptions.getMaxFeatureFlags();
        return maxFeatureFlags > 0 ? new FeatureFlagBuffer(maxFeatureFlags) : NoOpFeatureFlagBuffer.getInstance();
    }

    public static IFeatureFlagBuffer merged(SentryOptions sentryOptions, IFeatureFlagBuffer iFeatureFlagBuffer, IFeatureFlagBuffer iFeatureFlagBuffer2, IFeatureFlagBuffer iFeatureFlagBuffer3) {
        int maxFeatureFlags = sentryOptions.getMaxFeatureFlags();
        if (maxFeatureFlags <= 0) {
            return NoOpFeatureFlagBuffer.getInstance();
        }
        return merged(maxFeatureFlags, iFeatureFlagBuffer instanceof FeatureFlagBuffer ? (FeatureFlagBuffer) iFeatureFlagBuffer : null, iFeatureFlagBuffer2 instanceof FeatureFlagBuffer ? (FeatureFlagBuffer) iFeatureFlagBuffer2 : null, iFeatureFlagBuffer3 instanceof FeatureFlagBuffer ? (FeatureFlagBuffer) iFeatureFlagBuffer3 : null);
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(String str, Boolean bool) {
        if (str == null || bool == null) {
            return;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            int size = this.flags.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (this.flags.get(i10).flag.equals(str)) {
                    this.flags.remove(i10);
                    break;
                }
                i10++;
            }
            this.flags.add(new FeatureFlagEntry(str, bool.booleanValue(), Long.valueOf(System.nanoTime())));
            if (this.flags.size() > this.maxSize) {
                this.flags.remove(0);
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
        ArrayList arrayList = new ArrayList();
        Iterator<FeatureFlagEntry> it = this.flags.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toFeatureFlag());
        }
        return new FeatureFlags(arrayList);
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m266clone() {
        return new FeatureFlagBuffer(this);
    }

    private FeatureFlagBuffer(int i10, CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList) {
        this.lock = new AutoClosableReentrantLock();
        this.maxSize = i10;
        this.flags = copyOnWriteArrayList;
    }

    private static IFeatureFlagBuffer merged(int i10, FeatureFlagBuffer featureFlagBuffer, FeatureFlagBuffer featureFlagBuffer2, FeatureFlagBuffer featureFlagBuffer3) {
        ScopeType scopeType;
        FeatureFlagEntry featureFlagEntry;
        CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList = featureFlagBuffer == null ? null : featureFlagBuffer.flags;
        CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList2 = featureFlagBuffer2 == null ? null : featureFlagBuffer2.flags;
        CopyOnWriteArrayList<FeatureFlagEntry> copyOnWriteArrayList3 = featureFlagBuffer3 == null ? null : featureFlagBuffer3.flags;
        int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
        int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
        int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
        if (size == 0 && size2 == 0 && size3 == 0) {
            return NoOpFeatureFlagBuffer.getInstance();
        }
        int i11 = size - 1;
        int i12 = size2 - 1;
        int i13 = size3 - 1;
        FeatureFlagEntry featureFlagEntry2 = (copyOnWriteArrayList == null || i11 < 0) ? null : copyOnWriteArrayList.get(i11);
        FeatureFlagEntry featureFlagEntry3 = (copyOnWriteArrayList2 == null || i12 < 0) ? null : copyOnWriteArrayList2.get(i12);
        FeatureFlagEntry featureFlagEntry4 = (copyOnWriteArrayList3 == null || i13 < 0) ? null : copyOnWriteArrayList3.get(i13);
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        while (linkedHashMap.size() < i10 && (featureFlagEntry2 != null || featureFlagEntry3 != null || featureFlagEntry4 != null)) {
            if (featureFlagEntry2 != null) {
                scopeType = ScopeType.GLOBAL;
                featureFlagEntry = featureFlagEntry2;
            } else {
                scopeType = null;
                featureFlagEntry = null;
            }
            if (featureFlagEntry3 != null && (featureFlagEntry == null || featureFlagEntry3.nanos.longValue() > featureFlagEntry.nanos.longValue())) {
                scopeType = ScopeType.ISOLATION;
                featureFlagEntry = featureFlagEntry3;
            }
            if (featureFlagEntry4 != null && (featureFlagEntry == null || featureFlagEntry4.nanos.longValue() > featureFlagEntry.nanos.longValue())) {
                scopeType = ScopeType.CURRENT;
                featureFlagEntry = featureFlagEntry4;
            }
            if (featureFlagEntry == null) {
                break;
            }
            if (!linkedHashMap.containsKey(featureFlagEntry.flag)) {
                linkedHashMap.put(featureFlagEntry.flag, featureFlagEntry);
            }
            if (ScopeType.CURRENT.equals(scopeType)) {
                i13--;
                featureFlagEntry4 = (copyOnWriteArrayList3 == null || i13 < 0) ? null : copyOnWriteArrayList3.get(i13);
            } else if (ScopeType.ISOLATION.equals(scopeType)) {
                i12--;
                featureFlagEntry3 = (copyOnWriteArrayList2 == null || i12 < 0) ? null : copyOnWriteArrayList2.get(i12);
            } else if (ScopeType.GLOBAL.equals(scopeType)) {
                i11--;
                featureFlagEntry2 = (copyOnWriteArrayList == null || i11 < 0) ? null : copyOnWriteArrayList.get(i11);
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Collections.reverse(arrayList);
        return new FeatureFlagBuffer(i10, new CopyOnWriteArrayList(arrayList));
    }

    private FeatureFlagBuffer(FeatureFlagBuffer featureFlagBuffer) {
        this.lock = new AutoClosableReentrantLock();
        this.maxSize = featureFlagBuffer.maxSize;
        this.flags = new CopyOnWriteArrayList<>(featureFlagBuffer.flags);
    }
}
