package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import b7.C2878l;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.o0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class o0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f31781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f31782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue f31783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0 f31784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31785f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f31786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2878l f31787b = new C2878l();

        public a(Intent intent) {
            this.f31786a = intent;
        }

        public static /* synthetic */ void b(a aVar) {
            aVar.getClass();
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar.f31786a.getAction() + " finishing.");
            aVar.d();
        }

        public void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.m0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.a.b(this.f31777a);
                }
            }, 20L, TimeUnit.SECONDS);
            e().c(scheduledExecutorService, new InterfaceC2872f() { // from class: com.google.firebase.messaging.n0
                @Override // b7.InterfaceC2872f
                public final void a(Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        public void d() {
            this.f31787b.e(null);
        }

        public Task e() {
            return this.f31787b.a();
        }
    }

    public o0(Context context, String str) {
        this(context, str, a());
    }

    public static ScheduledThreadPoolExecutor a() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new C6.b("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public final void b() {
        while (!this.f31783d.isEmpty()) {
            ((a) this.f31783d.poll()).d();
        }
    }

    public final synchronized void c() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f31783d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                l0 l0Var = this.f31784e;
                if (l0Var == null || !l0Var.isBinderAlive()) {
                    e();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f31784e.b((a) this.f31783d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Task d(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f31782c);
            this.f31783d.add(aVar);
            c();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    public final void e() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f31785f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f31785f) {
            return;
        }
        this.f31785f = true;
        try {
            if (A6.a.b().a(this.f31780a, this.f31781b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f31785f = false;
        b();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f31785f = false;
            if (iBinder instanceof l0) {
                this.f31784e = (l0) iBinder;
                c();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        c();
    }

    public o0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f31783d = new ArrayDeque();
        this.f31785f = false;
        Context applicationContext = context.getApplicationContext();
        this.f31780a = applicationContext;
        this.f31781b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f31782c = scheduledExecutorService;
    }
}
