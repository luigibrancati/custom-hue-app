package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3602r2 extends AbstractC3614t2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30236d;

    public /* synthetic */ C3602r2(byte[] bArr, int i10, int i11, boolean z10, AbstractC3608s2 abstractC3608s2) {
        super(null);
        this.f30236d = Integer.MAX_VALUE;
        this.f30234b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f30236d;
        this.f30236d = 0;
        int i12 = this.f30234b + this.f30235c;
        this.f30234b = i12;
        if (i12 <= 0) {
            this.f30235c = 0;
            return i11;
        }
        this.f30235c = i12;
        this.f30234b = 0;
        return i11;
    }
}
