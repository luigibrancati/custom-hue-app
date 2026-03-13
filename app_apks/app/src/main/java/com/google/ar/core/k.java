package com.google.ar.core;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class k extends ArCoreApk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k f31194d = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Exception f31195a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f31200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArCoreApk.Availability f31201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f31202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x f31203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f31204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f31205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f31206m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f31197c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f31196b = true;

    public static k a() {
        return f31194d;
    }

    private final void h(Context context, h hVar) {
        ArCoreApk.Availability availability;
        if (!j()) {
            hVar.a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
            return;
        }
        try {
            if (d(context)) {
                c();
                try {
                    availability = aj.a(context) != null ? ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD : ArCoreApk.Availability.SUPPORTED_INSTALLED;
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                    availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                }
                hVar.a(availability);
                return;
            }
            if (k(context) != -1) {
                hVar.a(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
            } else if (i(context)) {
                hVar.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
            } else {
                b(context).c(context, hVar);
            }
        } catch (FatalException e10) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e10);
            hVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    private final boolean i(Context context) {
        l(context);
        return this.f31205l;
    }

    private static boolean j() {
        return true;
    }

    private static int k(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i10 = packageInfo.versionCode;
            if (i10 != 0) {
                return i10;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                if (serviceInfoArr.length != 0) {
                    return 0;
                }
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void l(Context context) {
        if (this.f31204k) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
            if (!bundle.containsKey("com.google.ar.core")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
            }
            String string = bundle.getString("com.google.ar.core");
            Objects.requireNonNull(string);
            this.f31205l = string.equals("required");
            if (!bundle.containsKey("com.google.ar.core.min_apk_version")) {
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
            }
            this.f31206m = bundle.getInt("com.google.ar.core.min_apk_version");
            try {
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                String canonicalName = InstallActivity.class.getCanonicalName();
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (canonicalName.equals(activityInfo.name)) {
                        this.f31204k = true;
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43);
                sb2.append("Application manifest must contain activity ");
                sb2.append(canonicalName);
                throw new FatalException(sb2.toString());
            } catch (PackageManager.NameNotFoundException e10) {
                throw new FatalException("Could not load application package info", e10);
            }
        } catch (PackageManager.NameNotFoundException e11) {
            throw new FatalException("Could not load application package metadata", e11);
        }
    }

    private static final ArCoreApk.InstallStatus m(Activity activity) {
        PendingIntent pendingIntentA = aj.a(activity);
        if (pendingIntentA != null) {
            try {
                Log.i("ARCore-ArCoreApk", "Starting setup activity");
                activity.startIntentSender(pendingIntentA.getIntentSender(), null, 0, 0, 0, Build.VERSION.SDK_INT > 33 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException e10) {
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e10);
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    public final synchronized x b(Context context) {
        try {
            if (this.f31203j == null) {
                x xVar = new x(null);
                xVar.a(context.getApplicationContext());
                this.f31203j = xVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31203j;
    }

    public final synchronized void c() {
        try {
            if (this.f31195a == null) {
                this.f31199f = 0;
            }
            this.f31198e = false;
            x xVar = this.f31203j;
            if (xVar != null) {
                xVar.b();
                this.f31203j = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        synchronized (this) {
            try {
                ArCoreApk.Availability availability = this.f31201h;
                if (availability == null || availability.isUnknown()) {
                    if (!this.f31202i) {
                        this.f31202i = true;
                        h(context, new i(this));
                    }
                }
                ArCoreApk.Availability availability2 = this.f31201h;
                if (availability2 != null) {
                    if (!availability2.isUnsupported()) {
                        this.f31201h = null;
                    }
                    return availability2;
                }
                if (this.f31202i) {
                    return ArCoreApk.Availability.UNKNOWN_CHECKING;
                }
                Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                return ArCoreApk.Availability.UNKNOWN_ERROR;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.ar.core.ArCoreApk
    public final void checkAvailabilityAsync(Context context, Consumer<ArCoreApk.Availability> consumer) {
        h(context, new j(this, consumer));
    }

    public final boolean d(Context context) {
        l(context);
        return k(context) == 0 || k(context) >= this.f31206m;
    }

    public final /* synthetic */ Handler e() {
        return this.f31197c;
    }

    public final /* synthetic */ void f(ArCoreApk.Availability availability) {
        this.f31201h = availability;
    }

    public final /* synthetic */ void g() {
        this.f31202i = false;
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z10) {
        return requestInstall(activity, z10, i(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL, i(activity) ? ArCoreApk.UserMessageType.APPLICATION : ArCoreApk.UserMessageType.USER_ALREADY_INFORMED);
    }

    @Override // com.google.ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z10, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) throws UnavailableUserDeclinedInstallationException, UnavailableDeviceNotCompatibleException {
        if (j()) {
            if (d(activity)) {
                c();
                return m(activity);
            }
            if (!this.f31198e) {
                Exception exc = this.f31195a;
                if (exc != null) {
                    if (z10) {
                        Log.w("ARCore-ArCoreApk", "Clearing previous failure: ", exc);
                        this.f31195a = null;
                    } else {
                        if (!(exc instanceof UnavailableDeviceNotCompatibleException)) {
                            if (!(exc instanceof UnavailableUserDeclinedInstallationException)) {
                                if (exc instanceof RuntimeException) {
                                    Log.e("ARCore-ArCoreApk", "Throwing RuntimeException.");
                                    throw ((RuntimeException) exc);
                                }
                                throw new RuntimeException("Unexpected exception type", exc);
                            }
                            Log.e("ARCore-ArCoreApk", "Throwing UnavailableUserDeclinedInstallationException");
                            throw ((UnavailableUserDeclinedInstallationException) exc);
                        }
                        Log.e("ARCore-ArCoreApk", "Throwing UnavailableDeviceNotCompatibleException");
                        throw ((UnavailableDeviceNotCompatibleException) exc);
                    }
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (jUptimeMillis - this.f31200g > 5000) {
                    this.f31199f = 0;
                }
                int i10 = this.f31199f + 1;
                this.f31199f = i10;
                this.f31200g = jUptimeMillis;
                if (i10 <= 2) {
                    try {
                        activity.startActivity(new Intent(activity, (Class<?>) InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                        this.f31198e = true;
                        return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                    } catch (ActivityNotFoundException e10) {
                        throw new FatalException("Failed to launch InstallActivity.", e10);
                    }
                }
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        }
        throw new UnavailableDeviceNotCompatibleException();
    }
}
