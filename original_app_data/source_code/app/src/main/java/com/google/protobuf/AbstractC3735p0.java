package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3735p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC3731n0 f32326a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC3731n0 f32327b = new C3733o0();

    public static InterfaceC3731n0 a() {
        return f32326a;
    }

    public static InterfaceC3731n0 b() {
        return f32327b;
    }

    public static InterfaceC3731n0 c() {
        try {
            return (InterfaceC3731n0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
