package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import io.sentry.transport.ICurrentDateProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidCurrentDateProvider implements ICurrentDateProvider {
    private static final ICurrentDateProvider instance = new AndroidCurrentDateProvider();

    private AndroidCurrentDateProvider() {
    }

    public static ICurrentDateProvider getInstance() {
        return instance;
    }

    @Override // io.sentry.transport.ICurrentDateProvider
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
