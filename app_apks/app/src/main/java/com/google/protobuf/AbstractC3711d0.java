package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3711d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC3707b0 f32223a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC3707b0 f32224b = new C3709c0();

    public static InterfaceC3707b0 a() {
        return f32223a;
    }

    public static InterfaceC3707b0 b() {
        return f32224b;
    }

    public static InterfaceC3707b0 c() {
        try {
            return (InterfaceC3707b0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
