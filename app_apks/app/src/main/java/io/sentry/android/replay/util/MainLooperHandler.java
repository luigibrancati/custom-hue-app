package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/sentry/android/replay/util/MainLooperHandler;", "", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "Ljava/lang/Runnable;", "runnable", "", "post", "(Ljava/lang/Runnable;)Z", "", "delay", "postDelayed", "(Ljava/lang/Runnable;J)Z", "Lfc/H;", "removeCallbacks", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MainLooperHandler {
    public static final int $stable = 8;
    private final Handler handler;

    public MainLooperHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final boolean post(Runnable runnable) {
        AbstractC4862t.e(runnable, "runnable");
        return this.handler.post(runnable);
    }

    public final boolean postDelayed(Runnable runnable, long delay) {
        Handler handler = this.handler;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, delay);
    }

    public final void removeCallbacks(Runnable runnable) {
        Handler handler = this.handler;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public MainLooperHandler(Looper looper) {
        AbstractC4862t.e(looper, "looper");
        this.handler = new Handler(looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MainLooperHandler(Looper looper, int i10, AbstractC4854k abstractC4854k) {
        if ((i10 & 1) != 0) {
            looper = Looper.getMainLooper();
            AbstractC4862t.d(looper, "getMainLooper(...)");
        }
        this(looper);
    }
}
