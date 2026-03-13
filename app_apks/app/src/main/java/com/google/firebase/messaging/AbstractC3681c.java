package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.m;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.google.firebase.messaging.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3681c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f31710a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: com.google.firebase.messaging.c$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.e f31711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f31712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f31713c;

        public a(m.e eVar, String str, int i10) {
            this.f31711a = eVar;
            this.f31712b = str;
            this.f31713c = i10;
        }
    }

    public static PendingIntent a(Context context, M m10, String str, PackageManager packageManager) {
        Intent intentF = f(str, m10, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(m10.y());
        if (q(m10)) {
            intentF.putExtra("gcm.n.analytics_data", m10.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    public static PendingIntent b(Context context, Context context2, M m10) {
        if (q(m10)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(m10.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, M m10, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        m.e eVar = new m.e(context2, str);
        String strN = m10.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.o(strN);
        }
        String strN2 = m10.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.n(strN2);
            eVar.N(new m.c().b(strN2));
        }
        eVar.L(m(packageManager, resources, packageName, m10.p("gcm.n.icon"), bundle));
        Uri uriN = n(packageName, m10, resources);
        if (uriN != null) {
            eVar.M(uriN);
        }
        eVar.m(a(context, m10, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, m10);
        if (pendingIntentB != null) {
            eVar.t(pendingIntentB);
        }
        Integer numH = h(context2, m10.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.k(numH.intValue());
        }
        eVar.g(!m10.a("gcm.n.sticky"));
        eVar.B(m10.a("gcm.n.local_only"));
        String strP = m10.p("gcm.n.ticker");
        if (strP != null) {
            eVar.P(strP);
        }
        Integer numM = m10.m();
        if (numM != null) {
            eVar.F(numM.intValue());
        }
        Integer numR = m10.r();
        if (numR != null) {
            eVar.T(numR.intValue());
        }
        Integer numL = m10.l();
        if (numL != null) {
            eVar.C(numL.intValue());
        }
        Long lJ = m10.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.J(true);
            eVar.U(lJ.longValue());
        }
        long[] jArrQ = m10.q();
        if (jArrQ != null) {
            eVar.S(jArrQ);
        }
        int[] iArrE = m10.e();
        if (iArrE != null) {
            eVar.A(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.s(i(m10));
        return new a(eVar, o(m10), 0);
    }

    public static a e(Context context, M m10) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, m10, k(context, m10.k(), bundleJ), bundleJ);
    }

    public static Intent f(String str, M m10, PackageManager packageManager) {
        String strP = m10.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = m10.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f31710a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(L0.a.d(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i(M m10) {
        boolean zA = m10.a("gcm.n.default_sound");
        ?? r02 = zA;
        if (m10.a("gcm.n.default_vibrate_timings")) {
            r02 = (zA ? 1 : 0) | 2;
        }
        return m10.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String string;
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int l(int i10) {
        return i10 | 67108864;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        return (i10 == 0 || !p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    public static Uri n(String str, M m10, Resources resources) {
        String strO = m10.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    public static String o(M m10) {
        String strP = m10.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    public static boolean p(Resources resources, int i10) {
        return true;
    }

    public static boolean q(M m10) {
        return m10.a("google.c.a.e");
    }
}
