package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3668o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f31528a = c();

    public static C3669p a() {
        C3669p c3669pB = b("getEmptyRegistry");
        return c3669pB != null ? c3669pB : C3669p.f31530c;
    }

    public static final C3669p b(String str) {
        Class cls = f31528a;
        if (cls == null) {
            return null;
        }
        try {
            return (C3669p) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
