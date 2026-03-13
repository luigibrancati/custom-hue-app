package io.flutter.util;

import s3.AbstractC5712a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class TraceSection implements AutoCloseable {
    private TraceSection(String str) {
        begin(str);
    }

    public static void begin(String str) {
        AbstractC5712a.b(cropSectionName(str));
    }

    public static void beginAsyncSection(String str, int i10) {
        AbstractC5712a.a(cropSectionName(str), i10);
    }

    private static String cropSectionName(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() {
        AbstractC5712a.d();
    }

    public static void endAsyncSection(String str, int i10) {
        AbstractC5712a.c(cropSectionName(str), i10);
    }

    public static TraceSection scoped(String str) {
        return new TraceSection(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end();
    }
}
