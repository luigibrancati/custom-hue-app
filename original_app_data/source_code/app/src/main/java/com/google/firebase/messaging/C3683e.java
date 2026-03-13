package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.m;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.AbstractC3681c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3683e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f31725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f31726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f31727c;

    public C3683e(Context context, M m10, ExecutorService executorService) {
        this.f31725a = executorService;
        this.f31726b = context;
        this.f31727c = m10;
    }

    public boolean a() {
        if (this.f31727c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        I iD = d();
        AbstractC3681c.a aVarE = AbstractC3681c.e(this.f31726b, this.f31727c);
        e(aVarE.f31711a, iD);
        c(aVarE);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.f31726b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!B6.l.c()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f31726b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(AbstractC3681c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f31726b.getSystemService("notification")).notify(aVar.f31712b, aVar.f31713c, aVar.f31711a.d());
    }

    public final I d() {
        I iD = I.d(this.f31727c.p("gcm.n.image"));
        if (iD != null) {
            iD.g(this.f31725a);
        }
        return iD;
    }

    public final void e(m.e eVar, I i10) {
        if (i10 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.a(i10.f(), 5L, TimeUnit.SECONDS);
            eVar.z(bitmap);
            eVar.N(new m.b().d(bitmap).c(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            i10.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            i10.close();
        }
    }
}
