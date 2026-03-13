package v6;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import s6.AbstractC5787f;
import s6.AbstractC5790i;

/* JADX INFO: renamed from: v6.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6065u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0.J f45881a = new b0.J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f45882b;

    public static String a(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(q6.b.f43275f);
            case 2:
                return resources.getString(q6.b.f43281l);
            case 3:
                return resources.getString(q6.b.f43272c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
                sb2.append("Unexpected error code ");
                sb2.append(i10);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i10) {
        String strH = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : a(context, i10);
        return strH == null ? context.getResources().getString(q6.b.f43277h) : strH;
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String strF = f(context);
        if (i10 == 1) {
            return resources.getString(q6.b.f43274e, strF);
        }
        if (i10 == 2) {
            return B6.i.d(context) ? resources.getString(q6.b.f43283n) : resources.getString(q6.b.f43280k, strF);
        }
        if (i10 == 3) {
            return resources.getString(q6.b.f43271b, strF);
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strF);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", strF);
        }
        if (i10 == 9) {
            return resources.getString(q6.b.f43278i, strF);
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strF);
        }
        switch (i10) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strF);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strF);
            case 18:
                return resources.getString(q6.b.f43282m, strF);
            default:
                return resources.getString(AbstractC5790i.f44168a, strF);
        }
    }

    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", f(context)) : c(context, i10);
    }

    public static String e(Context context, int i10) {
        Resources resources = context.getResources();
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(q6.b.f43270a) : resources.getString(q6.b.f43279j) : resources.getString(q6.b.f43273d);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            return D6.d.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(AbstractC5790i.f44168a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        b0.J j10 = f45881a;
        synchronized (j10) {
            try {
                Locale localeC = U0.e.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f45882b)) {
                    j10.clear();
                    f45882b = localeC;
                }
                String str2 = (String) j10.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesD = AbstractC5787f.d(context);
                if (resourcesD == null) {
                    return null;
                }
                int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 18);
                    sb2.append("Missing resource: ");
                    sb2.append(str);
                    Log.w("GoogleApiAvailability", sb2.toString());
                    return null;
                }
                String string = resourcesD.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    j10.put(str, string);
                    return string;
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 20);
                sb3.append("Got empty resource: ");
                sb3.append(str);
                Log.w("GoogleApiAvailability", sb3.toString());
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
