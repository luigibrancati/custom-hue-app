package io.sentry.android.core;

import android.content.Context;
import io.sentry.Integration;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class AnrIntegrationFactory {
    public static Integration create(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }
}
