package io.sentry;

import io.sentry.internal.ManifestVersionReader;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ManifestVersionDetector implements IVersionDetector {
    private final SentryOptions options;

    public ManifestVersionDetector(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    @Override // io.sentry.IVersionDetector
    public boolean checkForMixedVersions() {
        ManifestVersionReader.getInstance().readManifestFiles();
        return SentryIntegrationPackageStorage.getInstance().checkForMixedVersions(this.options.getFatalLogger());
    }
}
