package androidx.work.impl.foreground;

import I3.AbstractC0890u;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.r;
import androidx.work.impl.foreground.a;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends r implements a.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24796e = AbstractC0890u.i("SystemFgService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static SystemForegroundService f24797f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.impl.foreground.a f24799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NotificationManager f24800d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                AbstractC0890u.e().l(SystemForegroundService.f24796e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                AbstractC0890u.e().l(SystemForegroundService.f24796e, "Unable to start foreground service", e11);
            }
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f24800d.notify(i10, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i10) {
        this.f24798b = true;
        AbstractC0890u.e().a(f24796e, "Shutting down.");
        stopForeground(true);
        f24797f = null;
        stopSelf(i10);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, int i11, Notification notification) {
        a.a(this, i10, notification, i11);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f24800d.cancel(i10);
    }

    public final void f() {
        this.f24800d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f24799c = aVar;
        aVar.o(this);
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public void onCreate() {
        super.onCreate();
        f24797f = this;
        f();
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f24799c.l();
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f24798b) {
            AbstractC0890u.e().f(f24796e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f24799c.l();
            f();
            this.f24798b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f24799c.m(intent, i11);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f24799c.n(i10, RecognitionOptions.PDF417);
    }

    public void onTimeout(int i10, int i11) {
        this.f24799c.n(i10, i11);
    }
}
