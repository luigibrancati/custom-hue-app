package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference f31728d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f31729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f31730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f31731c;

    public e0(SharedPreferences sharedPreferences, Executor executor) {
        this.f31731c = executor;
        this.f31729a = sharedPreferences;
    }

    public static synchronized e0 b(Context context, Executor executor) {
        e0 e0Var;
        try {
            WeakReference weakReference = f31728d;
            e0Var = weakReference != null ? (e0) weakReference.get() : null;
            if (e0Var == null) {
                e0Var = new e0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                e0Var.d();
                f31728d = new WeakReference(e0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e0Var;
    }

    public synchronized boolean a(d0 d0Var) {
        return this.f31730b.b(d0Var.e());
    }

    public synchronized d0 c() {
        return d0.a(this.f31730b.f());
    }

    public final synchronized void d() {
        this.f31730b = a0.d(this.f31729a, "topic_operation_queue", ",", this.f31731c);
    }

    public synchronized boolean e(d0 d0Var) {
        return this.f31730b.g(d0Var.e());
    }
}
