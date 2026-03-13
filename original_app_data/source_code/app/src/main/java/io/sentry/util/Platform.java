package io.sentry.util;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class Platform {
    static boolean isAndroid;
    static boolean isJavaNinePlus;

    static {
        try {
            isAndroid = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            isAndroid = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                isJavaNinePlus = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                isJavaNinePlus = false;
            }
        } catch (Throwable unused2) {
            isJavaNinePlus = false;
        }
    }

    public static boolean isAndroid() {
        return isAndroid;
    }

    public static boolean isJavaNinePlus() {
        return isJavaNinePlus;
    }

    public static boolean isJvm() {
        return !isAndroid;
    }
}
