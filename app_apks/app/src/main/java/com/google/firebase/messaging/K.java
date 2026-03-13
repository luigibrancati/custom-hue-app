package com.google.firebase.messaging;

import U8.a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import h8.C4288f;
import io.sentry.ProfilingTraceData;
import java.util.concurrent.ExecutionException;
import l8.InterfaceC4964a;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class K {
    public static void A(String str, Bundle bundle) {
        try {
            C4288f.o();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString("_nmid", strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString("_nmn", strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString("label", strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString("message_channel", strG);
            }
            String strR = r(bundle);
            if (strR != null) {
                bundle2.putString("_nt", strR);
            }
            String strL = l(bundle);
            if (strL != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strL));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String strT = t(bundle);
            if (strT != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strT));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String strN = n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strN);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC4964a interfaceC4964a = (InterfaceC4964a) C4288f.o().k(InterfaceC4964a.class);
            if (interfaceC4964a != null) {
                interfaceC4964a.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void B(boolean z10) {
        C4288f.o().m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z10).apply();
    }

    public static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC4964a interfaceC4964a = (InterfaceC4964a) C4288f.o().k(InterfaceC4964a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC4964a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC4964a.b("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        interfaceC4964a.a("fcm", "_cmp", bundle2);
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean E(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return F(intent.getExtras());
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C4288f.o();
            Context contextM = C4288f.o().m();
            SharedPreferences sharedPreferences = contextM.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextM.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static U8.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0209a c0209aJ = U8.a.p().n(s(extras)).e(bVar).f(f(extras)).i(o()).l(a.d.ANDROID).h(m(extras)).j(k(extras));
        String strH = h(extras);
        if (strH != null) {
            c0209aJ.g(strH);
        }
        String strR = r(extras);
        if (strR != null) {
            c0209aJ.m(strR);
        }
        String strC = c(extras);
        if (strC != null) {
            c0209aJ.c(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c0209aJ.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c0209aJ.d(strE);
        }
        long jQ = q(extras);
        if (jQ > 0) {
            c0209aJ.k(jQ);
        }
        return c0209aJ.a();
    }

    public static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(P8.g.q(C4288f.o()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return ProfilingTraceData.TRUNCATION_REASON_NORMAL.equals(str) ? 2 : 0;
    }

    public static int k(Bundle bundle) {
        int iP = p(bundle);
        if (iP == 2) {
            return 5;
        }
        return iP == 1 ? 10 : 0;
    }

    public static String l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static a.c m(Bundle bundle) {
        return (bundle == null || !M.t(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    public static String n(Bundle bundle) {
        return (bundle == null || !M.t(bundle)) ? "data" : "display";
    }

    public static String o() {
        return C4288f.o().m().getPackageName();
    }

    public static int p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return j(string);
    }

    public static long q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        C4288f c4288fO = C4288f.o();
        String strF = c4288fO.r().f();
        if (strF != null) {
            try {
                return Long.parseLong(strF);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String strC = c4288fO.r().c();
        if (strC.startsWith("1:")) {
            String[] strArrSplit = strC.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e12) {
                Log.w("FirebaseMessaging", "error parsing app ID", e12);
            }
        } else {
            try {
                return Long.parseLong(strC);
            } catch (NumberFormatException e13) {
                Log.w("FirebaseMessaging", "error parsing app ID", e13);
            }
        }
        return 0L;
    }

    public static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static int s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public static String t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static boolean u(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A("_nd", intent.getExtras());
    }

    public static void w(Intent intent) {
        A("_nf", intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A("_no", bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A("_nr", intent.getExtras());
        }
        if (D(intent)) {
            z(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    public static void z(a.b bVar, Intent intent, Y5.j jVar) {
        if (jVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        U8.a aVarB = b(bVar, intent);
        if (aVarB == null) {
            return;
        }
        try {
            jVar.a("FCM_CLIENT_EVENT_LOGGING", U8.b.class, Y5.c.b("proto"), new Y5.h() { // from class: com.google.firebase.messaging.J
                @Override // Y5.h
                public final Object apply(Object obj) {
                    return ((U8.b) obj).c();
                }
            }).a(Y5.d.g(U8.b.b().b(aVarB).a(), Y5.g.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }
}
