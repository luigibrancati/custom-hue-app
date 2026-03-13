package G7;

import android.os.Looper;
import rb.k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4537a = a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f4538b = f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4539c = false;

    public static boolean a() {
        try {
            Class.forName("android.app.Activity");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void b() {
        k.f(e(), "Sceneform requires Android N or later");
    }

    public static void c() {
        if (!d() || g()) {
            return;
        }
        k.f(Looper.getMainLooper().getThread() == Thread.currentThread(), "Must be called from the UI thread.");
    }

    public static boolean d() {
        return f4537a;
    }

    public static boolean e() {
        return g() || f4538b;
    }

    public static boolean f() {
        d();
        return true;
    }

    public static boolean g() {
        return f4539c;
    }
}
