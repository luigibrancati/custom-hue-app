package T8;

import L8.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import h8.C4284b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16261d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f16258a = contextA;
        this.f16259b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f16260c = cVar;
        this.f16261d = c();
    }

    public static Context a(Context context) {
        return L0.a.b(context);
    }

    public synchronized boolean b() {
        return this.f16261d;
    }

    public final boolean c() {
        return this.f16259b.contains("firebase_data_collection_default_enabled") ? this.f16259b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f16258a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f16258a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f16259b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f16259b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(boolean z10) {
        if (this.f16261d != z10) {
            this.f16261d = z10;
            this.f16260c.d(new L8.a(C4284b.class, new C4284b(z10)));
        }
    }
}
