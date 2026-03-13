package com.google.ar.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f31231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.ar.core.dependencies.h f31233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ServiceConnection f31234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f31235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f31236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PackageInstaller f31237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PackageInstaller.SessionCallback f31238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f31239i;

    public x() {
    }

    public static /* synthetic */ Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final synchronized void d(IBinder iBinder) {
        com.google.ar.core.dependencies.h hVarB = com.google.ar.core.dependencies.g.b(iBinder);
        Log.i("ARCore-InstallService", "Install service connected");
        this.f31233c = hVarB;
        this.f31239i = 3;
        Iterator it = this.f31231a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized void e() {
        Log.i("ARCore-InstallService", "Install service disconnected");
        this.f31239i = 1;
        this.f31233c = null;
    }

    private final synchronized void n(Runnable runnable) {
        int i10 = this.f31239i;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            throw new ag();
        }
        if (i11 == 1) {
            this.f31231a.offer(runnable);
        } else {
            if (i11 != 2) {
                return;
            }
            runnable.run();
        }
    }

    private static void o(Activity activity, v vVar) {
        boolean z10;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            k kVarA = k.a();
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z10 = true;
                    break;
                }
            }
            kVarA.f31196b = !z10;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            vVar.b(new FatalException("Failed to launch installer.", e10));
        }
    }

    private static void p(Activity activity, Bundle bundle, v vVar) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent == null) {
            Log.e("ARCore-InstallService", "Did not get pending intent.");
            vVar.b(new FatalException("Installation intent failed to unparcel."));
        } else {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
            } catch (IntentSender.SendIntentException e10) {
                vVar.b(new FatalException("Installation Intent failed", e10));
            }
        }
    }

    public final synchronized void a(Context context) {
        this.f31232b = context;
        Intent intent = new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending");
        ServiceConnection serviceConnection = this.f31234d;
        if (context.bindService(intent, serviceConnection, 1)) {
            this.f31239i = 2;
            return;
        }
        this.f31239i = 1;
        this.f31232b = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(serviceConnection);
    }

    public final synchronized void b() {
        try {
            int i10 = this.f31239i;
            int i11 = i10 - 1;
            if (i10 == 0) {
                throw null;
            }
            if (i11 == 1 || i11 == 2) {
                this.f31232b.unbindService(this.f31234d);
                this.f31232b = null;
                this.f31239i = 1;
            }
            BroadcastReceiver broadcastReceiver = this.f31235e;
            if (broadcastReceiver != null) {
                this.f31236f.unregisterReceiver(broadcastReceiver);
            }
            PackageInstaller.SessionCallback sessionCallback = this.f31238h;
            if (sessionCallback != null) {
                this.f31237g.unregisterSessionCallback(sessionCallback);
                this.f31238h = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(Context context, h hVar) {
        try {
            n(new aa(this, context, hVar));
        } catch (ag unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            hVar.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    public final /* synthetic */ com.google.ar.core.dependencies.h f() {
        return this.f31233c;
    }

    public final /* synthetic */ PackageInstaller g() {
        return this.f31237g;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void h(Activity activity, v vVar) {
        if (this.f31238h == null) {
            try {
                this.f31237g = activity.getPackageManager().getPackageInstaller();
                ab abVar = new ab(this, vVar);
                this.f31238h = abVar;
                this.f31237g.registerSessionCallback(abVar);
            } catch (NullPointerException unused) {
                vVar.b(new FatalException("Unable to obtain Android PackageInstaller; is this a Play Instant App?"));
            }
        }
        if (this.f31235e == null) {
            ac acVar = new ac(this, vVar);
            this.f31235e = acVar;
            this.f31236f = activity;
            if (Build.VERSION.SDK_INT >= 33) {
                activity.registerReceiver(acVar, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), 2);
            } else {
                activity.registerReceiver(acVar, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
            }
        }
        try {
            n(new af(this, activity, vVar));
        } catch (ag unused2) {
            Log.w("ARCore-InstallService", "requestInstall bind failed, launching fullscreen.");
            o(activity, vVar);
        }
    }

    public final /* synthetic */ void i(Activity activity, v vVar) {
        o(activity, vVar);
    }

    public final /* synthetic */ void j(Activity activity, Bundle bundle, v vVar) {
        p(activity, bundle, vVar);
    }

    public x(byte[] bArr) {
        this();
        this.f31231a = new ArrayDeque();
        this.f31239i = 1;
        this.f31234d = new y(this);
    }
}
