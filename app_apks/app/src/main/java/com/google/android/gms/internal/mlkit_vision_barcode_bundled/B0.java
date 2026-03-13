package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class B0 extends F0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29740e;

    public B0(byte[] bArr, int i10, int i11) {
        super(bArr);
        G0.w(i10, i10 + i11, bArr.length);
        this.f29739d = i10;
        this.f29740e = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F0
    public final int M() {
        return this.f29739d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final byte c(int i10) {
        G0.E(i10, this.f29740e);
        return this.f29752c[this.f29739d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final byte d(int i10) {
        return this.f29752c[this.f29739d + i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final int f() {
        return this.f29740e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.F0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final void h(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f29752c, this.f29739d + i10, bArr, i11, i12);
    }
}
