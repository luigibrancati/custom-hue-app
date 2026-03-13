package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f32040a = c();

    public static D a() {
        D dB = b("getEmptyRegistry");
        return dB != null ? dB : D.f32046d;
    }

    public static final D b(String str) {
        Class cls = f32040a;
        if (cls == null) {
            return null;
        }
        try {
            return (D) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
