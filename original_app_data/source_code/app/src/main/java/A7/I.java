package A7;

import B7.c0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f169c = new c0("SplitInstallInfoProvider");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171b;

    public I(Context context) {
        this.f170a = context;
        this.f171b = context.getPackageName();
    }

    public static String a(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean c(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set d(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : f(packageInfo)) {
            if (!c(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final Set f(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f169c.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f169c.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f169c.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        G gA = H.a();
        if (gA != null) {
            hashSet.addAll(gA.zza());
        }
        return hashSet;
    }

    public final Set b() {
        PackageInfo packageInfoE = e();
        return (packageInfoE == null || packageInfoE.applicationInfo == null) ? new HashSet() : d(packageInfoE);
    }

    public final PackageInfo e() {
        try {
            return this.f170a.getPackageManager().getPackageInfo(this.f171b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f169c.b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }
}
