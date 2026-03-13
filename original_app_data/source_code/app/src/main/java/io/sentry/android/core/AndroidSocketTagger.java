package io.sentry.android.core;

import android.net.TrafficStats;
import io.sentry.ISocketTagger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidSocketTagger implements ISocketTagger {
    private static final int SENTRY_TAG = 61441;
    private static final AndroidSocketTagger instance = new AndroidSocketTagger();

    private AndroidSocketTagger() {
    }

    public static AndroidSocketTagger getInstance() {
        return instance;
    }

    @Override // io.sentry.ISocketTagger
    public void tagSockets() {
        TrafficStats.setThreadStatsTag(SENTRY_TAG);
    }

    @Override // io.sentry.ISocketTagger
    public void untagSockets() {
        TrafficStats.clearThreadStatsTag();
    }
}
