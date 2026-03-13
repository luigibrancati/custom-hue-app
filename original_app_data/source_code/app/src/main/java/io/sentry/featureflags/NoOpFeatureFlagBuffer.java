package io.sentry.featureflags;

import io.sentry.protocol.FeatureFlags;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpFeatureFlagBuffer implements IFeatureFlagBuffer {
    private static final NoOpFeatureFlagBuffer instance = new NoOpFeatureFlagBuffer();

    public static NoOpFeatureFlagBuffer getInstance() {
        return instance;
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public FeatureFlags getFeatureFlags() {
        return null;
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public IFeatureFlagBuffer m267clone() {
        return instance;
    }

    @Override // io.sentry.featureflags.IFeatureFlagBuffer
    public void add(String str, Boolean bool) {
    }
}
