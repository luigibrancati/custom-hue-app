package M;

import android.os.Handler;
import android.os.Looper;
import io.sentry.TransactionOptions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static /* synthetic */ void a(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void b() {
        X0.h.j(d(), "Not in application's main thread");
    }

    public static Handler c() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void e(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            X0.h.j(c().post(runnable), "Unable to post to main thread");
        }
    }

    public static void f(final Runnable runnable) {
        if (d()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        X0.h.j(c().post(new Runnable() { // from class: M.w
            @Override // java.lang.Runnable
            public final void run() {
                x.a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e10) {
            throw new k(e10);
        }
    }
}
