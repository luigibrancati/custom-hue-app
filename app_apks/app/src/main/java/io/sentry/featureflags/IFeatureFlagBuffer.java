package io.sentry.featureflags;

import io.sentry.protocol.FeatureFlags;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public interface IFeatureFlagBuffer {
    void add(String str, Boolean bool);

    IFeatureFlagBuffer clone();

    FeatureFlags getFeatureFlags();
}
