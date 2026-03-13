package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class W4 implements A5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W4 f29381a = new W4();

    public static W4 c() {
        return f29381a;
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final boolean a(Class cls) {
        return AbstractC3148a5.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final InterfaceC3367z5 b(Class cls) {
        if (!AbstractC3148a5.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC3367z5) AbstractC3148a5.s(cls.asSubclass(AbstractC3148a5.class)).C(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
