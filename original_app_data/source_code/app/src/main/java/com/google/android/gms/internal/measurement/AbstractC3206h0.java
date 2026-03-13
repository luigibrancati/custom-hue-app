package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3206h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f29482a = new C3197g0();

    public static SharedPreferences a(Context context, String str, int i10, AbstractC3161c0 abstractC3161c0) {
        W.a();
        SharedPreferencesC3188f0 sharedPreferencesC3188f0 = str.equals("") ? new SharedPreferencesC3188f0() : null;
        if (sharedPreferencesC3188f0 != null) {
            return sharedPreferencesC3188f0;
        }
        ThreadLocal threadLocal = f29482a;
        J7.n.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f29482a.set(Boolean.TRUE);
            throw th;
        }
    }
}
