package b9;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f25477a;

    public static synchronized c c() {
        try {
            if (f25477a == null) {
                f25477a = new c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25477a;
    }

    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
