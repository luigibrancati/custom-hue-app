package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B1 implements H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H1[] f29741a;

    public B1(H1... h1Arr) {
        this.f29741a = h1Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H1
    public final G1 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            H1 h12 = this.f29741a[i10];
            if (h12.b(cls)) {
                return h12.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.H1
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f29741a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
