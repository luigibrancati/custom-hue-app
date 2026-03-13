package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import io.sentry.SentryBaseEvent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: s6.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5788g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44160a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f44162c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f44163d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f44161b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f44164e = new AtomicBoolean();

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String b(int i10) {
        return C5783b.n(i10);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        try {
            if (!f44163d) {
                try {
                    PackageInfo packageInfoE = D6.d.a(context).e("com.google.android.gms", 134217792);
                    C5789h.a(context);
                    if (packageInfoE == null || C5789h.d(packageInfoE, false) || !C5789h.d(packageInfoE, true)) {
                        f44162c = false;
                    } else {
                        f44162c = true;
                    }
                    f44163d = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f44163d = true;
                }
            }
            return f44162c || !B6.i.b();
        } catch (Throwable th) {
            f44163d = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int f(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.AbstractC5788g.f(android.content.Context, int):int");
    }

    public static boolean g(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return k(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(Context context) {
        Object systemService = context.getSystemService(SentryBaseEvent.JsonKeys.USER);
        AbstractC6056k.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean i(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    public static boolean j(Context context, int i10, String str) {
        return B6.o.b(context, i10, str);
    }

    public static boolean k(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !h(context);
    }
}
