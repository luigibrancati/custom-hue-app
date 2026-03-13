package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3675w implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3675w f31573a = new C3675w();

    public static C3675w c() {
        return f31573a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public O a(Class cls) {
        if (!AbstractC3676x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (O) AbstractC3676x.s(cls.asSubclass(AbstractC3676x.class)).i();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public boolean b(Class cls) {
        return AbstractC3676x.class.isAssignableFrom(cls);
    }
}
