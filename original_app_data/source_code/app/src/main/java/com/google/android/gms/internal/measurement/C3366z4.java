package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3366z4 extends D4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29731d;

    public C3366z4(byte[] bArr, int i10, int i11) {
        super(bArr);
        E4.p(0, i11, bArr.length);
        this.f29731d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.D4, com.google.android.gms.internal.measurement.E4
    public final byte c(int i10) {
        int i11 = this.f29731d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f29159c[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.D4, com.google.android.gms.internal.measurement.E4
    public final byte d(int i10) {
        return this.f29159c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.D4, com.google.android.gms.internal.measurement.E4
    public final int e() {
        return this.f29731d;
    }

    @Override // com.google.android.gms.internal.measurement.D4
    public final int r() {
        return 0;
    }
}
