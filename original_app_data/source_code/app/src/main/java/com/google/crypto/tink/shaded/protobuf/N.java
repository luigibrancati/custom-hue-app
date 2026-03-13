package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f31398a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final L f31399b = new M();

    public static L a() {
        return f31398a;
    }

    public static L b() {
        return f31399b;
    }

    public static L c() {
        if (b0.f31427d) {
            return null;
        }
        try {
            return (L) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
