package Wa;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ar.core.ImageMetadata;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f17873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f17874b;

    public b(Activity activity, Context context) {
        this.f17873a = activity;
        this.f17874b = context;
    }

    public Intent a(String str, Integer num, String str2, Uri uri, Bundle bundle, String str3, ComponentName componentName, String str4) {
        if (this.f17874b == null) {
            Log.wtf("IntentSender", "Trying to build an intent before the applicationContext was initialized.");
            return null;
        }
        Intent intent = new Intent();
        if (str != null) {
            intent.setAction(str);
        }
        if (num != null) {
            intent.addFlags(num.intValue());
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.addCategory(str2);
        }
        if (uri != null && str4 == null) {
            intent.setData(uri);
        }
        if (str4 != null && uri == null) {
            intent.setType(str4);
        }
        if (str4 != null && uri != null) {
            intent.setDataAndType(uri, str4);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.setPackage(str3);
            if (componentName != null) {
                intent.setComponent(componentName);
            }
        }
        return intent;
    }

    public boolean b(Intent intent) {
        Context context = this.f17874b;
        if (context != null) {
            return context.getPackageManager().resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null;
        }
        Log.wtf("IntentSender", "Trying to resolve an activity before the applicationContext was initialized.");
        return false;
    }

    public Map c(Intent intent) {
        Context context = this.f17874b;
        if (context == null) {
            Log.wtf("IntentSender", "Trying to resolve an activity before the applicationContext was initialized.");
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        if (resolveInfoResolveActivity == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("activityName", resolveInfoResolveActivity.activityInfo.name);
        map.put("packageName", resolveInfoResolveActivity.activityInfo.packageName);
        map.put("appName", resolveInfoResolveActivity.loadLabel(packageManager));
        return map;
    }

    public void d(Intent intent, String str) {
        f(Intent.createChooser(intent, str));
    }

    public Intent e(String str) {
        return Intent.parseUri(str, 1);
    }

    public void f(Intent intent) {
        if (this.f17874b == null) {
            Log.wtf("IntentSender", "Trying to send an intent before the applicationContext was initialized.");
            return;
        }
        Log.v("IntentSender", "Sending intent " + intent);
        Activity activity = this.f17873a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.addFlags(268435456);
            this.f17874b.startActivity(intent);
        }
    }

    public void g(Intent intent) {
        if (this.f17874b == null) {
            Log.wtf("IntentSender", "Trying to send broadcast before the applicationContext was initialized.");
            return;
        }
        Log.v("IntentSender", "Sending broadcast " + intent);
        this.f17874b.sendBroadcast(intent);
    }

    public void h(Intent intent) {
        if (this.f17874b == null) {
            Log.wtf("IntentSender", "Trying to send an intent before the applicationContext was initialized.");
            return;
        }
        Log.v("IntentSender", "Sending service intent " + intent);
        Activity activity = this.f17873a;
        if (activity != null) {
            activity.startService(intent);
        } else {
            intent.addFlags(268435456);
            this.f17874b.startService(intent);
        }
    }

    public void i(Activity activity) {
        this.f17873a = activity;
    }

    public void j(Context context) {
        this.f17874b = context;
    }
}
