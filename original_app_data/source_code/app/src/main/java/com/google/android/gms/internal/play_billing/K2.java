package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class K2 implements InterfaceC3556j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K2 f30059a = new K2();

    public static K2 c() {
        return f30059a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3556j3
    public final InterfaceC3550i3 a(Class cls) {
        if (!O2.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC3550i3) O2.q(cls.asSubclass(O2.class)).l(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3556j3
    public final boolean b(Class cls) {
        return O2.class.isAssignableFrom(cls);
    }
}
