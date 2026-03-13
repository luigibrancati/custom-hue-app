package io.sentry;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoopVersionDetector implements IVersionDetector {
    private static final NoopVersionDetector instance = new NoopVersionDetector();

    private NoopVersionDetector() {
    }

    public static NoopVersionDetector getInstance() {
        return instance;
    }

    @Override // io.sentry.IVersionDetector
    public boolean checkForMixedVersions() {
        return false;
    }
}
