package E;

import android.util.Log;

/* JADX INFO: renamed from: E.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0807p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3008a = 3;

    public static void a(String str, String str2) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 3)) {
            Log.d(strK, str2, th);
        }
    }

    public static void c(String str, String str2) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 6)) {
            Log.e(strK, str2, th);
        }
    }

    public static void e(String str, String str2) {
        String strK = k(str);
        if (g(strK, 4)) {
            Log.i(strK, str2);
        }
    }

    public static boolean f(String str) {
        return g(k(str), 3);
    }

    public static boolean g(String str, int i10) {
        return f3008a <= i10 || Log.isLoggable(str, i10);
    }

    public static boolean h(String str) {
        return g(k(str), 2);
    }

    public static void i() {
        f3008a = 3;
    }

    public static void j(int i10) {
        f3008a = i10;
    }

    public static void l(String str, String str2) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        String strK = k(str);
        if (g(strK, 5)) {
            Log.w(strK, str2, th);
        }
    }

    public static String k(String str) {
        return str;
    }
}
