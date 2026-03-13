package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3376b1 implements H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3376b1 f29832a = new C3376b1();

    public static C3376b1 c() {
        return f29832a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H1
    public final G1 a(Class cls) {
        if (!AbstractC3406h1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (G1) AbstractC3406h1.l(cls.asSubclass(AbstractC3406h1.class)).I(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H1
    public final boolean b(Class cls) {
        return AbstractC3406h1.class.isAssignableFrom(cls);
    }
}
