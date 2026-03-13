package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class L implements InterfaceC3715f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f32126a = new L();

    public static L c() {
        return f32126a;
    }

    @Override // com.google.protobuf.InterfaceC3715f0
    public InterfaceC3713e0 a(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC3713e0) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.protobuf.InterfaceC3715f0
    public boolean b(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
