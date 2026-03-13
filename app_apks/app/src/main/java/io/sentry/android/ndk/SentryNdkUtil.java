package io.sentry.android.ndk;

import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.protocol.SdkVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class SentryNdkUtil {
    static {
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry-android-ndk", "8.32.0");
    }

    private SentryNdkUtil() {
    }

    public static void addPackage(SdkVersion sdkVersion) {
        if (sdkVersion == null) {
            return;
        }
        sdkVersion.addPackage("maven:io.sentry:sentry-android-ndk", "8.32.0");
    }
}
