package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class F0 extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f29752c;

    public F0(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f29752c = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E0
    public final boolean L(G0 g02, int i10, int i11) {
        if (i11 > g02.f()) {
            throw new IllegalArgumentException("Length too large: " + i11 + f());
        }
        int i12 = i10 + i11;
        if (i12 > g02.f()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + g02.f());
        }
        if (!(g02 instanceof F0)) {
            return g02.r(i10, i12).equals(r(0, i11));
        }
        F0 f02 = (F0) g02;
        byte[] bArr = this.f29752c;
        byte[] bArr2 = f02.f29752c;
        int iM = M() + i11;
        int iM2 = M();
        int iM3 = f02.M() + i10;
        while (iM2 < iM) {
            if (bArr[iM2] != bArr2[iM3]) {
                return false;
            }
            iM2++;
            iM3++;
        }
        return true;
    }

    public int M() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public byte c(int i10) {
        return this.f29752c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public byte d(int i10) {
        return this.f29752c[i10];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0) || f() != ((G0) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return obj.equals(this);
        }
        F0 f02 = (F0) obj;
        int iX = x();
        int iX2 = f02.x();
        if (iX == 0 || iX2 == 0 || iX == iX2) {
            return L(f02, 0, f());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public int f() {
        return this.f29752c.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public void h(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f29752c, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final int n(int i10, int i11, int i12) {
        return AbstractC3446p1.b(i10, this.f29752c, M() + i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final int p(int i10, int i11, int i12) {
        int iM = M() + i11;
        return C2.f(i10, this.f29752c, iM, i12 + iM);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final G0 r(int i10, int i11) {
        int iW = G0.w(i10, i11, f());
        return iW == 0 ? G0.f29754b : new B0(this.f29752c, M() + i10, iW);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final String s(Charset charset) {
        return new String(this.f29752c, M(), f(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final void t(C3484x0 c3484x0) {
        ((L0) c3484x0).D(this.f29752c, M(), f());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final boolean v() {
        int iM = M();
        return C2.g(this.f29752c, iM, f() + iM);
    }
}
