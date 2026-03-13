package com.google.ar.sceneform.rendering;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Executor f31369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Executor f31370b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f31371a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f31371a.post(runnable);
        }
    }

    public static Executor a() {
        if (f31369a == null) {
            f31369a = new a();
        }
        return f31369a;
    }

    public static Executor b() {
        Executor executor = f31370b;
        return executor == null ? AsyncTask.THREAD_POOL_EXECUTOR : executor;
    }
}
