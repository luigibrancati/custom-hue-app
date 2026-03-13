package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.util.Objects;
import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class RootChecker {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final ILogger logger;
    private final String[] rootFiles;
    private final String[] rootPackages;
    private final Runtime runtime;

    public RootChecker(Context context, BuildInfoProvider buildInfoProvider, ILogger iLogger) {
        this(context, buildInfoProvider, iLogger, new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    private boolean checkRootA() {
        String buildTags = this.buildInfoProvider.getBuildTags();
        return buildTags != null && buildTags.contains("test-keys");
    }

    private boolean checkRootB() {
        for (String str : this.rootFiles) {
            try {
            } catch (RuntimeException e10) {
                this.logger.log(SentryLevel.ERROR, e10, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[DONT_GENERATE, PHI: r2
      0x0047: PHI (r2v3 java.lang.Process) = (r2v1 java.lang.Process), (r2v4 java.lang.Process) binds: [B:20:0x0045, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean checkRootC() {
        /*
            r6 = this;
            java.lang.String r0 = "/system/xbin/which"
            java.lang.String r1 = "su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = 0
            java.lang.Runtime r3 = r6.runtime     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.lang.Process r2 = r3.exec(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.io.InputStream r4 = r2.getInputStream()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.nio.charset.Charset r5 = io.sentry.android.core.internal.util.RootChecker.UTF_8     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = r1
        L29:
            r0.close()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
            r2.destroy()
            return r3
        L30:
            r0 = move-exception
            goto L3c
        L32:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
        L3b:
            throw r3     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L4d
        L3c:
            io.sentry.ILogger r6 = r6.logger     // Catch: java.lang.Throwable -> L4b
            io.sentry.SentryLevel r3 = io.sentry.SentryLevel.DEBUG     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "Error when trying to check if SU exists."
            r6.log(r3, r4, r0)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L5b
        L47:
            r2.destroy()
            goto L5b
        L4b:
            r6 = move-exception
            goto L5c
        L4d:
            io.sentry.ILogger r6 = r6.logger     // Catch: java.lang.Throwable -> L4b
            io.sentry.SentryLevel r0 = io.sentry.SentryLevel.DEBUG     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "SU isn't found on this Device."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4b
            r6.log(r0, r3, r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L5b
            goto L47
        L5b:
            return r1
        L5c:
            if (r2 == 0) goto L61
            r2.destroy()
        L61:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.util.RootChecker.checkRootC():boolean");
    }

    @SuppressLint({"NewApi"})
    private boolean checkRootPackages(ILogger iLogger) {
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(iLogger);
        PackageManager packageManager = this.context.getPackageManager();
        if (packageManager != null) {
            for (String str : this.rootPackages) {
                try {
                    if (buildInfoProvider.getSdkInfoVersion() >= 33) {
                        packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                        return true;
                    }
                    packageManager.getPackageInfo(str, 0);
                    return true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return false;
    }

    public boolean isDeviceRooted() {
        return checkRootA() || checkRootB() || checkRootC() || checkRootPackages(this.logger);
    }

    public RootChecker(Context context, BuildInfoProvider buildInfoProvider, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.context = (Context) Objects.requireNonNull(context, "The application context is required.");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "The Logger is required.");
        this.rootFiles = (String[]) Objects.requireNonNull(strArr, "The root Files are required.");
        this.rootPackages = (String[]) Objects.requireNonNull(strArr2, "The root packages are required.");
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "The Runtime is required.");
    }
}
