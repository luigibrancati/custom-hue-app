package com.google.firebase.messaging;

import a7.C2644a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import b7.InterfaceC2872f;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f31768a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f31769b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2644a f31770c;

    public static void b(Context context) {
        if (f31770c == null) {
            C2644a c2644a = new C2644a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f31770c = c2644a;
            c2644a.d(true);
        }
    }

    public static void c(Intent intent) {
        synchronized (f31769b) {
            try {
                if (f31770c != null && d(intent)) {
                    f(intent, false);
                    f31770c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void e(Context context, o0 o0Var, final Intent intent) {
        synchronized (f31769b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                if (!zD) {
                    f31770c.a(f31768a);
                }
                o0Var.d(intent).b(new InterfaceC2872f() { // from class: com.google.firebase.messaging.i0
                    @Override // b7.InterfaceC2872f
                    public final void a(Task task) {
                        j0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    public static ComponentName g(Context context, Intent intent) {
        synchronized (f31769b) {
            try {
                b(context);
                boolean zD = d(intent);
                f(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f31770c.a(f31768a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
