package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f32086a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f32087b = c();

    public static E a() {
        E e10 = f32087b;
        if (e10 != null) {
            return e10;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static E b() {
        return f32086a;
    }

    public static E c() {
        try {
            return (E) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
