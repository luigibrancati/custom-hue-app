package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.AndroidLazyEvaluator;
import io.sentry.protocol.App;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ContextUtils {

    @SuppressLint({"NewApi"})
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo33 = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.I
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.d(context);
        }
    });
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.J
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.b(context);
        }
    });
    private static final AndroidLazyEvaluator<String> applicationName = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.K
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.a(context);
        }
    });

    @SuppressLint({"NewApi"})
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo33 = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.L
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.c(context);
        }
    });
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo = new AndroidLazyEvaluator<>(new AndroidLazyEvaluator.AndroidEvaluator() { // from class: io.sentry.android.core.M
        @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
        public final Object evaluate(Context context) {
            return ContextUtils.e(context);
        }
    });

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SideLoadedInfo {
        private final String installerStore;
        private final boolean isSideLoaded;

        public SideLoadedInfo(boolean z10, String str) {
            this.isSideLoaded = z10;
            this.installerStore = str;
        }

        public Map<String, String> asTags() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.isSideLoaded));
            String str = this.installerStore;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }

        public String getInstallerStore() {
            return this.installerStore;
        }

        public boolean isSideLoaded() {
            return this.isSideLoaded;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class SplitApksInfo {
        static final String SPLITS_REQUIRED = "com.android.vending.splits.required";
        private final boolean isSplitApks;
        private final String[] splitNames;

        public SplitApksInfo(boolean z10, String[] strArr) {
            this.isSplitApks = z10;
            this.splitNames = strArr;
        }

        public String[] getSplitNames() {
            return this.splitNames;
        }

        public boolean isSplitApks() {
            return this.isSplitApks;
        }
    }

    private ContextUtils() {
    }

    public static /* synthetic */ String a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 != 0) {
                return context.getString(i10);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean appIsLibraryForComposePreview(Context context) {
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ ApplicationInfo e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Context getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @SuppressLint({"NewApi"})
    public static ApplicationInfo getApplicationInfo(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticAppInfo33.getValue(context) : staticAppInfo.getValue(context);
    }

    public static String getApplicationName(Context context) {
        return applicationName.getValue(context);
    }

    public static String[] getArchitectures() {
        return Build.SUPPORTED_ABIS;
    }

    public static DisplayMetrics getDisplayMetrics(Context context, ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting DisplayMetrics.", th);
            return null;
        }
    }

    public static String getFamily(ILogger iLogger) {
        try {
            return Build.MODEL.split(StringUtils.SPACE, -1)[0];
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static String getKernelVersion(ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } finally {
            }
        } catch (IOException e10) {
            iLogger.log(SentryLevel.ERROR, "Exception while attempting to read kernel information", e10);
            return property;
        }
    }

    public static ActivityManager.MemoryInfo getMemInfo(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.log(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static PackageInfo getPackageInfo(Context context, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticPackageInfo33.getValue(context) : staticPackageInfo.getValue(context);
    }

    @SuppressLint({"NewApi"})
    public static String getVersionCode(PackageInfo packageInfo, BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : getVersionCodeDep(packageInfo);
    }

    private static String getVersionCodeDep(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    public static String getVersionName(PackageInfo packageInfo) {
        return packageInfo.versionName;
    }

    public static boolean isForegroundImportance() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent registerReceiver(Context context, SentryOptions sentryOptions, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        return registerReceiver(context, new BuildInfoProvider(sentryOptions.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    public static void resetInstance() {
        staticPackageInfo33.resetValue();
        staticPackageInfo.resetValue();
        applicationName.resetValue();
        staticAppInfo33.resetValue();
        staticAppInfo.resetValue();
    }

    public static SideLoadedInfo retrieveSideLoadedInfo(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        String str;
        try {
            PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfo != null && packageManager != null) {
                str = packageInfo.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new SideLoadedInfo(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.log(SentryLevel.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static SplitApksInfo retrieveSplitApksInfo(Context context, BuildInfoProvider buildInfoProvider) {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo(context, buildInfoProvider);
        PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
        if (packageInfo == null) {
            return null;
        }
        return new SplitApksInfo((applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfo.splitNames);
    }

    public static void setAppPackageInfo(PackageInfo packageInfo, BuildInfoProvider buildInfoProvider, DeviceInfoUtil deviceInfoUtil, App app2) {
        app2.setAppIdentifier(packageInfo.packageName);
        app2.setAppVersion(packageInfo.versionName);
        app2.setAppBuild(getVersionCode(packageInfo, buildInfoProvider));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                String str = strArr[i10];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        app2.setPermissions(map);
        if (deviceInfoUtil != null) {
            try {
                SplitApksInfo splitApksInfo = deviceInfoUtil.getSplitApksInfo();
                if (splitApksInfo != null) {
                    app2.setSplitApks(Boolean.valueOf(splitApksInfo.isSplitApks()));
                    if (splitApksInfo.getSplitNames() != null) {
                        app2.setSplitNames(Arrays.asList(splitApksInfo.getSplitNames()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static PackageInfo getPackageInfo(Context context, int i10, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        try {
            if (buildInfoProvider.getSdkInfoVersion() >= 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i10));
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    @SuppressLint({"NewApi", "UnspecifiedRegisterReceiverFlag"})
    public static Intent registerReceiver(Context context, BuildInfoProvider buildInfoProvider, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        if (buildInfoProvider.getSdkInfoVersion() >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }
}
