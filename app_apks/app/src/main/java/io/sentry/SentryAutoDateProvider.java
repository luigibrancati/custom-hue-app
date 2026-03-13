package io.sentry;

import io.sentry.util.Platform;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryAutoDateProvider implements SentryDateProvider {
    private final SentryDateProvider dateProvider;

    public SentryAutoDateProvider() {
        if (checkInstantAvailabilityAndPrecision()) {
            this.dateProvider = new SentryInstantDateProvider();
        } else {
            this.dateProvider = new SentryNanotimeDateProvider();
        }
    }

    private static boolean checkInstantAvailabilityAndPrecision() {
        return Platform.isJvm() && Platform.isJavaNinePlus();
    }

    @Override // io.sentry.SentryDateProvider
    public SentryDate now() {
        return this.dateProvider.now();
    }
}
