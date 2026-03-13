package com.braze.managers;

import Od.F;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrazeConfigurationProvider f28021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.braze.storage.w0 f28023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PackageInfo f28024e;

    public x(Context context, BrazeConfigurationProvider configurationProvider) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        this.f28020a = context;
        this.f28021b = configurationProvider;
        PackageInfo packageInfoJ = j();
        this.f28022c = packageInfoJ != null ? packageInfoJ.versionName : null;
        this.f28023d = new com.braze.storage.w0(context);
    }

    public static final String a() {
        return "App version code could not be read. Returning null";
    }

    public static final String g() {
        return "Failed to collect background restriction information from Activity Manager";
    }

    public static final String i() {
        return "Caught exception while reading the phone carrier name.";
    }

    public final com.braze.models.outgoing.h b() {
        BrazeConfigurationProvider configurationProvider = this.f28021b;
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        String strH = h();
        String str = Build.BRAND;
        if (str == null || F.k0(str)) {
            str = null;
        }
        String str2 = Build.MODEL;
        Locale locale = Locale.getDefault();
        AbstractC4862t.d(locale, "getDefault(...)");
        AbstractC4862t.e(locale, "locale");
        String string = locale.toString();
        AbstractC4862t.d(string, "toString(...)");
        TimeZone timeZone = TimeZone.getDefault();
        AbstractC4862t.d(timeZone, "getDefault(...)");
        return new com.braze.models.outgoing.h(configurationProvider, strValueOf, strH, str, str2, string, timeZone.getID(), Boolean.valueOf(d()), Boolean.valueOf(f()), this.f28023d.readString(DataStoreKey.GOOGLE_ADVERTISING_ID, null), this.f28023d.readBoolean(DataStoreKey.AD_TRACKING_ENABLED, null));
    }

    public final String c() {
        PackageInfo packageInfoJ = j();
        if (packageInfoJ == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: c5.U3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.x.a();
                }
            }, 7, (Object) null);
            return null;
        }
        return packageInfoJ.getLongVersionCode() + ".0.0.0";
    }

    public final boolean d() {
        Object systemService = this.f28020a.getSystemService("notification");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return ((NotificationManager) systemService).areNotificationsEnabled();
    }

    public final boolean f() {
        try {
            Object systemService = this.f28020a.getSystemService("activity");
            AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            return ((ActivityManager) systemService).isBackgroundRestricted();
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.T3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.x.g();
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final String h() {
        try {
            Object systemService = this.f28020a.getSystemService("phone");
            AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (networkOperatorName != null) {
                return F.e1(networkOperatorName).toString();
            }
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.S3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.x.i();
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public final PackageInfo j() {
        PackageInfo packageInfo = this.f28024e;
        if (packageInfo != null) {
            return packageInfo;
        }
        final String packageName = this.f28020a.getPackageName();
        try {
            PackageInfo packageInfo2 = Build.VERSION.SDK_INT >= 33 ? this.f28020a.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : this.f28020a.getPackageManager().getPackageInfo(packageName, 0);
            this.f28024e = packageInfo2;
            return packageInfo2;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28625E, (Throwable) e10, false, new InterfaceC6082a() { // from class: c5.R3
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.managers.x.a(packageName);
                }
            }, 4, (Object) null);
            ApplicationInfo applicationInfo = this.f28020a.getApplicationInfo();
            PackageInfo packageArchiveInfo = Build.VERSION.SDK_INT >= 33 ? this.f28020a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0L)) : this.f28020a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
            this.f28024e = packageArchiveInfo;
            return packageArchiveInfo;
        }
    }

    public static final String a(String str) {
        return "Unable to inspect package [" + str + "]";
    }
}
