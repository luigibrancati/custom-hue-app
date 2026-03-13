package io.sentry;

import io.sentry.protocol.profiling.SentryProfile;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class NoOpProfileConverter implements IProfileConverter {
    private static final NoOpProfileConverter instance = new NoOpProfileConverter();

    private NoOpProfileConverter() {
    }

    public static NoOpProfileConverter getInstance() {
        return instance;
    }

    @Override // io.sentry.IProfileConverter
    public SentryProfile convertFromFile(String str) {
        return new SentryProfile();
    }
}
