package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3657d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f31435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f31436b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f31437c;

    static {
        f31437c = (f31435a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f31436b;
    }

    public static boolean c() {
        if (f31435a) {
            return true;
        }
        return (f31436b == null || f31437c) ? false : true;
    }
}
