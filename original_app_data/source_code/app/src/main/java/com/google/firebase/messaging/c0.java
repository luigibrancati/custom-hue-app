package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f31715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseMessaging f31716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExecutorService f31717d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6.b("firebase-iid-executor"));

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c0 f31718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f31719b;

        public a(c0 c0Var) {
            this.f31718a = c0Var;
        }

        public void a() {
            if (c0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            c0 c0Var = this.f31718a;
            if (c0Var != null) {
                Context contextB = c0Var.b();
                this.f31719b = contextB;
                contextB.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            c0 c0Var = this.f31718a;
            if (c0Var != null && c0Var.d()) {
                if (c0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f31718a.f31716c.enqueueTaskWithDelaySeconds(this.f31718a, 0L);
                Context context2 = this.f31719b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f31718a = null;
            }
        }
    }

    public c0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f31716c = firebaseMessaging;
        this.f31714a = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f31715b = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public Context b() {
        return this.f31716c.getApplicationContext();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() throws IOException {
        try {
            if (this.f31716c.blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            if (!G.i(e10.getMessage())) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (Y.b().e(b())) {
            this.f31715b.acquire();
        }
        try {
            try {
                this.f31716c.setSyncScheduledOrRunning(true);
                if (!this.f31716c.isGmsCorePresent()) {
                    this.f31716c.setSyncScheduledOrRunning(false);
                    if (!Y.b().e(b())) {
                        return;
                    }
                } else if (!Y.b().d(b()) || d()) {
                    if (e()) {
                        this.f31716c.setSyncScheduledOrRunning(false);
                    } else {
                        this.f31716c.syncWithDelaySecondsInternal(this.f31714a);
                    }
                    if (!Y.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!Y.b().e(b())) {
                        return;
                    }
                }
                this.f31715b.release();
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f31716c.setSyncScheduledOrRunning(false);
                if (Y.b().e(b())) {
                    this.f31715b.release();
                }
            }
        } catch (Throwable th) {
            if (Y.b().e(b())) {
                this.f31715b.release();
            }
            throw th;
        }
    }
}
