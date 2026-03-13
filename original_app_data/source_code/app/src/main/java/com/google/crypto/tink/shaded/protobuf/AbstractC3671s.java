package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3671s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC3670q f31563a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC3670q f31564b = c();

    public static AbstractC3670q a() {
        AbstractC3670q abstractC3670q = f31564b;
        if (abstractC3670q != null) {
            return abstractC3670q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC3670q b() {
        return f31563a;
    }

    public static AbstractC3670q c() {
        if (b0.f31427d) {
            return null;
        }
        try {
            return (AbstractC3670q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
