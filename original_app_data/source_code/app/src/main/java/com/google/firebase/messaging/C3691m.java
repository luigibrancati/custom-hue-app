package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import b7.InterfaceC2869c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3691m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f31773c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static o0 f31774d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f31776b = new X2.g();

    public C3691m(Context context) {
        this.f31775a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z10, Task task) {
        return (B6.l.e() && ((Integer) task.m()).intValue() == 402) ? e(context, intent, z10).j(new X2.g(), new InterfaceC2869c() { // from class: com.google.firebase.messaging.k
            @Override // b7.InterfaceC2869c
            public final Object a(Task task2) {
                return C3691m.d(task2);
            }
        }) : task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer d(Task task) {
        return 403;
    }

    public static Task e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        o0 o0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return o0VarF.d(intent).j(new X2.g(), new InterfaceC2869c() { // from class: com.google.firebase.messaging.l
                @Override // b7.InterfaceC2869c
                public final Object a(Task task) {
                    return C3691m.c(task);
                }
            });
        }
        if (Y.b().e(context)) {
            j0.e(context, o0VarF, intent);
        } else {
            o0VarF.d(intent);
        }
        return Tasks.e(-1);
    }

    public static o0 f(Context context, String str) {
        o0 o0Var;
        synchronized (f31773c) {
            try {
                if (f31774d == null) {
                    f31774d = new o0(context, str);
                }
                o0Var = f31774d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }

    public Task g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f31775a, intent);
    }

    public Task h(final Context context, final Intent intent) {
        boolean z10 = B6.l.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.b(this.f31776b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(Y.b().g(context, intent));
            }
        }).k(this.f31776b, new InterfaceC2869c() { // from class: com.google.firebase.messaging.j
            @Override // b7.InterfaceC2869c
            public final Object a(Task task) {
                return C3691m.a(context, intent, z11, task);
            }
        }) : e(context, intent, z11);
    }
}
