package io.sentry.util;

import io.sentry.SentryIntegrationPackageStorage;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class IntegrationUtils {
    public static void addIntegrationToSdkVersion(String str) {
        SentryIntegrationPackageStorage.getInstance().addIntegration(str);
    }
}
