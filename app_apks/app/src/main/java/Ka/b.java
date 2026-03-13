package Ka;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.spotify.sdk.android.auth.browser.RedirectUriReceiverActivity;
import com.spotify.sdk.android.auth.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7785a = "b";

    public static String a(PackageManager packageManager, Uri uri) {
        Intent intentAddCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intentAddCategory, 0);
        String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        Log.d(f7785a, "Found default package name for handling VIEW intents: " + str);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intentAddCategory, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                Log.d(f7785a, "Adding " + resolveInfo.activityInfo.packageName + " to supported packages");
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        if (arrayList.size() > 1) {
            return (TextUtils.isEmpty(str) || !arrayList.contains(str)) ? (String) arrayList.get(0) : str;
        }
        return null;
    }

    public static String b(Context context, c cVar) {
        String strC = cVar.c();
        String strA = a(context.getPackageManager(), cVar.h());
        return (strC.startsWith("http") || strC.startsWith("https") || !c(strA) || !d(context.getPackageManager(), strC)) ? "" : strA;
    }

    public static boolean c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.d(f7785a, "No package supporting CustomTabs found.");
        return false;
    }

    public static boolean d(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse(str));
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 64).iterator();
        while (it.hasNext()) {
            if (RedirectUriReceiverActivity.class.getName().equals(it.next().activityInfo.name)) {
                return true;
            }
        }
        return false;
    }
}
