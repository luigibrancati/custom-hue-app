package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f31390a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f31391b = new F();

    public static E a() {
        return f31390a;
    }

    public static E b() {
        return f31391b;
    }

    public static E c() {
        if (b0.f31427d) {
            return null;
        }
        try {
            return (E) Class.forName("com.google.crypto.tink.shaded.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
