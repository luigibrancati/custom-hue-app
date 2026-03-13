package R9;

import M6.HandlerC1210a;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import b7.C2878l;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: R9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C2109g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f14955b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2109g f14956c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f14957a;

    public C2109g(Looper looper) {
        this.f14957a = new HandlerC1210a(looper);
    }

    public static C2109g a() {
        C2109g c2109g;
        synchronized (f14955b) {
            try {
                if (f14956c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f14956c = new C2109g(handlerThread.getLooper());
                }
                c2109g = f14956c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2109g;
    }

    public static Executor d() {
        return t.zza;
    }

    public Task b(final Callable callable) {
        final C2878l c2878l = new C2878l();
        c(new Runnable() { // from class: R9.s
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C2878l c2878l2 = c2878l;
                try {
                    c2878l2.c(callable2.call());
                } catch (N9.a e10) {
                    c2878l2.b(e10);
                } catch (Exception e11) {
                    c2878l2.b(new N9.a("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return c2878l.a();
    }

    public void c(Runnable runnable) {
        d().execute(runnable);
    }
}
