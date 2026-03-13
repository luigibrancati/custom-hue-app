package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import b0.C2777a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3246l4 implements R3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f29537f = new C2777a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f29539b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map f29541d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f29540c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f29542e = new ArrayList();

    public C3246l4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f29538a = sharedPreferences;
    }

    public static C3246l4 c(Context context, String str, Runnable runnable) {
        final C3246l4 c3246l4;
        SharedPreferences sharedPreferencesA;
        if (J3.a() && !str.startsWith("direct_boot:") && !J3.c(context)) {
            return null;
        }
        synchronized (C3246l4.class) {
            Map map = f29537f;
            c3246l4 = (C3246l4) map.get(str);
            if (c3246l4 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (J3.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = AbstractC3206h0.a(context, str.substring(12), 0, AbstractC3170d0.f29435a);
                    } else {
                        sharedPreferencesA = AbstractC3206h0.a(context, str, 0, AbstractC3170d0.f29435a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c3246l4 = new C3246l4(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.k4
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f29531a.e(sharedPreferences, str2);
                        }
                    };
                    c3246l4.f29539b = onSharedPreferenceChangeListener;
                    c3246l4.f29538a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c3246l4);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return c3246l4;
    }

    public static synchronized void d() {
        try {
            Map map = f29537f;
            for (C3246l4 c3246l4 : map.values()) {
                c3246l4.f29538a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) J7.n.j(c3246l4.f29539b));
            }
            map.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.R3
    public final Object b(String str) {
        Map<String, ?> map = this.f29541d;
        if (map == null) {
            synchronized (this.f29540c) {
                try {
                    map = this.f29541d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f29538a.getAll();
                            this.f29541d = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f29540c) {
            this.f29541d = null;
            AbstractC3228j4.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f29542e.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.a.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
