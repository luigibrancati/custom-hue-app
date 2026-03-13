package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.cache.IEnvelopeCache;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class MovePreviousSession implements Runnable {
    private final SentryOptions options;

    public MovePreviousSession(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.options.getCacheDirPath();
        if (cacheDirPath == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
            return;
        }
        if (!this.options.isEnableAutoSessionTracking()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
            return;
        }
        IEnvelopeCache envelopeDiskCache = this.options.getEnvelopeDiskCache();
        if (envelopeDiskCache instanceof EnvelopeCache) {
            EnvelopeCache envelopeCache = (EnvelopeCache) envelopeDiskCache;
            envelopeCache.movePreviousSession(EnvelopeCache.getCurrentSessionFile(cacheDirPath), EnvelopeCache.getPreviousSessionFile(cacheDirPath));
            envelopeCache.flushPreviousSession();
        }
    }
}
