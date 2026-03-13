package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import io.sentry.NoOpLogger;
import io.sentry.android.core.BuildInfoProvider;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ContentProviderSecurityChecker {
    private final BuildInfoProvider buildInfoProvider;

    public ContentProviderSecurityChecker() {
        this(new BuildInfoProvider(NoOpLogger.getInstance()));
    }

    @SuppressLint({"NewApi"})
    public void checkPrivilegeEscalation(ContentProvider contentProvider) {
        int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
        if (sdkInfoVersion < 26 || sdkInfoVersion > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public ContentProviderSecurityChecker(BuildInfoProvider buildInfoProvider) {
        this.buildInfoProvider = buildInfoProvider;
    }
}
