package v6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import s6.C5783b;

/* JADX INFO: renamed from: v6.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6050e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f45844a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f45845b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static V f45846c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerThread f45847d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f45848e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f45849f = false;

    public static AbstractC6050e a(Context context) {
        synchronized (f45844a) {
            try {
                if (f45846c == null) {
                    f45846c = new V(context.getApplicationContext(), f45849f ? b().getLooper() : context.getMainLooper(), f45848e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f45846c;
    }

    public static HandlerThread b() {
        synchronized (f45844a) {
            try {
                HandlerThread handlerThread = f45847d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f45845b);
                f45847d = handlerThread2;
                handlerThread2.start();
                return f45847d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract C5783b c(S s10, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        e(new S(str, str2, 4225, z10), serviceConnection, str3);
    }

    public abstract void e(S s10, ServiceConnection serviceConnection, String str);
}
