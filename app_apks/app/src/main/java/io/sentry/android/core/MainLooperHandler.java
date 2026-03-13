package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class MainLooperHandler {
    private final Handler handler;

    public MainLooperHandler() {
        this(Looper.getMainLooper());
    }

    public Thread getThread() {
        return this.handler.getLooper().getThread();
    }

    public void post(Runnable runnable) {
        this.handler.post(runnable);
    }

    public MainLooperHandler(Looper looper) {
        this.handler = new Handler(looper);
    }
}
