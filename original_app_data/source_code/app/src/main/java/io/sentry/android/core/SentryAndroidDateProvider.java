package io.sentry.android.core;

import io.sentry.SentryDate;
import io.sentry.SentryDateProvider;
import io.sentry.SentryNanotimeDateProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class SentryAndroidDateProvider implements SentryDateProvider {
    private SentryDateProvider dateProvider = new SentryNanotimeDateProvider();

    @Override // io.sentry.SentryDateProvider
    public SentryDate now() {
        return this.dateProvider.now();
    }
}
