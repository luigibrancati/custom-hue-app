package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 extends K0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29758d;

    public /* synthetic */ I0(byte[] bArr, int i10, int i11, boolean z10, H0 h02) {
        super(null);
        this.f29758d = Integer.MAX_VALUE;
        this.f29756b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f29758d;
        this.f29758d = 0;
        int i12 = this.f29756b + this.f29757c;
        this.f29756b = i12;
        if (i12 <= 0) {
            this.f29757c = 0;
            return i11;
        }
        this.f29757c = i12;
        this.f29756b = 0;
        return i11;
    }
}
