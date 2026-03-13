package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.DateUtils;
import io.sentry.IConnectionStatusProvider;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.android.core.internal.util.DeviceOrientations;
import io.sentry.android.core.internal.util.RootChecker;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.runtime.IRuntimeManager;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceInfoUtil {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile DeviceInfoUtil instance;
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final Boolean isEmulator;
    private final SentryAndroidOptions options;
    private final OperatingSystem os;
    private final ContextUtils.SideLoadedInfo sideLoadedInfo;
    private final ContextUtils.SplitApksInfo splitApksInfo;
    private final Long totalMem;

    /* JADX INFO: renamed from: io.sentry.android.core.DeviceInfoUtil$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus;

        static {
            int[] iArr = new int[IConnectionStatusProvider.ConnectionStatus.values().length];
            $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus = iArr;
            try {
                iArr[IConnectionStatusProvider.ConnectionStatus.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[IConnectionStatusProvider.ConnectionStatus.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public DeviceInfoUtil(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.context = context;
        this.options = sentryAndroidOptions;
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(sentryAndroidOptions.getLogger());
        this.buildInfoProvider = buildInfoProvider;
        CpuInfoUtils.getInstance().readMaxFrequencies();
        this.os = retrieveOperatingSystemInformation();
        this.isEmulator = buildInfoProvider.isEmulator();
        this.sideLoadedInfo = ContextUtils.retrieveSideLoadedInfo(context, sentryAndroidOptions.getLogger(), buildInfoProvider);
        this.splitApksInfo = ContextUtils.retrieveSplitApksInfo(context, buildInfoProvider);
        ActivityManager.MemoryInfo memInfo = ContextUtils.getMemInfo(context, sentryAndroidOptions.getLogger());
        if (memInfo != null) {
            this.totalMem = Long.valueOf(memInfo.totalMem);
        } else {
            this.totalMem = null;
        }
    }

    public static /* synthetic */ void b(DeviceInfoUtil deviceInfoUtil, Device device, boolean z10) {
        StatFs externalStorageStat;
        deviceInfoUtil.getClass();
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory != null) {
            StatFs statFs = new StatFs(dataDirectory.getPath());
            device.setStorageSize(deviceInfoUtil.getTotalInternalStorage(statFs));
            device.setFreeStorage(deviceInfoUtil.getUnusedInternalStorage(statFs));
        }
        if (!z10 || (externalStorageStat = deviceInfoUtil.getExternalStorageStat(deviceInfoUtil.context.getExternalFilesDir(null))) == null) {
            return;
        }
        device.setExternalStorageSize(deviceInfoUtil.getTotalExternalStorage(externalStorageStat));
        device.setExternalFreeStorage(deviceInfoUtil.getUnusedExternalStorage(externalStorageStat));
    }

    private Intent getBatteryIntent() {
        return ContextUtils.registerReceiver(this.context, this.buildInfoProvider, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), (Handler) null);
    }

    public static Float getBatteryLevel(Intent intent, SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    private Float getBatteryTemperature(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting battery temperature.", th);
            return null;
        }
    }

    private Date getBootTime() {
        try {
            return DateUtils.getDateTime(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e10) {
            this.options.getLogger().log(SentryLevel.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    private String getDeviceId() {
        try {
            return (String) this.options.getRuntimeManager().runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.S
                @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
                public final Object run() {
                    return Installation.id(this.f38489a.context);
                }
            });
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting installationId.", th);
            return null;
        }
    }

    private File getExternalStorageDep(File file) {
        File[] externalFilesDirs = this.context.getExternalFilesDirs(null);
        if (externalFilesDirs != null) {
            String absolutePath = file != null ? file.getAbsolutePath() : null;
            for (File file2 : externalFilesDirs) {
                if (file2 != null && (absolutePath == null || absolutePath.isEmpty() || !file2.getAbsolutePath().contains(absolutePath))) {
                    return file2;
                }
            }
        } else {
            this.options.getLogger().log(SentryLevel.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    private StatFs getExternalStorageStat(File file) {
        try {
            File externalStorageDep = getExternalStorageDep(file);
            if (externalStorageDep != null) {
                return new StatFs(externalStorageDep.getPath());
            }
            return null;
        } catch (Throwable unused) {
            this.options.getLogger().log(SentryLevel.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
    }

    public static DeviceInfoUtil getInstance(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (instance == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (instance == null) {
                    instance = new DeviceInfoUtil(ContextUtils.getApplicationContext(context), sentryAndroidOptions);
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return instance;
    }

    private Device.DeviceOrientation getOrientation() {
        Device.DeviceOrientation orientation;
        Throwable th;
        try {
            orientation = DeviceOrientations.getOrientation(this.context.getResources().getConfiguration().orientation);
            if (orientation != null) {
                return orientation;
            }
            try {
                this.options.getLogger().log(SentryLevel.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                return null;
            } catch (Throwable th2) {
                th = th2;
                this.options.getLogger().log(SentryLevel.ERROR, "Error getting device orientation.", th);
                return orientation;
            }
        } catch (Throwable th3) {
            orientation = null;
            th = th3;
        }
    }

    private TimeZone getTimeZone() {
        if (this.buildInfoProvider.getSdkInfoVersion() >= 24) {
            LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            if (!locales.isEmpty()) {
                return Calendar.getInstance(locales.get(0)).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    private Long getTotalExternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting total external storage amount.", th);
            return null;
        }
    }

    private Long getTotalInternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting total internal storage amount.", th);
            return null;
        }
    }

    private Long getUnusedExternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting unused external storage amount.", th);
            return null;
        }
    }

    private Long getUnusedInternalStorage(StatFs statFs) {
        try {
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error getting unused internal storage amount.", th);
            return null;
        }
    }

    public static Boolean isCharging(Intent intent, SentryOptions sentryOptions) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    public static void resetInstance() {
        instance = null;
    }

    private OperatingSystem retrieveOperatingSystemInformation() {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.setName("Android");
        operatingSystem.setVersion(Build.VERSION.RELEASE);
        operatingSystem.setBuild(Build.DISPLAY);
        String kernelVersion = ContextUtils.getKernelVersion(this.options.getLogger());
        if (kernelVersion != null) {
            operatingSystem.setKernelVersion(kernelVersion);
        }
        if (this.options.isEnableRootCheck()) {
            operatingSystem.setRooted(Boolean.valueOf(new RootChecker(this.context, this.buildInfoProvider, this.options.getLogger()).isDeviceRooted()));
        }
        return operatingSystem;
    }

    private void setDeviceIO(final Device device, boolean z10, final boolean z11) {
        Intent batteryIntent = getBatteryIntent();
        if (batteryIntent != null) {
            device.setBatteryLevel(getBatteryLevel(batteryIntent, this.options));
            device.setCharging(isCharging(batteryIntent, this.options));
            device.setBatteryTemperature(getBatteryTemperature(batteryIntent));
        }
        int i10 = AnonymousClass1.$SwitchMap$io$sentry$IConnectionStatusProvider$ConnectionStatus[this.options.getConnectionStatusProvider().getConnectionStatus().ordinal()];
        device.setOnline(i10 != 1 ? i10 != 2 ? null : Boolean.TRUE : Boolean.FALSE);
        ActivityManager.MemoryInfo memInfo = ContextUtils.getMemInfo(this.context, this.options.getLogger());
        if (memInfo != null && z10) {
            device.setFreeMemory(Long.valueOf(memInfo.availMem));
            device.setLowMemory(Boolean.valueOf(memInfo.lowMemory));
        }
        this.options.getRuntimeManager().runWithRelaxedPolicy(new Runnable() { // from class: io.sentry.android.core.T
            @Override // java.lang.Runnable
            public final void run() {
                DeviceInfoUtil.b(this.f38491a, device, z11);
            }
        });
        if (device.getConnectionType() == null) {
            device.setConnectionType(this.options.getConnectionStatusProvider().getConnectionType());
        }
    }

    @SuppressLint({"NewApi"})
    public Device collectDeviceInformation(boolean z10, boolean z11) {
        Device device = new Device();
        device.setManufacturer(Build.MANUFACTURER);
        device.setBrand(Build.BRAND);
        device.setFamily(ContextUtils.getFamily(this.options.getLogger()));
        device.setModel(Build.MODEL);
        device.setModelId(Build.ID);
        device.setArchs(ContextUtils.getArchitectures());
        if (this.buildInfoProvider.getSdkInfoVersion() >= 31) {
            device.setChipset(Build.SOC_MANUFACTURER + StringUtils.SPACE + Build.SOC_MODEL);
        }
        device.setOrientation(getOrientation());
        Boolean bool = this.isEmulator;
        if (bool != null) {
            device.setSimulator(bool);
        }
        DisplayMetrics displayMetrics = ContextUtils.getDisplayMetrics(this.context, this.options.getLogger());
        if (displayMetrics != null) {
            device.setScreenWidthPixels(Integer.valueOf(displayMetrics.widthPixels));
            device.setScreenHeightPixels(Integer.valueOf(displayMetrics.heightPixels));
            device.setScreenDensity(Float.valueOf(displayMetrics.density));
            device.setScreenDpi(Integer.valueOf(displayMetrics.densityDpi));
        }
        device.setBootTime(getBootTime());
        device.setTimezone(getTimeZone());
        if (device.getId() == null) {
            device.setId(getDeviceId());
        }
        Locale locale = Locale.getDefault();
        if (device.getLocale() == null) {
            device.setLocale(locale.toString());
        }
        List<Integer> maxFrequencies = CpuInfoUtils.getInstance().readMaxFrequencies();
        if (!maxFrequencies.isEmpty()) {
            device.setProcessorFrequency(Double.valueOf(((Integer) Collections.max(maxFrequencies)).doubleValue()));
            device.setProcessorCount(Integer.valueOf(maxFrequencies.size()));
        }
        device.setMemorySize(this.totalMem);
        if (z10 && this.options.isCollectAdditionalContext()) {
            setDeviceIO(device, z11, this.options.isCollectExternalStorageContext());
        }
        return device;
    }

    public OperatingSystem getOperatingSystem() {
        return this.os;
    }

    public ContextUtils.SideLoadedInfo getSideLoadedInfo() {
        return this.sideLoadedInfo;
    }

    public ContextUtils.SplitApksInfo getSplitApksInfo() {
        return this.splitApksInfo;
    }

    public Long getTotalMemory() {
        return this.totalMem;
    }
}
