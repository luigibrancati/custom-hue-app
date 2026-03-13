package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3567l2 extends C3585o2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30196d;

    public C3567l2(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC3597q2.l(0, i11, bArr.length);
        this.f30196d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.C3585o2, com.google.android.gms.internal.play_billing.AbstractC3597q2
    public final byte c(int i10) {
        int i11 = this.f30196d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f30204c[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.play_billing.C3585o2, com.google.android.gms.internal.play_billing.AbstractC3597q2
    public final byte d(int i10) {
        return this.f30204c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.C3585o2, com.google.android.gms.internal.play_billing.AbstractC3597q2
    public final int e() {
        return this.f30196d;
    }

    @Override // com.google.android.gms.internal.play_billing.C3585o2
    public final int r() {
        return 0;
    }
}
