package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class h0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f31752f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f31753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f31754h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f31756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f31757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f31758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31759e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h0 f31760a;

        public a(h0 h0Var) {
            this.f31760a = h0Var;
        }

        public void a() {
            if (h0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            h0.this.f31755a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                h0 h0Var = this.f31760a;
                if (h0Var == null) {
                    return;
                }
                if (h0Var.i()) {
                    if (h0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f31760a.f31758d.l(this.f31760a, 0L);
                    context.unregisterReceiver(this);
                    this.f31760a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public h0(g0 g0Var, Context context, L l10, long j10) {
        this.f31758d = g0Var;
        this.f31755a = context;
        this.f31759e = j10;
        this.f31756b = l10;
        this.f31757c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f31752f) {
            try {
                Boolean bool = f31754h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f31754h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    public static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f31752f) {
            try {
                Boolean bool = f31753g;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f31753g = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f31755a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.h0.i():boolean");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f31755a)) {
            this.f31757c.acquire(AbstractC3682d.f31720a);
        }
        try {
            try {
                try {
                    this.f31758d.n(true);
                    if (!this.f31756b.g()) {
                        this.f31758d.n(false);
                        if (h(this.f31755a)) {
                            try {
                                this.f31757c.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!f(this.f31755a) || i()) {
                        if (this.f31758d.r()) {
                            this.f31758d.n(false);
                        } else {
                            this.f31758d.s(this.f31759e);
                        }
                        if (h(this.f31755a)) {
                            this.f31757c.release();
                            return;
                        }
                        return;
                    }
                    new a(this).a();
                    if (h(this.f31755a)) {
                        try {
                            this.f31757c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    this.f31758d.n(false);
                    if (h(this.f31755a)) {
                        this.f31757c.release();
                    }
                }
            } catch (Throwable th) {
                if (h(this.f31755a)) {
                    try {
                        this.f31757c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
