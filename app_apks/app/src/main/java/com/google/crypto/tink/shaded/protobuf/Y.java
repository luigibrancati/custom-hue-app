package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f31423a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f31424b = new X();

    public static W a() {
        return f31423a;
    }

    public static W b() {
        return f31424b;
    }

    public static W c() {
        if (b0.f31427d) {
            return null;
        }
        try {
            return (W) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
