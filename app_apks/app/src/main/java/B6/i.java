package B6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.SentryBaseEvent;
import s6.AbstractC5788g;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f676d;

    public static boolean a(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i10 = AbstractC5788g.f44160a;
        return SentryBaseEvent.JsonKeys.USER.equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return e(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !l.d()) {
            return true;
        }
        if (f(context)) {
            return !l.e() || l.h();
        }
        return false;
    }

    public static boolean e(PackageManager packageManager) {
        if (f673a == null) {
            f673a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f673a.booleanValue();
    }

    public static boolean f(Context context) {
        if (f674b == null) {
            f674b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f674b.booleanValue();
    }

    public static boolean g(Context context) {
        if (f675c == null) {
            f675c = Boolean.valueOf(l.e() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f675c.booleanValue();
    }

    public static boolean h(PackageManager packageManager) {
        if (f676d == null) {
            boolean z10 = false;
            if (l.e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f676d = Boolean.valueOf(z10);
        }
        return f676d.booleanValue();
    }
}
