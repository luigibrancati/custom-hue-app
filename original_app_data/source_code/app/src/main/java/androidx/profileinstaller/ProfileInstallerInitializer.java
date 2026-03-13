package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements p3.b {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
    }

    public static void h(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: Y2.h
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.h(context);
            }
        });
    }

    @Override // p3.b
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // p3.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: Y2.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                this.f19691a.g(applicationContext);
            }
        });
        return new b();
    }

    public void g(final Context context) {
        a.a(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: Y2.g
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.h(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
