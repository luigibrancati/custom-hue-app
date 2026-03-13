package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import h8.C4288f;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31626e = 0;

    public L(Context context) {
        this.f31622a = context;
    }

    public static String c(C4288f c4288f) {
        String strF = c4288f.r().f();
        if (strF != null) {
            return strF;
        }
        String strC = c4288f.r().c();
        if (!strC.startsWith("1:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String a() {
        try {
            if (this.f31623b == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31623b;
    }

    public synchronized String b() {
        try {
            if (this.f31624c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31624c;
    }

    public synchronized int d() {
        PackageInfo packageInfoF;
        try {
            if (this.f31625d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
                this.f31625d = packageInfoF.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f31625d;
    }

    public synchronized int e() {
        int i10 = this.f31626e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f31622a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!B6.l.e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f31626e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f31626e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (B6.l.e()) {
            this.f31626e = 2;
        } else {
            this.f31626e = 1;
        }
        return this.f31626e;
    }

    public final PackageInfo f(String str) {
        try {
            return this.f31622a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public boolean g() {
        return e() != 0;
    }

    public final synchronized void h() {
        PackageInfo packageInfoF = f(this.f31622a.getPackageName());
        if (packageInfoF != null) {
            this.f31623b = Integer.toString(packageInfoF.versionCode);
            this.f31624c = packageInfoF.versionName;
        }
    }
}
