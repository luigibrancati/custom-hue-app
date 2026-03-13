package ja;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.sentry.ProfilingTraceData;
import io.sentry.SentryLockReason;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: ja.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C4753b implements MethodChannel.MethodCallHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39105a;

    public C4753b(Context context) {
        this.f39105a = context;
    }

    public final void a(String str, MethodChannel.Result result) {
        PackageInfo packageInfoC = c(str);
        if (packageInfoC != null) {
            result.success(b(packageInfoC));
            return;
        }
        result.error("", "App not found " + str, null);
    }

    public final Map b(PackageInfo packageInfo) {
        HashMap map = new HashMap();
        map.put(App.JsonKeys.APP_NAME, packageInfo.applicationInfo.loadLabel(this.f39105a.getPackageManager()).toString());
        map.put(SentryLockReason.JsonKeys.PACKAGE_NAME, packageInfo.packageName);
        map.put(ProfilingTraceData.JsonKeys.VERSION_CODE, String.valueOf(packageInfo.versionCode));
        map.put(ProfilingTraceData.JsonKeys.RELEASE, packageInfo.versionName);
        return map;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f39105a.getPackageManager().getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final List d() {
        List<PackageInfo> installedPackages = this.f39105a.getPackageManager().getInstalledPackages(0);
        ArrayList arrayList = new ArrayList(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            if ((packageInfo.applicationInfo.flags & 129) == 0) {
                arrayList.add(b(packageInfo));
            }
        }
        return arrayList;
    }

    public final void e(String str, MethodChannel.Result result) {
        try {
            ApplicationInfo applicationInfo = this.f39105a.getPackageManager().getApplicationInfo(str, 0);
            result.success(Boolean.valueOf(applicationInfo != null ? applicationInfo.enabled : false));
        } catch (PackageManager.NameNotFoundException e10) {
            result.error("", e10.getMessage() + StringUtils.SPACE + str, e10);
        }
    }

    public final void f(String str, MethodChannel.Result result) {
        Intent launchIntentForPackage;
        if (c(str) != null && (launchIntentForPackage = this.f39105a.getPackageManager().getLaunchIntentForPackage(str)) != null) {
            launchIntentForPackage.addFlags(268435456);
            this.f39105a.startActivity(launchIntentForPackage);
            result.success(null);
        } else {
            result.error("", "App not found " + str, null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "checkAvailability":
                a(methodCall.argument("uri").toString(), result);
                break;
            case "launchApp":
                f(methodCall.argument("uri").toString(), result);
                break;
            case "isAppEnabled":
                e(methodCall.argument("uri").toString(), result);
                break;
            case "getInstalledApps":
                result.success(d());
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
