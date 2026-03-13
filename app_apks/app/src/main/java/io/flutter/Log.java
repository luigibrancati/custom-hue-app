package io.flutter;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class Log {
    public static int ASSERT = 7;
    public static int DEBUG = 3;
    public static int ERROR = 6;
    public static int INFO = 4;
    public static int VERBOSE = 2;
    public static int WARN = 5;
    private static int logLevel = 3;

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2) {
        android.util.Log.e(str, str2);
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    public static void i(String str, String str2) {
    }

    public static void setLogLevel(int i10) {
        logLevel = i10;
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2) {
        android.util.Log.w(str, str2);
    }

    public static void wtf(String str, String str2) {
        android.util.Log.wtf(str, str2);
    }

    public static void d(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2, Throwable th) {
        android.util.Log.e(str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2, Throwable th) {
        android.util.Log.w(str, str2, th);
    }

    public static void wtf(String str, String str2, Throwable th) {
        android.util.Log.wtf(str, str2, th);
    }

    public static void println(int i10, String str, String str2) {
    }
}
