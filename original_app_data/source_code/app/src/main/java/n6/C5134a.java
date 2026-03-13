package n6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zze;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.webrtc.WebrtcBuildVersion;
import s6.C5786e;
import s6.ServiceConnectionC5782a;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: n6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C5134a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceConnectionC5782a f40603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G6.d f40604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f40605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f40606d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C5136c f40607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f40608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f40609g;

    /* JADX INFO: renamed from: n6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0536a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40611b;

        public C0536a(String str, boolean z10) {
            this.f40610a = str;
            this.f40611b = z10;
        }

        public String a() {
            return this.f40610a;
        }

        public boolean b() {
            return this.f40611b;
        }

        public String toString() {
            String str = this.f40610a;
            boolean z10 = this.f40611b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public C5134a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        AbstractC6056k.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f40608f = context;
        this.f40605c = false;
        this.f40609g = j10;
    }

    public static C0536a a(Context context) {
        C5134a c5134a = new C5134a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c5134a.d(false);
            C0536a c0536aF = c5134a.f(-1);
            c5134a.e(c0536aF, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0536aF;
        } finally {
        }
    }

    public final void c() {
        AbstractC6056k.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f40608f == null || this.f40603a == null) {
                    return;
                }
                try {
                    if (this.f40605c) {
                        A6.a.b().c(this.f40608f, this.f40603a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f40605c = false;
                this.f40604b = null;
                this.f40603a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z10) {
        AbstractC6056k.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f40605c) {
                    c();
                }
                Context context = this.f40608f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = com.google.android.gms.common.a.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC5782a serviceConnectionC5782a = new ServiceConnectionC5782a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!A6.a.b().a(context, intent, serviceConnectionC5782a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f40603a = serviceConnectionC5782a;
                        try {
                            this.f40604b = zze.zza(serviceConnectionC5782a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f40605c = true;
                            if (z10) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C5786e(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(C0536a c0536a, boolean z10, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0536a != null) {
            map.put("limit_ad_tracking", true != c0536a.b() ? WebrtcBuildVersion.maint_version : "1");
            String strA = c0536a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new C5135b(this, map).start();
        return true;
    }

    public final C0536a f(int i10) {
        C0536a c0536a;
        AbstractC6056k.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f40605c) {
                    synchronized (this.f40606d) {
                        C5136c c5136c = this.f40607e;
                        if (c5136c == null || !c5136c.f40616d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f40605c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                AbstractC6056k.l(this.f40603a);
                AbstractC6056k.l(this.f40604b);
                try {
                    c0536a = new C0536a(this.f40604b.b(), this.f40604b.X0(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0536a;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f40606d) {
            C5136c c5136c = this.f40607e;
            if (c5136c != null) {
                c5136c.f40615c.countDown();
                try {
                    this.f40607e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f40609g;
            if (j10 > 0) {
                this.f40607e = new C5136c(this, j10);
            }
        }
    }

    public static void b(boolean z10) {
    }
}
