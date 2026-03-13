package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3524e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f30155a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return o(intent.getExtras(), "ProxyBillingActivity");
        }
        k("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            k(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            j(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        k(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j10);
        return bundle;
    }

    public static Bundle d(boolean z10, boolean z11, boolean z12, boolean z13, String str, long j10) {
        Bundle bundle = new Bundle();
        c(bundle, str, j10);
        if (z10 && z12) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z11 && z13) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static Bundle e(String str, long j10) {
        Bundle bundle = new Bundle();
        c(bundle, str, j10);
        return bundle;
    }

    public static com.android.billingclient.api.a f(Intent intent, String str) {
        if (intent != null) {
            a.C0341a c0341aC = com.android.billingclient.api.a.c();
            c0341aC.c(b(intent.getExtras(), str));
            c0341aC.b(g(intent.getExtras(), str));
            return c0341aC.a();
        }
        k("BillingHelper", "Got null intent!");
        a.C0341a c0341aC2 = com.android.billingclient.api.a.c();
        c0341aC2.c(6);
        c0341aC2.b("An internal error occurred.");
        return c0341aC2.a();
    }

    public static String g(Bundle bundle, String str) {
        if (bundle == null) {
            k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            j(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        k(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String h(int i10) {
        return EnumC3612t0.a(i10).toString();
    }

    public static List i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseP = p(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseP == null) {
                j("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseP);
            return arrayList;
        }
        j("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i10 = 0; i10 < stringArrayList.size() && i10 < stringArrayList2.size(); i10++) {
            Purchase purchaseP2 = p(stringArrayList.get(i10), stringArrayList2.get(i10));
            if (purchaseP2 != null) {
                arrayList.add(purchaseP2);
            }
        }
        return arrayList;
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i10 = 40000;
            while (!str2.isEmpty() && i10 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i10));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i10 -= iMin;
            }
        }
    }

    public static void k(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void l(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle m(com.android.billingclient.api.a aVar, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", aVar.b());
        bundle.putString("DEBUG_MESSAGE", aVar.a());
        bundle.putInt("LOG_REASON", i10 - 1);
        return bundle;
    }

    public static Bundle n(com.android.billingclient.api.a aVar, int i10, String str) {
        Bundle bundleM = m(aVar, 5);
        if (str != null) {
            bundleM.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return bundleM;
    }

    public static int o(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        k(str, "Unexpected null bundle received!");
        return 0;
    }

    public static Purchase p(String str, String str2) {
        if (str == null || str2 == null) {
            j("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            k("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
