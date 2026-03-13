package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile J7.k f29384a = J7.k.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f29385b = new Object();

    public static boolean a(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f29384a.c()) {
            return ((Boolean) f29384a.b()).booleanValue();
        }
        synchronized (f29385b) {
            try {
                if (f29384a.c()) {
                    return ((Boolean) f29384a.b()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z10 = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                f29384a = J7.k.d(Boolean.valueOf(z10));
                return ((Boolean) f29384a.b()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
