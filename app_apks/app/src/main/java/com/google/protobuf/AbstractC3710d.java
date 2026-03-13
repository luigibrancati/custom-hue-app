package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3710d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f32220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f32221b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f32222c;

    static {
        f32222c = (f32220a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f32221b;
    }

    public static boolean c() {
        if (f32220a) {
            return true;
        }
        return (f32221b == null || f32222c) ? false : true;
    }
}
